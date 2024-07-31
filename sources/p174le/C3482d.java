package p174le;

import gd.C2245s;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import ke.InterfaceC3387b;
import p038ce.InterfaceC1062j3;
import p038ce.InterfaceC1076n;
import sd.InterfaceC4580l;
import sd.InterfaceC4584p;
import td.AbstractC4754n;
import td.C4751k;
import td.C4753m;

/* renamed from: le.d */
/* loaded from: classes2.dex */
public class C3482d {

    /* renamed from: c */
    public static final AtomicReferenceFieldUpdater f12200c = AtomicReferenceFieldUpdater.newUpdater(C3482d.class, Object.class, "head");

    /* renamed from: d */
    public static final AtomicLongFieldUpdater f12201d = AtomicLongFieldUpdater.newUpdater(C3482d.class, "deqIdx");

    /* renamed from: e */
    public static final AtomicReferenceFieldUpdater f12202e = AtomicReferenceFieldUpdater.newUpdater(C3482d.class, Object.class, "tail");

    /* renamed from: f */
    public static final AtomicLongFieldUpdater f12203f = AtomicLongFieldUpdater.newUpdater(C3482d.class, "enqIdx");

    /* renamed from: g */
    public static final AtomicIntegerFieldUpdater f12204g = AtomicIntegerFieldUpdater.newUpdater(C3482d.class, "_availablePermits");
    private volatile int _availablePermits;

    /* renamed from: a */
    public final int f12205a;

    /* renamed from: b */
    public final InterfaceC4580l<Throwable, C2245s> f12206b;
    private volatile long deqIdx;
    private volatile long enqIdx;
    private volatile Object head;
    private volatile Object tail;

