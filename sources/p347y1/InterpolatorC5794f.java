package p347y1;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.animation.Interpolator;
import org.xmlpull.v1.XmlPullParser;
import p002a0.C0007d;
import p360z.C5937k;

/* renamed from: y1.f */
/* loaded from: classes.dex */
public class InterpolatorC5794f implements Interpolator {

    /* renamed from: a */
    public float[] f21655a;

    /* renamed from: b */
    public float[] f21656b;

    public InterpolatorC5794f(Context context, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        this(context.getResources(), context.getTheme(), attributeSet, xmlPullParser);
    }

    public InterpolatorC5794f(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray m23781k = C5937k.m23781k(resources, theme, attributeSet, C5789a.f21639l);
        m23219d(m23781k, xmlPullParser);
        m23781k.recycle();
    }

    /* renamed from: a */
    public final void m23216a(float f10, float f11, float f12, float f13) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(f10, f11, f12, f13, 1.0f, 1.0f);
        m23217b(path);
    }

    /* renamed from: b */
    public final void m23217b(Path path) {
        int i10 = 0;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int min = Math.min(3000, ((int) (length / 0.002f)) + 1);
        if (min <= 0) {
            throw new IllegalArgumentException("The Path has a invalid length " + length);
        }
        this.f21655a = new float[min];
        this.f21656b = new float[min];
        float[] fArr = new float[2];
        for (int i11 = 0; i11 < min; i11++) {
            pathMeasure.getPosTan((i11 * length) / (min - 1), fArr, null);
            this.f21655a[i11] = fArr[0];
            this.f21656b[i11] = fArr[1];
        }
        if (Math.abs(this.f21655a[0]) <= 1.0E-5d && Math.abs(this.f21656b[0]) <= 1.0E-5d) {
            int i12 = min - 1;
            if (Math.abs(this.f21655a[i12] - 1.0f) <= 1.0E-5d && Math.abs(this.f21656b[i12] - 1.0f) <= 1.0E-5d) {
                float f10 = 0.0f;
                int i13 = 0;
                while (i10 < min) {
                    float[] fArr2 = this.f21655a;
                    int i14 = i13 + 1;
                    float f11 = fArr2[i13];
                    if (f11 < f10) {
                        throw new IllegalArgumentException("The Path cannot loop back on itself, x :" + f11);
                    }
                    fArr2[i10] = f11;
                    i10++;
                    f10 = f11;
                    i13 = i14;
                }
                if (pathMeasure.nextContour()) {
                    throw new IllegalArgumentException("The Path should be continuous, can't have 2+ contours");
                }
                return;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("The Path must start at (0,0) and end at (1,1) start: ");
        sb2.append(this.f21655a[0]);
        sb2.append(",");
        sb2.append(this.f21656b[0]);
        sb2.append(" end:");
        int i15 = min - 1;
        sb2.append(this.f21655a[i15]);
        sb2.append(",");
        sb2.append(this.f21656b[i15]);
        throw new IllegalArgumentException(sb2.toString());
    }

    /* renamed from: c */
    public final void m23218c(float f10, float f11) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.quadTo(f10, f11, 1.0f, 1.0f);
        m23217b(path);
    }

    /* renamed from: d */
    public final void m23219d(TypedArray typedArray, XmlPullParser xmlPullParser) {
        if (C5937k.m23780j(xmlPullParser, "pathData")) {
            String m23779i = C5937k.m23779i(typedArray, xmlPullParser, "pathData", 4);
            Path m25e = C0007d.m25e(m23779i);
            if (m25e != null) {
                m23217b(m25e);
                return;
            }
            throw new InflateException("The path is null, which is created from " + m23779i);
        }
        if (!C5937k.m23780j(xmlPullParser, "controlX1")) {
            throw new InflateException("pathInterpolator requires the controlX1 attribute");
        }
        if (!C5937k.m23780j(xmlPullParser, "controlY1")) {
            throw new InflateException("pathInterpolator requires the controlY1 attribute");
        }
        float m23776f = C5937k.m23776f(typedArray, xmlPullParser, "controlX1", 0, 0.0f);
        float m23776f2 = C5937k.m23776f(typedArray, xmlPullParser, "controlY1", 1, 0.0f);
        boolean m23780j = C5937k.m23780j(xmlPullParser, "controlX2");
        if (m23780j != C5937k.m23780j(xmlPullParser, "controlY2")) {
            throw new InflateException("pathInterpolator requires both controlX2 and controlY2 for cubic Beziers.");
        }
        if (m23780j) {
            m23216a(m23776f, m23776f2, C5937k.m23776f(typedArray, xmlPullParser, "controlX2", 2, 0.0f), C5937k.m23776f(typedArray, xmlPullParser, "controlY2", 3, 0.0f));
        } else {
            m23218c(m23776f, m23776f2);
        }
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f10) {
        if (f10 <= 0.0f) {
            return 0.0f;
        }
        if (f10 >= 1.0f) {
            return 1.0f;
        }
        int i10 = 0;
        int length = this.f21655a.length - 1;
        while (length - i10 > 1) {
            int i11 = (i10 + length) / 2;
            if (f10 < this.f21655a[i11]) {
                length = i11;
            } else {
                i10 = i11;
            }
        }
        float[] fArr = this.f21655a;
        float f11 = fArr[length] - fArr[i10];
        if (f11 == 0.0f) {
            return this.f21656b[i10];
        }
        float f12 = (f10 - fArr[i10]) / f11;
        float[] fArr2 = this.f21656b;
        float f13 = fArr2[i10];
        return f13 + (f12 * (fArr2[length] - f13));
    }
}
