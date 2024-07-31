package p299ue;

import java.io.IOException;
import java.lang.ref.Reference;
import java.net.Proxy;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p079f6.C1841a;
import p299ue.C5023k;
import re.C4346a;
import re.C4357f0;
import se.C4596e;
import ye.C5926f;

/* renamed from: ue.g */
/* loaded from: classes2.dex */
public final class C5019g {

    /* renamed from: g */
    public static final Executor f18791g = new ThreadPoolExecutor(0, C1841a.e.API_PRIORITY_OTHER, 60, TimeUnit.SECONDS, new SynchronousQueue(), C4596e.m18088H("OkHttp ConnectionPool", true));

    /* renamed from: a */
    public final int f18792a;

    /* renamed from: b */
    public final long f18793b;

    /* renamed from: c */
    public final Runnable f18794c = new Runnable() { // from class: ue.f
        @Override // java.lang.Runnable
        public final void run() {
            C5019g.this.m19700e();
        }
    };

    /* renamed from: d */
    public final Deque<C5017e> f18795d = new ArrayDeque();

    /* renamed from: e */
    public final C5020h f18796e = new C5020h();

    /* renamed from: f */
    public boolean f18797f;

    public C5019g(int i10, long j10, TimeUnit timeUnit) {
        this.f18792a = i10;
        this.f18793b = timeUnit.toNanos(j10);
        if (j10 > 0) {
            return;
        }
        throw new IllegalArgumentException("keepAliveDuration <= 0: " + j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m19700e() {
        while (true) {
            long m19701b = m19701b(System.nanoTime());
            if (m19701b == -1) {
                return;
            }
            if (m19701b > 0) {
                long j10 = m19701b / 1000000;
                long j11 = m19701b - (1000000 * j10);
                synchronized (this) {
                    try {
                        wait(j10, (int) j11);
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public long m19701b(long j10) {
        synchronized (this) {
            C5017e c5017e = null;
            long j11 = Long.MIN_VALUE;
            int i10 = 0;
            int i11 = 0;
            for (C5017e c5017e2 : this.f18795d) {
                if (m19704f(c5017e2, j10) > 0) {
                    i11++;
                } else {
                    i10++;
                    long j12 = j10 - c5017e2.f18789q;
                    if (j12 > j11) {
                        c5017e = c5017e2;
                        j11 = j12;
                    }
                }
            }
            long j13 = this.f18793b;
            if (j11 < j13 && i10 <= this.f18792a) {
                if (i10 > 0) {
                    return j13 - j11;
                }
                if (i11 > 0) {
                    return j13;
                }
                this.f18797f = false;
                return -1L;
            }
            this.f18795d.remove(c5017e);
            C4596e.m18099g(c5017e.m19695s());
            return 0L;
        }
    }

    /* renamed from: c */
    public void m19702c(C4357f0 c4357f0, IOException iOException) {
        if (c4357f0.m16738b().type() != Proxy.Type.DIRECT) {
            C4346a m16737a = c4357f0.m16737a();
            m16737a.m16641i().connectFailed(m16737a.m16644l().m16854C(), c4357f0.m16738b().address(), iOException);
        }
        this.f18796e.m19708b(c4357f0);
    }

    /* renamed from: d */
    public boolean m19703d(C5017e c5017e) {
        if (c5017e.f18783k || this.f18792a == 0) {
            this.f18795d.remove(c5017e);
            return true;
        }
        notifyAll();
        return false;
    }

    /* renamed from: f */
    public final int m19704f(C5017e c5017e, long j10) {
        List<Reference<C5023k>> list = c5017e.f18788p;
        int i10 = 0;
        while (i10 < list.size()) {
            Reference<C5023k> reference = list.get(i10);
            if (reference.get() != null) {
                i10++;
            } else {
                C5926f.m23671l().mo23654t("A connection to " + c5017e.m19693q().m16737a().m16644l() + " was leaked. Did you forget to close a response body?", ((C5023k.b) reference).f18827a);
                list.remove(i10);
                c5017e.f18783k = true;
                if (list.isEmpty()) {
                    c5017e.f18789q = j10 - this.f18793b;
                    return 0;
                }
            }
        }
        return list.size();
    }

    /* renamed from: g */
    public void m19705g(C5017e c5017e) {
        if (!this.f18797f) {
            this.f18797f = true;
            f18791g.execute(this.f18794c);
        }
        this.f18795d.add(c5017e);
    }

    /* renamed from: h */
    public boolean m19706h(C4346a c4346a, C5023k c5023k, List<C4357f0> list, boolean z10) {
        for (C5017e c5017e : this.f18795d) {
            if (!z10 || c5017e.m19690n()) {
                if (c5017e.m19688l(c4346a, list)) {
                    c5023k.m19723a(c5017e);
                    return true;
                }
            }
        }
        return false;
    }
}
