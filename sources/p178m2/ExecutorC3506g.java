package p178m2;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* renamed from: m2.g */
/* loaded from: classes.dex */
public class ExecutorC3506g implements Executor {

    /* renamed from: i */
    public final Executor f12281i;

    /* renamed from: k */
    public volatile Runnable f12283k;

    /* renamed from: h */
    public final ArrayDeque<a> f12280h = new ArrayDeque<>();

    /* renamed from: j */
    public final Object f12282j = new Object();

    /* renamed from: m2.g$a */
    /* loaded from: classes.dex */
    public static class a implements Runnable {

        /* renamed from: h */
        public final ExecutorC3506g f12284h;

        /* renamed from: i */
        public final Runnable f12285i;

        public a(ExecutorC3506g executorC3506g, Runnable runnable) {
            this.f12284h = executorC3506g;
            this.f12285i = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f12285i.run();
            } finally {
                this.f12284h.m13054b();
            }
        }
    }

    public ExecutorC3506g(Executor executor) {
        this.f12281i = executor;
    }

    /* renamed from: a */
    public boolean m13053a() {
        boolean z10;
        synchronized (this.f12282j) {
            z10 = !this.f12280h.isEmpty();
        }
        return z10;
    }

    /* renamed from: b */
    public void m13054b() {
        synchronized (this.f12282j) {
            a poll = this.f12280h.poll();
            this.f12283k = poll;
            if (poll != null) {
                this.f12281i.execute(this.f12283k);
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        synchronized (this.f12282j) {
            this.f12280h.add(new a(this, runnable));
            if (this.f12283k == null) {
                m13054b();
            }
        }
    }
}
