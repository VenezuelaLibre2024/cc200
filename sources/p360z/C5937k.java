package p360z;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: z.k */
/* loaded from: classes.dex */
public class C5937k {
    /* renamed from: a */
    public static boolean m23771a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i10, boolean z10) {
        return !m23780j(xmlPullParser, str) ? z10 : typedArray.getBoolean(i10, z10);
    }

    /* renamed from: b */
    public static int m23772b(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i10, int i11) {
        return !m23780j(xmlPullParser, str) ? i11 : typedArray.getColor(i10, i11);
    }

    /* renamed from: c */
    public static ColorStateList m23773c(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i10) {
        if (!m23780j(xmlPullParser, str)) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(i10, typedValue);
        int i11 = typedValue.type;
        if (i11 != 2) {
            return (i11 < 28 || i11 > 31) ? C5929c.m23701d(typedArray.getResources(), typedArray.getResourceId(i10, 0), theme) : m23774d(typedValue);
        }
        throw new UnsupportedOperationException("Failed to resolve attribute at index " + i10 + ": " + typedValue);
    }

    /* renamed from: d */
    public static ColorStateList m23774d(TypedValue typedValue) {
        return ColorStateList.valueOf(typedValue.data);
    }

    /* renamed from: e */
    public static C5930d m23775e(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i10, int i11) {
        if (m23780j(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i10, typedValue);
            int i12 = typedValue.type;
            if (i12 >= 28 && i12 <= 31) {
                return C5930d.m23707b(typedValue.data);
            }
            C5930d m23710g = C5930d.m23710g(typedArray.getResources(), typedArray.getResourceId(i10, 0), theme);
            if (m23710g != null) {
                return m23710g;
            }
        }
        return C5930d.m23707b(i11);
    }

    /* renamed from: f */
    public static float m23776f(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i10, float f10) {
        return !m23780j(xmlPullParser, str) ? f10 : typedArray.getFloat(i10, f10);
    }

    /* renamed from: g */
    public static int m23777g(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i10, int i11) {
        return !m23780j(xmlPullParser, str) ? i11 : typedArray.getInt(i10, i11);
    }

    /* renamed from: h */
    public static int m23778h(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i10, int i11) {
        return !m23780j(xmlPullParser, str) ? i11 : typedArray.getResourceId(i10, i11);
    }

    /* renamed from: i */
    public static String m23779i(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i10) {
        if (m23780j(xmlPullParser, str)) {
            return typedArray.getString(i10);
        }
        return null;
    }

    /* renamed from: j */
    public static boolean m23780j(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    /* renamed from: k */
    public static TypedArray m23781k(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    /* renamed from: l */
    public static TypedValue m23782l(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i10) {
        if (m23780j(xmlPullParser, str)) {
            return typedArray.peekValue(i10);
        }
        return null;
    }
}
