package je;

import gd.C2245s;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import p038ce.C1023c;
import p038ce.C1101t0;
import p038ce.C1105u0;
import p079f6.C1841a;
import p116he.C2528g0;
import p116he.C2538l0;
import p312vd.AbstractC5165c;
import p343xd.C5767k;
import td.C4747g;
import td.C4753m;
import td.C4763w;

/* renamed from: je.a */
/* loaded from: classes2.dex */
public final class ExecutorC3286a implements Executor, Closeable {

    /* renamed from: o */
    public static final a f11453o = new a(null);

    /* renamed from: p */
    public static final AtomicLongFieldUpdater f11454p = AtomicLongFieldUpdater.newUpdater(ExecutorC3286a.class, "parkedWorkersStack");

    /* renamed from: q */
    public static final AtomicLongFieldUpdater f11455q = AtomicLongFieldUpdater.newUpdater(ExecutorC3286a.class, "controlState");

    /* renamed from: r */
    public static final AtomicIntegerFieldUpdater f11456r = AtomicIntegerFieldUpdater.newUpdater(ExecutorC3286a.class, "_isTerminated");

    /* renamed from: s */
    public static final C2538l0 f11457s = new C2538l0("NOT_IN_STACK");
    private volatile int _isTerminated;
    private volatile long controlState;

    /* renamed from: h */
    public final int f11458h;

    /* renamed from: i */
    public final int f11459i;

    /* renamed from: j */
    public final long f11460j;

    /* renamed from: k */
    public final String f11461k;

    /* renamed from: l */
    public final C3289d f11462l;

    /* renamed from: m */
    public final C3289d f11463m;

    /* renamed from: n */
    public final C2528g0<c> f11464n;
    private volatile long parkedWorkersStack;

    /* renamed from: je.a$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(C4747g c4747g) {
            this();
        }
    }

    /* renamed from: je.a$b */
    /* loaded from: classes2.dex */
    public /* synthetic */ class b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f11465a;

