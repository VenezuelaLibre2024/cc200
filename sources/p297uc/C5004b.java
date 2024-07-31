package p297uc;

/* renamed from: uc.b */
/* loaded from: classes2.dex */
public final class C5004b {
    /* renamed from: a */
    public static float m19612a(float f10, float f11, float f12, float f13) {
        float f14;
        float f15 = f10 / (f13 / 2.0f);
        float f16 = f12 / 2.0f;
        if (f15 < 1.0f) {
            f14 = f16 * f15 * f15 * f15;
        } else {
            float f17 = f15 - 2.0f;
            f14 = f16 * ((f17 * f17 * f17) + 2.0f);
        }
        return f14 + f11;
    }

    /* renamed from: b */
    public static float m19613b(float f10, float f11, float f12, float f13) {
        float f14 = (f10 / f13) - 1.0f;
        return (f12 * ((f14 * f14 * f14) + 1.0f)) + f11;
    }
}
