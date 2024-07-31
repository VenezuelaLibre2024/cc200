package p044d2;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.work.C0416a;
import androidx.work.C0417b;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import p029c2.AbstractC0590h;
import p029c2.AbstractC0592j;
import p029c2.C0601s;
import p150k2.InterfaceC3346a;
import p165l2.C3420p;
import p165l2.InterfaceC3406b;
import p165l2.InterfaceC3421q;
import p165l2.InterfaceC3424t;
import p170l7.InterfaceFutureC3445f;
import p178m2.C3503d;
import p178m2.C3511l;
import p178m2.C3512m;
import p178m2.RunnableC3510k;
import p190n2.C3703c;
import p203o2.InterfaceC3840a;

/* renamed from: d2.j */
/* loaded from: classes.dex */
public class RunnableC1528j implements Runnable {

    /* renamed from: A */
    public static final String f5587A = AbstractC0592j.m2972f("WorkerWrapper");

    /* renamed from: h */
    public Context f5588h;

    /* renamed from: i */
    public String f5589i;

    /* renamed from: j */
    public List<InterfaceC1523e> f5590j;

    /* renamed from: k */
    public WorkerParameters.C0415a f5591k;

    /* renamed from: l */
    public C3420p f5592l;

    /* renamed from: m */
    public ListenableWorker f5593m;

    /* renamed from: n */
    public InterfaceC3840a f5594n;

    /* renamed from: p */
    public C0416a f5596p;

    /* renamed from: q */
    public InterfaceC3346a f5597q;

    /* renamed from: r */
    public WorkDatabase f5598r;

    /* renamed from: s */
    public InterfaceC3421q f5599s;

    /* renamed from: t */
    public InterfaceC3406b f5600t;

    /* renamed from: u */
    public InterfaceC3424t f5601u;

    /* renamed from: v */
    public List<String> f5602v;

    /* renamed from: w */
    public String f5603w;

    /* renamed from: z */
    public volatile boolean f5606z;

    /* renamed from: o */
    public ListenableWorker.AbstractC0413a f5595o = ListenableWorker.AbstractC0413a.m2075a();

    /* renamed from: x */
    public C3703c<Boolean> f5604x = C3703c.m13982t();

    /* renamed from: y */
    public InterfaceFutureC3445f<ListenableWorker.AbstractC0413a> f5605y = null;

    /* renamed from: d2.j$a */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: h */
        public final /* synthetic */ InterfaceFutureC3445f f5607h;

        /* renamed from: i */
        public final /* synthetic */ C3703c f5608i;

