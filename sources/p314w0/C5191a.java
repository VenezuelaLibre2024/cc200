package p314w0;

import java.nio.ByteBuffer;

/* renamed from: w0.a */
/* loaded from: classes.dex */
public final class C5191a extends C5193c {
    /* renamed from: f */
    public C5191a m21011f(int i10, ByteBuffer byteBuffer) {
        m21012g(i10, byteBuffer);
        return this;
    }

    /* renamed from: g */
    public void m21012g(int i10, ByteBuffer byteBuffer) {
        m21029c(i10, byteBuffer);
    }

    /* renamed from: h */
    public int m21013h(int i10) {
        int m21028b = m21028b(16);
        if (m21028b != 0) {
            return this.f19713b.getInt(m21030d(m21028b) + (i10 * 4));
        }
        return 0;
    }

    /* renamed from: i */
    public int m21014i() {
        int m21028b = m21028b(16);
        if (m21028b != 0) {
            return m21031e(m21028b);
        }
        return 0;
    }

    /* renamed from: j */
    public boolean m21015j() {
        int m21028b = m21028b(6);
        return (m21028b == 0 || this.f19713b.get(m21028b + this.f19712a) == 0) ? false : true;
    }

    /* renamed from: k */
    public short m21016k() {
        int m21028b = m21028b(14);
        if (m21028b != 0) {
            return this.f19713b.getShort(m21028b + this.f19712a);
        }
        return (short) 0;
    }

    /* renamed from: l */
    public int m21017l() {
        int m21028b = m21028b(4);
        if (m21028b != 0) {
            return this.f19713b.getInt(m21028b + this.f19712a);
        }
        return 0;
    }

    /* renamed from: m */
    public short m21018m() {
        int m21028b = m21028b(8);
        if (m21028b != 0) {
            return this.f19713b.getShort(m21028b + this.f19712a);
        }
        return (short) 0;
    }

    /* renamed from: n */
    public short m21019n() {
        int m21028b = m21028b(12);
        if (m21028b != 0) {
            return this.f19713b.getShort(m21028b + this.f19712a);
        }
        return (short) 0;
    }
}
