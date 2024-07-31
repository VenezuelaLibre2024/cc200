package p188n0;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.widget.CheckedTextView;
import java.lang.reflect.Field;

/* renamed from: n0.c */
/* loaded from: classes.dex */
public final class C3676c {

    /* renamed from: n0.c$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public static Field f13117a;

        /* renamed from: b */
        public static boolean f13118b;

        /* renamed from: a */
        public static Drawable m13807a(CheckedTextView checkedTextView) {
            if (!f13118b) {
                try {
                    Field declaredField = CheckedTextView.class.getDeclaredField("mCheckMarkDrawable");
                    f13117a = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException e10) {
                    Log.i("CheckedTextViewCompat", "Failed to retrieve mCheckMarkDrawable field", e10);
                }
                f13118b = true;
            }
            Field field = f13117a;
            if (field != null) {
                try {
                    return (Drawable) field.get(checkedTextView);
                } catch (IllegalAccessException e11) {
                    Log.i("CheckedTextViewCompat", "Failed to get check mark drawable via reflection", e11);
                    f13117a = null;
                }
            }
            return null;
        }
    }

    /* renamed from: n0.c$b */
    /* loaded from: classes.dex */
    public static class b {
        /* renamed from: a */
        public static Drawable m13808a(CheckedTextView checkedTextView) {
            return checkedTextView.getCheckMarkDrawable();
        }
    }

    /* renamed from: n0.c$c */
    /* loaded from: classes.dex */
    public static class c {
        /* renamed from: a */
        public static void m13809a(CheckedTextView checkedTextView, ColorStateList colorStateList) {
            checkedTextView.setCheckMarkTintList(colorStateList);
        }

        /* renamed from: b */
        public static void m13810b(CheckedTextView checkedTextView, PorterDuff.Mode mode) {
            checkedTextView.setCheckMarkTintMode(mode);
        }
    }

    /* renamed from: a */
    public static Drawable m13804a(CheckedTextView checkedTextView) {
        return Build.VERSION.SDK_INT >= 16 ? b.m13808a(checkedTextView) : a.m13807a(checkedTextView);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public static void m13805b(CheckedTextView checkedTextView, ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT >= 21) {
            c.m13809a(checkedTextView, colorStateList);
        } else if (checkedTextView instanceof InterfaceC3685l) {
            ((InterfaceC3685l) checkedTextView).setSupportCheckMarkTintList(colorStateList);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public static void m13806c(CheckedTextView checkedTextView, PorterDuff.Mode mode) {
        if (Build.VERSION.SDK_INT >= 21) {
            c.m13810b(checkedTextView, mode);
        } else if (checkedTextView instanceof InterfaceC3685l) {
            ((InterfaceC3685l) checkedTextView).setSupportCheckMarkTintMode(mode);
        }
    }
}
