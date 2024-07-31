package p360z;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import io.flutter.plugins.imagepicker.ImagePickerCache;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p313w.C5190i;

/* renamed from: z.f */
/* loaded from: classes.dex */
public final class C5932f {

    /* renamed from: z.f$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final int[] f22052a;

        /* renamed from: b */
        public final float[] f22053b;

        public a(int i10, int i11) {
            this.f22052a = new int[]{i10, i11};
            this.f22053b = new float[]{0.0f, 1.0f};
        }

        public a(int i10, int i11, int i12) {
            this.f22052a = new int[]{i10, i11, i12};
            this.f22053b = new float[]{0.0f, 0.5f, 1.0f};
        }

        public a(List<Integer> list, List<Float> list2) {
            int size = list.size();
            this.f22052a = new int[size];
            this.f22053b = new float[size];
            for (int i10 = 0; i10 < size; i10++) {
                this.f22052a[i10] = list.get(i10).intValue();
                this.f22053b[i10] = list2.get(i10).floatValue();
            }
        }
    }

    /* renamed from: a */
    public static a m23738a(a aVar, int i10, int i11, boolean z10, int i12) {
        return aVar != null ? aVar : z10 ? new a(i10, i12, i11) : new a(i10, i11);
    }

    /* renamed from: b */
    public static Shader m23739b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        String name = xmlPullParser.getName();
        if (!name.equals("gradient")) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid gradient color tag " + name);
        }
        TypedArray m23781k = C5937k.m23781k(resources, theme, attributeSet, C5190i.f19670A);
        float m23776f = C5937k.m23776f(m23781k, xmlPullParser, "startX", C5190i.f19679J, 0.0f);
        float m23776f2 = C5937k.m23776f(m23781k, xmlPullParser, "startY", C5190i.f19680K, 0.0f);
        float m23776f3 = C5937k.m23776f(m23781k, xmlPullParser, "endX", C5190i.f19681L, 0.0f);
        float m23776f4 = C5937k.m23776f(m23781k, xmlPullParser, "endY", C5190i.f19682M, 0.0f);
        float m23776f5 = C5937k.m23776f(m23781k, xmlPullParser, "centerX", C5190i.f19674E, 0.0f);
        float m23776f6 = C5937k.m23776f(m23781k, xmlPullParser, "centerY", C5190i.f19675F, 0.0f);
        int m23777g = C5937k.m23777g(m23781k, xmlPullParser, ImagePickerCache.MAP_KEY_TYPE, C5190i.f19673D, 0);
        int m23772b = C5937k.m23772b(m23781k, xmlPullParser, "startColor", C5190i.f19671B, 0);
        boolean m23780j = C5937k.m23780j(xmlPullParser, "centerColor");
        int m23772b2 = C5937k.m23772b(m23781k, xmlPullParser, "centerColor", C5190i.f19678I, 0);
        int m23772b3 = C5937k.m23772b(m23781k, xmlPullParser, "endColor", C5190i.f19672C, 0);
        int m23777g2 = C5937k.m23777g(m23781k, xmlPullParser, "tileMode", C5190i.f19677H, 0);
        float m23776f7 = C5937k.m23776f(m23781k, xmlPullParser, "gradientRadius", C5190i.f19676G, 0.0f);
        m23781k.recycle();
        a m23738a = m23738a(m23740c(resources, xmlPullParser, attributeSet, theme), m23772b, m23772b3, m23780j, m23772b2);
        if (m23777g != 1) {
            return m23777g != 2 ? new LinearGradient(m23776f, m23776f2, m23776f3, m23776f4, m23738a.f22052a, m23738a.f22053b, m23741d(m23777g2)) : new SweepGradient(m23776f5, m23776f6, m23738a.f22052a, m23738a.f22053b);
        }
        if (m23776f7 > 0.0f) {
            return new RadialGradient(m23776f5, m23776f6, m23776f7, m23738a.f22052a, m23738a.f22053b, m23741d(m23777g2));
        }
        throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0080, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(r10.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p360z.C5932f.a m23740c(android.content.res.Resources r9, org.xmlpull.v1.XmlPullParser r10, android.util.AttributeSet r11, android.content.res.Resources.Theme r12) {
        /*
            int r0 = r10.getDepth()
            r1 = 1
            int r0 = r0 + r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 20
            r2.<init>(r3)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r3)
        L12:
            int r3 = r10.next()
            if (r3 == r1) goto L81
            int r5 = r10.getDepth()
            if (r5 >= r0) goto L21
            r6 = 3
            if (r3 == r6) goto L81
        L21:
            r6 = 2
            if (r3 == r6) goto L25
            goto L12
        L25:
            if (r5 > r0) goto L12
            java.lang.String r3 = r10.getName()
            java.lang.String r5 = "item"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L34
            goto L12
        L34:
            int[] r3 = p313w.C5190i.f19683N
            android.content.res.TypedArray r3 = p360z.C5937k.m23781k(r9, r12, r11, r3)
            int r5 = p313w.C5190i.f19684O
            boolean r6 = r3.hasValue(r5)
            int r7 = p313w.C5190i.f19685P
            boolean r8 = r3.hasValue(r7)
            if (r6 == 0) goto L66
            if (r8 == 0) goto L66
            r6 = 0
            int r5 = r3.getColor(r5, r6)
            r6 = 0
            float r6 = r3.getFloat(r7, r6)
            r3.recycle()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r4.add(r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r6)
            r2.add(r3)
            goto L12
        L66:
            org.xmlpull.v1.XmlPullParserException r9 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r10 = r10.getPositionDescription()
            r11.append(r10)
            java.lang.String r10 = ": <item> tag requires a 'color' attribute and a 'offset' attribute!"
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            r9.<init>(r10)
            throw r9
        L81:
            int r9 = r4.size()
            if (r9 <= 0) goto L8d
            z.f$a r9 = new z.f$a
            r9.<init>(r4, r2)
            return r9
        L8d:
            r9 = 0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p360z.C5932f.m23740c(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):z.f$a");
    }

    /* renamed from: d */
    public static Shader.TileMode m23741d(int i10) {
        return i10 != 1 ? i10 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT;
    }
}
