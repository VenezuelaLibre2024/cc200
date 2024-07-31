package p187n;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Locale;
import p089g.C1940j;
import p148k0.C3308b0;
import p176m0.C3492a;
import p188n0.InterfaceC3675b;
import p360z.C5934h;

/* renamed from: n.b0 */
/* loaded from: classes.dex */
public class C3620b0 {

    /* renamed from: a */
    public final TextView f12764a;

    /* renamed from: b */
    public C3663u0 f12765b;

    /* renamed from: c */
    public C3663u0 f12766c;

    /* renamed from: d */
    public C3663u0 f12767d;

    /* renamed from: e */
    public C3663u0 f12768e;

    /* renamed from: f */
    public C3663u0 f12769f;

    /* renamed from: g */
    public C3663u0 f12770g;

    /* renamed from: h */
    public C3663u0 f12771h;

    /* renamed from: i */
    public final C3626d0 f12772i;

    /* renamed from: j */
    public int f12773j = 0;

    /* renamed from: k */
    public int f12774k = -1;

    /* renamed from: l */
    public Typeface f12775l;

    /* renamed from: m */
    public boolean f12776m;

    /* renamed from: n.b0$a */
    /* loaded from: classes.dex */
    public class a extends C5934h.f {

        /* renamed from: a */
        public final /* synthetic */ int f12777a;

        /* renamed from: b */
        public final /* synthetic */ int f12778b;

        /* renamed from: c */
        public final /* synthetic */ WeakReference f12779c;

        public a(int i10, int i11, WeakReference weakReference) {
            this.f12777a = i10;
            this.f12778b = i11;
            this.f12779c = weakReference;
        }

        @Override // p360z.C5934h.f
        /* renamed from: h */
        public void m23764f(int i10) {
        }

        @Override // p360z.C5934h.f
        /* renamed from: i */
        public void m23765g(Typeface typeface) {
            int i10;
            if (Build.VERSION.SDK_INT >= 28 && (i10 = this.f12777a) != -1) {
                typeface = g.m13433a(typeface, i10, (this.f12778b & 2) != 0);
            }
            C3620b0.this.m13408n(this.f12779c, typeface);
        }
    }

    /* renamed from: n.b0$b */
    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: h */
        public final /* synthetic */ TextView f12781h;

        /* renamed from: i */
        public final /* synthetic */ Typeface f12782i;

        /* renamed from: j */
        public final /* synthetic */ int f12783j;