    /* renamed from: le.d$a */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a extends C4751k implements InterfaceC4584p<Long, C3484f, C3484f> {

        /* renamed from: h */
        public static final a f12207h = new a();

        public a() {
            super(2, C3483e.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
        }

        /* renamed from: c */
        public final C3484f m12958c(long j10, C3484f c3484f) {
            C3484f m12968h;
            m12968h = C3483e.m12968h(j10, c3484f);
            return m12968h;
        }

        @Override // sd.InterfaceC4584p
        public /* bridge */ /* synthetic */ C3484f invoke(Long l10, C3484f c3484f) {
            return m12958c(l10.longValue(), c3484f);
        }
    }

    /* renamed from: le.d$b */
    /* loaded from: classes2.dex */
    public static final class b extends AbstractC4754n implements InterfaceC4580l<Throwable, C2245s> {
        public b() {
            super(1);
        }

        /* renamed from: a */
        public final void m12959a(Throwable th) {
            C3482d.this.m12954i();
        }

        @Override // sd.InterfaceC4580l
        public /* bridge */ /* synthetic */ C2245s invoke(Throwable th) {
            m12959a(th);
            return C2245s.f8873a;
        }
    }

    /* renamed from: le.d$c */
    /* loaded from: classes2.dex */
    public /* synthetic */ class c extends C4751k implements InterfaceC4584p<Long, C3484f, C3484f> {

        /* renamed from: h */
        public static final c f12209h = new c();

        public c() {
            super(2, C3483e.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
        }

        /* renamed from: c */
        public final C3484f m12960c(long j10, C3484f c3484f) {
            C3484f m12968h;
            m12968h = C3483e.m12968h(j10, c3484f);
            return m12968h;
        }

        @Override // sd.InterfaceC4584p
        public /* bridge */ /* synthetic */ C3484f invoke(Long l10, C3484f c3484f) {
            return m12960c(l10.longValue(), c3484f);
        }
    }

    public C3482d(int i10, int i11) {
        this.f12205a = i10;
        if (!(i10 > 0)) {
            throw new IllegalArgumentException(("Semaphore should have at least 1 permit, but had " + i10).toString());
        }
        if (!(i11 >= 0 && i11 <= i10)) {
            throw new IllegalArgumentException(("The number of acquired permits should be in 0.." + i10).toString());
        }
        C3484f c3484f = new C3484f(0L, null, 2);
        this.head = c3484f;
        this.tail = c3484f;
        this._availablePermits = i10 - i11;
        this.f12206b = new b();
    }

    /* renamed from: d */
    public final void m12949d(InterfaceC1076n<? super C2245s> interfaceC1076n) {
        while (m12952g() <= 0) {
            C4753m.m18651d(interfaceC1076n, "null cannot be cast to non-null type kotlinx.coroutines.Waiter");
            if (m12950e((InterfaceC1062j3) interfaceC1076n)) {
                return;
            }
        }
        interfaceC1076n.mo4489g(C2245s.f8873a, this.f12206b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0037, code lost:
    
        r10 = true;
     */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m12950e(p038ce.InterfaceC1062j3 r17) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p174le.C3482d.m12950e(ce.j3):boolean");
    }

    /* renamed from: f */
    public final void m12951f() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i10;
        int i11;
        do {
            atomicIntegerFieldUpdater = f12204g;
            i10 = atomicIntegerFieldUpdater.get(this);
            i11 = this.f12205a;
            if (i10 <= i11) {
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, i11));
    }

    /* renamed from: g */
    public final int m12952g() {
        int andDecrement;
        do {
            andDecrement = f12204g.getAndDecrement(this);
        } while (andDecrement > this.f12205a);
        return andDecrement;
    }

    /* renamed from: h */
    public int m12953h() {
        return Math.max(f12204g.get(this), 0);
    }

    /* renamed from: i */
    public void m12954i() {
        do {
            int andIncrement = f12204g.getAndIncrement(this);
            if (andIncrement >= this.f12205a) {
                m12951f();
                throw new IllegalStateException(("The number of released permits cannot be greater than " + this.f12205a).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
        } while (!m12957l());
    }

    /* renamed from: j */
    public boolean m12955j() {
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f12204g;
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 > this.f12205a) {
                m12951f();
            } else {
                if (i10 <= 0) {
                    return false;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i10, i10 - 1)) {
                    return true;
                }
            }
        }
    }

    /* renamed from: k */
    public final boolean m12956k(Object obj) {
        if (!(obj instanceof InterfaceC1076n)) {
            if (obj instanceof InterfaceC3387b) {
                return ((InterfaceC3387b) obj).mo12582a(this, C2245s.f8873a);
            }
            throw new IllegalStateException(("unexpected: " + obj).toString());
        }
        C4753m.m18651d(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
        InterfaceC1076n interfaceC1076n = (InterfaceC1076n) obj;
        Object mo4487e = interfaceC1076n.mo4487e(C2245s.f8873a, null, this.f12206b);
        if (mo4487e == null) {
            return false;
        }
        interfaceC1076n.mo4492m(mo4487e);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0034, code lost:
    
        r9 = true;
     */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m12957l() {
        /*
            r15 = this;
            r0 = r15
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = p174le.C3482d.f12200c
            java.lang.Object r2 = r1.get(r15)
            le.f r2 = (p174le.C3484f) r2
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = p174le.C3482d.f12201d
            long r3 = r3.getAndIncrement(r15)
            int r5 = p174le.C3483e.m12966f()
            long r5 = (long) r5
            long r5 = r3 / r5
            le.d$c r7 = p174le.C3482d.c.f12209h
        L18:
            java.lang.Object r8 = p116he.C2523e.m10065c(r2, r5, r7)
            boolean r9 = p116he.C2534j0.m10089c(r8)
            if (r9 != 0) goto L5b
            he.i0 r9 = p116he.C2534j0.m10088b(r8)
        L26:
            java.lang.Object r12 = r1.get(r15)
            he.i0 r12 = (p116he.AbstractC2532i0) r12
            long r13 = r12.f9971j
            long r10 = r9.f9971j
            int r10 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r10 < 0) goto L36
        L34:
            r9 = 1
            goto L4e
        L36:
            boolean r10 = r9.m10086q()
            if (r10 != 0) goto L3e
            r9 = 0
            goto L4e
        L3e:
            boolean r10 = p038ce.C1080o.m4523a(r1, r15, r12, r9)
            if (r10 == 0) goto L51
            boolean r9 = r12.m10084m()
            if (r9 == 0) goto L34
            r12.m10076k()
            goto L34
        L4e:
            if (r9 == 0) goto L18
            goto L5b
        L51:
            boolean r10 = r9.m10084m()
            if (r10 == 0) goto L26
            r9.m10076k()
            goto L26
        L5b:
            he.i0 r1 = p116he.C2534j0.m10088b(r8)
            le.f r1 = (p174le.C3484f) r1
            r1.m10067b()
            long r7 = r1.f9971j
            int r2 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r2 <= 0) goto L6c
            r2 = 0
            return r2
        L6c:
            int r2 = p174le.C3483e.m12966f()
            long r5 = (long) r2
            long r3 = r3 % r5
            int r2 = (int) r3
            he.l0 r3 = p174le.C3483e.m12965e()
            java.util.concurrent.atomic.AtomicReferenceArray r4 = r1.m12969r()
            java.lang.Object r3 = r4.getAndSet(r2, r3)
            if (r3 != 0) goto Laf
            int r3 = p174le.C3483e.m12964d()
            r10 = 0
        L86:
            if (r10 >= r3) goto L9c
            java.util.concurrent.atomic.AtomicReferenceArray r4 = r1.m12969r()
            java.lang.Object r4 = r4.get(r2)
            he.l0 r5 = p174le.C3483e.m12967g()
            if (r4 != r5) goto L98
            r4 = 1
            return r4
        L98:
            r4 = 1
            int r10 = r10 + 1
            goto L86
        L9c:
            r4 = 1
            he.l0 r3 = p174le.C3483e.m12965e()
            he.l0 r5 = p174le.C3483e.m12962b()
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r1.m12969r()
            boolean r1 = r1.compareAndSet(r2, r3, r5)
            r1 = r1 ^ r4
            return r1
        Laf:
            he.l0 r1 = p174le.C3483e.m12963c()
            if (r3 != r1) goto Lb7
            r1 = 0
            return r1
        Lb7:
            boolean r1 = r15.m12956k(r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p174le.C3482d.m12957l():boolean");
    }
}
