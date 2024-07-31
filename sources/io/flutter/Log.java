package io.flutter;

/* loaded from: classes2.dex */
public class Log {
    public static int ASSERT = 7;
    public static int DEBUG = 3;
    public static int ERROR = 6;
    public static int INFO = 4;
    public static int VERBOSE = 2;
    public static int WARN = 5;
    private static int logLevel = 3;

    /* renamed from: d */
    public static void m11039d(String str, String str2) {
    }

    /* renamed from: d */
    public static void m11040d(String str, String str2, Throwable th) {
    }

    /* renamed from: e */
    public static void m11041e(String str, String str2) {
        android.util.Log.e(str, str2);
    }

    /* renamed from: e */
    public static void m11042e(String str, String str2, Throwable th) {
        android.util.Log.e(str, str2, th);
    }

    public static String getStackTraceString(Throwable th) {
        return android.util.Log.getStackTraceString(th);
    }

    /* renamed from: i */
    public static void m11043i(String str, String str2) {
    }

    /* renamed from: i */
    public static void m11044i(String str, String str2, Throwable th) {
    }

    public static void println(int i10, String str, String str2) {
    }

    public static void setLogLevel(int i10) {
        logLevel = i10;
    }

    /* renamed from: v */
    public static void m11045v(String str, String str2) {
    }

    /* renamed from: v */
    public static void m11046v(String str, String str2, Throwable th) {
    }

    /* renamed from: w */
    public static void m11047w(String str, String str2) {
        android.util.Log.w(str, str2);
    }

    /* renamed from: w */
    public static void m11048w(String str, String str2, Throwable th) {
        android.util.Log.w(str, str2, th);
    }

    public static void wtf(String str, String str2) {
        android.util.Log.wtf(str, str2);
    }

    public static void wtf(String str, String str2, Throwable th) {
        android.util.Log.wtf(str, str2, th);
    }
}
