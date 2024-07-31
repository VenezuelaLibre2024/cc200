package p178m2;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.work.ListenableWorker;
import p029c2.AbstractC0592j;
import p029c2.C0587e;
import p029c2.InterfaceC0588f;
import p090g0.C1941a;
import p165l2.C3420p;
import p170l7.InterfaceFutureC3445f;
import p190n2.C3703c;
import p203o2.InterfaceC3840a;

/* renamed from: m2.k */
/* loaded from: classes.dex */
public class RunnableC3510k implements Runnable {

    /* renamed from: n */
    public static final String f12295n = AbstractC0592j.m2972f("WorkForegroundRunnable");

    /* renamed from: h */
    public final C3703c<Void> f12296h = C3703c.m13982t();

    /* renamed from: i */
    public final Context f12297i;

    /* renamed from: j */
    public final C3420p f12298j;

    /* renamed from: k */
    public final ListenableWorker f12299k;

    /* renamed from: l */
    public final InterfaceC0588f f12300l;

    /* renamed from: m */
    public final InterfaceC3840a f12301m;

    /* renamed from: m2.k$a */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: h */
        public final /* synthetic */ C3703c f12302h;

        public a(C3703c c3703c) {
            this.f12302h = c3703c;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f12302h.mo13973r(RunnableC3510k.this.f12299k.m2063d());
        }
    }

    /* renamed from: m2.k$b */
    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: h */
        public final /* synthetic */ C3703c f12304h;

        public b(C3703c c3703c) {
            this.f12304h = c3703c;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            try {
                C0587e c0587e = (C0587e) this.f12304h.get();
                if (c0587e == null) {
                    throw new IllegalStateException(String.format("Worker was marked important (%s) but did not provide ForegroundInfo", RunnableC3510k.this.f12298j.f12012c));
                }
                AbstractC0592j.m2970c().mo2973a(RunnableC3510k.f12295n, String.format("Updating notification for %s", RunnableC3510k.this.f12298j.f12012c), new Throwable[0]);
                RunnableC3510k.this.f12299k.m2071m(true);
                RunnableC3510k runnableC3510k = RunnableC3510k.this;
                runnableC3510k.f12296h.mo13973r(runnableC3510k.f12300l.mo2964a(runnableC3510k.f12297i, runnableC3510k.f12299k.m2064f(), c0587e));
            } catch (Throwable th) {
                RunnableC3510k.this.f12296h.mo13972q(th);
            }
        }
    }

    @SuppressLint({"LambdaLast"})
    public RunnableC3510k(Context context, C3420p c3420p, ListenableWorker listenableWorker, InterfaceC0588f interfaceC0588f, InterfaceC3840a interfaceC3840a) {
        this.f12297i = context;
        this.f12298j = c3420p;
        this.f12299k = listenableWorker;
        this.f12300l = interfaceC0588f;
        this.f12301m = interfaceC3840a;
    }

    /* renamed from: a */
    public InterfaceFutureC3445f<Void> m13057a() {
        return this.f12296h;
    }

    @Override // java.lang.Runnable
    @SuppressLint({"UnsafeExperimentalUsageError"})
    public void run() {
        if (!this.f12298j.f12026q || C1941a.m7847c()) {
            this.f12296h.mo13971p(null);
            return;
        }
        C3703c m13982t = C3703c.m13982t();
        this.f12301m.mo14610a().execute(new a(m13982t));
        m13982t.mo12809b(new b(m13982t), this.f12301m.mo14610a());
    }
}
