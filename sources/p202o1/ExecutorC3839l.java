package p202o1;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* renamed from: o1.l */
/* loaded from: classes.dex */
public class ExecutorC3839l implements Executor {

    /* renamed from: h */
    public final Executor f13852h;

    /* renamed from: i */
    public final ArrayDeque<Runnable> f13853i = new ArrayDeque<>();

    /* renamed from: j */
    public Runnable f13854j;

    /* renamed from: o1.l$a */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: h */
        public final /* synthetic */ Runnable f13855h;

        public a(Runnable runnable) {
            this.f13855h = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f13855h.run();
            } finally {
                ExecutorC3839l.this.m14609a();
            }
        }
    }

    public ExecutorC3839l(Executor executor) {
        this.f13852h = executor;
    }

    /* renamed from: a */
    public synchronized void m14609a() {
        Runnable poll = this.f13853i.poll();
        this.f13854j = poll;
        if (poll != null) {
            this.f13852h.execute(poll);
        }
    }

    @Override // java.util.concurrent.Executor
    public synchronized void execute(Runnable runnable) {
        this.f13853i.offer(new a(runnable));
        if (this.f13854j == null) {
            m14609a();
        }
    }
}