        static {
            int[] iArr = new int[d.values().length];
            try {
                iArr[d.PARKING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d.BLOCKING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[d.CPU_ACQUIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[d.DORMANT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[d.TERMINATED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f11465a = iArr;
        }
    }

    /* renamed from: je.a$c */
    /* loaded from: classes2.dex */
    public final class c extends Thread {

        /* renamed from: p */
        public static final AtomicIntegerFieldUpdater f11466p = AtomicIntegerFieldUpdater.newUpdater(c.class, "workerCtl");

        /* renamed from: h */
        public final C3299n f11467h;

        /* renamed from: i */
        public final C4763w<AbstractRunnableC3293h> f11468i;
        private volatile int indexInArray;

        /* renamed from: j */
        public d f11469j;

        /* renamed from: k */
        public long f11470k;

        /* renamed from: l */
        public long f11471l;

        /* renamed from: m */
        public int f11472m;

        /* renamed from: n */
        public boolean f11473n;
        private volatile Object nextParkedWorker;
        private volatile int workerCtl;

        public c() {
            setDaemon(true);
            this.f11467h = new C3299n();
            this.f11468i = new C4763w<>();
            this.f11469j = d.DORMANT;
            this.nextParkedWorker = ExecutorC3286a.f11457s;
            this.f11472m = AbstractC5165c.f19499h.mo20918b();
        }

        public c(ExecutorC3286a executorC3286a, int i10) {
            this();
            m11931q(i10);
        }

        /* renamed from: j */
        public static final AtomicIntegerFieldUpdater m11916j() {
            return f11466p;
        }

        /* renamed from: b */
        public final void m11917b(int i10) {
            if (i10 == 0) {
                return;
            }
            ExecutorC3286a.f11455q.addAndGet(ExecutorC3286a.this, -2097152L);
            d dVar = this.f11469j;
            if (dVar != d.TERMINATED) {
                if (C1101t0.m4573a()) {
                    if (!(dVar == d.BLOCKING)) {
                        throw new AssertionError();
                    }
                }
                this.f11469j = d.DORMANT;
            }
        }

        /* renamed from: c */
        public final void m11918c(int i10) {
            if (i10 != 0 && m11935u(d.BLOCKING)) {
                ExecutorC3286a.this.m11907e0();
            }
        }

        /* renamed from: d */
        public final void m11919d(AbstractRunnableC3293h abstractRunnableC3293h) {
            int mo11943b = abstractRunnableC3293h.f11491i.mo11943b();
            m11925k(mo11943b);
            m11918c(mo11943b);
            ExecutorC3286a.this.m11903W(abstractRunnableC3293h);
            m11917b(mo11943b);
        }

        /* renamed from: e */
        public final AbstractRunnableC3293h m11920e(boolean z10) {
            AbstractRunnableC3293h m11929o;
            AbstractRunnableC3293h m11929o2;
            if (z10) {
                boolean z11 = m11927m(ExecutorC3286a.this.f11458h * 2) == 0;
                if (z11 && (m11929o2 = m11929o()) != null) {
                    return m11929o2;
                }
                AbstractRunnableC3293h m11950g = this.f11467h.m11950g();
                if (m11950g != null) {
                    return m11950g;
                }
                if (!z11 && (m11929o = m11929o()) != null) {
                    return m11929o;
                }
            } else {
                AbstractRunnableC3293h m11929o3 = m11929o();
                if (m11929o3 != null) {
                    return m11929o3;
                }
            }
            return m11936v(3);
        }

        /* renamed from: f */
        public final AbstractRunnableC3293h m11921f() {
            AbstractRunnableC3293h m11951h = this.f11467h.m11951h();
            if (m11951h != null) {
                return m11951h;
            }
            AbstractRunnableC3293h m10198d = ExecutorC3286a.this.f11463m.m10198d();
            return m10198d == null ? m11936v(1) : m10198d;
        }

        /* renamed from: g */
        public final AbstractRunnableC3293h m11922g(boolean z10) {
            return m11933s() ? m11920e(z10) : m11921f();
        }

        /* renamed from: h */
        public final int m11923h() {
            return this.indexInArray;
        }

        /* renamed from: i */
        public final Object m11924i() {
            return this.nextParkedWorker;
        }

        /* renamed from: k */
        public final void m11925k(int i10) {
            this.f11470k = 0L;
            if (this.f11469j == d.PARKING) {
                if (C1101t0.m4573a()) {
                    if (!(i10 == 1)) {
                        throw new AssertionError();
                    }
                }
                this.f11469j = d.BLOCKING;
            }
        }

        /* renamed from: l */
        public final boolean m11926l() {
            return this.nextParkedWorker != ExecutorC3286a.f11457s;
        }

        /* renamed from: m */
        public final int m11927m(int i10) {
            int i11 = this.f11472m;
            int i12 = i11 ^ (i11 << 13);
            int i13 = i12 ^ (i12 >> 17);
            int i14 = i13 ^ (i13 << 5);
            this.f11472m = i14;
            int i15 = i10 - 1;
            return (i15 & i10) == 0 ? i14 & i15 : (i14 & C1841a.e.API_PRIORITY_OTHER) % i10;
        }

        /* renamed from: n */
        public final void m11928n() {
            if (this.f11470k == 0) {
                this.f11470k = System.nanoTime() + ExecutorC3286a.this.f11460j;
            }
            LockSupport.parkNanos(ExecutorC3286a.this.f11460j);
            if (System.nanoTime() - this.f11470k >= 0) {
                this.f11470k = 0L;
                m11937w();
            }
        }

        /* renamed from: o */
        public final AbstractRunnableC3293h m11929o() {
            C3289d c3289d;
            if (m11927m(2) == 0) {
                AbstractRunnableC3293h m10198d = ExecutorC3286a.this.f11462l.m10198d();
                if (m10198d != null) {
                    return m10198d;
                }
                c3289d = ExecutorC3286a.this.f11463m;
            } else {
                AbstractRunnableC3293h m10198d2 = ExecutorC3286a.this.f11463m.m10198d();
                if (m10198d2 != null) {
                    return m10198d2;
                }
                c3289d = ExecutorC3286a.this.f11462l;
            }
            return c3289d.m10198d();
        }

        /* renamed from: p */
        public final void m11930p() {
            loop0: while (true) {
                boolean z10 = false;
                while (!ExecutorC3286a.this.isTerminated() && this.f11469j != d.TERMINATED) {
                    AbstractRunnableC3293h m11922g = m11922g(this.f11473n);
                    if (m11922g != null) {
                        this.f11471l = 0L;
                        m11919d(m11922g);
                    } else {
                        this.f11473n = false;
                        if (this.f11471l == 0) {
                            m11934t();
                        } else if (z10) {
                            m11935u(d.PARKING);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f11471l);
                            this.f11471l = 0L;
                        } else {
                            z10 = true;
                        }
                    }
                }
            }
            m11935u(d.TERMINATED);
        }

        /* renamed from: q */
        public final void m11931q(int i10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(ExecutorC3286a.this.f11461k);
            sb2.append("-worker-");
            sb2.append(i10 == 0 ? "TERMINATED" : String.valueOf(i10));
            setName(sb2.toString());
            this.indexInArray = i10;
        }

        /* renamed from: r */
        public final void m11932r(Object obj) {
            this.nextParkedWorker = obj;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            m11930p();
        }

        /* renamed from: s */
        public final boolean m11933s() {
            boolean z10;
            if (this.f11469j != d.CPU_ACQUIRED) {
                ExecutorC3286a executorC3286a = ExecutorC3286a.this;
                AtomicLongFieldUpdater atomicLongFieldUpdater = ExecutorC3286a.f11455q;
                while (true) {
                    long j10 = atomicLongFieldUpdater.get(executorC3286a);
                    if (((int) ((9223367638808264704L & j10) >> 42)) == 0) {
                        z10 = false;
                        break;
                    }
                    if (ExecutorC3286a.f11455q.compareAndSet(executorC3286a, j10, j10 - 4398046511104L)) {
                        z10 = true;
                        break;
                    }
                }
                if (!z10) {
                    return false;
                }
                this.f11469j = d.CPU_ACQUIRED;
            }
            return true;
        }

        /* renamed from: t */
        public final void m11934t() {
            if (!m11926l()) {
                ExecutorC3286a.this.m11901K(this);
                return;
            }
            f11466p.set(this, -1);
            while (m11926l() && f11466p.get(this) == -1 && !ExecutorC3286a.this.isTerminated() && this.f11469j != d.TERMINATED) {
                m11935u(d.PARKING);
                Thread.interrupted();
                m11928n();
            }
        }

        /* renamed from: u */
        public final boolean m11935u(d dVar) {
            d dVar2 = this.f11469j;
            boolean z10 = dVar2 == d.CPU_ACQUIRED;
            if (z10) {
                ExecutorC3286a.f11455q.addAndGet(ExecutorC3286a.this, 4398046511104L);
            }
            if (dVar2 != dVar) {
                this.f11469j = dVar;
            }
            return z10;
        }

        /* renamed from: v */
        public final AbstractRunnableC3293h m11936v(int i10) {
            int i11 = (int) (ExecutorC3286a.f11455q.get(ExecutorC3286a.this) & 2097151);
            if (i11 < 2) {
                return null;
            }
            int m11927m = m11927m(i11);
            ExecutorC3286a executorC3286a = ExecutorC3286a.this;
            long j10 = Long.MAX_VALUE;
            for (int i12 = 0; i12 < i11; i12++) {
                m11927m++;
                if (m11927m > i11) {
                    m11927m = 1;
                }
                c m10079b = executorC3286a.f11464n.m10079b(m11927m);
                if (m10079b != null && m10079b != this) {
                    long m11957n = m10079b.f11467h.m11957n(i10, this.f11468i);
                    if (m11957n == -1) {
                        C4763w<AbstractRunnableC3293h> c4763w = this.f11468i;
                        AbstractRunnableC3293h abstractRunnableC3293h = c4763w.f17731h;
                        c4763w.f17731h = null;
                        return abstractRunnableC3293h;
                    }
                    if (m11957n > 0) {
                        j10 = Math.min(j10, m11957n);
                    }
                }
            }
            if (j10 == Long.MAX_VALUE) {
                j10 = 0;
            }
            this.f11471l = j10;
            return null;
        }

        /* renamed from: w */
        public final void m11937w() {
            ExecutorC3286a executorC3286a = ExecutorC3286a.this;
            synchronized (executorC3286a.f11464n) {
                if (executorC3286a.isTerminated()) {
                    return;
                }
                if (((int) (ExecutorC3286a.f11455q.get(executorC3286a) & 2097151)) <= executorC3286a.f11458h) {
                    return;
                }
                if (f11466p.compareAndSet(this, -1, 1)) {
                    int i10 = this.indexInArray;
                    m11931q(0);
                    executorC3286a.m11902P(this, i10, 0);
                    int andDecrement = (int) (ExecutorC3286a.f11455q.getAndDecrement(executorC3286a) & 2097151);
                    if (andDecrement != i10) {
                        c m10079b = executorC3286a.f11464n.m10079b(andDecrement);
                        C4753m.m18650c(m10079b);
                        c cVar = m10079b;
                        executorC3286a.f11464n.m10080c(i10, cVar);
                        cVar.m11931q(i10);
                        executorC3286a.m11902P(cVar, andDecrement, i10);
                    }
                    executorC3286a.f11464n.m10080c(andDecrement, null);
                    C2245s c2245s = C2245s.f8873a;
                    this.f11469j = d.TERMINATED;
                }
            }
        }
    }

    /* renamed from: je.a$d */
    /* loaded from: classes2.dex */
    public enum d {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED
    }

    public ExecutorC3286a(int i10, int i11, long j10, String str) {
        this.f11458h = i10;
        this.f11459i = i11;
        this.f11460j = j10;
        this.f11461k = str;
        if (!(i10 >= 1)) {
            throw new IllegalArgumentException(("Core pool size " + i10 + " should be at least 1").toString());
        }
        if (!(i11 >= i10)) {
            throw new IllegalArgumentException(("Max pool size " + i11 + " should be greater than or equals to core pool size " + i10).toString());
        }
        if (!(i11 <= 2097150)) {
            throw new IllegalArgumentException(("Max pool size " + i11 + " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (!(j10 > 0)) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j10 + " must be positive").toString());
        }
        this.f11462l = new C3289d();
        this.f11463m = new C3289d();
        this.f11464n = new C2528g0<>((i10 + 1) * 2);
        this.controlState = i10 << 42;
        this._isTerminated = 0;
    }

    /* renamed from: h0 */
    public static /* synthetic */ boolean m11897h0(ExecutorC3286a executorC3286a, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = f11455q.get(executorC3286a);
        }
        return executorC3286a.m11909g0(j10);
    }

    /* renamed from: x */
    public static /* synthetic */ void m11898x(ExecutorC3286a executorC3286a, Runnable runnable, InterfaceC3294i interfaceC3294i, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            interfaceC3294i = C3297l.f11500g;
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        executorC3286a.m11914w(runnable, interfaceC3294i, z10);
    }

    /* renamed from: E */
    public final int m11899E(c cVar) {
        int m11923h;
        do {
            Object m11924i = cVar.m11924i();
            if (m11924i == f11457s) {
                return -1;
            }
            if (m11924i == null) {
                return 0;
            }
            cVar = (c) m11924i;
            m11923h = cVar.m11923h();
        } while (m11923h == 0);
        return m11923h;
    }

    /* renamed from: I */
    public final c m11900I() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f11454p;
        while (true) {
            long j10 = atomicLongFieldUpdater.get(this);
            c m10079b = this.f11464n.m10079b((int) (2097151 & j10));
            if (m10079b == null) {
                return null;
            }
            long j11 = (2097152 + j10) & (-2097152);
            int m11899E = m11899E(m10079b);
            if (m11899E >= 0 && f11454p.compareAndSet(this, j10, m11899E | j11)) {
                m10079b.m11932r(f11457s);
                return m10079b;
            }
        }
    }

    /* renamed from: K */
    public final boolean m11901K(c cVar) {
        long j10;
        long j11;
        int m11923h;
        if (cVar.m11924i() != f11457s) {
            return false;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f11454p;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            int i10 = (int) (2097151 & j10);
            j11 = (2097152 + j10) & (-2097152);
            m11923h = cVar.m11923h();
            if (C1101t0.m4573a()) {
                if (!(m11923h != 0)) {
                    throw new AssertionError();
                }
            }
            cVar.m11932r(this.f11464n.m10079b(i10));
        } while (!f11454p.compareAndSet(this, j10, m11923h | j11));
        return true;
    }

    /* renamed from: P */
    public final void m11902P(c cVar, int i10, int i11) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f11454p;
        while (true) {
            long j10 = atomicLongFieldUpdater.get(this);
            int i12 = (int) (2097151 & j10);
            long j11 = (2097152 + j10) & (-2097152);
            if (i12 == i10) {
                i12 = i11 == 0 ? m11899E(cVar) : i11;
            }
            if (i12 >= 0 && f11454p.compareAndSet(this, j10, j11 | i12)) {
                return;
            }
        }
    }

    /* renamed from: W */
    public final void m11903W(AbstractRunnableC3293h abstractRunnableC3293h) {
        try {
            abstractRunnableC3293h.run();
        } finally {
            try {
            } finally {
            }
        }
    }

    /* renamed from: b0 */
    public final void m11904b0(long j10) {
        int i10;
        AbstractRunnableC3293h m10198d;
        if (f11456r.compareAndSet(this, 0, 1)) {
            c m11913n = m11913n();
            synchronized (this.f11464n) {
                i10 = (int) (f11455q.get(this) & 2097151);
            }
            if (1 <= i10) {
                int i11 = 1;
                while (true) {
                    c m10079b = this.f11464n.m10079b(i11);
                    C4753m.m18650c(m10079b);
                    c cVar = m10079b;
                    if (cVar != m11913n) {
                        while (cVar.isAlive()) {
                            LockSupport.unpark(cVar);
                            cVar.join(j10);
                        }
                        d dVar = cVar.f11469j;
                        if (C1101t0.m4573a()) {
                            if (!(dVar == d.TERMINATED)) {
                                throw new AssertionError();
                            }
                        }
                        cVar.f11467h.m11949f(this.f11463m);
                    }
                    if (i11 == i10) {
                        break;
                    } else {
                        i11++;
                    }
                }
            }
            this.f11463m.m10196b();
            this.f11462l.m10196b();
            while (true) {
                if (m11913n != null) {
                    m10198d = m11913n.m11922g(true);
                    if (m10198d != null) {
                        continue;
                        m11903W(m10198d);
                    }
                }
                m10198d = this.f11462l.m10198d();
                if (m10198d == null && (m10198d = this.f11463m.m10198d()) == null) {
                    break;
                }
                m11903W(m10198d);
            }
            if (m11913n != null) {
                m11913n.m11935u(d.TERMINATED);
            }
            if (C1101t0.m4573a()) {
                if (!(((int) ((f11455q.get(this) & 9223367638808264704L) >> 42)) == this.f11458h)) {
                    throw new AssertionError();
                }
            }
            f11454p.set(this, 0L);
            f11455q.set(this, 0L);
        }
    }

    /* renamed from: c0 */
    public final void m11905c0(long j10, boolean z10) {
        if (z10 || m11912l0() || m11909g0(j10)) {
            return;
        }
        m11912l0();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        m11904b0(10000L);
    }

    /* renamed from: d */
    public final boolean m11906d(AbstractRunnableC3293h abstractRunnableC3293h) {
        return (abstractRunnableC3293h.f11491i.mo11943b() == 1 ? this.f11463m : this.f11462l).m10195a(abstractRunnableC3293h);
    }

    /* renamed from: e0 */
    public final void m11907e0() {
        if (m11912l0() || m11897h0(this, 0L, 1, null)) {
            return;
        }
        m11912l0();
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        m11898x(this, runnable, null, false, 6, null);
    }

    /* renamed from: f0 */
    public final AbstractRunnableC3293h m11908f0(c cVar, AbstractRunnableC3293h abstractRunnableC3293h, boolean z10) {
        if (cVar == null || cVar.f11469j == d.TERMINATED) {
            return abstractRunnableC3293h;
        }
        if (abstractRunnableC3293h.f11491i.mo11943b() == 0 && cVar.f11469j == d.BLOCKING) {
            return abstractRunnableC3293h;
        }
        cVar.f11473n = true;
        return cVar.f11467h.m11944a(abstractRunnableC3293h, z10);
    }

    /* renamed from: g0 */
    public final boolean m11909g0(long j10) {
        if (C5767k.m22904a(((int) (2097151 & j10)) - ((int) ((j10 & 4398044413952L) >> 21)), 0) < this.f11458h) {
            int m11910j = m11910j();
            if (m11910j == 1 && this.f11458h > 1) {
                m11910j();
            }
            if (m11910j > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean isTerminated() {
        return f11456r.get(this) != 0;
    }

    /* renamed from: j */
    public final int m11910j() {
        synchronized (this.f11464n) {
            if (isTerminated()) {
                return -1;
            }
            AtomicLongFieldUpdater atomicLongFieldUpdater = f11455q;
            long j10 = atomicLongFieldUpdater.get(this);
            int i10 = (int) (j10 & 2097151);
            int m22904a = C5767k.m22904a(i10 - ((int) ((j10 & 4398044413952L) >> 21)), 0);
            if (m22904a >= this.f11458h) {
                return 0;
            }
            if (i10 >= this.f11459i) {
                return 0;
            }
            int i11 = ((int) (f11455q.get(this) & 2097151)) + 1;
            if (!(i11 > 0 && this.f11464n.m10079b(i11) == null)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            c cVar = new c(this, i11);
            this.f11464n.m10080c(i11, cVar);
            if (!(i11 == ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this))))) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            int i12 = m22904a + 1;
            cVar.start();
            return i12;
        }
    }

    /* renamed from: l */
    public final AbstractRunnableC3293h m11911l(Runnable runnable, InterfaceC3294i interfaceC3294i) {
        long mo11939a = C3297l.f11499f.mo11939a();
        if (!(runnable instanceof AbstractRunnableC3293h)) {
            return new C3296k(runnable, mo11939a, interfaceC3294i);
        }
        AbstractRunnableC3293h abstractRunnableC3293h = (AbstractRunnableC3293h) runnable;
        abstractRunnableC3293h.f11490h = mo11939a;
        abstractRunnableC3293h.f11491i = interfaceC3294i;
        return abstractRunnableC3293h;
    }

    /* renamed from: l0 */
    public final boolean m11912l0() {
        c m11900I;
        do {
            m11900I = m11900I();
            if (m11900I == null) {
                return false;
            }
        } while (!c.m11916j().compareAndSet(m11900I, -1, 0));
        LockSupport.unpark(m11900I);
        return true;
    }

    /* renamed from: n */
    public final c m11913n() {
        Thread currentThread = Thread.currentThread();
        c cVar = currentThread instanceof c ? (c) currentThread : null;
        if (cVar == null || !C4753m.m18648a(ExecutorC3286a.this, this)) {
            return null;
        }
        return cVar;
    }

    public String toString() {
        StringBuilder sb2;
        char c10;
        ArrayList arrayList = new ArrayList();
        int m10078a = this.f11464n.m10078a();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 1; i15 < m10078a; i15++) {
            c m10079b = this.f11464n.m10079b(i15);
            if (m10079b != null) {
                int m11948e = m10079b.f11467h.m11948e();
                int i16 = b.f11465a[m10079b.f11469j.ordinal()];
                if (i16 != 1) {
                    if (i16 == 2) {
                        i11++;
                        sb2 = new StringBuilder();
                        sb2.append(m11948e);
                        c10 = 'b';
                    } else if (i16 == 3) {
                        i10++;
                        sb2 = new StringBuilder();
                        sb2.append(m11948e);
                        c10 = 'c';
                    } else if (i16 == 4) {
                        i13++;
                        if (m11948e > 0) {
                            sb2 = new StringBuilder();
                            sb2.append(m11948e);
                            c10 = 'd';
                        }
                    } else if (i16 == 5) {
                        i14++;
                    }
                    sb2.append(c10);
                    arrayList.add(sb2.toString());
                } else {
                    i12++;
                }
            }
        }
        long j10 = f11455q.get(this);
        return this.f11461k + '@' + C1105u0.m4581b(this) + "[Pool Size {core = " + this.f11458h + ", max = " + this.f11459i + "}, Worker States {CPU = " + i10 + ", blocking = " + i11 + ", parked = " + i12 + ", dormant = " + i13 + ", terminated = " + i14 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.f11462l.m10197c() + ", global blocking queue size = " + this.f11463m.m10197c() + ", Control State {created workers= " + ((int) (2097151 & j10)) + ", blocking tasks = " + ((int) ((4398044413952L & j10) >> 21)) + ", CPUs acquired = " + (this.f11458h - ((int) ((9223367638808264704L & j10) >> 42))) + "}]";
    }

    /* renamed from: w */
    public final void m11914w(Runnable runnable, InterfaceC3294i interfaceC3294i, boolean z10) {
        C1023c.m4266a();
        AbstractRunnableC3293h m11911l = m11911l(runnable, interfaceC3294i);
        boolean z11 = false;
        boolean z12 = m11911l.f11491i.mo11943b() == 1;
        long addAndGet = z12 ? f11455q.addAndGet(this, 2097152L) : 0L;
        c m11913n = m11913n();
        AbstractRunnableC3293h m11908f0 = m11908f0(m11913n, m11911l, z10);
        if (m11908f0 != null && !m11906d(m11908f0)) {
            throw new RejectedExecutionException(this.f11461k + " was terminated");
        }
        if (z10 && m11913n != null) {
            z11 = true;
        }
        if (z12) {
            m11905c0(addAndGet, z11);
        } else {
            if (z11) {
                return;
            }
            m11907e0();
        }
    }
}
