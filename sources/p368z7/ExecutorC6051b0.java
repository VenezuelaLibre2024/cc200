package p368z7;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;
import p108h6.C2394s;

/* renamed from: z7.b0 */
/* loaded from: classes.dex */
public final class ExecutorC6051b0 implements Executor {

    /* renamed from: m */
    public static final Logger f22503m = Logger.getLogger(ExecutorC6051b0.class.getName());

    /* renamed from: h */
    public final Executor f22504h;

    /* renamed from: i */
    public final Deque<Runnable> f22505i = new ArrayDeque();

    /* renamed from: j */
    public c f22506j = c.IDLE;

    /* renamed from: k */
    public long f22507k = 0;

    /* renamed from: l */
    public final b f22508l = new b(this, null);

    /* renamed from: z7.b0$a */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: h */
        public final /* synthetic */ Runnable f22509h;

        public a(Runnable runnable) {
            this.f22509h = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f22509h.run();
        }

        public String toString() {
            return this.f22509h.toString();
        }
    }

    /* renamed from: z7.b0$b */
    /* loaded from: classes.dex */
    public final class b implements Runnable {

        /* renamed from: h */
        public Runnable f22511h;

        public b() {
        }

        public /* synthetic */ b(ExecutorC6051b0 executorC6051b0, a aVar) {
            this();
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0052, code lost:
        
            r1 = r1 | java.lang.Thread.interrupted();
            r2 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0054, code lost:
        
            r8.f22511h.run();
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x005e, code lost:
        
            r3 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x005f, code lost:
        
            p368z7.ExecutorC6051b0.f22503m.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + r8.f22511h, (java.lang.Throwable) r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x005c, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x007c, code lost:
        
            r8.f22511h = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x007e, code lost:
        
            throw r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x004c, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:?, code lost:
        
            return;
         */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void m24261a() {
            /*
                r8 = this;
                r0 = 0
                r1 = r0
            L2:
                z7.b0 r2 = p368z7.ExecutorC6051b0.this     // Catch: java.lang.Throwable -> L82
                java.util.Deque r2 = p368z7.ExecutorC6051b0.m24256a(r2)     // Catch: java.lang.Throwable -> L82
                monitor-enter(r2)     // Catch: java.lang.Throwable -> L82
                if (r0 != 0) goto L2b
                z7.b0 r0 = p368z7.ExecutorC6051b0.this     // Catch: java.lang.Throwable -> L7f
                z7.b0$c r0 = p368z7.ExecutorC6051b0.m24257b(r0)     // Catch: java.lang.Throwable -> L7f
                z7.b0$c r3 = p368z7.ExecutorC6051b0.c.RUNNING     // Catch: java.lang.Throwable -> L7f
                if (r0 != r3) goto L20
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L7f
                if (r1 == 0) goto L1f
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L1f:
                return
            L20:
                z7.b0 r0 = p368z7.ExecutorC6051b0.this     // Catch: java.lang.Throwable -> L7f
                p368z7.ExecutorC6051b0.m24259d(r0)     // Catch: java.lang.Throwable -> L7f
                z7.b0 r0 = p368z7.ExecutorC6051b0.this     // Catch: java.lang.Throwable -> L7f
                p368z7.ExecutorC6051b0.m24258c(r0, r3)     // Catch: java.lang.Throwable -> L7f
                r0 = 1
            L2b:
                z7.b0 r3 = p368z7.ExecutorC6051b0.this     // Catch: java.lang.Throwable -> L7f
                java.util.Deque r3 = p368z7.ExecutorC6051b0.m24256a(r3)     // Catch: java.lang.Throwable -> L7f
                java.lang.Object r3 = r3.poll()     // Catch: java.lang.Throwable -> L7f
                java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L7f
                r8.f22511h = r3     // Catch: java.lang.Throwable -> L7f
                if (r3 != 0) goto L4d
                z7.b0 r0 = p368z7.ExecutorC6051b0.this     // Catch: java.lang.Throwable -> L7f
                z7.b0$c r3 = p368z7.ExecutorC6051b0.c.IDLE     // Catch: java.lang.Throwable -> L7f
                p368z7.ExecutorC6051b0.m24258c(r0, r3)     // Catch: java.lang.Throwable -> L7f
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L7f
                if (r1 == 0) goto L4c
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L4c:
                return
            L4d:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L7f
                boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L82
                r1 = r1 | r2
                r2 = 0
                java.lang.Runnable r3 = r8.f22511h     // Catch: java.lang.Throwable -> L5c java.lang.RuntimeException -> L5e
                r3.run()     // Catch: java.lang.Throwable -> L5c java.lang.RuntimeException -> L5e
            L59:
                r8.f22511h = r2     // Catch: java.lang.Throwable -> L82
                goto L2
            L5c:
                r0 = move-exception
                goto L7c
            L5e:
                r3 = move-exception
                java.util.logging.Logger r4 = p368z7.ExecutorC6051b0.m24260e()     // Catch: java.lang.Throwable -> L5c
                java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L5c
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5c
                r6.<init>()     // Catch: java.lang.Throwable -> L5c
                java.lang.String r7 = "Exception while executing runnable "
                r6.append(r7)     // Catch: java.lang.Throwable -> L5c
                java.lang.Runnable r7 = r8.f22511h     // Catch: java.lang.Throwable -> L5c
                r6.append(r7)     // Catch: java.lang.Throwable -> L5c
                java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L5c
                r4.log(r5, r6, r3)     // Catch: java.lang.Throwable -> L5c
                goto L59
            L7c:
                r8.f22511h = r2     // Catch: java.lang.Throwable -> L82
                throw r0     // Catch: java.lang.Throwable -> L82
            L7f:
                r0 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L7f
                throw r0     // Catch: java.lang.Throwable -> L82
            L82:
                r0 = move-exception
                if (r1 == 0) goto L8c
                java.lang.Thread r1 = java.lang.Thread.currentThread()
                r1.interrupt()
            L8c:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p368z7.ExecutorC6051b0.b.m24261a():void");
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                m24261a();
            } catch (Error e10) {
                synchronized (ExecutorC6051b0.this.f22505i) {
                    ExecutorC6051b0.this.f22506j = c.IDLE;
                    throw e10;
                }
            }
        }

        public String toString() {
            Runnable runnable = this.f22511h;
            if (runnable != null) {
                return "SequentialExecutorWorker{running=" + runnable + "}";
            }
            return "SequentialExecutorWorker{state=" + ExecutorC6051b0.this.f22506j + "}";
        }
    }

    /* renamed from: z7.b0$c */
    /* loaded from: classes.dex */
    public enum c {
        IDLE,
        QUEUING,
        QUEUED,
        RUNNING
    }

    public ExecutorC6051b0(Executor executor) {
        this.f22504h = (Executor) C2394s.m9619l(executor);
    }

    /* renamed from: d */
    public static /* synthetic */ long m24259d(ExecutorC6051b0 executorC6051b0) {
        long j10 = executorC6051b0.f22507k;
        executorC6051b0.f22507k = 1 + j10;
        return j10;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        c cVar;
        C2394s.m9619l(runnable);
        synchronized (this.f22505i) {
            c cVar2 = this.f22506j;
            if (cVar2 != c.RUNNING && cVar2 != (cVar = c.QUEUED)) {
                long j10 = this.f22507k;
                a aVar = new a(runnable);
                this.f22505i.add(aVar);
                c cVar3 = c.QUEUING;
                this.f22506j = cVar3;
                try {
                    this.f22504h.execute(this.f22508l);
                    if (this.f22506j != cVar3) {
                        return;
                    }
                    synchronized (this.f22505i) {
                        if (this.f22507k == j10 && this.f22506j == cVar3) {
                            this.f22506j = cVar;
                        }
                    }
                    return;
                } catch (Error | RuntimeException e10) {
                    synchronized (this.f22505i) {
                        c cVar4 = this.f22506j;
                        if ((cVar4 != c.IDLE && cVar4 != c.QUEUING) || !this.f22505i.removeLastOccurrence(aVar)) {
                            r0 = false;
                        }
                        if (!(e10 instanceof RejectedExecutionException) || r0) {
                            throw e10;
                        }
                    }
                    return;
                }
            }
            this.f22505i.add(runnable);
        }
    }

    public String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f22504h + "}";
    }
}
