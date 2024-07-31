package p148k0;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: k0.f */
/* loaded from: classes.dex */
public class C3315f {

    /* renamed from: a */
    public static boolean f11575a = false;

    /* renamed from: b */
    public static Method f11576b = null;

    /* renamed from: c */
    public static boolean f11577c = false;

    /* renamed from: d */
    public static Field f11578d;

    /* renamed from: k0.f$a */
    /* loaded from: classes.dex */
    public interface a {
        boolean superDispatchKeyEvent(KeyEvent keyEvent);
    }

    /* renamed from: a */
    public static boolean m12216a(ActionBar actionBar, KeyEvent keyEvent) {
        if (!f11575a) {
            try {
                f11576b = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
            } catch (NoSuchMethodException unused) {
            }
            f11575a = true;
        }
        Method method = f11576b;
        if (method != null) {
            try {
                Object invoke = method.invoke(actionBar, keyEvent);
                if (invoke == null) {
                    return false;
                }
                return ((Boolean) invoke).booleanValue();
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m12217b(Activity activity, KeyEvent keyEvent) {
        activity.onUserInteraction();
        Window window = activity.getWindow();
        if (window.hasFeature(8)) {
            ActionBar actionBar = activity.getActionBar();
            if (keyEvent.getKeyCode() == 82 && actionBar != null && m12216a(actionBar, keyEvent)) {
                return true;
            }
        }
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (C3308b0.m12027h(decorView, keyEvent)) {
            return true;
        }
        return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
    }

    /* renamed from: c */
    public static boolean m12218c(Dialog dialog, KeyEvent keyEvent) {
        DialogInterface.OnKeyListener m12221f = m12221f(dialog);
        if (m12221f != null && m12221f.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
            return true;
        }
        Window window = dialog.getWindow();
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (C3308b0.m12027h(decorView, keyEvent)) {
            return true;
        }
        return keyEvent.dispatch(dialog, decorView != null ? decorView.getKeyDispatcherState() : null, dialog);
    }

    /* renamed from: d */
    public static boolean m12219d(View view, KeyEvent keyEvent) {
        return C3308b0.m12029i(view, keyEvent);
    }

    @SuppressLint({"LambdaLast"})
    /* renamed from: e */
    public static boolean m12220e(a aVar, View view, Window.Callback callback, KeyEvent keyEvent) {
        if (aVar == null) {
            return false;
        }
        return Build.VERSION.SDK_INT >= 28 ? aVar.superDispatchKeyEvent(keyEvent) : callback instanceof Activity ? m12217b((Activity) callback, keyEvent) : callback instanceof Dialog ? m12218c((Dialog) callback, keyEvent) : (view != null && C3308b0.m12027h(view, keyEvent)) || aVar.superDispatchKeyEvent(keyEvent);
    }

    /* renamed from: f */
    public static DialogInterface.OnKeyListener m12221f(Dialog dialog) {
        if (!f11577c) {
            try {
                Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                f11578d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f11577c = true;
        }
        Field field = f11578d;
        if (field == null) {
            return null;
        }
        try {
            return (DialogInterface.OnKeyListener) field.get(dialog);
        } catch (IllegalAccessException unused2) {
            return null;
        }
    }
}
