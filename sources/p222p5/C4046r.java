package p222p5;

import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;

/* renamed from: p5.r */
/* loaded from: classes.dex */
public final class C4046r {

    /* renamed from: b */
    public static int f14546b = 0;

    /* renamed from: c */
    public static boolean f14547c = true;

    /* renamed from: a */
    public static final Object f14545a = new Object();

    /* renamed from: d */
    public static a f14548d = a.f14549a;

    /* renamed from: p5.r$a */
    /* loaded from: classes.dex */
    public interface a {

        /* renamed from: a */
        public static final a f14549a = new C6200a();

        /* renamed from: p5.r$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C6200a implements a {
            @Override // p222p5.C4046r.a
            /* renamed from: a */
            public void mo15531a(String str, String str2) {
                Log.w(str, str2);
            }

            @Override // p222p5.C4046r.a
            /* renamed from: b */
            public void mo15532b(String str, String str2) {
                Log.e(str, str2);
            }

            @Override // p222p5.C4046r.a
            /* renamed from: c */
            public void mo15533c(String str, String str2) {
                Log.d(str, str2);
            }

            @Override // p222p5.C4046r.a
            /* renamed from: d */
            public void mo15534d(String str, String str2) {
                Log.i(str, str2);
            }
        }

        /* renamed from: a */
        void mo15531a(String str, String str2);

        /* renamed from: b */
        void mo15532b(String str, String str2);

        /* renamed from: c */
        void mo15533c(String str, String str2);

        /* renamed from: d */
        void mo15534d(String str, String str2);
    }

    /* renamed from: a */
    public static String m15521a(String str, Throwable th) {
        String m15525e = m15525e(th);
        if (TextUtils.isEmpty(m15525e)) {
            return str;
        }
        return str + "\n  " + m15525e.replace("\n", "\n  ") + '\n';
    }

    /* renamed from: b */
    public static void m15522b(String str, String str2) {
        synchronized (f14545a) {
            if (f14546b == 0) {
                f14548d.mo15533c(str, str2);
            }
        }
    }

    /* renamed from: c */
    public static void m15523c(String str, String str2) {
        synchronized (f14545a) {
            if (f14546b <= 3) {
                f14548d.mo15532b(str, str2);
            }
        }
    }

    /* renamed from: d */
    public static void m15524d(String str, String str2, Throwable th) {
        m15523c(str, m15521a(str2, th));
    }

    /* renamed from: e */
    public static String m15525e(Throwable th) {
        synchronized (f14545a) {
            if (th == null) {
                return null;
            }
            if (m15528h(th)) {
                return "UnknownHostException (no network)";
            }
            if (f14547c) {
                return Log.getStackTraceString(th).trim().replace("\t", "    ");
            }
            return th.getMessage();
        }
    }

    /* renamed from: f */
    public static void m15526f(String str, String str2) {
        synchronized (f14545a) {
            if (f14546b <= 1) {
                f14548d.mo15534d(str, str2);
            }
        }
    }

    /* renamed from: g */
    public static void m15527g(String str, String str2, Throwable th) {
        m15526f(str, m15521a(str2, th));
    }

    /* renamed from: h */
    public static boolean m15528h(Throwable th) {
        while (th != null) {
            if (th instanceof UnknownHostException) {
                return true;
            }
            th = th.getCause();
        }
        return false;
    }

    /* renamed from: i */
    public static void m15529i(String str, String str2) {
        synchronized (f14545a) {
            if (f14546b <= 2) {
                f14548d.mo15531a(str, str2);
            }
        }
    }

    /* renamed from: j */
    public static void m15530j(String str, String str2, Throwable th) {
        m15529i(str, m15521a(str2, th));
    }
}
