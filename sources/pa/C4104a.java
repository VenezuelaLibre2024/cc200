package pa;

/* renamed from: pa.a */
/* loaded from: classes.dex */
public final class C4104a {
    /* renamed from: a */
    public static float m15853a(float f10, float f11, float f12, float f13) {
        double d10 = f10 - f12;
        double d11 = f11 - f13;
        return (float) Math.sqrt((d10 * d10) + (d11 * d11));
    }

    /* renamed from: b */
    public static float m15854b(int i10, int i11, int i12, int i13) {
        double d10 = i10 - i12;
        double d11 = i11 - i13;
        return (float) Math.sqrt((d10 * d10) + (d11 * d11));
    }

    /* renamed from: c */
    public static int m15855c(float f10) {
        return (int) (f10 + (f10 < 0.0f ? -0.5f : 0.5f));
    }

    /* renamed from: d */
    public static int m15856d(int[] iArr) {
        int i10 = 0;
        for (int i11 : iArr) {
            i10 += i11;
        }
        return i10;
    }
}
