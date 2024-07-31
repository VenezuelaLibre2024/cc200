package androidx.work.impl.workers;

import android.content.Context;
import android.text.TextUtils;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import java.util.Collections;
import java.util.List;
import p029c2.AbstractC0592j;
import p044d2.C1527i;
import p104h2.C2285d;
import p104h2.InterfaceC2284c;
import p165l2.C3420p;
import p170l7.InterfaceFutureC3445f;
import p190n2.C3703c;
import p203o2.InterfaceC3840a;

/* loaded from: classes.dex */
public class ConstraintTrackingWorker extends ListenableWorker implements InterfaceC2284c {

    /* renamed from: r */
    public static final String f2109r = AbstractC0592j.m2972f("ConstraintTrkngWrkr");

    /* renamed from: m */
    public WorkerParameters f2110m;

    /* renamed from: n */
    public final Object f2111n;

    /* renamed from: o */
    public volatile boolean f2112o;

    /* renamed from: p */
    public C3703c<ListenableWorker.AbstractC0413a> f2113p;

    /* renamed from: q */
    public ListenableWorker f2114q;

    /* renamed from: androidx.work.impl.workers.ConstraintTrackingWorker$a */
    /* loaded from: classes.dex */
    public class RunnableC0431a implements Runnable {
        public RunnableC0431a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ConstraintTrackingWorker.this.m2227u();
        }
    }

    /* renamed from: androidx.work.impl.workers.ConstraintTrackingWorker$b */
    /* loaded from: classes.dex */
    public class RunnableC0432b implements Runnable {

        /* renamed from: h */
        public final /* synthetic */ InterfaceFutureC3445f f2116h;

        public RunnableC0432b(InterfaceFutureC3445f interfaceFutureC3445f) {
            this.f2116h = interfaceFutureC3445f;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (ConstraintTrackingWorker.this.f2111n) {
                if (ConstraintTrackingWorker.this.f2112o) {
                    ConstraintTrackingWorker.this.m2226t();
                } else {
                    ConstraintTrackingWorker.this.f2113p.mo13973r(this.f2116h);
                }
            }
        }
    }

    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f2110m = workerParameters;
        this.f2111n = new Object();
        this.f2112o = false;
        this.f2113p = C3703c.m13982t();
    }

    @Override // p104h2.InterfaceC2284c
    /* renamed from: b */
    public void mo2182b(List<String> list) {
        AbstractC0592j.m2970c().mo2973a(f2109r, String.format("Constraints changed for %s", list), new Throwable[0]);
        synchronized (this.f2111n) {
            this.f2112o = true;
        }
    }

    @Override // p104h2.InterfaceC2284c
    /* renamed from: e */
    public void mo2184e(List<String> list) {
    }

    @Override // androidx.work.ListenableWorker
    /* renamed from: i */
    public boolean mo2067i() {
        ListenableWorker listenableWorker = this.f2114q;
        return listenableWorker != null && listenableWorker.mo2067i();
    }

    @Override // androidx.work.ListenableWorker
    /* renamed from: l */
    public void mo2070l() {
        super.mo2070l();
        ListenableWorker listenableWorker = this.f2114q;
        if (listenableWorker == null || listenableWorker.m2068j()) {
            return;
        }
        this.f2114q.m2074p();
    }

    @Override // androidx.work.ListenableWorker
    /* renamed from: o */
    public InterfaceFutureC3445f<ListenableWorker.AbstractC0413a> mo2073o() {
        m2062c().execute(new RunnableC0431a());
        return this.f2113p;
    }

    /* renamed from: q */
    public InterfaceC3840a m2223q() {
        return C1527i.m6192k(m2061a()).m6200p();
    }

    /* renamed from: r */
    public WorkDatabase m2224r() {
        return C1527i.m6192k(m2061a()).m6199o();
    }

    /* renamed from: s */
    public void m2225s() {
        this.f2113p.mo13971p(ListenableWorker.AbstractC0413a.m2075a());
    }

    /* renamed from: t */
    public void m2226t() {
        this.f2113p.mo13971p(ListenableWorker.AbstractC0413a.m2076b());
    }

    /* renamed from: u */
    public void m2227u() {
        String m2116l = m2065g().m2116l("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
        if (TextUtils.isEmpty(m2116l)) {
            AbstractC0592j.m2970c().mo2974b(f2109r, "No worker to delegate to.", new Throwable[0]);
        } else {
            ListenableWorker m3004b = m2066h().m3004b(m2061a(), m2116l, this.f2110m);
            this.f2114q = m3004b;
            if (m3004b != null) {
                C3420p mo12751n = m2224r().mo2131B().mo12751n(m2064f().toString());
                if (mo12751n == null) {
                    m2225s();
                    return;
                }
                C2285d c2285d = new C2285d(m2061a(), m2223q(), this);
                c2285d.m9292d(Collections.singletonList(mo12751n));
                if (!c2285d.m9291c(m2064f().toString())) {
                    AbstractC0592j.m2970c().mo2973a(f2109r, String.format("Constraints not met for delegate %s. Requesting retry.", m2116l), new Throwable[0]);
                    m2226t();
                    return;
                }
                AbstractC0592j.m2970c().mo2973a(f2109r, String.format("Constraints met for delegate %s", m2116l), new Throwable[0]);
                try {
                    InterfaceFutureC3445f<ListenableWorker.AbstractC0413a> mo2073o = this.f2114q.mo2073o();
                    mo2073o.mo12809b(new RunnableC0432b(mo2073o), m2062c());
                    return;
                } catch (Throwable th) {
                    AbstractC0592j m2970c = AbstractC0592j.m2970c();
                    String str = f2109r;
                    m2970c.mo2973a(str, String.format("Delegated worker %s threw exception in startWork.", m2116l), th);
                    synchronized (this.f2111n) {
                        if (this.f2112o) {
                            AbstractC0592j.m2970c().mo2973a(str, "Constraints were unmet, Retrying.", new Throwable[0]);
                            m2226t();
                        } else {
                            m2225s();
                        }
                        return;
                    }
                }
            }
            AbstractC0592j.m2970c().mo2973a(f2109r, "No worker to delegate to.", new Throwable[0]);
        }
        m2225s();
    }
}
