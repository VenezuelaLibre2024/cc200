package p038ce;

import gd.C2229c;
import gd.C2245s;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p038ce.InterfaceC1026c2;
import p116he.AbstractC2532i0;
import p116he.C2536k0;
import p116he.C2537l;
import p116he.C2538l0;
import p146jd.InterfaceC3281d;
import p146jd.InterfaceC3284g;
import p161kd.C3385c;
import p173ld.InterfaceC3471e;
import sd.InterfaceC4580l;
import td.C4753m;

/* renamed from: ce.p */
/* loaded from: classes2.dex */
public class C1084p<T> extends AbstractC1030d1<T> implements InterfaceC1076n<T>, InterfaceC3471e, InterfaceC1062j3 {

    /* renamed from: m */
    public static final AtomicIntegerFieldUpdater f4067m = AtomicIntegerFieldUpdater.newUpdater(C1084p.class, "_decisionAndIndex");

    /* renamed from: n */
    public static final AtomicReferenceFieldUpdater f4068n = AtomicReferenceFieldUpdater.newUpdater(C1084p.class, Object.class, "_state");

    /* renamed from: o */
    public static final AtomicReferenceFieldUpdater f4069o = AtomicReferenceFieldUpdater.newUpdater(C1084p.class, Object.class, "_parentHandle");
    private volatile int _decisionAndIndex;
    private volatile Object _parentHandle;
    private volatile Object _state;

    /* renamed from: k */
    public final InterfaceC3281d<T> f4070k;

    /* renamed from: l */
    public final InterfaceC3284g f4071l;

    /* JADX WARN: Multi-variable type inference failed */
    public C1084p(InterfaceC3281d<? super T> interfaceC3281d, int i10) {
        super(i10);
        this.f4070k = interfaceC3281d;
        if (C1101t0.m4573a()) {
            if (!(i10 != -1)) {
                throw new AssertionError();
            }
        }
        this.f4071l = interfaceC3281d.getContext();
        this._decisionAndIndex = 536870911;
        this._state = C1028d.f3981h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: M */
    public static /* synthetic */ void m4528M(C1084p c1084p, Object obj, int i10, InterfaceC4580l interfaceC4580l, int i11, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
        }
        if ((i11 & 4) != 0) {
            interfaceC4580l = null;
        }
        c1084p.m4539L(obj, i10, interfaceC4580l);
    }

    /* renamed from: A */
    public final String m4529A() {
        Object m4554z = m4554z();
        return m4554z instanceof InterfaceC1091q2 ? "Active" : m4554z instanceof C1096s ? "Cancelled" : "Completed";
    }

    /* renamed from: B */
    public void m4530B() {
        InterfaceC1055i1 m4531C = m4531C();
        if (m4531C != null && mo4491k()) {
            m4531C.dispose();
            f4069o.set(this, C1087p2.f4072h);
        }
    }

    /* renamed from: C */
    public final InterfaceC1055i1 m4531C() {
        InterfaceC1026c2 interfaceC1026c2 = (InterfaceC1026c2) getContext().mo4368d(InterfaceC1026c2.f3979c);
        if (interfaceC1026c2 == null) {
            return null;
        }
        InterfaceC1055i1 m4283d = InterfaceC1026c2.a.m4283d(interfaceC1026c2, true, false, new C1100t(this), 2, null);
        C1080o.m4523a(f4069o, this, null, m4283d);
        return m4283d;
    }

