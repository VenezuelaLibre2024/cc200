package ee;

import gd.C2237k;
import gd.C2238l;
import gd.C2245s;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import ke.C3386a;
import ke.EnumC3389d;
import ke.InterfaceC3387b;
import p038ce.C1080o;
import p038ce.C1084p;
import p038ce.C1092r;
import p038ce.C1101t0;
import p038ce.InterfaceC1062j3;
import p038ce.InterfaceC1076n;
import p116he.AbstractC2525f;
import p116he.AbstractC2532i0;
import p116he.C2522d0;
import p116he.C2523e;
import p116he.C2534j0;
import p116he.C2536k0;
import p116he.C2538l0;
import p116he.C2556u0;
import p146jd.InterfaceC3281d;
import p161kd.C3384b;
import p161kd.C3385c;
import p173ld.C3468b;
import p173ld.C3474h;
import p173ld.InterfaceC3471e;
import sd.InterfaceC4580l;
import sd.InterfaceC4584p;
import sd.InterfaceC4585q;
import td.AbstractC4754n;
import td.C4753m;

/* renamed from: ee.b */
/* loaded from: classes2.dex */
public class C1774b<E> implements InterfaceC1776d<E> {

    /* renamed from: e */
    public static final AtomicLongFieldUpdater f6535e = AtomicLongFieldUpdater.newUpdater(C1774b.class, "sendersAndCloseStatus");

    /* renamed from: f */
    public static final AtomicLongFieldUpdater f6536f = AtomicLongFieldUpdater.newUpdater(C1774b.class, "receivers");

    /* renamed from: g */
    public static final AtomicLongFieldUpdater f6537g = AtomicLongFieldUpdater.newUpdater(C1774b.class, "bufferEnd");

    /* renamed from: h */
    public static final AtomicLongFieldUpdater f6538h = AtomicLongFieldUpdater.newUpdater(C1774b.class, "completedExpandBuffersAndPauseFlag");

    /* renamed from: i */
    public static final AtomicReferenceFieldUpdater f6539i = AtomicReferenceFieldUpdater.newUpdater(C1774b.class, Object.class, "sendSegment");

    /* renamed from: j */
    public static final AtomicReferenceFieldUpdater f6540j = AtomicReferenceFieldUpdater.newUpdater(C1774b.class, Object.class, "receiveSegment");

    /* renamed from: k */
    public static final AtomicReferenceFieldUpdater f6541k = AtomicReferenceFieldUpdater.newUpdater(C1774b.class, Object.class, "bufferEndSegment");

    /* renamed from: l */
    public static final AtomicReferenceFieldUpdater f6542l = AtomicReferenceFieldUpdater.newUpdater(C1774b.class, Object.class, "_closeCause");

    /* renamed from: m */
    public static final AtomicReferenceFieldUpdater f6543m = AtomicReferenceFieldUpdater.newUpdater(C1774b.class, Object.class, "closeHandler");
    private volatile Object _closeCause;

    /* renamed from: b */
    public final int f6544b;
    private volatile long bufferEnd;
    private volatile Object bufferEndSegment;

    /* renamed from: c */
    public final InterfaceC4580l<E, C2245s> f6545c;
    private volatile Object closeHandler;
    private volatile long completedExpandBuffersAndPauseFlag;

    /* renamed from: d */
    public final InterfaceC4585q<InterfaceC3387b<?>, Object, Object, InterfaceC4580l<Throwable, C2245s>> f6546d;
    private volatile Object receiveSegment;
    private volatile long receivers;
    private volatile Object sendSegment;
    private volatile long sendersAndCloseStatus;

    /* renamed from: ee.b$a */
    /* loaded from: classes2.dex */
    public final class a implements InterfaceC1777e<E>, InterfaceC1062j3 {

        /* renamed from: h */
        public Object f6547h;

        /* renamed from: i */
        public C1084p<? super Boolean> f6548i;

        public a() {
            C2538l0 c2538l0;
            c2538l0 = C1775c.f6571p;
            this.f6547h = c2538l0;
        }

        @Override // ee.InterfaceC1777e
        /* renamed from: a */
        public Object mo7151a(InterfaceC3281d<? super Boolean> interfaceC3281d) {
            boolean m7153f;
            C1780h<E> c1780h;
            C2538l0 c2538l0;
            C2538l0 c2538l02;
            C2538l0 c2538l03;
            C1774b<E> c1774b = C1774b.this;
            C1780h<E> c1780h2 = (C1780h) C1774b.f6540j.get(c1774b);
            while (true) {
                if (c1774b.m7101P()) {
                    m7153f = m7153f();
                    break;
                }
                long andIncrement = C1774b.f6536f.getAndIncrement(c1774b);
                int i10 = C1775c.f6557b;
                long j10 = andIncrement / i10;
                int i11 = (int) (andIncrement % i10);
                if (c1780h2.f9971j != j10) {
                    C1780h<E> m7088B = c1774b.m7088B(j10, c1780h2);
                    if (m7088B == null) {
                        continue;
                    } else {
                        c1780h = m7088B;
                    }
                } else {
                    c1780h = c1780h2;
                }
                Object m7133r0 = c1774b.m7133r0(c1780h, i11, andIncrement, null);
                c2538l0 = C1775c.f6568m;
                if (m7133r0 == c2538l0) {
                    throw new IllegalStateException("unreachable".toString());
                }
                c2538l02 = C1775c.f6570o;
                if (m7133r0 == c2538l02) {
                    if (andIncrement < c1774b.m7095I()) {
                        c1780h.m10067b();
                    }
                    c1780h2 = c1780h;
                } else {
                    c2538l03 = C1775c.f6569n;
                    if (m7133r0 == c2538l03) {
                        return m7152e(c1780h, i11, andIncrement, interfaceC3281d);
                    }
                    c1780h.m10067b();
                    this.f6547h = m7133r0;
                    m7153f = true;
                }
            }
            return C3468b.m12913a(m7153f);
        }

        /* renamed from: e */
        public final Object m7152e(C1780h<E> c1780h, int i10, long j10, InterfaceC3281d<? super Boolean> interfaceC3281d) {
            C2538l0 c2538l0;
            C2538l0 c2538l02;
            Boolean m12913a;
            C2538l0 c2538l03;
            C2538l0 c2538l04;
            C2538l0 c2538l05;
            C1774b<E> c1774b = C1774b.this;
            C1084p m4566b = C1092r.m4566b(C3384b.m12580b(interfaceC3281d));
            try {
                this.f6548i = m4566b;
                Object m7133r0 = c1774b.m7133r0(c1780h, i10, j10, this);
                c2538l0 = C1775c.f6568m;
                if (m7133r0 == c2538l0) {
                    c1774b.m7120e0(this, c1780h, i10);
                } else {
                    c2538l02 = C1775c.f6570o;
                    InterfaceC4580l<Throwable, C2245s> interfaceC4580l = null;
                    if (m7133r0 == c2538l02) {
                        if (j10 < c1774b.m7095I()) {
                            c1780h.m10067b();
                        }
                        C1780h c1780h2 = (C1780h) C1774b.f6540j.get(c1774b);
                        while (true) {
                            if (c1774b.m7101P()) {
                                m7154g();
                                break;
                            }
                            long andIncrement = C1774b.f6536f.getAndIncrement(c1774b);
                            int i11 = C1775c.f6557b;
                            long j11 = andIncrement / i11;
                            int i12 = (int) (andIncrement % i11);
                            if (c1780h2.f9971j != j11) {
                                C1780h m7088B = c1774b.m7088B(j11, c1780h2);
                                if (m7088B != null) {
                                    c1780h2 = m7088B;
                                }
                            }
                            Object m7133r02 = c1774b.m7133r0(c1780h2, i12, andIncrement, this);
                            c2538l03 = C1775c.f6568m;
                            if (m7133r02 == c2538l03) {
                                c1774b.m7120e0(this, c1780h2, i12);
                                break;
                            }
                            c2538l04 = C1775c.f6570o;
                            if (m7133r02 != c2538l04) {
                                c2538l05 = C1775c.f6569n;
                                if (m7133r02 == c2538l05) {
                                    throw new IllegalStateException("unexpected".toString());
                                }
                                c1780h2.m10067b();
                                this.f6547h = m7133r02;
                                this.f6548i = null;
                                m12913a = C3468b.m12913a(true);
                                InterfaceC4580l<E, C2245s> interfaceC4580l2 = c1774b.f6545c;
                                if (interfaceC4580l2 != null) {
                                    interfaceC4580l = C2522d0.m10058a(interfaceC4580l2, m7133r02, m4566b.getContext());
                                }
                            } else if (andIncrement < c1774b.m7095I()) {
                                c1780h2.m10067b();
                            }
                        }
                    } else {
                        c1780h.m10067b();
                        this.f6547h = m7133r0;
                        this.f6548i = null;
                        m12913a = C3468b.m12913a(true);
                        InterfaceC4580l<E, C2245s> interfaceC4580l3 = c1774b.f6545c;
                        if (interfaceC4580l3 != null) {
                            interfaceC4580l = C2522d0.m10058a(interfaceC4580l3, m7133r0, m4566b.getContext());
                        }
                    }
                    m4566b.mo4489g(m12913a, interfaceC4580l);
                }
                Object m4553y = m4566b.m4553y();
                if (m4553y == C3385c.m12581c()) {
                    C3474h.m12927c(interfaceC3281d);
                }
                return m4553y;
            } catch (Throwable th) {
                m4566b.m4537J();
                throw th;
            }
        }

