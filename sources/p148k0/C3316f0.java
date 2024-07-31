package p148k0;

import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;

/* renamed from: k0.f0 */
/* loaded from: classes.dex */
public final class C3316f0 {

    /* renamed from: k0.f0$a */
    /* loaded from: classes.dex */
    public static class a {
        /* renamed from: a */
        public static boolean m12229a(ViewParent viewParent, View view, float f10, float f11, boolean z10) {
            return viewParent.onNestedFling(view, f10, f11, z10);
        }

        /* renamed from: b */
        public static boolean m12230b(ViewParent viewParent, View view, float f10, float f11) {
            return viewParent.onNestedPreFling(view, f10, f11);
        }

        /* renamed from: c */
        public static void m12231c(ViewParent viewParent, View view, int i10, int i11, int[] iArr) {
            viewParent.onNestedPreScroll(view, i10, i11, iArr);
        }

        /* renamed from: d */
        public static void m12232d(ViewParent viewParent, View view, int i10, int i11, int i12, int i13) {
            viewParent.onNestedScroll(view, i10, i11, i12, i13);
        }

        /* renamed from: e */
        public static void m12233e(ViewParent viewParent, View view, View view2, int i10) {
            viewParent.onNestedScrollAccepted(view, view2, i10);
        }

        /* renamed from: f */
        public static boolean m12234f(ViewParent viewParent, View view, View view2, int i10) {
            return viewParent.onStartNestedScroll(view, view2, i10);
        }

        /* renamed from: g */
        public static void m12235g(ViewParent viewParent, View view) {
            viewParent.onStopNestedScroll(view);
        }
    }

    /* renamed from: a */
    public static boolean m12222a(ViewParent viewParent, View view, float f10, float f11, boolean z10) {
        if (Build.VERSION.SDK_INT < 21) {
            if (viewParent instanceof InterfaceC3337t) {
                return ((InterfaceC3337t) viewParent).onNestedFling(view, f10, f11, z10);
            }
            return false;
        }
        try {
            return a.m12229a(viewParent, view, f10, f11, z10);
        } catch (AbstractMethodError e10) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedFling", e10);
            return false;
        }
    }

    /* renamed from: b */
    public static boolean m12223b(ViewParent viewParent, View view, float f10, float f11) {
        if (Build.VERSION.SDK_INT < 21) {
            if (viewParent instanceof InterfaceC3337t) {
                return ((InterfaceC3337t) viewParent).onNestedPreFling(view, f10, f11);
            }
            return false;
        }
        try {
            return a.m12230b(viewParent, view, f10, f11);
        } catch (AbstractMethodError e10) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedPreFling", e10);
            return false;
        }
    }

    /* renamed from: c */
    public static void m12224c(ViewParent viewParent, View view, int i10, int i11, int[] iArr, int i12) {
        if (viewParent instanceof InterfaceC3335r) {
            ((InterfaceC3335r) viewParent).onNestedPreScroll(view, i10, i11, iArr, i12);
            return;
        }
        if (i12 == 0) {
            if (Build.VERSION.SDK_INT < 21) {
                if (viewParent instanceof InterfaceC3337t) {
                    ((InterfaceC3337t) viewParent).onNestedPreScroll(view, i10, i11, iArr);
                    return;
                }
                return;
            }
            try {
                a.m12231c(viewParent, view, i10, i11, iArr);
            } catch (AbstractMethodError e10) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedPreScroll", e10);
            }
        }
    }

    /* renamed from: d */
    public static void m12225d(ViewParent viewParent, View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        if (viewParent instanceof InterfaceC3336s) {
            ((InterfaceC3336s) viewParent).onNestedScroll(view, i10, i11, i12, i13, i14, iArr);
            return;
        }
        iArr[0] = iArr[0] + i12;
        iArr[1] = iArr[1] + i13;
        if (viewParent instanceof InterfaceC3335r) {
            ((InterfaceC3335r) viewParent).onNestedScroll(view, i10, i11, i12, i13, i14);
            return;
        }
        if (i14 == 0) {
            if (Build.VERSION.SDK_INT < 21) {
                if (viewParent instanceof InterfaceC3337t) {
                    ((InterfaceC3337t) viewParent).onNestedScroll(view, i10, i11, i12, i13);
                    return;
                }
                return;
            }
            try {
                a.m12232d(viewParent, view, i10, i11, i12, i13);
            } catch (AbstractMethodError e10) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedScroll", e10);
            }
        }
    }

    /* renamed from: e */
    public static void m12226e(ViewParent viewParent, View view, View view2, int i10, int i11) {
        if (viewParent instanceof InterfaceC3335r) {
            ((InterfaceC3335r) viewParent).onNestedScrollAccepted(view, view2, i10, i11);
            return;
        }
        if (i11 == 0) {
            if (Build.VERSION.SDK_INT < 21) {
                if (viewParent instanceof InterfaceC3337t) {
                    ((InterfaceC3337t) viewParent).onNestedScrollAccepted(view, view2, i10);
                    return;
                }
                return;
            }
            try {
                a.m12233e(viewParent, view, view2, i10);
            } catch (AbstractMethodError e10) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedScrollAccepted", e10);
            }
        }
    }

    /* renamed from: f */
    public static boolean m12227f(ViewParent viewParent, View view, View view2, int i10, int i11) {
        if (viewParent instanceof InterfaceC3335r) {
            return ((InterfaceC3335r) viewParent).onStartNestedScroll(view, view2, i10, i11);
        }
        if (i11 != 0) {
            return false;
        }
        if (Build.VERSION.SDK_INT < 21) {
            if (viewParent instanceof InterfaceC3337t) {
                return ((InterfaceC3337t) viewParent).onStartNestedScroll(view, view2, i10);
            }
            return false;
        }
        try {
            return a.m12234f(viewParent, view, view2, i10);
        } catch (AbstractMethodError e10) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onStartNestedScroll", e10);
            return false;
        }
    }

    /* renamed from: g */
    public static void m12228g(ViewParent viewParent, View view, int i10) {
        if (viewParent instanceof InterfaceC3335r) {
            ((InterfaceC3335r) viewParent).onStopNestedScroll(view, i10);
            return;
        }
        if (i10 == 0) {
            if (Build.VERSION.SDK_INT < 21) {
                if (viewParent instanceof InterfaceC3337t) {
                    ((InterfaceC3337t) viewParent).onStopNestedScroll(view);
                    return;
                }
                return;
            }
            try {
                a.m12235g(viewParent, view);
            } catch (AbstractMethodError e10) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onStopNestedScroll", e10);
            }
        }
    }
}
