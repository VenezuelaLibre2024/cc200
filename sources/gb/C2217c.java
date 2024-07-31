package gb;

import java.util.Map;
import p084fb.C1897j;
import p129ia.C2678j;
import p129ia.C2684p;
import p129ia.EnumC2673e;
import p129ia.InterfaceC2685q;
import p211oa.AbstractC3973j;
import p211oa.C3965b;
import p211oa.C3970g;
import p211oa.C3975l;
import pa.C4104a;

/* renamed from: gb.c */
/* loaded from: classes.dex */
public class C2217c {

    /* renamed from: a */
    public final C3965b f8804a;

    /* renamed from: b */
    public InterfaceC2685q f8805b;

    public C2217c(C3965b c3965b) {
        this.f8804a = c3965b;
    }

    /* renamed from: c */
    public static int m8899c(C2684p c2684p, C2684p c2684p2, C2684p c2684p3, float f10) {
        int m15855c = ((C4104a.m15855c(C2684p.m10906b(c2684p, c2684p2) / f10) + C4104a.m15855c(C2684p.m10906b(c2684p, c2684p3) / f10)) / 2) + 7;
        int i10 = m15855c & 3;
        if (i10 == 0) {
            return m15855c + 1;
        }
        if (i10 == 2) {
            return m15855c - 1;
        }
        if (i10 != 3) {
            return m15855c;
        }
        throw C2678j.m10895a();
    }

    /* renamed from: d */
    public static C3975l m8900d(C2684p c2684p, C2684p c2684p2, C2684p c2684p3, C2684p c2684p4, int i10) {
        float m10908c;
        float m10909d;
        float f10;
        float f11 = i10 - 3.5f;
        if (c2684p4 != null) {
            m10908c = c2684p4.m10908c();
            m10909d = c2684p4.m10909d();
            f10 = f11 - 3.0f;
        } else {
            m10908c = (c2684p2.m10908c() - c2684p.m10908c()) + c2684p3.m10908c();
            m10909d = (c2684p2.m10909d() - c2684p.m10909d()) + c2684p3.m10909d();
            f10 = f11;
        }
        return C3975l.m15089b(3.5f, 3.5f, f11, 3.5f, f10, f10, 3.5f, f11, c2684p.m10908c(), c2684p.m10909d(), c2684p2.m10908c(), c2684p2.m10909d(), m10908c, m10909d, c2684p3.m10908c(), c2684p3.m10909d());
    }

    /* renamed from: h */
    public static C3965b m8901h(C3965b c3965b, C3975l c3975l, int i10) {
        return AbstractC3973j.m15084b().mo15069d(c3965b, i10, i10, c3975l);
    }

    /* renamed from: a */
    public final float m8902a(C2684p c2684p, C2684p c2684p2, C2684p c2684p3) {
        return (m8903b(c2684p, c2684p2) + m8903b(c2684p, c2684p3)) / 2.0f;
    }

    /* renamed from: b */
    public final float m8903b(C2684p c2684p, C2684p c2684p2) {
        float m8908j = m8908j((int) c2684p.m10908c(), (int) c2684p.m10909d(), (int) c2684p2.m10908c(), (int) c2684p2.m10909d());
        float m8908j2 = m8908j((int) c2684p2.m10908c(), (int) c2684p2.m10909d(), (int) c2684p.m10908c(), (int) c2684p.m10909d());
        return Float.isNaN(m8908j) ? m8908j2 / 7.0f : Float.isNaN(m8908j2) ? m8908j / 7.0f : (m8908j + m8908j2) / 14.0f;
    }

    /* renamed from: e */
    public final C3970g m8904e(Map<EnumC2673e, ?> map) {
        this.f8805b = map == null ? null : (InterfaceC2685q) map.get(EnumC2673e.NEED_RESULT_POINT_CALLBACK);
        return m8906g(new C2219e(this.f8804a, this.f8805b).m8922g(map));
    }

    /* renamed from: f */
    public final C2215a m8905f(float f10, int i10, int i11, float f11) {
        int i12 = (int) (f11 * f10);
        int max = Math.max(0, i10 - i12);
        int min = Math.min(this.f8804a.m15041n() - 1, i10 + i12) - max;
        float f12 = 3.0f * f10;
        if (min < f12) {
            throw C2678j.m10895a();
        }
        int max2 = Math.max(0, i11 - i12);
        int min2 = Math.min(this.f8804a.m15038k() - 1, i11 + i12) - max2;
        if (min2 >= f12) {
            return new C2216b(this.f8804a, max, max2, min, min2, f10, this.f8805b).m8896c();
        }
        throw C2678j.m10895a();
    }

