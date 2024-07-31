package p151k3;

import android.os.Build;
import android.util.Log;

/* renamed from: k3.a */
/* loaded from: classes.dex */
public final class C3347a {
    /* renamed from: a */
    public static String m12403a(String str, String str2) {
        String str3 = str + str2;
        return str3.length() > 23 ? str3.substring(0, 23) : str3;
    }

    /* renamed from: b */
    public static void m12404b(String str, String str2, Object obj) {
        String m12407e = m12407e(str);
        if (Log.isLoggable(m12407e, 3)) {
            Log.d(m12407e, String.format(str2, obj));
        }
    }

    /* renamed from: c */
    public static void m12405c(String str, String str2, Object... objArr) {
        String m12407e = m12407e(str);
        if (Log.isLoggable(m12407e, 3)) {
            Log.d(m12407e, String.format(str2, objArr));
        }
    }

    /* renamed from: d */
    public static void m12406d(String str, String str2, Throwable th) {
        String m12407e = m12407e(str);
        if (Log.isLoggable(m12407e, 6)) {
            Log.e(m12407e, str2, th);
        }
    }

    /* renamed from: e */
    public static String m12407e(String str) {
        if (Build.VERSION.SDK_INT < 26) {
            return m12403a("TRuntime.", str);
        }
        return "TRuntime." + str;
    }

    /* renamed from: f */
    public static void m12408f(String str, String str2, Object obj) {
        String m12407e = m12407e(str);
        if (Log.isLoggable(m12407e, 4)) {
            Log.i(m12407e, String.format(str2, obj));
        }
    }

    /* renamed from: g */
    public static void m12409g(String str, String str2, Object obj) {
        String m12407e = m12407e(str);
        if (Log.isLoggable(m12407e, 5)) {
            Log.w(m12407e, String.format(str2, obj));
        }
    }
}
