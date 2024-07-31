package p015b0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: b0.a */
/* loaded from: classes.dex */
public final class C0436a {

    /* renamed from: a */
    public static Method f2122a;

    /* renamed from: b */
    public static boolean f2123b;

    /* renamed from: c */
    public static Method f2124c;

    /* renamed from: d */
    public static boolean f2125d;

    /* renamed from: b0.a$a */
    /* loaded from: classes.dex */
    public static class a {
        /* renamed from: a */
        public static int m2266a(Drawable drawable) {
            return drawable.getAlpha();
        }

        /* renamed from: b */
        public static Drawable m2267b(DrawableContainer.DrawableContainerState drawableContainerState, int i10) {
            return drawableContainerState.getChild(i10);
        }

        /* renamed from: c */
        public static Drawable m2268c(InsetDrawable insetDrawable) {
            return insetDrawable.getDrawable();
        }

        /* renamed from: d */
        public static boolean m2269d(Drawable drawable) {
            return drawable.isAutoMirrored();
        }

        /* renamed from: e */
        public static void m2270e(Drawable drawable, boolean z10) {
            drawable.setAutoMirrored(z10);
        }
    }

    /* renamed from: b0.a$b */
    /* loaded from: classes.dex */
    public static class b {
        /* renamed from: a */
        public static void m2271a(Drawable drawable, Resources.Theme theme) {
            drawable.applyTheme(theme);
        }

        /* renamed from: b */
        public static boolean m2272b(Drawable drawable) {
            return drawable.canApplyTheme();
        }

        /* renamed from: c */
        public static ColorFilter m2273c(Drawable drawable) {
            return drawable.getColorFilter();
        }

        /* renamed from: d */
        public static void m2274d(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        }

        /* renamed from: e */
        public static void m2275e(Drawable drawable, float f10, float f11) {
            drawable.setHotspot(f10, f11);
        }

        /* renamed from: f */
        public static void m2276f(Drawable drawable, int i10, int i11, int i12, int i13) {
            drawable.setHotspotBounds(i10, i11, i12, i13);
        }

        /* renamed from: g */
        public static void m2277g(Drawable drawable, int i10) {
            drawable.setTint(i10);
        }

        /* renamed from: h */
        public static void m2278h(Drawable drawable, ColorStateList colorStateList) {
            drawable.setTintList(colorStateList);
        }

        /* renamed from: i */
        public static void m2279i(Drawable drawable, PorterDuff.Mode mode) {
            drawable.setTintMode(mode);
        }
    }

    /* renamed from: b0.a$c */
    /* loaded from: classes.dex */
    public static class c {
        /* renamed from: a */
        public static int m2280a(Drawable drawable) {
            return drawable.getLayoutDirection();
        }

        /* renamed from: b */
        public static boolean m2281b(Drawable drawable, int i10) {
            return drawable.setLayoutDirection(i10);
        }
    }

    /* renamed from: a */
    public static void m2250a(Drawable drawable, Resources.Theme theme) {
        if (Build.VERSION.SDK_INT >= 21) {
            b.m2271a(drawable, theme);
        }
    }

