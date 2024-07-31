package p000;

import io.flutter.plugin.common.StandardMessageCodec;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.List;
import td.C4753m;

/* renamed from: j */
/* loaded from: classes.dex */
public final class C3197j extends StandardMessageCodec {

    /* renamed from: a */
    public static final C3197j f11028a = new C3197j();

    @Override // io.flutter.plugin.common.StandardMessageCodec
    public Object readValueOfType(byte b10, ByteBuffer byteBuffer) {
        C4753m.m18653f(byteBuffer, "buffer");
        if (b10 == Byte.MIN_VALUE) {
            Object readValue = readValue(byteBuffer);
            List<? extends Object> list = readValue instanceof List ? (List) readValue : null;
            if (list != null) {
                return C0433b.f2119b.m2231a(list);
            }
            return null;
        }
        if (b10 != -127) {
            return super.readValueOfType(b10, byteBuffer);
        }
        Object readValue2 = readValue(byteBuffer);
        List<? extends Object> list2 = readValue2 instanceof List ? (List) readValue2 : null;
        if (list2 != null) {
            return C1792f.f6595b.m7244a(list2);
        }
        return null;
    }

    @Override // io.flutter.plugin.common.StandardMessageCodec
    public void writeValue(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        List<Object> m7243b;
        C4753m.m18653f(byteArrayOutputStream, "stream");
        if (obj instanceof C0433b) {
            byteArrayOutputStream.write(128);
            m7243b = ((C0433b) obj).m2230a();
        } else if (!(obj instanceof C1792f)) {
            super.writeValue(byteArrayOutputStream, obj);
            return;
        } else {
            byteArrayOutputStream.write(129);
            m7243b = ((C1792f) obj).m7243b();
        }
        writeValue(byteArrayOutputStream, m7243b);
    }
}
