package androidx.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.AbstractC0344f;
import androidx.lifecycle.InterfaceC0350i;
import androidx.lifecycle.InterfaceC0354k;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
final class ImmLeaksCleaner implements InterfaceC0350i {

    /* renamed from: i */
    public static int f447i;

    /* renamed from: j */
    public static Field f448j;

    /* renamed from: k */
    public static Field f449k;

    /* renamed from: l */
    public static Field f450l;

    /* renamed from: h */
    public Activity f451h;

    public ImmLeaksCleaner(Activity activity) {
        this.f451h = activity;
    }

    @SuppressLint({"SoonBlockedPrivateApi"})
    /* renamed from: b */
    public static void m580b() {
        try {
            f447i = 2;
            Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
            f449k = declaredField;
            declaredField.setAccessible(true);
            Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
            f450l = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
            f448j = declaredField3;
            declaredField3.setAccessible(true);
            f447i = 1;
        } catch (NoSuchFieldException unused) {
        }
    }

    @Override // androidx.lifecycle.InterfaceC0350i
    /* renamed from: a */
    public void mo571a(InterfaceC0354k interfaceC0354k, AbstractC0344f.a aVar) {
        if (aVar != AbstractC0344f.a.ON_DESTROY) {
            return;
        }
        if (f447i == 0) {
            m580b();
        }
        if (f447i == 1) {
            InputMethodManager inputMethodManager = (InputMethodManager) this.f451h.getSystemService("input_method");
            try {
                Object obj = f448j.get(inputMethodManager);
                if (obj == null) {
                    return;
                }
                synchronized (obj) {
                    try {
                        try {
                            View view = (View) f449k.get(inputMethodManager);
                            if (view == null) {
                                return;
                            }
                            if (view.isAttachedToWindow()) {
                                return;
                            }
                            try {
                                f450l.set(inputMethodManager, null);
                                inputMethodManager.isActive();
                            } catch (IllegalAccessException unused) {
                            }
                        } catch (ClassCastException unused2) {
                        } catch (IllegalAccessException unused3) {
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (IllegalAccessException unused4) {
            }
        }
    }
}
