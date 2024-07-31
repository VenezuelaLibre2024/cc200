package p296ub;

import android.os.Handler;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p296ub.C5002c;
import p311vb.C5157a;
import p325wb.C5472e;

/* renamed from: ub.a */
/* loaded from: classes.dex */
public class C5000a {

    /* renamed from: b */
    public static final String f18680b = "a";

    /* renamed from: c */
    public static final C5472e f18681c = new C5472e(C5000a.class.getSimpleName());

    /* renamed from: d */
    public static volatile C5000a f18682d;

    /* renamed from: a */
    public ThreadPoolExecutor f18683a;

    /* renamed from: ub.a$a */
    /* loaded from: classes.dex */
    public class a implements Callable<Void> {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC5001b f18684a;

        /* renamed from: b */
        public final /* synthetic */ C5002c f18685b;

        /* renamed from: ub.a$a$a */
        /* loaded from: classes.dex */
        public class C6209a implements C5157a.c {
            public C6209a() {
            }

            @Override // p311vb.C5157a.c
            /* renamed from: a */
            public void mo19574a(double d10) {
                a.this.f18684a.mo3015b(d10);
            }
        }

        public a(InterfaceC5001b interfaceC5001b, C5002c c5002c) {
            this.f18684a = interfaceC5001b;
            this.f18685b = c5002c;
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x0039, code lost:
        
            p296ub.C5000a.f18681c.m21683c("Transcode canceled.", r3);
            r5.f18684a.mo3017d();
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
        
            return null;
         */
        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Void call() {
            /*
                r5 = this;
                r0 = 1
                vb.a r1 = new vb.a     // Catch: java.lang.Throwable -> L17 p325wb.C5475h -> L6a
                ub.a$a$a r2 = new ub.a$a$a     // Catch: java.lang.Throwable -> L17 p325wb.C5475h -> L6a
                r2.<init>()     // Catch: java.lang.Throwable -> L17 p325wb.C5475h -> L6a
                r1.<init>(r2)     // Catch: java.lang.Throwable -> L17 p325wb.C5475h -> L6a
                ub.c r2 = r5.f18685b     // Catch: java.lang.Throwable -> L17 p325wb.C5475h -> L6a
                r1.m20877o(r2)     // Catch: java.lang.Throwable -> L17 p325wb.C5475h -> L6a
                ub.b r1 = r5.f18684a     // Catch: java.lang.Throwable -> L17 p325wb.C5475h -> L6a
                r2 = 0
                r1.mo3014a(r2)     // Catch: java.lang.Throwable -> L17 p325wb.C5475h -> L6a
                goto L78
            L17:
                r1 = move-exception
                boolean r2 = r1 instanceof java.lang.InterruptedException
                r3 = r1
            L1b:
                if (r2 != 0) goto L37
                java.lang.Throwable r4 = r3.getCause()
                if (r4 == 0) goto L37
                java.lang.Throwable r4 = r3.getCause()
                boolean r4 = r4.equals(r3)
                if (r4 != 0) goto L37
                java.lang.Throwable r3 = r3.getCause()
                boolean r4 = r3 instanceof java.lang.InterruptedException
                if (r4 == 0) goto L1b
                r2 = r0
                goto L1b
            L37:
                if (r2 == 0) goto L48
                wb.e r0 = p296ub.C5000a.m19569b()
                java.lang.String r1 = "Transcode canceled."
                r0.m21683c(r1, r3)
                ub.b r0 = r5.f18684a
                r0.mo3017d()
                goto L78
            L48:
                boolean r0 = r1 instanceof java.lang.RuntimeException
                if (r0 == 0) goto L5b
                wb.e r0 = p296ub.C5000a.m19569b()
                java.lang.String r2 = "Fatal error while transcoding, this might be invalid format or bug in engine or Android."
                r0.m21681a(r2, r1)
                ub.b r0 = r5.f18684a
                r0.mo3016c(r1)
                throw r1
            L5b:
                wb.e r0 = p296ub.C5000a.m19569b()
                java.lang.String r2 = "Unexpected error while transcoding"
                r0.m21681a(r2, r1)
                ub.b r0 = r5.f18684a
                r0.mo3016c(r1)
                throw r1
            L6a:
                wb.e r1 = p296ub.C5000a.m19569b()
                java.lang.String r2 = "Validator has decided that the input is fine and transcoding is not necessary."
                r1.m21682b(r2)
                ub.b r1 = r5.f18684a
                r1.mo3014a(r0)
            L78:
                r0 = 0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p296ub.C5000a.a.call():java.lang.Void");
        }
    }

    /* renamed from: ub.a$b */
    /* loaded from: classes.dex */
    public class b implements ThreadFactory {

        /* renamed from: a */
        public AtomicInteger f18688a;

        public b() {
            this.f18688a = new AtomicInteger(1);
        }

        public /* synthetic */ b(C5000a c5000a, a aVar) {
            this();
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, C5000a.f18680b + " Thread #" + this.f18688a.getAndIncrement());
        }
    }

    /* renamed from: ub.a$c */
    /* loaded from: classes.dex */
    public static class c implements InterfaceC5001b {

        /* renamed from: a */
        public Handler f18690a;

        /* renamed from: b */
        public InterfaceC5001b f18691b;

        /* renamed from: ub.a$c$a */
        /* loaded from: classes.dex */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.f18691b.mo3017d();
            }
        }

