package p188n0;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.EdgeEffect;

/* renamed from: n0.e */
/* loaded from: classes.dex */
public final class C3678e {

    /* renamed from: n0.e$a */
    /* loaded from: classes.dex */
    public static class a {
        /* renamed from: a */
        public static void m13823a(EdgeEffect edgeEffect, float f10, float f11) {
            edgeEffect.onPull(f10, f11);
        }
    }

    /* renamed from: n0.e$b */
    /* loaded from: classes.dex */
    public static class b {
        /* renamed from: a */
        public static EdgeEffect m13824a(Context context, AttributeSet attributeSet) {
            try {
                return new EdgeEffect(context, attributeSet);
            } catch (Throwable unused) {
                return new EdgeEffect(context);
            }
        }

        /* renamed from: b */
        public static float m13825b(EdgeEffect edgeEffect) {
            try {
                return edgeEffect.getDistance();
            } catch (Throwable unused) {
                return 0.0f;
            }
        }

        /* renamed from: c */
        public static float m13826c(EdgeEffect edgeEffect, float f10, float f11) {
            try {
                return edgeEffect.onPullDistance(f10, f11);
            } catch (Throwable unused) {
                edgeEffect.onPull(f10, f11);
                return 0.0f;
            }
        }
    }

    /* renamed from: a */
    public static EdgeEffect m13819a(Context context, AttributeSet attributeSet) {
        return Build.VERSION.SDK_INT >= 31 ? b.m13824a(context, attributeSet) : new EdgeEffect(context);
    }

    /* renamed from: b */
    public static float m13820b(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return b.m13825b(edgeEffect);
        }
        return 0.0f;
    }

    /* renamed from: c */
    public static void m13821c(EdgeEffect edgeEffect, float f10, float f11) {
        if (Build.VERSION.SDK_INT >= 21) {
            a.m13823a(edgeEffect, f10, f11);
        } else {
            edgeEffect.onPull(f10);
        }
    }

    /* renamed from: d */
    public static float m13822d(EdgeEffect edgeEffect, float f10, float f11) {
        if (Build.VERSION.SDK_INT >= 31) {
            return b.m13826c(edgeEffect, f10, f11);
        }
        m13821c(edgeEffect, f10, f11);
        return f10;
    }
}