    /* renamed from: g */
    public final C3970g m8906g(C2220f c2220f) {
        C2218d m8930b = c2220f.m8930b();
        C2218d m8931c = c2220f.m8931c();
        C2218d m8929a = c2220f.m8929a();
        float m8902a = m8902a(m8930b, m8931c, m8929a);
        if (m8902a < 1.0f) {
            throw C2678j.m10895a();
        }
        int m8899c = m8899c(m8930b, m8931c, m8929a, m8902a);
        C1897j m7753g = C1897j.m7753g(m8899c);
        int m7757e = m7753g.m7757e() - 7;
        C2215a c2215a = null;
        if (m7753g.m7756d().length > 0) {
            float m10908c = (m8931c.m10908c() - m8930b.m10908c()) + m8929a.m10908c();
            float m10909d = (m8931c.m10909d() - m8930b.m10909d()) + m8929a.m10909d();
            float f10 = 1.0f - (3.0f / m7757e);
            int m10908c2 = (int) (m8930b.m10908c() + ((m10908c - m8930b.m10908c()) * f10));
            int m10909d2 = (int) (m8930b.m10909d() + (f10 * (m10909d - m8930b.m10909d())));
            for (int i10 = 4; i10 <= 16; i10 <<= 1) {
                try {
                    c2215a = m8905f(m8902a, m10908c2, m10909d2, i10);
                    break;
                } catch (C2678j unused) {
                }
            }
        }
        return new C3970g(m8901h(this.f8804a, m8900d(m8930b, m8931c, m8929a, c2215a, m8899c), m8899c), c2215a == null ? new C2684p[]{m8929a, m8930b, m8931c} : new C2684p[]{m8929a, m8930b, m8931c, c2215a});
    }

    /* renamed from: i */
    public final float m8907i(int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        C2217c c2217c;
        boolean z10;
        int i20;
        int i21 = 1;
        boolean z11 = Math.abs(i13 - i11) > Math.abs(i12 - i10);
        if (z11) {
            i15 = i10;
            i14 = i11;
            i17 = i12;
            i16 = i13;
        } else {
            i14 = i10;
            i15 = i11;
            i16 = i12;
            i17 = i13;
        }
        int abs = Math.abs(i16 - i14);
        int abs2 = Math.abs(i17 - i15);
        int i22 = 2;
        int i23 = (-abs) / 2;
        int i24 = i14 < i16 ? 1 : -1;
        int i25 = i15 < i17 ? 1 : -1;
        int i26 = i16 + i24;
        int i27 = i14;
        int i28 = i15;
        int i29 = 0;
        while (true) {
            if (i27 == i26) {
                i18 = i26;
                i19 = i22;
                break;
            }
            int i30 = z11 ? i28 : i27;
            int i31 = z11 ? i27 : i28;
            if (i29 == i21) {
                z10 = z11;
                i20 = i21;
                i18 = i26;
                c2217c = this;
            } else {
                c2217c = this;
                z10 = z11;
                i18 = i26;
                i20 = 0;
            }
            if (i20 == c2217c.f8804a.m15035g(i30, i31)) {
                if (i29 == 2) {
                    return C4104a.m15854b(i27, i28, i14, i15);
                }
                i29++;
            }
            i23 += abs2;
            if (i23 > 0) {
                if (i28 == i17) {
                    i19 = 2;
                    break;
                }
                i28 += i25;
                i23 -= abs;
            }
            i27 += i24;
            i26 = i18;
            z11 = z10;
            i21 = 1;
            i22 = 2;
        }
        if (i29 == i19) {
            return C4104a.m15854b(i18, i17, i14, i15);
        }
        return Float.NaN;
    }

    /* renamed from: j */
    public final float m8908j(int i10, int i11, int i12, int i13) {
        float f10;
        float f11;
        float m8907i = m8907i(i10, i11, i12, i13);
        int i14 = i10 - (i12 - i10);
        int i15 = 0;
        if (i14 < 0) {
            f10 = i10 / (i10 - i14);
            i14 = 0;
        } else if (i14 >= this.f8804a.m15041n()) {
            f10 = ((this.f8804a.m15041n() - 1) - i10) / (i14 - i10);
            i14 = this.f8804a.m15041n() - 1;
        } else {
            f10 = 1.0f;
        }
        float f12 = i11;
        int i16 = (int) (f12 - ((i13 - i11) * f10));
        if (i16 < 0) {
            f11 = f12 / (i11 - i16);
        } else if (i16 >= this.f8804a.m15038k()) {
            f11 = ((this.f8804a.m15038k() - 1) - i11) / (i16 - i11);
            i15 = this.f8804a.m15038k() - 1;
        } else {
            i15 = i16;
            f11 = 1.0f;
        }
        return (m8907i + m8907i(i10, i11, (int) (i10 + ((i14 - i10) * f11)), i15)) - 1.0f;
    }
}
