package mc;

import android.util.Log;

/* renamed from: mc.a */
/* loaded from: classes2.dex */
public final class C3609a {

    /* renamed from: a */
    public static int f12738a = 5;

    /* renamed from: a */
    public static void m13356a(Exception exc) {
        if (m13359d()) {
            exc.printStackTrace();
        }
    }

    /* renamed from: b */
    public static void m13357b(Object obj) {
        if (m13359d()) {
            Log.e("RootBeer", m13358c() + String.valueOf(obj));
            Log.e("QLog", m13358c() + String.valueOf(obj));
        }
    }

    /* renamed from: c */
    public static String m13358c() {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        String methodName = stackTrace[2].getMethodName();
        String className = stackTrace[2].getClassName();
        int lineNumber = stackTrace[2].getLineNumber();
        return className.substring(className.lastIndexOf(46) + 1) + ": " + methodName + "() [" + lineNumber + "] - ";
    }

    /* renamed from: d */
    public static boolean m13359d() {
        return f12738a > 0;
    }

    /* renamed from: e */
    public static boolean m13360e() {
        return f12738a > 4;
    }

    /* renamed from: f */
    public static void m13361f(Object obj) {
        if (m13360e()) {
            Log.v("RootBeer", m13358c() + String.valueOf(obj));
        }
    }
}
