package p331x1;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import p148k0.C3308b0;

/* renamed from: x1.c0 */
/* loaded from: classes.dex */
public class C5518c0 {

    /* renamed from: a */
    public static final C5530i0 f20669a;

    /* renamed from: b */
    public static final Property<View, Float> f20670b;

    /* renamed from: c */
    public static final Property<View, Rect> f20671c;

    /* renamed from: x1.c0$a */
    /* loaded from: classes.dex */
    public class a extends Property<View, Float> {
        public a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(C5518c0.m22225c(view));
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f10) {
            C5518c0.m22229g(view, f10.floatValue());
        }
    }

    /* renamed from: x1.c0$b */
    /* loaded from: classes.dex */
    public class b extends Property<View, Rect> {
        public b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Rect get(View view) {
            return C3308b0.m12044r(view);
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Rect rect) {
            C3308b0.m12018c0(view, rect);
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        f20669a = i10 >= 29 ? new C5528h0() : i10 >= 23 ? new C5526g0() : i10 >= 22 ? new C5524f0() : i10 >= 21 ? new C5522e0() : i10 >= 19 ? new C5520d0() : new C5530i0();
        f20670b = new a(Float.class, "translationAlpha");
        f20671c = new b(Rect.class, "clipBounds");
    }

    /* renamed from: a */
    public static void m22223a(View view) {
        f20669a.mo22241a(view);
    }

    /* renamed from: b */
    public static InterfaceC5516b0 m22224b(View view) {
        return Build.VERSION.SDK_INT >= 18 ? new C5514a0(view) : C5551z.m22348e(view);
    }

    /* renamed from: c */
    public static float m22225c(View view) {
        return f20669a.mo22242c(view);
    }

    /* renamed from: d */
    public static InterfaceC5538m0 m22226d(View view) {
        return Build.VERSION.SDK_INT >= 18 ? new C5536l0(view) : new C5534k0(view.getWindowToken());
    }

    /* renamed from: e */
    public static void m22227e(View view) {
        f20669a.mo22243d(view);
    }

    /* renamed from: f */
    public static void m22228f(View view, int i10, int i11, int i12, int i13) {
        f20669a.mo22251e(view, i10, i11, i12, i13);
    }

    /* renamed from: g */
    public static void m22229g(View view, float f10) {
        f20669a.mo22244f(view, f10);
    }

    /* renamed from: h */
    public static void m22230h(View view, int i10) {
        f20669a.mo22253g(view, i10);
    }

    /* renamed from: i */
    public static void m22231i(View view, Matrix matrix) {
        f20669a.mo22248h(view, matrix);
    }

    /* renamed from: j */
    public static void m22232j(View view, Matrix matrix) {
        f20669a.mo22249i(view, matrix);
    }
}
