package p099g9;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p285u.C4771a;

/* renamed from: g9.w0 */
/* loaded from: classes.dex */
public class C2207w0 {

    /* renamed from: i */
    public static final long f8761i = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: a */
    public final Context f8762a;

    /* renamed from: b */
    public final C2177h0 f8763b;

    /* renamed from: c */
    public final C2167d0 f8764c;

    /* renamed from: d */
    public final FirebaseMessaging f8765d;

    /* renamed from: f */
    public final ScheduledExecutorService f8767f;

    /* renamed from: h */
    public final C2203u0 f8769h;

    /* renamed from: e */
    public final Map<String, ArrayDeque<TaskCompletionSource<Void>>> f8766e = new C4771a();

    /* renamed from: g */
    public boolean f8768g = false;

    public C2207w0(FirebaseMessaging firebaseMessaging, C2177h0 c2177h0, C2203u0 c2203u0, C2167d0 c2167d0, Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f8765d = firebaseMessaging;
        this.f8763b = c2177h0;
        this.f8769h = c2203u0;
        this.f8764c = c2167d0;
        this.f8762a = context;
        this.f8767f = scheduledExecutorService;
    }

    /* renamed from: c */
    public static <T> void m8845c(Task<T> task) {
        try {
            Tasks.await(task, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException e10) {
            e = e10;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        } catch (ExecutionException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (!(cause instanceof RuntimeException)) {
                throw new IOException(e11);
            }
            throw ((RuntimeException) cause);
        } catch (TimeoutException e12) {
            e = e12;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        }
    }

    /* renamed from: f */
    public static Task<C2207w0> m8846f(final FirebaseMessaging firebaseMessaging, final C2177h0 c2177h0, final C2167d0 c2167d0, final Context context, final ScheduledExecutorService scheduledExecutorService) {
        return Tasks.call(scheduledExecutorService, new Callable() { // from class: g9.v0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C2207w0 m8848j;
                m8848j = C2207w0.m8848j(context, scheduledExecutorService, firebaseMessaging, c2177h0, c2167d0);
                return m8848j;
            }
        });
    }

