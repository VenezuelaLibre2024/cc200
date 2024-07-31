package p368z7;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;
import p353y7.C5870d0;

/* renamed from: z7.a0 */
/* loaded from: classes.dex */
public class ExecutorC6049a0 implements Executor {

    /* renamed from: h */
    public final Executor f22495h;

    /* renamed from: i */
    public final Semaphore f22496i;

    /* renamed from: j */
    public final LinkedBlockingQueue<Runnable> f22497j = new LinkedBlockingQueue<>();

    public ExecutorC6049a0(Executor executor, int i10) {
        C5870d0.m23500a(i10 > 0, "concurrency must be positive.");
        this.f22495h = executor;
        this.f22496i = new Semaphore(i10, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m24251c(Runnable runnable) {
        try {
            runnable.run();
        } finally {
            this.f22496i.release();
            m24253d();
        }
    }

    /* renamed from: b */
    public final Runnable m24252b(final Runnable runnable) {
        return new Runnable() { // from class: z7.z
            @Override // java.lang.Runnable
            public final void run() {
                ExecutorC6049a0.this.m24251c(runnable);
            }
        };
    }

    /* renamed from: d */
    public final void m24253d() {
        while (this.f22496i.tryAcquire()) {
            Runnable poll = this.f22497j.poll();
            if (poll == null) {
                this.f22496i.release();
                return;
            }
            this.f22495h.execute(m24252b(poll));
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f22497j.offer(runnable);
        m24253d();
    }
}
