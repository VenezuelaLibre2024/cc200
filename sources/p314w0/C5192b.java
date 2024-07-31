package p314w0;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: w0.b */
/* loaded from: classes.dex */
public final class C5192b extends C5193c {
    /* renamed from: h */
    public static C5192b m21020h(ByteBuffer byteBuffer) {
        return m21021i(byteBuffer, new C5192b());
    }

    /* renamed from: i */
    public static C5192b m21021i(ByteBuffer byteBuffer, C5192b c5192b) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return c5192b.m21022f(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    /* renamed from: f */
    public C5192b m21022f(int i10, ByteBuffer byteBuffer) {
        m21023g(i10, byteBuffer);
        return this;
    }

    /* renamed from: g */
    public void m21023g(int i10, ByteBuffer byteBuffer) {
        m21029c(i10, byteBuffer);
    }

    /* renamed from: j */
    public C5191a m21024j(C5191a c5191a, int i10) {
        int m21028b = m21028b(6);
        if (m21028b != 0) {
            return c5191a.m21011f(m21027a(m21030d(m21028b) + (i10 * 4)), this.f19713b);
        }
        return null;
    }

    /* renamed from: k */
    public int m21025k() {
        int m21028b = m21028b(6);
        if (m21028b != 0) {
            return m21031e(m21028b);
        }
        return 0;
    }

    /* renamed from: l */
    public int m21026l() {
        int m21028b = m21028b(4);
        if (m21028b != 0) {
            return this.f19713b.getInt(m21028b + this.f19712a);
        }
        return 0;
    }
}
