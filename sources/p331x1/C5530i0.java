package p331x1;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: x1.i0 */
/* loaded from: classes.dex */
public class C5530i0 {

    /* renamed from: a */
    public static Method f20705a;

    /* renamed from: b */
    public static boolean f20706b;

    /* renamed from: c */
    public static Field f20707c;

    /* renamed from: d */
    public static boolean f20708d;

    /* renamed from: a */
    public void mo22241a(View view) {
        if (view.getVisibility() == 0) {
            view.setTag(C5531j.f20709a, null);
        }
    }

    @SuppressLint({"PrivateApi", "SoonBlockedPrivateApi"})
    /* renamed from: b */
    public final void m22257b() {
        if (f20706b) {
            return;
        }
        try {
            Class cls = Integer.TYPE;
            Method declaredMethod = View.class.getDeclaredMethod("setFrame", cls, cls, cls, cls);
            f20705a = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException e10) {
            Log.i("ViewUtilsBase", "Failed to retrieve setFrame method", e10);
        }
        f20706b = true;
    }

    /* renamed from: c */
    public float mo22242c(View view) {
        Float f10 = (Float) view.getTag(C5531j.f20709a);
        float alpha = view.getAlpha();
        return f10 != null ? alpha / f10.floatValue() : alpha;
    }

    /* renamed from: d */
    public void mo22243d(View view) {
        int i10 = C5531j.f20709a;
        if (view.getTag(i10) == null) {
            view.setTag(i10, Float.valueOf(view.getAlpha()));
        }
    }

    /* renamed from: e */
    public void mo22251e(View view, int i10, int i11, int i12, int i13) {
        m22257b();
        Method method = f20705a;
        if (method != null) {
            try {
                method.invoke(view, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13));
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e10) {
                throw new RuntimeException(e10.getCause());
            }
        }
    }

    /* renamed from: f */
    public void mo22244f(View view, float f10) {
        Float f11 = (Float) view.getTag(C5531j.f20709a);
        if (f11 != null) {
            view.setAlpha(f11.floatValue() * f10);
        } else {
            view.setAlpha(f10);
        }
    }

    /* renamed from: g */
    public void mo22253g(View view, int i10) {
        if (!f20708d) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f20707c = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsBase", "fetchViewFlagsField: ");
            }
            f20708d = true;
        }
        Field field = f20707c;
        if (field != null) {
            try {
                f20707c.setInt(view, i10 | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    /* renamed from: h */
    public void mo22248h(View view, Matrix matrix) {
        Object parent = view.getParent();
        if (parent instanceof View) {
            mo22248h((View) parent, matrix);
            matrix.preTranslate(-r0.getScrollX(), -r0.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        Matrix matrix2 = view.getMatrix();
        if (matrix2.isIdentity()) {
            return;
        }
        matrix.preConcat(matrix2);
    }

    /* renamed from: i */
    public void mo22249i(View view, Matrix matrix) {
        Object parent = view.getParent();
        if (parent instanceof View) {
            mo22249i((View) parent, matrix);
            matrix.postTranslate(r0.getScrollX(), r0.getScrollY());
        }
        matrix.postTranslate(-view.getLeft(), -view.getTop());
        Matrix matrix2 = view.getMatrix();
        if (matrix2.isIdentity()) {
            return;
        }
        Matrix matrix3 = new Matrix();
        if (matrix2.invert(matrix3)) {
            matrix.postConcat(matrix3);
        }
    }
}
