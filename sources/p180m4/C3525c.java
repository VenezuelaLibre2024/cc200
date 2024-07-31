package p180m4;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* renamed from: m4.c */
/* loaded from: classes.dex */
public final class C3525c {

    /* renamed from: a */
    public final ByteArrayOutputStream f12359a;

    /* renamed from: b */
    public final DataOutputStream f12360b;

    public C3525c() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.f12359a = byteArrayOutputStream;
        this.f12360b = new DataOutputStream(byteArrayOutputStream);
    }

    /* renamed from: b */
    public static void m13081b(DataOutputStream dataOutputStream, String str) {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }

    /* renamed from: a */
    public byte[] m13082a(C3523a c3523a) {
        this.f12359a.reset();
        try {
            m13081b(this.f12360b, c3523a.f12353h);
            String str = c3523a.f12354i;
            if (str == null) {
                str = "";
            }
            m13081b(this.f12360b, str);
            this.f12360b.writeLong(c3523a.f12355j);
            this.f12360b.writeLong(c3523a.f12356k);
            this.f12360b.write(c3523a.f12357l);
            this.f12360b.flush();
            return this.f12359a.toByteArray();
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }
}
