package p187n;

import android.R;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.os.Build;
import p015b0.InterfaceC0438c;
import p132j.C3200c;

/* renamed from: n.h0 */
/* loaded from: classes.dex */
public class C3637h0 {

    /* renamed from: a */
    public static final int[] f12857a = {R.attr.state_checked};

    /* renamed from: b */
    public static final int[] f12858b = new int[0];

    /* renamed from: c */
    public static final Rect f12859c = new Rect();

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static boolean m13511a(Drawable drawable) {
        Drawable drawable2;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 17) {
            return true;
        }
        if (i10 < 15 && (drawable instanceof InsetDrawable)) {
            return false;
        }
        if (i10 < 15 && (drawable instanceof GradientDrawable)) {
            return false;
        }
        if (i10 < 17 && (drawable instanceof LayerDrawable)) {
            return false;
        }
        if (!(drawable instanceof DrawableContainer)) {
            if (drawable instanceof InterfaceC0438c) {
                drawable2 = ((InterfaceC0438c) drawable).mo2283b();
            } else if (drawable instanceof C3200c) {
                drawable2 = ((C3200c) drawable).m11394a();
            } else if (drawable instanceof ScaleDrawable) {
                drawable2 = ((ScaleDrawable) drawable).getDrawable();
            }
            return m13511a(drawable2);
        }
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState instanceof DrawableContainer.DrawableContainerState) {
            for (Drawable drawable3 : ((DrawableContainer.DrawableContainerState) constantState).getChildren()) {
                if (!m13511a(drawable3)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: b */
    public static void m13512b(Drawable drawable) {
        String name = drawable.getClass().getName();
        int i10 = Build.VERSION.SDK_INT;
        if (!(i10 == 21 && "android.graphics.drawable.VectorDrawable".equals(name)) && (i10 < 29 || i10 >= 31 || !"android.graphics.drawable.ColorStateListDrawable".equals(name))) {
            return;
        }
        m13513c(drawable);
    }

    /* renamed from: c */
    public static void m13513c(Drawable drawable) {
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(f12857a);
        } else {
            drawable.setState(f12858b);
        }
        drawable.setState(state);
    }

    /* renamed from: d */
    public static PorterDuff.Mode m13514d(int i10, PorterDuff.Mode mode) {
        if (i10 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i10 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i10 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i10) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
