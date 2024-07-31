package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import java.util.UUID;
import java.util.concurrent.Executor;
import p029c2.AbstractC0604v;
import p029c2.C0587e;
import p170l7.InterfaceFutureC3445f;
import p190n2.C3703c;

/* loaded from: classes.dex */
public abstract class ListenableWorker {

    /* renamed from: h */
    public Context f1953h;

    /* renamed from: i */
    public WorkerParameters f1954i;

    /* renamed from: j */
    public volatile boolean f1955j;

    /* renamed from: k */
    public boolean f1956k;

    /* renamed from: l */
    public boolean f1957l;

    /* renamed from: androidx.work.ListenableWorker$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0413a {

        /* renamed from: androidx.work.ListenableWorker$a$a */
        /* loaded from: classes.dex */
        public static final class a extends AbstractC0413a {

            /* renamed from: a */
            public final C0417b f1958a;

            public a() {
                this(C0417b.f2003c);
            }

            public a(C0417b c0417b) {
                this.f1958a = c0417b;
            }

            /* renamed from: e */
            public C0417b m2079e() {
                return this.f1958a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || a.class != obj.getClass()) {
                    return false;
                }
                return this.f1958a.equals(((a) obj).f1958a);
            }

            public int hashCode() {
                return (a.class.getName().hashCode() * 31) + this.f1958a.hashCode();
            }

            public String toString() {
                return "Failure {mOutputData=" + this.f1958a + '}';
            }
        }

        /* renamed from: androidx.work.ListenableWorker$a$b */
        /* loaded from: classes.dex */
        public static final class b extends AbstractC0413a {
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && b.class == obj.getClass();
            }

            public int hashCode() {
                return b.class.getName().hashCode();
            }

            public String toString() {
                return "Retry";
            }
        }

        /* renamed from: androidx.work.ListenableWorker$a$c */
        /* loaded from: classes.dex */
        public static final class c extends AbstractC0413a {

            /* renamed from: a */
            public final C0417b f1959a;

            public c() {
                this(C0417b.f2003c);
            }

            public c(C0417b c0417b) {
                this.f1959a = c0417b;
            }

            /* renamed from: e */
            public C0417b m2080e() {
                return this.f1959a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || c.class != obj.getClass()) {
                    return false;
                }
                return this.f1959a.equals(((c) obj).f1959a);
            }

            public int hashCode() {
                return (c.class.getName().hashCode() * 31) + this.f1959a.hashCode();
            }

            public String toString() {
                return "Success {mOutputData=" + this.f1959a + '}';
            }
        }

        /* renamed from: a */
        public static AbstractC0413a m2075a() {
            return new a();
        }

        /* renamed from: b */
        public static AbstractC0413a m2076b() {
            return new b();
        }

        /* renamed from: c */
        public static AbstractC0413a m2077c() {
            return new c();
        }

        /* renamed from: d */
        public static AbstractC0413a m2078d(C0417b c0417b) {
            return new c(c0417b);
        }
    }

    @Keep
    @SuppressLint({"BanKeepAnnotation"})
    public ListenableWorker(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        }
        if (workerParameters == null) {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        this.f1953h = context;
        this.f1954i = workerParameters;
    }

    /* renamed from: a */
    public final Context m2061a() {
        return this.f1953h;
    }

    /* renamed from: c */
    public Executor m2062c() {
        return this.f1954i.m2083a();
    }

    /* renamed from: d */
    public InterfaceFutureC3445f<C0587e> m2063d() {
        C3703c m13982t = C3703c.m13982t();
        m13982t.mo13972q(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return m13982t;
    }

    /* renamed from: f */
    public final UUID m2064f() {
        return this.f1954i.m2085c();
    }

    /* renamed from: g */
    public final C0417b m2065g() {
        return this.f1954i.m2086d();
    }

    /* renamed from: h */
    public AbstractC0604v m2066h() {
        return this.f1954i.m2087e();
    }

    /* renamed from: i */
    public boolean mo2067i() {
        return this.f1957l;
    }

    /* renamed from: j */
    public final boolean m2068j() {
        return this.f1955j;
    }

    /* renamed from: k */
    public final boolean m2069k() {
        return this.f1956k;
    }

    /* renamed from: l */
    public void mo2070l() {
    }

    /* renamed from: m */
    public void m2071m(boolean z10) {
        this.f1957l = z10;
    }

    /* renamed from: n */
    public final void m2072n() {
        this.f1956k = true;
    }

    /* renamed from: o */
    public abstract InterfaceFutureC3445f<AbstractC0413a> mo2073o();

    /* renamed from: p */
    public final void m2074p() {
        this.f1955j = true;
        mo2070l();
    }
}
