package p093g3;

import java.util.concurrent.Executor;
import p151k3.C3347a;

/* renamed from: g3.n */
/* loaded from: classes.dex */
public class ExecutorC1976n implements Executor {

    /* renamed from: h */
    public final Executor f7880h;

    /* renamed from: g3.n$a */
    /* loaded from: classes.dex */
    public static class a implements Runnable {

        /* renamed from: h */
        public final Runnable f7881h;

        public a(Runnable runnable) {
            this.f7881h = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f7881h.run();
            } catch (Exception e10) {
                C3347a.m12406d("Executor", "Background execution failure.", e10);
            }
        }
    }

    public ExecutorC1976n(Executor executor) {
        this.f7880h = executor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f7880h.execute(new a(runnable));
    }
}
