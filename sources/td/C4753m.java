package td;

import gd.C2230d;
import gd.C2244r;
import java.util.Arrays;

/* renamed from: td.m */
/* loaded from: classes2.dex */
public class C4753m {
    /* renamed from: a */
    public static boolean m18648a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* renamed from: b */
    public static void m18649b(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw ((IllegalStateException) m18658k(new IllegalStateException(str + " must not be null")));
    }

    /* renamed from: c */
    public static void m18650c(Object obj) {
        if (obj == null) {
            m18661n();
        }
    }

    /* renamed from: d */
    public static void m18651d(Object obj, String str) {
        if (obj == null) {
            m18662o(str);
        }
    }

    /* renamed from: e */
    public static void m18652e(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw ((NullPointerException) m18658k(new NullPointerException(str + " must not be null")));
    }

    /* renamed from: f */
    public static void m18653f(Object obj, String str) {
        if (obj == null) {
            m18665r(str);
        }
    }

    /* renamed from: g */
    public static void m18654g(Object obj, String str) {
        if (obj == null) {
            m18664q(str);
        }
    }

    /* renamed from: h */
    public static int m18655h(int i10, int i11) {
        if (i10 < i11) {
            return -1;
        }
        return i10 == i11 ? 0 : 1;
    }

    /* renamed from: i */
    public static int m18656i(long j10, long j11) {
        if (j10 < j11) {
            return -1;
        }
        return j10 == j11 ? 0 : 1;
    }

    /* renamed from: j */
    public static String m18657j(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String name = C4753m.class.getName();
        int i10 = 0;
        while (!stackTrace[i10].getClassName().equals(name)) {
            i10++;
        }
        while (stackTrace[i10].getClassName().equals(name)) {
            i10++;
        }
        StackTraceElement stackTraceElement = stackTrace[i10];
        return "Parameter specified as non-null is null: method " + stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + ", parameter " + str;
    }

    /* renamed from: k */
    public static <T extends Throwable> T m18658k(T t10) {
        return (T) m18659l(t10, C4753m.class.getName());
    }

    /* renamed from: l */
    public static <T extends Throwable> T m18659l(T t10, String str) {
        StackTraceElement[] stackTrace = t10.getStackTrace();
        int length = stackTrace.length;
        int i10 = -1;
        for (int i11 = 0; i11 < length; i11++) {
            if (str.equals(stackTrace[i11].getClassName())) {
                i10 = i11;
            }
        }
        t10.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i10 + 1, length));
        return t10;
    }

    /* renamed from: m */
    public static String m18660m(String str, Object obj) {
        return str + obj;
    }

    /* renamed from: n */
    public static void m18661n() {
        throw ((NullPointerException) m18658k(new NullPointerException()));
    }

    /* renamed from: o */
    public static void m18662o(String str) {
        throw ((NullPointerException) m18658k(new NullPointerException(str)));
    }

    /* renamed from: p */
    public static void m18663p() {
        throw ((C2230d) m18658k(new C2230d()));
    }

    /* renamed from: q */
    public static void m18664q(String str) {
        throw ((IllegalArgumentException) m18658k(new IllegalArgumentException(m18657j(str))));
    }

    /* renamed from: r */
    public static void m18665r(String str) {
        throw ((NullPointerException) m18658k(new NullPointerException(m18657j(str))));
    }

    /* renamed from: s */
    public static void m18666s(String str) {
        throw ((C2244r) m18658k(new C2244r(str)));
    }

    /* renamed from: t */
    public static void m18667t(String str) {
        m18666s("lateinit property " + str + " has not been initialized");
    }
}
