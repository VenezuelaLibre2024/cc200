package p360z;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import p133j0.C3203b;
import p360z.C5934h;

/* renamed from: z.h */
/* loaded from: classes.dex */
public final class C5934h {

    /* renamed from: a */
    public static final ThreadLocal<TypedValue> f22054a = new ThreadLocal<>();

    /* renamed from: b */
    public static final WeakHashMap<e, SparseArray<d>> f22055b = new WeakHashMap<>(0);

    /* renamed from: c */
    public static final Object f22056c = new Object();

    /* renamed from: z.h$a */
    /* loaded from: classes.dex */
    public static class a {
        /* renamed from: a */
        public static Drawable m23756a(Resources resources, int i10, int i11) {
            return resources.getDrawableForDensity(i10, i11);
        }
    }

    /* renamed from: z.h$b */
    /* loaded from: classes.dex */
    public static class b {
        /* renamed from: a */
        public static Drawable m23757a(Resources resources, int i10, Resources.Theme theme) {
            return resources.getDrawable(i10, theme);
        }

        /* renamed from: b */
        public static Drawable m23758b(Resources resources, int i10, int i11, Resources.Theme theme) {
            return resources.getDrawableForDensity(i10, i11, theme);
        }
    }

    /* renamed from: z.h$c */
    /* loaded from: classes.dex */
    public static class c {
        /* renamed from: a */
        public static int m23759a(Resources resources, int i10, Resources.Theme theme) {
            return resources.getColor(i10, theme);
        }

        /* renamed from: b */
        public static ColorStateList m23760b(Resources resources, int i10, Resources.Theme theme) {
            return resources.getColorStateList(i10, theme);
        }
    }

    /* renamed from: z.h$d */
    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a */
        public final ColorStateList f22057a;

        /* renamed from: b */
        public final Configuration f22058b;

        /* renamed from: c */
        public final int f22059c;

