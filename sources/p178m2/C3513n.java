package p178m2;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import p029c2.AbstractC0592j;

/* renamed from: m2.n */
/* loaded from: classes.dex */
public class C3513n {

    /* renamed from: f */
    public static final String f12318f = AbstractC0592j.m2972f("WorkTimer");

    /* renamed from: a */
    public final ThreadFactory f12319a;

    /* renamed from: b */
    public final ScheduledExecutorService f12320b;

    /* renamed from: c */
    public final Map<String, c> f12321c;

    /* renamed from: d */
    public final Map<String, b> f12322d;

    /* renamed from: e */
    public final Object f12323e;

    /* renamed from: m2.n$a */
    /* loaded from: classes.dex */
    public class a implements ThreadFactory {

        /* renamed from: a */
        public int f12324a = 0;

        public a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
            newThread.setName("WorkManager-WorkTimer-thread-" + this.f12324a);
            this.f12324a = this.f12324a + 1;
            return newThread;
        }
    }

    /* renamed from: m2.n$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: a */
        void mo2181a(String str);
    }

    /* renamed from: m2.n$c */
    /* loaded from: classes.dex */
    public static class c implements Runnable {

        /* renamed from: h */
        public final C3513n f12326h;

        /* renamed from: i */
        public final String f12327i;

        public c(C3513n c3513n, String str) {
            this.f12326h = c3513n;
            this.f12327i = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f12326h.f12323e) {
                if (this.f12326h.f12321c.remove(this.f12327i) != null) {
                    b remove = this.f12326h.f12322d.remove(this.f12327i);
                    if (remove != null) {
                        remove.mo2181a(this.f12327i);
                    }
                } else {
                    AbstractC0592j.m2970c().mo2973a("WrkTimerRunnable", String.format("Timer with %s is already marked as complete.", this.f12327i), new Throwable[0]);
                }
            }
        }
    }

    public C3513n() {
        a aVar = new a();
        this.f12319a = aVar;
        this.f12321c = new HashMap();
        this.f12322d = new HashMap();
        this.f12323e = new Object();
        this.f12320b = Executors.newSingleThreadScheduledExecutor(aVar);
    }

    /* renamed from: a */
    public void m13058a() {
        if (this.f12320b.isShutdown()) {
            return;
        }
        this.f12320b.shutdownNow();
    }

    /* renamed from: b */
    public void m13059b(String str, long j10, b bVar) {
        synchronized (this.f12323e) {
            AbstractC0592j.m2970c().mo2973a(f12318f, String.format("Starting timer for %s", str), new Throwable[0]);
            m13060c(str);
            c cVar = new c(this, str);
            this.f12321c.put(str, cVar);
            this.f12322d.put(str, bVar);
            this.f12320b.schedule(cVar, j10, TimeUnit.MILLISECONDS);
        }
    }

    /* renamed from: c */
    public void m13060c(String str) {
        synchronized (this.f12323e) {
            if (this.f12321c.remove(str) != null) {
                AbstractC0592j.m2970c().mo2973a(f12318f, String.format("Stopping timer for %s", str), new Throwable[0]);
                this.f12322d.remove(str);
            }
        }
    }
}
