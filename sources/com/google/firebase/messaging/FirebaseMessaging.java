package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.C1288e;
import com.google.firebase.messaging.C1289f;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p045d3.InterfaceC1537i;
import p099g9.C2158a0;
import p099g9.C2167d0;
import p099g9.C2177h0;
import p099g9.C2183k0;
import p099g9.C2184l;
import p099g9.C2186m;
import p099g9.C2190o;
import p099g9.C2207w0;
import p099g9.RunnableC2199s0;
import p108h6.C2394s;
import p142j9.InterfaceC3271i;
import p195n7.C3762b;
import p195n7.C3767g;
import p223p6.ThreadFactoryC4056b;
import p294u8.C4990a;
import p294u8.InterfaceC4991b;
import p294u8.InterfaceC4993d;
import p309v8.InterfaceC5150j;
import p338x8.InterfaceC5739a;
import p354y8.InterfaceC5896b;
import p369z8.InterfaceC6084h;

/* loaded from: classes.dex */
public class FirebaseMessaging {

    /* renamed from: o */
    public static final long f4852o = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: p */
    public static C1289f f4853p;

    /* renamed from: q */
    @SuppressLint({"FirebaseUnknownNullness"})
    public static InterfaceC1537i f4854q;

    /* renamed from: r */
    public static ScheduledExecutorService f4855r;

    /* renamed from: a */
    public final C3767g f4856a;

    /* renamed from: b */
    public final InterfaceC5739a f4857b;

    /* renamed from: c */
    public final InterfaceC6084h f4858c;

    /* renamed from: d */
    public final Context f4859d;

    /* renamed from: e */
    public final C2167d0 f4860e;

    /* renamed from: f */
    public final C1288e f4861f;

    /* renamed from: g */
    public final C1283a f4862g;

    /* renamed from: h */
    public final Executor f4863h;

    /* renamed from: i */
    public final Executor f4864i;

    /* renamed from: j */
    public final Executor f4865j;

    /* renamed from: k */
    public final Task<C2207w0> f4866k;

    /* renamed from: l */
    public final C2177h0 f4867l;

    /* renamed from: m */
    public boolean f4868m;

    /* renamed from: n */
    public final Application.ActivityLifecycleCallbacks f4869n;

    /* renamed from: com.google.firebase.messaging.FirebaseMessaging$a */
    /* loaded from: classes.dex */
    public class C1283a {

        /* renamed from: a */
        public final InterfaceC4993d f4870a;

        /* renamed from: b */
        public boolean f4871b;

        /* renamed from: c */
        public InterfaceC4991b<C3762b> f4872c;

        /* renamed from: d */
        public Boolean f4873d;

        public C1283a(InterfaceC4993d interfaceC4993d) {
            this.f4870a = interfaceC4993d;
        }

        /* renamed from: d */
        public /* synthetic */ void m5446d(C4990a c4990a) {
            if (m5448c()) {
                FirebaseMessaging.this.m5430Q();
            }
        }

        /* renamed from: b */
        public synchronized void m5447b() {
            if (this.f4871b) {
                return;
            }
            Boolean m5449e = m5449e();
            this.f4873d = m5449e;
            if (m5449e == null) {
                C2158a0 c2158a0 = new InterfaceC4991b() { // from class: g9.a0
                    public /* synthetic */ C2158a0() {
                    }

                    @Override // p294u8.InterfaceC4991b
                    /* renamed from: a */
                    public final void mo8698a(C4990a c4990a) {
                        FirebaseMessaging.C1283a.this.m5446d(c4990a);
                    }
                };
                this.f4872c = c2158a0;
                this.f4870a.mo19564a(C3762b.class, c2158a0);
            }
            this.f4871b = true;
        }

        /* renamed from: c */
        public synchronized boolean m5448c() {
            Boolean bool;
            m5447b();
            bool = this.f4873d;
            return bool != null ? bool.booleanValue() : FirebaseMessaging.this.f4856a.m14354x();
        }