        public d(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
            this.f22057a = colorStateList;
            this.f22058b = configuration;
            this.f22059c = theme == null ? 0 : theme.hashCode();
        }
    }

    /* renamed from: z.h$e */
    /* loaded from: classes.dex */
    public static final class e {

        /* renamed from: a */
        public final Resources f22060a;

        /* renamed from: b */
        public final Resources.Theme f22061b;

        public e(Resources resources, Resources.Theme theme) {
            this.f22060a = resources;
            this.f22061b = theme;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || e.class != obj.getClass()) {
                return false;
            }
            e eVar = (e) obj;
            return this.f22060a.equals(eVar.f22060a) && C3203b.m11399a(this.f22061b, eVar.f22061b);
        }

        public int hashCode() {
            return C3203b.m11400b(this.f22060a, this.f22061b);
        }
    }

    /* renamed from: z.h$f */
    /* loaded from: classes.dex */
    public static abstract class f {
        /* renamed from: e */
        public static Handler m23763e(Handler handler) {
            return handler == null ? new Handler(Looper.getMainLooper()) : handler;
        }

        /* renamed from: c */
        public final void m23766c(int i10, Handler handler) {
            m23763e(handler).post(new Runnable() { // from class: z.i

                /* renamed from: i */
                public final /* synthetic */ int f22066i;

                public /* synthetic */ RunnableC5935i(int i102) {
                    r2 = i102;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C5934h.f.this.m23764f(r2);
                }
            });
        }

        /* renamed from: d */
        public final void m23767d(Typeface typeface, Handler handler) {
            m23763e(handler).post(new Runnable() { // from class: z.j

                /* renamed from: i */
                public final /* synthetic */ Typeface f22068i;

                public /* synthetic */ RunnableC5936j(Typeface typeface2) {
                    r2 = typeface2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C5934h.f.this.m23765g(r2);
                }
            });
        }

        /* renamed from: h */
        public abstract void m23764f(int i10);

        /* renamed from: i */
        public abstract void m23765g(Typeface typeface);
    }

    /* renamed from: z.h$g */
    /* loaded from: classes.dex */
    public static final class g {

        /* renamed from: z.h$g$a */
        /* loaded from: classes.dex */
        public static class a {

            /* renamed from: a */
            public static final Object f22062a = new Object();

            /* renamed from: b */
            public static Method f22063b;

            /* renamed from: c */
            public static boolean f22064c;

            @SuppressLint({"BanUncheckedReflection"})
            /* renamed from: a */
            public static void m23769a(Resources.Theme theme) {
                synchronized (f22062a) {
                    if (!f22064c) {
                        try {
                            Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", new Class[0]);
                            f22063b = declaredMethod;
                            declaredMethod.setAccessible(true);
                        } catch (NoSuchMethodException e10) {
                            Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e10);
                        }
                        f22064c = true;
                    }
                    Method method = f22063b;
                    if (method != null) {
                        try {
                            method.invoke(theme, new Object[0]);
                        } catch (IllegalAccessException | InvocationTargetException e11) {
                            Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e11);
                            f22063b = null;
                        }
                    }
                }
            }
        }

        /* renamed from: z.h$g$b */
        /* loaded from: classes.dex */
        public static class b {
            /* renamed from: a */
            public static void m23770a(Resources.Theme theme) {
                theme.rebase();
            }
        }

        /* renamed from: a */
        public static void m23768a(Resources.Theme theme) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 29) {
                b.m23770a(theme);
            } else if (i10 >= 23) {
                a.m23769a(theme);
            }
        }
    }

    /* renamed from: a */
    public static void m23745a(e eVar, int i10, ColorStateList colorStateList, Resources.Theme theme) {
        synchronized (f22056c) {
            WeakHashMap<e, SparseArray<d>> weakHashMap = f22055b;
            SparseArray<d> sparseArray = weakHashMap.get(eVar);
            if (sparseArray == null) {
                sparseArray = new SparseArray<>();
                weakHashMap.put(eVar, sparseArray);
            }
            sparseArray.append(i10, new d(colorStateList, eVar.f22060a.getConfiguration(), theme));
        }
    }

    /* renamed from: b */
    public static ColorStateList m23746b(e eVar, int i10) {
        d dVar;
        Resources.Theme theme;
        synchronized (f22056c) {
            SparseArray<d> sparseArray = f22055b.get(eVar);
            if (sparseArray != null && sparseArray.size() > 0 && (dVar = sparseArray.get(i10)) != null) {
                if (dVar.f22058b.equals(eVar.f22060a.getConfiguration()) && (((theme = eVar.f22061b) == null && dVar.f22059c == 0) || (theme != null && dVar.f22059c == theme.hashCode()))) {
                    return dVar.f22057a;
                }
                sparseArray.remove(i10);
            }
            return null;
        }
    }

    /* renamed from: c */
    public static ColorStateList m23747c(Resources resources, int i10, Resources.Theme theme) {
        e eVar = new e(resources, theme);
        ColorStateList m23746b = m23746b(eVar, i10);
        if (m23746b != null) {
            return m23746b;
        }
        ColorStateList m23752h = m23752h(resources, i10, theme);
        if (m23752h == null) {
            return Build.VERSION.SDK_INT >= 23 ? c.m23760b(resources, i10, theme) : resources.getColorStateList(i10);
        }
        m23745a(eVar, i10, m23752h, theme);
        return m23752h;
    }

    /* renamed from: d */
    public static Drawable m23748d(Resources resources, int i10, Resources.Theme theme) {
        return Build.VERSION.SDK_INT >= 21 ? b.m23757a(resources, i10, theme) : resources.getDrawable(i10);
    }

    /* renamed from: e */
    public static Drawable m23749e(Resources resources, int i10, int i11, Resources.Theme theme) {
        int i12 = Build.VERSION.SDK_INT;
        return i12 >= 21 ? b.m23758b(resources, i10, i11, theme) : i12 >= 15 ? a.m23756a(resources, i10, i11) : resources.getDrawable(i10);
    }

    /* renamed from: f */
    public static Typeface m23750f(Context context, int i10, TypedValue typedValue, int i11, f fVar) {
        if (context.isRestricted()) {
            return null;
        }
        return m23754j(context, i10, typedValue, i11, fVar, null, true, false);
    }

    /* renamed from: g */
    public static TypedValue m23751g() {
        ThreadLocal<TypedValue> threadLocal = f22054a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    /* renamed from: h */
    public static ColorStateList m23752h(Resources resources, int i10, Resources.Theme theme) {
        if (m23753i(resources, i10)) {
            return null;
        }
        try {
            return C5929c.m23698a(resources, resources.getXml(i10), theme);
        } catch (Exception e10) {
            Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e10);
            return null;
        }
    }

    /* renamed from: i */
    public static boolean m23753i(Resources resources, int i10) {
        TypedValue m23751g = m23751g();
        resources.getValue(i10, m23751g, true);
        int i11 = m23751g.type;
        return i11 >= 28 && i11 <= 31;
    }

    /* renamed from: j */
    public static Typeface m23754j(Context context, int i10, TypedValue typedValue, int i11, f fVar, Handler handler, boolean z10, boolean z11) {
        Resources resources = context.getResources();
        resources.getValue(i10, typedValue, true);
        Typeface m23755k = m23755k(context, resources, typedValue, i10, i11, fVar, handler, z10, z11);
        if (m23755k != null || fVar != null || z11) {
            return m23755k;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i10) + " could not be retrieved.");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00aa  */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Typeface m23755k(android.content.Context r17, android.content.res.Resources r18, android.util.TypedValue r19, int r20, int r21, p360z.C5934h.f r22, android.os.Handler r23, boolean r24, boolean r25) {
        /*
            r0 = r18
            r1 = r19
            r4 = r20
            r11 = r22
            r12 = r23
            java.lang.String r13 = "ResourcesCompat"
            java.lang.CharSequence r2 = r1.string
            if (r2 == 0) goto Lae
            java.lang.String r14 = r2.toString()
            java.lang.String r2 = "res/"
            boolean r2 = r14.startsWith(r2)
            r15 = -3
            r16 = 0
            if (r2 != 0) goto L25
            if (r11 == 0) goto L24
            r11.m23766c(r15, r12)
        L24:
            return r16
        L25:
            int r2 = r1.assetCookie
            r7 = r21
            android.graphics.Typeface r2 = p002a0.C0008e.m41f(r0, r4, r14, r2, r7)
            if (r2 == 0) goto L35
            if (r11 == 0) goto L34
            r11.m23767d(r2, r12)
        L34:
            return r2
        L35:
            if (r25 == 0) goto L38
            return r16
        L38:
            java.lang.String r2 = r14.toLowerCase()     // Catch: java.io.IOException -> L8a org.xmlpull.v1.XmlPullParserException -> L93
            java.lang.String r3 = ".xml"
            boolean r2 = r2.endsWith(r3)     // Catch: java.io.IOException -> L8a org.xmlpull.v1.XmlPullParserException -> L93
            if (r2 == 0) goto L6f
            android.content.res.XmlResourceParser r2 = r0.getXml(r4)     // Catch: java.io.IOException -> L8a org.xmlpull.v1.XmlPullParserException -> L93
            z.e$b r2 = p360z.C5931e.m23719b(r2, r0)     // Catch: java.io.IOException -> L8a org.xmlpull.v1.XmlPullParserException -> L93
            if (r2 != 0) goto L59
            java.lang.String r0 = "Failed to find font-family tag"
            android.util.Log.e(r13, r0)     // Catch: java.io.IOException -> L8a org.xmlpull.v1.XmlPullParserException -> L93
            if (r11 == 0) goto L58
            r11.m23766c(r15, r12)     // Catch: java.io.IOException -> L8a org.xmlpull.v1.XmlPullParserException -> L93
        L58:
            return r16
        L59:
            int r6 = r1.assetCookie     // Catch: java.io.IOException -> L8a org.xmlpull.v1.XmlPullParserException -> L93
            r1 = r17
            r3 = r18
            r4 = r20
            r5 = r14
            r7 = r21
            r8 = r22
            r9 = r23
            r10 = r24
            android.graphics.Typeface r0 = p002a0.C0008e.m38c(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.io.IOException -> L8a org.xmlpull.v1.XmlPullParserException -> L93
            return r0
        L6f:
            int r5 = r1.assetCookie     // Catch: java.io.IOException -> L8a org.xmlpull.v1.XmlPullParserException -> L93
            r1 = r17
            r2 = r18
            r3 = r20
            r4 = r14
            r6 = r21
            android.graphics.Typeface r0 = p002a0.C0008e.m39d(r1, r2, r3, r4, r5, r6)     // Catch: java.io.IOException -> L8a org.xmlpull.v1.XmlPullParserException -> L93
            if (r11 == 0) goto L89
            if (r0 == 0) goto L86
            r11.m23767d(r0, r12)     // Catch: java.io.IOException -> L8a org.xmlpull.v1.XmlPullParserException -> L93
            goto L89
        L86:
            r11.m23766c(r15, r12)     // Catch: java.io.IOException -> L8a org.xmlpull.v1.XmlPullParserException -> L93
        L89:
            return r0
        L8a:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to read xml resource "
            goto L9b
        L93:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to parse xml resource "
        L9b:
            r1.append(r2)
            r1.append(r14)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r13, r1, r0)
            if (r11 == 0) goto Lad
            r11.m23766c(r15, r12)
        Lad:
            return r16
        Lae:
            android.content.res.Resources$NotFoundException r2 = new android.content.res.Resources$NotFoundException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "Resource \""
            r3.append(r5)
            java.lang.String r0 = r0.getResourceName(r4)
            r3.append(r0)
            java.lang.String r0 = "\" ("
            r3.append(r0)
            java.lang.String r0 = java.lang.Integer.toHexString(r20)
            r3.append(r0)
            java.lang.String r0 = ") is not a Font: "
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p360z.C5934h.m23755k(android.content.Context, android.content.res.Resources, android.util.TypedValue, int, int, z.h$f, android.os.Handler, boolean, boolean):android.graphics.Typeface");
    }
}
