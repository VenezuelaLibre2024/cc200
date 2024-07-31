package p038ce;

import gd.C2245s;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p038ce.InterfaceC1125z0;
import p116he.C2538l0;
import p116he.C2550r0;
import p116he.C2561y;
import p116he.InterfaceC2552s0;
import p146jd.InterfaceC3284g;
import p343xd.C5767k;
import td.C4753m;

/* renamed from: ce.n1 */
/* loaded from: classes2.dex */
public abstract class AbstractC1078n1 extends AbstractC1082o1 implements InterfaceC1125z0 {

    /* renamed from: m */
    public static final AtomicReferenceFieldUpdater f4058m = AtomicReferenceFieldUpdater.newUpdater(AbstractC1078n1.class, Object.class, "_queue");

    /* renamed from: n */
    public static final AtomicReferenceFieldUpdater f4059n = AtomicReferenceFieldUpdater.newUpdater(AbstractC1078n1.class, Object.class, "_delayed");

    /* renamed from: o */
    public static final AtomicIntegerFieldUpdater f4060o = AtomicIntegerFieldUpdater.newUpdater(AbstractC1078n1.class, "_isCompleted");
    private volatile Object _delayed;
    private volatile int _isCompleted = 0;
    private volatile Object _queue;

    /* renamed from: ce.n1$a */
    /* loaded from: classes2.dex */
    public static final class a extends b {

        /* renamed from: j */
        public final Runnable f4061j;

        public a(long j10, Runnable runnable) {
            super(j10);
            this.f4061j = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f4061j.run();
        }

        @Override // p038ce.AbstractC1078n1.b
        public String toString() {
            return super.toString() + this.f4061j;
        }
    }

    /* renamed from: ce.n1$b */
    /* loaded from: classes2.dex */
    public static abstract class b implements Runnable, Comparable<b>, InterfaceC1055i1, InterfaceC2552s0 {
        private volatile Object _heap;

        /* renamed from: h */
        public long f4062h;

        /* renamed from: i */
        public int f4063i = -1;

        public b(long j10) {
            this.f4062h = j10;
        }

        @Override // p116he.InterfaceC2552s0
        /* renamed from: b */
        public C2550r0<?> mo4514b() {
            Object obj = this._heap;
            if (obj instanceof C2550r0) {
                return (C2550r0) obj;
            }
            return null;
        }

        @Override // p038ce.InterfaceC1055i1
        public final void dispose() {
            C2538l0 c2538l0;
            C2538l0 c2538l02;
            synchronized (this) {
                Object obj = this._heap;
                c2538l0 = C1090q1.f4074a;
                if (obj == c2538l0) {
                    return;
                }
                c cVar = obj instanceof c ? (c) obj : null;
                if (cVar != null) {
                    cVar.m10164g(this);
                }
                c2538l02 = C1090q1.f4074a;
                this._heap = c2538l02;
                C2245s c2245s = C2245s.f8873a;
            }
        }

