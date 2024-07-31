package p090g0;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.Method;

@Deprecated
/* renamed from: g0.p */
/* loaded from: classes.dex */
public final class C1956p {

    /* renamed from: a */
    public static long f7768a;

    /* renamed from: b */
    public static Method f7769b;

    /* renamed from: c */
    public static Method f7770c;

    /* renamed from: d */
    public static Method f7771d;

    /* renamed from: e */
    public static Method f7772e;

    /* renamed from: g0.p$a */
    /* loaded from: classes.dex */
    public static class a {
        /* renamed from: a */
        public static void m7877a(String str) {
            Trace.beginSection(str);
        }

        /* renamed from: b */
        public static void m7878b() {
            Trace.endSection();
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 18 || i10 >= 29) {
            return;
        }
        try {
            f7768a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
            Class cls = Long.TYPE;
            f7769b = Trace.class.getMethod("isTagEnabled", cls);
            Class cls2 = Integer.TYPE;
            f7770c = Trace.class.getMethod("asyncTraceBegin", cls, String.class, cls2);
            f7771d = Trace.class.getMethod("asyncTraceEnd", cls, String.class, cls2);
            f7772e = Trace.class.getMethod("traceCounter", cls, String.class, cls2);
        } catch (Exception e10) {
            Log.i("TraceCompat", "Unable to initialize via reflection.", e10);
        }
    }

    /* renamed from: a */
    public static void m7875a(String str) {
        if (Build.VERSION.SDK_INT >= 18) {
            a.m7877a(str);
        }
    }

    /* renamed from: b */
    public static void m7876b() {
        if (Build.VERSION.SDK_INT >= 18) {
            a.m7878b();
        }
    }
}