        /* renamed from: e */
        public final Boolean m5449e() {
            ApplicationInfo applicationInfo;
            Bundle bundle;
            Context m14349m = FirebaseMessaging.this.f4856a.m14349m();
            SharedPreferences sharedPreferences = m14349m.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("auto_init")) {
                return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager = m14349m.getPackageManager();
                if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(m14349m.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                    return null;
                }
                return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        /* renamed from: f */
        public synchronized void m5450f(boolean z10) {
            m5447b();
            InterfaceC4991b<C3762b> interfaceC4991b = this.f4872c;
            if (interfaceC4991b != null) {
                this.f4870a.mo19566d(C3762b.class, interfaceC4991b);
                this.f4872c = null;
            }
            SharedPreferences.Editor edit = FirebaseMessaging.this.f4856a.m14349m().getSharedPreferences("com.google.firebase.messaging", 0).edit();
            edit.putBoolean("auto_init", z10);
            edit.apply();
            if (z10) {
                FirebaseMessaging.this.m5430Q();
            }
            this.f4873d = Boolean.valueOf(z10);
        }
    }

    public FirebaseMessaging(C3767g c3767g, InterfaceC5739a interfaceC5739a, InterfaceC5896b<InterfaceC3271i> interfaceC5896b, InterfaceC5896b<InterfaceC5150j> interfaceC5896b2, InterfaceC6084h interfaceC6084h, InterfaceC1537i interfaceC1537i, InterfaceC4993d interfaceC4993d) {
        this(c3767g, interfaceC5739a, interfaceC5896b, interfaceC5896b2, interfaceC6084h, interfaceC1537i, interfaceC4993d, new C2177h0(c3767g.m14349m()));
    }

    public FirebaseMessaging(C3767g c3767g, InterfaceC5739a interfaceC5739a, InterfaceC5896b<InterfaceC3271i> interfaceC5896b, InterfaceC5896b<InterfaceC5150j> interfaceC5896b2, InterfaceC6084h interfaceC6084h, InterfaceC1537i interfaceC1537i, InterfaceC4993d interfaceC4993d, C2177h0 c2177h0) {
        this(c3767g, interfaceC5739a, interfaceC6084h, interfaceC1537i, interfaceC4993d, c2177h0, new C2167d0(c3767g, c2177h0, interfaceC5896b, interfaceC5896b2, interfaceC6084h), C2186m.m8799f(), C2186m.m8796c(), C2186m.m8795b());
    }

    public FirebaseMessaging(C3767g c3767g, InterfaceC5739a interfaceC5739a, InterfaceC6084h interfaceC6084h, InterfaceC1537i interfaceC1537i, InterfaceC4993d interfaceC4993d, C2177h0 c2177h0, C2167d0 c2167d0, Executor executor, Executor executor2, Executor executor3) {
        this.f4868m = false;
        f4854q = interfaceC1537i;
        this.f4856a = c3767g;
        this.f4857b = interfaceC5739a;
        this.f4858c = interfaceC6084h;
        this.f4862g = new C1283a(interfaceC4993d);
        Context m14349m = c3767g.m14349m();
        this.f4859d = m14349m;
        C2190o c2190o = new C2190o();
        this.f4869n = c2190o;
        this.f4867l = c2177h0;
        this.f4864i = executor;
        this.f4860e = c2167d0;
        this.f4861f = new C1288e(executor);
        this.f4863h = executor2;
        this.f4865j = executor3;
        Context m14349m2 = c3767g.m14349m();
        if (m14349m2 instanceof Application) {
            ((Application) m14349m2).registerActivityLifecycleCallbacks(c2190o);
        } else {
            Log.w("FirebaseMessaging", "Context " + m14349m2 + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        if (interfaceC5739a != null) {
            interfaceC5739a.mo5369c(new InterfaceC5739a.a() { // from class: g9.q
                public /* synthetic */ C2194q() {
                }

                @Override // p338x8.InterfaceC5739a.a
                /* renamed from: a */
                public final void mo8815a(String str) {
                    FirebaseMessaging.this.m5403F(str);
                }
            });
        }
        executor2.execute(new Runnable() { // from class: g9.w
            public /* synthetic */ RunnableC2206w() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.this.m5404G();
            }
        });
        Task<C2207w0> m8846f = C2207w0.m8846f(this, c2177h0, c2167d0, m14349m, C2186m.m8800g());
        this.f4866k = m8846f;
        m8846f.addOnSuccessListener(executor2, new OnSuccessListener() { // from class: g9.p
            public /* synthetic */ C2192p() {
            }

            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                FirebaseMessaging.this.m5405H((C2207w0) obj);
            }
        });
        executor2.execute(new Runnable() { // from class: g9.v
            public /* synthetic */ RunnableC2204v() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.this.m5406I();
            }
        });
    }

