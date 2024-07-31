package p148k0;

import android.os.Build;
import android.view.ViewGroup;

/* renamed from: k0.h */
/* loaded from: classes.dex */
public final class C3319h {

    /* renamed from: k0.h$a */
    /* loaded from: classes.dex */
    public static class a {
        /* renamed from: a */
        public static int m12240a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.getLayoutDirection();
        }

        /* renamed from: b */
        public static int m12241b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.getMarginEnd();
        }

        /* renamed from: c */
        public static int m12242c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.getMarginStart();
        }

        /* renamed from: d */
        public static boolean m12243d(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.isMarginRelative();
        }

        /* renamed from: e */
        public static void m12244e(ViewGroup.MarginLayoutParams marginLayoutParams, int i10) {
            marginLayoutParams.resolveLayoutDirection(i10);
        }

        /* renamed from: f */
        public static void m12245f(ViewGroup.MarginLayoutParams marginLayoutParams, int i10) {
            marginLayoutParams.setLayoutDirection(i10);
        }

        /* renamed from: g */
        public static void m12246g(ViewGroup.MarginLayoutParams marginLayoutParams, int i10) {
            marginLayoutParams.setMarginEnd(i10);
        }

        /* renamed from: h */
        public static void m12247h(ViewGroup.MarginLayoutParams marginLayoutParams, int i10) {
            marginLayoutParams.setMarginStart(i10);
        }
    }

    /* renamed from: a */
    public static int m12238a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return Build.VERSION.SDK_INT >= 17 ? a.m12241b(marginLayoutParams) : marginLayoutParams.rightMargin;
    }

    /* renamed from: b */
    public static int m12239b(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return Build.VERSION.SDK_INT >= 17 ? a.m12242c(marginLayoutParams) : marginLayoutParams.leftMargin;
    }
}
