package p360z;

import android.graphics.Color;
import p002a0.C0004a;

/* renamed from: z.b */
/* loaded from: classes.dex */
public final class C5928b {

    /* renamed from: a */
    public static final float[][] f22033a = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};

    /* renamed from: b */
    public static final float[][] f22034b = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};

    /* renamed from: c */
    public static final float[] f22035c = {95.047f, 100.0f, 108.883f};

    /* renamed from: d */
    public static final float[][] f22036d = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    /* renamed from: a */
    public static int m23690a(float f10) {
        if (f10 < 1.0f) {
            return -16777216;
        }
        if (f10 > 99.0f) {
            return -1;
        }
        float f11 = (f10 + 16.0f) / 116.0f;
        float f12 = (f10 > 8.0f ? 1 : (f10 == 8.0f ? 0 : -1)) > 0 ? f11 * f11 * f11 : f10 / 903.2963f;
        float f13 = f11 * f11 * f11;
        boolean z10 = f13 > 0.008856452f;
        float f14 = z10 ? f13 : ((f11 * 116.0f) - 16.0f) / 903.2963f;
        if (!z10) {
            f13 = ((f11 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = f22035c;
        return C0004a.m6a(f14 * fArr[0], f12 * fArr[1], f13 * fArr[2]);
    }

    /* renamed from: b */
    public static float m23691b(int i10) {
        return m23692c(m23696g(i10));
    }

    /* renamed from: c */
    public static float m23692c(float f10) {
        float f11 = f10 / 100.0f;
        return f11 <= 0.008856452f ? f11 * 903.2963f : (((float) Math.cbrt(f11)) * 116.0f) - 16.0f;
    }

    /* renamed from: d */
    public static float m23693d(float f10, float f11, float f12) {
        return f10 + ((f11 - f10) * f12);
    }

    /* renamed from: e */
    public static float m23694e(int i10) {
        float f10 = i10 / 255.0f;
        return (f10 <= 0.04045f ? f10 / 12.92f : (float) Math.pow((f10 + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    /* renamed from: f */
    public static float[] m23695f(int i10) {
        float m23694e = m23694e(Color.red(i10));
        float m23694e2 = m23694e(Color.green(i10));
        float m23694e3 = m23694e(Color.blue(i10));
        float[][] fArr = f22036d;
        return new float[]{(fArr[0][0] * m23694e) + (fArr[0][1] * m23694e2) + (fArr[0][2] * m23694e3), (fArr[1][0] * m23694e) + (fArr[1][1] * m23694e2) + (fArr[1][2] * m23694e3), (m23694e * fArr[2][0]) + (m23694e2 * fArr[2][1]) + (m23694e3 * fArr[2][2])};
    }

    /* renamed from: g */
    public static float m23696g(int i10) {
        float m23694e = m23694e(Color.red(i10));
        float m23694e2 = m23694e(Color.green(i10));
        float m23694e3 = m23694e(Color.blue(i10));
        float[][] fArr = f22036d;
        return (m23694e * fArr[1][0]) + (m23694e2 * fArr[1][1]) + (m23694e3 * fArr[1][2]);
    }

    /* renamed from: h */
    public static float m23697h(float f10) {
        return (f10 > 8.0f ? (float) Math.pow((f10 + 16.0d) / 116.0d, 3.0d) : f10 / 903.2963f) * 100.0f;
    }
}
