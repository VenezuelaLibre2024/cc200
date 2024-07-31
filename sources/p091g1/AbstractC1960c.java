package p091g1;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: g1.c */
/* loaded from: classes.dex */
public abstract class AbstractC1960c<Result> {

    /* renamed from: l */
    public static Handler f7790l;

    /* renamed from: i */
    public volatile e f7792i = e.PENDING;

    /* renamed from: j */
    public final AtomicBoolean f7793j = new AtomicBoolean();

    /* renamed from: k */
    public final AtomicBoolean f7794k = new AtomicBoolean();

    /* renamed from: h */
    public final FutureTask<Result> f7791h = new b(new a());

    /* renamed from: g1.c$a */
    /* loaded from: classes.dex */
    public class a implements Callable<Result> {
        public a() {
        }

        @Override // java.util.concurrent.Callable
        public Result call() {
            AbstractC1960c.this.f7794k.set(true);
            Result result = null;
            try {
                Process.setThreadPriority(10);
                result = (Result) AbstractC1960c.this.mo7891b();
                Binder.flushPendingCommands();
                return result;
            } finally {
            }
        }
    }

    /* renamed from: g1.c$b */
    /* loaded from: classes.dex */
    public class b extends FutureTask<Result> {
        public b(Callable callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        public void done() {
            try {
                AbstractC1960c.this.m7920j(get());
            } catch (InterruptedException e10) {
                Log.w("AsyncTask", e10);
            } catch (CancellationException unused) {
                AbstractC1960c.this.m7920j(null);
            } catch (ExecutionException e11) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e11.getCause());
            } catch (Throwable th) {
                throw new RuntimeException("An error occurred while executing doInBackground()", th);
            }
        }
    }

    /* renamed from: g1.c$c */
    /* loaded from: classes.dex */
    public class c implements Runnable {

        /* renamed from: h */
        public final /* synthetic */ Object f7797h;

        public c(Object obj) {
            this.f7797h = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            AbstractC1960c.this.m7917d(this.f7797h);
        }
    }

    /* renamed from: g1.c$d */
    /* loaded from: classes.dex */
    public static /* synthetic */ class d {

        /* renamed from: a */
        public static final /* synthetic */ int[] f7799a;

        static {
            int[] iArr = new int[e.values().length];
            f7799a = iArr;
            try {
                iArr[e.RUNNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7799a[e.FINISHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: g1.c$e */
    /* loaded from: classes.dex */
    public enum e {
        PENDING,
        RUNNING,
        FINISHED
    }

    /* renamed from: e */
    public static Handler m7914e() {
        Handler handler;
        synchronized (AbstractC1960c.class) {
            if (f7790l == null) {
                f7790l = new Handler(Looper.getMainLooper());
            }
            handler = f7790l;
        }
        return handler;
    }

    /* renamed from: a */
    public final boolean m7915a(boolean z10) {
        this.f7793j.set(true);
        return this.f7791h.cancel(z10);
    }

    /* renamed from: b */
    public abstract Result mo7891b();

    /* renamed from: c */
    public final void m7916c(Executor executor) {
        if (this.f7792i == e.PENDING) {
            this.f7792i = e.RUNNING;
            executor.execute(this.f7791h);
            return;
        }
        int i10 = d.f7799a[this.f7792i.ordinal()];
        if (i10 == 1) {
            throw new IllegalStateException("Cannot execute task: the task is already running.");
        }
        if (i10 == 2) {
            throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
        }
        throw new IllegalStateException("We should never reach this state");
    }

    /* renamed from: d */
    public void m7917d(Result result) {
        if (m7918f()) {
            mo7892g(result);
        } else {
            mo7893h(result);
        }
        this.f7792i = e.FINISHED;
    }

    /* renamed from: f */
    public final boolean m7918f() {
        return this.f7793j.get();
    }

    /* renamed from: g */
    public void mo7892g(Result result) {
    }

    /* renamed from: h */
    public void mo7893h(Result result) {
    }

    /* renamed from: i */
    public void m7919i(Result result) {
        m7914e().post(new c(result));
    }

    /* renamed from: j */
    public void m7920j(Result result) {
        if (this.f7794k.get()) {
            return;
        }
        m7919i(result);
    }
}