        /* renamed from: f */
        public final boolean m7153f() {
            this.f6547h = C1775c.m7189z();
            Throwable m7091E = C1774b.this.m7091E();
            if (m7091E == null) {
                return false;
            }
            throw C2536k0.m10099j(m7091E);
        }

        /* renamed from: g */
        public final void m7154g() {
            Object m8974a;
            C1084p<? super Boolean> c1084p = this.f6548i;
            C4753m.m18650c(c1084p);
            this.f6548i = null;
            this.f6547h = C1775c.m7189z();
            Throwable m7091E = C1774b.this.m7091E();
            if (m7091E == null) {
                C2237k.a aVar = C2237k.f8865i;
                m8974a = Boolean.FALSE;
            } else {
                if (C1101t0.m4576d() && (c1084p instanceof InterfaceC3471e)) {
                    m7091E = C2536k0.m10098i(m7091E, c1084p);
                }
                C2237k.a aVar2 = C2237k.f8865i;
                m8974a = C2238l.m8974a(m7091E);
            }
            c1084p.resumeWith(C2237k.m8966b(m8974a));
        }

        /* renamed from: h */
        public final boolean m7155h(E e10) {
            boolean m7162B;
            C1084p<? super Boolean> c1084p = this.f6548i;
            C4753m.m18650c(c1084p);
            this.f6548i = null;
            this.f6547h = e10;
            Boolean bool = Boolean.TRUE;
            InterfaceC4580l<E, C2245s> interfaceC4580l = C1774b.this.f6545c;
            m7162B = C1775c.m7162B(c1084p, bool, interfaceC4580l != null ? C2522d0.m10058a(interfaceC4580l, e10, c1084p.getContext()) : null);
            return m7162B;
        }

        /* renamed from: i */
        public final void m7156i() {
            Object m8974a;
            C1084p<? super Boolean> c1084p = this.f6548i;
            C4753m.m18650c(c1084p);
            this.f6548i = null;
            this.f6547h = C1775c.m7189z();
            Throwable m7091E = C1774b.this.m7091E();
            if (m7091E == null) {
                C2237k.a aVar = C2237k.f8865i;
                m8974a = Boolean.FALSE;
            } else {
                if (C1101t0.m4576d() && (c1084p instanceof InterfaceC3471e)) {
                    m7091E = C2536k0.m10098i(m7091E, c1084p);
                }
                C2237k.a aVar2 = C2237k.f8865i;
                m8974a = C2238l.m8974a(m7091E);
            }
            c1084p.resumeWith(C2237k.m8966b(m8974a));
        }

        @Override // p038ce.InterfaceC1062j3
        /* renamed from: j */
        public void mo4453j(AbstractC2532i0<?> abstractC2532i0, int i10) {
            C1084p<? super Boolean> c1084p = this.f6548i;
            if (c1084p != null) {
                c1084p.mo4453j(abstractC2532i0, i10);
            }
        }

        @Override // ee.InterfaceC1777e
        public E next() {
            C2538l0 c2538l0;
            C2538l0 c2538l02;
            E e10 = (E) this.f6547h;
            c2538l0 = C1775c.f6571p;
            if (!(e10 != c2538l0)) {
                throw new IllegalStateException("`hasNext()` has not been invoked".toString());
            }
            c2538l02 = C1775c.f6571p;
            this.f6547h = c2538l02;
            if (e10 != C1775c.m7189z()) {
                return e10;
            }
            throw C2536k0.m10099j(C1774b.this.m7092F());
        }
    }

    /* renamed from: ee.b$b */
    /* loaded from: classes2.dex */
    public static final class b implements InterfaceC1062j3 {

        /* renamed from: h */
        public final InterfaceC1076n<Boolean> f6550h;

        /* renamed from: i */
        public final /* synthetic */ C1084p<Boolean> f6551i;

        /* renamed from: a */
        public final InterfaceC1076n<Boolean> m7157a() {
            return this.f6550h;
        }

        @Override // p038ce.InterfaceC1062j3
        /* renamed from: j */
        public void mo4453j(AbstractC2532i0<?> abstractC2532i0, int i10) {
            this.f6551i.mo4453j(abstractC2532i0, i10);
        }
    }

    /* renamed from: ee.b$c */
    /* loaded from: classes2.dex */
    public static final class c extends AbstractC4754n implements InterfaceC4585q<InterfaceC3387b<?>, Object, Object, InterfaceC4580l<? super Throwable, ? extends C2245s>> {

        /* renamed from: h */
        public final /* synthetic */ C1774b<E> f6552h;

        /* renamed from: ee.b$c$a */
        /* loaded from: classes2.dex */
        public static final class a extends AbstractC4754n implements InterfaceC4580l<Throwable, C2245s> {

            /* renamed from: h */
            public final /* synthetic */ Object f6553h;

            /* renamed from: i */
            public final /* synthetic */ C1774b<E> f6554i;

            /* renamed from: j */
            public final /* synthetic */ InterfaceC3387b<?> f6555j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Object obj, C1774b<E> c1774b, InterfaceC3387b<?> interfaceC3387b) {
                super(1);
                this.f6553h = obj;
                this.f6554i = c1774b;
                this.f6555j = interfaceC3387b;
            }

            /* renamed from: a */
            public final void m7160a(Throwable th) {
                if (this.f6553h != C1775c.m7189z()) {
                    C2522d0.m10059b(this.f6554i.f6545c, this.f6553h, this.f6555j.getContext());
                }
            }

            @Override // sd.InterfaceC4580l
            public /* bridge */ /* synthetic */ C2245s invoke(Throwable th) {
                m7160a(th);
                return C2245s.f8873a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C1774b<E> c1774b) {
            super(3);
            this.f6552h = c1774b;
        }

        @Override // sd.InterfaceC4585q
        /* renamed from: a */
        public final InterfaceC4580l<Throwable, C2245s> mo7159b(InterfaceC3387b<?> interfaceC3387b, Object obj, Object obj2) {
            return new a(obj2, this.f6552h, interfaceC3387b);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1774b(int i10, InterfaceC4580l<? super E, C2245s> interfaceC4580l) {
        long m7161A;
        C2538l0 c2538l0;
        this.f6544b = i10;
        this.f6545c = interfaceC4580l;
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("Invalid channel capacity: " + i10 + ", should be >=0").toString());
        }
        m7161A = C1775c.m7161A(i10);
        this.bufferEnd = m7161A;
        this.completedExpandBuffersAndPauseFlag = m7090D();
        C1780h c1780h = new C1780h(0L, null, this, 3);
        this.sendSegment = c1780h;
        this.receiveSegment = c1780h;
        if (m7106U()) {
            c1780h = C1775c.f6556a;
            C4753m.m18651d(c1780h, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment = c1780h;
        this.f6546d = interfaceC4580l != 0 ? new c(this) : null;
        c2538l0 = C1775c.f6574s;
        this._closeCause = c2538l0;
    }

    /* renamed from: L */
    public static /* synthetic */ void m7072L(C1774b c1774b, long j10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incCompletedExpandBufferAttempts");
        }
        if ((i10 & 1) != 0) {
            j10 = 1;
        }
        c1774b.m7097K(j10);
    }

    /* renamed from: g0 */
    public static /* synthetic */ <E> Object m7076g0(C1774b<E> c1774b, InterfaceC3281d<? super E> interfaceC3281d) {
        C2538l0 c2538l0;
        C2538l0 c2538l02;
        C2538l0 c2538l03;
        C1780h<E> c1780h = (C1780h) f6540j.get(c1774b);
        while (!c1774b.m7101P()) {
            long andIncrement = f6536f.getAndIncrement(c1774b);
            int i10 = C1775c.f6557b;
            long j10 = andIncrement / i10;
            int i11 = (int) (andIncrement % i10);
            if (c1780h.f9971j != j10) {
                C1780h<E> m7088B = c1774b.m7088B(j10, c1780h);
                if (m7088B == null) {
                    continue;
                } else {
                    c1780h = m7088B;
                }
            }
            Object m7133r0 = c1774b.m7133r0(c1780h, i11, andIncrement, null);
            c2538l0 = C1775c.f6568m;
            if (m7133r0 == c2538l0) {
                throw new IllegalStateException("unexpected".toString());
            }
            c2538l02 = C1775c.f6570o;
            if (m7133r0 != c2538l02) {
                c2538l03 = C1775c.f6569n;
                if (m7133r0 == c2538l03) {
                    return c1774b.m7122h0(c1780h, i11, andIncrement, interfaceC3281d);
                }
                c1780h.m10067b();
                return m7133r0;
            }
            if (andIncrement < c1774b.m7095I()) {
                c1780h.m10067b();
            }
        }
        throw C2536k0.m10099j(c1774b.m7092F());
    }

