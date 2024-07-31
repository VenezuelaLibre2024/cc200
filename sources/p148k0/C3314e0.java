package p148k0;

import android.os.Build;
import android.view.ViewGroup;
import p313w.C5186e;

/* renamed from: k0.e0 */
/* loaded from: classes.dex */
public final class C3314e0 {

    /* renamed from: k0.e0$a */
    /* loaded from: classes.dex */
    public static class a {
        /* renamed from: a */
        public static int m12213a(ViewGroup viewGroup) {
            return viewGroup.getNestedScrollAxes();
        }

        /* renamed from: b */
        public static boolean m12214b(ViewGroup viewGroup) {
            return viewGroup.isTransitionGroup();
        }

        /* renamed from: c */
        public static void m12215c(ViewGroup viewGroup, boolean z10) {
            viewGroup.setTransitionGroup(z10);
        }
    }

    /* renamed from: a */
    public static boolean m12212a(ViewGroup viewGroup) {
        if (Build.VERSION.SDK_INT >= 21) {
            return a.m12214b(viewGroup);
        }
        Boolean bool = (Boolean) viewGroup.getTag(C5186e.f19630f0);
        return ((bool == null || !bool.booleanValue()) && viewGroup.getBackground() == null && C3308b0.m11987A(viewGroup) == null) ? false : true;
    }
}
