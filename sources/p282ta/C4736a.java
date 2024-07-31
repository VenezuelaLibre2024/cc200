package p282ta;

import p129ia.C2678j;
import p129ia.C2684p;
import p211oa.AbstractC3973j;
import p211oa.C3965b;
import p211oa.C3970g;
import pa.C4105b;

/* renamed from: ta.a */
/* loaded from: classes.dex */
public final class C4736a {

    /* renamed from: a */
    public final C3965b f17676a;

    /* renamed from: b */
    public final C4105b f17677b;

    public C4736a(C3965b c3965b) {
        this.f17676a = c3965b;
        this.f17677b = new C4105b(c3965b);
    }

    /* renamed from: f */
    public static C2684p m18606f(C2684p c2684p, float f10, float f11) {
        float m10908c = c2684p.m10908c();
        float m10909d = c2684p.m10909d();
        return new C2684p(m10908c < f10 ? m10908c - 1.0f : m10908c + 1.0f, m10909d < f11 ? m10909d - 1.0f : m10909d + 1.0f);
    }

    /* renamed from: g */
    public static C3965b m18607g(C3965b c3965b, C2684p c2684p, C2684p c2684p2, C2684p c2684p3, C2684p c2684p4, int i10, int i11) {
        float f10 = i10 - 0.5f;
        float f11 = i11 - 0.5f;
        return AbstractC3973j.m15084b().mo15068c(c3965b, i10, i11, 0.5f, 0.5f, f10, 0.5f, f10, f11, 0.5f, f11, c2684p.m10908c(), c2684p.m10909d(), c2684p4.m10908c(), c2684p4.m10909d(), c2684p3.m10908c(), c2684p3.m10909d(), c2684p2.m10908c(), c2684p2.m10909d());
    }

    /* renamed from: h */
    public static C2684p m18608h(C2684p c2684p, C2684p c2684p2, int i10) {
        float f10 = i10 + 1;
        return new C2684p(c2684p.m10908c() + ((c2684p2.m10908c() - c2684p.m10908c()) / f10), c2684p.m10909d() + ((c2684p2.m10909d() - c2684p.m10909d()) / f10));
    }

    /* renamed from: a */
    public final C2684p m18609a(C2684p[] c2684pArr) {
        C2684p c2684p = c2684pArr[0];
        C2684p c2684p2 = c2684pArr[1];
        C2684p c2684p3 = c2684pArr[2];
        C2684p c2684p4 = c2684pArr[3];
        int m18615j = m18615j(c2684p, c2684p4);
        C2684p m18608h = m18608h(c2684p, c2684p2, (m18615j(c2684p2, c2684p4) + 1) * 4);
        C2684p m18608h2 = m18608h(c2684p3, c2684p2, (m18615j + 1) * 4);
        int m18615j2 = m18615j(m18608h, c2684p4);
        int m18615j3 = m18615j(m18608h2, c2684p4);
        float f10 = m18615j2 + 1;
        C2684p c2684p5 = new C2684p(c2684p4.m10908c() + ((c2684p3.m10908c() - c2684p2.m10908c()) / f10), c2684p4.m10909d() + ((c2684p3.m10909d() - c2684p2.m10909d()) / f10));
        float f11 = m18615j3 + 1;
        C2684p c2684p6 = new C2684p(c2684p4.m10908c() + ((c2684p.m10908c() - c2684p2.m10908c()) / f11), c2684p4.m10909d() + ((c2684p.m10909d() - c2684p2.m10909d()) / f11));
        if (m18613e(c2684p5)) {
            return (m18613e(c2684p6) && m18615j(m18608h, c2684p5) + m18615j(m18608h2, c2684p5) <= m18615j(m18608h, c2684p6) + m18615j(m18608h2, c2684p6)) ? c2684p6 : c2684p5;
        }
        if (m18613e(c2684p6)) {
            return c2684p6;
        }
        return null;
    }

