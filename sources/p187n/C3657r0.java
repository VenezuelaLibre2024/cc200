package p187n;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import p002a0.C0004a;
import p089g.C1940j;

/* renamed from: n.r0 */
/* loaded from: classes.dex */
public class C3657r0 {

    /* renamed from: a */
    public static final ThreadLocal<TypedValue> f13016a = new ThreadLocal<>();

    /* renamed from: b */
    public static final int[] f13017b = {-16842910};

    /* renamed from: c */
    public static final int[] f13018c = {R.attr.state_focused};

    /* renamed from: d */
    public static final int[] f13019d = {R.attr.state_activated};

    /* renamed from: e */
    public static final int[] f13020e = {R.attr.state_pressed};

    /* renamed from: f */
    public static final int[] f13021f = {R.attr.state_checked};

    /* renamed from: g */
    public static final int[] f13022g = {R.attr.state_selected};

    /* renamed from: h */
    public static final int[] f13023h = {-16842919, -16842908};

    /* renamed from: i */
    public static final int[] f13024i = new int[0];

    /* renamed from: j */
    public static final int[] f13025j = new int[1];

    /* renamed from: a */
    public static void m13693a(View view, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(C1940j.f7734y0);
        try {
            if (!obtainStyledAttributes.hasValue(C1940j.f7519D0)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: b */
    public static int m13694b(Context context, int i10) {
        ColorStateList m13697e = m13697e(context, i10);
        if (m13697e != null && m13697e.isStateful()) {
            return m13697e.getColorForState(f13017b, m13697e.getDefaultColor());
        }
        TypedValue m13698f = m13698f();
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, m13698f, true);
        return m13696d(context, i10, m13698f.getFloat());
    }

    /* renamed from: c */
    public static int m13695c(Context context, int i10) {
        int[] iArr = f13025j;
        iArr[0] = i10;
        C3667w0 m13716t = C3667w0.m13716t(context, null, iArr);
        try {
            return m13716t.m13719b(0, 0);
        } finally {
            m13716t.m13736v();
        }
    }

    /* renamed from: d */
    public static int m13696d(Context context, int i10, float f10) {
        return C0004a.m11f(m13695c(context, i10), Math.round(Color.alpha(r0) * f10));
    }

    /* renamed from: e */
    public static ColorStateList m13697e(Context context, int i10) {
        int[] iArr = f13025j;
        iArr[0] = i10;
        C3667w0 m13716t = C3667w0.m13716t(context, null, iArr);
        try {
            return m13716t.m13720c(0);
        } finally {
            m13716t.m13736v();
        }
    }

    /* renamed from: f */
    public static TypedValue m13698f() {
        ThreadLocal<TypedValue> threadLocal = f13016a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }
}