    /* renamed from: D */
    public final void m4532D(Object obj) {
        if (C1101t0.m4573a()) {
            if (!((obj instanceof AbstractC1068l) || (obj instanceof AbstractC2532i0))) {
                throw new AssertionError();
            }
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4068n;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof C1028d)) {
                if (obj2 instanceof AbstractC1068l ? true : obj2 instanceof AbstractC2532i0) {
                    m4535G(obj, obj2);
                } else {
                    boolean z10 = obj2 instanceof C1024c0;
                    if (z10) {
                        C1024c0 c1024c0 = (C1024c0) obj2;
                        if (!c1024c0.m4268b()) {
                            m4535G(obj, obj2);
                        }
                        if (obj2 instanceof C1096s) {
                            if (!z10) {
                                c1024c0 = null;
                            }
                            Throwable th = c1024c0 != null ? c1024c0.f3977a : null;
                            if (obj instanceof AbstractC1068l) {
                                m4545p((AbstractC1068l) obj, th);
                                return;
                            } else {
                                C4753m.m18651d(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                                m4547r((AbstractC2532i0) obj, th);
                                return;
                            }
                        }
                        return;
                    }
                    if (obj2 instanceof C1019b0) {
                        C1019b0 c1019b0 = (C1019b0) obj2;
                        if (c1019b0.f3967b != null) {
                            m4535G(obj, obj2);
                        }
                        if (obj instanceof AbstractC2532i0) {
                            return;
                        }
                        C4753m.m18651d(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                        AbstractC1068l abstractC1068l = (AbstractC1068l) obj;
                        if (c1019b0.m4263c()) {
                            m4545p(abstractC1068l, c1019b0.f3970e);
                            return;
                        } else {
                            if (C1080o.m4523a(f4068n, this, obj2, C1019b0.m4261b(c1019b0, null, abstractC1068l, null, null, null, 29, null))) {
                                return;
                            }
                        }
                    } else {
                        if (obj instanceof AbstractC2532i0) {
                            return;
                        }
                        C4753m.m18651d(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                        if (C1080o.m4523a(f4068n, this, obj2, new C1019b0(obj2, (AbstractC1068l) obj, null, null, null, 28, null))) {
                            return;
                        }
                    }
                }
            } else if (C1080o.m4523a(f4068n, this, obj2, obj)) {
                return;
            }
        }
    }

    /* renamed from: E */
    public final boolean m4533E() {
        if (C1035e1.m4309c(this.f3984j)) {
            InterfaceC3281d<T> interfaceC3281d = this.f4070k;
            C4753m.m18651d(interfaceC3281d, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            if (((C2537l) interfaceC3281d).m10105r()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: F */
    public final AbstractC1068l m4534F(InterfaceC4580l<? super Throwable, C2245s> interfaceC4580l) {
        return interfaceC4580l instanceof AbstractC1068l ? (AbstractC1068l) interfaceC4580l : new C1126z1(interfaceC4580l);
    }

    /* renamed from: G */
    public final void m4535G(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    /* renamed from: H */
    public String mo4437H() {
        return "CancellableContinuation";
    }

    /* renamed from: I */
    public final void m4536I(Throwable th) {
        if (m4548s(th)) {
            return;
        }
        mo4490h(th);
        m4550u();
    }

    /* renamed from: J */
    public final void m4537J() {
        Throwable m10108u;
        InterfaceC3281d<T> interfaceC3281d = this.f4070k;
        C2537l c2537l = interfaceC3281d instanceof C2537l ? (C2537l) interfaceC3281d : null;
        if (c2537l == null || (m10108u = c2537l.m10108u(this)) == null) {
            return;
        }
        m4549t();
        mo4490h(m10108u);
    }

    /* renamed from: K */
    public final boolean m4538K() {
        if (C1101t0.m4573a()) {
            if (!(this.f3984j == 2)) {
                throw new AssertionError();
            }
        }
        if (C1101t0.m4573a()) {
            if (!(m4552x() != C1087p2.f4072h)) {
                throw new AssertionError();
            }
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4068n;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (C1101t0.m4573a() && !(!(obj instanceof InterfaceC1091q2))) {
            throw new AssertionError();
        }
        if ((obj instanceof C1019b0) && ((C1019b0) obj).f3969d != null) {
            m4549t();
            return false;
        }
        f4067m.set(this, 536870911);
        atomicReferenceFieldUpdater.set(this, C1028d.f3981h);
        return true;
    }

    /* renamed from: L */
    public final void m4539L(Object obj, int i10, InterfaceC4580l<? super Throwable, C2245s> interfaceC4580l) {
        Object obj2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4068n;
        do {
            obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof InterfaceC1091q2)) {
                if (obj2 instanceof C1096s) {
                    C1096s c1096s = (C1096s) obj2;
                    if (c1096s.m4571c()) {
                        if (interfaceC4580l != null) {
                            m4546q(interfaceC4580l, c1096s.f3977a);
                            return;
                        }
                        return;
                    }
                }
                m4544o(obj);
                throw new C2229c();
            }
        } while (!C1080o.m4523a(f4068n, this, obj2, m4540N((InterfaceC1091q2) obj2, obj, i10, interfaceC4580l, null)));
        m4550u();
        m4551v(i10);
    }

    /* renamed from: N */
    public final Object m4540N(InterfaceC1091q2 interfaceC1091q2, Object obj, int i10, InterfaceC4580l<? super Throwable, C2245s> interfaceC4580l, Object obj2) {
        if (obj instanceof C1024c0) {
            if (C1101t0.m4573a()) {
                if (!(obj2 == null)) {
                    throw new AssertionError();
                }
            }
            if (!C1101t0.m4573a()) {
                return obj;
            }
            if (interfaceC4580l == null) {
                return obj;
            }
            throw new AssertionError();
        }
        if (!C1035e1.m4308b(i10) && obj2 == null) {
            return obj;
        }
        if (interfaceC4580l == null && !(interfaceC1091q2 instanceof AbstractC1068l) && obj2 == null) {
            return obj;
        }
        return new C1019b0(obj, interfaceC1091q2 instanceof AbstractC1068l ? (AbstractC1068l) interfaceC1091q2 : null, interfaceC4580l, obj2, null, 16, null);
    }

    /* renamed from: O */
    public final boolean m4541O() {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f4067m;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = i10 >> 29;
            if (i11 != 0) {
                if (i11 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f4067m.compareAndSet(this, i10, 1073741824 + (536870911 & i10)));
        return true;
    }

    /* renamed from: P */
    public final C2538l0 m4542P(Object obj, Object obj2, InterfaceC4580l<? super Throwable, C2245s> interfaceC4580l) {
        Object obj3;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4068n;
        do {
            obj3 = atomicReferenceFieldUpdater.get(this);
            if (!(obj3 instanceof InterfaceC1091q2)) {
                if (!(obj3 instanceof C1019b0) || obj2 == null) {
                    return null;
                }
                C1019b0 c1019b0 = (C1019b0) obj3;
                if (c1019b0.f3969d != obj2) {
                    return null;
                }
                if (!C1101t0.m4573a() || C4753m.m18648a(c1019b0.f3966a, obj)) {
                    return C1088q.f4073a;
                }
                throw new AssertionError();
            }
        } while (!C1080o.m4523a(f4068n, this, obj3, m4540N((InterfaceC1091q2) obj3, obj, this.f3984j, interfaceC4580l, obj2)));
        m4550u();
        return C1088q.f4073a;
    }

    /* renamed from: Q */
    public final boolean m4543Q() {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f4067m;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = i10 >> 29;
            if (i11 != 0) {
                if (i11 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!f4067m.compareAndSet(this, i10, 536870912 + (536870911 & i10)));
        return true;
    }

    @Override // p038ce.AbstractC1030d1
    /* renamed from: a */
    public void mo4289a(Object obj, Throwable th) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4068n;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof InterfaceC1091q2) {
                throw new IllegalStateException("Not completed".toString());
            }
            if (obj2 instanceof C1024c0) {
                return;
            }
            if (obj2 instanceof C1019b0) {
                C1019b0 c1019b0 = (C1019b0) obj2;
                if (!(!c1019b0.m4263c())) {
                    throw new IllegalStateException("Must be called at most once".toString());
                }
                if (C1080o.m4523a(f4068n, this, obj2, C1019b0.m4261b(c1019b0, null, null, null, null, th, 15, null))) {
                    c1019b0.m4264d(this, th);
                    return;
                }
            } else if (C1080o.m4523a(f4068n, this, obj2, new C1019b0(obj2, null, null, null, th, 14, null))) {
                return;
            }
        }
    }

    @Override // p038ce.AbstractC1030d1
    /* renamed from: b */
    public final InterfaceC3281d<T> mo4290b() {
        return this.f4070k;
    }

    @Override // p038ce.InterfaceC1076n
    /* renamed from: c */
    public void mo4486c(InterfaceC4580l<? super Throwable, C2245s> interfaceC4580l) {
        m4532D(m4534F(interfaceC4580l));
    }

    @Override // p038ce.AbstractC1030d1
    /* renamed from: d */
    public Throwable mo4291d(Object obj) {
        Throwable m10098i;
        Throwable mo4291d = super.mo4291d(obj);
        if (mo4291d == null) {
            return null;
        }
        InterfaceC3281d<T> interfaceC3281d = this.f4070k;
        if (!C1101t0.m4576d() || !(interfaceC3281d instanceof InterfaceC3471e)) {
            return mo4291d;
        }
        m10098i = C2536k0.m10098i(mo4291d, (InterfaceC3471e) interfaceC3281d);
        return m10098i;
    }

    @Override // p038ce.InterfaceC1076n
    /* renamed from: e */
    public Object mo4487e(T t10, Object obj, InterfaceC4580l<? super Throwable, C2245s> interfaceC4580l) {
        return m4542P(t10, obj, interfaceC4580l);
    }

    @Override // p038ce.InterfaceC1076n
    /* renamed from: f */
    public Object mo4488f(Throwable th) {
        return m4542P(new C1024c0(th, false, 2, null), null, null);
    }

    @Override // p038ce.InterfaceC1076n
    /* renamed from: g */
    public void mo4489g(T t10, InterfaceC4580l<? super Throwable, C2245s> interfaceC4580l) {
        m4539L(t10, this.f3984j, interfaceC4580l);
    }

    @Override // p173ld.InterfaceC3471e
    public InterfaceC3471e getCallerFrame() {
        InterfaceC3281d<T> interfaceC3281d = this.f4070k;
        if (interfaceC3281d instanceof InterfaceC3471e) {
            return (InterfaceC3471e) interfaceC3281d;
        }
        return null;
    }

    @Override // p146jd.InterfaceC3281d
    public InterfaceC3284g getContext() {
        return this.f4071l;
    }

    @Override // p173ld.InterfaceC3471e
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // p038ce.InterfaceC1076n
    /* renamed from: h */
    public boolean mo4490h(Throwable th) {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4068n;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof InterfaceC1091q2)) {
                return false;
            }
        } while (!C1080o.m4523a(f4068n, this, obj, new C1096s(this, th, (obj instanceof AbstractC1068l) || (obj instanceof AbstractC2532i0))));
        InterfaceC1091q2 interfaceC1091q2 = (InterfaceC1091q2) obj;
        if (interfaceC1091q2 instanceof AbstractC1068l) {
            m4545p((AbstractC1068l) obj, th);
        } else if (interfaceC1091q2 instanceof AbstractC2532i0) {
            m4547r((AbstractC2532i0) obj, th);
        }
        m4550u();
        m4551v(this.f3984j);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p038ce.AbstractC1030d1
    /* renamed from: i */
    public <T> T mo4292i(Object obj) {
        return obj instanceof C1019b0 ? (T) ((C1019b0) obj).f3966a : obj;
    }

    @Override // p038ce.InterfaceC1062j3
    /* renamed from: j */
    public void mo4453j(AbstractC2532i0<?> abstractC2532i0, int i10) {
        int i11;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f4067m;
        do {
            i11 = atomicIntegerFieldUpdater.get(this);
            if (!((i11 & 536870911) == 536870911)) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once".toString());
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i11, ((i11 >> 29) << 29) + i10));
        m4532D(abstractC2532i0);
    }

    @Override // p038ce.InterfaceC1076n
    /* renamed from: k */
    public boolean mo4491k() {
        return !(m4554z() instanceof InterfaceC1091q2);
    }

    @Override // p038ce.InterfaceC1076n
    /* renamed from: m */
    public void mo4492m(Object obj) {
        if (C1101t0.m4573a()) {
            if (!(obj == C1088q.f4073a)) {
                throw new AssertionError();
            }
        }
        m4551v(this.f3984j);
    }

    @Override // p038ce.AbstractC1030d1
    /* renamed from: n */
    public Object mo4294n() {
        return m4554z();
    }

    /* renamed from: o */
    public final Void m4544o(Object obj) {
        throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
    }

    /* renamed from: p */
    public final void m4545p(AbstractC1068l abstractC1068l, Throwable th) {
        try {
            abstractC1068l.mo4305e(th);
        } catch (Throwable th2) {
            C1073m0.m4472a(getContext(), new C1039f0("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    /* renamed from: q */
    public final void m4546q(InterfaceC4580l<? super Throwable, C2245s> interfaceC4580l, Throwable th) {
        try {
            interfaceC4580l.invoke(th);
        } catch (Throwable th2) {
            C1073m0.m4472a(getContext(), new C1039f0("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    /* renamed from: r */
    public final void m4547r(AbstractC2532i0<?> abstractC2532i0, Throwable th) {
        int i10 = f4067m.get(this) & 536870911;
        if (!(i10 != 536870911)) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken".toString());
        }
        try {
            abstractC2532i0.mo7211o(i10, th, getContext());
        } catch (Throwable th2) {
            C1073m0.m4472a(getContext(), new C1039f0("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    @Override // p146jd.InterfaceC3281d
    public void resumeWith(Object obj) {
        m4528M(this, C1044g0.m4323b(obj, this), this.f3984j, null, 4, null);
    }

    /* renamed from: s */
    public final boolean m4548s(Throwable th) {
        if (!m4533E()) {
            return false;
        }
        InterfaceC3281d<T> interfaceC3281d = this.f4070k;
        C4753m.m18651d(interfaceC3281d, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return ((C2537l) interfaceC3281d).m10106s(th);
    }

    /* renamed from: t */
    public final void m4549t() {
        InterfaceC1055i1 m4552x = m4552x();
        if (m4552x == null) {
            return;
        }
        m4552x.dispose();
        f4069o.set(this, C1087p2.f4072h);
    }

    public String toString() {
        return mo4437H() + '(' + C1105u0.m4582c(this.f4070k) + "){" + m4529A() + "}@" + C1105u0.m4581b(this);
    }

    /* renamed from: u */
    public final void m4550u() {
        if (m4533E()) {
            return;
        }
        m4549t();
    }

    /* renamed from: v */
    public final void m4551v(int i10) {
        if (m4541O()) {
            return;
        }
        C1035e1.m4307a(this, i10);
    }

    /* renamed from: w */
    public Throwable mo4438w(InterfaceC1026c2 interfaceC1026c2) {
        return interfaceC1026c2.mo4273K();
    }

    /* renamed from: x */
    public final InterfaceC1055i1 m4552x() {
        return (InterfaceC1055i1) f4069o.get(this);
    }

    /* renamed from: y */
    public final Object m4553y() {
        InterfaceC1026c2 interfaceC1026c2;
        Throwable m10098i;
        Throwable m10098i2;
        boolean m4533E = m4533E();
        if (m4543Q()) {
            if (m4552x() == null) {
                m4531C();
            }
            if (m4533E) {
                m4537J();
            }
            return C3385c.m12581c();
        }
        if (m4533E) {
            m4537J();
        }
        Object m4554z = m4554z();
        if (m4554z instanceof C1024c0) {
            Throwable th = ((C1024c0) m4554z).f3977a;
            if (!C1101t0.m4576d()) {
                throw th;
            }
            m10098i2 = C2536k0.m10098i(th, this);
            throw m10098i2;
        }
        if (!C1035e1.m4308b(this.f3984j) || (interfaceC1026c2 = (InterfaceC1026c2) getContext().mo4368d(InterfaceC1026c2.f3979c)) == null || interfaceC1026c2.mo4255a()) {
            return mo4292i(m4554z);
        }
        CancellationException mo4273K = interfaceC1026c2.mo4273K();
        mo4289a(m4554z, mo4273K);
        if (!C1101t0.m4576d()) {
            throw mo4273K;
        }
        m10098i = C2536k0.m10098i(mo4273K, this);
        throw m10098i;
    }

    /* renamed from: z */
    public final Object m4554z() {
        return f4068n.get(this);
    }
}