        @Override // p116he.InterfaceC2552s0
        /* renamed from: f */
        public void mo4515f(C2550r0<?> c2550r0) {
            C2538l0 c2538l0;
            Object obj = this._heap;
            c2538l0 = C1090q1.f4074a;
            if (!(obj != c2538l0)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            this._heap = c2550r0;
        }

        @Override // p116he.InterfaceC2552s0
        /* renamed from: h */
        public void mo4516h(int i10) {
            this.f4063i = i10;
        }

        @Override // p116he.InterfaceC2552s0
        /* renamed from: i */
        public int mo4517i() {
            return this.f4063i;
        }

        @Override // java.lang.Comparable
        /* renamed from: l */
        public int compareTo(b bVar) {
            long j10 = this.f4062h - bVar.f4062h;
            if (j10 > 0) {
                return 1;
            }
            return j10 < 0 ? -1 : 0;
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0040 A[Catch: all -> 0x0048, TryCatch #0 {, blocks: (B:11:0x000d, B:19:0x0021, B:20:0x0037, B:22:0x0040, B:23:0x0042, B:27:0x0024, B:30:0x002e), top: B:10:0x000d, outer: #1 }] */
        /* renamed from: m */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final int m4519m(long r8, p038ce.AbstractC1078n1.c r10, p038ce.AbstractC1078n1 r11) {
            /*
                r7 = this;
                monitor-enter(r7)
                java.lang.Object r0 = r7._heap     // Catch: java.lang.Throwable -> L4b
                he.l0 r1 = p038ce.C1090q1.m4563b()     // Catch: java.lang.Throwable -> L4b
                if (r0 != r1) goto Lc
                r8 = 2
            La:
                monitor-exit(r7)
                return r8
            Lc:
                monitor-enter(r10)     // Catch: java.lang.Throwable -> L4b
                he.s0 r0 = r10.m10159b()     // Catch: java.lang.Throwable -> L48
                ce.n1$b r0 = (p038ce.AbstractC1078n1.b) r0     // Catch: java.lang.Throwable -> L48
                boolean r11 = p038ce.AbstractC1078n1.m4499Z0(r11)     // Catch: java.lang.Throwable -> L48
                if (r11 == 0) goto L1d
                r8 = 1
                monitor-exit(r10)     // Catch: java.lang.Throwable -> L4b
                monitor-exit(r7)
                return r8
            L1d:
                r1 = 0
                if (r0 != 0) goto L24
            L21:
                r10.f4064c = r8     // Catch: java.lang.Throwable -> L48
                goto L37
            L24:
                long r3 = r0.f4062h     // Catch: java.lang.Throwable -> L48
                long r5 = r3 - r8
                int r11 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
                if (r11 < 0) goto L2d
                goto L2e
            L2d:
                r8 = r3
            L2e:
                long r3 = r10.f4064c     // Catch: java.lang.Throwable -> L48
                long r3 = r8 - r3
                int r11 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                if (r11 <= 0) goto L37
                goto L21
            L37:
                long r8 = r7.f4062h     // Catch: java.lang.Throwable -> L48
                long r3 = r10.f4064c     // Catch: java.lang.Throwable -> L48
                long r8 = r8 - r3
                int r8 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
                if (r8 >= 0) goto L42
                r7.f4062h = r3     // Catch: java.lang.Throwable -> L48
            L42:
                r10.m10158a(r7)     // Catch: java.lang.Throwable -> L48
                monitor-exit(r10)     // Catch: java.lang.Throwable -> L4b
                r8 = 0
                goto La
            L48:
                r8 = move-exception
                monitor-exit(r10)     // Catch: java.lang.Throwable -> L4b
                throw r8     // Catch: java.lang.Throwable -> L4b
            L4b:
                r8 = move-exception
                monitor-exit(r7)
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: p038ce.AbstractC1078n1.b.m4519m(long, ce.n1$c, ce.n1):int");
        }

        /* renamed from: n */
        public final boolean m4520n(long j10) {
            return j10 - this.f4062h >= 0;
        }

        public String toString() {
            return "Delayed[nanos=" + this.f4062h + ']';
        }
    }

    /* renamed from: ce.n1$c */
    /* loaded from: classes2.dex */
    public static final class c extends C2550r0<b> {

        /* renamed from: c */
        public long f4064c;

        public c(long j10) {
            this.f4064c = j10;
        }
    }

    /* renamed from: e1 */
    public final boolean m4500e1() {
        return f4060o.get(this) != 0;
    }

    @Override // p038ce.InterfaceC1125z0
    /* renamed from: G0 */
    public InterfaceC1055i1 mo4501G0(long j10, Runnable runnable, InterfaceC3284g interfaceC3284g) {
        return InterfaceC1125z0.a.m4607a(this, j10, runnable, interfaceC3284g);
    }

    @Override // p038ce.AbstractC1064k0
    /* renamed from: H0 */
    public final void mo4339H0(InterfaceC3284g interfaceC3284g, Runnable runnable) {
        mo4504c1(runnable);
    }

    @Override // p038ce.AbstractC1074m1
    /* renamed from: O0 */
    public long mo4479O0() {
        b m10162e;
        C2538l0 c2538l0;
        if (super.mo4479O0() == 0) {
            return 0L;
        }
        Object obj = f4058m.get(this);
        if (obj != null) {
            if (!(obj instanceof C2561y)) {
                c2538l0 = C1090q1.f4075b;
                return obj == c2538l0 ? Long.MAX_VALUE : 0L;
            }
            if (!((C2561y) obj).m10205g()) {
                return 0L;
            }
        }
        c cVar = (c) f4059n.get(this);
        if (cVar == null || (m10162e = cVar.m10162e()) == null) {
            return Long.MAX_VALUE;
        }
        long j10 = m10162e.f4062h;
        C1023c.m4266a();
        return C5767k.m22905b(j10 - System.nanoTime(), 0L);
    }

    @Override // p038ce.AbstractC1074m1
    /* renamed from: T0 */
    public long mo4483T0() {
        b bVar;
        if (m4484U0()) {
            return 0L;
        }
        c cVar = (c) f4059n.get(this);
        if (cVar != null && !cVar.m10161d()) {
            C1023c.m4266a();
            long nanoTime = System.nanoTime();
            do {
                synchronized (cVar) {
                    b m10159b = cVar.m10159b();
                    bVar = null;
                    if (m10159b != null) {
                        b bVar2 = m10159b;
                        if (bVar2.m4520n(nanoTime) ? m4505d1(bVar2) : false) {
                            bVar = cVar.m10165h(0);
                        }
                    }
                }
            } while (bVar != null);
        }
        Runnable m4503b1 = m4503b1();
        if (m4503b1 == null) {
            return mo4479O0();
        }
        m4503b1.run();
        return 0L;
    }

    /* renamed from: a1 */
    public final void m4502a1() {
        C2538l0 c2538l0;
        C2538l0 c2538l02;
        if (C1101t0.m4573a() && !m4500e1()) {
            throw new AssertionError();
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4058m;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f4058m;
                c2538l0 = C1090q1.f4075b;
                if (C1080o.m4523a(atomicReferenceFieldUpdater2, this, null, c2538l0)) {
                    return;
                }
            } else {
                if (obj instanceof C2561y) {
                    ((C2561y) obj).m10202d();
                    return;
                }
                c2538l02 = C1090q1.f4075b;
                if (obj == c2538l02) {
                    return;
                }
                C2561y c2561y = new C2561y(8, true);
                C4753m.m18651d(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                c2561y.m10199a((Runnable) obj);
                if (C1080o.m4523a(f4058m, this, obj, c2561y)) {
                    return;
                }
            }
        }
    }

    /* renamed from: b1 */
    public final Runnable m4503b1() {
        C2538l0 c2538l0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4058m;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                return null;
            }
            if (obj instanceof C2561y) {
                C4753m.m18651d(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }>{ kotlinx.coroutines.EventLoop_commonKt.Queue<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }> }");
                C2561y c2561y = (C2561y) obj;
                Object m10208j = c2561y.m10208j();
                if (m10208j != C2561y.f10029h) {
                    return (Runnable) m10208j;
                }
                C1080o.m4523a(f4058m, this, obj, c2561y.m10207i());
            } else {
                c2538l0 = C1090q1.f4075b;
                if (obj == c2538l0) {
                    return null;
                }
                if (C1080o.m4523a(f4058m, this, obj, null)) {
                    C4753m.m18651d(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                    return (Runnable) obj;
                }
            }
        }
    }

    /* renamed from: c1 */
    public void mo4504c1(Runnable runnable) {
        if (m4505d1(runnable)) {
            m4526Y0();
        } else {
            RunnableC1109v0.f4094p.mo4504c1(runnable);
        }
    }

    /* renamed from: d1 */
    public final boolean m4505d1(Runnable runnable) {
        C2538l0 c2538l0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4058m;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (m4500e1()) {
                return false;
            }
            if (obj == null) {
                if (C1080o.m4523a(f4058m, this, null, runnable)) {
                    return true;
                }
            } else if (obj instanceof C2561y) {
                C4753m.m18651d(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }>{ kotlinx.coroutines.EventLoop_commonKt.Queue<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }> }");
                C2561y c2561y = (C2561y) obj;
                int m10199a = c2561y.m10199a(runnable);
                if (m10199a == 0) {
                    return true;
                }
                if (m10199a == 1) {
                    C1080o.m4523a(f4058m, this, obj, c2561y.m10207i());
                } else if (m10199a == 2) {
                    return false;
                }
            } else {
                c2538l0 = C1090q1.f4075b;
                if (obj == c2538l0) {
                    return false;
                }
                C2561y c2561y2 = new C2561y(8, true);
                C4753m.m18651d(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                c2561y2.m10199a((Runnable) obj);
                c2561y2.m10199a(runnable);
                if (C1080o.m4523a(f4058m, this, obj, c2561y2)) {
                    return true;
                }
            }
        }
    }

