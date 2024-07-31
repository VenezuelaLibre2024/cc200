package p156k8;

import android.annotation.SuppressLint;
import android.database.SQLException;
import android.os.SystemClock;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Locale;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p023b8.C0515g;
import p045d3.AbstractC1532d;
import p045d3.EnumC1533e;
import p045d3.InterfaceC1536h;
import p045d3.InterfaceC1538j;
import p066e8.AbstractC1754u;
import p066e8.C1730g0;
import p066e8.C1750q0;
import p093g3.C1974l;
import p098g8.AbstractC2135f0;
import p171l8.C3453d;

/* renamed from: k8.e */
/* loaded from: classes.dex */
public final class C3376e {

    /* renamed from: a */
    public final double f11763a;

    /* renamed from: b */
    public final double f11764b;

    /* renamed from: c */
    public final long f11765c;

    /* renamed from: d */
    public final long f11766d;

    /* renamed from: e */
    public final int f11767e;

    /* renamed from: f */
    public final BlockingQueue<Runnable> f11768f;

    /* renamed from: g */
    public final ThreadPoolExecutor f11769g;

    /* renamed from: h */
    public final InterfaceC1536h<AbstractC2135f0> f11770h;

    /* renamed from: i */
    public final C1730g0 f11771i;

    /* renamed from: j */
    public int f11772j;

    /* renamed from: k */
    public long f11773k;

    /* renamed from: k8.e$b */
    /* loaded from: classes.dex */
    public final class b implements Runnable {

        /* renamed from: h */
        public final AbstractC1754u f11774h;

        /* renamed from: i */
        public final TaskCompletionSource<AbstractC1754u> f11775i;

        public b(AbstractC1754u abstractC1754u, TaskCompletionSource<AbstractC1754u> taskCompletionSource) {
            this.f11774h = abstractC1754u;
            this.f11775i = taskCompletionSource;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3376e.this.m12562p(this.f11774h, this.f11775i);
            C3376e.this.f11771i.m6806e();
            double m12555g = C3376e.this.m12555g();
            C0515g.m2482f().m2484b("Delay for: " + String.format(Locale.US, "%.2f", Double.valueOf(m12555g / 1000.0d)) + " s for report: " + this.f11774h.mo6768d());
            C3376e.m12554q(m12555g);
        }
    }

    @SuppressLint({"ThreadPoolCreation"})
    public C3376e(double d10, double d11, long j10, InterfaceC1536h<AbstractC2135f0> interfaceC1536h, C1730g0 c1730g0) {
        this.f11763a = d10;
        this.f11764b = d11;
        this.f11765c = j10;
        this.f11770h = interfaceC1536h;
        this.f11771i = c1730g0;
        this.f11766d = SystemClock.elapsedRealtime();
        int i10 = (int) d10;
        this.f11767e = i10;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i10);
        this.f11768f = arrayBlockingQueue;
        this.f11769g = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.f11772j = 0;
        this.f11773k = 0L;
    }

    public C3376e(InterfaceC1536h<AbstractC2135f0> interfaceC1536h, C3453d c3453d, C1730g0 c1730g0) {
        this(c3453d.f12127f, c3453d.f12128g, c3453d.f12129h * 1000, interfaceC1536h, c1730g0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public /* synthetic */ void m12552m(CountDownLatch countDownLatch) {
        try {
            C1974l.m7994a(this.f11770h, EnumC1533e.HIGHEST);
        } catch (SQLException unused) {
        }
        countDownLatch.countDown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public /* synthetic */ void m12553n(TaskCompletionSource taskCompletionSource, boolean z10, AbstractC1754u abstractC1754u, Exception exc) {
        if (exc != null) {
            taskCompletionSource.trySetException(exc);
            return;
        }
        if (z10) {
            m12558j();
        }
        taskCompletionSource.trySetResult(abstractC1754u);
    }

    /* renamed from: q */
    public static void m12554q(double d10) {
        try {
            Thread.sleep((long) d10);
        } catch (InterruptedException unused) {
        }
    }

    /* renamed from: g */
    public final double m12555g() {
        return Math.min(3600000.0d, (60000.0d / this.f11763a) * Math.pow(this.f11764b, m12556h()));
    }

    /* renamed from: h */
    public final int m12556h() {
        if (this.f11773k == 0) {
            this.f11773k = m12561o();
        }
        int m12561o = (int) ((m12561o() - this.f11773k) / this.f11765c);
        int min = m12560l() ? Math.min(100, this.f11772j + m12561o) : Math.max(0, this.f11772j - m12561o);
        if (this.f11772j != min) {
            this.f11772j = min;
            this.f11773k = m12561o();
        }
        return min;
    }

    /* renamed from: i */
    public TaskCompletionSource<AbstractC1754u> m12557i(AbstractC1754u abstractC1754u, boolean z10) {
        synchronized (this.f11768f) {
            TaskCompletionSource<AbstractC1754u> taskCompletionSource = new TaskCompletionSource<>();
            if (!z10) {
                m12562p(abstractC1754u, taskCompletionSource);
                return taskCompletionSource;
            }
            this.f11771i.m6805d();
            if (!m12559k()) {
                m12556h();
                C0515g.m2482f().m2484b("Dropping report due to queue being full: " + abstractC1754u.mo6768d());
                this.f11771i.m6804c();
                taskCompletionSource.trySetResult(abstractC1754u);
                return taskCompletionSource;
            }
            C0515g.m2482f().m2484b("Enqueueing report: " + abstractC1754u.mo6768d());
            C0515g.m2482f().m2484b("Queue size: " + this.f11768f.size());
            this.f11769g.execute(new b(abstractC1754u, taskCompletionSource));
            C0515g.m2482f().m2484b("Closing task for report: " + abstractC1754u.mo6768d());
            taskCompletionSource.trySetResult(abstractC1754u);
            return taskCompletionSource;
        }
    }

    @SuppressLint({"DiscouragedApi", "ThreadPoolCreation"})
    /* renamed from: j */
    public void m12558j() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        new Thread(new Runnable() { // from class: k8.d
            @Override // java.lang.Runnable
            public final void run() {
                C3376e.this.m12552m(countDownLatch);
            }
        }).start();
        C1750q0.m6964g(countDownLatch, 2L, TimeUnit.SECONDS);
    }

    /* renamed from: k */
    public final boolean m12559k() {
        return this.f11768f.size() < this.f11767e;
    }

    /* renamed from: l */
    public final boolean m12560l() {
        return this.f11768f.size() == this.f11767e;
    }

    /* renamed from: o */
    public final long m12561o() {
        return System.currentTimeMillis();
    }

    /* renamed from: p */
    public final void m12562p(final AbstractC1754u abstractC1754u, final TaskCompletionSource<AbstractC1754u> taskCompletionSource) {
        C0515g.m2482f().m2484b("Sending report through Google DataTransport: " + abstractC1754u.mo6768d());
        final boolean z10 = SystemClock.elapsedRealtime() - this.f11766d < 2000;
        this.f11770h.mo6239b(AbstractC1532d.m6236g(abstractC1754u.mo6766b()), new InterfaceC1538j() { // from class: k8.c
            @Override // p045d3.InterfaceC1538j
            /* renamed from: a */
            public final void mo6241a(Exception exc) {
                C3376e.this.m12553n(taskCompletionSource, z10, abstractC1754u, exc);
            }
        });
    }
}