    /* renamed from: A */
    public final C1780h<E> m7087A(long j10, C1780h<E> c1780h, long j11) {
        Object m10065c;
        boolean z10;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6541k;
        InterfaceC4584p interfaceC4584p = (InterfaceC4584p) C1775c.m7188y();
        do {
            m10065c = C2523e.m10065c(c1780h, j10, interfaceC4584p);
            if (C2534j0.m10089c(m10065c)) {
                break;
            }
            AbstractC2532i0 m10088b = C2534j0.m10088b(m10065c);
            while (true) {
                AbstractC2532i0 abstractC2532i0 = (AbstractC2532i0) atomicReferenceFieldUpdater.get(this);
                if (abstractC2532i0.f9971j >= m10088b.f9971j) {
                    break;
                }
                if (!m10088b.m10086q()) {
                    z10 = false;
                    break;
                }
                if (C1080o.m4523a(atomicReferenceFieldUpdater, this, abstractC2532i0, m10088b)) {
                    if (abstractC2532i0.m10084m()) {
                        abstractC2532i0.m10076k();
                    }
                } else if (m10088b.m10084m()) {
                    m10088b.m10076k();
                }
            }
            z10 = true;
        } while (!z10);
        if (C2534j0.m10089c(m10065c)) {
            m7144x();
            m7111Z(j10, c1780h);
        } else {
            C1780h<E> c1780h2 = (C1780h) C2534j0.m10088b(m10065c);
            long j12 = c1780h2.f9971j;
            if (j12 <= j10) {
                if (C1101t0.m4573a()) {
                    if (!(c1780h2.f9971j == j10)) {
                        throw new AssertionError();
                    }
                }
                return c1780h2;
            }
            int i10 = C1775c.f6557b;
            if (f6537g.compareAndSet(this, j11 + 1, i10 * j12)) {
                m7097K((c1780h2.f9971j * i10) - j11);
                return null;
            }
        }
        m7072L(this, 0L, 1, null);
        return null;
    }

    /* renamed from: B */
    public final C1780h<E> m7088B(long j10, C1780h<E> c1780h) {
        Object m10065c;
        boolean z10;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6540j;
        InterfaceC4584p interfaceC4584p = (InterfaceC4584p) C1775c.m7188y();
        do {
            m10065c = C2523e.m10065c(c1780h, j10, interfaceC4584p);
            if (C2534j0.m10089c(m10065c)) {
                break;
            }
            AbstractC2532i0 m10088b = C2534j0.m10088b(m10065c);
            while (true) {
                AbstractC2532i0 abstractC2532i0 = (AbstractC2532i0) atomicReferenceFieldUpdater.get(this);
                if (abstractC2532i0.f9971j >= m10088b.f9971j) {
                    break;
                }
                if (!m10088b.m10086q()) {
                    z10 = false;
                    break;
                }
                if (C1080o.m4523a(atomicReferenceFieldUpdater, this, abstractC2532i0, m10088b)) {
                    if (abstractC2532i0.m10084m()) {
                        abstractC2532i0.m10076k();
                    }
                } else if (m10088b.m10084m()) {
                    m10088b.m10076k();
                }
            }
            z10 = true;
        } while (!z10);
        if (C2534j0.m10089c(m10065c)) {
            m7144x();
            if (c1780h.f9971j * C1775c.f6557b >= m7095I()) {
                return null;
            }
        } else {
            c1780h = (C1780h) C2534j0.m10088b(m10065c);
            if (!m7106U() && j10 <= m7090D() / C1775c.f6557b) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f6541k;
                while (true) {
                    AbstractC2532i0 abstractC2532i02 = (AbstractC2532i0) atomicReferenceFieldUpdater2.get(this);
                    if (abstractC2532i02.f9971j >= c1780h.f9971j || !c1780h.m10086q()) {
                        break;
                    }
                    if (C1080o.m4523a(atomicReferenceFieldUpdater2, this, abstractC2532i02, c1780h)) {
                        if (abstractC2532i02.m10084m()) {
                            abstractC2532i02.m10076k();
                        }
                    } else if (c1780h.m10084m()) {
                        c1780h.m10076k();
                    }
                }
            }
            long j11 = c1780h.f9971j;
            if (j11 <= j10) {
                if (C1101t0.m4573a()) {
                    if (!(c1780h.f9971j == j10)) {
                        throw new AssertionError();
                    }
                }
                return c1780h;
            }
            int i10 = C1775c.f6557b;
            m7141v0(j11 * i10);
            if (c1780h.f9971j * i10 >= m7095I()) {
                return null;
            }
        }
        c1780h.m10067b();
        return null;
    }

    /* renamed from: C */
    public final C1780h<E> m7089C(long j10, C1780h<E> c1780h) {
        Object m10065c;
        boolean z10;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6539i;
        InterfaceC4584p interfaceC4584p = (InterfaceC4584p) C1775c.m7188y();
        do {
            m10065c = C2523e.m10065c(c1780h, j10, interfaceC4584p);
            if (C2534j0.m10089c(m10065c)) {
                break;
            }
            AbstractC2532i0 m10088b = C2534j0.m10088b(m10065c);
            while (true) {
                AbstractC2532i0 abstractC2532i0 = (AbstractC2532i0) atomicReferenceFieldUpdater.get(this);
                if (abstractC2532i0.f9971j >= m10088b.f9971j) {
                    break;
                }
                if (!m10088b.m10086q()) {
                    z10 = false;
                    break;
                }
                if (C1080o.m4523a(atomicReferenceFieldUpdater, this, abstractC2532i0, m10088b)) {
                    if (abstractC2532i0.m10084m()) {
                        abstractC2532i0.m10076k();
                    }
                } else if (m10088b.m10084m()) {
                    m10088b.m10076k();
                }
            }
            z10 = true;
        } while (!z10);
        if (C2534j0.m10089c(m10065c)) {
            m7144x();
            if (c1780h.f9971j * C1775c.f6557b >= m7093G()) {
                return null;
            }
        } else {
            c1780h = (C1780h) C2534j0.m10088b(m10065c);
            long j11 = c1780h.f9971j;
            if (j11 <= j10) {
                if (C1101t0.m4573a()) {
                    if (!(c1780h.f9971j == j10)) {
                        throw new AssertionError();
                    }
                }
                return c1780h;
            }
            int i10 = C1775c.f6557b;
            m7143w0(j11 * i10);
            if (c1780h.f9971j * i10 >= m7093G()) {
                return null;
            }
        }
        c1780h.m10067b();
        return null;
    }

    /* renamed from: D */
    public final long m7090D() {
        return f6537g.get(this);
    }

    /* renamed from: E */
    public final Throwable m7091E() {
        return (Throwable) f6542l.get(this);
    }

    /* renamed from: F */
    public final Throwable m7092F() {
        Throwable m7091E = m7091E();
        return m7091E == null ? new C1781i("Channel was closed") : m7091E;
    }

    /* renamed from: G */
    public final long m7093G() {
        return f6536f.get(this);
    }

    /* renamed from: H */
    public final Throwable m7094H() {
        Throwable m7091E = m7091E();
        return m7091E == null ? new C1782j("Channel was closed") : m7091E;
    }

    /* renamed from: I */
    public final long m7095I() {
        return f6535e.get(this) & 1152921504606846975L;
    }

