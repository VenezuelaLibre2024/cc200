package p002a0;

import android.graphics.Color;

/* renamed from: a0.a */
/* loaded from: classes.dex */
public final class C0004a {

    /* renamed from: a */
    public static final ThreadLocal<double[]> f4a = new ThreadLocal<>();

    /* renamed from: a */
    public static int m6a(double d10, double d11, double d12) {
        double d13 = (((3.2406d * d10) + ((-1.5372d) * d11)) + ((-0.4986d) * d12)) / 100.0d;
        double d14 = ((((-0.9689d) * d10) + (1.8758d * d11)) + (0.0415d * d12)) / 100.0d;
        double d15 = (((0.0557d * d10) + ((-0.204d) * d11)) + (1.057d * d12)) / 100.0d;
        return Color.rgb(m10e((int) Math.round((d13 > 0.0031308d ? (Math.pow(d13, 0.4166666666666667d) * 1.055d) - 0.055d : d13 * 12.92d) * 255.0d), 0, 255), m10e((int) Math.round((d14 > 0.0031308d ? (Math.pow(d14, 0.4166666666666667d) * 1.055d) - 0.055d : d14 * 12.92d) * 255.0d), 0, 255), m10e((int) Math.round((d15 > 0.0031308d ? (Math.pow(d15, 0.4166666666666667d) * 1.055d) - 0.055d : d15 * 12.92d) * 255.0d), 0, 255));
    }

    /* renamed from: b */
    public static int m7b(int i10, int i11) {
        return 255 - (((255 - i11) * (255 - i10)) / 255);
    }

    /* renamed from: c */
    public static int m8c(int i10, int i11) {
        int alpha = Color.alpha(i11);
        int alpha2 = Color.alpha(i10);
        int m7b = m7b(alpha2, alpha);
        return Color.argb(m7b, m9d(Color.red(i10), alpha2, Color.red(i11), alpha, m7b), m9d(Color.green(i10), alpha2, Color.green(i11), alpha, m7b), m9d(Color.blue(i10), alpha2, Color.blue(i11), alpha, m7b));
    }

    /* renamed from: d */
    public static int m9d(int i10, int i11, int i12, int i13, int i14) {
        if (i14 == 0) {
            return 0;
        }
        return (((i10 * 255) * i11) + ((i12 * i13) * (255 - i11))) / (i14 * 255);
    }

    /* renamed from: e */
    public static int m10e(int i10, int i11, int i12) {
        return i10 < i11 ? i11 : Math.min(i10, i12);
    }

    /* renamed from: f */
    public static int m11f(int i10, int i11) {
        if (i11 < 0 || i11 > 255) {
            throw new IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return (i10 & 16777215) | (i11 << 24);
    }
}
