package p297uc;

import android.graphics.RectF;

/* renamed from: uc.g */
/* loaded from: classes2.dex */
public class C5009g {
    /* renamed from: a */
    public static float[] m19640a(RectF rectF) {
        return new float[]{rectF.centerX(), rectF.centerY()};
    }

    /* renamed from: b */
    public static float[] m19641b(RectF rectF) {
        float f10 = rectF.left;
        float f11 = rectF.top;
        float f12 = rectF.right;
        float f13 = rectF.bottom;
        return new float[]{f10, f11, f12, f11, f12, f13, f10, f13};
    }

    /* renamed from: c */
    public static float[] m19642c(float[] fArr) {
        return new float[]{(float) Math.sqrt(Math.pow(fArr[0] - fArr[2], 2.0d) + Math.pow(fArr[1] - fArr[3], 2.0d)), (float) Math.sqrt(Math.pow(fArr[2] - fArr[4], 2.0d) + Math.pow(fArr[3] - fArr[5], 2.0d))};
    }

    /* renamed from: d */
    public static RectF m19643d(float[] fArr) {
        RectF rectF = new RectF(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
        for (int i10 = 1; i10 < fArr.length; i10 += 2) {
            float round = Math.round(fArr[i10 - 1] * 10.0f) / 10.0f;
            float round2 = Math.round(fArr[i10] * 10.0f) / 10.0f;
            float f10 = rectF.left;
            if (round < f10) {
                f10 = round;
            }
            rectF.left = f10;
            float f11 = rectF.top;
            if (round2 < f11) {
                f11 = round2;
            }
            rectF.top = f11;
            float f12 = rectF.right;
            if (round <= f12) {
                round = f12;
            }
            rectF.right = round;
            float f13 = rectF.bottom;
            if (round2 <= f13) {
                round2 = f13;
            }
            rectF.bottom = round2;
        }
        rectF.sort();
        return rectF;
    }
}