        public a(InterfaceFutureC3445f interfaceFutureC3445f, C3703c c3703c) {
            this.f5607h = interfaceFutureC3445f;
            this.f5608i = c3703c;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f5607h.get();
                AbstractC0592j.m2970c().mo2973a(RunnableC1528j.f5587A, String.format("Starting work for %s", RunnableC1528j.this.f5592l.f12012c), new Throwable[0]);
                RunnableC1528j runnableC1528j = RunnableC1528j.this;
                runnableC1528j.f5605y = runnableC1528j.f5593m.mo2073o();
                this.f5608i.mo13973r(RunnableC1528j.this.f5605y);
            } catch (Throwable th) {
                this.f5608i.mo13972q(th);
            }
        }
    }

    /* renamed from: d2.j$b */
    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: h */
        public final /* synthetic */ C3703c f5610h;

        /* renamed from: i */
        public final /* synthetic */ String f5611i;

        public b(C3703c c3703c, String str) {
            this.f5610h = c3703c;
            this.f5611i = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        @SuppressLint({"SyntheticAccessor"})
        public void run() {
            try {
                try {
                    ListenableWorker.AbstractC0413a abstractC0413a = (ListenableWorker.AbstractC0413a) this.f5610h.get();
                    if (abstractC0413a == null) {
                        AbstractC0592j.m2970c().mo2974b(RunnableC1528j.f5587A, String.format("%s returned a null result. Treating it as a failure.", RunnableC1528j.this.f5592l.f12012c), new Throwable[0]);
                    } else {
                        AbstractC0592j.m2970c().mo2973a(RunnableC1528j.f5587A, String.format("%s returned a %s result.", RunnableC1528j.this.f5592l.f12012c, abstractC0413a), new Throwable[0]);
                        RunnableC1528j.this.f5595o = abstractC0413a;
                    }
                } catch (InterruptedException e10) {
                    e = e10;
                    AbstractC0592j.m2970c().mo2974b(RunnableC1528j.f5587A, String.format("%s failed because it threw an exception/error", this.f5611i), e);
                } catch (CancellationException e11) {
                    AbstractC0592j.m2970c().mo2975d(RunnableC1528j.f5587A, String.format("%s was cancelled", this.f5611i), e11);
                } catch (ExecutionException e12) {
                    e = e12;
                    AbstractC0592j.m2970c().mo2974b(RunnableC1528j.f5587A, String.format("%s failed because it threw an exception/error", this.f5611i), e);
                }
            } finally {
                RunnableC1528j.this.m6214f();
            }
        }
    }

    /* renamed from: d2.j$c */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a */
        public Context f5613a;

        /* renamed from: b */
        public ListenableWorker f5614b;

        /* renamed from: c */
        public InterfaceC3346a f5615c;

        /* renamed from: d */
        public InterfaceC3840a f5616d;

        /* renamed from: e */
        public C0416a f5617e;

        /* renamed from: f */
        public WorkDatabase f5618f;

        /* renamed from: g */
        public String f5619g;

        /* renamed from: h */
        public List<InterfaceC1523e> f5620h;

        /* renamed from: i */
        public WorkerParameters.C0415a f5621i = new WorkerParameters.C0415a();

        public c(Context context, C0416a c0416a, InterfaceC3840a interfaceC3840a, InterfaceC3346a interfaceC3346a, WorkDatabase workDatabase, String str) {
            this.f5613a = context.getApplicationContext();
            this.f5616d = interfaceC3840a;
            this.f5615c = interfaceC3346a;
            this.f5617e = c0416a;
            this.f5618f = workDatabase;
            this.f5619g = str;
        }

        /* renamed from: a */
        public RunnableC1528j m6224a() {
            return new RunnableC1528j(this);
        }

        /* renamed from: b */
        public c m6225b(WorkerParameters.C0415a c0415a) {
            if (c0415a != null) {
                this.f5621i = c0415a;
            }
            return this;
        }

        /* renamed from: c */
        public c m6226c(List<InterfaceC1523e> list) {
            this.f5620h = list;
            return this;
        }
    }

    public RunnableC1528j(c cVar) {
        this.f5588h = cVar.f5613a;
        this.f5594n = cVar.f5616d;
        this.f5597q = cVar.f5615c;
        this.f5589i = cVar.f5619g;
        this.f5590j = cVar.f5620h;
        this.f5591k = cVar.f5621i;
        this.f5593m = cVar.f5614b;
        this.f5596p = cVar.f5617e;
        WorkDatabase workDatabase = cVar.f5618f;
        this.f5598r = workDatabase;
        this.f5599s = workDatabase.mo2131B();
        this.f5600t = this.f5598r.mo2133t();
        this.f5601u = this.f5598r.mo2132C();
    }

    /* renamed from: a */
    public final String m6209a(List<String> list) {
        StringBuilder sb2 = new StringBuilder("Work [ id=");
        sb2.append(this.f5589i);
        sb2.append(", tags={ ");
        boolean z10 = true;
        for (String str : list) {
            if (z10) {
                z10 = false;
            } else {
                sb2.append(", ");
            }
            sb2.append(str);
        }
        sb2.append(" } ]");
        return sb2.toString();
    }

    /* renamed from: b */
    public InterfaceFutureC3445f<Boolean> m6210b() {
        return this.f5604x;
    }

    /* renamed from: c */
    public final void m6211c(ListenableWorker.AbstractC0413a abstractC0413a) {
        if (abstractC0413a instanceof ListenableWorker.AbstractC0413a.c) {
            AbstractC0592j.m2970c().mo2975d(f5587A, String.format("Worker result SUCCESS for %s", this.f5603w), new Throwable[0]);
            if (!this.f5592l.m12734d()) {
                m6221m();
                return;
            }
        } else if (abstractC0413a instanceof ListenableWorker.AbstractC0413a.b) {
            AbstractC0592j.m2970c().mo2975d(f5587A, String.format("Worker result RETRY for %s", this.f5603w), new Throwable[0]);
            m6215g();
            return;
        } else {
            AbstractC0592j.m2970c().mo2975d(f5587A, String.format("Worker result FAILURE for %s", this.f5603w), new Throwable[0]);
            if (!this.f5592l.m12734d()) {
                m6220l();
                return;
            }
        }
        m6216h();
    }

    /* renamed from: d */
    public void m6212d() {
        boolean z10;
        this.f5606z = true;
        m6222n();
        InterfaceFutureC3445f<ListenableWorker.AbstractC0413a> interfaceFutureC3445f = this.f5605y;
        if (interfaceFutureC3445f != null) {
            z10 = interfaceFutureC3445f.isDone();
            this.f5605y.cancel(true);
        } else {
            z10 = false;
        }
        ListenableWorker listenableWorker = this.f5593m;
        if (listenableWorker == null || z10) {
            AbstractC0592j.m2970c().mo2973a(f5587A, String.format("WorkSpec %s is already done. Not interrupting.", this.f5592l), new Throwable[0]);
        } else {
            listenableWorker.m2074p();
        }
    }

    /* renamed from: e */
    public final void m6213e(String str) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            if (this.f5599s.mo12750m(str2) != C0601s.a.CANCELLED) {
                this.f5599s.mo12746i(C0601s.a.FAILED, str2);
            }
            linkedList.addAll(this.f5600t.mo12711b(str2));
        }
    }

    /* renamed from: f */
    public void m6214f() {
        if (!m6222n()) {
            this.f5598r.m14550c();
            try {
                C0601s.a mo12750m = this.f5599s.mo12750m(this.f5589i);
                this.f5598r.mo2130A().mo12728a(this.f5589i);
                if (mo12750m == null) {
                    m6217i(false);
                } else if (mo12750m == C0601s.a.RUNNING) {
                    m6211c(this.f5595o);
                } else if (!mo12750m.m2986b()) {
                    m6215g();
                }
                this.f5598r.m14562r();
            } finally {
                this.f5598r.m14552g();
            }
        }
        List<InterfaceC1523e> list = this.f5590j;
        if (list != null) {
            Iterator<InterfaceC1523e> it = list.iterator();
            while (it.hasNext()) {
                it.next().mo6167d(this.f5589i);
            }
            C1524f.m6170b(this.f5596p, this.f5598r, this.f5590j);
        }
    }

    /* renamed from: g */
    public final void m6215g() {
        this.f5598r.m14550c();
        try {
            this.f5599s.mo12746i(C0601s.a.ENQUEUED, this.f5589i);
            this.f5599s.mo12756s(this.f5589i, System.currentTimeMillis());
            this.f5599s.mo12739b(this.f5589i, -1L);
            this.f5598r.m14562r();
        } finally {
            this.f5598r.m14552g();
            m6217i(true);
        }
    }

    /* renamed from: h */
    public final void m6216h() {
        this.f5598r.m14550c();
        try {
            this.f5599s.mo12756s(this.f5589i, System.currentTimeMillis());
            this.f5599s.mo12746i(C0601s.a.ENQUEUED, this.f5589i);
            this.f5599s.mo12752o(this.f5589i);
            this.f5599s.mo12739b(this.f5589i, -1L);
            this.f5598r.m14562r();
        } finally {
            this.f5598r.m14552g();
            m6217i(false);
        }
    }

    /* renamed from: i */
    public final void m6217i(boolean z10) {
        ListenableWorker listenableWorker;
        this.f5598r.m14550c();
        try {
            if (!this.f5598r.mo2131B().mo12748k()) {
                C3503d.m13047a(this.f5588h, RescheduleReceiver.class, false);
            }
            if (z10) {
                this.f5599s.mo12746i(C0601s.a.ENQUEUED, this.f5589i);
                this.f5599s.mo12739b(this.f5589i, -1L);
            }
            if (this.f5592l != null && (listenableWorker = this.f5593m) != null && listenableWorker.mo2067i()) {
                this.f5597q.mo6153a(this.f5589i);
            }
            this.f5598r.m14562r();
            this.f5598r.m14552g();
            this.f5604x.mo13971p(Boolean.valueOf(z10));
        } catch (Throwable th) {
            this.f5598r.m14552g();
            throw th;
        }
    }

    /* renamed from: j */
    public final void m6218j() {
        C0601s.a mo12750m = this.f5599s.mo12750m(this.f5589i);
        if (mo12750m == C0601s.a.RUNNING) {
            AbstractC0592j.m2970c().mo2973a(f5587A, String.format("Status for %s is RUNNING;not doing any work and rescheduling for later execution", this.f5589i), new Throwable[0]);
            m6217i(true);
        } else {
            AbstractC0592j.m2970c().mo2973a(f5587A, String.format("Status for %s is %s; not doing any work", this.f5589i, mo12750m), new Throwable[0]);
            m6217i(false);
        }
    }

    /* renamed from: k */
    public final void m6219k() {
        C0417b mo2056b;
        if (m6222n()) {
            return;
        }
        this.f5598r.m14550c();
        try {
            C3420p mo12751n = this.f5599s.mo12751n(this.f5589i);
            this.f5592l = mo12751n;
            if (mo12751n == null) {
                AbstractC0592j.m2970c().mo2974b(f5587A, String.format("Didn't find WorkSpec for id %s", this.f5589i), new Throwable[0]);
                m6217i(false);
                this.f5598r.m14562r();
                return;
            }
            if (mo12751n.f12011b != C0601s.a.ENQUEUED) {
                m6218j();
                this.f5598r.m14562r();
                AbstractC0592j.m2970c().mo2973a(f5587A, String.format("%s is not in ENQUEUED state. Nothing more to do.", this.f5592l.f12012c), new Throwable[0]);
                return;
            }
            if (mo12751n.m12734d() || this.f5592l.m12733c()) {
                long currentTimeMillis = System.currentTimeMillis();
                C3420p c3420p = this.f5592l;
                if (!(c3420p.f12023n == 0) && currentTimeMillis < c3420p.m12731a()) {
                    AbstractC0592j.m2970c().mo2973a(f5587A, String.format("Delaying execution for %s because it is being executed before schedule.", this.f5592l.f12012c), new Throwable[0]);
                    m6217i(true);
                    this.f5598r.m14562r();
                    return;
                }
            }
            this.f5598r.m14562r();
            this.f5598r.m14552g();
            if (this.f5592l.m12734d()) {
                mo2056b = this.f5592l.f12014e;
            } else {
                AbstractC0590h m2969b = this.f5596p.m2093f().m2969b(this.f5592l.f12013d);
                if (m2969b == null) {
                    AbstractC0592j.m2970c().mo2974b(f5587A, String.format("Could not create Input Merger %s", this.f5592l.f12013d), new Throwable[0]);
                    m6220l();
                    return;
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(this.f5592l.f12014e);
                    arrayList.addAll(this.f5599s.mo12754q(this.f5589i));
                    mo2056b = m2969b.mo2056b(arrayList);
                }
            }
            WorkerParameters workerParameters = new WorkerParameters(UUID.fromString(this.f5589i), mo2056b, this.f5602v, this.f5591k, this.f5592l.f12020k, this.f5596p.m2092e(), this.f5594n, this.f5596p.m2100m(), new C3512m(this.f5598r, this.f5594n), new C3511l(this.f5598r, this.f5597q, this.f5594n));
            if (this.f5593m == null) {
                this.f5593m = this.f5596p.m2100m().m3004b(this.f5588h, this.f5592l.f12012c, workerParameters);
            }
            ListenableWorker listenableWorker = this.f5593m;
            if (listenableWorker == null) {
                AbstractC0592j.m2970c().mo2974b(f5587A, String.format("Could not create Worker %s", this.f5592l.f12012c), new Throwable[0]);
                m6220l();
                return;
            }
            if (listenableWorker.m2069k()) {
                AbstractC0592j.m2970c().mo2974b(f5587A, String.format("Received an already-used Worker %s; WorkerFactory should return new instances", this.f5592l.f12012c), new Throwable[0]);
                m6220l();
                return;
            }
            this.f5593m.m2072n();
            if (!m6223o()) {
                m6218j();
                return;
            }
            if (m6222n()) {
                return;
            }
            C3703c m13982t = C3703c.m13982t();
            RunnableC3510k runnableC3510k = new RunnableC3510k(this.f5588h, this.f5592l, this.f5593m, workerParameters.m2084b(), this.f5594n);
            this.f5594n.mo14610a().execute(runnableC3510k);
            InterfaceFutureC3445f<Void> m13057a = runnableC3510k.m13057a();
            m13057a.mo12809b(new a(m13057a, m13982t), this.f5594n.mo14610a());
            m13982t.mo12809b(new b(m13982t, this.f5603w), this.f5594n.mo14612c());
        } finally {
            this.f5598r.m14552g();
        }
    }

    /* renamed from: l */
    public void m6220l() {
        this.f5598r.m14550c();
        try {
            m6213e(this.f5589i);
            this.f5599s.mo12744g(this.f5589i, ((ListenableWorker.AbstractC0413a.a) this.f5595o).m2079e());
            this.f5598r.m14562r();
        } finally {
            this.f5598r.m14552g();
            m6217i(false);
        }
    }

    /* renamed from: m */
    public final void m6221m() {
        this.f5598r.m14550c();
        try {
            this.f5599s.mo12746i(C0601s.a.SUCCEEDED, this.f5589i);
            this.f5599s.mo12744g(this.f5589i, ((ListenableWorker.AbstractC0413a.c) this.f5595o).m2080e());
            long currentTimeMillis = System.currentTimeMillis();
            for (String str : this.f5600t.mo12711b(this.f5589i)) {
                if (this.f5599s.mo12750m(str) == C0601s.a.BLOCKED && this.f5600t.mo12712c(str)) {
                    AbstractC0592j.m2970c().mo2975d(f5587A, String.format("Setting status to enqueued for %s", str), new Throwable[0]);
                    this.f5599s.mo12746i(C0601s.a.ENQUEUED, str);
                    this.f5599s.mo12756s(str, currentTimeMillis);
                }
            }
            this.f5598r.m14562r();
        } finally {
            this.f5598r.m14552g();
            m6217i(false);
        }
    }

    /* renamed from: n */
    public final boolean m6222n() {
        if (!this.f5606z) {
            return false;
        }
        AbstractC0592j.m2970c().mo2973a(f5587A, String.format("Work interrupted for %s", this.f5603w), new Throwable[0]);
        if (this.f5599s.mo12750m(this.f5589i) == null) {
            m6217i(false);
        } else {
            m6217i(!r0.m2986b());
        }
        return true;
    }

    /* renamed from: o */
    public final boolean m6223o() {
        this.f5598r.m14550c();
        try {
            boolean z10 = true;
            if (this.f5599s.mo12750m(this.f5589i) == C0601s.a.ENQUEUED) {
                this.f5599s.mo12746i(C0601s.a.RUNNING, this.f5589i);
                this.f5599s.mo12755r(this.f5589i);
            } else {
                z10 = false;
            }
            this.f5598r.m14562r();
            return z10;
        } finally {
            this.f5598r.m14552g();
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        List<String> mo12761b = this.f5601u.mo12761b(this.f5589i);
        this.f5602v = mo12761b;
        this.f5603w = m6209a(mo12761b);
        m6219k();
    }
}
