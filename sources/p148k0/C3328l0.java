package p148k0;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;
import p002a0.C0005b;
import p133j0.C3203b;
import p133j0.C3205d;

/* renamed from: k0.l0 */
/* loaded from: classes.dex */
public class C3328l0 {

    /* renamed from: b */
    public static final C3328l0 f11602b;

    /* renamed from: a */
    public final l f11603a;

    @SuppressLint({"SoonBlockedPrivateApi"})
    /* renamed from: k0.l0$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public static Field f11604a;

        /* renamed from: b */
        public static Field f11605b;

        /* renamed from: c */
        public static Field f11606c;

        /* renamed from: d */
        public static boolean f11607d;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                f11604a = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                f11605b = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                f11606c = declaredField3;
                declaredField3.setAccessible(true);
                f11607d = true;
            } catch (ReflectiveOperationException e10) {
                Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e10.getMessage(), e10);
            }
        }

        /* renamed from: a */
        public static C3328l0 m12298a(View view) {
            if (f11607d && view.isAttachedToWindow()) {
                try {
                    Object obj = f11604a.get(view.getRootView());
                    if (obj != null) {
                        Rect rect = (Rect) f11605b.get(obj);
                        Rect rect2 = (Rect) f11606c.get(obj);
                        if (rect != null && rect2 != null) {
                            C3328l0 m12299a = new b().m12300b(C0005b.m14c(rect)).m12301c(C0005b.m14c(rect2)).m12299a();
                            m12299a.m12295s(m12299a);
                            m12299a.m12281d(view.getRootView());
                            return m12299a;
                        }
                    }
                } catch (IllegalAccessException e10) {
                    Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e10.getMessage(), e10);
                }
            }
            return null;
        }
    }

    /* renamed from: k0.l0$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        public final f f11608a;

        public b() {
            int i10 = Build.VERSION.SDK_INT;
            this.f11608a = i10 >= 30 ? new e() : i10 >= 29 ? new d() : i10 >= 20 ? new c() : new f();
        }

        public b(C3328l0 c3328l0) {
            int i10 = Build.VERSION.SDK_INT;
            this.f11608a = i10 >= 30 ? new e(c3328l0) : i10 >= 29 ? new d(c3328l0) : i10 >= 20 ? new c(c3328l0) : new f(c3328l0);
        }

        /* renamed from: a */
        public C3328l0 m12299a() {
            return this.f11608a.mo12303b();
        }

        @Deprecated
        /* renamed from: b */
        public b m12300b(C0005b c0005b) {
            this.f11608a.mo12304d(c0005b);
            return this;
        }

        @Deprecated
        /* renamed from: c */
        public b m12301c(C0005b c0005b) {
            this.f11608a.mo12305f(c0005b);
            return this;
        }
    }

    /* renamed from: k0.l0$c */
    /* loaded from: classes.dex */
    public static class c extends f {

        /* renamed from: e */
        public static Field f11609e = null;

        /* renamed from: f */
        public static boolean f11610f = false;

        /* renamed from: g */
        public static Constructor<WindowInsets> f11611g = null;

        /* renamed from: h */
        public static boolean f11612h = false;

        /* renamed from: c */
        public WindowInsets f11613c;

        /* renamed from: d */
        public C0005b f11614d;

        public c() {
            this.f11613c = m12302h();
        }

        public c(C3328l0 c3328l0) {
            super(c3328l0);
            this.f11613c = c3328l0.m12297u();
        }

        /* renamed from: h */
        private static WindowInsets m12302h() {
            if (!f11610f) {
                try {
                    f11609e = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e10) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e10);
                }
                f11610f = true;
            }
            Field field = f11609e;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e11) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e11);
                }
            }
            if (!f11612h) {
                try {
                    f11611g = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException e12) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e12);
                }
                f11612h = true;
            }
            Constructor<WindowInsets> constructor = f11611g;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException e13) {
                    Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e13);
                }
            }
            return null;
        }

        @Override // p148k0.C3328l0.f
        /* renamed from: b */
        public C3328l0 mo12303b() {
            m12309a();
            C3328l0 m12276v = C3328l0.m12276v(this.f11613c);
            m12276v.m12293q(this.f11617b);
            m12276v.m12296t(this.f11614d);
            return m12276v;
        }

        @Override // p148k0.C3328l0.f
        /* renamed from: d */
        public void mo12304d(C0005b c0005b) {
            this.f11614d = c0005b;
        }

        @Override // p148k0.C3328l0.f
        /* renamed from: f */
        public void mo12305f(C0005b c0005b) {
            WindowInsets windowInsets = this.f11613c;
            if (windowInsets != null) {
                this.f11613c = windowInsets.replaceSystemWindowInsets(c0005b.f6a, c0005b.f7b, c0005b.f8c, c0005b.f9d);
            }
        }
    }

    /* renamed from: k0.l0$d */
    /* loaded from: classes.dex */
    public static class d extends f {

        /* renamed from: c */
        public final WindowInsets.Builder f11615c;

        public d() {
            this.f11615c = new WindowInsets.Builder();
        }

        public d(C3328l0 c3328l0) {
            super(c3328l0);
            WindowInsets m12297u = c3328l0.m12297u();
            this.f11615c = m12297u != null ? new WindowInsets.Builder(m12297u) : new WindowInsets.Builder();
        }

        @Override // p148k0.C3328l0.f
        /* renamed from: b */
        public C3328l0 mo12303b() {
            m12309a();
            C3328l0 m12276v = C3328l0.m12276v(this.f11615c.build());
            m12276v.m12293q(this.f11617b);
            return m12276v;
        }

        @Override // p148k0.C3328l0.f
        /* renamed from: c */
        public void mo12306c(C0005b c0005b) {
            this.f11615c.setMandatorySystemGestureInsets(c0005b.m16e());
        }

        @Override // p148k0.C3328l0.f
        /* renamed from: d */
        public void mo12304d(C0005b c0005b) {
            this.f11615c.setStableInsets(c0005b.m16e());
        }

        @Override // p148k0.C3328l0.f
        /* renamed from: e */
        public void mo12307e(C0005b c0005b) {
            this.f11615c.setSystemGestureInsets(c0005b.m16e());
        }

        @Override // p148k0.C3328l0.f
        /* renamed from: f */
        public void mo12305f(C0005b c0005b) {
            this.f11615c.setSystemWindowInsets(c0005b.m16e());
        }

        @Override // p148k0.C3328l0.f
        /* renamed from: g */
        public void mo12308g(C0005b c0005b) {
            this.f11615c.setTappableElementInsets(c0005b.m16e());
        }
    }

    /* renamed from: k0.l0$e */
    /* loaded from: classes.dex */
    public static class e extends d {
        public e() {
        }

        public e(C3328l0 c3328l0) {
            super(c3328l0);
        }
    }

    /* renamed from: k0.l0$f */
    /* loaded from: classes.dex */
    public static class f {

        /* renamed from: a */
        public final C3328l0 f11616a;

        /* renamed from: b */
        public C0005b[] f11617b;

        public f() {
            this(new C3328l0((C3328l0) null));
        }

        public f(C3328l0 c3328l0) {
            this.f11616a = c3328l0;
        }

        /* renamed from: a */
        public final void m12309a() {
            C0005b[] c0005bArr = this.f11617b;
            if (c0005bArr != null) {
                C0005b c0005b = c0005bArr[m.m12337b(1)];
                C0005b c0005b2 = this.f11617b[m.m12337b(2)];
                if (c0005b2 == null) {
                    c0005b2 = this.f11616a.m12283f(2);
                }
                if (c0005b == null) {
                    c0005b = this.f11616a.m12283f(1);
                }
                mo12305f(C0005b.m12a(c0005b, c0005b2));
                C0005b c0005b3 = this.f11617b[m.m12337b(16)];
                if (c0005b3 != null) {
                    mo12307e(c0005b3);
                }
                C0005b c0005b4 = this.f11617b[m.m12337b(32)];
                if (c0005b4 != null) {
                    mo12306c(c0005b4);
                }
                C0005b c0005b5 = this.f11617b[m.m12337b(64)];
                if (c0005b5 != null) {
                    mo12308g(c0005b5);
                }
            }
        }

        /* renamed from: b */
        public C3328l0 mo12303b() {
            m12309a();
            return this.f11616a;
        }

        /* renamed from: c */
        public void mo12306c(C0005b c0005b) {
        }

        /* renamed from: d */
        public void mo12304d(C0005b c0005b) {
        }

        /* renamed from: e */
        public void mo12307e(C0005b c0005b) {
        }

        /* renamed from: f */
        public void mo12305f(C0005b c0005b) {
        }

        /* renamed from: g */
        public void mo12308g(C0005b c0005b) {
        }
    }

    /* renamed from: k0.l0$g */
    /* loaded from: classes.dex */
    public static class g extends l {

        /* renamed from: h */
        public static boolean f11618h = false;

        /* renamed from: i */
        public static Method f11619i;

        /* renamed from: j */
        public static Class<?> f11620j;

        /* renamed from: k */
        public static Field f11621k;

        /* renamed from: l */
        public static Field f11622l;

        /* renamed from: c */
        public final WindowInsets f11623c;

        /* renamed from: d */
        public C0005b[] f11624d;

        /* renamed from: e */
        public C0005b f11625e;

        /* renamed from: f */
        public C3328l0 f11626f;

        /* renamed from: g */
        public C0005b f11627g;

        public g(C3328l0 c3328l0, WindowInsets windowInsets) {
            super(c3328l0);
            this.f11625e = null;
            this.f11623c = windowInsets;
        }

        public g(C3328l0 c3328l0, g gVar) {
            this(c3328l0, new WindowInsets(gVar.f11623c));
        }

        @SuppressLint({"WrongConstant"})
        /* renamed from: u */
        private C0005b m12310u(int i10, boolean z10) {
            C0005b c0005b = C0005b.f5e;
            for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                if ((i10 & i11) != 0) {
                    c0005b = C0005b.m12a(c0005b, m12324v(i11, z10));
                }
            }
            return c0005b;
        }

        /* renamed from: w */
        private C0005b m12311w() {
            C3328l0 c3328l0 = this.f11626f;
            return c3328l0 != null ? c3328l0.m12284g() : C0005b.f5e;
        }

        /* renamed from: x */
        private C0005b m12312x(View view) {
            if (Build.VERSION.SDK_INT >= 30) {
                throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            }
            if (!f11618h) {
                m12313z();
            }
            Method method = f11619i;
            if (method != null && f11620j != null && f11621k != null) {
                try {
                    Object invoke = method.invoke(view, new Object[0]);
                    if (invoke == null) {
                        Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                        return null;
                    }
                    Rect rect = (Rect) f11621k.get(f11622l.get(invoke));
                    if (rect != null) {
                        return C0005b.m14c(rect);
                    }
                    return null;
                } catch (ReflectiveOperationException e10) {
                    Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e10.getMessage(), e10);
                }
            }
            return null;
        }

        @SuppressLint({"PrivateApi"})
        /* renamed from: z */
        private static void m12313z() {
            try {
                f11619i = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f11620j = cls;
                f11621k = cls.getDeclaredField("mVisibleInsets");
                f11622l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                f11621k.setAccessible(true);
                f11622l.setAccessible(true);
            } catch (ReflectiveOperationException e10) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e10.getMessage(), e10);
            }
            f11618h = true;
        }

        @Override // p148k0.C3328l0.l
        /* renamed from: d */
        public void mo12314d(View view) {
            C0005b m12312x = m12312x(view);
            if (m12312x == null) {
                m12312x = C0005b.f5e;
            }
            mo12322r(m12312x);
        }

        @Override // p148k0.C3328l0.l
        /* renamed from: e */
        public void mo12315e(C3328l0 c3328l0) {
            c3328l0.m12295s(this.f11626f);
            c3328l0.m12294r(this.f11627g);
        }

        @Override // p148k0.C3328l0.l
        public boolean equals(Object obj) {
            if (super.equals(obj)) {
                return Objects.equals(this.f11627g, ((g) obj).f11627g);
            }
            return false;
        }

        @Override // p148k0.C3328l0.l
        /* renamed from: g */
        public C0005b mo12316g(int i10) {
            return m12310u(i10, false);
        }

        @Override // p148k0.C3328l0.l
        /* renamed from: k */
        public final C0005b mo12317k() {
            if (this.f11625e == null) {
                this.f11625e = C0005b.m13b(this.f11623c.getSystemWindowInsetLeft(), this.f11623c.getSystemWindowInsetTop(), this.f11623c.getSystemWindowInsetRight(), this.f11623c.getSystemWindowInsetBottom());
            }
            return this.f11625e;
        }

        @Override // p148k0.C3328l0.l
        /* renamed from: m */
        public C3328l0 mo12318m(int i10, int i11, int i12, int i13) {
            b bVar = new b(C3328l0.m12276v(this.f11623c));
            bVar.m12301c(C3328l0.m12275m(mo12317k(), i10, i11, i12, i13));
            bVar.m12300b(C3328l0.m12275m(mo12328i(), i10, i11, i12, i13));
            return bVar.m12299a();
        }

        @Override // p148k0.C3328l0.l
        /* renamed from: o */
        public boolean mo12319o() {
            return this.f11623c.isRound();
        }

        @Override // p148k0.C3328l0.l
        @SuppressLint({"WrongConstant"})
        /* renamed from: p */
        public boolean mo12320p(int i10) {
            for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                if ((i10 & i11) != 0 && !m12325y(i11)) {
                    return false;
                }
            }
            return true;
        }

        @Override // p148k0.C3328l0.l
        /* renamed from: q */
        public void mo12321q(C0005b[] c0005bArr) {
            this.f11624d = c0005bArr;
        }

        @Override // p148k0.C3328l0.l
        /* renamed from: r */
        public void mo12322r(C0005b c0005b) {
            this.f11627g = c0005b;
        }

        @Override // p148k0.C3328l0.l
        /* renamed from: s */
        public void mo12323s(C3328l0 c3328l0) {
            this.f11626f = c3328l0;
        }

        /* renamed from: v */
        public C0005b m12324v(int i10, boolean z10) {
            C0005b m12284g;
            int i11;
            if (i10 == 1) {
                return z10 ? C0005b.m13b(0, Math.max(m12311w().f7b, mo12317k().f7b), 0, 0) : C0005b.m13b(0, mo12317k().f7b, 0, 0);
            }
            if (i10 == 2) {
                if (z10) {
                    C0005b m12311w = m12311w();
                    C0005b mo12328i = mo12328i();
                    return C0005b.m13b(Math.max(m12311w.f6a, mo12328i.f6a), 0, Math.max(m12311w.f8c, mo12328i.f8c), Math.max(m12311w.f9d, mo12328i.f9d));
                }
                C0005b mo12317k = mo12317k();
                C3328l0 c3328l0 = this.f11626f;
                m12284g = c3328l0 != null ? c3328l0.m12284g() : null;
                int i12 = mo12317k.f9d;
                if (m12284g != null) {
                    i12 = Math.min(i12, m12284g.f9d);
                }
                return C0005b.m13b(mo12317k.f6a, 0, mo12317k.f8c, i12);
            }
            if (i10 != 8) {
                if (i10 == 16) {
                    return mo12334j();
                }
                if (i10 == 32) {
                    return mo12333h();
                }
                if (i10 == 64) {
                    return mo12335l();
                }
                if (i10 != 128) {
                    return C0005b.f5e;
                }
                C3328l0 c3328l02 = this.f11626f;
                C3311d m12282e = c3328l02 != null ? c3328l02.m12282e() : mo12332f();
                return m12282e != null ? C0005b.m13b(m12282e.m12198b(), m12282e.m12200d(), m12282e.m12199c(), m12282e.m12197a()) : C0005b.f5e;
            }
            C0005b[] c0005bArr = this.f11624d;
            m12284g = c0005bArr != null ? c0005bArr[m.m12337b(8)] : null;
            if (m12284g != null) {
                return m12284g;
            }
            C0005b mo12317k2 = mo12317k();
            C0005b m12311w2 = m12311w();
            int i13 = mo12317k2.f9d;
            if (i13 > m12311w2.f9d) {
                return C0005b.m13b(0, 0, 0, i13);
            }
            C0005b c0005b = this.f11627g;
            return (c0005b == null || c0005b.equals(C0005b.f5e) || (i11 = this.f11627g.f9d) <= m12311w2.f9d) ? C0005b.f5e : C0005b.m13b(0, 0, 0, i11);
        }

        /* renamed from: y */
        public boolean m12325y(int i10) {
            if (i10 != 1 && i10 != 2) {
                if (i10 == 4) {
                    return false;
                }
                if (i10 != 8 && i10 != 128) {
                    return true;
                }
            }
            return !m12324v(i10, false).equals(C0005b.f5e);
        }
    }

    /* renamed from: k0.l0$h */
    /* loaded from: classes.dex */
    public static class h extends g {

        /* renamed from: m */
        public C0005b f11628m;

        public h(C3328l0 c3328l0, WindowInsets windowInsets) {
            super(c3328l0, windowInsets);
            this.f11628m = null;
        }

        public h(C3328l0 c3328l0, h hVar) {
            super(c3328l0, hVar);
            this.f11628m = null;
            this.f11628m = hVar.f11628m;
        }

        @Override // p148k0.C3328l0.l
        /* renamed from: b */
        public C3328l0 mo12326b() {
            return C3328l0.m12276v(this.f11623c.consumeStableInsets());
        }

        @Override // p148k0.C3328l0.l
        /* renamed from: c */
        public C3328l0 mo12327c() {
            return C3328l0.m12276v(this.f11623c.consumeSystemWindowInsets());
        }

        @Override // p148k0.C3328l0.l
        /* renamed from: i */
        public final C0005b mo12328i() {
            if (this.f11628m == null) {
                this.f11628m = C0005b.m13b(this.f11623c.getStableInsetLeft(), this.f11623c.getStableInsetTop(), this.f11623c.getStableInsetRight(), this.f11623c.getStableInsetBottom());
            }
            return this.f11628m;
        }

        @Override // p148k0.C3328l0.l
        /* renamed from: n */
        public boolean mo12329n() {
            return this.f11623c.isConsumed();
        }

        @Override // p148k0.C3328l0.l
        /* renamed from: t */
        public void mo12330t(C0005b c0005b) {
            this.f11628m = c0005b;
        }
    }

    /* renamed from: k0.l0$i */
    /* loaded from: classes.dex */
    public static class i extends h {
        public i(C3328l0 c3328l0, WindowInsets windowInsets) {
            super(c3328l0, windowInsets);
        }

        public i(C3328l0 c3328l0, i iVar) {
            super(c3328l0, iVar);
        }

        @Override // p148k0.C3328l0.l
        /* renamed from: a */
        public C3328l0 mo12331a() {
            return C3328l0.m12276v(this.f11623c.consumeDisplayCutout());
        }

        @Override // p148k0.C3328l0.g, p148k0.C3328l0.l
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return Objects.equals(this.f11623c, iVar.f11623c) && Objects.equals(this.f11627g, iVar.f11627g);
        }

        @Override // p148k0.C3328l0.l
        /* renamed from: f */
        public C3311d mo12332f() {
            return C3311d.m12196e(this.f11623c.getDisplayCutout());
        }

        @Override // p148k0.C3328l0.l
        public int hashCode() {
            return this.f11623c.hashCode();
        }
    }

    /* renamed from: k0.l0$j */
    /* loaded from: classes.dex */
    public static class j extends i {

        /* renamed from: n */
        public C0005b f11629n;

        /* renamed from: o */
        public C0005b f11630o;

        /* renamed from: p */
        public C0005b f11631p;

        public j(C3328l0 c3328l0, WindowInsets windowInsets) {
            super(c3328l0, windowInsets);
            this.f11629n = null;
            this.f11630o = null;
            this.f11631p = null;
        }

        public j(C3328l0 c3328l0, j jVar) {
            super(c3328l0, jVar);
            this.f11629n = null;
            this.f11630o = null;
            this.f11631p = null;
        }

        @Override // p148k0.C3328l0.l
        /* renamed from: h */
        public C0005b mo12333h() {
            if (this.f11630o == null) {
                this.f11630o = C0005b.m15d(this.f11623c.getMandatorySystemGestureInsets());
            }
            return this.f11630o;
        }

        @Override // p148k0.C3328l0.l
        /* renamed from: j */
        public C0005b mo12334j() {
            if (this.f11629n == null) {
                this.f11629n = C0005b.m15d(this.f11623c.getSystemGestureInsets());
            }
            return this.f11629n;
        }

        @Override // p148k0.C3328l0.l
        /* renamed from: l */
        public C0005b mo12335l() {
            if (this.f11631p == null) {
                this.f11631p = C0005b.m15d(this.f11623c.getTappableElementInsets());
            }
            return this.f11631p;
        }

        @Override // p148k0.C3328l0.g, p148k0.C3328l0.l
        /* renamed from: m */
        public C3328l0 mo12318m(int i10, int i11, int i12, int i13) {
            return C3328l0.m12276v(this.f11623c.inset(i10, i11, i12, i13));
        }

        @Override // p148k0.C3328l0.h, p148k0.C3328l0.l
        /* renamed from: t */
        public void mo12330t(C0005b c0005b) {
        }
    }

    /* renamed from: k0.l0$k */
    /* loaded from: classes.dex */
    public static class k extends j {

        /* renamed from: q */
        public static final C3328l0 f11632q = C3328l0.m12276v(WindowInsets.CONSUMED);

        public k(C3328l0 c3328l0, WindowInsets windowInsets) {
            super(c3328l0, windowInsets);
        }

        public k(C3328l0 c3328l0, k kVar) {
            super(c3328l0, kVar);
        }

        @Override // p148k0.C3328l0.g, p148k0.C3328l0.l
        /* renamed from: d */
        public final void mo12314d(View view) {
        }

        @Override // p148k0.C3328l0.g, p148k0.C3328l0.l
        /* renamed from: g */
        public C0005b mo12316g(int i10) {
            return C0005b.m15d(this.f11623c.getInsets(n.m12338a(i10)));
        }

        @Override // p148k0.C3328l0.g, p148k0.C3328l0.l
        /* renamed from: p */
        public boolean mo12320p(int i10) {
            return this.f11623c.isVisible(n.m12338a(i10));
        }
    }

    /* renamed from: k0.l0$l */
    /* loaded from: classes.dex */
    public static class l {

        /* renamed from: b */
        public static final C3328l0 f11633b = new b().m12299a().m12278a().m12279b().m12280c();

        /* renamed from: a */
        public final C3328l0 f11634a;

        public l(C3328l0 c3328l0) {
            this.f11634a = c3328l0;
        }

        /* renamed from: a */
        public C3328l0 mo12331a() {
            return this.f11634a;
        }

        /* renamed from: b */
        public C3328l0 mo12326b() {
            return this.f11634a;
        }

        /* renamed from: c */
        public C3328l0 mo12327c() {
            return this.f11634a;
        }

        /* renamed from: d */
        public void mo12314d(View view) {
        }

        /* renamed from: e */
        public void mo12315e(C3328l0 c3328l0) {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return mo12319o() == lVar.mo12319o() && mo12329n() == lVar.mo12329n() && C3203b.m11399a(mo12317k(), lVar.mo12317k()) && C3203b.m11399a(mo12328i(), lVar.mo12328i()) && C3203b.m11399a(mo12332f(), lVar.mo12332f());
        }

        /* renamed from: f */
        public C3311d mo12332f() {
            return null;
        }

        /* renamed from: g */
        public C0005b mo12316g(int i10) {
            return C0005b.f5e;
        }

        /* renamed from: h */
        public C0005b mo12333h() {
            return mo12317k();
        }

        public int hashCode() {
            return C3203b.m11400b(Boolean.valueOf(mo12319o()), Boolean.valueOf(mo12329n()), mo12317k(), mo12328i(), mo12332f());
        }

        /* renamed from: i */
        public C0005b mo12328i() {
            return C0005b.f5e;
        }

        /* renamed from: j */
        public C0005b mo12334j() {
            return mo12317k();
        }

        /* renamed from: k */
        public C0005b mo12317k() {
            return C0005b.f5e;
        }

        /* renamed from: l */
        public C0005b mo12335l() {
            return mo12317k();
        }

        /* renamed from: m */
        public C3328l0 mo12318m(int i10, int i11, int i12, int i13) {
            return f11633b;
        }

        /* renamed from: n */
        public boolean mo12329n() {
            return false;
        }

        /* renamed from: o */
        public boolean mo12319o() {
            return false;
        }

        /* renamed from: p */
        public boolean mo12320p(int i10) {
            return true;
        }

        /* renamed from: q */
        public void mo12321q(C0005b[] c0005bArr) {
        }

        /* renamed from: r */
        public void mo12322r(C0005b c0005b) {
        }

        /* renamed from: s */
        public void mo12323s(C3328l0 c3328l0) {
        }

        /* renamed from: t */
        public void mo12330t(C0005b c0005b) {
        }
    }

    /* renamed from: k0.l0$m */
    /* loaded from: classes.dex */
    public static final class m {
        /* renamed from: a */
        public static int m12336a() {
            return 8;
        }

        /* renamed from: b */
        public static int m12337b(int i10) {
            if (i10 == 1) {
                return 0;
            }
            if (i10 == 2) {
                return 1;
            }
            if (i10 == 4) {
                return 2;
            }
            if (i10 == 8) {
                return 3;
            }
            if (i10 == 16) {
                return 4;
            }
            if (i10 == 32) {
                return 5;
            }
            if (i10 == 64) {
                return 6;
            }
            if (i10 == 128) {
                return 7;
            }
            if (i10 == 256) {
                return 8;
            }
            throw new IllegalArgumentException("type needs to be >= FIRST and <= LAST, type=" + i10);
        }
    }

    /* renamed from: k0.l0$n */
    /* loaded from: classes.dex */
    public static final class n {
        /* renamed from: a */
        public static int m12338a(int i10) {
            int statusBars;
            int i11 = 0;
            for (int i12 = 1; i12 <= 256; i12 <<= 1) {
                if ((i10 & i12) != 0) {
                    if (i12 == 1) {
                        statusBars = WindowInsets.Type.statusBars();
                    } else if (i12 == 2) {
                        statusBars = WindowInsets.Type.navigationBars();
                    } else if (i12 == 4) {
                        statusBars = WindowInsets.Type.captionBar();
                    } else if (i12 == 8) {
                        statusBars = WindowInsets.Type.ime();
                    } else if (i12 == 16) {
                        statusBars = WindowInsets.Type.systemGestures();
                    } else if (i12 == 32) {
                        statusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i12 == 64) {
                        statusBars = WindowInsets.Type.tappableElement();
                    } else if (i12 == 128) {
                        statusBars = WindowInsets.Type.displayCutout();
                    }
                    i11 |= statusBars;
                }
            }
            return i11;
        }
    }

    static {
        f11602b = Build.VERSION.SDK_INT >= 30 ? k.f11632q : l.f11633b;
    }

    public C3328l0(WindowInsets windowInsets) {
        l gVar;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            gVar = new k(this, windowInsets);
        } else if (i10 >= 29) {
            gVar = new j(this, windowInsets);
        } else if (i10 >= 28) {
            gVar = new i(this, windowInsets);
        } else if (i10 >= 21) {
            gVar = new h(this, windowInsets);
        } else {
            if (i10 < 20) {
                this.f11603a = new l(this);
                return;
            }
            gVar = new g(this, windowInsets);
        }
        this.f11603a = gVar;
    }

    public C3328l0(C3328l0 c3328l0) {
        if (c3328l0 == null) {
            this.f11603a = new l(this);
            return;
        }
        l lVar = c3328l0.f11603a;
        int i10 = Build.VERSION.SDK_INT;
        this.f11603a = (i10 < 30 || !(lVar instanceof k)) ? (i10 < 29 || !(lVar instanceof j)) ? (i10 < 28 || !(lVar instanceof i)) ? (i10 < 21 || !(lVar instanceof h)) ? (i10 < 20 || !(lVar instanceof g)) ? new l(this) : new g(this, (g) lVar) : new h(this, (h) lVar) : new i(this, (i) lVar) : new j(this, (j) lVar) : new k(this, (k) lVar);
        lVar.mo12315e(this);
    }

    /* renamed from: m */
    public static C0005b m12275m(C0005b c0005b, int i10, int i11, int i12, int i13) {
        int max = Math.max(0, c0005b.f6a - i10);
        int max2 = Math.max(0, c0005b.f7b - i11);
        int max3 = Math.max(0, c0005b.f8c - i12);
        int max4 = Math.max(0, c0005b.f9d - i13);
        return (max == i10 && max2 == i11 && max3 == i12 && max4 == i13) ? c0005b : C0005b.m13b(max, max2, max3, max4);
    }

    /* renamed from: v */
    public static C3328l0 m12276v(WindowInsets windowInsets) {
        return m12277w(windowInsets, null);
    }

    /* renamed from: w */
    public static C3328l0 m12277w(WindowInsets windowInsets, View view) {
        C3328l0 c3328l0 = new C3328l0((WindowInsets) C3205d.m11414j(windowInsets));
        if (view != null && C3308b0.m11992F(view)) {
            c3328l0.m12295s(C3308b0.m12051y(view));
            c3328l0.m12281d(view.getRootView());
        }
        return c3328l0;
    }

    @Deprecated
    /* renamed from: a */
    public C3328l0 m12278a() {
        return this.f11603a.mo12331a();
    }

    @Deprecated
    /* renamed from: b */
    public C3328l0 m12279b() {
        return this.f11603a.mo12326b();
    }

    @Deprecated
    /* renamed from: c */
    public C3328l0 m12280c() {
        return this.f11603a.mo12327c();
    }

    /* renamed from: d */
    public void m12281d(View view) {
        this.f11603a.mo12314d(view);
    }

    /* renamed from: e */
    public C3311d m12282e() {
        return this.f11603a.mo12332f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3328l0) {
            return C3203b.m11399a(this.f11603a, ((C3328l0) obj).f11603a);
        }
        return false;
    }

    /* renamed from: f */
    public C0005b m12283f(int i10) {
        return this.f11603a.mo12316g(i10);
    }

    @Deprecated
    /* renamed from: g */
    public C0005b m12284g() {
        return this.f11603a.mo12328i();
    }

    @Deprecated
    /* renamed from: h */
    public int m12285h() {
        return this.f11603a.mo12317k().f9d;
    }

    public int hashCode() {
        l lVar = this.f11603a;
        if (lVar == null) {
            return 0;
        }
        return lVar.hashCode();
    }

    @Deprecated
    /* renamed from: i */
    public int m12286i() {
        return this.f11603a.mo12317k().f6a;
    }

    @Deprecated
    /* renamed from: j */
    public int m12287j() {
        return this.f11603a.mo12317k().f8c;
    }

    @Deprecated
    /* renamed from: k */
    public int m12288k() {
        return this.f11603a.mo12317k().f7b;
    }

    /* renamed from: l */
    public C3328l0 m12289l(int i10, int i11, int i12, int i13) {
        return this.f11603a.mo12318m(i10, i11, i12, i13);
    }

    /* renamed from: n */
    public boolean m12290n() {
        return this.f11603a.mo12329n();
    }

    /* renamed from: o */
    public boolean m12291o(int i10) {
        return this.f11603a.mo12320p(i10);
    }

    @Deprecated
    /* renamed from: p */
    public C3328l0 m12292p(int i10, int i11, int i12, int i13) {
        return new b(this).m12301c(C0005b.m13b(i10, i11, i12, i13)).m12299a();
    }

    /* renamed from: q */
    public void m12293q(C0005b[] c0005bArr) {
        this.f11603a.mo12321q(c0005bArr);
    }

    /* renamed from: r */
    public void m12294r(C0005b c0005b) {
        this.f11603a.mo12322r(c0005b);
    }

    /* renamed from: s */
    public void m12295s(C3328l0 c3328l0) {
        this.f11603a.mo12323s(c3328l0);
    }

    /* renamed from: t */
    public void m12296t(C0005b c0005b) {
        this.f11603a.mo12330t(c0005b);
    }

    /* renamed from: u */
    public WindowInsets m12297u() {
        l lVar = this.f11603a;
        if (lVar instanceof g) {
            return ((g) lVar).f11623c;
        }
        return null;
    }
}
