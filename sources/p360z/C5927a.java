package p360z;

import p002a0.C0004a;

/* renamed from: z.a */
/* loaded from: classes.dex */
public class C5927a {

    /* renamed from: a */
    public final float f22024a;

    /* renamed from: b */
    public final float f22025b;

    /* renamed from: c */
    public final float f22026c;

    /* renamed from: d */
    public final float f22027d;

    /* renamed from: e */
    public final float f22028e;

    /* renamed from: f */
    public final float f22029f;

    /* renamed from: g */
    public final float f22030g;

    /* renamed from: h */
    public final float f22031h;

    /* renamed from: i */
    public final float f22032i;

    public C5927a(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18) {
        this.f22024a = f10;
        this.f22025b = f11;
        this.f22026c = f12;
        this.f22027d = f13;
        this.f22028e = f14;
        this.f22029f = f15;
        this.f22030g = f16;
        this.f22031h = f17;
        this.f22032i = f18;
    }

    /* renamed from: b */
    public static C5927a m23674b(float f10, float f11, float f12) {
        float f13 = 1000.0f;
        float f14 = 0.0f;
        C5927a c5927a = null;
        float f15 = 100.0f;
        float f16 = 1000.0f;
        while (Math.abs(f14 - f15) > 0.01f) {
            float f17 = ((f15 - f14) / 2.0f) + f14;
            int m23689p = m23677e(f17, f11, f10).m23689p();
            float m23691b = C5928b.m23691b(m23689p);
            float abs = Math.abs(f12 - m23691b);
            if (abs < 0.2f) {
                C5927a m23675c = m23675c(m23689p);
                float m23681a = m23675c.m23681a(m23677e(m23675c.m23686k(), m23675c.m23684i(), f10));
                if (m23681a <= 1.0f) {
                    c5927a = m23675c;
                    f13 = abs;
                    f16 = m23681a;
                }
            }
            if (f13 == 0.0f && f16 == 0.0f) {
                break;
            }
            if (m23691b < f12) {
                f14 = f17;
            } else {
                f15 = f17;
            }
        }
        return c5927a;
    }

    /* renamed from: c */
    public static C5927a m23675c(int i10) {
        return m23676d(i10, C5938l.f22069k);
    }

