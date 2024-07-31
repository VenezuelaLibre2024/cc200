package la;

import p129ia.C2678j;
import p129ia.C2684p;
import p143ja.C3272a;
import p211oa.AbstractC3973j;
import p211oa.C3965b;
import pa.C4104a;
import pa.C4105b;
import qa.C4219a;
import qa.C4221c;
import qa.C4222d;

/* renamed from: la.a */
/* loaded from: classes.dex */
public final class C3463a {

    /* renamed from: g */
    public static final int[] f12159g = {3808, 476, 2107, 1799};

    /* renamed from: a */
    public final C3965b f12160a;

    /* renamed from: b */
    public boolean f12161b;

    /* renamed from: c */
    public int f12162c;

    /* renamed from: d */
    public int f12163d;

    /* renamed from: e */
    public int f12164e;

    /* renamed from: f */
    public int f12165f;

    /* renamed from: la.a$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final int f12166a;

        /* renamed from: b */
        public final int f12167b;

        public a(int i10, int i11) {
            this.f12166a = i10;
            this.f12167b = i11;
        }

        /* renamed from: a */
        public int m12890a() {
            return this.f12166a;
        }

        /* renamed from: b */
        public int m12891b() {
            return this.f12167b;
        }

        /* renamed from: c */
        public C2684p m12892c() {
            return new C2684p(this.f12166a, this.f12167b);
        }

