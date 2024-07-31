package p347y1;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p002a0.C0007d;
import p360z.C5937k;

/* renamed from: y1.d */
/* loaded from: classes.dex */
public class C5792d {

    /* renamed from: y1.d$a */
    /* loaded from: classes.dex */
    public static class a implements TypeEvaluator<C0007d.b[]> {

        /* renamed from: a */
        public C0007d.b[] f21653a;

        @Override // android.animation.TypeEvaluator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0007d.b[] evaluate(float f10, C0007d.b[] bVarArr, C0007d.b[] bVarArr2) {
            if (!C0007d.m22b(bVarArr, bVarArr2)) {
                throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
            }
            if (!C0007d.m22b(this.f21653a, bVarArr)) {
                this.f21653a = C0007d.m26f(bVarArr);
            }
            for (int i10 = 0; i10 < bVarArr.length; i10++) {
                this.f21653a[i10].m35d(bVarArr[i10], bVarArr2[i10], f10);
            }
            return this.f21653a;
        }
    }

    /* renamed from: a */
    public static Animator m23195a(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, float f10) {
        return m23196b(context, resources, theme, xmlPullParser, Xml.asAttributeSet(xmlPullParser), null, 0, f10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b8  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.animation.Animator m23196b(android.content.Context r18, android.content.res.Resources r19, android.content.res.Resources.Theme r20, org.xmlpull.v1.XmlPullParser r21, android.util.AttributeSet r22, android.animation.AnimatorSet r23, int r24, float r25) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p347y1.C5792d.m23196b(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.animation.AnimatorSet, int, float):android.animation.Animator");
    }

    /* renamed from: c */
    public static Keyframe m23197c(Keyframe keyframe, float f10) {
        return keyframe.getType() == Float.TYPE ? Keyframe.ofFloat(f10) : keyframe.getType() == Integer.TYPE ? Keyframe.ofInt(f10) : Keyframe.ofObject(f10);
    }

    /* renamed from: d */
    public static void m23198d(Keyframe[] keyframeArr, float f10, int i10, int i11) {
        float f11 = f10 / ((i11 - i10) + 2);
        while (i10 <= i11) {
            keyframeArr[i10].setFraction(keyframeArr[i10 - 1].getFraction() + f11);
            i10++;
        }
    }

    /* renamed from: e */
    public static PropertyValuesHolder m23199e(TypedArray typedArray, int i10, int i11, int i12, String str) {
        PropertyValuesHolder ofFloat;
        PropertyValuesHolder ofObject;
        TypedValue peekValue = typedArray.peekValue(i11);
        boolean z10 = peekValue != null;
        int i13 = z10 ? peekValue.type : 0;
        TypedValue peekValue2 = typedArray.peekValue(i12);
        boolean z11 = peekValue2 != null;
        int i14 = z11 ? peekValue2.type : 0;
        if (i10 == 4) {
            i10 = ((z10 && m23202h(i13)) || (z11 && m23202h(i14))) ? 3 : 0;
        }
        boolean z12 = i10 == 0;
        PropertyValuesHolder propertyValuesHolder = null;
        if (i10 != 2) {
            C5793e m23215a = i10 == 3 ? C5793e.m23215a() : null;
            if (z12) {
                if (z10) {
                    float dimension = i13 == 5 ? typedArray.getDimension(i11, 0.0f) : typedArray.getFloat(i11, 0.0f);
                    if (z11) {
                        ofFloat = PropertyValuesHolder.ofFloat(str, dimension, i14 == 5 ? typedArray.getDimension(i12, 0.0f) : typedArray.getFloat(i12, 0.0f));
                    } else {
                        ofFloat = PropertyValuesHolder.ofFloat(str, dimension);
                    }
                } else {
                    ofFloat = PropertyValuesHolder.ofFloat(str, i14 == 5 ? typedArray.getDimension(i12, 0.0f) : typedArray.getFloat(i12, 0.0f));
                }
                propertyValuesHolder = ofFloat;
            } else if (z10) {
                int dimension2 = i13 == 5 ? (int) typedArray.getDimension(i11, 0.0f) : m23202h(i13) ? typedArray.getColor(i11, 0) : typedArray.getInt(i11, 0);
                if (z11) {
                    propertyValuesHolder = PropertyValuesHolder.ofInt(str, dimension2, i14 == 5 ? (int) typedArray.getDimension(i12, 0.0f) : m23202h(i14) ? typedArray.getColor(i12, 0) : typedArray.getInt(i12, 0));
                } else {
                    propertyValuesHolder = PropertyValuesHolder.ofInt(str, dimension2);
                }
            } else if (z11) {
                propertyValuesHolder = PropertyValuesHolder.ofInt(str, i14 == 5 ? (int) typedArray.getDimension(i12, 0.0f) : m23202h(i14) ? typedArray.getColor(i12, 0) : typedArray.getInt(i12, 0));
            }
            if (propertyValuesHolder == null || m23215a == null) {
                return propertyValuesHolder;
            }
            propertyValuesHolder.setEvaluator(m23215a);
            return propertyValuesHolder;
        }
        String string = typedArray.getString(i11);
        String string2 = typedArray.getString(i12);
        C0007d.b[] m24d = C0007d.m24d(string);
        C0007d.b[] m24d2 = C0007d.m24d(string2);
        if (m24d == null && m24d2 == null) {
            return null;
        }
        if (m24d == null) {
            if (m24d2 != null) {
                return PropertyValuesHolder.ofObject(str, new a(), m24d2);
            }
            return null;
        }
        a aVar = new a();
        if (m24d2 == null) {
            ofObject = PropertyValuesHolder.ofObject(str, aVar, m24d);
        } else {
            if (!C0007d.m22b(m24d, m24d2)) {
                throw new InflateException(" Can't morph from " + string + " to " + string2);
            }
            ofObject = PropertyValuesHolder.ofObject(str, aVar, m24d, m24d2);
        }
        return ofObject;
    }

    /* renamed from: f */
    public static int m23200f(TypedArray typedArray, int i10, int i11) {
        TypedValue peekValue = typedArray.peekValue(i10);
        boolean z10 = peekValue != null;
        int i12 = z10 ? peekValue.type : 0;
        TypedValue peekValue2 = typedArray.peekValue(i11);
        boolean z11 = peekValue2 != null;
        return ((z10 && m23202h(i12)) || (z11 && m23202h(z11 ? peekValue2.type : 0))) ? 3 : 0;
    }

    /* renamed from: g */
    public static int m23201g(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray m23781k = C5937k.m23781k(resources, theme, attributeSet, C5789a.f21637j);
        int i10 = 0;
        TypedValue m23782l = C5937k.m23782l(m23781k, xmlPullParser, "value", 0);
        if ((m23782l != null) && m23202h(m23782l.type)) {
            i10 = 3;
        }
        m23781k.recycle();
        return i10;
    }

    /* renamed from: h */
    public static boolean m23202h(int i10) {
        return i10 >= 28 && i10 <= 31;
    }

    /* renamed from: i */
    public static Animator m23203i(Context context, int i10) {
        return Build.VERSION.SDK_INT >= 24 ? AnimatorInflater.loadAnimator(context, i10) : m23204j(context, context.getResources(), context.getTheme(), i10);
    }

    /* renamed from: j */
    public static Animator m23204j(Context context, Resources resources, Resources.Theme theme, int i10) {
        return m23205k(context, resources, theme, i10, 1.0f);
    }

    /* renamed from: k */
    public static Animator m23205k(Context context, Resources resources, Resources.Theme theme, int i10, float f10) {
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = resources.getAnimation(i10);
                    return m23195a(context, resources, theme, xmlResourceParser, f10);
                } catch (IOException e10) {
                    Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i10));
                    notFoundException.initCause(e10);
                    throw notFoundException;
                }
            } catch (XmlPullParserException e11) {
                Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i10));
                notFoundException2.initCause(e11);
                throw notFoundException2;
            }
        } finally {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        }
    }

    /* renamed from: l */
    public static ValueAnimator m23206l(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ValueAnimator valueAnimator, float f10, XmlPullParser xmlPullParser) {
        TypedArray m23781k = C5937k.m23781k(resources, theme, attributeSet, C5789a.f21634g);
        TypedArray m23781k2 = C5937k.m23781k(resources, theme, attributeSet, C5789a.f21638k);
        if (valueAnimator == null) {
            valueAnimator = new ValueAnimator();
        }
        m23211q(valueAnimator, m23781k, m23781k2, f10, xmlPullParser);
        int m23778h = C5937k.m23778h(m23781k, xmlPullParser, "interpolator", 0, 0);
        if (m23778h > 0) {
            valueAnimator.setInterpolator(C5791c.m23194b(context, m23778h));
        }
        m23781k.recycle();
        if (m23781k2 != null) {
            m23781k2.recycle();
        }
        return valueAnimator;
    }

    /* renamed from: m */
    public static Keyframe m23207m(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, int i10, XmlPullParser xmlPullParser) {
        TypedArray m23781k = C5937k.m23781k(resources, theme, attributeSet, C5789a.f21637j);
        float m23776f = C5937k.m23776f(m23781k, xmlPullParser, "fraction", 3, -1.0f);
        TypedValue m23782l = C5937k.m23782l(m23781k, xmlPullParser, "value", 0);
        boolean z10 = m23782l != null;
        if (i10 == 4) {
            i10 = (z10 && m23202h(m23782l.type)) ? 3 : 0;
        }
        Keyframe ofInt = z10 ? i10 != 0 ? (i10 == 1 || i10 == 3) ? Keyframe.ofInt(m23776f, C5937k.m23777g(m23781k, xmlPullParser, "value", 0, 0)) : null : Keyframe.ofFloat(m23776f, C5937k.m23776f(m23781k, xmlPullParser, "value", 0, 0.0f)) : i10 == 0 ? Keyframe.ofFloat(m23776f) : Keyframe.ofInt(m23776f);
        int m23778h = C5937k.m23778h(m23781k, xmlPullParser, "interpolator", 1, 0);
        if (m23778h > 0) {
            ofInt.setInterpolator(C5791c.m23194b(context, m23778h));
        }
        m23781k.recycle();
        return ofInt;
    }

    /* renamed from: n */
    public static ObjectAnimator m23208n(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, float f10, XmlPullParser xmlPullParser) {
        ObjectAnimator objectAnimator = new ObjectAnimator();
        m23206l(context, resources, theme, attributeSet, objectAnimator, f10, xmlPullParser);
        return objectAnimator;
    }

    /* renamed from: o */
    public static PropertyValuesHolder m23209o(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, String str, int i10) {
        int size;
        PropertyValuesHolder propertyValuesHolder = null;
        ArrayList arrayList = null;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 3 || next == 1) {
                break;
            }
            if (xmlPullParser.getName().equals("keyframe")) {
                if (i10 == 4) {
                    i10 = m23201g(resources, theme, Xml.asAttributeSet(xmlPullParser), xmlPullParser);
                }
                Keyframe m23207m = m23207m(context, resources, theme, Xml.asAttributeSet(xmlPullParser), i10, xmlPullParser);
                if (m23207m != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(m23207m);
                }
                xmlPullParser.next();
            }
        }
        if (arrayList != null && (size = arrayList.size()) > 0) {
            Keyframe keyframe = (Keyframe) arrayList.get(0);
            Keyframe keyframe2 = (Keyframe) arrayList.get(size - 1);
            float fraction = keyframe2.getFraction();
            if (fraction < 1.0f) {
                if (fraction < 0.0f) {
                    keyframe2.setFraction(1.0f);
                } else {
                    arrayList.add(arrayList.size(), m23197c(keyframe2, 1.0f));
                    size++;
                }
            }
            float fraction2 = keyframe.getFraction();
            if (fraction2 != 0.0f) {
                if (fraction2 < 0.0f) {
                    keyframe.setFraction(0.0f);
                } else {
                    arrayList.add(0, m23197c(keyframe, 0.0f));
                    size++;
                }
            }
            Keyframe[] keyframeArr = new Keyframe[size];
            arrayList.toArray(keyframeArr);
            for (int i11 = 0; i11 < size; i11++) {
                Keyframe keyframe3 = keyframeArr[i11];
                if (keyframe3.getFraction() < 0.0f) {
                    if (i11 == 0) {
                        keyframe3.setFraction(0.0f);
                    } else {
                        int i12 = size - 1;
                        if (i11 == i12) {
                            keyframe3.setFraction(1.0f);
                        } else {
                            int i13 = i11;
                            for (int i14 = i11 + 1; i14 < i12 && keyframeArr[i14].getFraction() < 0.0f; i14++) {
                                i13 = i14;
                            }
                            m23198d(keyframeArr, keyframeArr[i13 + 1].getFraction() - keyframeArr[i11 - 1].getFraction(), i11, i13);
                        }
                    }
                }
            }
            propertyValuesHolder = PropertyValuesHolder.ofKeyframe(str, keyframeArr);
            if (i10 == 3) {
                propertyValuesHolder.setEvaluator(C5793e.m23215a());
            }
        }
        return propertyValuesHolder;
    }

    /* renamed from: p */
    public static PropertyValuesHolder[] m23210p(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        int i10;
        PropertyValuesHolder[] propertyValuesHolderArr = null;
        ArrayList arrayList = null;
        while (true) {
            int eventType = xmlPullParser.getEventType();
            if (eventType == 3 || eventType == 1) {
                break;
            }
            if (eventType == 2 && xmlPullParser.getName().equals("propertyValuesHolder")) {
                TypedArray m23781k = C5937k.m23781k(resources, theme, attributeSet, C5789a.f21636i);
                String m23779i = C5937k.m23779i(m23781k, xmlPullParser, "propertyName", 3);
                int m23777g = C5937k.m23777g(m23781k, xmlPullParser, "valueType", 2, 4);
                PropertyValuesHolder m23209o = m23209o(context, resources, theme, xmlPullParser, m23779i, m23777g);
                if (m23209o == null) {
                    m23209o = m23199e(m23781k, m23777g, 0, 1, m23779i);
                }
                if (m23209o != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(m23209o);
                }
                m23781k.recycle();
            }
            xmlPullParser.next();
        }
        if (arrayList != null) {
            int size = arrayList.size();
            propertyValuesHolderArr = new PropertyValuesHolder[size];
            for (i10 = 0; i10 < size; i10++) {
                propertyValuesHolderArr[i10] = (PropertyValuesHolder) arrayList.get(i10);
            }
        }
        return propertyValuesHolderArr;
    }

    /* renamed from: q */
    public static void m23211q(ValueAnimator valueAnimator, TypedArray typedArray, TypedArray typedArray2, float f10, XmlPullParser xmlPullParser) {
        long m23777g = C5937k.m23777g(typedArray, xmlPullParser, "duration", 1, 300);
        long m23777g2 = C5937k.m23777g(typedArray, xmlPullParser, "startOffset", 2, 0);
        int m23777g3 = C5937k.m23777g(typedArray, xmlPullParser, "valueType", 7, 4);
        if (C5937k.m23780j(xmlPullParser, "valueFrom") && C5937k.m23780j(xmlPullParser, "valueTo")) {
            if (m23777g3 == 4) {
                m23777g3 = m23200f(typedArray, 5, 6);
            }
            PropertyValuesHolder m23199e = m23199e(typedArray, m23777g3, 5, 6, "");
            if (m23199e != null) {
                valueAnimator.setValues(m23199e);
            }
        }
        valueAnimator.setDuration(m23777g);
        valueAnimator.setStartDelay(m23777g2);
        valueAnimator.setRepeatCount(C5937k.m23777g(typedArray, xmlPullParser, "repeatCount", 3, 0));
        valueAnimator.setRepeatMode(C5937k.m23777g(typedArray, xmlPullParser, "repeatMode", 4, 1));
        if (typedArray2 != null) {
            m23212r(valueAnimator, typedArray2, m23777g3, f10, xmlPullParser);
        }
    }

    /* renamed from: r */
    public static void m23212r(ValueAnimator valueAnimator, TypedArray typedArray, int i10, float f10, XmlPullParser xmlPullParser) {
        ObjectAnimator objectAnimator = (ObjectAnimator) valueAnimator;
        String m23779i = C5937k.m23779i(typedArray, xmlPullParser, "pathData", 1);
        if (m23779i == null) {
            objectAnimator.setPropertyName(C5937k.m23779i(typedArray, xmlPullParser, "propertyName", 0));
            return;
        }
        String m23779i2 = C5937k.m23779i(typedArray, xmlPullParser, "propertyXName", 2);
        String m23779i3 = C5937k.m23779i(typedArray, xmlPullParser, "propertyYName", 3);
        if (i10 != 2) {
        }
        if (m23779i2 != null || m23779i3 != null) {
            m23213s(C0007d.m25e(m23779i), objectAnimator, f10 * 0.5f, m23779i2, m23779i3);
            return;
        }
        throw new InflateException(typedArray.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
    }

    /* renamed from: s */
    public static void m23213s(Path path, ObjectAnimator objectAnimator, float f10, String str, String str2) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        ArrayList arrayList = new ArrayList();
        float f11 = 0.0f;
        arrayList.add(Float.valueOf(0.0f));
        float f12 = 0.0f;
        do {
            f12 += pathMeasure.getLength();
            arrayList.add(Float.valueOf(f12));
        } while (pathMeasure.nextContour());
        PathMeasure pathMeasure2 = new PathMeasure(path, false);
        int min = Math.min(100, ((int) (f12 / f10)) + 1);
        float[] fArr = new float[min];
        float[] fArr2 = new float[min];
        float[] fArr3 = new float[2];
        float f13 = f12 / (min - 1);
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i10 >= min) {
                break;
            }
            pathMeasure2.getPosTan(f11 - ((Float) arrayList.get(i11)).floatValue(), fArr3, null);
            fArr[i10] = fArr3[0];
            fArr2[i10] = fArr3[1];
            f11 += f13;
            int i12 = i11 + 1;
            if (i12 < arrayList.size() && f11 > ((Float) arrayList.get(i12)).floatValue()) {
                pathMeasure2.nextContour();
                i11 = i12;
            }
            i10++;
        }
        PropertyValuesHolder ofFloat = str != null ? PropertyValuesHolder.ofFloat(str, fArr) : null;
        PropertyValuesHolder ofFloat2 = str2 != null ? PropertyValuesHolder.ofFloat(str2, fArr2) : null;
        if (ofFloat == null) {
            objectAnimator.setValues(ofFloat2);
        } else if (ofFloat2 == null) {
            objectAnimator.setValues(ofFloat);
        } else {
            objectAnimator.setValues(ofFloat, ofFloat2);
        }
    }
}
