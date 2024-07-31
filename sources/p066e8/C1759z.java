package p066e8;

import android.annotation.SuppressLint;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import p023b8.C0515g;

/* renamed from: e8.z */
/* loaded from: classes.dex */
public final class C1759z {

    /* renamed from: e8.z$a */
    /* loaded from: classes.dex */
    public class a implements ThreadFactory {

        /* renamed from: a */
        public final /* synthetic */ String f6500a;

        /* renamed from: b */
        public final /* synthetic */ AtomicLong f6501b;

        /* renamed from: e8.z$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C6161a extends AbstractRunnableC1723d {

            /* renamed from: h */
            public final /* synthetic */ Runnable f6502h;

            public C6161a(Runnable runnable) {
                this.f6502h = runnable;
            }

            @Override // p066e8.AbstractRunnableC1723d
            /* renamed from: a */
            public void mo6787a() {
                this.f6502h.run();
            }
        }

        public a(String str, AtomicLong atomicLong) {
            this.f6500a = str;
            this.f6501b = atomicLong;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread newThread = Executors.defaultThreadFactory().newThread(new C6161a(runnable));
            newThread.setName(this.f6500a + this.f6501b.getAndIncrement());
            return newThread;
        }
    }

    /* renamed from: e8.z$b */
    /* loaded from: classes.dex */
    public class b extends AbstractRunnableC1723d {

        /* renamed from: h */
        public final /* synthetic */ String f6504h;

        /* renamed from: i */
        public final /* synthetic */ ExecutorService f6505i;

        /* renamed from: j */
        public final /* synthetic */ long f6506j;

        /* renamed from: k */
        public final /* synthetic */ TimeUnit f6507k;

        public b(String str, ExecutorService executorService, long j10, TimeUnit timeUnit) {
            this.f6504h = str;
            this.f6505i = executorService;
            this.f6506j = j10;
            this.f6507k = timeUnit;
        }

        @Override // p066e8.AbstractRunnableC1723d
        /* renamed from: a */
        public void mo6787a() {
            try {
                C0515g.m2482f().m2484b("Executing shutdown hook for " + this.f6504h);
                this.f6505i.shutdown();
                if (this.f6505i.awaitTermination(this.f6506j, this.f6507k)) {
                    return;
                }
                C0515g.m2482f().m2484b(this.f6504h + " did not shut down in the allocated time. Requesting immediate shutdown.");
                this.f6505i.shutdownNow();
            } catch (InterruptedException unused) {
                C0515g.m2482f().m2484b(String.format(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", this.f6504h));
                this.f6505i.shutdownNow();
            }
        }
    }

    /* renamed from: a */
    public static void m7047a(String str, ExecutorService executorService) {
        m7048b(str, executorService, 2L, TimeUnit.SECONDS);
    }

    @SuppressLint({"ThreadPoolCreation"})
    /* renamed from: b */
    public static void m7048b(String str, ExecutorService executorService, long j10, TimeUnit timeUnit) {
        Runtime.getRuntime().addShutdownHook(new Thread(new b(str, executorService, j10, timeUnit), "Crashlytics Shutdown Hook for " + str));
    }

    /* renamed from: c */
    public static ExecutorService m7049c(String str) {
        ExecutorService m7051e = m7051e(m7050d(str), new ThreadPoolExecutor.DiscardPolicy());
        m7047a(str, m7051e);
        return m7051e;
    }

    /* renamed from: d */
    public static ThreadFactory m7050d(String str) {
        return new a(str, new AtomicLong(1L));
    }

    @SuppressLint({"ThreadPoolCreation"})
    /* renamed from: e */
    public static ExecutorService m7051e(ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        return Executors.unconfigurableExecutorService(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), threadFactory, rejectedExecutionHandler));
    }
}
