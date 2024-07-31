package p211oa;

/* renamed from: oa.l */
/* loaded from: classes.dex */
public final class C3975l {

    /* renamed from: a */
    public final float f14332a;

    /* renamed from: b */
    public final float f14333b;

    /* renamed from: c */
    public final float f14334c;

    /* renamed from: d */
    public final float f14335d;

    /* renamed from: e */
    public final float f14336e;

    /* renamed from: f */
    public final float f14337f;

    /* renamed from: g */
    public final float f14338g;

    /* renamed from: h */
    public final float f14339h;

    /* renamed from: i */
    public final float f14340i;

    public C3975l(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18) {
        this.f14332a = f10;
        this.f14333b = f13;
        this.f14334c = f16;
        this.f14335d = f11;
        this.f14336e = f14;
        this.f14337f = f17;
        this.f14338g = f12;
        this.f14339h = f15;
        this.f14340i = f18;
    }

    /* renamed from: b */
    public static C3975l m15089b(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f20, float f21, float f22, float f23, float f24, float f25) {
        return m15091d(f18, f19, f20, f21, f22, f23, f24, f25).m15093e(m15090c(f10, f11, f12, f13, f14, f15, f16, f17));
    }

    /* renamed from: c */
    public static C3975l m15090c(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
        return m15091d(f10, f11, f12, f13, f14, f15, f16, f17).m15092a();
    }

    /* renamed from: d */
    public static C3975l m15091d(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
        float f18 = ((f10 - f12) + f14) - f16;
        float f19 = ((f11 - f13) + f15) - f17;
        if (f18 == 0.0f && f19 == 0.0f) {
            return new C3975l(f12 - f10, f14 - f12, f10, f13 - f11, f15 - f13, f11, 0.0f, 0.0f, 1.0f);
        }
        float f20 = f12 - f14;
        float f21 = f16 - f14;
        float f22 = f13 - f15;
        float f23 = f17 - f15;
        float f24 = (f20 * f23) - (f21 * f22);
        float f25 = ((f23 * f18) - (f21 * f19)) / f24;
        float f26 = ((f20 * f19) - (f18 * f22)) / f24;
        return new C3975l((f25 * f12) + (f12 - f10), (f26 * f16) + (f16 - f10), f10, (f13 - f11) + (f25 * f13), (f17 - f11) + (f26 * f17), f11, f25, f26, 1.0f);
    }

    /* renamed from: a */
    public C3975l m15092a() {
        float f10 = this.f14336e;
        float f11 = this.f14340i;
        float f12 = this.f14337f;
        float f13 = this.f14339h;
        float f14 = (f10 * f11) - (f12 * f13);
        float f15 = this.f14338g;
        float f16 = this.f14335d;
        float f17 = (f12 * f15) - (f16 * f11);
        float f18 = (f16 * f13) - (f10 * f15);
        float f19 = this.f14334c;
        float f20 = this.f14333b;
        float f21 = (f19 * f13) - (f20 * f11);
        float f22 = this.f14332a;
        return new C3975l(f14, f17, f18, f21, (f11 * f22) - (f19 * f15), (f15 * f20) - (f13 * f22), (f20 * f12) - (f19 * f10), (f19 * f16) - (f12 * f22), (f22 * f10) - (f20 * f16));
    }

    /* renamed from: e */
    public C3975l m15093e(C3975l c3975l) {
        float f10 = this.f14332a;
        float f11 = c3975l.f14332a;
        float f12 = this.f14335d;
        float f13 = c3975l.f14333b;
        float f14 = this.f14338g;
        float f15 = c3975l.f14334c;
        float f16 = (f10 * f11) + (f12 * f13) + (f14 * f15);
        float f17 = c3975l.f14335d;
        float f18 = c3975l.f14336e;
        float f19 = c3975l.f14337f;
        float f20 = (f10 * f17) + (f12 * f18) + (f14 * f19);
        float f21 = c3975l.f14338g;
        float f22 = c3975l.f14339h;
        float f23 = c3975l.f14340i;
        float f24 = (f10 * f21) + (f12 * f22) + (f14 * f23);
        float f25 = this.f14333b;
        float f26 = this.f14336e;
        float f27 = this.f14339h;
        float f28 = (f25 * f11) + (f26 * f13) + (f27 * f15);
        float f29 = (f25 * f17) + (f26 * f18) + (f27 * f19);
        float f30 = (f27 * f23) + (f25 * f21) + (f26 * f22);
        float f31 = this.f14334c;
        float f32 = this.f14337f;
        float f33 = (f11 * f31) + (f13 * f32);
        float f34 = this.f14340i;
        return new C3975l(f16, f20, f24, f28, f29, f30, (f15 * f34) + f33, (f17 * f31) + (f18 * f32) + (f19 * f34), (f31 * f21) + (f32 * f22) + (f34 * f23));
    }

    /* renamed from: f */
    public void m15094f(float[] fArr) {
        float f10 = this.f14332a;
        float f11 = this.f14333b;
        float f12 = this.f14334c;
        float f13 = this.f14335d;
        float f14 = this.f14336e;
        float f15 = this.f14337f;
        float f16 = this.f14338g;
        float f17 = this.f14339h;
        float f18 = this.f14340i;
        int length = fArr.length - 1;
        for (int i10 = 0; i10 < length; i10 += 2) {
            float f19 = fArr[i10];
            int i11 = i10 + 1;
            float f20 = fArr[i11];
            float f21 = (f12 * f19) + (f15 * f20) + f18;
            fArr[i10] = (((f10 * f19) + (f13 * f20)) + f16) / f21;
            fArr[i11] = (((f19 * f11) + (f20 * f14)) + f17) / f21;
        }
    }
}
