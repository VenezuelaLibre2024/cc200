package com.google.firebase.iid;

import android.os.Build;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.iid.C1276a;
import com.google.firebase.iid.C1277b;
import com.google.firebase.iid.FirebaseInstanceId;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;
import p108h6.C2394s;
import p142j9.InterfaceC3271i;
import p195n7.C3767g;
import p223p6.ThreadFactoryC4056b;
import p309v8.InterfaceC5150j;
import p322w8.C5430b;
import p322w8.C5439k;
import p322w8.C5441m;
import p322w8.C5442n;
import p322w8.ExecutorC5432d;
import p322w8.ExecutorC5436h;
import p322w8.InterfaceC5440l;
import p338x8.InterfaceC5739a;
import p354y8.InterfaceC5896b;
import p369z8.InterfaceC6084h;

@Deprecated
/* loaded from: classes.dex */
public class FirebaseInstanceId {

    /* renamed from: j */
    public static C1277b f4822j;

    /* renamed from: l */
    @VisibleForTesting
    public static ScheduledExecutorService f4824l;

    /* renamed from: a */
    @VisibleForTesting
    public final Executor f4825a;

    /* renamed from: b */
    public final C3767g f4826b;

    /* renamed from: c */
    public final C5442n f4827c;

    /* renamed from: d */
    public final C5439k f4828d;

    /* renamed from: e */
    public final C1276a f4829e;

    /* renamed from: f */
    public final InterfaceC6084h f4830f;

    /* renamed from: g */
    public boolean f4831g;

    /* renamed from: h */
    public final List<InterfaceC5739a.a> f4832h;

    /* renamed from: i */
    public static final long f4821i = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: k */
    public static final Pattern f4823k = Pattern.compile("\\AA[\\w-]{38}\\z");

    public FirebaseInstanceId(C3767g c3767g, C5442n c5442n, Executor executor, Executor executor2, InterfaceC5896b<InterfaceC3271i> interfaceC5896b, InterfaceC5896b<InterfaceC5150j> interfaceC5896b2, InterfaceC6084h interfaceC6084h) {
        this.f4831g = false;
        this.f4832h = new ArrayList();
        if (C5442n.m21599c(c3767g) == null) {
            throw new IllegalStateException("FirebaseInstanceId failed to initialize, FirebaseApp is missing project ID");
        }
        synchronized (FirebaseInstanceId.class) {
            if (f4822j == null) {
                f4822j = new C1277b(c3767g.m14349m());
            }
        }
        this.f4826b = c3767g;
        this.f4827c = c5442n;
        this.f4828d = new C5439k(c3767g, c5442n, interfaceC5896b, interfaceC5896b2, interfaceC6084h);
        this.f4825a = executor2;
        this.f4829e = new C1276a(executor);
        this.f4830f = interfaceC6084h;
    }

    public FirebaseInstanceId(C3767g c3767g, InterfaceC5896b<InterfaceC3271i> interfaceC5896b, InterfaceC5896b<InterfaceC5150j> interfaceC5896b2, InterfaceC6084h interfaceC6084h) {
        this(c3767g, new C5442n(c3767g.m14349m()), C5430b.m21587b(), C5430b.m21587b(), interfaceC5896b, interfaceC5896b2, interfaceC6084h);
    }

    /* renamed from: A */
    public static String m5331A(String str) {
        return (str.isEmpty() || str.equalsIgnoreCase("fcm") || str.equalsIgnoreCase("gcm")) ? "*" : str;
    }

    /* renamed from: c */
    public static <T> T m5332c(Task<T> task) {
        C2394s.m9620m(task, "Task must not be null");
        CountDownLatch countDownLatch = new CountDownLatch(1);
        task.addOnCompleteListener(ExecutorC5432d.f20266h, new OnCompleteListener(countDownLatch) { // from class: w8.e

            /* renamed from: a */
            public final CountDownLatch f20267a;

            public C5433e(CountDownLatch countDownLatch2) {
                this.f20267a = countDownLatch2;
            }

            @Override // com.google.android.gms.tasks.OnCompleteListener
            public void onComplete(Task task2) {
                this.f20267a.countDown();
            }
        });
        countDownLatch2.await(30000L, TimeUnit.MILLISECONDS);
        return (T) m5334l(task);
    }

