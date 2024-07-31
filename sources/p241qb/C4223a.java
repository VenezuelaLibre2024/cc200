package p241qb;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.Arrays;
import td.C4753m;

/* renamed from: qb.a */
/* loaded from: classes.dex */
public final class C4223a {
    /* renamed from: a */
    public static final FloatBuffer m16265a(int i10) {
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(i10 * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        asFloatBuffer.limit(asFloatBuffer.capacity());
        C4753m.m18649b(asFloatBuffer, "ByteBuffer\n            .…capacity())\n            }");
        return asFloatBuffer;
    }

    /* renamed from: b */
    public static final FloatBuffer m16266b(float... fArr) {
        C4753m.m18654g(fArr, "elements");
        return m16267c(Arrays.copyOf(fArr, fArr.length));
    }

    /* renamed from: c */
    public static final FloatBuffer m16267c(float[] fArr) {
        C4753m.m18654g(fArr, "$this$toBuffer");
        FloatBuffer put = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr);
        put.flip();
        C4753m.m18649b(put, "buffer");
        return put;
    }
}
