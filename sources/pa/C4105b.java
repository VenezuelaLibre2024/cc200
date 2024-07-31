package pa;

import p129ia.C2678j;
import p129ia.C2684p;
import p211oa.C3965b;

/* renamed from: pa.b */
/* loaded from: classes.dex */
public final class C4105b {

    /* renamed from: a */
    public final C3965b f14812a;

    /* renamed from: b */
    public final int f14813b;

    /* renamed from: c */
    public final int f14814c;

    /* renamed from: d */
    public final int f14815d;

    /* renamed from: e */
    public final int f14816e;

    /* renamed from: f */
    public final int f14817f;

    /* renamed from: g */
    public final int f14818g;

    public C4105b(C3965b c3965b) {
        this(c3965b, 10, c3965b.m15041n() / 2, c3965b.m15038k() / 2);
    }

    public C4105b(C3965b c3965b, int i10, int i11, int i12) {
        this.f14812a = c3965b;
        int m15038k = c3965b.m15038k();
        this.f14813b = m15038k;
        int m15041n = c3965b.m15041n();
        this.f14814c = m15041n;
        int i13 = i10 / 2;
        int i14 = i11 - i13;
        this.f14815d = i14;
        int i15 = i11 + i13;
        this.f14816e = i15;
        int i16 = i12 - i13;
        this.f14818g = i16;
        int i17 = i12 + i13;
        this.f14817f = i17;
        if (i16 < 0 || i14 < 0 || i17 >= m15038k || i15 >= m15041n) {
            throw C2678j.m10895a();
        }
    }

    /* renamed from: a */
    public final C2684p[] m15857a(C2684p c2684p, C2684p c2684p2, C2684p c2684p3, C2684p c2684p4) {
        float m10908c = c2684p.m10908c();
        float m10909d = c2684p.m10909d();
        float m10908c2 = c2684p2.m10908c();
        float m10909d2 = c2684p2.m10909d();
        float m10908c3 = c2684p3.m10908c();
        float m10909d3 = c2684p3.m10909d();
        float m10908c4 = c2684p4.m10908c();
        float m10909d4 = c2684p4.m10909d();
        return m10908c < ((float) this.f14814c) / 2.0f ? new C2684p[]{new C2684p(m10908c4 - 1.0f, m10909d4 + 1.0f), new C2684p(m10908c2 + 1.0f, m10909d2 + 1.0f), new C2684p(m10908c3 - 1.0f, m10909d3 - 1.0f), new C2684p(m10908c + 1.0f, m10909d - 1.0f)} : new C2684p[]{new C2684p(m10908c4 + 1.0f, m10909d4 + 1.0f), new C2684p(m10908c2 + 1.0f, m10909d2 - 1.0f), new C2684p(m10908c3 - 1.0f, m10909d3 + 1.0f), new C2684p(m10908c - 1.0f, m10909d - 1.0f)};
    }

    /* renamed from: b */
    public final boolean m15858b(int i10, int i11, int i12, boolean z10) {
        if (z10) {
            while (i10 <= i11) {
                if (this.f14812a.m15035g(i10, i12)) {
                    return true;
                }
                i10++;
            }
            return false;
        }
        while (i10 <= i11) {
            if (this.f14812a.m15035g(i12, i10)) {
                return true;
            }
            i10++;
        }
        return false;
    }

    /* renamed from: c */
    public C2684p[] m15859c() {
        int i10 = this.f14815d;
        int i11 = this.f14816e;
        int i12 = this.f14818g;
        int i13 = this.f14817f;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = true;
        while (z15) {
            boolean z16 = false;
            boolean z17 = true;
            while (true) {
                if ((z17 || !z11) && i11 < this.f14814c) {
                    z17 = m15858b(i12, i13, i11, false);
                    if (z17) {
                        i11++;
                        z11 = true;
                        z16 = true;
                    } else if (!z11) {
                        i11++;
                    }
                }
            }
            if (i11 < this.f14814c) {
                boolean z18 = true;
                while (true) {
                    if ((z18 || !z12) && i13 < this.f14813b) {
                        z18 = m15858b(i10, i11, i13, true);
                        if (z18) {
                            i13++;
                            z12 = true;
                            z16 = true;
                        } else if (!z12) {
                            i13++;
                        }
                    }
                }
                if (i13 < this.f14813b) {
                    boolean z19 = true;
                    while (true) {
                        if ((z19 || !z13) && i10 >= 0) {
                            z19 = m15858b(i12, i13, i10, false);
                            if (z19) {
                                i10--;
                                z13 = true;
                                z16 = true;
                            } else if (!z13) {
                                i10--;
                            }
                        }
                    }
                    if (i10 >= 0) {
                        z15 = z16;
                        boolean z20 = true;
                        while (true) {
                            if ((z20 || !z14) && i12 >= 0) {
                                z20 = m15858b(i10, i11, i12, true);
                                if (z20) {
                                    i12--;
                                    z15 = true;
                                    z14 = true;
                                } else if (!z14) {
                                    i12--;
                                }
                            }
                        }
                        if (i12 < 0) {
                        }
                    }
                }
            }
            z10 = true;
            break;
        }
        if (z10) {
            throw C2678j.m10895a();
        }
        int i14 = i11 - i10;
        C2684p c2684p = null;
        C2684p c2684p2 = null;
        for (int i15 = 1; c2684p2 == null && i15 < i14; i15++) {
            c2684p2 = m15860d(i10, i13 - i15, i10 + i15, i13);
        }
        if (c2684p2 == null) {
            throw C2678j.m10895a();
        }
        C2684p c2684p3 = null;
        for (int i16 = 1; c2684p3 == null && i16 < i14; i16++) {
            c2684p3 = m15860d(i10, i12 + i16, i10 + i16, i12);
        }
        if (c2684p3 == null) {
            throw C2678j.m10895a();
        }
        C2684p c2684p4 = null;
        for (int i17 = 1; c2684p4 == null && i17 < i14; i17++) {
            c2684p4 = m15860d(i11, i12 + i17, i11 - i17, i12);
        }
        if (c2684p4 == null) {
            throw C2678j.m10895a();
        }
        for (int i18 = 1; c2684p == null && i18 < i14; i18++) {
            c2684p = m15860d(i11, i13 - i18, i11 - i18, i13);
        }
        if (c2684p != null) {
            return m15857a(c2684p, c2684p2, c2684p4, c2684p3);
        }
        throw C2678j.m10895a();
    }

    /* renamed from: d */
    public final C2684p m15860d(float f10, float f11, float f12, float f13) {
        int m15855c = C4104a.m15855c(C4104a.m15853a(f10, f11, f12, f13));
        float f14 = m15855c;
        float f15 = (f12 - f10) / f14;
        float f16 = (f13 - f11) / f14;
        for (int i10 = 0; i10 < m15855c; i10++) {
            float f17 = i10;
            int m15855c2 = C4104a.m15855c((f17 * f15) + f10);
            int m15855c3 = C4104a.m15855c((f17 * f16) + f11);
            if (this.f14812a.m15035g(m15855c2, m15855c3)) {
                return new C2684p(m15855c2, m15855c3);
            }
        }
        return null;
    }
}