    /* renamed from: e */
    public static void m5333e(C3767g c3767g) {
        C2394s.m9614g(c3767g.m14351r().m14368g(), "Please set your project ID. A valid Firebase project ID is required to communicate with Firebase server APIs: It identifies your project with Google.");
        C2394s.m9614g(c3767g.m14351r().m14364c(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.");
        C2394s.m9614g(c3767g.m14351r().m14363b(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.");
        C2394s.m9609b(m5337u(c3767g.m14351r().m14364c()), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        C2394s.m9609b(m5336t(c3767g.m14351r().m14363b()), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    @Keep
    public static FirebaseInstanceId getInstance(C3767g c3767g) {
        m5333e(c3767g);
        FirebaseInstanceId firebaseInstanceId = (FirebaseInstanceId) c3767g.m14348k(FirebaseInstanceId.class);
        C2394s.m9620m(firebaseInstanceId, "Firebase Instance ID component is not present");
        return firebaseInstanceId;
    }

    /* renamed from: l */
    public static <T> T m5334l(Task<T> task) {
        if (task.isSuccessful()) {
            return task.getResult();
        }
        if (task.isCanceled()) {
            throw new CancellationException("Task is already canceled");
        }
        if (task.isComplete()) {
            throw new IllegalStateException(task.getException());
        }
        throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
    }

    /* renamed from: r */
    public static boolean m5335r() {
        return Log.isLoggable("FirebaseInstanceId", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseInstanceId", 3));
    }

    /* renamed from: t */
    public static boolean m5336t(String str) {
        return f4823k.matcher(str).matches();
    }

    /* renamed from: u */
    public static boolean m5337u(String str) {
        return str.contains(":");
    }

    /* renamed from: B */
    public synchronized void m5339B() {
        f4822j.m5376d();
    }

    /* renamed from: C */
    public synchronized void m5340C(boolean z10) {
        this.f4831g = z10;
    }

    /* renamed from: D */
    public synchronized void m5341D() {
        if (this.f4831g) {
            return;
        }
        m5342E(0L);
    }

    /* renamed from: E */
    public synchronized void m5342E(long j10) {
        m5348g(new RunnableC1278c(this, Math.min(Math.max(30L, j10 + j10), f4821i)), j10);
        this.f4831g = true;
    }

    /* renamed from: F */
    public boolean m5343F(C1277b.a aVar) {
        return aVar == null || aVar.m5387c(this.f4827c.m21600a());
    }

    /* renamed from: a */
    public void m5344a(InterfaceC5739a.a aVar) {
        this.f4832h.add(aVar);
    }

    /* renamed from: b */
    public final <T> T m5345b(Task<T> task) {
        try {
            return (T) Tasks.await(task, 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | TimeoutException unused) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        } catch (ExecutionException e10) {
            Throwable cause = e10.getCause();
            if (cause instanceof IOException) {
                if ("INSTANCE_ID_RESET".equals(cause.getMessage())) {
                    m5339B();
                }
                throw ((IOException) cause);
            }
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new IOException(e10);
        }
    }

    /* renamed from: d */
    public String m5346d() {
        return m5355o(C5442n.m21599c(this.f4826b), "*");
    }

    @Deprecated
    /* renamed from: f */
    public void m5347f(String str, String str2) {
        m5333e(this.f4826b);
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new IOException("MAIN_THREAD");
        }
        String m5331A = m5331A(str2);
        m5345b(this.f4828d.m21590b(m5350i(), str, m5331A));
        f4822j.m5377e(m5353m(), str, m5331A);
    }

    /* renamed from: g */
    public void m5348g(Runnable runnable, long j10) {
        synchronized (FirebaseInstanceId.class) {
            if (f4824l == null) {
                f4824l = new ScheduledThreadPoolExecutor(1, new ThreadFactoryC4056b("FirebaseInstanceId"));
            }
            f4824l.schedule(runnable, j10, TimeUnit.SECONDS);
        }
    }

    /* renamed from: h */
    public C3767g m5349h() {
        return this.f4826b;
    }

    /* renamed from: i */
    public String m5350i() {
        try {
            f4822j.m5382j(this.f4826b.m14352s());
            return (String) m5332c(this.f4830f.getId());
        } catch (InterruptedException e10) {
            throw new IllegalStateException(e10);
        }
    }

    @Deprecated
    /* renamed from: j */
    public Task<InterfaceC5440l> m5351j() {
        m5333e(this.f4826b);
        return m5352k(C5442n.m21599c(this.f4826b), "*");
    }

    /* renamed from: k */
    public final Task<InterfaceC5440l> m5352k(String str, String str2) {
        return Tasks.forResult(null).continueWithTask(this.f4825a, new Continuation(this, str, m5331A(str2)) { // from class: w8.c

            /* renamed from: a */
            public final FirebaseInstanceId f20263a;

            /* renamed from: b */
            public final String f20264b;

            /* renamed from: c */
            public final String f20265c;

            public C5431c(FirebaseInstanceId this, String str3, String str4) {
                this.f20263a = this;
                this.f20264b = str3;
                this.f20265c = str4;
            }

            @Override // com.google.android.gms.tasks.Continuation
            public Object then(Task task) {
                return this.f20263a.m5362z(this.f20264b, this.f20265c, task);
            }
        });
    }

    /* renamed from: m */
    public final String m5353m() {
        return "[DEFAULT]".equals(this.f4826b.m14350q()) ? "" : this.f4826b.m14352s();
    }

    @Deprecated
    /* renamed from: n */
    public String m5354n() {
        m5333e(this.f4826b);
        C1277b.a m5356p = m5356p();
        if (m5343F(m5356p)) {
            m5341D();
        }
        return C1277b.a.m5385b(m5356p);
    }

    @Deprecated
    /* renamed from: o */
    public String m5355o(String str, String str2) {
        m5333e(this.f4826b);
        if (Looper.getMainLooper() != Looper.myLooper()) {
            return ((InterfaceC5440l) m5345b(m5352k(str, str2))).mo21598a();
        }
        throw new IOException("MAIN_THREAD");
    }

    /* renamed from: p */
    public C1277b.a m5356p() {
        return m5357q(C5442n.m21599c(this.f4826b), "*");
    }

    @VisibleForTesting
    /* renamed from: q */
    public C1277b.a m5357q(String str, String str2) {
        return f4822j.m5379g(m5353m(), str, str2);
    }

    @VisibleForTesting
    /* renamed from: s */
    public boolean m5358s() {
        return this.f4827c.m21605g();
    }

    /* renamed from: w */
    public final /* synthetic */ Task m5359w(String str, String str2, String str3, String str4) {
        f4822j.m5381i(m5353m(), str, str2, str4, this.f4827c.m21600a());
        return Tasks.forResult(new C5441m(str3, str4));
    }

    /* renamed from: x */
    public final /* synthetic */ void m5360x(C1277b.a aVar, InterfaceC5440l interfaceC5440l) {
        String mo21598a = interfaceC5440l.mo21598a();
        if (aVar == null || !mo21598a.equals(aVar.f4840a)) {
            Iterator<InterfaceC5739a.a> it = this.f4832h.iterator();
            while (it.hasNext()) {
                it.next().mo8815a(mo21598a);
            }
        }
    }

    /* renamed from: y */
    public final /* synthetic */ Task m5361y(String str, String str2, String str3, C1277b.a aVar) {
        return this.f4828d.m21593e(str, str2, str3).onSuccessTask(this.f4825a, new SuccessContinuation(this, str2, str3, str) { // from class: w8.g

            /* renamed from: a */
            public final FirebaseInstanceId f20273a;

            /* renamed from: b */
            public final String f20274b;

            /* renamed from: c */
            public final String f20275c;

            /* renamed from: d */
            public final String f20276d;

            public C5435g(FirebaseInstanceId this, String str22, String str32, String str4) {
                this.f20273a = this;
                this.f20274b = str22;
                this.f20275c = str32;
                this.f20276d = str4;
            }

            @Override // com.google.android.gms.tasks.SuccessContinuation
            public Task then(Object obj) {
                return this.f20273a.m5359w(this.f20274b, this.f20275c, this.f20276d, (String) obj);
            }
        }).addOnSuccessListener(ExecutorC5436h.f20277h, new OnSuccessListener(this, aVar) { // from class: w8.i

            /* renamed from: a */
            public final FirebaseInstanceId f20278a;

            /* renamed from: b */
            public final C1277b.a f20279b;

            public C5437i(FirebaseInstanceId this, C1277b.a aVar2) {
                this.f20278a = this;
                this.f20279b = aVar2;
            }

            @Override // com.google.android.gms.tasks.OnSuccessListener
            public void onSuccess(Object obj) {
                this.f20278a.m5360x(this.f20279b, (InterfaceC5440l) obj);
            }
        });
    }

    /* renamed from: z */
    public final /* synthetic */ Task m5362z(String str, String str2, Task task) {
        String m5350i = m5350i();
        C1277b.a m5357q = m5357q(str, str2);
        return !m5343F(m5357q) ? Tasks.forResult(new C5441m(m5350i, m5357q.f4840a)) : this.f4829e.m5371a(str, str2, new C1276a.a(this, m5350i, str, str2, m5357q) { // from class: w8.f

            /* renamed from: a */
            public final FirebaseInstanceId f20268a;

            /* renamed from: b */
            public final String f20269b;

            /* renamed from: c */
            public final String f20270c;

            /* renamed from: d */
            public final String f20271d;

            /* renamed from: e */
            public final C1277b.a f20272e;

            public C5434f(FirebaseInstanceId this, String m5350i2, String str3, String str22, C1277b.a m5357q2) {
                this.f20268a = this;
                this.f20269b = m5350i2;
                this.f20270c = str3;
                this.f20271d = str22;
                this.f20272e = m5357q2;
            }

            @Override // com.google.firebase.iid.C1276a.a
            public Task start() {
                return this.f20268a.m5361y(this.f20269b, this.f20270c, this.f20271d, this.f20272e);
            }
        });
    }
}
