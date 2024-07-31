package bb;

import p129ia.C2684p;

/* renamed from: bb.h */
/* loaded from: classes.dex */
public final class C0538h extends C0537g {

    /* renamed from: c */
    public final boolean f2402c;

    public C0538h(C0533c c0533c, boolean z10) {
        super(c0533c);
        this.f2402c = z10;
    }

    /* renamed from: g */
    public void m2622g(C0531a c0531a) {
        C0534d[] m2619d = m2619d();
        m2628m();
        m2627l(m2619d, c0531a);
        C0533c m2616a = m2616a();
        C2684p m2580h = this.f2402c ? m2616a.m2580h() : m2616a.m2581i();
        C2684p m2574b = this.f2402c ? m2616a.m2574b() : m2616a.m2575c();
        int m2620e = m2620e((int) m2580h.m10909d());
        int m2620e2 = m2620e((int) m2574b.m10909d());
        int i10 = -1;
        int i11 = 0;
        int i12 = 1;
        while (m2620e < m2620e2) {
            if (m2619d[m2620e] != null) {
                C0534d c0534d = m2619d[m2620e];
                int m2584c = c0534d.m2584c() - i10;
                if (m2584c == 0) {
                    i11++;
                } else {
                    if (m2584c == 1) {
                        i12 = Math.max(i12, i11);
                    } else if (m2584c < 0 || c0534d.m2584c() >= c0531a.m2567c() || m2584c > m2620e) {
                        m2619d[m2620e] = null;
                    } else {
                        if (i12 > 2) {
                            m2584c *= i12 - 2;
                        }
                        boolean z10 = m2584c >= m2620e;
                        for (int i13 = 1; i13 <= m2584c && !z10; i13++) {
                            z10 = m2619d[m2620e - i13] != null;
                        }
                        if (z10) {
                            m2619d[m2620e] = null;
                        }
                    }
                    i10 = c0534d.m2584c();
                    i11 = 1;
                }
            }
            m2620e++;
        }
    }

    /* renamed from: h */
    public final void m2623h(C0531a c0531a) {
        C0533c m2616a = m2616a();
        C2684p m2580h = this.f2402c ? m2616a.m2580h() : m2616a.m2581i();
        C2684p m2574b = this.f2402c ? m2616a.m2574b() : m2616a.m2575c();
        int m2620e = m2620e((int) m2574b.m10909d());
        C0534d[] m2619d = m2619d();
        int i10 = -1;
        int i11 = 0;
        int i12 = 1;
        for (int m2620e2 = m2620e((int) m2580h.m10909d()); m2620e2 < m2620e; m2620e2++) {
            if (m2619d[m2620e2] != null) {
                C0534d c0534d = m2619d[m2620e2];
                c0534d.m2591j();
                int m2584c = c0534d.m2584c() - i10;
                if (m2584c == 0) {
                    i11++;
                } else {
                    if (m2584c == 1) {
                        i12 = Math.max(i12, i11);
                    } else if (c0534d.m2584c() >= c0531a.m2567c()) {
                        m2619d[m2620e2] = null;
                    }
                    i10 = c0534d.m2584c();
                    i11 = 1;
                }
            }
        }
    }

    /* renamed from: i */
    public C0531a m2624i() {
        C0534d[] m2619d = m2619d();
        C0532b c0532b = new C0532b();
        C0532b c0532b2 = new C0532b();
        C0532b c0532b3 = new C0532b();
        C0532b c0532b4 = new C0532b();
        for (C0534d c0534d : m2619d) {
            if (c0534d != null) {
                c0534d.m2591j();
                int m2586e = c0534d.m2586e() % 30;
                int m2584c = c0534d.m2584c();
                if (!this.f2402c) {
                    m2584c += 2;
                }
                int i10 = m2584c % 3;
                if (i10 == 0) {
                    c0532b2.m2571b((m2586e * 3) + 1);
                } else if (i10 == 1) {
                    c0532b4.m2571b(m2586e / 3);
                    c0532b3.m2571b(m2586e % 3);
                } else if (i10 == 2) {
                    c0532b.m2571b(m2586e + 1);
                }
            }
        }
        if (c0532b.m2570a().length == 0 || c0532b2.m2570a().length == 0 || c0532b3.m2570a().length == 0 || c0532b4.m2570a().length == 0 || c0532b.m2570a()[0] < 1 || c0532b2.m2570a()[0] + c0532b3.m2570a()[0] < 3 || c0532b2.m2570a()[0] + c0532b3.m2570a()[0] > 90) {
            return null;
        }
        C0531a c0531a = new C0531a(c0532b.m2570a()[0], c0532b2.m2570a()[0], c0532b3.m2570a()[0], c0532b4.m2570a()[0]);
        m2627l(m2619d, c0531a);
        return c0531a;
    }

    /* renamed from: j */
    public int[] m2625j() {
        int m2584c;
        C0531a m2624i = m2624i();
        if (m2624i == null) {
            return null;
        }
        m2623h(m2624i);
        int m2567c = m2624i.m2567c();
        int[] iArr = new int[m2567c];
        for (C0534d c0534d : m2619d()) {
            if (c0534d != null && (m2584c = c0534d.m2584c()) < m2567c) {
                iArr[m2584c] = iArr[m2584c] + 1;
            }
        }
        return iArr;
    }

    /* renamed from: k */
    public boolean m2626k() {
        return this.f2402c;
    }

    /* renamed from: l */
    public final void m2627l(C0534d[] c0534dArr, C0531a c0531a) {
        for (int i10 = 0; i10 < c0534dArr.length; i10++) {
            C0534d c0534d = c0534dArr[i10];
            if (c0534dArr[i10] != null) {
                int m2586e = c0534d.m2586e() % 30;
                int m2584c = c0534d.m2584c();
                if (m2584c > c0531a.m2567c()) {
                    c0534dArr[i10] = null;
                } else {
                    if (!this.f2402c) {
                        m2584c += 2;
                    }
                    int i11 = m2584c % 3;
                    if (i11 != 0) {
                        if (i11 != 1) {
                            if (i11 == 2 && m2586e + 1 != c0531a.m2565a()) {
                                c0534dArr[i10] = null;
                            }
                        } else if (m2586e / 3 != c0531a.m2566b() || m2586e % 3 != c0531a.m2568d()) {
                            c0534dArr[i10] = null;
                        }
                    } else if ((m2586e * 3) + 1 != c0531a.m2569e()) {
                        c0534dArr[i10] = null;
                    }
                }
            }
        }
    }

    /* renamed from: m */
    public final void m2628m() {
        for (C0534d c0534d : m2619d()) {
            if (c0534d != null) {
                c0534d.m2591j();
            }
        }
    }

    @Override // bb.C0537g
    public String toString() {
        return "IsLeft: " + this.f2402c + '\n' + super.toString();
    }
}
