package p066e8;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p023b8.C0515g;
import p023b8.C0519k;
import p023b8.InterfaceC0509a;
import p035c8.InterfaceC0984a;
import p050d8.InterfaceC1601a;
import p050d8.InterfaceC1602b;
import p081f8.C1876e;
import p081f8.C1884m;
import p141j8.C3262f;
import p171l8.InterfaceC3458i;
import p184m8.C3550a;
import p184m8.C3552c;
import p195n7.C3767g;

/* renamed from: e8.r */
/* loaded from: classes.dex */
public class C1751r {

    /* renamed from: a */
    public final Context f6447a;

    /* renamed from: b */
    public final C3767g f6448b;

    /* renamed from: c */
    public final C1757x f6449c;

    /* renamed from: f */
    public C1752s f6452f;

    /* renamed from: g */
    public C1752s f6453g;

    /* renamed from: h */
    public boolean f6454h;

    /* renamed from: i */
    public C1747p f6455i;

    /* renamed from: j */
    public final C1720b0 f6456j;

    /* renamed from: k */
    public final C3262f f6457k;

    /* renamed from: l */
    public final InterfaceC1602b f6458l;

    /* renamed from: m */
    public final InterfaceC0984a f6459m;

    /* renamed from: n */
    public final ExecutorService f6460n;

    /* renamed from: o */
    public final C1743n f6461o;

    /* renamed from: p */
    public final C1741m f6462p;

    /* renamed from: q */
    public final InterfaceC0509a f6463q;

    /* renamed from: r */
    public final C0519k f6464r;

    /* renamed from: e */
    public final long f6451e = System.currentTimeMillis();

    /* renamed from: d */
    public final C1730g0 f6450d = new C1730g0();

    /* renamed from: e8.r$a */
    /* loaded from: classes.dex */
    public class a implements Callable<Task<Void>> {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC3458i f6465a;

        public a(InterfaceC3458i interfaceC3458i) {
            this.f6465a = interfaceC3458i;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Task<Void> call() {
            return C1751r.this.m6983i(this.f6465a);
        }
    }

    /* renamed from: e8.r$b */
    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: h */
        public final /* synthetic */ InterfaceC3458i f6467h;

        public b(InterfaceC3458i interfaceC3458i) {
            this.f6467h = interfaceC3458i;
        }

        @Override // java.lang.Runnable
        public void run() {
            C1751r.this.m6983i(this.f6467h);
        }
    }

    /* renamed from: e8.r$c */
    /* loaded from: classes.dex */
    public class c implements Callable<Boolean> {
        public c() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call() {
            try {
                boolean m7003d = C1751r.this.f6452f.m7003d();
                if (!m7003d) {
                    C0515g.m2482f().m2492k("Initialization marker file was not properly removed.");
                }
                return Boolean.valueOf(m7003d);
            } catch (Exception e10) {
                C0515g.m2482f().m2487e("Problem encountered deleting Crashlytics initialization marker.", e10);
                return Boolean.FALSE;
            }
        }
    }

    /* renamed from: e8.r$d */
    /* loaded from: classes.dex */
    public class d implements Callable<Boolean> {
        public d() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call() {
            return Boolean.valueOf(C1751r.this.f6455i.m6942u());
        }
    }

    public C1751r(C3767g c3767g, C1720b0 c1720b0, InterfaceC0509a interfaceC0509a, C1757x c1757x, InterfaceC1602b interfaceC1602b, InterfaceC0984a interfaceC0984a, C3262f c3262f, ExecutorService executorService, C1741m c1741m, C0519k c0519k) {
        this.f6448b = c3767g;
        this.f6449c = c1757x;
        this.f6447a = c3767g.m14349m();
        this.f6456j = c1720b0;
        this.f6463q = interfaceC0509a;
        this.f6458l = interfaceC1602b;
        this.f6459m = interfaceC0984a;
        this.f6460n = executorService;
        this.f6457k = c3262f;
        this.f6461o = new C1743n(executorService);
        this.f6462p = c1741m;
        this.f6464r = c0519k;
    }

