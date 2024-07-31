package p188n0;

import android.os.Build;
import android.util.Log;
import android.view.View;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import p148k0.C3308b0;
import p148k0.C3313e;

/* renamed from: n0.i */
/* loaded from: classes.dex */
public final class C3682i {

    /* renamed from: a */
    public static Method f13122a;

    /* renamed from: b */
    public static boolean f13123b;

    /* renamed from: c */
    public static Field f13124c;

    /* renamed from: d */
    public static boolean f13125d;

    /* renamed from: n0.i$a */
    /* loaded from: classes.dex */
    public static class a {
        /* renamed from: a */
        public static void m13842a(PopupWindow popupWindow, View view, int i10, int i11, int i12) {
            popupWindow.showAsDropDown(view, i10, i11, i12);
        }
    }

    /* renamed from: n0.i$b */
    /* loaded from: classes.dex */
    public static class b {
        /* renamed from: a */
        public static boolean m13843a(PopupWindow popupWindow) {
            return popupWindow.getOverlapAnchor();
        }

        /* renamed from: b */
        public static int m13844b(PopupWindow popupWindow) {
            return popupWindow.getWindowLayoutType();
        }

        /* renamed from: c */
        public static void m13845c(PopupWindow popupWindow, boolean z10) {
            popupWindow.setOverlapAnchor(z10);
        }

        /* renamed from: d */
        public static void m13846d(PopupWindow popupWindow, int i10) {
            popupWindow.setWindowLayoutType(i10);
        }
    }

    /* renamed from: a */
    public static void m13839a(PopupWindow popupWindow, boolean z10) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 23) {
            b.m13845c(popupWindow, z10);
            return;
        }
        if (i10 >= 21) {
            if (!f13125d) {
                try {
                    Field declaredField = PopupWindow.class.getDeclaredField("mOverlapAnchor");
                    f13124c = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException e10) {
                    Log.i("PopupWindowCompatApi21", "Could not fetch mOverlapAnchor field from PopupWindow", e10);
                }
                f13125d = true;
            }
            Field field = f13124c;
            if (field != null) {
                try {
                    field.set(popupWindow, Boolean.valueOf(z10));
                } catch (IllegalAccessException e11) {
                    Log.i("PopupWindowCompatApi21", "Could not set overlap anchor field in PopupWindow", e11);
                }
            }
        }
    }

    /* renamed from: b */
    public static void m13840b(PopupWindow popupWindow, int i10) {
        if (Build.VERSION.SDK_INT >= 23) {
            b.m13846d(popupWindow, i10);
            return;
        }
        if (!f13123b) {
            try {
                Method declaredMethod = PopupWindow.class.getDeclaredMethod("setWindowLayoutType", Integer.TYPE);
                f13122a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (Exception unused) {
            }
            f13123b = true;
        }
        Method method = f13122a;
        if (method != null) {
            try {
                method.invoke(popupWindow, Integer.valueOf(i10));
            } catch (Exception unused2) {
            }
        }
    }

    /* renamed from: c */
    public static void m13841c(PopupWindow popupWindow, View view, int i10, int i11, int i12) {
        if (Build.VERSION.SDK_INT >= 19) {
            a.m13842a(popupWindow, view, i10, i11, i12);
            return;
        }
        if ((C3313e.m12211a(i12, C3308b0.m12048v(view)) & 7) == 5) {
            i10 -= popupWindow.getWidth() - view.getWidth();
        }
        popupWindow.showAsDropDown(view, i10, i11);
    }
}