    /* renamed from: A */
    public /* synthetic */ Task m5398A(String str, C1289f.a aVar) {
        return this.f4860e.m8737f().onSuccessTask(this.f4865j, new SuccessContinuation() { // from class: g9.r

            /* renamed from: b */
            public final /* synthetic */ String f8728b;

            /* renamed from: c */
            public final /* synthetic */ C1289f.a f8729c;

            public /* synthetic */ C2196r(String str2, C1289f.a aVar2) {
                r2 = str2;
                r3 = aVar2;
            }

            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                Task m5399B;
                m5399B = FirebaseMessaging.this.m5399B(r2, r3, (String) obj);
                return m5399B;
            }
        });
    }

    /* renamed from: B */
    public /* synthetic */ Task m5399B(String str, C1289f.a aVar, String str2) {
        m5423s(this.f4859d).m5554g(m5439t(), str, str2, this.f4867l.m8764a());
        if (aVar == null || !str2.equals(aVar.f4912a)) {
            m5403F(str2);
        }
        return Tasks.forResult(str2);
    }

    /* renamed from: C */
    public /* synthetic */ void m5400C(TaskCompletionSource taskCompletionSource) {
        try {
            this.f4857b.mo5368b(C2177h0.m8763c(this.f4856a), "FCM");
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* renamed from: D */
    public /* synthetic */ void m5401D(TaskCompletionSource taskCompletionSource) {
        try {
            Tasks.await(this.f4860e.m8734c());
            m5423s(this.f4859d).m5551d(m5439t(), C2177h0.m8763c(this.f4856a));
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* renamed from: E */
    public /* synthetic */ void m5402E(TaskCompletionSource taskCompletionSource) {
        try {
            taskCompletionSource.setResult(m5435n());
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* renamed from: G */
    public /* synthetic */ void m5404G() {
        if (m5443y()) {
            m5430Q();
        }
    }

    /* renamed from: H */
    public /* synthetic */ void m5405H(C2207w0 c2207w0) {
        if (m5443y()) {
            c2207w0.m8860q();
        }
    }

    /* renamed from: I */
    public /* synthetic */ void m5406I() {
        C2183k0.m8775c(this.f4859d);
    }

    /* renamed from: J */
    public static /* synthetic */ Task m5407J(String str, C2207w0 c2207w0) {
        return c2207w0.m8861r(str);
    }

    /* renamed from: K */
    public static /* synthetic */ Task m5408K(String str, C2207w0 c2207w0) {
        return c2207w0.m8864u(str);
    }

    @Keep
    public static synchronized FirebaseMessaging getInstance(C3767g c3767g) {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = (FirebaseMessaging) c3767g.m14348k(FirebaseMessaging.class);
            C2394s.m9620m(firebaseMessaging, "Firebase Messaging component is not present");
        }
        return firebaseMessaging;
    }

    /* renamed from: r */
    public static synchronized FirebaseMessaging m5422r() {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = getInstance(C3767g.m14334o());
        }
        return firebaseMessaging;
    }

    /* renamed from: s */
    public static synchronized C1289f m5423s(Context context) {
        C1289f c1289f;
        synchronized (FirebaseMessaging.class) {
            if (f4853p == null) {
                f4853p = new C1289f(context);
            }
            c1289f = f4853p;
        }
        return c1289f;
    }

    /* renamed from: w */
    public static InterfaceC1537i m5424w() {
        return f4854q;
    }

    @Deprecated
    /* renamed from: L */
    public void m5425L(C1287d c1287d) {
        if (TextUtils.isEmpty(c1287d.m5517R())) {
            throw new IllegalArgumentException("Missing 'to'");
        }
        Intent intent = new Intent("com.google.android.gcm.intent.SEND");
        Intent intent2 = new Intent();
        intent2.setPackage("com.google.example.invalidpackage");
        intent.putExtra("app", PendingIntent.getBroadcast(this.f4859d, 0, intent2, Build.VERSION.SDK_INT >= 23 ? 67108864 : 0));
        intent.setPackage("com.google.android.gms");
        c1287d.m5519T(intent);
        this.f4859d.sendOrderedBroadcast(intent, "com.google.android.gtalkservice.permission.GTALK_SERVICE");
    }

    /* renamed from: M */
    public void m5426M(boolean z10) {
        this.f4862g.m5450f(z10);
    }

    /* renamed from: N */
    public void m5427N(boolean z10) {
        C1285b.m5480y(z10);
    }

    /* renamed from: O */
    public synchronized void m5428O(boolean z10) {
        this.f4868m = z10;
    }

    /* renamed from: P */
    public final synchronized void m5429P() {
        if (!this.f4868m) {
            m5432S(0L);
        }
    }

    /* renamed from: Q */
    public final void m5430Q() {
        InterfaceC5739a interfaceC5739a = this.f4857b;
        if (interfaceC5739a != null) {
            interfaceC5739a.mo5367a();
        } else if (m5433T(m5441v())) {
            m5429P();
        }
    }

    @SuppressLint({"TaskMainThread"})
    /* renamed from: R */
    public Task<Void> m5431R(String str) {
        return this.f4866k.onSuccessTask(new SuccessContinuation() { // from class: g9.t

            /* renamed from: a */
            public final /* synthetic */ String f8742a;

            public /* synthetic */ C2200t(String str2) {
                r1 = str2;
            }

            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                Task m5407J;
                m5407J = FirebaseMessaging.m5407J(r1, (C2207w0) obj);
                return m5407J;
            }
        });
    }

    /* renamed from: S */
    public synchronized void m5432S(long j10) {
        m5437p(new RunnableC2199s0(this, Math.min(Math.max(30L, 2 * j10), f4852o)), j10);
        this.f4868m = true;
    }

    /* renamed from: T */
    public boolean m5433T(C1289f.a aVar) {
        return aVar == null || aVar.m5557b(this.f4867l.m8764a());
    }

    @SuppressLint({"TaskMainThread"})
    /* renamed from: U */
    public Task<Void> m5434U(String str) {
        return this.f4866k.onSuccessTask(new SuccessContinuation() { // from class: g9.s

            /* renamed from: a */
            public final /* synthetic */ String f8736a;

            public /* synthetic */ C2198s(String str2) {
                r1 = str2;
            }

            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                Task m5408K;
                m5408K = FirebaseMessaging.m5408K(r1, (C2207w0) obj);
                return m5408K;
            }
        });
    }

    /* renamed from: n */
    public String m5435n() {
        InterfaceC5739a interfaceC5739a = this.f4857b;
        if (interfaceC5739a != null) {
            try {
                return (String) Tasks.await(interfaceC5739a.mo5370d());
            } catch (InterruptedException | ExecutionException e10) {
                throw new IOException(e10);
            }
        }
        C1289f.a m5441v = m5441v();
        if (!m5433T(m5441v)) {
            return m5441v.f4912a;
        }
        String m8763c = C2177h0.m8763c(this.f4856a);
        try {
            return (String) Tasks.await(this.f4861f.m5547b(m8763c, new C1288e.a() { // from class: g9.u

                /* renamed from: b */
                public final /* synthetic */ String f8748b;

                /* renamed from: c */
                public final /* synthetic */ C1289f.a f8749c;

                public /* synthetic */ C2202u(String m8763c2, C1289f.a m5441v2) {
                    r2 = m8763c2;
                    r3 = m5441v2;
                }

                @Override // com.google.firebase.messaging.C1288e.a
                public final Task start() {
                    Task m5398A;
                    m5398A = FirebaseMessaging.this.m5398A(r2, r3);
                    return m5398A;
                }
            }));
        } catch (InterruptedException | ExecutionException e11) {
            throw new IOException(e11);
        }
    }

    /* renamed from: o */
    public Task<Void> m5436o() {
        if (this.f4857b != null) {
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            this.f4863h.execute(new Runnable() { // from class: g9.x

                /* renamed from: i */
                public final /* synthetic */ TaskCompletionSource f8771i;

                public /* synthetic */ RunnableC2208x(TaskCompletionSource taskCompletionSource2) {
                    r2 = taskCompletionSource2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    FirebaseMessaging.this.m5400C(r2);
                }
            });
            return taskCompletionSource2.getTask();
        }
        if (m5441v() == null) {
            return Tasks.forResult(null);
        }
        TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
        C2186m.m8798e().execute(new Runnable() { // from class: g9.z

            /* renamed from: i */
            public final /* synthetic */ TaskCompletionSource f8786i;

            public /* synthetic */ RunnableC2212z(TaskCompletionSource taskCompletionSource22) {
                r2 = taskCompletionSource22;
            }

            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.this.m5401D(r2);
            }
        });
        return taskCompletionSource22.getTask();
    }

    @SuppressLint({"ThreadPoolCreation"})
    /* renamed from: p */
    public void m5437p(Runnable runnable, long j10) {
        synchronized (FirebaseMessaging.class) {
            if (f4855r == null) {
                f4855r = new ScheduledThreadPoolExecutor(1, new ThreadFactoryC4056b("TAG"));
            }
            f4855r.schedule(runnable, j10, TimeUnit.SECONDS);
        }
    }

    /* renamed from: q */
    public Context m5438q() {
        return this.f4859d;
    }

    /* renamed from: t */
    public final String m5439t() {
        return "[DEFAULT]".equals(this.f4856a.m14350q()) ? "" : this.f4856a.m14352s();
    }

    /* renamed from: u */
    public Task<String> m5440u() {
        InterfaceC5739a interfaceC5739a = this.f4857b;
        if (interfaceC5739a != null) {
            return interfaceC5739a.mo5370d();
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f4863h.execute(new Runnable() { // from class: g9.y

            /* renamed from: i */
            public final /* synthetic */ TaskCompletionSource f8783i;

            public /* synthetic */ RunnableC2210y(TaskCompletionSource taskCompletionSource2) {
                r2 = taskCompletionSource2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.this.m5402E(r2);
            }
        });
        return taskCompletionSource2.getTask();
    }

    /* renamed from: v */
    public C1289f.a m5441v() {
        return m5423s(this.f4859d).m5552e(m5439t(), C2177h0.m8763c(this.f4856a));
    }

    /* renamed from: x */
    public final void m5403F(String str) {
        if ("[DEFAULT]".equals(this.f4856a.m14350q())) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Invoking onNewToken for app: " + this.f4856a.m14350q());
            }
            Intent intent = new Intent(FirebaseMessagingService.ACTION_NEW_TOKEN);
            intent.putExtra("token", str);
            new C2184l(this.f4859d).m8789k(intent);
        }
    }

    /* renamed from: y */
    public boolean m5443y() {
        return this.f4862g.m5448c();
    }

    /* renamed from: z */
    public boolean m5444z() {
        return this.f4867l.m8769g();
    }
}
