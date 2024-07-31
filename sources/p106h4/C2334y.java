package p106h4;

import p222p5.C4015a0;
import p222p5.C4033j0;
import p222p5.C4041n0;
import p222p5.C4046r;
import p333x3.C5585y;
import p333x3.InterfaceC5572l;

/* renamed from: h4.y */
/* loaded from: classes.dex */
public final class C2334y {

    /* renamed from: c */
    public boolean f9571c;

    /* renamed from: d */
    public boolean f9572d;

    /* renamed from: e */
    public boolean f9573e;

    /* renamed from: a */
    public final C4033j0 f9569a = new C4033j0(0);

    /* renamed from: f */
    public long f9574f = -9223372036854775807L;

    /* renamed from: g */
    public long f9575g = -9223372036854775807L;

    /* renamed from: h */
    public long f9576h = -9223372036854775807L;

    /* renamed from: b */
    public final C4015a0 f9570b = new C4015a0();

    /* renamed from: a */
    public static boolean m9497a(byte[] bArr) {
        return (bArr[0] & 196) == 68 && (bArr[2] & 4) == 4 && (bArr[4] & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3;
    }

    /* renamed from: l */
    public static long m9498l(C4015a0 c4015a0) {
        int m15231f = c4015a0.m15231f();
        if (c4015a0.m15226a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        c4015a0.m15237l(bArr, 0, 9);
        c4015a0.m15223T(m15231f);
        if (m9497a(bArr)) {
            return m9499m(bArr);
        }
        return -9223372036854775807L;
    }

    /* renamed from: m */
    public static long m9499m(byte[] bArr) {
        return (((bArr[0] & 56) >> 3) << 30) | ((bArr[0] & 3) << 28) | ((bArr[1] & 255) << 20) | (((bArr[2] & 248) >> 3) << 15) | ((bArr[2] & 3) << 13) | ((bArr[3] & 255) << 5) | ((bArr[4] & 248) >> 3);
    }

    /* renamed from: b */
    public final int m9500b(InterfaceC5572l interfaceC5572l) {
        this.f9570b.m15220Q(C4041n0.f14518f);
        this.f9571c = true;
        interfaceC5572l.mo22427l();
        return 0;
    }

    /* renamed from: c */
    public long m9501c() {
        return this.f9576h;
    }

    /* renamed from: d */
    public C4033j0 m9502d() {
        return this.f9569a;
    }

    /* renamed from: e */
    public boolean m9503e() {
        return this.f9571c;
    }

    /* renamed from: f */
    public final int m9504f(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & 255) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
    }

    /* renamed from: g */
    public int m9505g(InterfaceC5572l interfaceC5572l, C5585y c5585y) {
        if (!this.f9573e) {
            return m9508j(interfaceC5572l, c5585y);
        }
        if (this.f9575g == -9223372036854775807L) {
            return m9500b(interfaceC5572l);
        }
        if (!this.f9572d) {
            return m9506h(interfaceC5572l, c5585y);
        }
        long j10 = this.f9574f;
        if (j10 == -9223372036854775807L) {
            return m9500b(interfaceC5572l);
        }
        long m15363b = this.f9569a.m15363b(this.f9575g) - this.f9569a.m15363b(j10);
        this.f9576h = m15363b;
        if (m15363b < 0) {
            C4046r.m15529i("PsDurationReader", "Invalid duration: " + this.f9576h + ". Using TIME_UNSET instead.");
            this.f9576h = -9223372036854775807L;
        }
        return m9500b(interfaceC5572l);
    }

    /* renamed from: h */
    public final int m9506h(InterfaceC5572l interfaceC5572l, C5585y c5585y) {
        int min = (int) Math.min(20000L, interfaceC5572l.mo3029b());
        long j10 = 0;
        if (interfaceC5572l.getPosition() != j10) {
            c5585y.f20962a = j10;
            return 1;
        }
        this.f9570b.m15219P(min);
        interfaceC5572l.mo22427l();
        interfaceC5572l.mo22430p(this.f9570b.m15230e(), 0, min);
        this.f9574f = m9507i(this.f9570b);
        this.f9572d = true;
        return 0;
    }

    /* renamed from: i */
    public final long m9507i(C4015a0 c4015a0) {
        int m15232g = c4015a0.m15232g();
        for (int m15231f = c4015a0.m15231f(); m15231f < m15232g - 3; m15231f++) {
            if (m9504f(c4015a0.m15230e(), m15231f) == 442) {
                c4015a0.m15223T(m15231f + 4);
                long m9498l = m9498l(c4015a0);
                if (m9498l != -9223372036854775807L) {
                    return m9498l;
                }
            }
        }
        return -9223372036854775807L;
    }

    /* renamed from: j */
    public final int m9508j(InterfaceC5572l interfaceC5572l, C5585y c5585y) {
        long mo3029b = interfaceC5572l.mo3029b();
        int min = (int) Math.min(20000L, mo3029b);
        long j10 = mo3029b - min;
        if (interfaceC5572l.getPosition() != j10) {
            c5585y.f20962a = j10;
            return 1;
        }
        this.f9570b.m15219P(min);
        interfaceC5572l.mo22427l();
        interfaceC5572l.mo22430p(this.f9570b.m15230e(), 0, min);
        this.f9575g = m9509k(this.f9570b);
        this.f9573e = true;
        return 0;
    }

    /* renamed from: k */
    public final long m9509k(C4015a0 c4015a0) {
        int m15231f = c4015a0.m15231f();
        for (int m15232g = c4015a0.m15232g() - 4; m15232g >= m15231f; m15232g--) {
            if (m9504f(c4015a0.m15230e(), m15232g) == 442) {
                c4015a0.m15223T(m15232g + 4);
                long m9498l = m9498l(c4015a0);
                if (m9498l != -9223372036854775807L) {
                    return m9498l;
                }
            }
        }
        return -9223372036854775807L;
    }
}