    /* renamed from: l */
    public static String m6976l() {
        return "18.6.2";
    }

    /* renamed from: m */
    public static boolean m6977m(String str, boolean z10) {
        if (!z10) {
            C0515g.m2482f().m2490i("Configured not to require a build ID.");
            return true;
        }
        if (!TextUtils.isEmpty(str)) {
            return true;
        }
        Log.e("FirebaseCrashlytics", ".");
        Log.e("FirebaseCrashlytics", ".     |  | ");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".   \\ |  | /");
        Log.e("FirebaseCrashlytics", ".    \\    /");
        Log.e("FirebaseCrashlytics", ".     \\  /");
        Log.e("FirebaseCrashlytics", ".      \\/");
        Log.e("FirebaseCrashlytics", ".");
        Log.e("FirebaseCrashlytics", "The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
        Log.e("FirebaseCrashlytics", ".");
        Log.e("FirebaseCrashlytics", ".      /\\");
        Log.e("FirebaseCrashlytics", ".     /  \\");
        Log.e("FirebaseCrashlytics", ".    /    \\");
        Log.e("FirebaseCrashlytics", ".   / |  | \\");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".");
        return false;
    }

    /* renamed from: d */
    public final void m6978d() {
        boolean z10;
        try {
            z10 = Boolean.TRUE.equals((Boolean) C1750q0.m6963f(this.f6461o.m6887h(new d())));
        } catch (Exception unused) {
            z10 = false;
        }
        this.f6454h = z10;
    }

    /* renamed from: e */
    public Task<Boolean> m6979e() {
        return this.f6455i.m6940o();
    }

    /* renamed from: f */
    public Task<Void> m6980f() {
        return this.f6455i.m6941t();
    }

    /* renamed from: g */
    public boolean m6981g() {
        return this.f6454h;
    }

    /* renamed from: h */
    public boolean m6982h() {
        return this.f6452f.m7002c();
    }

    /* renamed from: i */
    public final Task<Void> m6983i(InterfaceC3458i interfaceC3458i) {
        m6990r();
        try {
            this.f6458l.mo302a(new InterfaceC1601a() { // from class: e8.q
                @Override // p050d8.InterfaceC1601a
                /* renamed from: a */
                public final void mo6434a(String str) {
                    C1751r.this.m6986n(str);
                }
            });
            this.f6455i.m6930V();
            if (!interfaceC3458i.mo12858b().f12123b.f12130a) {
                C0515g.m2482f().m2484b("Collection of crash reports disabled in Crashlytics settings.");
                return Tasks.forException(new RuntimeException("Collection of crash reports disabled in Crashlytics settings."));
            }
            if (!this.f6455i.m6918B(interfaceC3458i)) {
                C0515g.m2482f().m2492k("Previous sessions could not be finalized.");
            }
            return this.f6455i.m6935a0(interfaceC3458i.mo12857a());
        } catch (Exception e10) {
            C0515g.m2482f().m2487e("Crashlytics encountered a problem during asynchronous initialization.", e10);
            return Tasks.forException(e10);
        } finally {
            m6989q();
        }
    }

    /* renamed from: j */
    public Task<Void> m6984j(InterfaceC3458i interfaceC3458i) {
        return C1750q0.m6965h(this.f6460n, new a(interfaceC3458i));
    }

    /* renamed from: k */
    public final void m6985k(InterfaceC3458i interfaceC3458i) {
        C0515g m2482f;
        String str;
        Future<?> submit = this.f6460n.submit(new b(interfaceC3458i));
        C0515g.m2482f().m2484b("Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.");
        try {
            submit.get(3L, TimeUnit.SECONDS);
        } catch (InterruptedException e10) {
            e = e10;
            m2482f = C0515g.m2482f();
            str = "Crashlytics was interrupted during initialization.";
            m2482f.m2487e(str, e);
        } catch (ExecutionException e11) {
            e = e11;
            m2482f = C0515g.m2482f();
            str = "Crashlytics encountered a problem during initialization.";
            m2482f.m2487e(str, e);
        } catch (TimeoutException e12) {
            e = e12;
            m2482f = C0515g.m2482f();
            str = "Crashlytics timed out during initialization.";
            m2482f.m2487e(str, e);
        }
    }

    /* renamed from: n */
    public void m6986n(String str) {
        this.f6455i.m6939e0(System.currentTimeMillis() - this.f6451e, str);
    }

    /* renamed from: o */
    public void m6987o(Throwable th) {
        this.f6455i.m6938d0(Thread.currentThread(), th);
    }

    /* renamed from: p */
    public void m6988p(Throwable th) {
        C0515g.m2482f().m2484b("Recorded on-demand fatal events: " + this.f6450d.m6803b());
        C0515g.m2482f().m2484b("Dropped on-demand fatal events: " + this.f6450d.m6802a());
        this.f6455i.m6933Y("com.crashlytics.on-demand.recorded-exceptions", Integer.toString(this.f6450d.m6803b()));
        this.f6455i.m6933Y("com.crashlytics.on-demand.dropped-exceptions", Integer.toString(this.f6450d.m6802a()));
        this.f6455i.m6928Q(Thread.currentThread(), th);
    }

    /* renamed from: q */
    public void m6989q() {
        this.f6461o.m6887h(new c());
    }

    /* renamed from: r */
    public void m6990r() {
        this.f6461o.m6881b();
        this.f6452f.m7000a();
        C0515g.m2482f().m2490i("Initialization marker file was created.");
    }

    /* renamed from: s */
    public boolean m6991s(C1717a c1717a, InterfaceC3458i interfaceC3458i) {
        if (!m6977m(c1717a.f6313b, C1733i.m6821i(this.f6447a, "com.crashlytics.RequireBuildId", true))) {
            throw new IllegalStateException("The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
        }
        String c1731h = new C1731h(this.f6456j).toString();
        try {
            this.f6453g = new C1752s("crash_marker", this.f6457k);
            this.f6452f = new C1752s("initialization_marker", this.f6457k);
            C1884m c1884m = new C1884m(c1731h, this.f6457k, this.f6461o);
            C1876e c1876e = new C1876e(this.f6457k);
            C3550a c3550a = new C3550a(1024, new C3552c(10));
            this.f6464r.m2502c(c1884m);
            this.f6455i = new C1747p(this.f6447a, this.f6461o, this.f6456j, this.f6449c, this.f6457k, this.f6453g, c1717a, c1884m, c1876e, C1736j0.m6844h(this.f6447a, this.f6456j, this.f6457k, c1717a, c1876e, c1884m, c3550a, interfaceC3458i, this.f6450d, this.f6462p), this.f6463q, this.f6459m, this.f6462p);
            boolean m6982h = m6982h();
            m6978d();
            this.f6455i.m6947z(c1731h, Thread.getDefaultUncaughtExceptionHandler(), interfaceC3458i);
            if (!m6982h || !C1733i.m6816d(this.f6447a)) {
                C0515g.m2482f().m2484b("Successfully configured exception handler.");
                return true;
            }
            C0515g.m2482f().m2484b("Crashlytics did not finish previous background initialization. Initializing synchronously.");
            m6985k(interfaceC3458i);
            return false;
        } catch (Exception e10) {
            C0515g.m2482f().m2487e("Crashlytics was not started due to an exception during initialization", e10);
            this.f6455i = null;
            return false;
        }
    }

    /* renamed from: t */
    public Task<Void> m6992t() {
        return this.f6455i.m6931W();
    }

    /* renamed from: u */
    public void m6993u(Boolean bool) {
        this.f6449c.m7042h(bool);
    }

    /* renamed from: v */
    public void m6994v(String str, String str2) {
        this.f6455i.m6932X(str, str2);
    }

    /* renamed from: w */
    public void m6995w(String str, String str2) {
        this.f6455i.m6933Y(str, str2);
    }

    /* renamed from: x */
    public void m6996x(String str) {
        this.f6455i.m6934Z(str);
    }
}