        public String toString() {
            return "<" + this.f12166a + ' ' + this.f12167b + '>';
        }
    }

    public C3463a(C3965b c3965b) {
        this.f12160a = c3965b;
    }

    /* renamed from: b */
    public static float m12872b(C2684p c2684p, C2684p c2684p2) {
        return C4104a.m15853a(c2684p.m10908c(), c2684p.m10909d(), c2684p2.m10908c(), c2684p2.m10909d());
    }

    /* renamed from: c */
    public static float m12873c(a aVar, a aVar2) {
        return C4104a.m15854b(aVar.m12890a(), aVar.m12891b(), aVar2.m12890a(), aVar2.m12891b());
    }

    /* renamed from: d */
    public static C2684p[] m12874d(C2684p[] c2684pArr, int i10, int i11) {
        float f10 = i11 / (i10 * 2.0f);
        float m10908c = c2684pArr[0].m10908c() - c2684pArr[2].m10908c();
        float m10909d = c2684pArr[0].m10909d() - c2684pArr[2].m10909d();
        float m10908c2 = (c2684pArr[0].m10908c() + c2684pArr[2].m10908c()) / 2.0f;
        float m10909d2 = (c2684pArr[0].m10909d() + c2684pArr[2].m10909d()) / 2.0f;
        float f11 = m10908c * f10;
        float f12 = m10909d * f10;
        C2684p c2684p = new C2684p(m10908c2 + f11, m10909d2 + f12);
        C2684p c2684p2 = new C2684p(m10908c2 - f11, m10909d2 - f12);
        float m10908c3 = c2684pArr[1].m10908c() - c2684pArr[3].m10908c();
        float m10909d3 = c2684pArr[1].m10909d() - c2684pArr[3].m10909d();
        float m10908c4 = (c2684pArr[1].m10908c() + c2684pArr[3].m10908c()) / 2.0f;
        float m10909d4 = (c2684pArr[1].m10909d() + c2684pArr[3].m10909d()) / 2.0f;
        float f13 = m10908c3 * f10;
        float f14 = f10 * m10909d3;
        return new C2684p[]{c2684p, new C2684p(m10908c4 + f13, m10909d4 + f14), c2684p2, new C2684p(m10908c4 - f13, m10909d4 - f14)};
    }

    /* renamed from: h */
    public static int m12875h(long j10, boolean z10) {
        int i10;
        int i11;
        if (z10) {
            i10 = 7;
            i11 = 2;
        } else {
            i10 = 10;
            i11 = 4;
        }
        int i12 = i10 - i11;
        int[] iArr = new int[i10];
        for (int i13 = i10 - 1; i13 >= 0; i13--) {
            iArr[i13] = ((int) j10) & 15;
            j10 >>= 4;
        }
        try {
            new C4221c(C4219a.f15197k).m16261a(iArr, i12);
            int i14 = 0;
            for (int i15 = 0; i15 < i11; i15++) {
                i14 = (i14 << 4) + iArr[i15];
            }
            return i14;
        } catch (C4222d unused) {
            throw C2678j.m10895a();
        }
    }

    /* renamed from: m */
    public static int m12876m(int[] iArr, int i10) {
        int i11 = 0;
        for (int i12 : iArr) {
            i11 = (i11 << 3) + ((i12 >> (i10 - 2)) << 1) + (i12 & 1);
        }
        int i13 = ((i11 & 1) << 11) + (i11 >> 1);
        for (int i14 = 0; i14 < 4; i14++) {
            if (Integer.bitCount(f12159g[i14] ^ i13) <= 2) {
                return i14;
            }
        }
        throw C2678j.m10895a();
    }

    /* renamed from: a */
    public C3272a m12877a(boolean z10) {
        C2684p[] m12879f = m12879f(m12883k());
        if (z10) {
            C2684p c2684p = m12879f[0];
            m12879f[0] = m12879f[2];
            m12879f[2] = c2684p;
        }
        m12878e(m12879f);
        C3965b c3965b = this.f12160a;
        int i10 = this.f12165f;
        return new C3272a(m12888q(c3965b, m12879f[i10 % 4], m12879f[(i10 + 1) % 4], m12879f[(i10 + 2) % 4], m12879f[(i10 + 3) % 4]), m12884l(m12879f), this.f12161b, this.f12163d, this.f12162c);
    }

    /* renamed from: e */
    public final void m12878e(C2684p[] c2684pArr) {
        int i10;
        long j10;
        long j11;
        if (!m12886o(c2684pArr[0]) || !m12886o(c2684pArr[1]) || !m12886o(c2684pArr[2]) || !m12886o(c2684pArr[3])) {
            throw C2678j.m10895a();
        }
        int i11 = this.f12164e * 2;
        int[] iArr = {m12889r(c2684pArr[0], c2684pArr[1], i11), m12889r(c2684pArr[1], c2684pArr[2], i11), m12889r(c2684pArr[2], c2684pArr[3], i11), m12889r(c2684pArr[3], c2684pArr[0], i11)};
        this.f12165f = m12876m(iArr, i11);
        long j12 = 0;
        for (int i12 = 0; i12 < 4; i12++) {
            int i13 = iArr[(this.f12165f + i12) % 4];
            if (this.f12161b) {
                j10 = j12 << 7;
                j11 = (i13 >> 1) & 127;
            } else {
                j10 = j12 << 10;
                j11 = ((i13 >> 2) & 992) + ((i13 >> 1) & 31);
            }
            j12 = j10 + j11;
        }
        int m12875h = m12875h(j12, this.f12161b);
        if (this.f12161b) {
            this.f12162c = (m12875h >> 6) + 1;
            i10 = m12875h & 63;
        } else {
            this.f12162c = (m12875h >> 11) + 1;
            i10 = m12875h & 2047;
        }
        this.f12163d = i10 + 1;
    }

    /* renamed from: f */
    public final C2684p[] m12879f(a aVar) {
        this.f12164e = 1;
        a aVar2 = aVar;
        a aVar3 = aVar2;
        a aVar4 = aVar3;
        boolean z10 = true;
        while (this.f12164e < 9) {
            a m12882j = m12882j(aVar, z10, 1, -1);
            a m12882j2 = m12882j(aVar2, z10, 1, 1);
            a m12882j3 = m12882j(aVar3, z10, -1, 1);
            a m12882j4 = m12882j(aVar4, z10, -1, -1);
            if (this.f12164e > 2) {
                double m12873c = (m12873c(m12882j4, m12882j) * this.f12164e) / (m12873c(aVar4, aVar) * (this.f12164e + 2));
                if (m12873c < 0.75d || m12873c > 1.25d || !m12887p(m12882j, m12882j2, m12882j3, m12882j4)) {
                    break;
                }
            }
            z10 = !z10;
            this.f12164e++;
            aVar4 = m12882j4;
            aVar = m12882j;
            aVar2 = m12882j2;
            aVar3 = m12882j3;
        }
        int i10 = this.f12164e;
        if (i10 != 5 && i10 != 7) {
            throw C2678j.m10895a();
        }
        this.f12161b = i10 == 5;
        C2684p[] c2684pArr = {new C2684p(aVar.m12890a() + 0.5f, aVar.m12891b() - 0.5f), new C2684p(aVar2.m12890a() + 0.5f, aVar2.m12891b() + 0.5f), new C2684p(aVar3.m12890a() - 0.5f, aVar3.m12891b() + 0.5f), new C2684p(aVar4.m12890a() - 0.5f, aVar4.m12891b() - 0.5f)};
        int i11 = this.f12164e;
        return m12874d(c2684pArr, (i11 * 2) - 3, i11 * 2);
    }

    /* renamed from: g */
    public final int m12880g(a aVar, a aVar2) {
        float m12873c = m12873c(aVar, aVar2);
        if (m12873c == 0.0f) {
            return 0;
        }
        float m12890a = (aVar2.m12890a() - aVar.m12890a()) / m12873c;
        float m12891b = (aVar2.m12891b() - aVar.m12891b()) / m12873c;
        float m12890a2 = aVar.m12890a();
        float m12891b2 = aVar.m12891b();
        boolean m15035g = this.f12160a.m15035g(aVar.m12890a(), aVar.m12891b());
        int floor = (int) Math.floor(m12873c);
        int i10 = 0;
        for (int i11 = 0; i11 < floor; i11++) {
            if (this.f12160a.m15035g(C4104a.m15855c(m12890a2), C4104a.m15855c(m12891b2)) != m15035g) {
                i10++;
            }
            m12890a2 += m12890a;
            m12891b2 += m12891b;
        }
        float f10 = i10 / m12873c;
        if (f10 <= 0.1f || f10 >= 0.9f) {
            return (f10 <= 0.1f) == m15035g ? 1 : -1;
        }
        return 0;
    }

    /* renamed from: i */
    public final int m12881i() {
        if (this.f12161b) {
            return (this.f12162c * 4) + 11;
        }
        int i10 = this.f12162c;
        return (i10 * 4) + ((((i10 * 2) + 6) / 15) * 2) + 15;
    }

    /* renamed from: j */
    public final a m12882j(a aVar, boolean z10, int i10, int i11) {
        int m12890a = aVar.m12890a() + i10;
        int m12891b = aVar.m12891b();
        while (true) {
            m12891b += i11;
            if (!m12885n(m12890a, m12891b) || this.f12160a.m15035g(m12890a, m12891b) != z10) {
                break;
            }
            m12890a += i10;
        }
        int i12 = m12890a - i10;
        int i13 = m12891b - i11;
        while (m12885n(i12, i13) && this.f12160a.m15035g(i12, i13) == z10) {
            i12 += i10;
        }
        int i14 = i12 - i10;
        while (m12885n(i14, i13) && this.f12160a.m15035g(i14, i13) == z10) {
            i13 += i11;
        }
        return new a(i14, i13 - i11);
    }

    /* renamed from: k */
    public final a m12883k() {
        C2684p m12892c;
        C2684p c2684p;
        C2684p c2684p2;
        C2684p c2684p3;
        C2684p m12892c2;
        C2684p m12892c3;
        C2684p m12892c4;
        C2684p m12892c5;
        try {
            C2684p[] m15859c = new C4105b(this.f12160a).m15859c();
            c2684p2 = m15859c[0];
            c2684p3 = m15859c[1];
            c2684p = m15859c[2];
            m12892c = m15859c[3];
        } catch (C2678j unused) {
            int m15041n = this.f12160a.m15041n() / 2;
            int m15038k = this.f12160a.m15038k() / 2;
            int i10 = m15041n + 7;
            int i11 = m15038k - 7;
            C2684p m12892c6 = m12882j(new a(i10, i11), false, 1, -1).m12892c();
            int i12 = m15038k + 7;
            C2684p m12892c7 = m12882j(new a(i10, i12), false, 1, 1).m12892c();
            int i13 = m15041n - 7;
            C2684p m12892c8 = m12882j(new a(i13, i12), false, -1, 1).m12892c();
            m12892c = m12882j(new a(i13, i11), false, -1, -1).m12892c();
            c2684p = m12892c8;
            c2684p2 = m12892c6;
            c2684p3 = m12892c7;
        }
        int m15855c = C4104a.m15855c((((c2684p2.m10908c() + m12892c.m10908c()) + c2684p3.m10908c()) + c2684p.m10908c()) / 4.0f);
        int m15855c2 = C4104a.m15855c((((c2684p2.m10909d() + m12892c.m10909d()) + c2684p3.m10909d()) + c2684p.m10909d()) / 4.0f);
        try {
            C2684p[] m15859c2 = new C4105b(this.f12160a, 15, m15855c, m15855c2).m15859c();
            m12892c2 = m15859c2[0];
            m12892c3 = m15859c2[1];
            m12892c4 = m15859c2[2];
            m12892c5 = m15859c2[3];
        } catch (C2678j unused2) {
            int i14 = m15855c + 7;
            int i15 = m15855c2 - 7;
            m12892c2 = m12882j(new a(i14, i15), false, 1, -1).m12892c();
            int i16 = m15855c2 + 7;
            m12892c3 = m12882j(new a(i14, i16), false, 1, 1).m12892c();
            int i17 = m15855c - 7;
            m12892c4 = m12882j(new a(i17, i16), false, -1, 1).m12892c();
            m12892c5 = m12882j(new a(i17, i15), false, -1, -1).m12892c();
        }
        return new a(C4104a.m15855c((((m12892c2.m10908c() + m12892c5.m10908c()) + m12892c3.m10908c()) + m12892c4.m10908c()) / 4.0f), C4104a.m15855c((((m12892c2.m10909d() + m12892c5.m10909d()) + m12892c3.m10909d()) + m12892c4.m10909d()) / 4.0f));
    }

    /* renamed from: l */
    public final C2684p[] m12884l(C2684p[] c2684pArr) {
        return m12874d(c2684pArr, this.f12164e * 2, m12881i());
    }

    /* renamed from: n */
    public final boolean m12885n(int i10, int i11) {
        return i10 >= 0 && i10 < this.f12160a.m15041n() && i11 >= 0 && i11 < this.f12160a.m15038k();
    }

    /* renamed from: o */
    public final boolean m12886o(C2684p c2684p) {
        return m12885n(C4104a.m15855c(c2684p.m10908c()), C4104a.m15855c(c2684p.m10909d()));
    }

    /* renamed from: p */
    public final boolean m12887p(a aVar, a aVar2, a aVar3, a aVar4) {
        a aVar5 = new a(Math.max(0, aVar.m12890a() - 3), Math.min(this.f12160a.m15038k() - 1, aVar.m12891b() + 3));
        a aVar6 = new a(Math.max(0, aVar2.m12890a() - 3), Math.max(0, aVar2.m12891b() - 3));
        a aVar7 = new a(Math.min(this.f12160a.m15041n() - 1, aVar3.m12890a() + 3), Math.max(0, Math.min(this.f12160a.m15038k() - 1, aVar3.m12891b() - 3)));
        a aVar8 = new a(Math.min(this.f12160a.m15041n() - 1, aVar4.m12890a() + 3), Math.min(this.f12160a.m15038k() - 1, aVar4.m12891b() + 3));
        int m12880g = m12880g(aVar8, aVar5);
        return m12880g != 0 && m12880g(aVar5, aVar6) == m12880g && m12880g(aVar6, aVar7) == m12880g && m12880g(aVar7, aVar8) == m12880g;
    }

    /* renamed from: q */
    public final C3965b m12888q(C3965b c3965b, C2684p c2684p, C2684p c2684p2, C2684p c2684p3, C2684p c2684p4) {
        AbstractC3973j m15084b = AbstractC3973j.m15084b();
        int m12881i = m12881i();
        float f10 = m12881i / 2.0f;
        int i10 = this.f12164e;
        float f11 = f10 - i10;
        float f12 = f10 + i10;
        return m15084b.mo15068c(c3965b, m12881i, m12881i, f11, f11, f12, f11, f12, f12, f11, f12, c2684p.m10908c(), c2684p.m10909d(), c2684p2.m10908c(), c2684p2.m10909d(), c2684p3.m10908c(), c2684p3.m10909d(), c2684p4.m10908c(), c2684p4.m10909d());
    }

    /* renamed from: r */
    public final int m12889r(C2684p c2684p, C2684p c2684p2, int i10) {
        float m12872b = m12872b(c2684p, c2684p2);
        float f10 = m12872b / i10;
        float m10908c = c2684p.m10908c();
        float m10909d = c2684p.m10909d();
        float m10908c2 = ((c2684p2.m10908c() - c2684p.m10908c()) * f10) / m12872b;
        float m10909d2 = (f10 * (c2684p2.m10909d() - c2684p.m10909d())) / m12872b;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            float f11 = i12;
            if (this.f12160a.m15035g(C4104a.m15855c((f11 * m10908c2) + m10908c), C4104a.m15855c((f11 * m10909d2) + m10909d))) {
                i11 |= 1 << ((i10 - i12) - 1);
            }
        }
        return i11;
    }
}