    /* renamed from: h */
    public static boolean m8847h() {
        return Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3));
    }

    /* renamed from: j */
    public static /* synthetic */ C2207w0 m8848j(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseMessaging firebaseMessaging, C2177h0 c2177h0, C2167d0 c2167d0) {
        return new C2207w0(firebaseMessaging, c2177h0, C2203u0.m8839b(context, scheduledExecutorService), c2167d0, context, scheduledExecutorService);
    }

    /* renamed from: b */
    public final void m8849b(C2201t0 c2201t0, TaskCompletionSource<Void> taskCompletionSource) {
        ArrayDeque<TaskCompletionSource<Void>> arrayDeque;
        synchronized (this.f8766e) {
            String m8838e = c2201t0.m8838e();
            if (this.f8766e.containsKey(m8838e)) {
                arrayDeque = this.f8766e.get(m8838e);
            } else {
                ArrayDeque<TaskCompletionSource<Void>> arrayDeque2 = new ArrayDeque<>();
                this.f8766e.put(m8838e, arrayDeque2);
                arrayDeque = arrayDeque2;
            }
            arrayDeque.add(taskCompletionSource);
        }
    }

    /* renamed from: d */
    public final void m8850d(String str) {
        m8845c(this.f8764c.m8741l(this.f8765d.m5435n(), str));
    }

    /* renamed from: e */
    public final void m8851e(String str) {
        m8845c(this.f8764c.m8742m(this.f8765d.m5435n(), str));
    }

    /* renamed from: g */
    public boolean m8852g() {
        return this.f8769h.m8841c() != null;
    }

    /* renamed from: i */
    public synchronized boolean m8853i() {
        return this.f8768g;
    }

    /* renamed from: k */
    public final void m8854k(C2201t0 c2201t0) {
        synchronized (this.f8766e) {
            String m8838e = c2201t0.m8838e();
            if (this.f8766e.containsKey(m8838e)) {
                ArrayDeque<TaskCompletionSource<Void>> arrayDeque = this.f8766e.get(m8838e);
                TaskCompletionSource<Void> poll = arrayDeque.poll();
                if (poll != null) {
                    poll.setResult(null);
                }
                if (arrayDeque.isEmpty()) {
                    this.f8766e.remove(m8838e);
                }
            }
        }
    }

    /* renamed from: l */
    public boolean m8855l(C2201t0 c2201t0) {
        String str;
        String str2;
        try {
            String m8836b = c2201t0.m8836b();
            char c10 = 65535;
            int hashCode = m8836b.hashCode();
            if (hashCode != 83) {
                if (hashCode == 85 && m8836b.equals("U")) {
                    c10 = 1;
                }
            } else if (m8836b.equals("S")) {
                c10 = 0;
            }
            if (c10 == 0) {
                m8850d(c2201t0.m8837c());
                if (m8847h()) {
                    str2 = "Subscribe to topic: " + c2201t0.m8837c() + " succeeded.";
                    Log.d("FirebaseMessaging", str2);
                }
                return true;
            }
            if (c10 != 1) {
                if (m8847h()) {
                    str2 = "Unknown topic operation" + c2201t0 + ".";
                    Log.d("FirebaseMessaging", str2);
                }
                return true;
            }
            m8851e(c2201t0.m8837c());
            if (m8847h()) {
                str2 = "Unsubscribe from topic: " + c2201t0.m8837c() + " succeeded.";
                Log.d("FirebaseMessaging", str2);
            }
            return true;
        } catch (IOException e10) {
            if ("SERVICE_NOT_AVAILABLE".equals(e10.getMessage())) {
            }
            str = "Topic operation failed: " + e10.getMessage() + ". Will retry Topic operation.";
            Log.e("FirebaseMessaging", str);
            return false;
        }
        if (!"SERVICE_NOT_AVAILABLE".equals(e10.getMessage()) || "INTERNAL_SERVER_ERROR".equals(e10.getMessage())) {
            str = "Topic operation failed: " + e10.getMessage() + ". Will retry Topic operation.";
        } else {
            if (e10.getMessage() != null) {
                throw e10;
            }
            str = "Topic operation failed without exception message. Will retry Topic operation.";
        }
        Log.e("FirebaseMessaging", str);
        return false;
    }

    /* renamed from: m */
    public void m8856m(Runnable runnable, long j10) {
        this.f8767f.schedule(runnable, j10, TimeUnit.SECONDS);
    }

    /* renamed from: n */
    public Task<Void> m8857n(C2201t0 c2201t0) {
        this.f8769h.m8840a(c2201t0);
        TaskCompletionSource<Void> taskCompletionSource = new TaskCompletionSource<>();
        m8849b(c2201t0, taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    /* renamed from: o */
    public synchronized void m8858o(boolean z10) {
        this.f8768g = z10;
    }

    /* renamed from: p */
    public final void m8859p() {
        if (m8853i()) {
            return;
        }
        m8863t(0L);
    }

    /* renamed from: q */
    public void m8860q() {
        if (m8852g()) {
            m8859p();
        }
    }

    /* renamed from: r */
    public Task<Void> m8861r(String str) {
        Task<Void> m8857n = m8857n(C2201t0.m8834f(str));
        m8860q();
        return m8857n;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x000d, code lost:
    
        if (m8847h() == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x000f, code lost:
    
        android.util.Log.d("FirebaseMessaging", "topic sync succeeded");
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0018, code lost:
    
        return true;
     */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m8862s() {
        /*
            r2 = this;
        L0:
            monitor-enter(r2)
            g9.u0 r0 = r2.f8769h     // Catch: java.lang.Throwable -> L2b
            g9.t0 r0 = r0.m8841c()     // Catch: java.lang.Throwable -> L2b
            if (r0 != 0) goto L19
            boolean r0 = m8847h()     // Catch: java.lang.Throwable -> L2b
            if (r0 == 0) goto L16
            java.lang.String r0 = "FirebaseMessaging"
            java.lang.String r1 = "topic sync succeeded"
            android.util.Log.d(r0, r1)     // Catch: java.lang.Throwable -> L2b
        L16:
            r0 = 1
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2b
            return r0
        L19:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2b
            boolean r1 = r2.m8855l(r0)
            if (r1 != 0) goto L22
            r0 = 0
            return r0
        L22:
            g9.u0 r1 = r2.f8769h
            r1.m8843e(r0)
            r2.m8854k(r0)
            goto L0
        L2b:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2b
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p099g9.C2207w0.m8862s():boolean");
    }

    /* renamed from: t */
    public void m8863t(long j10) {
        m8856m(new RunnableC2209x0(this, this.f8762a, this.f8763b, Math.min(Math.max(30L, 2 * j10), f8761i)), j10);
        m8858o(true);
    }

    /* renamed from: u */
    public Task<Void> m8864u(String str) {
        Task<Void> m8857n = m8857n(C2201t0.m8835g(str));
        m8860q();
        return m8857n;
    }
}
