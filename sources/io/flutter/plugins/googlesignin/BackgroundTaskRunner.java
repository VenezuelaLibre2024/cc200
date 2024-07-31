package io.flutter.plugins.googlesignin;

import io.flutter.plugins.googlesignin.BackgroundTaskRunner;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p170l7.C3448i;
import p170l7.InterfaceFutureC3445f;

/* loaded from: classes2.dex */
public final class BackgroundTaskRunner {
    private final ThreadPoolExecutor executor;

    /* loaded from: classes2.dex */
    public interface Callback<T> {
        void run(Future<T> future);
    }

    public BackgroundTaskRunner(int i10) {
        this.executor = new ThreadPoolExecutor(i10, i10, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$runInBackground$1(C3448i c3448i, Callable callable) {
        if (c3448i.isCancelled()) {
            return;
        }
        try {
            c3448i.mo12806B(callable.call());
        } catch (Throwable th) {
            c3448i.mo12807C(th);
        }
    }

    public <T> InterfaceFutureC3445f<T> runInBackground(final Callable<T> callable) {
        final C3448i m12832D = C3448i.m12832D();
        this.executor.execute(new Runnable() { // from class: io.flutter.plugins.googlesignin.b
            @Override // java.lang.Runnable
            public final void run() {
                BackgroundTaskRunner.lambda$runInBackground$1(C3448i.this, callable);
            }
        });
        return m12832D;
    }

    public <T> void runInBackground(Callable<T> callable, final Callback<T> callback) {
        final InterfaceFutureC3445f<T> runInBackground = runInBackground(callable);
        runInBackground.mo12809b(new Runnable() { // from class: io.flutter.plugins.googlesignin.a
            @Override // java.lang.Runnable
            public final void run() {
                BackgroundTaskRunner.Callback.this.run(runInBackground);
            }
        }, Executors.uiThreadExecutor());
    }
}
