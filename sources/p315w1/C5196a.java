package p315w1;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: w1.a */
/* loaded from: classes.dex */
public final class C5196a {

    /* renamed from: a */
    public static long f19718a;

    /* renamed from: b */
    public static Method f19719b;

    /* renamed from: c */
    public static Method f19720c;

    /* renamed from: d */
    public static Method f19721d;

    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public static void m21033a(String str, int i10) {
        try {
            if (f19720c == null) {
                C5198c.m21044a(str, i10);
                return;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        m21034b(str, i10);
    }

    /* renamed from: b */
    public static void m21034b(String str, int i10) {
        if (Build.VERSION.SDK_INT >= 18) {
            try {
                if (f19720c == null) {
                    f19720c = Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
                }
                f19720c.invoke(null, Long.valueOf(f19718a), str, Integer.valueOf(i10));
            } catch (Exception e10) {
                m21039g("asyncTraceBegin", e10);
            }
        }
    }

    /* renamed from: c */
    public static void m21035c(String str) {
        if (Build.VERSION.SDK_INT >= 18) {
            C5197b.m21042a(str);
        }
    }

    @SuppressLint({"NewApi"})
    /* renamed from: d */
    public static void m21036d(String str, int i10) {
        try {
            if (f19721d == null) {
                C5198c.m21045b(str, i10);
                return;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        m21037e(str, i10);
    }

    /* renamed from: e */
    public static void m21037e(String str, int i10) {
        if (Build.VERSION.SDK_INT >= 18) {
            try {
                if (f19721d == null) {
                    f19721d = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
                }
                f19721d.invoke(null, Long.valueOf(f19718a), str, Integer.valueOf(i10));
            } catch (Exception e10) {
                m21039g("asyncTraceEnd", e10);
            }
        }
    }

    /* renamed from: f */
    public static void m21038f() {
        if (Build.VERSION.SDK_INT >= 18) {
            C5197b.m21043b();
        }
    }

    /* renamed from: g */
    public static void m21039g(String str, Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (!(cause instanceof RuntimeException)) {
                throw new RuntimeException(cause);
            }
            throw ((RuntimeException) cause);
        }
        Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }

    @SuppressLint({"NewApi"})
    /* renamed from: h */
    public static boolean m21040h() {
        try {
            if (f19719b == null) {
                return Trace.isEnabled();
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        return m21041i();
    }

    /* renamed from: i */
    public static boolean m21041i() {
        if (Build.VERSION.SDK_INT >= 18) {
            try {
                if (f19719b == null) {
                    f19718a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                    f19719b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
                }
                return ((Boolean) f19719b.invoke(null, Long.valueOf(f19718a))).booleanValue();
            } catch (Exception e10) {
                m21039g("isTagEnabled", e10);
            }
        }
        return false;
    }
}