    /* renamed from: J */
    public final boolean m7096J() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6540j;
            C1780h<E> c1780h = (C1780h) atomicReferenceFieldUpdater.get(this);
            long m7093G = m7093G();
            if (m7095I() <= m7093G) {
                return false;
            }
            int i10 = C1775c.f6557b;
            long j10 = m7093G / i10;
            if (c1780h.f9971j == j10 || (c1780h = m7088B(j10, c1780h)) != null) {
                c1780h.m10067b();
                if (m7099N(c1780h, (int) (m7093G % i10), m7093G)) {
                    return true;
                }
                f6536f.compareAndSet(this, m7093G, m7093G + 1);
            } else if (((C1780h) atomicReferenceFieldUpdater.get(this)).f9971j < j10) {
                return false;
            }
        }
    }

    /* renamed from: K */
    public final void m7097K(long j10) {
        if (!((f6538h.addAndGet(this, j10) & 4611686018427387904L) != 0)) {
            return;
        }
        do {
        } while ((f6538h.get(this) & 4611686018427387904L) != 0);
    }

    /* renamed from: M */
    public final void m7098M() {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6543m;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
        } while (!C1080o.m4523a(atomicReferenceFieldUpdater, this, obj, obj == null ? C1775c.f6572q : C1775c.f6573r));
        if (obj == null) {
            return;
        }
        ((InterfaceC4580l) obj).invoke(m7091E());
    }

    /* renamed from: N */
    public final boolean m7099N(C1780h<E> c1780h, int i10, long j10) {
        Object m7217w;
        C2538l0 c2538l0;
        C2538l0 c2538l02;
        C2538l0 c2538l03;
        C2538l0 c2538l04;
        C2538l0 c2538l05;
        C2538l0 c2538l06;
        C2538l0 c2538l07;
        do {
            m7217w = c1780h.m7217w(i10);
            if (m7217w != null) {
                c2538l02 = C1775c.f6560e;
                if (m7217w != c2538l02) {
                    if (m7217w == C1775c.f6559d) {
                        return true;
                    }
                    c2538l03 = C1775c.f6565j;
                    if (m7217w == c2538l03 || m7217w == C1775c.m7189z()) {
                        return false;
                    }
                    c2538l04 = C1775c.f6564i;
                    if (m7217w == c2538l04) {
                        return false;
                    }
                    c2538l05 = C1775c.f6563h;
                    if (m7217w == c2538l05) {
                        return false;
                    }
                    c2538l06 = C1775c.f6562g;
                    if (m7217w == c2538l06) {
                        return true;
                    }
                    c2538l07 = C1775c.f6561f;
                    return m7217w != c2538l07 && j10 == m7093G();
                }
            }
            c2538l0 = C1775c.f6563h;
        } while (!c1780h.m7212r(i10, m7217w, c2538l0));
        m7147z();
        return false;
    }

    /* renamed from: O */
    public final boolean m7100O(long j10, boolean z10) {
        int i10 = (int) (j10 >> 60);
        if (i10 == 0 || i10 == 1) {
            return false;
        }
        if (i10 == 2) {
            m7142w(j10 & 1152921504606846975L);
            if (z10 && m7096J()) {
                return false;
            }
        } else {
            if (i10 != 3) {
                throw new IllegalStateException(("unexpected close status: " + i10).toString());
            }
            m7140v(j10 & 1152921504606846975L);
        }
        return true;
    }

    /* renamed from: P */
    public boolean m7101P() {
        return m7102Q(f6535e.get(this));
    }

    /* renamed from: Q */
    public final boolean m7102Q(long j10) {
        return m7100O(j10, true);
    }

    /* renamed from: R */
    public boolean m7103R() {
        return m7104S(f6535e.get(this));
    }

    /* renamed from: S */
    public final boolean m7104S(long j10) {
        return m7100O(j10, false);
    }

    /* renamed from: T */
    public boolean mo7105T() {
        return false;
    }

    /* renamed from: U */
    public final boolean m7106U() {
        long m7090D = m7090D();
        return m7090D == 0 || m7090D == Long.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x003c, code lost:
    
        r8 = (ee.C1780h) r8.m10072g();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: V */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long m7107V(ee.C1780h<E> r8) {
        /*
            r7 = this;
        L0:
            int r0 = ee.C1775c.f6557b
            int r0 = r0 + (-1)
        L4:
            r1 = -1
            r3 = -1
            if (r3 >= r0) goto L3c
            long r3 = r8.f9971j
            int r5 = ee.C1775c.f6557b
            long r5 = (long) r5
            long r3 = r3 * r5
            long r5 = (long) r0
            long r3 = r3 + r5
            long r5 = r7.m7093G()
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 >= 0) goto L1a
            return r1
        L1a:
            java.lang.Object r1 = r8.m7217w(r0)
            if (r1 == 0) goto L2c
            he.l0 r2 = ee.C1775c.m7174k()
            if (r1 != r2) goto L27
            goto L2c
        L27:
            he.l0 r2 = ee.C1775c.f6559d
            if (r1 != r2) goto L39
            return r3
        L2c:
            he.l0 r2 = ee.C1775c.m7189z()
            boolean r1 = r8.m7212r(r0, r1, r2)
            if (r1 == 0) goto L1a
            r8.m10085p()
        L39:
            int r0 = r0 + (-1)
            goto L4
        L3c:
            he.f r8 = r8.m10072g()
            ee.h r8 = (ee.C1780h) r8
            if (r8 != 0) goto L0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ee.C1774b.m7107V(ee.h):long");
    }

    /* renamed from: W */
    public final void m7108W() {
        long j10;
        long m7186w;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f6535e;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            if (((int) (j10 >> 60)) != 0) {
                return;
            } else {
                m7186w = C1775c.m7186w(1152921504606846975L & j10, 1);
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, m7186w));
    }

    /* renamed from: X */
    public final void m7109X() {
        long j10;
        long m7186w;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f6535e;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            m7186w = C1775c.m7186w(1152921504606846975L & j10, 3);
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, m7186w));
    }

    /* renamed from: Y */
    public final void m7110Y() {
        long j10;
        long j11;
        int i10;
        long m7186w;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f6535e;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            int i11 = (int) (j10 >> 60);
            if (i11 == 0) {
                j11 = j10 & 1152921504606846975L;
                i10 = 2;
            } else {
                if (i11 != 1) {
                    return;
                }
                j11 = j10 & 1152921504606846975L;
                i10 = 3;
            }
            m7186w = C1775c.m7186w(j11, i10);
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, m7186w));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: Z */
    public final void m7111Z(long j10, C1780h<E> c1780h) {
        boolean z10;
        C1780h<E> c1780h2;
        C1780h<E> c1780h3;
        while (c1780h.f9971j < j10 && (c1780h3 = (C1780h) c1780h.m10070e()) != null) {
            c1780h = c1780h3;
        }
        while (true) {
            if (!c1780h.mo10073h() || (c1780h2 = (C1780h) c1780h.m10070e()) == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6541k;
                while (true) {
                    AbstractC2532i0 abstractC2532i0 = (AbstractC2532i0) atomicReferenceFieldUpdater.get(this);
                    z10 = true;
                    if (abstractC2532i0.f9971j >= c1780h.f9971j) {
                        break;
                    }
                    if (!c1780h.m10086q()) {
                        z10 = false;
                        break;
                    } else if (C1080o.m4523a(atomicReferenceFieldUpdater, this, abstractC2532i0, c1780h)) {
                        if (abstractC2532i0.m10084m()) {
                            abstractC2532i0.m10076k();
                        }
                    } else if (c1780h.m10084m()) {
                        c1780h.m10076k();
                    }
                }
                if (z10) {
                    return;
                }
            } else {
                c1780h = c1780h2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ee.InterfaceC1785m
    /* renamed from: a */
    public Object mo7112a() {
        Object obj;
        C1780h c1780h;
        C2538l0 c2538l0;
        C2538l0 c2538l02;
        C2538l0 c2538l03;
        long j10 = f6536f.get(this);
        long j11 = f6535e.get(this);
        if (m7102Q(j11)) {
            return C1779g.f6579b.m7205a(m7091E());
        }
        if (j10 >= (j11 & 1152921504606846975L)) {
            return C1779g.f6579b.m7206b();
        }
        obj = C1775c.f6566k;
        C1780h c1780h2 = (C1780h) f6540j.get(this);
        while (!m7101P()) {
            long andIncrement = f6536f.getAndIncrement(this);
            int i10 = C1775c.f6557b;
            long j12 = andIncrement / i10;
            int i11 = (int) (andIncrement % i10);
            if (c1780h2.f9971j != j12) {
                C1780h m7088B = m7088B(j12, c1780h2);
                if (m7088B == null) {
                    continue;
                } else {
                    c1780h = m7088B;
                }
            } else {
                c1780h = c1780h2;
            }
            Object m7133r0 = m7133r0(c1780h, i11, andIncrement, obj);
            c2538l0 = C1775c.f6568m;
            if (m7133r0 == c2538l0) {
                InterfaceC1062j3 interfaceC1062j3 = obj instanceof InterfaceC1062j3 ? (InterfaceC1062j3) obj : null;
                if (interfaceC1062j3 != null) {
                    m7120e0(interfaceC1062j3, c1780h, i11);
                }
                m7145x0(andIncrement);
                c1780h.m10085p();
                return C1779g.f6579b.m7206b();
            }
            c2538l02 = C1775c.f6570o;
            if (m7133r0 != c2538l02) {
                c2538l03 = C1775c.f6569n;
                if (m7133r0 == c2538l03) {
                    throw new IllegalStateException("unexpected".toString());
                }
                c1780h.m10067b();
                return C1779g.f6579b.m7207c(m7133r0);
            }
            if (andIncrement < m7095I()) {
                c1780h.m10067b();
            }
            c1780h2 = c1780h;
        }
        return C1779g.f6579b.m7205a(m7091E());
    }

    /* renamed from: a0 */
    public void m7113a0() {
    }

    @Override // ee.InterfaceC1786n
    /* renamed from: b */
    public boolean mo7114b(Throwable th) {
        return m7138u(th, false);
    }

    /* renamed from: b0 */
    public final void m7115b0(InterfaceC1076n<? super E> interfaceC1076n) {
        C2237k.a aVar = C2237k.f8865i;
        interfaceC1076n.resumeWith(C2237k.m8966b(C2238l.m8974a(m7092F())));
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00bb, code lost:
    
        return ee.C1779g.f6579b.m7207c(gd.C2245s.f8873a);
     */
    @Override // ee.InterfaceC1786n
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object mo7116c(E r15) {
        /*
            r14 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = ee.C1774b.f6535e
            long r0 = r0.get(r14)
            boolean r0 = r14.m7127m0(r0)
            if (r0 == 0) goto L13
            ee.g$b r15 = ee.C1779g.f6579b
            java.lang.Object r15 = r15.m7206b()
            return r15
        L13:
            he.l0 r8 = ee.C1775c.m7173j()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = m7079j()
            java.lang.Object r0 = r0.get(r14)
            ee.h r0 = (ee.C1780h) r0
        L21:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = m7080k()
            long r1 = r1.getAndIncrement(r14)
            r3 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r9 = r1 & r3
            boolean r11 = m7081l(r14, r1)
            int r1 = ee.C1775c.f6557b
            long r2 = (long) r1
            long r2 = r9 / r2
            long r4 = (long) r1
            long r4 = r9 % r4
            int r12 = (int) r4
            long r4 = r0.f9971j
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 == 0) goto L4e
            ee.h r1 = m7074f(r14, r2, r0)
            if (r1 != 0) goto L4c
            if (r11 == 0) goto L21
            goto L8e
        L4c:
            r13 = r1
            goto L4f
        L4e:
            r13 = r0
        L4f:
            r0 = r14
            r1 = r13
            r2 = r12
            r3 = r15
            r4 = r9
            r6 = r8
            r7 = r11
            int r0 = m7086q(r0, r1, r2, r3, r4, r6, r7)
            if (r0 == 0) goto Lb0
            r1 = 1
            if (r0 == r1) goto Lb3
            r1 = 2
            if (r0 == r1) goto L89
            r1 = 3
            if (r0 == r1) goto L7d
            r1 = 4
            if (r0 == r1) goto L71
            r1 = 5
            if (r0 == r1) goto L6c
            goto L6f
        L6c:
            r13.m10067b()
        L6f:
            r0 = r13
            goto L21
        L71:
            long r0 = r14.m7093G()
            int r15 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r15 >= 0) goto L8e
            r13.m10067b()
            goto L8e
        L7d:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "unexpected"
            java.lang.String r0 = r0.toString()
            r15.<init>(r0)
            throw r15
        L89:
            if (r11 == 0) goto L99
            r13.m10085p()
        L8e:
            ee.g$b r15 = ee.C1779g.f6579b
            java.lang.Throwable r0 = r14.m7094H()
            java.lang.Object r15 = r15.m7205a(r0)
            goto Lbb
        L99:
            boolean r15 = r8 instanceof p038ce.InterfaceC1062j3
            if (r15 == 0) goto La0
            ce.j3 r8 = (p038ce.InterfaceC1062j3) r8
            goto La1
        La0:
            r8 = 0
        La1:
            if (r8 == 0) goto La6
            m7084o(r14, r8, r13, r12)
        La6:
            r13.m10085p()
            ee.g$b r15 = ee.C1779g.f6579b
            java.lang.Object r15 = r15.m7206b()
            goto Lbb
        Lb0:
            r13.m10067b()
        Lb3:
            ee.g$b r15 = ee.C1779g.f6579b
            gd.s r0 = gd.C2245s.f8873a
            java.lang.Object r15 = r15.m7207c(r0)
        Lbb:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: ee.C1774b.mo7116c(java.lang.Object):java.lang.Object");
    }

    /* renamed from: c0 */
    public void m7117c0() {
    }

    @Override // ee.InterfaceC1785m
    /* renamed from: d */
    public Object mo7118d(InterfaceC3281d<? super E> interfaceC3281d) {
        return m7076g0(this, interfaceC3281d);
    }

    /* renamed from: d0 */
    public void m7119d0() {
    }

    /* renamed from: e0 */
    public final void m7120e0(InterfaceC1062j3 interfaceC1062j3, C1780h<E> c1780h, int i10) {
        m7119d0();
        interfaceC1062j3.mo4453j(c1780h, i10);
    }

    /* renamed from: f0 */
    public final void m7121f0(InterfaceC1062j3 interfaceC1062j3, C1780h<E> c1780h, int i10) {
        interfaceC1062j3.mo4453j(c1780h, i10 + C1775c.f6557b);
    }

    /* renamed from: h0 */
    public final Object m7122h0(C1780h<E> c1780h, int i10, long j10, InterfaceC3281d<? super E> interfaceC3281d) {
        C2538l0 c2538l0;
        C2538l0 c2538l02;
        C2538l0 c2538l03;
        C2538l0 c2538l04;
        C2538l0 c2538l05;
        C1084p m4566b = C1092r.m4566b(C3384b.m12580b(interfaceC3281d));
        try {
            Object m7133r0 = m7133r0(c1780h, i10, j10, m4566b);
            c2538l0 = C1775c.f6568m;
            if (m7133r0 == c2538l0) {
                m7120e0(m4566b, c1780h, i10);
            } else {
                c2538l02 = C1775c.f6570o;
                InterfaceC4580l<Throwable, C2245s> interfaceC4580l = null;
                interfaceC4580l = null;
                if (m7133r0 == c2538l02) {
                    if (j10 < m7095I()) {
                        c1780h.m10067b();
                    }
                    C1780h c1780h2 = (C1780h) f6540j.get(this);
                    while (true) {
                        if (m7101P()) {
                            m7115b0(m4566b);
                            break;
                        }
                        long andIncrement = f6536f.getAndIncrement(this);
                        int i11 = C1775c.f6557b;
                        long j11 = andIncrement / i11;
                        int i12 = (int) (andIncrement % i11);
                        if (c1780h2.f9971j != j11) {
                            C1780h m7088B = m7088B(j11, c1780h2);
                            if (m7088B != null) {
                                c1780h2 = m7088B;
                            }
                        }
                        m7133r0 = m7133r0(c1780h2, i12, andIncrement, m4566b);
                        c2538l03 = C1775c.f6568m;
                        if (m7133r0 == c2538l03) {
                            C1084p c1084p = m4566b instanceof InterfaceC1062j3 ? m4566b : null;
                            if (c1084p != null) {
                                m7120e0(c1084p, c1780h2, i12);
                            }
                        } else {
                            c2538l04 = C1775c.f6570o;
                            if (m7133r0 != c2538l04) {
                                c2538l05 = C1775c.f6569n;
                                if (m7133r0 == c2538l05) {
                                    throw new IllegalStateException("unexpected".toString());
                                }
                                c1780h2.m10067b();
                                InterfaceC4580l<E, C2245s> interfaceC4580l2 = this.f6545c;
                                if (interfaceC4580l2 != null) {
                                    interfaceC4580l = C2522d0.m10058a(interfaceC4580l2, m7133r0, m4566b.getContext());
                                }
                            } else if (andIncrement < m7095I()) {
                                c1780h2.m10067b();
                            }
                        }
                    }
                } else {
                    c1780h.m10067b();
                    InterfaceC4580l<E, C2245s> interfaceC4580l3 = this.f6545c;
                    if (interfaceC4580l3 != null) {
                        interfaceC4580l = C2522d0.m10058a(interfaceC4580l3, m7133r0, m4566b.getContext());
                    }
                }
                m4566b.mo4489g(m7133r0, interfaceC4580l);
            }
            Object m4553y = m4566b.m4553y();
            if (m4553y == C3385c.m12581c()) {
                C3474h.m12927c(interfaceC3281d);
            }
            return m4553y;
        } catch (Throwable th) {
            m4566b.m4537J();
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x00aa, code lost:
    
        r12 = (ee.C1780h) r12.m10072g();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: i0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m7123i0(ee.C1780h<E> r12) {
        /*
            r11 = this;
            sd.l<E, gd.s> r0 = r11.f6545c
            r1 = 0
            r2 = 1
            java.lang.Object r3 = p116he.C2549r.m10156b(r1, r2, r1)
        L8:
            int r4 = ee.C1775c.f6557b
            int r4 = r4 - r2
        Lb:
            r5 = -1
            if (r5 >= r4) goto Laa
            long r6 = r12.f9971j
            int r8 = ee.C1775c.f6557b
            long r8 = (long) r8
            long r6 = r6 * r8
            long r8 = (long) r4
            long r6 = r6 + r8
        L16:
            java.lang.Object r8 = r12.m7217w(r4)
            he.l0 r9 = ee.C1775c.m7169f()
            if (r8 == r9) goto Lb2
            he.l0 r9 = ee.C1775c.f6559d
            if (r8 != r9) goto L47
            long r9 = r11.m7093G()
            int r9 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r9 < 0) goto Lb2
            he.l0 r9 = ee.C1775c.m7189z()
            boolean r8 = r12.m7212r(r4, r8, r9)
            if (r8 == 0) goto L16
            if (r0 == 0) goto L40
            java.lang.Object r5 = r12.m7216v(r4)
            he.u0 r1 = p116he.C2522d0.m10060c(r0, r5, r1)
        L40:
            r12.m7213s(r4)
        L43:
            r12.m10085p()
            goto La6
        L47:
            he.l0 r9 = ee.C1775c.m7174k()
            if (r8 == r9) goto L9b
            if (r8 != 0) goto L50
            goto L9b
        L50:
            boolean r9 = r8 instanceof p038ce.InterfaceC1062j3
            if (r9 != 0) goto L6d
            boolean r9 = r8 instanceof ee.C1787o
            if (r9 == 0) goto L59
            goto L6d
        L59:
            he.l0 r9 = ee.C1775c.m7179p()
            if (r8 == r9) goto Lb2
            he.l0 r9 = ee.C1775c.m7180q()
            if (r8 != r9) goto L66
            goto Lb2
        L66:
            he.l0 r9 = ee.C1775c.m7179p()
            if (r8 == r9) goto L16
            goto La6
        L6d:
            long r9 = r11.m7093G()
            int r9 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r9 < 0) goto Lb2
            boolean r9 = r8 instanceof ee.C1787o
            if (r9 == 0) goto L7f
            r9 = r8
            ee.o r9 = (ee.C1787o) r9
            ce.j3 r9 = r9.f6588a
            goto L82
        L7f:
            r9 = r8
            ce.j3 r9 = (p038ce.InterfaceC1062j3) r9
        L82:
            he.l0 r10 = ee.C1775c.m7189z()
            boolean r8 = r12.m7212r(r4, r8, r10)
            if (r8 == 0) goto L16
            if (r0 == 0) goto L96
            java.lang.Object r5 = r12.m7216v(r4)
            he.u0 r1 = p116he.C2522d0.m10060c(r0, r5, r1)
        L96:
            java.lang.Object r3 = p116he.C2549r.m10157c(r3, r9)
            goto L40
        L9b:
            he.l0 r9 = ee.C1775c.m7189z()
            boolean r8 = r12.m7212r(r4, r8, r9)
            if (r8 == 0) goto L16
            goto L43
        La6:
            int r4 = r4 + (-1)
            goto Lb
        Laa:
            he.f r12 = r12.m10072g()
            ee.h r12 = (ee.C1780h) r12
            if (r12 != 0) goto L8
        Lb2:
            if (r3 == 0) goto Ld8
            boolean r12 = r3 instanceof java.util.ArrayList
            if (r12 != 0) goto Lbe
            ce.j3 r3 = (p038ce.InterfaceC1062j3) r3
            r11.m7125k0(r3)
            goto Ld8
        Lbe:
            java.lang.String r12 = "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }"
            td.C4753m.m18651d(r3, r12)
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r12 = r3.size()
            int r12 = r12 - r2
        Lca:
            if (r5 >= r12) goto Ld8
            java.lang.Object r0 = r3.get(r12)
            ce.j3 r0 = (p038ce.InterfaceC1062j3) r0
            r11.m7125k0(r0)
            int r12 = r12 + (-1)
            goto Lca
        Ld8:
            if (r1 != 0) goto Ldb
            return
        Ldb:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ee.C1774b.m7123i0(ee.h):void");
    }

    @Override // ee.InterfaceC1785m
    public InterfaceC1777e<E> iterator() {
        return new a();
    }

    /* renamed from: j0 */
    public final void m7124j0(InterfaceC1062j3 interfaceC1062j3) {
        m7126l0(interfaceC1062j3, true);
    }

    /* renamed from: k0 */
    public final void m7125k0(InterfaceC1062j3 interfaceC1062j3) {
        m7126l0(interfaceC1062j3, false);
    }

    /* renamed from: l0 */
    public final void m7126l0(InterfaceC1062j3 interfaceC1062j3, boolean z10) {
        InterfaceC3281d interfaceC3281d;
        Object m7195b;
        if (interfaceC1062j3 instanceof b) {
            interfaceC3281d = ((b) interfaceC1062j3).m7157a();
            C2237k.a aVar = C2237k.f8865i;
            m7195b = Boolean.FALSE;
        } else if (interfaceC1062j3 instanceof InterfaceC1076n) {
            interfaceC3281d = (InterfaceC3281d) interfaceC1062j3;
            C2237k.a aVar2 = C2237k.f8865i;
            m7195b = C2238l.m8974a(z10 ? m7092F() : m7094H());
        } else {
            if (!(interfaceC1062j3 instanceof C1784l)) {
                if (interfaceC1062j3 instanceof a) {
                    ((a) interfaceC1062j3).m7156i();
                    return;
                } else {
                    if (interfaceC1062j3 instanceof InterfaceC3387b) {
                        ((InterfaceC3387b) interfaceC1062j3).mo12582a(this, C1775c.m7189z());
                        return;
                    }
                    throw new IllegalStateException(("Unexpected waiter: " + interfaceC1062j3).toString());
                }
            }
            interfaceC3281d = ((C1784l) interfaceC1062j3).f6587h;
            C2237k.a aVar3 = C2237k.f8865i;
            m7195b = C1779g.m7195b(C1779g.f6579b.m7205a(m7091E()));
        }
        interfaceC3281d.resumeWith(C2237k.m8966b(m7195b));
    }

    /* renamed from: m0 */
    public final boolean m7127m0(long j10) {
        if (m7104S(j10)) {
            return false;
        }
        return !m7132r(j10 & 1152921504606846975L);
    }

    /* renamed from: n0 */
    public final boolean m7128n0(Object obj, E e10) {
        boolean m7162B;
        boolean m7162B2;
        if (obj instanceof InterfaceC3387b) {
            return ((InterfaceC3387b) obj).mo12582a(this, e10);
        }
        if (obj instanceof C1784l) {
            C4753m.m18651d(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveCatching<E of kotlinx.coroutines.channels.BufferedChannel>");
            C1784l c1784l = (C1784l) obj;
            C1084p<C1779g<? extends E>> c1084p = c1784l.f6587h;
            C1779g m7195b = C1779g.m7195b(C1779g.f6579b.m7207c(e10));
            InterfaceC4580l<E, C2245s> interfaceC4580l = this.f6545c;
            m7162B2 = C1775c.m7162B(c1084p, m7195b, interfaceC4580l != null ? C2522d0.m10058a(interfaceC4580l, e10, c1784l.f6587h.getContext()) : null);
            return m7162B2;
        }
        if (obj instanceof a) {
            C4753m.m18651d(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
            return ((a) obj).m7155h(e10);
        }
        if (!(obj instanceof InterfaceC1076n)) {
            throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
        }
        C4753m.m18651d(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
        InterfaceC1076n interfaceC1076n = (InterfaceC1076n) obj;
        InterfaceC4580l<E, C2245s> interfaceC4580l2 = this.f6545c;
        m7162B = C1775c.m7162B(interfaceC1076n, e10, interfaceC4580l2 != null ? C2522d0.m10058a(interfaceC4580l2, e10, interfaceC1076n.getContext()) : null);
        return m7162B;
    }

    /* renamed from: o0 */
    public final boolean m7129o0(Object obj, C1780h<E> c1780h, int i10) {
        InterfaceC1076n<Boolean> m7157a;
        Object obj2;
        if (obj instanceof InterfaceC1076n) {
            C4753m.m18651d(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            m7157a = (InterfaceC1076n) obj;
            obj2 = C2245s.f8873a;
        } else {
            if (obj instanceof InterfaceC3387b) {
                C4753m.m18651d(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
                EnumC3389d m12585g = ((C3386a) obj).m12585g(this, C2245s.f8873a);
                if (m12585g == EnumC3389d.REREGISTER) {
                    c1780h.m7213s(i10);
                }
                return m12585g == EnumC3389d.SUCCESSFUL;
            }
            if (!(obj instanceof b)) {
                throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
            }
            m7157a = ((b) obj).m7157a();
            obj2 = Boolean.TRUE;
        }
        return C1775c.m7163C(m7157a, obj2, null, 2, null);
    }

    /* renamed from: p0 */
    public final boolean m7130p0(C1780h<E> c1780h, int i10, long j10) {
        C2538l0 c2538l0;
        C2538l0 c2538l02;
        Object m7217w = c1780h.m7217w(i10);
        if ((m7217w instanceof InterfaceC1062j3) && j10 >= f6536f.get(this)) {
            c2538l0 = C1775c.f6562g;
            if (c1780h.m7212r(i10, m7217w, c2538l0)) {
                if (m7129o0(m7217w, c1780h, i10)) {
                    c1780h.m7208A(i10, C1775c.f6559d);
                    return true;
                }
                c2538l02 = C1775c.f6565j;
                c1780h.m7208A(i10, c2538l02);
                c1780h.m7218x(i10, false);
                return false;
            }
        }
        return m7131q0(c1780h, i10, j10);
    }

    /* renamed from: q0 */
    public final boolean m7131q0(C1780h<E> c1780h, int i10, long j10) {
        C2538l0 c2538l0;
        C2538l0 c2538l02;
        C2538l0 c2538l03;
        C2538l0 c2538l04;
        C2538l0 c2538l05;
        C2538l0 c2538l06;
        C2538l0 c2538l07;
        C2538l0 c2538l08;
        while (true) {
            Object m7217w = c1780h.m7217w(i10);
            if (!(m7217w instanceof InterfaceC1062j3)) {
                c2538l03 = C1775c.f6565j;
                if (m7217w != c2538l03) {
                    if (m7217w != null) {
                        if (m7217w != C1775c.f6559d) {
                            c2538l05 = C1775c.f6563h;
                            if (m7217w == c2538l05) {
                                break;
                            }
                            c2538l06 = C1775c.f6564i;
                            if (m7217w == c2538l06) {
                                break;
                            }
                            c2538l07 = C1775c.f6566k;
                            if (m7217w == c2538l07 || m7217w == C1775c.m7189z()) {
                                return true;
                            }
                            c2538l08 = C1775c.f6561f;
                            if (m7217w != c2538l08) {
                                throw new IllegalStateException(("Unexpected cell state: " + m7217w).toString());
                            }
                        } else {
                            return true;
                        }
                    } else {
                        c2538l04 = C1775c.f6560e;
                        if (c1780h.m7212r(i10, m7217w, c2538l04)) {
                            return true;
                        }
                    }
                } else {
                    return false;
                }
            } else if (j10 >= f6536f.get(this)) {
                c2538l0 = C1775c.f6562g;
                if (c1780h.m7212r(i10, m7217w, c2538l0)) {
                    if (m7129o0(m7217w, c1780h, i10)) {
                        c1780h.m7208A(i10, C1775c.f6559d);
                        return true;
                    }
                    c2538l02 = C1775c.f6565j;
                    c1780h.m7208A(i10, c2538l02);
                    c1780h.m7218x(i10, false);
                    return false;
                }
            } else if (c1780h.m7212r(i10, m7217w, new C1787o((InterfaceC1062j3) m7217w))) {
                return true;
            }
        }
    }

    /* renamed from: r */
    public final boolean m7132r(long j10) {
        return j10 < m7090D() || j10 < m7093G() + ((long) this.f6544b);
    }

    /* renamed from: r0 */
    public final Object m7133r0(C1780h<E> c1780h, int i10, long j10, Object obj) {
        C2538l0 c2538l0;
        C2538l0 c2538l02;
        C2538l0 c2538l03;
        Object m7217w = c1780h.m7217w(i10);
        if (m7217w == null) {
            if (j10 >= (f6535e.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    c2538l03 = C1775c.f6569n;
                    return c2538l03;
                }
                if (c1780h.m7212r(i10, m7217w, obj)) {
                    m7147z();
                    c2538l02 = C1775c.f6568m;
                    return c2538l02;
                }
            }
        } else if (m7217w == C1775c.f6559d) {
            c2538l0 = C1775c.f6564i;
            if (c1780h.m7212r(i10, m7217w, c2538l0)) {
                m7147z();
                return c1780h.m7219y(i10);
            }
        }
        return m7135s0(c1780h, i10, j10, obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0039, code lost:
    
        r0 = p116he.C2549r.m10157c(r0, r4);
        r9.m7218x(r3, true);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m7134s(ee.C1780h<E> r9, long r10) {
        /*
            r8 = this;
            r0 = 0
            r1 = 1
            java.lang.Object r0 = p116he.C2549r.m10156b(r0, r1, r0)
        L6:
            r2 = -1
            if (r9 == 0) goto L67
            int r3 = ee.C1775c.f6557b
            int r3 = r3 - r1
        Lc:
            if (r2 >= r3) goto L60
            long r4 = r9.f9971j
            int r6 = ee.C1775c.f6557b
            long r6 = (long) r6
            long r4 = r4 * r6
            long r6 = (long) r3
            long r4 = r4 + r6
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 < 0) goto L67
        L1a:
            java.lang.Object r4 = r9.m7217w(r3)
            if (r4 == 0) goto L50
            he.l0 r5 = ee.C1775c.m7174k()
            if (r4 != r5) goto L27
            goto L50
        L27:
            boolean r5 = r4 instanceof ee.C1787o
            if (r5 == 0) goto L41
            he.l0 r5 = ee.C1775c.m7189z()
            boolean r5 = r9.m7212r(r3, r4, r5)
            if (r5 == 0) goto L1a
            ee.o r4 = (ee.C1787o) r4
            ce.j3 r4 = r4.f6588a
        L39:
            java.lang.Object r0 = p116he.C2549r.m10157c(r0, r4)
            r9.m7218x(r3, r1)
            goto L5d
        L41:
            boolean r5 = r4 instanceof p038ce.InterfaceC1062j3
            if (r5 == 0) goto L5d
            he.l0 r5 = ee.C1775c.m7189z()
            boolean r5 = r9.m7212r(r3, r4, r5)
            if (r5 == 0) goto L1a
            goto L39
        L50:
            he.l0 r5 = ee.C1775c.m7189z()
            boolean r4 = r9.m7212r(r3, r4, r5)
            if (r4 == 0) goto L1a
            r9.m10085p()
        L5d:
            int r3 = r3 + (-1)
            goto Lc
        L60:
            he.f r9 = r9.m10072g()
            ee.h r9 = (ee.C1780h) r9
            goto L6
        L67:
            if (r0 == 0) goto L8d
            boolean r9 = r0 instanceof java.util.ArrayList
            if (r9 != 0) goto L73
            ce.j3 r0 = (p038ce.InterfaceC1062j3) r0
            r8.m7124j0(r0)
            goto L8d
        L73:
            java.lang.String r9 = "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }"
            td.C4753m.m18651d(r0, r9)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r9 = r0.size()
            int r9 = r9 - r1
        L7f:
            if (r2 >= r9) goto L8d
            java.lang.Object r10 = r0.get(r9)
            ce.j3 r10 = (p038ce.InterfaceC1062j3) r10
            r8.m7124j0(r10)
            int r9 = r9 + (-1)
            goto L7f
        L8d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ee.C1774b.m7134s(ee.h, long):void");
    }

    /* renamed from: s0 */
    public final Object m7135s0(C1780h<E> c1780h, int i10, long j10, Object obj) {
        C2538l0 c2538l0;
        C2538l0 c2538l02;
        C2538l0 c2538l03;
        C2538l0 c2538l04;
        C2538l0 c2538l05;
        C2538l0 c2538l06;
        C2538l0 c2538l07;
        C2538l0 c2538l08;
        C2538l0 c2538l09;
        C2538l0 c2538l010;
        C2538l0 c2538l011;
        C2538l0 c2538l012;
        C2538l0 c2538l013;
        C2538l0 c2538l014;
        C2538l0 c2538l015;
        C2538l0 c2538l016;
        while (true) {
            Object m7217w = c1780h.m7217w(i10);
            if (m7217w != null) {
                c2538l05 = C1775c.f6560e;
                if (m7217w != c2538l05) {
                    if (m7217w == C1775c.f6559d) {
                        c2538l06 = C1775c.f6564i;
                        if (c1780h.m7212r(i10, m7217w, c2538l06)) {
                            m7147z();
                            return c1780h.m7219y(i10);
                        }
                    } else {
                        c2538l07 = C1775c.f6565j;
                        if (m7217w == c2538l07) {
                            c2538l08 = C1775c.f6570o;
                            return c2538l08;
                        }
                        c2538l09 = C1775c.f6563h;
                        if (m7217w == c2538l09) {
                            c2538l010 = C1775c.f6570o;
                            return c2538l010;
                        }
                        if (m7217w == C1775c.m7189z()) {
                            m7147z();
                            c2538l011 = C1775c.f6570o;
                            return c2538l011;
                        }
                        c2538l012 = C1775c.f6562g;
                        if (m7217w != c2538l012) {
                            c2538l013 = C1775c.f6561f;
                            if (c1780h.m7212r(i10, m7217w, c2538l013)) {
                                boolean z10 = m7217w instanceof C1787o;
                                if (z10) {
                                    m7217w = ((C1787o) m7217w).f6588a;
                                }
                                if (m7129o0(m7217w, c1780h, i10)) {
                                    c2538l016 = C1775c.f6564i;
                                    c1780h.m7208A(i10, c2538l016);
                                    m7147z();
                                    return c1780h.m7219y(i10);
                                }
                                c2538l014 = C1775c.f6565j;
                                c1780h.m7208A(i10, c2538l014);
                                c1780h.m7218x(i10, false);
                                if (z10) {
                                    m7147z();
                                }
                                c2538l015 = C1775c.f6570o;
                                return c2538l015;
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            if (j10 < (f6535e.get(this) & 1152921504606846975L)) {
                c2538l0 = C1775c.f6563h;
                if (c1780h.m7212r(i10, m7217w, c2538l0)) {
                    m7147z();
                    c2538l02 = C1775c.f6570o;
                    return c2538l02;
                }
            } else {
                if (obj == null) {
                    c2538l03 = C1775c.f6569n;
                    return c2538l03;
                }
                if (c1780h.m7212r(i10, m7217w, obj)) {
                    m7147z();
                    c2538l04 = C1775c.f6568m;
                    return c2538l04;
                }
            }
        }
    }

    /* renamed from: t */
    public final C1780h<E> m7136t() {
        Object obj = f6541k.get(this);
        C1780h c1780h = (C1780h) f6539i.get(this);
        if (c1780h.f9971j > ((C1780h) obj).f9971j) {
            obj = c1780h;
        }
        C1780h c1780h2 = (C1780h) f6540j.get(this);
        if (c1780h2.f9971j > ((C1780h) obj).f9971j) {
            obj = c1780h2;
        }
        return (C1780h) C2523e.m10064b((AbstractC2525f) obj);
    }

    /* renamed from: t0 */
    public final int m7137t0(C1780h<E> c1780h, int i10, E e10, long j10, Object obj, boolean z10) {
        C2538l0 c2538l0;
        C2538l0 c2538l02;
        C2538l0 c2538l03;
        c1780h.m7209B(i10, e10);
        if (z10) {
            return m7139u0(c1780h, i10, e10, j10, obj, z10);
        }
        Object m7217w = c1780h.m7217w(i10);
        if (m7217w == null) {
            if (m7132r(j10)) {
                if (c1780h.m7212r(i10, null, C1775c.f6559d)) {
                    return 1;
                }
            } else {
                if (obj == null) {
                    return 3;
                }
                if (c1780h.m7212r(i10, null, obj)) {
                    return 2;
                }
            }
        } else if (m7217w instanceof InterfaceC1062j3) {
            c1780h.m7213s(i10);
            if (m7128n0(m7217w, e10)) {
                c2538l03 = C1775c.f6564i;
                c1780h.m7208A(i10, c2538l03);
                m7117c0();
                return 0;
            }
            c2538l0 = C1775c.f6566k;
            Object m7214t = c1780h.m7214t(i10, c2538l0);
            c2538l02 = C1775c.f6566k;
            if (m7214t != c2538l02) {
                c1780h.m7218x(i10, true);
            }
            return 5;
        }
        return m7139u0(c1780h, i10, e10, j10, obj, z10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x01d9, code lost:
    
        r3 = (ee.C1780h) r3.m10070e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01e0, code lost:
    
        if (r3 != null) goto L221;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 523
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ee.C1774b.toString():java.lang.String");
    }

    /* renamed from: u */
    public boolean m7138u(Throwable th, boolean z10) {
        C2538l0 c2538l0;
        if (z10) {
            m7108W();
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6542l;
        c2538l0 = C1775c.f6574s;
        boolean m4523a = C1080o.m4523a(atomicReferenceFieldUpdater, this, c2538l0, th);
        if (z10) {
            m7109X();
        } else {
            m7110Y();
        }
        m7144x();
        m7113a0();
        if (m4523a) {
            m7098M();
        }
        return m4523a;
    }

    /* renamed from: u0 */
    public final int m7139u0(C1780h<E> c1780h, int i10, E e10, long j10, Object obj, boolean z10) {
        C2538l0 c2538l0;
        C2538l0 c2538l02;
        C2538l0 c2538l03;
        C2538l0 c2538l04;
        C2538l0 c2538l05;
        C2538l0 c2538l06;
        C2538l0 c2538l07;
        while (true) {
            Object m7217w = c1780h.m7217w(i10);
            if (m7217w != null) {
                c2538l02 = C1775c.f6560e;
                if (m7217w != c2538l02) {
                    c2538l03 = C1775c.f6566k;
                    if (m7217w == c2538l03) {
                        c1780h.m7213s(i10);
                        return 5;
                    }
                    c2538l04 = C1775c.f6563h;
                    if (m7217w == c2538l04) {
                        c1780h.m7213s(i10);
                        return 5;
                    }
                    if (m7217w == C1775c.m7189z()) {
                        c1780h.m7213s(i10);
                        m7144x();
                        return 4;
                    }
                    if (C1101t0.m4573a()) {
                        if (!((m7217w instanceof InterfaceC1062j3) || (m7217w instanceof C1787o))) {
                            throw new AssertionError();
                        }
                    }
                    c1780h.m7213s(i10);
                    if (m7217w instanceof C1787o) {
                        m7217w = ((C1787o) m7217w).f6588a;
                    }
                    if (m7128n0(m7217w, e10)) {
                        c2538l07 = C1775c.f6564i;
                        c1780h.m7208A(i10, c2538l07);
                        m7117c0();
                        return 0;
                    }
                    c2538l05 = C1775c.f6566k;
                    Object m7214t = c1780h.m7214t(i10, c2538l05);
                    c2538l06 = C1775c.f6566k;
                    if (m7214t != c2538l06) {
                        c1780h.m7218x(i10, true);
                    }
                    return 5;
                }
                if (c1780h.m7212r(i10, m7217w, C1775c.f6559d)) {
                    return 1;
                }
            } else if (!m7132r(j10) || z10) {
                if (z10) {
                    c2538l0 = C1775c.f6565j;
                    if (c1780h.m7212r(i10, null, c2538l0)) {
                        c1780h.m7218x(i10, false);
                        return 4;
                    }
                } else {
                    if (obj == null) {
                        return 3;
                    }
                    if (c1780h.m7212r(i10, null, obj)) {
                        return 2;
                    }
                }
            } else if (c1780h.m7212r(i10, null, C1775c.f6559d)) {
                return 1;
            }
        }
    }

    /* renamed from: v */
    public final void m7140v(long j10) {
        m7123i0(m7142w(j10));
    }

    /* renamed from: v0 */
    public final void m7141v0(long j10) {
        long j11;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f6536f;
        do {
            j11 = atomicLongFieldUpdater.get(this);
            if (j11 >= j10) {
                return;
            }
        } while (!f6536f.compareAndSet(this, j11, j10));
    }

    /* renamed from: w */
    public final C1780h<E> m7142w(long j10) {
        C1780h<E> m7136t = m7136t();
        if (mo7105T()) {
            long m7107V = m7107V(m7136t);
            if (m7107V != -1) {
                m7146y(m7107V);
            }
        }
        m7134s(m7136t, j10);
        return m7136t;
    }

    /* renamed from: w0 */
    public final void m7143w0(long j10) {
        long j11;
        long m7186w;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f6535e;
        do {
            j11 = atomicLongFieldUpdater.get(this);
            long j12 = 1152921504606846975L & j11;
            if (j12 >= j10) {
                return;
            } else {
                m7186w = C1775c.m7186w(j12, (int) (j11 >> 60));
            }
        } while (!f6535e.compareAndSet(this, j11, m7186w));
    }

    /* renamed from: x */
    public final void m7144x() {
        m7103R();
    }

    /* renamed from: x0 */
    public final void m7145x0(long j10) {
        int i10;
        long j11;
        long m7185v;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long m7185v2;
        long j12;
        long m7185v3;
        if (m7106U()) {
            return;
        }
        do {
        } while (m7090D() <= j10);
        i10 = C1775c.f6558c;
        for (int i11 = 0; i11 < i10; i11++) {
            long m7090D = m7090D();
            if (m7090D == (4611686018427387903L & f6538h.get(this)) && m7090D == m7090D()) {
                return;
            }
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f6538h;
        do {
            j11 = atomicLongFieldUpdater2.get(this);
            m7185v = C1775c.m7185v(j11 & 4611686018427387903L, true);
        } while (!atomicLongFieldUpdater2.compareAndSet(this, j11, m7185v));
        while (true) {
            long m7090D2 = m7090D();
            atomicLongFieldUpdater = f6538h;
            long j13 = atomicLongFieldUpdater.get(this);
            long j14 = j13 & 4611686018427387903L;
            boolean z10 = (4611686018427387904L & j13) != 0;
            if (m7090D2 == j14 && m7090D2 == m7090D()) {
                break;
            } else if (!z10) {
                m7185v2 = C1775c.m7185v(j14, true);
                atomicLongFieldUpdater.compareAndSet(this, j13, m7185v2);
            }
        }
        do {
            j12 = atomicLongFieldUpdater.get(this);
            m7185v3 = C1775c.m7185v(j12 & 4611686018427387903L, false);
        } while (!atomicLongFieldUpdater.compareAndSet(this, j12, m7185v3));
    }

    /* renamed from: y */
    public final void m7146y(long j10) {
        C2538l0 c2538l0;
        C2556u0 m10061d;
        if (C1101t0.m4573a() && !mo7105T()) {
            throw new AssertionError();
        }
        C1780h<E> c1780h = (C1780h) f6540j.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f6536f;
            long j11 = atomicLongFieldUpdater.get(this);
            if (j10 < Math.max(this.f6544b + j11, m7090D())) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j11, j11 + 1)) {
                int i10 = C1775c.f6557b;
                long j12 = j11 / i10;
                int i11 = (int) (j11 % i10);
                if (c1780h.f9971j != j12) {
                    C1780h<E> m7088B = m7088B(j12, c1780h);
                    if (m7088B == null) {
                        continue;
                    } else {
                        c1780h = m7088B;
                    }
                }
                Object m7133r0 = m7133r0(c1780h, i11, j11, null);
                c2538l0 = C1775c.f6570o;
                if (m7133r0 != c2538l0) {
                    c1780h.m10067b();
                    InterfaceC4580l<E, C2245s> interfaceC4580l = this.f6545c;
                    if (interfaceC4580l != null && (m10061d = C2522d0.m10061d(interfaceC4580l, m7133r0, null, 2, null)) != null) {
                        throw m10061d;
                    }
                } else if (j11 < m7095I()) {
                    c1780h.m10067b();
                }
            }
        }
    }

    /* renamed from: z */
    public final void m7147z() {
        if (m7106U()) {
            return;
        }
        C1780h<E> c1780h = (C1780h) f6541k.get(this);
        while (true) {
            long andIncrement = f6537g.getAndIncrement(this);
            int i10 = C1775c.f6557b;
            long j10 = andIncrement / i10;
            long m7095I = m7095I();
            long j11 = c1780h.f9971j;
            if (m7095I <= andIncrement) {
                if (j11 < j10 && c1780h.m10070e() != 0) {
                    m7111Z(j10, c1780h);
                }
                m7072L(this, 0L, 1, null);
                return;
            }
            if (j11 != j10) {
                C1780h<E> m7087A = m7087A(j10, c1780h, andIncrement);
                if (m7087A == null) {
                    continue;
                } else {
                    c1780h = m7087A;
                }
            }
            boolean m7130p0 = m7130p0(c1780h, (int) (andIncrement % i10), andIncrement);
            m7072L(this, 0L, 1, null);
            if (m7130p0) {
                return;
            }
        }
    }
}
