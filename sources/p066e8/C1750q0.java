package p066e8;

import android.annotation.SuppressLint;
import android.os.Looper;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: e8.q0 */
/* loaded from: classes.dex */
public final class C1750q0 {

    /* renamed from: a */
    public static final ExecutorService f6446a = C1759z.m7049c("awaitEvenIfOnMainThread task continuation executor");

    /* renamed from: f */
    public static <T> T m6963f(Task<T> task) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        task.continueWith(f6446a, new Continuation() { // from class: e8.o0

            /* renamed from: a */
            public final /* synthetic */ CountDownLatch f6393a;

            public /* synthetic */ C1746o0(CountDownLatch countDownLatch2) {
                r1 = countDownLatch2;
            }

            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task2) {
                Object m6966i;
                m6966i = C1750q0.m6966i(r1, task2);
                return m6966i;
            }
        });
        countDownLatch2.await(Looper.getMainLooper() == Looper.myLooper() ? 3L : 4L, TimeUnit.SECONDS);
        if (task.isSuccessful()) {
            return task.getResult();
        }
        if (task.isCanceled()) {
            throw new CancellationException("Task is already canceled");
        }
        if (task.isComplete()) {
            throw new IllegalStateException(task.getException());
        }
        throw new TimeoutException();
    }

    /* renamed from: g */
    public static boolean m6964g(CountDownLatch countDownLatch, long j10, TimeUnit timeUnit) {
        boolean z10 = false;
        try {
            long nanos = timeUnit.toNanos(j10);
            while (true) {
                try {
                    break;
                } catch (InterruptedException unused) {
                    z10 = true;
                    nanos = (System.nanoTime() + nanos) - System.nanoTime();
                }
            }
            return countDownLatch.await(nanos, TimeUnit.NANOSECONDS);
        } finally {
            if (z10) {
                Thread.currentThread().interrupt();
            }
        }
    }

    /* renamed from: h */
    public static <T> Task<T> m6965h(Executor executor, Callable<Task<T>> callable) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        executor.execute(new Runnable() { // from class: e8.p0

            /* renamed from: h */
            public final /* synthetic */ Callable f6442h;

            /* renamed from: i */
            public final /* synthetic */ Executor f6443i;

            /* renamed from: j */
            public final /* synthetic */ TaskCompletionSource f6444j;

            public /* synthetic */ RunnableC1748p0(Callable callable2, Executor executor2, TaskCompletionSource taskCompletionSource2) {
                r1 = callable2;
                r2 = executor2;
                r3 = taskCompletionSource2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C1750q0.m6968k(r1, r2, r3);
            }
        });
        return taskCompletionSource2.getTask();
    }

    /* renamed from: i */
    public static /* synthetic */ Object m6966i(CountDownLatch countDownLatch, Task task) {
        countDownLatch.countDown();
        return null;
    }

    /* renamed from: j */
    public static /* synthetic */ Object m6967j(TaskCompletionSource taskCompletionSource, Task task) {
        if (task.isSuccessful()) {
            taskCompletionSource.setResult(task.getResult());
            return null;
        }
        if (task.getException() == null) {
            return null;
        }
        taskCompletionSource.setException(task.getException());
        return null;
    }

    /* renamed from: k */
    public static /* synthetic */ void m6968k(Callable callable, Executor executor, TaskCompletionSource taskCompletionSource) {
        try {
            ((Task) callable.call()).continueWith(executor, new Continuation() { // from class: e8.n0
                public /* synthetic */ C1744n0() {
                }

                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    Object m6967j;
                    m6967j = C1750q0.m6967j(TaskCompletionSource.this, task);
                    return m6967j;
                }
            });
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* renamed from: l */
    public static /* synthetic */ Void m6969l(TaskCompletionSource taskCompletionSource, Task task) {
        if (task.isSuccessful()) {
            taskCompletionSource.trySetResult(task.getResult());
            return null;
        }
        if (task.getException() == null) {
            return null;
        }
        taskCompletionSource.trySetException(task.getException());
        return null;
    }

    /* renamed from: m */
    public static /* synthetic */ Void m6970m(TaskCompletionSource taskCompletionSource, Task task) {
        if (task.isSuccessful()) {
            taskCompletionSource.trySetResult(task.getResult());
            return null;
        }
        if (task.getException() == null) {
            return null;
        }
        taskCompletionSource.trySetException(task.getException());
        return null;
    }

    @SuppressLint({"TaskMainThread"})
    /* renamed from: n */
    public static <T> Task<T> m6971n(Task<T> task, Task<T> task2) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        C1742m0 c1742m0 = new Continuation() { // from class: e8.m0
            public /* synthetic */ C1742m0() {
            }

            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task3) {
                Void m6969l;
                m6969l = C1750q0.m6969l(TaskCompletionSource.this, task3);
                return m6969l;
            }
        };
        task.continueWith(c1742m0);
        task2.continueWith(c1742m0);
        return taskCompletionSource.getTask();
    }

    /* renamed from: o */
    public static <T> Task<T> m6972o(Executor executor, Task<T> task, Task<T> task2) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        C1740l0 c1740l0 = new Continuation() { // from class: e8.l0
            public /* synthetic */ C1740l0() {
            }

            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task3) {
                Void m6970m;
                m6970m = C1750q0.m6970m(TaskCompletionSource.this, task3);
                return m6970m;
            }
        };
        task.continueWith(executor, c1740l0);
        task2.continueWith(executor, c1740l0);
        return taskCompletionSource.getTask();
    }
}