        /* renamed from: ub.a$c$b */
        /* loaded from: classes.dex */
        public class b implements Runnable {

            /* renamed from: h */
            public final /* synthetic */ int f18693h;

            public b(int i10) {
                this.f18693h = i10;
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.f18691b.mo3014a(this.f18693h);
            }
        }

        /* renamed from: ub.a$c$c */
        /* loaded from: classes.dex */
        public class RunnableC6210c implements Runnable {

            /* renamed from: h */
            public final /* synthetic */ Throwable f18695h;

            public RunnableC6210c(Throwable th) {
                this.f18695h = th;
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.f18691b.mo3016c(this.f18695h);
            }
        }

        /* renamed from: ub.a$c$d */
        /* loaded from: classes.dex */
        public class d implements Runnable {

            /* renamed from: h */
            public final /* synthetic */ double f18697h;

            public d(double d10) {
                this.f18697h = d10;
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.f18691b.mo3015b(this.f18697h);
            }
        }

        public c(Handler handler, InterfaceC5001b interfaceC5001b) {
            this.f18690a = handler;
            this.f18691b = interfaceC5001b;
        }

        public /* synthetic */ c(Handler handler, InterfaceC5001b interfaceC5001b, a aVar) {
            this(handler, interfaceC5001b);
        }

        @Override // p296ub.InterfaceC5001b
        /* renamed from: a */
        public void mo3014a(int i10) {
            this.f18690a.post(new b(i10));
        }

        @Override // p296ub.InterfaceC5001b
        /* renamed from: b */
        public void mo3015b(double d10) {
            this.f18690a.post(new d(d10));
        }

        @Override // p296ub.InterfaceC5001b
        /* renamed from: c */
        public void mo3016c(Throwable th) {
            this.f18690a.post(new RunnableC6210c(th));
        }

        @Override // p296ub.InterfaceC5001b
        /* renamed from: d */
        public void mo3017d() {
            this.f18690a.post(new a());
        }
    }

    public C5000a() {
        int availableProcessors = Runtime.getRuntime().availableProcessors() + 1;
        this.f18683a = new ThreadPoolExecutor(availableProcessors, availableProcessors, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new b(this, null));
    }

    /* renamed from: c */
    public static C5000a m19570c() {
        if (f18682d == null) {
            synchronized (C5000a.class) {
                if (f18682d == null) {
                    f18682d = new C5000a();
                }
            }
        }
        return f18682d;
    }

    /* renamed from: d */
    public static C5002c.b m19571d(String str) {
        return new C5002c.b(str);
    }

    /* renamed from: e */
    public Future<Void> m19572e(C5002c c5002c) {
        return this.f18683a.submit(new a(new c(c5002c.f18710l, c5002c.f18709k, null), c5002c));
    }
}