    /* renamed from: d */
    public static C5927a m23676d(int i10, C5938l c5938l) {
        float[] m23695f = C5928b.m23695f(i10);
        float[][] fArr = C5928b.f22033a;
        float f10 = (m23695f[0] * fArr[0][0]) + (m23695f[1] * fArr[0][1]) + (m23695f[2] * fArr[0][2]);
        float f11 = (m23695f[0] * fArr[1][0]) + (m23695f[1] * fArr[1][1]) + (m23695f[2] * fArr[1][2]);
        float f12 = (m23695f[0] * fArr[2][0]) + (m23695f[1] * fArr[2][1]) + (m23695f[2] * fArr[2][2]);
        float f13 = c5938l.m23792i()[0] * f10;
        float f14 = c5938l.m23792i()[1] * f11;
        float f15 = c5938l.m23792i()[2] * f12;
        float pow = (float) Math.pow((c5938l.m23786c() * Math.abs(f13)) / 100.0d, 0.42d);
        float pow2 = (float) Math.pow((c5938l.m23786c() * Math.abs(f14)) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow((c5938l.m23786c() * Math.abs(f15)) / 100.0d, 0.42d);
        float signum = ((Math.signum(f13) * 400.0f) * pow) / (pow + 27.13f);
        float signum2 = ((Math.signum(f14) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum3 = ((Math.signum(f15) * 400.0f) * pow3) / (pow3 + 27.13f);
        double d10 = signum3;
        float f16 = ((float) (((signum * 11.0d) + (signum2 * (-12.0d))) + d10)) / 11.0f;
        float f17 = ((float) ((signum + signum2) - (d10 * 2.0d))) / 9.0f;
        float f18 = signum2 * 20.0f;
        float f19 = (((signum * 20.0f) + f18) + (21.0f * signum3)) / 20.0f;
        float f20 = (((signum * 40.0f) + f18) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2(f17, f16)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f21 = atan2;
        float f22 = (3.1415927f * f21) / 180.0f;
        float pow4 = ((float) Math.pow((f20 * c5938l.m23789f()) / c5938l.m23784a(), c5938l.m23785b() * c5938l.m23793j())) * 100.0f;
        float m23787d = c5938l.m23787d() * (4.0f / c5938l.m23785b()) * ((float) Math.sqrt(pow4 / 100.0f)) * (c5938l.m23784a() + 4.0f);
        float pow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, c5938l.m23788e()), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos((((((double) f21) < 20.14d ? 360.0f + f21 : f21) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * c5938l.m23790g()) * c5938l.m23791h()) * ((float) Math.sqrt((f16 * f16) + (f17 * f17)))) / (f19 + 0.305f), 0.9d)) * ((float) Math.sqrt(pow4 / 100.0d));
        float m23787d2 = pow5 * c5938l.m23787d();
        float sqrt = ((float) Math.sqrt((r2 * c5938l.m23785b()) / (c5938l.m23784a() + 4.0f))) * 50.0f;
        float f23 = (1.7f * pow4) / ((0.007f * pow4) + 1.0f);
        float log = ((float) Math.log((0.0228f * m23787d2) + 1.0f)) * 43.85965f;
        double d11 = f22;
        return new C5927a(f21, pow5, pow4, m23787d, m23787d2, sqrt, f23, log * ((float) Math.cos(d11)), log * ((float) Math.sin(d11)));
    }

    /* renamed from: e */
    public static C5927a m23677e(float f10, float f11, float f12) {
        return m23678f(f10, f11, f12, C5938l.f22069k);
    }

    /* renamed from: f */
    public static C5927a m23678f(float f10, float f11, float f12, C5938l c5938l) {
        float m23785b = (4.0f / c5938l.m23785b()) * ((float) Math.sqrt(f10 / 100.0d)) * (c5938l.m23784a() + 4.0f) * c5938l.m23787d();
        float m23787d = f11 * c5938l.m23787d();
        float sqrt = ((float) Math.sqrt(((f11 / ((float) Math.sqrt(r4))) * c5938l.m23785b()) / (c5938l.m23784a() + 4.0f))) * 50.0f;
        float f13 = (1.7f * f10) / ((0.007f * f10) + 1.0f);
        float log = ((float) Math.log((m23787d * 0.0228d) + 1.0d)) * 43.85965f;
        double d10 = (3.1415927f * f12) / 180.0f;
        return new C5927a(f12, f11, f10, m23785b, m23787d, sqrt, f13, log * ((float) Math.cos(d10)), log * ((float) Math.sin(d10)));
    }

    /* renamed from: m */
    public static int m23679m(float f10, float f11, float f12) {
        return m23680n(f10, f11, f12, C5938l.f22069k);
    }

    /* renamed from: n */
    public static int m23680n(float f10, float f11, float f12, C5938l c5938l) {
        if (f11 < 1.0d || Math.round(f12) <= 0.0d || Math.round(f12) >= 100.0d) {
            return C5928b.m23690a(f12);
        }
        float min = f10 < 0.0f ? 0.0f : Math.min(360.0f, f10);
        C5927a c5927a = null;
        boolean z10 = true;
        float f13 = 0.0f;
        float f14 = f11;
        while (Math.abs(f13 - f11) >= 0.4f) {
            C5927a m23674b = m23674b(min, f14, f12);
            if (z10) {
                if (m23674b != null) {
                    return m23674b.m23688o(c5938l);
                }
                z10 = false;
            } else if (m23674b == null) {
                f11 = f14;
            } else {
                f13 = f14;
                c5927a = m23674b;
            }
            f14 = ((f11 - f13) / 2.0f) + f13;
        }
        return c5927a == null ? C5928b.m23690a(f12) : c5927a.m23688o(c5938l);
    }

    /* renamed from: a */
    public float m23681a(C5927a c5927a) {
        float m23687l = m23687l() - c5927a.m23687l();
        float m23682g = m23682g() - c5927a.m23682g();
        float m23683h = m23683h() - c5927a.m23683h();
        return (float) (Math.pow(Math.sqrt((m23687l * m23687l) + (m23682g * m23682g) + (m23683h * m23683h)), 0.63d) * 1.41d);
    }

    /* renamed from: g */
    public float m23682g() {
        return this.f22031h;
    }

    /* renamed from: h */
    public float m23683h() {
        return this.f22032i;
    }

    /* renamed from: i */
    public float m23684i() {
        return this.f22025b;
    }

    /* renamed from: j */
    public float m23685j() {
        return this.f22024a;
    }

    /* renamed from: k */
    public float m23686k() {
        return this.f22026c;
    }

    /* renamed from: l */
    public float m23687l() {
        return this.f22030g;
    }

    /* renamed from: o */
    public int m23688o(C5938l c5938l) {
        float pow = (float) Math.pow(((((double) m23684i()) == 0.0d || ((double) m23686k()) == 0.0d) ? 0.0f : m23684i() / ((float) Math.sqrt(m23686k() / 100.0d))) / Math.pow(1.64d - Math.pow(0.29d, c5938l.m23788e()), 0.73d), 1.1111111111111112d);
        double m23685j = (m23685j() * 3.1415927f) / 180.0f;
        float cos = ((float) (Math.cos(2.0d + m23685j) + 3.8d)) * 0.25f;
        float m23784a = c5938l.m23784a() * ((float) Math.pow(m23686k() / 100.0d, (1.0d / c5938l.m23785b()) / c5938l.m23793j()));
        float m23790g = cos * 3846.1538f * c5938l.m23790g() * c5938l.m23791h();
        float m23789f = m23784a / c5938l.m23789f();
        float sin = (float) Math.sin(m23685j);
        float cos2 = (float) Math.cos(m23685j);
        float f10 = (((0.305f + m23789f) * 23.0f) * pow) / (((m23790g * 23.0f) + ((11.0f * pow) * cos2)) + ((pow * 108.0f) * sin));
        float f11 = cos2 * f10;
        float f12 = f10 * sin;
        float f13 = m23789f * 460.0f;
        float f14 = (((451.0f * f11) + f13) + (288.0f * f12)) / 1403.0f;
        float f15 = ((f13 - (891.0f * f11)) - (261.0f * f12)) / 1403.0f;
        float signum = Math.signum(f14) * (100.0f / c5938l.m23786c()) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f14) * 27.13d) / (400.0d - Math.abs(f14))), 2.380952380952381d));
        float signum2 = Math.signum(f15) * (100.0f / c5938l.m23786c()) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f15) * 27.13d) / (400.0d - Math.abs(f15))), 2.380952380952381d));
        float signum3 = Math.signum(((f13 - (f11 * 220.0f)) - (f12 * 6300.0f)) / 1403.0f) * (100.0f / c5938l.m23786c()) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(r6) * 27.13d) / (400.0d - Math.abs(r6))), 2.380952380952381d));
        float f16 = signum / c5938l.m23792i()[0];
        float f17 = signum2 / c5938l.m23792i()[1];
        float f18 = signum3 / c5938l.m23792i()[2];
        float[][] fArr = C5928b.f22034b;
        return C0004a.m6a((fArr[0][0] * f16) + (fArr[0][1] * f17) + (fArr[0][2] * f18), (fArr[1][0] * f16) + (fArr[1][1] * f17) + (fArr[1][2] * f18), (f16 * fArr[2][0]) + (f17 * fArr[2][1]) + (f18 * fArr[2][2]));
    }

    /* renamed from: p */
    public int m23689p() {
        return m23688o(C5938l.f22069k);
    }
}
