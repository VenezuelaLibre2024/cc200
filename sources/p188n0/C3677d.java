package p188n0;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.widget.CompoundButton;
import java.lang.reflect.Field;

/* renamed from: n0.d */
/* loaded from: classes.dex */
public final class C3677d {

    /* renamed from: a */
    public static Field f13119a;

    /* renamed from: b */
    public static boolean f13120b;

    /* renamed from: n0.d$a */
    /* loaded from: classes.dex */
    public static class a {
        /* renamed from: a */
        public static ColorStateList m13814a(CompoundButton compoundButton) {
            return compoundButton.getButtonTintList();
        }

        /* renamed from: b */
        public static PorterDuff.Mode m13815b(CompoundButton compoundButton) {
            return compoundButton.getButtonTintMode();
        }

        /* renamed from: c */
        public static void m13816c(CompoundButton compoundButton, ColorStateList colorStateList) {
            compoundButton.setButtonTintList(colorStateList);
        }

        /* renamed from: d */
        public static void m13817d(CompoundButton compoundButton, PorterDuff.Mode mode) {
            compoundButton.setButtonTintMode(mode);
        }
    }

    /* renamed from: n0.d$b */
    /* loaded from: classes.dex */
    public static class b {
        /* renamed from: a */
        public static Drawable m13818a(CompoundButton compoundButton) {
            return compoundButton.getButtonDrawable();
        }
    }

    /* renamed from: a */
    public static Drawable m13811a(CompoundButton compoundButton) {
        if (Build.VERSION.SDK_INT >= 23) {
            return b.m13818a(compoundButton);
        }
        if (!f13120b) {
            try {
                Field declaredField = CompoundButton.class.getDeclaredField("mButtonDrawable");
                f13119a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e10) {
                Log.i("CompoundButtonCompat", "Failed to retrieve mButtonDrawable field", e10);
            }
            f13120b = true;
        }
        Field field = f13119a;
        if (field != null) {
            try {
                return (Drawable) field.get(compoundButton);
            } catch (IllegalAccessException e11) {
                Log.i("CompoundButtonCompat", "Failed to get button drawable via reflection", e11);
                f13119a = null;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public static void m13812b(CompoundButton compoundButton, ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT >= 21) {
            a.m13816c(compoundButton, colorStateList);
        } else if (compoundButton instanceof InterfaceC3686m) {
            ((InterfaceC3686m) compoundButton).setSupportButtonTintList(colorStateList);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public static void m13813c(CompoundButton compoundButton, PorterDuff.Mode mode) {
        if (Build.VERSION.SDK_INT >= 21) {
            a.m13817d(compoundButton, mode);
        } else if (compoundButton instanceof InterfaceC3686m) {
            ((InterfaceC3686m) compoundButton).setSupportButtonTintMode(mode);
        }
    }
}