    /* renamed from: b */
    public C3970g m18610b() {
        int i10;
        int i11;
        C2684p[] m18612d = m18612d(m18611c(this.f17677b.m15859c()));
        m18612d[3] = m18609a(m18612d);
        if (m18612d[3] == null) {
            throw C2678j.m10895a();
        }
        C2684p[] m18614i = m18614i(m18612d);
        C2684p c2684p = m18614i[0];
        C2684p c2684p2 = m18614i[1];
        C2684p c2684p3 = m18614i[2];
        C2684p c2684p4 = m18614i[3];
        int m18615j = m18615j(c2684p, c2684p4) + 1;
        int m18615j2 = m18615j(c2684p3, c2684p4) + 1;
        if ((m18615j & 1) == 1) {
            m18615j++;
        }
        if ((m18615j2 & 1) == 1) {
            m18615j2++;
        }
        if (m18615j * 4 >= m18615j2 * 6 || m18615j2 * 4 >= m18615j * 6) {
            i10 = m18615j;
            i11 = m18615j2;
        } else {
            i10 = Math.max(m18615j, m18615j2);
            i11 = i10;
        }
        return new C3970g(m18607g(this.f17676a, c2684p, c2684p2, c2684p3, c2684p4, i10, i11), new C2684p[]{c2684p, c2684p2, c2684p3, c2684p4});
    }

    /* renamed from: c */
    public final C2684p[] m18611c(C2684p[] c2684pArr) {
        C2684p c2684p = c2684pArr[0];
        C2684p c2684p2 = c2684pArr[1];
        C2684p c2684p3 = c2684pArr[3];
        C2684p c2684p4 = c2684pArr[2];
        int m18615j = m18615j(c2684p, c2684p2);
        int m18615j2 = m18615j(c2684p2, c2684p3);
        int m18615j3 = m18615j(c2684p3, c2684p4);
        int m18615j4 = m18615j(c2684p4, c2684p);
        C2684p[] c2684pArr2 = {c2684p4, c2684p, c2684p2, c2684p3};
        if (m18615j > m18615j2) {
            c2684pArr2[0] = c2684p;
            c2684pArr2[1] = c2684p2;
            c2684pArr2[2] = c2684p3;
            c2684pArr2[3] = c2684p4;
            m18615j = m18615j2;
        }
        if (m18615j > m18615j3) {
            c2684pArr2[0] = c2684p2;
            c2684pArr2[1] = c2684p3;
            c2684pArr2[2] = c2684p4;
            c2684pArr2[3] = c2684p;
        } else {
            m18615j3 = m18615j;
        }
        if (m18615j3 > m18615j4) {
            c2684pArr2[0] = c2684p3;
            c2684pArr2[1] = c2684p4;
            c2684pArr2[2] = c2684p;
            c2684pArr2[3] = c2684p2;
        }
        return c2684pArr2;
    }

    /* renamed from: d */
    public final C2684p[] m18612d(C2684p[] c2684pArr) {
        C2684p c2684p = c2684pArr[0];
        C2684p c2684p2 = c2684pArr[1];
        C2684p c2684p3 = c2684pArr[2];
        C2684p c2684p4 = c2684pArr[3];
        int m18615j = (m18615j(c2684p, c2684p4) + 1) * 4;
        if (m18615j(m18608h(c2684p2, c2684p3, m18615j), c2684p) < m18615j(m18608h(c2684p3, c2684p2, m18615j), c2684p4)) {
            c2684pArr[0] = c2684p;
            c2684pArr[1] = c2684p2;
            c2684pArr[2] = c2684p3;
            c2684pArr[3] = c2684p4;
        } else {
            c2684pArr[0] = c2684p2;
            c2684pArr[1] = c2684p3;
            c2684pArr[2] = c2684p4;
            c2684pArr[3] = c2684p;
        }
        return c2684pArr;
    }