        public b(TextView textView, Typeface typeface, int i10) {
            this.f12781h = textView;
            this.f12782i = typeface;
            this.f12783j = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f12781h.setTypeface(this.f12782i, this.f12783j);
        }
    }

    /* renamed from: n.b0$c */
    /* loaded from: classes.dex */
    public static class c {
        /* renamed from: a */
        public static Drawable[] m13423a(TextView textView) {
            return textView.getCompoundDrawablesRelative();
        }

        /* renamed from: b */
        public static void m13424b(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }

        /* renamed from: c */
        public static void m13425c(TextView textView, Locale locale) {
            textView.setTextLocale(locale);
        }
    }

    /* renamed from: n.b0$d */
    /* loaded from: classes.dex */
    public static class d {
        /* renamed from: a */
        public static Locale m13426a(String str) {
            return Locale.forLanguageTag(str);
        }
    }

    /* renamed from: n.b0$e */
    /* loaded from: classes.dex */
    public static class e {
        /* renamed from: a */
        public static LocaleList m13427a(String str) {
            return LocaleList.forLanguageTags(str);
        }

        /* renamed from: b */
        public static void m13428b(TextView textView, LocaleList localeList) {
            textView.setTextLocales(localeList);
        }
    }

    /* renamed from: n.b0$f */
    /* loaded from: classes.dex */
    public static class f {
        /* renamed from: a */
        public static int m13429a(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        /* renamed from: b */
        public static void m13430b(TextView textView, int i10, int i11, int i12, int i13) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
        }

        /* renamed from: c */
        public static void m13431c(TextView textView, int[] iArr, int i10) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
        }

        /* renamed from: d */
        public static boolean m13432d(TextView textView, String str) {
            return textView.setFontVariationSettings(str);
        }
    }

    /* renamed from: n.b0$g */
    /* loaded from: classes.dex */
    public static class g {
        /* renamed from: a */
        public static Typeface m13433a(Typeface typeface, int i10, boolean z10) {
            return Typeface.create(typeface, i10, z10);
        }
    }

    public C3620b0(TextView textView) {
        this.f12764a = textView;
        this.f12772i = new C3626d0(textView);
    }

    /* renamed from: d */
    public static C3663u0 m13392d(Context context, C3640j c3640j, int i10) {
        ColorStateList m13547f = c3640j.m13547f(context, i10);
        if (m13547f == null) {
            return null;
        }
        C3663u0 c3663u0 = new C3663u0();
        c3663u0.f13042d = true;
        c3663u0.f13039a = m13547f;
        return c3663u0;
    }

    /* renamed from: A */
    public void m13393A(int i10, float f10) {
        if (InterfaceC3675b.f13116f || m13406l()) {
            return;
        }
        m13394B(i10, f10);
    }

    /* renamed from: B */
    public final void m13394B(int i10, float f10) {
        this.f12772i.m13487w(i10, f10);
    }

    /* renamed from: C */
    public final void m13395C(Context context, C3667w0 c3667w0) {
        String m13731n;
        Typeface create;
        Typeface typeface;
        this.f12773j = c3667w0.m13727j(C1940j.f7540H2, this.f12773j);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            int m13727j = c3667w0.m13727j(C1940j.f7560M2, -1);
            this.f12774k = m13727j;
            if (m13727j != -1) {
                this.f12773j = (this.f12773j & 2) | 0;
            }
        }
        int i11 = C1940j.f7556L2;
        if (!c3667w0.m13735r(i11) && !c3667w0.m13735r(C1940j.f7564N2)) {
            int i12 = C1940j.f7536G2;
            if (c3667w0.m13735r(i12)) {
                this.f12776m = false;
                int m13727j2 = c3667w0.m13727j(i12, 1);
                if (m13727j2 == 1) {
                    typeface = Typeface.SANS_SERIF;
                } else if (m13727j2 == 2) {
                    typeface = Typeface.SERIF;
                } else if (m13727j2 != 3) {
                    return;
                } else {
                    typeface = Typeface.MONOSPACE;
                }
                this.f12775l = typeface;
                return;
            }
            return;
        }
        this.f12775l = null;
        int i13 = C1940j.f7564N2;
        if (c3667w0.m13735r(i13)) {
            i11 = i13;
        }
        int i14 = this.f12774k;
        int i15 = this.f12773j;
        if (!context.isRestricted()) {
            try {
                Typeface m13726i = c3667w0.m13726i(i11, this.f12773j, new a(i14, i15, new WeakReference(this.f12764a)));
                if (m13726i != null) {
                    if (i10 >= 28 && this.f12774k != -1) {
                        m13726i = g.m13433a(Typeface.create(m13726i, 0), this.f12774k, (this.f12773j & 2) != 0);
                    }
                    this.f12775l = m13726i;
                }
                this.f12776m = this.f12775l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f12775l != null || (m13731n = c3667w0.m13731n(i11)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f12774k == -1) {
            create = Typeface.create(m13731n, this.f12773j);
        } else {
            create = g.m13433a(Typeface.create(m13731n, 0), this.f12774k, (this.f12773j & 2) != 0);
        }
        this.f12775l = create;
    }

    /* renamed from: a */
    public final void m13396a(Drawable drawable, C3663u0 c3663u0) {
        if (drawable == null || c3663u0 == null) {
            return;
        }
        C3640j.m13544i(drawable, c3663u0, this.f12764a.getDrawableState());
    }

    /* renamed from: b */
    public void m13397b() {
        if (this.f12765b != null || this.f12766c != null || this.f12767d != null || this.f12768e != null) {
            Drawable[] compoundDrawables = this.f12764a.getCompoundDrawables();
            m13396a(compoundDrawables[0], this.f12765b);
            m13396a(compoundDrawables[1], this.f12766c);
            m13396a(compoundDrawables[2], this.f12767d);
            m13396a(compoundDrawables[3], this.f12768e);
        }
        if (Build.VERSION.SDK_INT >= 17) {
            if (this.f12769f == null && this.f12770g == null) {
                return;
            }
            Drawable[] m13423a = c.m13423a(this.f12764a);
            m13396a(m13423a[0], this.f12769f);
            m13396a(m13423a[2], this.f12770g);
        }
    }

    /* renamed from: c */
    public void m13398c() {
        this.f12772i.m13469b();
    }

    /* renamed from: e */
    public int m13399e() {
        return this.f12772i.m13475h();
    }

    /* renamed from: f */
    public int m13400f() {
        return this.f12772i.m13476i();
    }

    /* renamed from: g */
    public int m13401g() {
        return this.f12772i.m13477j();
    }

    /* renamed from: h */
    public int[] m13402h() {
        return this.f12772i.m13478k();
    }

    /* renamed from: i */
    public int m13403i() {
        return this.f12772i.m13479l();
    }

    /* renamed from: j */
    public ColorStateList m13404j() {
        C3663u0 c3663u0 = this.f12771h;
        if (c3663u0 != null) {
            return c3663u0.f13039a;
        }
        return null;
    }

    /* renamed from: k */
    public PorterDuff.Mode m13405k() {
        C3663u0 c3663u0 = this.f12771h;
        if (c3663u0 != null) {
            return c3663u0.f13040b;
        }
        return null;
    }

    /* renamed from: l */
    public boolean m13406l() {
        return this.f12772i.m13481q();
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:145:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01c5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01e9  */
    @android.annotation.SuppressLint({"NewApi"})
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m13407m(android.util.AttributeSet r24, int r25) {
        /*
            Method dump skipped, instructions count: 792
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p187n.C3620b0.m13407m(android.util.AttributeSet, int):void");
    }

    /* renamed from: n */
    public void m13408n(WeakReference<TextView> weakReference, Typeface typeface) {
        if (this.f12776m) {
            this.f12775l = typeface;
            TextView textView = weakReference.get();
            if (textView != null) {
                if (C3308b0.m11992F(textView)) {
                    textView.post(new b(textView, typeface, this.f12773j));
                } else {
                    textView.setTypeface(typeface, this.f12773j);
                }
            }
        }
    }

    /* renamed from: o */
    public void m13409o(boolean z10, int i10, int i11, int i12, int i13) {
        if (InterfaceC3675b.f13116f) {
            return;
        }
        m13398c();
    }

    /* renamed from: p */
    public void m13410p() {
        m13397b();
    }

    /* renamed from: q */
    public void m13411q(Context context, int i10) {
        String m13731n;
        ColorStateList m13720c;
        ColorStateList m13720c2;
        ColorStateList m13720c3;
        C3667w0 m13715s = C3667w0.m13715s(context, i10, C1940j.f7526E2);
        int i11 = C1940j.f7572P2;
        if (m13715s.m13735r(i11)) {
            m13413s(m13715s.m13718a(i11, false));
        }
        int i12 = Build.VERSION.SDK_INT;
        if (i12 < 23) {
            int i13 = C1940j.f7544I2;
            if (m13715s.m13735r(i13) && (m13720c3 = m13715s.m13720c(i13)) != null) {
                this.f12764a.setTextColor(m13720c3);
            }
            int i14 = C1940j.f7552K2;
            if (m13715s.m13735r(i14) && (m13720c2 = m13715s.m13720c(i14)) != null) {
                this.f12764a.setLinkTextColor(m13720c2);
            }
            int i15 = C1940j.f7548J2;
            if (m13715s.m13735r(i15) && (m13720c = m13715s.m13720c(i15)) != null) {
                this.f12764a.setHintTextColor(m13720c);
            }
        }
        int i16 = C1940j.f7531F2;
        if (m13715s.m13735r(i16) && m13715s.m13722e(i16, -1) == 0) {
            this.f12764a.setTextSize(0, 0.0f);
        }
        m13395C(context, m13715s);
        if (i12 >= 26) {
            int i17 = C1940j.f7568O2;
            if (m13715s.m13735r(i17) && (m13731n = m13715s.m13731n(i17)) != null) {
                f.m13432d(this.f12764a, m13731n);
            }
        }
        m13715s.m13736v();
        Typeface typeface = this.f12775l;
        if (typeface != null) {
            this.f12764a.setTypeface(typeface, this.f12773j);
        }
    }

    /* renamed from: r */
    public void m13412r(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 30 || inputConnection == null) {
            return;
        }
        C3492a.m12991f(editorInfo, textView.getText());
    }

    /* renamed from: s */
    public void m13413s(boolean z10) {
        this.f12764a.setAllCaps(z10);
    }

    /* renamed from: t */
    public void m13414t(int i10, int i11, int i12, int i13) {
        this.f12772i.m13483s(i10, i11, i12, i13);
    }

    /* renamed from: u */
    public void m13415u(int[] iArr, int i10) {
        this.f12772i.m13484t(iArr, i10);
    }

    /* renamed from: v */
    public void m13416v(int i10) {
        this.f12772i.m13485u(i10);
    }

    /* renamed from: w */
    public void m13417w(ColorStateList colorStateList) {
        if (this.f12771h == null) {
            this.f12771h = new C3663u0();
        }
        C3663u0 c3663u0 = this.f12771h;
        c3663u0.f13039a = colorStateList;
        c3663u0.f13042d = colorStateList != null;
        m13420z();
    }

    /* renamed from: x */
    public void m13418x(PorterDuff.Mode mode) {
        if (this.f12771h == null) {
            this.f12771h = new C3663u0();
        }
        C3663u0 c3663u0 = this.f12771h;
        c3663u0.f13040b = mode;
        c3663u0.f13041c = mode != null;
        m13420z();
    }

    /* renamed from: y */
    public final void m13419y(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 17 && (drawable5 != null || drawable6 != null)) {
            Drawable[] m13423a = c.m13423a(this.f12764a);
            TextView textView = this.f12764a;
            if (drawable5 == null) {
                drawable5 = m13423a[0];
            }
            if (drawable2 == null) {
                drawable2 = m13423a[1];
            }
            if (drawable6 == null) {
                drawable6 = m13423a[2];
            }
            if (drawable4 == null) {
                drawable4 = m13423a[3];
            }
            c.m13424b(textView, drawable5, drawable2, drawable6, drawable4);
            return;
        }
        if (drawable == null && drawable2 == null && drawable3 == null && drawable4 == null) {
            return;
        }
        if (i10 >= 17) {
            Drawable[] m13423a2 = c.m13423a(this.f12764a);
            if (m13423a2[0] != null || m13423a2[2] != null) {
                TextView textView2 = this.f12764a;
                Drawable drawable7 = m13423a2[0];
                if (drawable2 == null) {
                    drawable2 = m13423a2[1];
                }
                Drawable drawable8 = m13423a2[2];
                if (drawable4 == null) {
                    drawable4 = m13423a2[3];
                }
                c.m13424b(textView2, drawable7, drawable2, drawable8, drawable4);
                return;
            }
        }
        Drawable[] compoundDrawables = this.f12764a.getCompoundDrawables();
        TextView textView3 = this.f12764a;
        if (drawable == null) {
            drawable = compoundDrawables[0];
        }
        if (drawable2 == null) {
            drawable2 = compoundDrawables[1];
        }
        if (drawable3 == null) {
            drawable3 = compoundDrawables[2];
        }
        if (drawable4 == null) {
            drawable4 = compoundDrawables[3];
        }
        textView3.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    /* renamed from: z */
    public final void m13420z() {
        C3663u0 c3663u0 = this.f12771h;
        this.f12765b = c3663u0;
        this.f12766c = c3663u0;
        this.f12767d = c3663u0;
        this.f12768e = c3663u0;
        this.f12769f = c3663u0;
        this.f12770g = c3663u0;
    }
}
