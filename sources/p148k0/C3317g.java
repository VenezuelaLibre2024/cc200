package p148k0;

import android.os.Build;
import android.util.Log;
import android.view.LayoutInflater;
import java.lang.reflect.Field;

/* renamed from: k0.g */
/* loaded from: classes.dex */
public final class C3317g {

    /* renamed from: a */
    public static Field f11579a;

    /* renamed from: b */
    public static boolean f11580b;

    /* renamed from: a */
    public static void m12236a(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
        if (!f11580b) {
            try {
                Field declaredField = LayoutInflater.class.getDeclaredField("mFactory2");
                f11579a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e10) {
                Log.e("LayoutInflaterCompatHC", "forceSetFactory2 Could not find field 'mFactory2' on class " + LayoutInflater.class.getName() + "; inflation may have unexpected results.", e10);
            }
            f11580b = true;
        }
        Field field = f11579a;
        if (field != null) {
            try {
                field.set(layoutInflater, factory2);
            } catch (IllegalAccessException e11) {
                Log.e("LayoutInflaterCompatHC", "forceSetFactory2 could not set the Factory2 on LayoutInflater " + layoutInflater + "; inflation may have unexpected results.", e11);
            }
        }
    }

    /* renamed from: b */
    public static void m12237b(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
        layoutInflater.setFactory2(factory2);
        if (Build.VERSION.SDK_INT < 21) {
            LayoutInflater.Factory factory = layoutInflater.getFactory();
            if (factory instanceof LayoutInflater.Factory2) {
                m12236a(layoutInflater, (LayoutInflater.Factory2) factory);
            } else {
                m12236a(layoutInflater, factory2);
            }
        }
    }
}
