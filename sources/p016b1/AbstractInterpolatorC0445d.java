package p016b1;

import android.view.animation.Interpolator;

/* renamed from: b1.d */
/* loaded from: classes.dex */
public abstract class AbstractInterpolatorC0445d implements Interpolator {

    /* renamed from: a */
    public final float[] f2141a;

    /* renamed from: b */
    public final float f2142b;

    public AbstractInterpolatorC0445d(float[] fArr) {
        this.f2141a = fArr;
        this.f2142b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f10) {
        if (f10 >= 1.0f) {
            return 1.0f;
        }
        if (f10 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f2141a;
        int min = Math.min((int) ((fArr.length - 1) * f10), fArr.length - 2);
        float f11 = this.f2142b;
        float f12 = (f10 - (min * f11)) / f11;
        float[] fArr2 = this.f2141a;
        return fArr2[min] + (f12 * (fArr2[min + 1] - fArr2[min]));
    }
}
