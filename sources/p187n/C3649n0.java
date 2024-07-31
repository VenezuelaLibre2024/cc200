package p187n;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p015b0.C0436a;
import p132j.C3198a;
import p147k.C3302c;
import p147k.C3303d;
import p285u.C4774d;
import p285u.C4775e;
import p285u.C4777g;
import p285u.C4778h;
import p345y.C5782a;
import p347y1.C5790b;
import p347y1.C5796h;

/* renamed from: n.n0 */
/* loaded from: classes.dex */
public final class C3649n0 {

    /* renamed from: i */
    public static C3649n0 f12964i;

    /* renamed from: a */
    public WeakHashMap<Context, C4778h<ColorStateList>> f12966a;

    /* renamed from: b */
    public C4777g<String, e> f12967b;

    /* renamed from: c */
    public C4778h<String> f12968c;

    /* renamed from: d */
    public final WeakHashMap<Context, C4774d<WeakReference<Drawable.ConstantState>>> f12969d = new WeakHashMap<>(0);

    /* renamed from: e */
    public TypedValue f12970e;

    /* renamed from: f */
    public boolean f12971f;

    /* renamed from: g */
    public f f12972g;

    /* renamed from: h */
    public static final PorterDuff.Mode f12963h = PorterDuff.Mode.SRC_IN;

    /* renamed from: j */
    public static final c f12965j = new c(6);

