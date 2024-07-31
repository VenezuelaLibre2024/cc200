package p211oa;

import p129ia.C2678j;

/* renamed from: oa.f */
/* loaded from: classes.dex */
public final class C3969f extends AbstractC3973j {
    @Override // p211oa.AbstractC3973j
    /* renamed from: c */
    public C3965b mo15068c(C3965b c3965b, int i10, int i11, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f20, float f21, float f22, float f23, float f24, float f25) {
        return mo15069d(c3965b, i10, i11, C3975l.m15089b(f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, f20, f21, f22, f23, f24, f25));
    }

    @Override // p211oa.AbstractC3973j
    /* renamed from: d */
    public C3965b mo15069d(C3965b c3965b, int i10, int i11, C3975l c3975l) {
        if (i10 <= 0 || i11 <= 0) {
            throw C2678j.m10895a();
        }
        C3965b c3965b2 = new C3965b(i10, i11);
        int i12 = i10 * 2;
        float[] fArr = new float[i12];
        for (int i13 = 0; i13 < i11; i13++) {
            float f10 = i13 + 0.5f;
            for (int i14 = 0; i14 < i12; i14 += 2) {
                fArr[i14] = (i14 / 2) + 0.5f;
                fArr[i14 + 1] = f10;
            }
            c3975l.m15094f(fArr);
            AbstractC3973j.m15083a(c3965b, fArr);
            for (int i15 = 0; i15 < i12; i15 += 2) {
                try {
                    if (c3965b.m15035g((int) fArr[i15], (int) fArr[i15 + 1])) {
                        c3965b2.m15044q(i15 / 2, i13);
                    }
                } catch (ArrayIndexOutOfBoundsException unused) {
                    throw C2678j.m10895a();
                }
            }
        }
        return c3965b2;
    }
}
