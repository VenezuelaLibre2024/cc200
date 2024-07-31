package p360z;

/* renamed from: z.l */
/* loaded from: classes.dex */
public final class C5938l {

    /* renamed from: k */
    public static final C5938l f22069k = m23783k(C5928b.f22035c, (float) ((C5928b.m23697h(50.0f) * 63.66197723675813d) / 100.0d), 50.0f, 2.0f, false);

    /* renamed from: a */
    public final float f22070a;

    /* renamed from: b */
    public final float f22071b;

    /* renamed from: c */
    public final float f22072c;

    /* renamed from: d */
    public final float f22073d;

    /* renamed from: e */
    public final float f22074e;

    /* renamed from: f */
    public final float f22075f;

    /* renamed from: g */
    public final float[] f22076g;

    /* renamed from: h */
    public final float f22077h;

    /* renamed from: i */
    public final float f22078i;

    /* renamed from: j */
    public final float f22079j;

    public C5938l(float f10, float f11, float f12, float f13, float f14, float f15, float[] fArr, float f16, float f17, float f18) {
        this.f22075f = f10;
        this.f22070a = f11;
        this.f22071b = f12;
        this.f22072c = f13;
        this.f22073d = f14;
        this.f22074e = f15;
        this.f22076g = fArr;
        this.f22077h = f16;
        this.f22078i = f17;
        this.f22079j = f18;
    }

    /* renamed from: k */
    public static C5938l m23783k(float[] fArr, float f10, float f11, float f12, boolean z10) {
        float[][] fArr2 = C5928b.f22033a;
        float f13 = (fArr[0] * fArr2[0][0]) + (fArr[1] * fArr2[0][1]) + (fArr[2] * fArr2[0][2]);
        float f14 = (fArr[0] * fArr2[1][0]) + (fArr[1] * fArr2[1][1]) + (fArr[2] * fArr2[1][2]);
        float f15 = (fArr[0] * fArr2[2][0]) + (fArr[1] * fArr2[2][1]) + (fArr[2] * fArr2[2][2]);
        float f16 = (f12 / 10.0f) + 0.8f;
        float m23693d = ((double) f16) >= 0.9d ? C5928b.m23693d(0.59f, 0.69f, (f16 - 0.9f) * 10.0f) : C5928b.m23693d(0.525f, 0.59f, (f16 - 0.8f) * 10.0f);
        float exp = z10 ? 1.0f : (1.0f - (((float) Math.exp(((-f10) - 42.0f) / 92.0f)) * 0.2777778f)) * f16;
        double d10 = exp;
        if (d10 > 1.0d) {
            exp = 1.0f;
        } else if (d10 < 0.0d) {
            exp = 0.0f;
        }
        float[] fArr3 = {(((100.0f / f13) * exp) + 1.0f) - exp, (((100.0f / f14) * exp) + 1.0f) - exp, (((100.0f / f15) * exp) + 1.0f) - exp};
        float f17 = 1.0f / ((5.0f * f10) + 1.0f);
        float f18 = f17 * f17 * f17 * f17;
        float f19 = 1.0f - f18;
        float cbrt = (f18 * f10) + (0.1f * f19 * f19 * ((float) Math.cbrt(f10 * 5.0d)));
        float m23697h = C5928b.m23697h(f11) / fArr[1];
        double d11 = m23697h;
        float sqrt = ((float) Math.sqrt(d11)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d11, 0.2d));
        float[] fArr4 = {(float) Math.pow(((fArr3[0] * cbrt) * f13) / 100.0d, 0.42d), (float) Math.pow(((fArr3[1] * cbrt) * f14) / 100.0d, 0.42d), (float) Math.pow(((fArr3[2] * cbrt) * f15) / 100.0d, 0.42d)};
        float[] fArr5 = {(fArr4[0] * 400.0f) / (fArr4[0] + 27.13f), (fArr4[1] * 400.0f) / (fArr4[1] + 27.13f), (fArr4[2] * 400.0f) / (fArr4[2] + 27.13f)};
        return new C5938l(m23697h, ((fArr5[0] * 2.0f) + fArr5[1] + (fArr5[2] * 0.05f)) * pow, pow, pow, m23693d, f16, fArr3, cbrt, (float) Math.pow(cbrt, 0.25d), sqrt);
    }

    /* renamed from: a */
    public float m23784a() {
        return this.f22070a;
    }

    /* renamed from: b */
    public float m23785b() {
        return this.f22073d;
    }

    /* renamed from: c */
    public float m23786c() {
        return this.f22077h;
    }

    /* renamed from: d */
    public float m23787d() {
        return this.f22078i;
    }

    /* renamed from: e */
    public float m23788e() {
        return this.f22075f;
    }

    /* renamed from: f */
    public float m23789f() {
        return this.f22071b;
    }

    /* renamed from: g */
    public float m23790g() {
        return this.f22074e;
    }

    /* renamed from: h */
    public float m23791h() {
        return this.f22072c;
    }

    /* renamed from: i */
    public float[] m23792i() {
        return this.f22076g;
    }

    /* renamed from: j */
    public float m23793j() {
        return this.f22079j;
    }
}