    /* renamed from: b */
    public static boolean m2251b(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 21) {
            return b.m2272b(drawable);
        }
        return false;
    }

    /* renamed from: c */
    public static int m2252c(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 19) {
            return a.m2266a(drawable);
        }
        return 0;
    }

    /* renamed from: d */
    public static ColorFilter m2253d(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 21) {
            return b.m2273c(drawable);
        }
        return null;
    }

    /* renamed from: e */
    public static int m2254e(Drawable drawable) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 23) {
            return c.m2280a(drawable);
        }
        if (i10 >= 17) {
            if (!f2125d) {
                try {
                    Method declaredMethod = Drawable.class.getDeclaredMethod("getLayoutDirection", new Class[0]);
                    f2124c = declaredMethod;
                    declaredMethod.setAccessible(true);
                } catch (NoSuchMethodException e10) {
                    Log.i("DrawableCompat", "Failed to retrieve getLayoutDirection() method", e10);
                }
                f2125d = true;
            }
            Method method = f2124c;
            if (method != null) {
                try {
                    return ((Integer) method.invoke(drawable, new Object[0])).intValue();
                } catch (Exception e11) {
                    Log.i("DrawableCompat", "Failed to invoke getLayoutDirection() via reflection", e11);
                    f2124c = null;
                }
            }
        }
        return 0;
    }

    /* renamed from: f */
    public static void m2255f(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        if (Build.VERSION.SDK_INT >= 21) {
            b.m2274d(drawable, resources, xmlPullParser, attributeSet, theme);
        } else {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        }
    }

    /* renamed from: g */
    public static boolean m2256g(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 19) {
            return a.m2269d(drawable);
        }
        return false;
    }

    @Deprecated
    /* renamed from: h */
    public static void m2257h(Drawable drawable) {
        drawable.jumpToCurrentState();
    }

    /* renamed from: i */
    public static void m2258i(Drawable drawable, boolean z10) {
        if (Build.VERSION.SDK_INT >= 19) {
            a.m2270e(drawable, z10);
        }
    }

    /* renamed from: j */
    public static void m2259j(Drawable drawable, float f10, float f11) {
        if (Build.VERSION.SDK_INT >= 21) {
            b.m2275e(drawable, f10, f11);
        }
    }

    /* renamed from: k */
    public static void m2260k(Drawable drawable, int i10, int i11, int i12, int i13) {
        if (Build.VERSION.SDK_INT >= 21) {
            b.m2276f(drawable, i10, i11, i12, i13);
        }
    }

    /* renamed from: l */
    public static boolean m2261l(Drawable drawable, int i10) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 23) {
            return c.m2281b(drawable, i10);
        }
        if (i11 >= 17) {
            if (!f2123b) {
                try {
                    Method declaredMethod = Drawable.class.getDeclaredMethod("setLayoutDirection", Integer.TYPE);
                    f2122a = declaredMethod;
                    declaredMethod.setAccessible(true);
                } catch (NoSuchMethodException e10) {
                    Log.i("DrawableCompat", "Failed to retrieve setLayoutDirection(int) method", e10);
                }
                f2123b = true;
            }
            Method method = f2122a;
            if (method != null) {
                try {
                    method.invoke(drawable, Integer.valueOf(i10));
                    return true;
                } catch (Exception e11) {
                    Log.i("DrawableCompat", "Failed to invoke setLayoutDirection(int) via reflection", e11);
                    f2122a = null;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: m */
    public static void m2262m(Drawable drawable, int i10) {
        if (Build.VERSION.SDK_INT >= 21) {
            b.m2277g(drawable, i10);
        } else if (drawable instanceof InterfaceC0437b) {
            ((InterfaceC0437b) drawable).setTint(i10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: n */
    public static void m2263n(Drawable drawable, ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT >= 21) {
            b.m2278h(drawable, colorStateList);
        } else if (drawable instanceof InterfaceC0437b) {
            ((InterfaceC0437b) drawable).setTintList(colorStateList);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: o */
    public static void m2264o(Drawable drawable, PorterDuff.Mode mode) {
        if (Build.VERSION.SDK_INT >= 21) {
            b.m2279i(drawable, mode);
        } else if (drawable instanceof InterfaceC0437b) {
            ((InterfaceC0437b) drawable).setTintMode(mode);
        }
    }

    /* renamed from: p */
    public static Drawable m2265p(Drawable drawable) {
        int i10 = Build.VERSION.SDK_INT;
        return i10 >= 23 ? drawable : i10 >= 21 ? !(drawable instanceof InterfaceC0437b) ? new C0440e(drawable) : drawable : !(drawable instanceof InterfaceC0437b) ? new C0439d(drawable) : drawable;
    }
}
