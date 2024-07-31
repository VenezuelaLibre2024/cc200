package p368z7;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p368z7.ScheduledFutureC6066p;

/* renamed from: z7.o */
/* loaded from: classes.dex */
public class ScheduledExecutorServiceC6065o implements ScheduledExecutorService {

    /* renamed from: h */
    public final ExecutorService f22559h;

    /* renamed from: i */
    public final ScheduledExecutorService f22560i;

    public ScheduledExecutorServiceC6065o(ExecutorService executorService, ScheduledExecutorService scheduledExecutorService) {
        this.f22559h = executorService;
        this.f22560i = scheduledExecutorService;
    }

    /* renamed from: n */
    public static /* synthetic */ void m24275n(Runnable runnable, ScheduledFutureC6066p.b bVar) {
        try {
            runnable.run();
            bVar.set(null);
        } catch (Exception e10) {
            bVar.mo24290a(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public /* synthetic */ void m24276o(final Runnable runnable, final ScheduledFutureC6066p.b bVar) {
        this.f22559h.execute(new Runnable() { // from class: z7.c
            @Override // java.lang.Runnable
            public final void run() {
                ScheduledExecutorServiceC6065o.m24275n(runnable, bVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public /* synthetic */ ScheduledFuture m24277p(final Runnable runnable, long j10, TimeUnit timeUnit, final ScheduledFutureC6066p.b bVar) {
        return this.f22560i.schedule(new Runnable() { // from class: z7.i
            @Override // java.lang.Runnable
            public final void run() {
                ScheduledExecutorServiceC6065o.this.m24276o(runnable, bVar);
            }
        }, j10, timeUnit);
    }

    /* renamed from: q */
    public static /* synthetic */ void m24278q(Callable callable, ScheduledFutureC6066p.b bVar) {
        try {
            bVar.set(callable.call());
        } catch (Exception e10) {
            bVar.mo24290a(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public /* synthetic */ Future m24279r(final Callable callable, final ScheduledFutureC6066p.b bVar) {
        return this.f22559h.submit(new Runnable() { // from class: z7.h
            @Override // java.lang.Runnable
            public final void run() {
                ScheduledExecutorServiceC6065o.m24278q(callable, bVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public /* synthetic */ ScheduledFuture m24280s(final Callable callable, long j10, TimeUnit timeUnit, final ScheduledFutureC6066p.b bVar) {
        return this.f22560i.schedule(new Callable() { // from class: z7.l
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Future m24279r;
                m24279r = ScheduledExecutorServiceC6065o.this.m24279r(callable, bVar);
                return m24279r;
            }
        }, j10, timeUnit);
    }

    /* renamed from: t */
    public static /* synthetic */ void m24281t(Runnable runnable, ScheduledFutureC6066p.b bVar) {
        try {
            runnable.run();
        } catch (Exception e10) {
            bVar.mo24290a(e10);
            throw e10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public /* synthetic */ void m24282u(final Runnable runnable, final ScheduledFutureC6066p.b bVar) {
        this.f22559h.execute(new Runnable() { // from class: z7.f
            @Override // java.lang.Runnable
            public final void run() {
                ScheduledExecutorServiceC6065o.m24281t(runnable, bVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public /* synthetic */ ScheduledFuture m24283v(final Runnable runnable, long j10, long j11, TimeUnit timeUnit, final ScheduledFutureC6066p.b bVar) {
        return this.f22560i.scheduleAtFixedRate(new Runnable() { // from class: z7.j
            @Override // java.lang.Runnable
            public final void run() {
                ScheduledExecutorServiceC6065o.this.m24282u(runnable, bVar);
            }
        }, j10, j11, timeUnit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public /* synthetic */ void m24284w(final Runnable runnable, final ScheduledFutureC6066p.b bVar) {
        this.f22559h.execute(new Runnable() { // from class: z7.g
            @Override // java.lang.Runnable
            public final void run() {
                ScheduledExecutorServiceC6065o.m24286y(runnable, bVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public /* synthetic */ ScheduledFuture m24285x(final Runnable runnable, long j10, long j11, TimeUnit timeUnit, final ScheduledFutureC6066p.b bVar) {
        return this.f22560i.scheduleWithFixedDelay(new Runnable() { // from class: z7.k
            @Override // java.lang.Runnable
            public final void run() {
                ScheduledExecutorServiceC6065o.this.m24284w(runnable, bVar);
            }
        }, j10, j11, timeUnit);
    }

    /* renamed from: y */
    public static /* synthetic */ void m24286y(Runnable runnable, ScheduledFutureC6066p.b bVar) {
        try {
            runnable.run();
        } catch (Exception e10) {
            bVar.mo24290a(e10);
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j10, TimeUnit timeUnit) {
        return this.f22559h.awaitTermination(j10, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f22559h.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) {
        return this.f22559h.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j10, TimeUnit timeUnit) {
        return this.f22559h.invokeAll(collection, j10, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection) {
        return (T) this.f22559h.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j10, TimeUnit timeUnit) {
        return (T) this.f22559h.invokeAny(collection, j10, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.f22559h.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.f22559h.isTerminated();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> schedule(final Runnable runnable, final long j10, final TimeUnit timeUnit) {
        return new ScheduledFutureC6066p(new ScheduledFutureC6066p.c() { // from class: z7.d
            @Override // p368z7.ScheduledFutureC6066p.c
            /* renamed from: a */
            public final ScheduledFuture mo24262a(ScheduledFutureC6066p.b bVar) {
                ScheduledFuture m24277p;
                m24277p = ScheduledExecutorServiceC6065o.this.m24277p(runnable, j10, timeUnit, bVar);
                return m24277p;
            }
        });
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public <V> ScheduledFuture<V> schedule(final Callable<V> callable, final long j10, final TimeUnit timeUnit) {
        return new ScheduledFutureC6066p(new ScheduledFutureC6066p.c() { // from class: z7.e
            @Override // p368z7.ScheduledFutureC6066p.c
            /* renamed from: a */
            public final ScheduledFuture mo24262a(ScheduledFutureC6066p.b bVar) {
                ScheduledFuture m24280s;
                m24280s = ScheduledExecutorServiceC6065o.this.m24280s(callable, j10, timeUnit, bVar);
                return m24280s;
            }
        });
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleAtFixedRate(final Runnable runnable, final long j10, final long j11, final TimeUnit timeUnit) {
        return new ScheduledFutureC6066p(new ScheduledFutureC6066p.c() { // from class: z7.m
            @Override // p368z7.ScheduledFutureC6066p.c
            /* renamed from: a */
            public final ScheduledFuture mo24262a(ScheduledFutureC6066p.b bVar) {
                ScheduledFuture m24283v;
                m24283v = ScheduledExecutorServiceC6065o.this.m24283v(runnable, j10, j11, timeUnit, bVar);
                return m24283v;
            }
        });
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleWithFixedDelay(final Runnable runnable, final long j10, final long j11, final TimeUnit timeUnit) {
        return new ScheduledFutureC6066p(new ScheduledFutureC6066p.c() { // from class: z7.n
            @Override // p368z7.ScheduledFutureC6066p.c
            /* renamed from: a */
            public final ScheduledFuture mo24262a(ScheduledFutureC6066p.b bVar) {
                ScheduledFuture m24285x;
                m24285x = ScheduledExecutorServiceC6065o.this.m24285x(runnable, j10, j11, timeUnit, bVar);
                return m24285x;
            }
        });
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        return this.f22559h.submit(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Runnable runnable, T t10) {
        return this.f22559h.submit(runnable, t10);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Callable<T> callable) {
        return this.f22559h.submit(callable);
    }
}