    /* renamed from: e */
    public final boolean m18613e(C2684p c2684p) {
        return c2684p.m10908c() >= 0.0f && c2684p.m10908c() <= ((float) (this.f17676a.m15041n() - 1)) && c2684p.m10909d() > 0.0f && c2684p.m10909d() <= ((float) (this.f17676a.m15038k() - 1));
    }

    /* renamed from: i */
    public final C2684p[] m18614i(C2684p[] c2684pArr) {
        C2684p c2684p = c2684pArr[0];
        C2684p c2684p2 = c2684pArr[1];
        C2684p c2684p3 = c2684pArr[2];
        C2684p c2684p4 = c2684pArr[3];
        int m18615j = m18615j(c2684p, c2684p4) + 1;
        C2684p m18608h = m18608h(c2684p, c2684p2, (m18615j(c2684p3, c2684p4) + 1) * 4);
        C2684p m18608h2 = m18608h(c2684p3, c2684p2, m18615j * 4);
        int m18615j2 = m18615j(m18608h, c2684p4) + 1;
        int m18615j3 = m18615j(m18608h2, c2684p4) + 1;
        if ((m18615j2 & 1) == 1) {
            m18615j2++;
        }
        if ((m18615j3 & 1) == 1) {
            m18615j3++;
        }
        float m10908c = (((c2684p.m10908c() + c2684p2.m10908c()) + c2684p3.m10908c()) + c2684p4.m10908c()) / 4.0f;
        float m10909d = (((c2684p.m10909d() + c2684p2.m10909d()) + c2684p3.m10909d()) + c2684p4.m10909d()) / 4.0f;
        C2684p m18606f = m18606f(c2684p, m10908c, m10909d);
        C2684p m18606f2 = m18606f(c2684p2, m10908c, m10909d);
        C2684p m18606f3 = m18606f(c2684p3, m10908c, m10909d);
        C2684p m18606f4 = m18606f(c2684p4, m10908c, m10909d);
        int i10 = m18615j3 * 4;
        int i11 = m18615j2 * 4;
        return new C2684p[]{m18608h(m18608h(m18606f, m18606f2, i10), m18606f4, i11), m18608h(m18608h(m18606f2, m18606f, i10), m18606f3, i11), m18608h(m18608h(m18606f3, m18606f4, i10), m18606f2, i11), m18608h(m18608h(m18606f4, m18606f3, i10), m18606f, i11)};
    }

    /* renamed from: j */
    public final int m18615j(C2684p c2684p, C2684p c2684p2) {
        int m10908c = (int) c2684p.m10908c();
        int m10909d = (int) c2684p.m10909d();
        int m10908c2 = (int) c2684p2.m10908c();
        int min = Math.min(this.f17676a.m15038k() - 1, (int) c2684p2.m10909d());
        int i10 = 0;
        boolean z10 = Math.abs(min - m10909d) > Math.abs(m10908c2 - m10908c);
        if (z10) {
            m10909d = m10908c;
            m10908c = m10909d;
            min = m10908c2;
            m10908c2 = min;
        }
        int abs = Math.abs(m10908c2 - m10908c);
        int abs2 = Math.abs(min - m10909d);
        int i11 = (-abs) / 2;
        int i12 = m10909d < min ? 1 : -1;
        int i13 = m10908c >= m10908c2 ? -1 : 1;
        boolean m15035g = this.f17676a.m15035g(z10 ? m10909d : m10908c, z10 ? m10908c : m10909d);
        while (m10908c != m10908c2) {
            boolean m15035g2 = this.f17676a.m15035g(z10 ? m10909d : m10908c, z10 ? m10908c : m10909d);
            if (m15035g2 != m15035g) {
                i10++;
                m15035g = m15035g2;
            }
            i11 += abs2;
            if (i11 > 0) {
                if (m10909d == min) {
                    break;
                }
                m10909d += i12;
                i11 -= abs;
            }
            m10908c += i13;
        }
        return i10;
    }
}
