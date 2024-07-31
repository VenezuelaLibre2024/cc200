package p102h0;

import android.os.Handler;
import android.os.Process;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p133j0.InterfaceC3202a;

/* renamed from: h0.h */
/* loaded from: classes.dex */
public class C2280h {

    /* renamed from: h0.h$a */
    /* loaded from: classes.dex */
    public static class a implements ThreadFactory {

        /* renamed from: a */
        public String f9152a;

        /* renamed from: b */
        public int f9153b;

        /* renamed from: h0.h$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C6182a extends Thread {

            /* renamed from: h */
            public final int f9154h;

            public C6182a(Runnable runnable, String str, int i10) {
                super(runnable, str);
                this.f9154h = i10;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(this.f9154h);
                super.run();
            }
        }

        public a(String str, int i10) {
            this.f9152a = str;
            this.f9153b = i10;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new C6182a(runnable, this.f9152a, this.f9153b);
        }
    }

    /* renamed from: h0.h$b */
    /* loaded from: classes.dex */
    public static class b<T> implements Runnable {

        /* renamed from: h */
        public Callable<T> f9155h;

        /* renamed from: i */
        public InterfaceC3202a<T> f9156i;

        /* renamed from: j */
        public Handler f9157j;

        /* renamed from: h0.h$b$a */
        /* loaded from: classes.dex */
        public class a implements Runnable {

            /* renamed from: h */
            public final /* synthetic */ InterfaceC3202a f9158h;

            /* renamed from: i */
            public final /* synthetic */ Object f9159i;

            public a(InterfaceC3202a interfaceC3202a, Object obj) {
                this.f9158h = interfaceC3202a;
                this.f9159i = obj;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                this.f9158h.accept(this.f9159i);
            }
        }

        public b(Handler handler, Callable<T> callable, InterfaceC3202a<T> interfaceC3202a) {
            this.f9155h = callable;
            this.f9156i = interfaceC3202a;
            this.f9157j = handler;
        }

        @Override // java.lang.Runnable
        public void run() {
            T t10;
            try {
                t10 = this.f9155h.call();
            } catch (Exception unused) {
                t10 = null;
            }
            this.f9157j.post(new a(this.f9156i, t10));
        }
    }

    /* renamed from: a */
    public static ThreadPoolExecutor m9276a(String str, int i10, int i11) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, i11, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new a(str, i10));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    /* renamed from: b */
    public static <T> void m9277b(Executor executor, Callable<T> callable, InterfaceC3202a<T> interfaceC3202a) {
        executor.execute(new b(C2274b.m9237a(), callable, interfaceC3202a));
    }

    /* renamed from: c */
    public static <T> T m9278c(ExecutorService executorService, Callable<T> callable, int i10) {
        try {
            return executorService.submit(callable).get(i10, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            throw e10;
        } catch (ExecutionException e11) {
            throw new RuntimeException(e11);
        } catch (TimeoutException unused) {
            throw new InterruptedException("timeout");
        }
    }
}