    /* renamed from: n.n0$a */
    /* loaded from: classes.dex */
    public static class a implements e {
        @Override // p187n.C3649n0.e
        /* renamed from: a */
        public Drawable mo13645a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return C3198a.m11331m(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e10) {
                Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e10);
                return null;
            }
        }
    }

    /* renamed from: n.n0$b */
    /* loaded from: classes.dex */
    public static class b implements e {
        @Override // p187n.C3649n0.e
        /* renamed from: a */
        public Drawable mo13645a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return C5790b.m23189a(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e10) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e10);
                return null;
            }
        }
    }

    /* renamed from: n.n0$c */
    /* loaded from: classes.dex */
    public static class c extends C4775e<Integer, PorterDuffColorFilter> {
        public c(int i10) {
            super(i10);
        }

        /* renamed from: a */
        public static int m13646a(int i10, PorterDuff.Mode mode) {
            return ((i10 + 31) * 31) + mode.hashCode();
        }

        /* renamed from: b */
        public PorterDuffColorFilter m13647b(int i10, PorterDuff.Mode mode) {
            return get(Integer.valueOf(m13646a(i10, mode)));
        }

        /* renamed from: c */
        public PorterDuffColorFilter m13648c(int i10, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return put(Integer.valueOf(m13646a(i10, mode)), porterDuffColorFilter);
        }
    }

    /* renamed from: n.n0$d */
    /* loaded from: classes.dex */
    public static class d implements e {
        @Override // p187n.C3649n0.e
        /* renamed from: a */
        public Drawable mo13645a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            String classAttribute = attributeSet.getClassAttribute();
            if (classAttribute != null) {
                try {
                    Drawable drawable = (Drawable) d.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    if (Build.VERSION.SDK_INT >= 21) {
                        C3302c.m11963c(drawable, context.getResources(), xmlPullParser, attributeSet, theme);
                    } else {
                        drawable.inflate(context.getResources(), xmlPullParser, attributeSet);
                    }
                    return drawable;
                } catch (Exception e10) {
                    Log.e("DrawableDelegate", "Exception while inflating <drawable>", e10);
                }
            }
            return null;
        }
    }

    /* renamed from: n.n0$e */
    /* loaded from: classes.dex */
    public interface e {
        /* renamed from: a */
        Drawable mo13645a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    /* renamed from: n.n0$f */
    /* loaded from: classes.dex */
    public interface f {
        /* renamed from: a */
        Drawable mo13549a(C3649n0 c3649n0, Context context, int i10);

        /* renamed from: b */
        boolean mo13550b(Context context, int i10, Drawable drawable);

        /* renamed from: c */
        PorterDuff.Mode mo13551c(int i10);

        /* renamed from: d */
        ColorStateList mo13552d(Context context, int i10);

        /* renamed from: e */
        boolean mo13553e(Context context, int i10, Drawable drawable);
    }

    /* renamed from: n.n0$g */
    /* loaded from: classes.dex */
    public static class g implements e {
        @Override // p187n.C3649n0.e
        /* renamed from: a */
        public Drawable mo13645a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return C5796h.m23222c(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e10) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e10);
                return null;
            }
        }
    }

    /* renamed from: e */
    public static long m13621e(TypedValue typedValue) {
        return (typedValue.assetCookie << 32) | typedValue.data;
    }

    /* renamed from: g */
    public static PorterDuffColorFilter m13622g(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return m13624l(colorStateList.getColorForState(iArr, 0), mode);
    }

    /* renamed from: h */
    public static synchronized C3649n0 m13623h() {
        C3649n0 c3649n0;
        synchronized (C3649n0.class) {
            if (f12964i == null) {
                C3649n0 c3649n02 = new C3649n0();
                f12964i = c3649n02;
                m13625p(c3649n02);
            }
            c3649n0 = f12964i;
        }
        return c3649n0;
    }

    /* renamed from: l */
    public static synchronized PorterDuffColorFilter m13624l(int i10, PorterDuff.Mode mode) {
        PorterDuffColorFilter m13647b;
        synchronized (C3649n0.class) {
            c cVar = f12965j;
            m13647b = cVar.m13647b(i10, mode);
            if (m13647b == null) {
                m13647b = new PorterDuffColorFilter(i10, mode);
                cVar.m13648c(i10, mode, m13647b);
            }
        }
        return m13647b;
    }

    /* renamed from: p */
    public static void m13625p(C3649n0 c3649n0) {
        if (Build.VERSION.SDK_INT < 24) {
            c3649n0.m13628a("vector", new g());
            c3649n0.m13628a("animated-vector", new b());
            c3649n0.m13628a("animated-selector", new a());
            c3649n0.m13628a("drawable", new d());
        }
    }

    /* renamed from: q */
    public static boolean m13626q(Drawable drawable) {
        return (drawable instanceof C5796h) || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName());
    }

    /* renamed from: w */
    public static void m13627w(Drawable drawable, C3663u0 c3663u0, int[] iArr) {
        int[] state = drawable.getState();
        if (C3637h0.m13511a(drawable)) {
            if (!(drawable.mutate() == drawable)) {
                Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
                return;
            }
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z10 = c3663u0.f13042d;
        if (z10 || c3663u0.f13041c) {
            drawable.setColorFilter(m13622g(z10 ? c3663u0.f13039a : null, c3663u0.f13041c ? c3663u0.f13040b : f12963h, iArr));
        } else {
            drawable.clearColorFilter();
        }
        if (Build.VERSION.SDK_INT <= 23) {
            drawable.invalidateSelf();
        }
    }

    /* renamed from: a */
    public final void m13628a(String str, e eVar) {
        if (this.f12967b == null) {
            this.f12967b = new C4777g<>();
        }
        this.f12967b.put(str, eVar);
    }

    /* renamed from: b */
    public final synchronized boolean m13629b(Context context, long j10, Drawable drawable) {
        boolean z10;
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            C4774d<WeakReference<Drawable.ConstantState>> c4774d = this.f12969d.get(context);
            if (c4774d == null) {
                c4774d = new C4774d<>();
                this.f12969d.put(context, c4774d);
            }
            c4774d.m18738l(j10, new WeakReference<>(constantState));
            z10 = true;
        } else {
            z10 = false;
        }
        return z10;
    }

    /* renamed from: c */
    public final void m13630c(Context context, int i10, ColorStateList colorStateList) {
        if (this.f12966a == null) {
            this.f12966a = new WeakHashMap<>();
        }
        C4778h<ColorStateList> c4778h = this.f12966a.get(context);
        if (c4778h == null) {
            c4778h = new C4778h<>();
            this.f12966a.put(context, c4778h);
        }
        c4778h.m18766b(i10, colorStateList);
    }

    /* renamed from: d */
    public final void m13631d(Context context) {
        if (this.f12971f) {
            return;
        }
        this.f12971f = true;
        Drawable m13634j = m13634j(context, C3303d.f11508a);
        if (m13634j == null || !m13626q(m13634j)) {
            this.f12971f = false;
            throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
        }
    }

    /* renamed from: f */
    public final Drawable m13632f(Context context, int i10) {
        if (this.f12970e == null) {
            this.f12970e = new TypedValue();
        }
        TypedValue typedValue = this.f12970e;
        context.getResources().getValue(i10, typedValue, true);
        long m13621e = m13621e(typedValue);
        Drawable m13633i = m13633i(context, m13621e);
        if (m13633i != null) {
            return m13633i;
        }
        f fVar = this.f12972g;
        Drawable mo13549a = fVar == null ? null : fVar.mo13549a(this, context, i10);
        if (mo13549a != null) {
            mo13549a.setChangingConfigurations(typedValue.changingConfigurations);
            m13629b(context, m13621e, mo13549a);
        }
        return mo13549a;
    }

    /* renamed from: i */
    public final synchronized Drawable m13633i(Context context, long j10) {
        C4774d<WeakReference<Drawable.ConstantState>> c4774d = this.f12969d.get(context);
        if (c4774d == null) {
            return null;
        }
        WeakReference<Drawable.ConstantState> m18734g = c4774d.m18734g(j10);
        if (m18734g != null) {
            Drawable.ConstantState constantState = m18734g.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            c4774d.m18739m(j10);
        }
        return null;
    }

    /* renamed from: j */
    public synchronized Drawable m13634j(Context context, int i10) {
        return m13635k(context, i10, false);
    }

    /* renamed from: k */
    public synchronized Drawable m13635k(Context context, int i10, boolean z10) {
        Drawable m13639r;
        m13631d(context);
        m13639r = m13639r(context, i10);
        if (m13639r == null) {
            m13639r = m13632f(context, i10);
        }
        if (m13639r == null) {
            m13639r = C5782a.getDrawable(context, i10);
        }
        if (m13639r != null) {
            m13639r = m13643v(context, i10, z10, m13639r);
        }
        if (m13639r != null) {
            C3637h0.m13512b(m13639r);
        }
        return m13639r;
    }

    /* renamed from: m */
    public synchronized ColorStateList m13636m(Context context, int i10) {
        ColorStateList m13637n;
        m13637n = m13637n(context, i10);
        if (m13637n == null) {
            f fVar = this.f12972g;
            m13637n = fVar == null ? null : fVar.mo13552d(context, i10);
            if (m13637n != null) {
                m13630c(context, i10, m13637n);
            }
        }
        return m13637n;
    }

    /* renamed from: n */
    public final ColorStateList m13637n(Context context, int i10) {
        C4778h<ColorStateList> c4778h;
        WeakHashMap<Context, C4778h<ColorStateList>> weakHashMap = this.f12966a;
        if (weakHashMap == null || (c4778h = weakHashMap.get(context)) == null) {
            return null;
        }
        return c4778h.m18770g(i10);
    }

    /* renamed from: o */
    public PorterDuff.Mode m13638o(int i10) {
        f fVar = this.f12972g;
        if (fVar == null) {
            return null;
        }
        return fVar.mo13551c(i10);
    }

    /* renamed from: r */
    public final Drawable m13639r(Context context, int i10) {
        int next;
        C4777g<String, e> c4777g = this.f12967b;
        if (c4777g == null || c4777g.isEmpty()) {
            return null;
        }
        C4778h<String> c4778h = this.f12968c;
        if (c4778h != null) {
            String m18770g = c4778h.m18770g(i10);
            if ("appcompat_skip_skip".equals(m18770g) || (m18770g != null && this.f12967b.get(m18770g) == null)) {
                return null;
            }
        } else {
            this.f12968c = new C4778h<>();
        }
        if (this.f12970e == null) {
            this.f12970e = new TypedValue();
        }
        TypedValue typedValue = this.f12970e;
        Resources resources = context.getResources();
        resources.getValue(i10, typedValue, true);
        long m13621e = m13621e(typedValue);
        Drawable m13633i = m13633i(context, m13621e);
        if (m13633i != null) {
            return m13633i;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i10);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                String name = xml.getName();
                this.f12968c.m18766b(i10, name);
                e eVar = this.f12967b.get(name);
                if (eVar != null) {
                    m13633i = eVar.mo13645a(context, xml, asAttributeSet, context.getTheme());
                }
                if (m13633i != null) {
                    m13633i.setChangingConfigurations(typedValue.changingConfigurations);
                    m13629b(context, m13621e, m13633i);
                }
            } catch (Exception e10) {
                Log.e("ResourceManagerInternal", "Exception while inflating drawable", e10);
            }
        }
        if (m13633i == null) {
            this.f12968c.m18766b(i10, "appcompat_skip_skip");
        }
        return m13633i;
    }

    /* renamed from: s */
    public synchronized void m13640s(Context context) {
        C4774d<WeakReference<Drawable.ConstantState>> c4774d = this.f12969d.get(context);
        if (c4774d != null) {
            c4774d.m18731c();
        }
    }

    /* renamed from: t */
    public synchronized Drawable m13641t(Context context, C3627d1 c3627d1, int i10) {
        Drawable m13639r = m13639r(context, i10);
        if (m13639r == null) {
            m13639r = c3627d1.m13649a(i10);
        }
        if (m13639r == null) {
            return null;
        }
        return m13643v(context, i10, false, m13639r);
    }

    /* renamed from: u */
    public synchronized void m13642u(f fVar) {
        this.f12972g = fVar;
    }

    /* renamed from: v */
    public final Drawable m13643v(Context context, int i10, boolean z10, Drawable drawable) {
        ColorStateList m13636m = m13636m(context, i10);
        if (m13636m == null) {
            f fVar = this.f12972g;
            if ((fVar == null || !fVar.mo13553e(context, i10, drawable)) && !m13644x(context, i10, drawable) && z10) {
                return null;
            }
            return drawable;
        }
        if (C3637h0.m13511a(drawable)) {
            drawable = drawable.mutate();
        }
        Drawable m2265p = C0436a.m2265p(drawable);
        C0436a.m2263n(m2265p, m13636m);
        PorterDuff.Mode m13638o = m13638o(i10);
        if (m13638o == null) {
            return m2265p;
        }
        C0436a.m2264o(m2265p, m13638o);
        return m2265p;
    }

    /* renamed from: x */
    public boolean m13644x(Context context, int i10, Drawable drawable) {
        f fVar = this.f12972g;
        return fVar != null && fVar.mo13550b(context, i10, drawable);
    }
}