    /* renamed from: f1 */
    public boolean m4506f1() {
        C2538l0 c2538l0;
        if (!m4482S0()) {
            return false;
        }
        c cVar = (c) f4059n.get(this);
        if (cVar != null && !cVar.m10161d()) {
            return false;
        }
        Object obj = f4058m.get(this);
        if (obj != null) {
            if (obj instanceof C2561y) {
                return ((C2561y) obj).m10205g();
            }
            c2538l0 = C1090q1.f4075b;
            if (obj != c2538l0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g1 */
    public final void m4507g1() {
        b m10166i;
        C1023c.m4266a();
        long nanoTime = System.nanoTime();
        while (true) {
            c cVar = (c) f4059n.get(this);
            if (cVar == null || (m10166i = cVar.m10166i()) == null) {
                return;
            } else {
                mo4525X0(nanoTime, m10166i);
            }
        }
    }

    /* renamed from: h1 */
    public final void m4508h1() {
        f4058m.set(this, null);
        f4059n.set(this, null);
    }

    /* renamed from: i1 */
    public final void m4509i1(long j10, b bVar) {
        int m4510j1 = m4510j1(j10, bVar);
        if (m4510j1 == 0) {
            if (m4513m1(bVar)) {
                m4526Y0();
            }
        } else if (m4510j1 == 1) {
            mo4525X0(j10, bVar);
        } else if (m4510j1 != 2) {
            throw new IllegalStateException("unexpected result".toString());
        }
    }

    /* renamed from: j1 */
    public final int m4510j1(long j10, b bVar) {
        if (m4500e1()) {
            return 1;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4059n;
        c cVar = (c) atomicReferenceFieldUpdater.get(this);
        if (cVar == null) {
            C1080o.m4523a(atomicReferenceFieldUpdater, this, null, new c(j10));
            Object obj = atomicReferenceFieldUpdater.get(this);
            C4753m.m18650c(obj);
            cVar = (c) obj;
        }
        return bVar.m4519m(j10, cVar, this);
    }

    /* renamed from: k1 */
    public final InterfaceC1055i1 m4511k1(long j10, Runnable runnable) {
        long m4564c = C1090q1.m4564c(j10);
        if (m4564c >= 4611686018427387903L) {
            return C1087p2.f4072h;
        }
        C1023c.m4266a();
        long nanoTime = System.nanoTime();
        a aVar = new a(m4564c + nanoTime, runnable);
        m4509i1(nanoTime, aVar);
        return aVar;
    }

    /* renamed from: l1 */
    public final void m4512l1(boolean z10) {
        f4060o.set(this, z10 ? 1 : 0);
    }

    /* renamed from: m1 */
    public final boolean m4513m1(b bVar) {
        c cVar = (c) f4059n.get(this);
        return (cVar != null ? cVar.m10162e() : null) == bVar;
    }

    @Override // p038ce.AbstractC1074m1
    public void shutdown() {
        C1123y2.f4101a.m4602c();
        m4512l1(true);
        m4502a1();
        do {
        } while (mo4483T0() <= 0);
        m4507g1();
    }
}
