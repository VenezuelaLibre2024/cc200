package p038ce;

import gd.C2227a;
import gd.C2245s;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p038ce.InterfaceC1026c2;
import p116he.AbstractC2524e0;
import p116he.C2536k0;
import p116he.C2538l0;
import p116he.C2557v;
import p116he.C2559w;
import p146jd.InterfaceC3281d;
import p146jd.InterfaceC3284g;
import p161kd.C3384b;
import p161kd.C3385c;
import p173ld.AbstractC3477k;
import p173ld.C3474h;
import p173ld.InterfaceC3471e;
import p173ld.InterfaceC3472f;
import p373zd.AbstractC6126d;
import p373zd.C6127e;
import p373zd.InterfaceC6124b;
import sd.InterfaceC4580l;
import sd.InterfaceC4584p;
import td.C4753m;
import td.C4763w;

/* renamed from: ce.j2 */
/* loaded from: classes2.dex */
public class C1061j2 implements InterfaceC1026c2, InterfaceC1112w, InterfaceC1095r2 {

    /* renamed from: h */
    public static final AtomicReferenceFieldUpdater f4018h = AtomicReferenceFieldUpdater.newUpdater(C1061j2.class, Object.class, "_state");

    /* renamed from: i */
    public static final AtomicReferenceFieldUpdater f4019i = AtomicReferenceFieldUpdater.newUpdater(C1061j2.class, Object.class, "_parentHandle");
    private volatile Object _parentHandle;
    private volatile Object _state;

    /* renamed from: ce.j2$a */
    /* loaded from: classes2.dex */
    public static final class a<T> extends C1084p<T> {

        /* renamed from: p */
        public final C1061j2 f4020p;

        public a(InterfaceC3281d<? super T> interfaceC3281d, C1061j2 c1061j2) {
            super(interfaceC3281d, 1);
            this.f4020p = c1061j2;
        }

        @Override // p038ce.C1084p
        /* renamed from: H */
        public String mo4437H() {
            return "AwaitContinuation";
        }

        @Override // p038ce.C1084p
        /* renamed from: w */
        public Throwable mo4438w(InterfaceC1026c2 interfaceC1026c2) {
            Throwable m4442f;
            Object m4412T = this.f4020p.m4412T();
            return (!(m4412T instanceof c) || (m4442f = ((c) m4412T).m4442f()) == null) ? m4412T instanceof C1024c0 ? ((C1024c0) m4412T).f3977a : interfaceC1026c2.mo4273K() : m4442f;
        }
    }

    /* renamed from: ce.j2$b */
    /* loaded from: classes2.dex */
    public static final class b extends AbstractC1056i2 {

        /* renamed from: l */
        public final C1061j2 f4021l;

        /* renamed from: m */
        public final c f4022m;

        /* renamed from: n */
        public final C1108v f4023n;

        /* renamed from: o */
        public final Object f4024o;

        public b(C1061j2 c1061j2, c cVar, C1108v c1108v, Object obj) {
            this.f4021l = c1061j2;
            this.f4022m = cVar;
            this.f4023n = c1108v;
            this.f4024o = obj;
        }

        @Override // sd.InterfaceC4580l
        public /* bridge */ /* synthetic */ C2245s invoke(Throwable th) {
            mo4259u(th);
            return C2245s.f8873a;
        }

        @Override // p038ce.AbstractC1034e0
        /* renamed from: u */
        public void mo4259u(Throwable th) {
            this.f4021l.m4394F(this.f4022m, this.f4023n, this.f4024o);
        }
    }

    /* renamed from: ce.j2$c */
    /* loaded from: classes2.dex */
    public static final class c implements InterfaceC1118x1 {

        /* renamed from: i */
        public static final AtomicIntegerFieldUpdater f4025i = AtomicIntegerFieldUpdater.newUpdater(c.class, "_isCompleting");

        /* renamed from: j */
        public static final AtomicReferenceFieldUpdater f4026j = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_rootCause");

        /* renamed from: k */
        public static final AtomicReferenceFieldUpdater f4027k = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_exceptionsHolder");
        private volatile Object _exceptionsHolder;
        private volatile int _isCompleting;
        private volatile Object _rootCause;

        /* renamed from: h */
        public final C1083o2 f4028h;

        public c(C1083o2 c1083o2, boolean z10, Throwable th) {
            this.f4028h = c1083o2;
            this._isCompleting = z10 ? 1 : 0;
            this._rootCause = th;
        }

        @Override // p038ce.InterfaceC1118x1
        /* renamed from: a */
        public boolean mo4363a() {
            return m4442f() == null;
        }

        /* renamed from: b */
        public final void m4439b(Throwable th) {
            Throwable m4442f = m4442f();
            if (m4442f == null) {
                m4449m(th);
                return;
            }
            if (th == m4442f) {
                return;
            }
            Object m4441d = m4441d();
            if (m4441d == null) {
                m4448l(th);
                return;
            }
            if (m4441d instanceof Throwable) {
                if (th == m4441d) {
                    return;
                }
                ArrayList<Throwable> m4440c = m4440c();
                m4440c.add(m4441d);
                m4440c.add(th);
                m4448l(m4440c);
                return;
            }
            if (m4441d instanceof ArrayList) {
                ((ArrayList) m4441d).add(th);
                return;
            }
            throw new IllegalStateException(("State is " + m4441d).toString());
        }

        /* renamed from: c */
        public final ArrayList<Throwable> m4440c() {
            return new ArrayList<>(4);
        }

        /* renamed from: d */
        public final Object m4441d() {
            return f4027k.get(this);
        }

        @Override // p038ce.InterfaceC1118x1
        /* renamed from: e */
        public C1083o2 mo4364e() {
            return this.f4028h;
        }

        /* renamed from: f */
        public final Throwable m4442f() {
            return (Throwable) f4026j.get(this);
        }

        /* renamed from: g */
        public final boolean m4443g() {
            return m4442f() != null;
        }

        /* renamed from: h */
        public final boolean m4444h() {
            return f4025i.get(this) != 0;
        }

        /* renamed from: i */
        public final boolean m4445i() {
            C2538l0 c2538l0;
            Object m4441d = m4441d();
            c2538l0 = C1066k2.f4043e;
            return m4441d == c2538l0;
        }

        /* renamed from: j */
        public final List<Throwable> m4446j(Throwable th) {
            ArrayList<Throwable> arrayList;
            C2538l0 c2538l0;
            Object m4441d = m4441d();
            if (m4441d == null) {
                arrayList = m4440c();
            } else if (m4441d instanceof Throwable) {
                ArrayList<Throwable> m4440c = m4440c();
                m4440c.add(m4441d);
                arrayList = m4440c;
            } else {
                if (!(m4441d instanceof ArrayList)) {
                    throw new IllegalStateException(("State is " + m4441d).toString());
                }
                arrayList = (ArrayList) m4441d;
            }
            Throwable m4442f = m4442f();
            if (m4442f != null) {
                arrayList.add(0, m4442f);
            }
            if (th != null && !C4753m.m18648a(th, m4442f)) {
                arrayList.add(th);
            }
            c2538l0 = C1066k2.f4043e;
            m4448l(c2538l0);
            return arrayList;
        }

        /* renamed from: k */
        public final void m4447k(boolean z10) {
            f4025i.set(this, z10 ? 1 : 0);
        }

        /* renamed from: l */
        public final void m4448l(Object obj) {
            f4027k.set(this, obj);
        }

        /* renamed from: m */
        public final void m4449m(Throwable th) {
            f4026j.set(this, th);
        }

        public String toString() {
            return "Finishing[cancelling=" + m4443g() + ", completing=" + m4444h() + ", rootCause=" + m4442f() + ", exceptions=" + m4441d() + ", list=" + mo4364e() + ']';
        }
    }

    /* renamed from: ce.j2$d */
    /* loaded from: classes2.dex */
    public static final class d extends C2559w.a {

        /* renamed from: d */
        public final /* synthetic */ C1061j2 f4029d;

        /* renamed from: e */
        public final /* synthetic */ Object f4030e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C2559w c2559w, C1061j2 c1061j2, Object obj) {
            super(c2559w);
            this.f4029d = c1061j2;
            this.f4030e = obj;
        }

        @Override // p116he.AbstractC2517b
        /* renamed from: f */
        public Object mo4450d(C2559w c2559w) {
            if (this.f4029d.m4412T() == this.f4030e) {
                return null;
            }
            return C2557v.m10179a();
        }
    }

    @InterfaceC3472f(m12916c = "kotlinx.coroutines.JobSupport$children$1", m12917f = "JobSupport.kt", m12918l = {956, 958}, m12919m = "invokeSuspend")
    /* renamed from: ce.j2$e */
    /* loaded from: classes2.dex */
    public static final class e extends AbstractC3477k implements InterfaceC4584p<AbstractC6126d<? super InterfaceC1026c2>, InterfaceC3281d<? super C2245s>, Object> {

        /* renamed from: i */
        public Object f4031i;

        /* renamed from: j */
        public Object f4032j;

        /* renamed from: k */
        public int f4033k;

        /* renamed from: l */
        public /* synthetic */ Object f4034l;

        public e(InterfaceC3281d<? super e> interfaceC3281d) {
            super(2, interfaceC3281d);
        }

        @Override // sd.InterfaceC4584p
        /* renamed from: a */
        public final Object invoke(AbstractC6126d<? super InterfaceC1026c2> abstractC6126d, InterfaceC3281d<? super C2245s> interfaceC3281d) {
            return ((e) create(abstractC6126d, interfaceC3281d)).invokeSuspend(C2245s.f8873a);
        }

        @Override // p173ld.AbstractC3467a
        public final InterfaceC3281d<C2245s> create(Object obj, InterfaceC3281d<?> interfaceC3281d) {
            e eVar = new e(interfaceC3281d);
            eVar.f4034l = obj;
            return eVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x006b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x006d -> B:6:0x0083). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0080 -> B:6:0x0083). Please report as a decompilation issue!!! */
        @Override // p173ld.AbstractC3467a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = p161kd.C3385c.m12581c()
                int r1 = r7.f4033k
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2b
                if (r1 == r3) goto L27
                if (r1 != r2) goto L1f
                java.lang.Object r1 = r7.f4032j
                he.w r1 = (p116he.C2559w) r1
                java.lang.Object r3 = r7.f4031i
                he.u r3 = (p116he.C2555u) r3
                java.lang.Object r4 = r7.f4034l
                zd.d r4 = (p373zd.AbstractC6126d) r4
                gd.C2238l.m8975b(r8)
                r8 = r7
                goto L83
            L1f:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L27:
                gd.C2238l.m8975b(r8)
                goto L88
            L2b:
                gd.C2238l.m8975b(r8)
                java.lang.Object r8 = r7.f4034l
                zd.d r8 = (p373zd.AbstractC6126d) r8
                ce.j2 r1 = p038ce.C1061j2.this
                java.lang.Object r1 = r1.m4412T()
                boolean r4 = r1 instanceof p038ce.C1108v
                if (r4 == 0) goto L49
                ce.v r1 = (p038ce.C1108v) r1
                ce.w r1 = r1.f4093l
                r7.f4033k = r3
                java.lang.Object r8 = r8.mo24434a(r1, r7)
                if (r8 != r0) goto L88
                return r0
            L49:
                boolean r3 = r1 instanceof p038ce.InterfaceC1118x1
                if (r3 == 0) goto L88
                ce.x1 r1 = (p038ce.InterfaceC1118x1) r1
                ce.o2 r1 = r1.mo4364e()
                if (r1 == 0) goto L88
                java.lang.Object r3 = r1.m10187m()
                java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
                td.C4753m.m18651d(r3, r4)
                he.w r3 = (p116he.C2559w) r3
                r4 = r8
                r8 = r7
                r6 = r3
                r3 = r1
                r1 = r6
            L65:
                boolean r5 = td.C4753m.m18648a(r1, r3)
                if (r5 != 0) goto L88
                boolean r5 = r1 instanceof p038ce.C1108v
                if (r5 == 0) goto L83
                r5 = r1
                ce.v r5 = (p038ce.C1108v) r5
                ce.w r5 = r5.f4093l
                r8.f4034l = r4
                r8.f4031i = r3
                r8.f4032j = r1
                r8.f4033k = r2
                java.lang.Object r5 = r4.mo24434a(r5, r8)
                if (r5 != r0) goto L83
                return r0
            L83:
                he.w r1 = r1.m10188n()
                goto L65
            L88:
                gd.s r8 = gd.C2245s.f8873a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: p038ce.C1061j2.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C1061j2(boolean z10) {
        this._state = z10 ? C1066k2.f4045g : C1066k2.f4044f;
    }

    /* renamed from: H0 */
    public static /* synthetic */ CancellationException m4383H0(C1061j2 c1061j2, Throwable th, String str, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
        }
        if ((i10 & 1) != 0) {
            str = null;
        }
        return c1061j2.m4397G0(th, str);
    }

    /* renamed from: A */
    public final boolean m4386A(Throwable th) {
        if (mo4321Y()) {
            return true;
        }
        boolean z10 = th instanceof CancellationException;
        InterfaceC1104u m4411S = m4411S();
        return (m4411S == null || m4411S == C1087p2.f4072h) ? z10 : m4411S.mo4556c(th) || z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [ce.w1] */
    /* renamed from: A0 */
    public final void m4387A0(C1070l1 c1070l1) {
        C1083o2 c1083o2 = new C1083o2();
        if (!c1070l1.mo4363a()) {
            c1083o2 = new C1114w1(c1083o2);
        }
        C1080o.m4523a(f4018h, this, c1070l1, c1083o2);
    }

    /* renamed from: B */
    public String mo4249B() {
        return "Job was cancelled";
    }

    /* renamed from: B0 */
    public final void m4388B0(AbstractC1056i2 abstractC1056i2) {
        abstractC1056i2.m10183h(new C1083o2());
        C1080o.m4523a(f4018h, this, abstractC1056i2, abstractC1056i2.m10188n());
    }

    /* renamed from: C */
    public boolean mo4389C(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return m4431v(th) && mo4314O();
    }

    /* renamed from: C0 */
    public final void m4390C0(AbstractC1056i2 abstractC1056i2) {
        Object m4412T;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C1070l1 c1070l1;
        do {
            m4412T = m4412T();
            if (!(m4412T instanceof AbstractC1056i2)) {
                if (!(m4412T instanceof InterfaceC1118x1) || ((InterfaceC1118x1) m4412T).mo4364e() == null) {
                    return;
                }
                abstractC1056i2.m10190q();
                return;
            }
            if (m4412T != abstractC1056i2) {
                return;
            }
            atomicReferenceFieldUpdater = f4018h;
            c1070l1 = C1066k2.f4045g;
        } while (!C1080o.m4523a(atomicReferenceFieldUpdater, this, m4412T, c1070l1));
    }

    /* renamed from: D */
    public final void m4391D(InterfaceC1118x1 interfaceC1118x1, Object obj) {
        InterfaceC1104u m4411S = m4411S();
        if (m4411S != null) {
            m4411S.dispose();
            m4392D0(C1087p2.f4072h);
        }
        C1024c0 c1024c0 = obj instanceof C1024c0 ? (C1024c0) obj : null;
        Throwable th = c1024c0 != null ? c1024c0.f3977a : null;
        if (!(interfaceC1118x1 instanceof AbstractC1056i2)) {
            C1083o2 mo4364e = interfaceC1118x1.mo4364e();
            if (mo4364e != null) {
                m4426q0(mo4364e, th);
                return;
            }
            return;
        }
        try {
            ((AbstractC1056i2) interfaceC1118x1).mo4259u(th);
        } catch (Throwable th2) {
            mo4254V(new C1039f0("Exception in completion handler " + interfaceC1118x1 + " for " + this, th2));
        }
    }

    /* renamed from: D0 */
    public final void m4392D0(InterfaceC1104u interfaceC1104u) {
        f4019i.set(this, interfaceC1104u);
    }

    /* renamed from: E0 */
    public final int m4393E0(Object obj) {
        C1070l1 c1070l1;
        if (!(obj instanceof C1070l1)) {
            if (!(obj instanceof C1114w1)) {
                return 0;
            }
            if (!C1080o.m4523a(f4018h, this, obj, ((C1114w1) obj).mo4364e())) {
                return -1;
            }
            mo4433w0();
            return 1;
        }
        if (((C1070l1) obj).mo4363a()) {
            return 0;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4018h;
        c1070l1 = C1066k2.f4045g;
        if (!C1080o.m4523a(atomicReferenceFieldUpdater, this, obj, c1070l1)) {
            return -1;
        }
        mo4433w0();
        return 1;
    }

    /* renamed from: F */
    public final void m4394F(c cVar, C1108v c1108v, Object obj) {
        if (C1101t0.m4573a()) {
            if (!(m4412T() == cVar)) {
                throw new AssertionError();
            }
        }
        C1108v m4422o0 = m4422o0(c1108v);
        if (m4422o0 == null || !m4409N0(cVar, m4422o0, obj)) {
            mo4272r(m4398H(cVar, obj));
        }
    }

    /* renamed from: F0 */
    public final String m4395F0(Object obj) {
        if (!(obj instanceof c)) {
            return obj instanceof InterfaceC1118x1 ? ((InterfaceC1118x1) obj).mo4363a() ? "Active" : "New" : obj instanceof C1024c0 ? "Cancelled" : "Completed";
        }
        c cVar = (c) obj;
        return cVar.m4443g() ? "Cancelling" : cVar.m4444h() ? "Completing" : "Active";
    }

    /* renamed from: G */
    public final Throwable m4396G(Object obj) {
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            return th == null ? new C1031d2(mo4249B(), null, this) : th;
        }
        C4753m.m18651d(obj, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        return ((InterfaceC1095r2) obj).mo4432v0();
    }

    /* renamed from: G0 */
    public final CancellationException m4397G0(Throwable th, String str) {
        CancellationException cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        if (cancellationException == null) {
            if (str == null) {
                str = mo4249B();
            }
            cancellationException = new C1031d2(str, th, this);
        }
        return cancellationException;
    }

    /* renamed from: H */
    public final Object m4398H(c cVar, Object obj) {
        boolean m4443g;
        Throwable m4408N;
        boolean z10 = true;
        if (C1101t0.m4573a()) {
            if (!(m4412T() == cVar)) {
                throw new AssertionError();
            }
        }
        if (C1101t0.m4573a() && !(!cVar.m4445i())) {
            throw new AssertionError();
        }
        if (C1101t0.m4573a() && !cVar.m4444h()) {
            throw new AssertionError();
        }
        C1024c0 c1024c0 = obj instanceof C1024c0 ? (C1024c0) obj : null;
        Throwable th = c1024c0 != null ? c1024c0.f3977a : null;
        synchronized (cVar) {
            m4443g = cVar.m4443g();
            List<Throwable> m4446j = cVar.m4446j(th);
            m4408N = m4408N(cVar, m4446j);
            if (m4408N != null) {
                m4425q(m4408N, m4446j);
            }
        }
        if (m4408N != null && m4408N != th) {
            obj = new C1024c0(m4408N, false, 2, null);
        }
        if (m4408N != null) {
            if (!m4386A(m4408N) && !mo4413U(m4408N)) {
                z10 = false;
            }
            if (z10) {
                C4753m.m18651d(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
                ((C1024c0) obj).m4268b();
            }
        }
        if (!m4443g) {
            m4429t0(m4408N);
        }
        mo4257u0(obj);
        boolean m4523a = C1080o.m4523a(f4018h, this, cVar, C1066k2.m4469g(obj));
        if (C1101t0.m4573a() && !m4523a) {
            throw new AssertionError();
        }
        m4391D(cVar, obj);
        return obj;
    }

    @Override // p038ce.InterfaceC1112w
    /* renamed from: I */
    public final void mo4399I(InterfaceC1095r2 interfaceC1095r2) {
        m4431v(interfaceC1095r2);
    }

    /* renamed from: I0 */
    public final String m4400I0() {
        return mo4256m0() + '{' + m4395F0(m4412T()) + '}';
    }

    /* renamed from: J */
    public final C1108v m4401J(InterfaceC1118x1 interfaceC1118x1) {
        C1108v c1108v = interfaceC1118x1 instanceof C1108v ? (C1108v) interfaceC1118x1 : null;
        if (c1108v != null) {
            return c1108v;
        }
        C1083o2 mo4364e = interfaceC1118x1.mo4364e();
        if (mo4364e != null) {
            return m4422o0(mo4364e);
        }
        return null;
    }

    /* renamed from: J0 */
    public final boolean m4402J0(InterfaceC1118x1 interfaceC1118x1, Object obj) {
        if (C1101t0.m4573a()) {
            if (!((interfaceC1118x1 instanceof C1070l1) || (interfaceC1118x1 instanceof AbstractC1056i2))) {
                throw new AssertionError();
            }
        }
        if (C1101t0.m4573a() && !(!(obj instanceof C1024c0))) {
            throw new AssertionError();
        }
        if (!C1080o.m4523a(f4018h, this, interfaceC1118x1, C1066k2.m4469g(obj))) {
            return false;
        }
        m4429t0(null);
        mo4257u0(obj);
        m4391D(interfaceC1118x1, obj);
        return true;
    }

    @Override // p038ce.InterfaceC1026c2
    /* renamed from: K */
    public final CancellationException mo4273K() {
        Object m4412T = m4412T();
        if (!(m4412T instanceof c)) {
            if (m4412T instanceof InterfaceC1118x1) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (m4412T instanceof C1024c0) {
                return m4383H0(this, ((C1024c0) m4412T).f3977a, null, 1, null);
            }
            return new C1031d2(C1105u0.m4580a(this) + " has completed normally", null, this);
        }
        Throwable m4442f = ((c) m4412T).m4442f();
        if (m4442f != null) {
            CancellationException m4397G0 = m4397G0(m4442f, C1105u0.m4580a(this) + " is cancelling");
            if (m4397G0 != null) {
                return m4397G0;
            }
        }
        throw new IllegalStateException(("Job is still new or active: " + this).toString());
    }

    /* renamed from: K0 */
    public final boolean m4403K0(InterfaceC1118x1 interfaceC1118x1, Throwable th) {
        if (C1101t0.m4573a() && !(!(interfaceC1118x1 instanceof c))) {
            throw new AssertionError();
        }
        if (C1101t0.m4573a() && !interfaceC1118x1.mo4363a()) {
            throw new AssertionError();
        }
        C1083o2 m4410R = m4410R(interfaceC1118x1);
        if (m4410R == null) {
            return false;
        }
        if (!C1080o.m4523a(f4018h, this, interfaceC1118x1, new c(m4410R, false, th))) {
            return false;
        }
        m4424p0(m4410R, th);
        return true;
    }

    /* renamed from: L */
    public final Object m4404L() {
        Object m4412T = m4412T();
        if (!(!(m4412T instanceof InterfaceC1118x1))) {
            throw new IllegalStateException("This job has not completed yet".toString());
        }
        if (m4412T instanceof C1024c0) {
            throw ((C1024c0) m4412T).f3977a;
        }
        return C1066k2.m4470h(m4412T);
    }

    /* renamed from: L0 */
    public final Object m4405L0(Object obj, Object obj2) {
        C2538l0 c2538l0;
        C2538l0 c2538l02;
        if (!(obj instanceof InterfaceC1118x1)) {
            c2538l02 = C1066k2.f4039a;
            return c2538l02;
        }
        if ((!(obj instanceof C1070l1) && !(obj instanceof AbstractC1056i2)) || (obj instanceof C1108v) || (obj2 instanceof C1024c0)) {
            return m4407M0((InterfaceC1118x1) obj, obj2);
        }
        if (m4402J0((InterfaceC1118x1) obj, obj2)) {
            return obj2;
        }
        c2538l0 = C1066k2.f4041c;
        return c2538l0;
    }

    /* renamed from: M */
    public final Throwable m4406M(Object obj) {
        C1024c0 c1024c0 = obj instanceof C1024c0 ? (C1024c0) obj : null;
        if (c1024c0 != null) {
            return c1024c0.f3977a;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Throwable, T] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* renamed from: M0 */
    public final Object m4407M0(InterfaceC1118x1 interfaceC1118x1, Object obj) {
        C2538l0 c2538l0;
        C2538l0 c2538l02;
        C2538l0 c2538l03;
        C1083o2 m4410R = m4410R(interfaceC1118x1);
        if (m4410R == null) {
            c2538l03 = C1066k2.f4041c;
            return c2538l03;
        }
        c cVar = interfaceC1118x1 instanceof c ? (c) interfaceC1118x1 : null;
        if (cVar == null) {
            cVar = new c(m4410R, false, null);
        }
        C4763w c4763w = new C4763w();
        synchronized (cVar) {
            if (cVar.m4444h()) {
                c2538l02 = C1066k2.f4039a;
                return c2538l02;
            }
            cVar.m4447k(true);
            if (cVar != interfaceC1118x1 && !C1080o.m4523a(f4018h, this, interfaceC1118x1, cVar)) {
                c2538l0 = C1066k2.f4041c;
                return c2538l0;
            }
            if (C1101t0.m4573a() && !(!cVar.m4445i())) {
                throw new AssertionError();
            }
            boolean m4443g = cVar.m4443g();
            C1024c0 c1024c0 = obj instanceof C1024c0 ? (C1024c0) obj : null;
            if (c1024c0 != null) {
                cVar.m4439b(c1024c0.f3977a);
            }
            ?? m4442f = Boolean.valueOf(m4443g ? false : true).booleanValue() ? cVar.m4442f() : 0;
            c4763w.f17731h = m4442f;
            C2245s c2245s = C2245s.f8873a;
            if (m4442f != 0) {
                m4424p0(m4410R, m4442f);
            }
            C1108v m4401J = m4401J(interfaceC1118x1);
            return (m4401J == null || !m4409N0(cVar, m4401J, obj)) ? m4398H(cVar, obj) : C1066k2.f4040b;
        }
    }

    /* renamed from: N */
    public final Throwable m4408N(c cVar, List<? extends Throwable> list) {
        Object obj;
        Object obj2 = null;
        if (list.isEmpty()) {
            if (cVar.m4443g()) {
                return new C1031d2(mo4249B(), null, this);
            }
            return null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (!(((Throwable) obj) instanceof CancellationException)) {
                break;
            }
        }
        Throwable th = (Throwable) obj;
        if (th != null) {
            return th;
        }
        Throwable th2 = list.get(0);
        if (th2 instanceof C1032d3) {
            Iterator<T> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                Throwable th3 = (Throwable) next;
                if (th3 != th2 && (th3 instanceof C1032d3)) {
                    obj2 = next;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj2;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    /* renamed from: N0 */
    public final boolean m4409N0(c cVar, C1108v c1108v, Object obj) {
        while (InterfaceC1026c2.a.m4283d(c1108v.f4093l, false, false, new b(this, cVar, c1108v, obj), 1, null) == C1087p2.f4072h) {
            c1108v = m4422o0(c1108v);
            if (c1108v == null) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: O */
    public boolean mo4314O() {
        return true;
    }

    @Override // p038ce.InterfaceC1026c2
    /* renamed from: P */
    public final Object mo4274P(InterfaceC3281d<? super C2245s> interfaceC3281d) {
        if (m4415Z()) {
            Object m4416a0 = m4416a0(interfaceC3281d);
            return m4416a0 == C3385c.m12581c() ? m4416a0 : C2245s.f8873a;
        }
        C1046g2.m4337i(interfaceC3281d.getContext());
        return C2245s.f8873a;
    }

    /* renamed from: Q */
    public boolean mo4316Q() {
        return false;
    }

    /* renamed from: R */
    public final C1083o2 m4410R(InterfaceC1118x1 interfaceC1118x1) {
        C1083o2 mo4364e = interfaceC1118x1.mo4364e();
        if (mo4364e != null) {
            return mo4364e;
        }
        if (interfaceC1118x1 instanceof C1070l1) {
            return new C1083o2();
        }
        if (interfaceC1118x1 instanceof AbstractC1056i2) {
            m4388B0((AbstractC1056i2) interfaceC1118x1);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + interfaceC1118x1).toString());
    }

    /* renamed from: S */
    public final InterfaceC1104u m4411S() {
        return (InterfaceC1104u) f4019i.get(this);
    }

    /* renamed from: T */
    public final Object m4412T() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4018h;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof AbstractC2524e0)) {
                return obj;
            }
            ((AbstractC2524e0) obj).mo10045a(this);
        }
    }

    /* renamed from: U */
    public boolean mo4413U(Throwable th) {
        return false;
    }

    /* renamed from: V */
    public void mo4254V(Throwable th) {
        throw th;
    }

    /* renamed from: X */
    public final void m4414X(InterfaceC1026c2 interfaceC1026c2) {
        if (C1101t0.m4573a()) {
            if (!(m4411S() == null)) {
                throw new AssertionError();
            }
        }
        if (interfaceC1026c2 == null) {
            m4392D0(C1087p2.f4072h);
            return;
        }
        interfaceC1026c2.start();
        InterfaceC1104u mo4275h0 = interfaceC1026c2.mo4275h0(this);
        m4392D0(mo4275h0);
        if (m4420k()) {
            mo4275h0.dispose();
            m4392D0(C1087p2.f4072h);
        }
    }

    /* renamed from: Y */
    public boolean mo4321Y() {
        return false;
    }

    /* renamed from: Z */
    public final boolean m4415Z() {
        Object m4412T;
        do {
            m4412T = m4412T();
            if (!(m4412T instanceof InterfaceC1118x1)) {
                return false;
            }
        } while (m4393E0(m4412T) < 0);
        return true;
    }

    @Override // p038ce.InterfaceC1026c2
    /* renamed from: a */
    public boolean mo4255a() {
        Object m4412T = m4412T();
        return (m4412T instanceof InterfaceC1118x1) && ((InterfaceC1118x1) m4412T).mo4363a();
    }

    /* renamed from: a0 */
    public final Object m4416a0(InterfaceC3281d<? super C2245s> interfaceC3281d) {
        C1084p c1084p = new C1084p(C3384b.m12580b(interfaceC3281d), 1);
        c1084p.m4530B();
        C1092r.m4565a(c1084p, mo4278x0(new C1103t2(c1084p)));
        Object m4553y = c1084p.m4553y();
        if (m4553y == C3385c.m12581c()) {
            C3474h.m12927c(interfaceC3281d);
        }
        return m4553y == C3385c.m12581c() ? m4553y : C2245s.f8873a;
    }

    @Override // p146jd.InterfaceC3284g
    /* renamed from: b0 */
    public InterfaceC3284g mo4367b0(InterfaceC3284g.c<?> cVar) {
        return InterfaceC1026c2.a.m4284e(this, cVar);
    }

    @Override // p146jd.InterfaceC3284g.b, p146jd.InterfaceC3284g
    /* renamed from: d */
    public <E extends InterfaceC3284g.b> E mo4368d(InterfaceC3284g.c<E> cVar) {
        return (E) InterfaceC1026c2.a.m4282c(this, cVar);
    }

    /* renamed from: d0 */
    public final Object m4417d0(Object obj) {
        C2538l0 c2538l0;
        C2538l0 c2538l02;
        C2538l0 c2538l03;
        C2538l0 c2538l04;
        C2538l0 c2538l05;
        C2538l0 c2538l06;
        Throwable th = null;
        while (true) {
            Object m4412T = m4412T();
            if (m4412T instanceof c) {
                synchronized (m4412T) {
                    if (((c) m4412T).m4445i()) {
                        c2538l02 = C1066k2.f4042d;
                        return c2538l02;
                    }
                    boolean m4443g = ((c) m4412T).m4443g();
                    if (obj != null || !m4443g) {
                        if (th == null) {
                            th = m4396G(obj);
                        }
                        ((c) m4412T).m4439b(th);
                    }
                    Throwable m4442f = m4443g ^ true ? ((c) m4412T).m4442f() : null;
                    if (m4442f != null) {
                        m4424p0(((c) m4412T).mo4364e(), m4442f);
                    }
                    c2538l0 = C1066k2.f4039a;
                    return c2538l0;
                }
            }
            if (!(m4412T instanceof InterfaceC1118x1)) {
                c2538l03 = C1066k2.f4042d;
                return c2538l03;
            }
            if (th == null) {
                th = m4396G(obj);
            }
            InterfaceC1118x1 interfaceC1118x1 = (InterfaceC1118x1) m4412T;
            if (!interfaceC1118x1.mo4363a()) {
                Object m4405L0 = m4405L0(m4412T, new C1024c0(th, false, 2, null));
                c2538l05 = C1066k2.f4039a;
                if (m4405L0 == c2538l05) {
                    throw new IllegalStateException(("Cannot happen in " + m4412T).toString());
                }
                c2538l06 = C1066k2.f4041c;
                if (m4405L0 != c2538l06) {
                    return m4405L0;
                }
            } else if (m4403K0(interfaceC1118x1, th)) {
                c2538l04 = C1066k2.f4039a;
                return c2538l04;
            }
        }
    }

    @Override // p146jd.InterfaceC3284g
    /* renamed from: e0 */
    public InterfaceC3284g mo4369e0(InterfaceC3284g interfaceC3284g) {
        return InterfaceC1026c2.a.m4285f(this, interfaceC3284g);
    }

    @Override // p146jd.InterfaceC3284g.b
    public final InterfaceC3284g.c<?> getKey() {
        return InterfaceC1026c2.f3979c;
    }

    @Override // p038ce.InterfaceC1026c2
    public InterfaceC1026c2 getParent() {
        InterfaceC1104u m4411S = m4411S();
        if (m4411S != null) {
            return m4411S.getParent();
        }
        return null;
    }

    @Override // p038ce.InterfaceC1026c2
    /* renamed from: h0 */
    public final InterfaceC1104u mo4275h0(InterfaceC1112w interfaceC1112w) {
        InterfaceC1055i1 m4283d = InterfaceC1026c2.a.m4283d(this, true, false, new C1108v(interfaceC1112w), 2, null);
        C4753m.m18651d(m4283d, "null cannot be cast to non-null type kotlinx.coroutines.ChildHandle");
        return (InterfaceC1104u) m4283d;
    }

    /* renamed from: i0 */
    public final boolean m4418i0(Object obj) {
        Object m4405L0;
        C2538l0 c2538l0;
        C2538l0 c2538l02;
        do {
            m4405L0 = m4405L0(m4412T(), obj);
            c2538l0 = C1066k2.f4039a;
            if (m4405L0 == c2538l0) {
                return false;
            }
            if (m4405L0 == C1066k2.f4040b) {
                return true;
            }
            c2538l02 = C1066k2.f4041c;
        } while (m4405L0 == c2538l02);
        mo4272r(m4405L0);
        return true;
    }

    @Override // p038ce.InterfaceC1026c2
    public final boolean isCancelled() {
        Object m4412T = m4412T();
        return (m4412T instanceof C1024c0) || ((m4412T instanceof c) && ((c) m4412T).m4443g());
    }

    /* renamed from: j0 */
    public final Object m4419j0(Object obj) {
        Object m4405L0;
        C2538l0 c2538l0;
        C2538l0 c2538l02;
        do {
            m4405L0 = m4405L0(m4412T(), obj);
            c2538l0 = C1066k2.f4039a;
            if (m4405L0 == c2538l0) {
                throw new IllegalStateException("Job " + this + " is already complete or completing, but is being completed with " + obj, m4406M(obj));
            }
            c2538l02 = C1066k2.f4041c;
        } while (m4405L0 == c2538l02);
        return m4405L0;
    }

    /* renamed from: k */
    public final boolean m4420k() {
        return !(m4412T() instanceof InterfaceC1118x1);
    }

    /* renamed from: k0 */
    public final AbstractC1056i2 m4421k0(InterfaceC4580l<? super Throwable, C2245s> interfaceC4580l, boolean z10) {
        AbstractC1056i2 abstractC1056i2;
        if (z10) {
            abstractC1056i2 = interfaceC4580l instanceof AbstractC1036e2 ? (AbstractC1036e2) interfaceC4580l : null;
            if (abstractC1056i2 == null) {
                abstractC1056i2 = new C1016a2(interfaceC4580l);
            }
        } else {
            abstractC1056i2 = interfaceC4580l instanceof AbstractC1056i2 ? (AbstractC1056i2) interfaceC4580l : null;
            if (abstractC1056i2 == null) {
                abstractC1056i2 = new C1021b2(interfaceC4580l);
            } else if (C1101t0.m4573a() && !(!(abstractC1056i2 instanceof AbstractC1036e2))) {
                throw new AssertionError();
            }
        }
        abstractC1056i2.m4366w(this);
        return abstractC1056i2;
    }

    @Override // p038ce.InterfaceC1026c2
    /* renamed from: l */
    public final InterfaceC1055i1 mo4276l(boolean z10, boolean z11, InterfaceC4580l<? super Throwable, C2245s> interfaceC4580l) {
        AbstractC1056i2 m4421k0 = m4421k0(interfaceC4580l, z10);
        while (true) {
            Object m4412T = m4412T();
            if (m4412T instanceof C1070l1) {
                C1070l1 c1070l1 = (C1070l1) m4412T;
                if (!c1070l1.mo4363a()) {
                    m4387A0(c1070l1);
                } else if (C1080o.m4523a(f4018h, this, m4412T, m4421k0)) {
                    return m4421k0;
                }
            } else {
                if (!(m4412T instanceof InterfaceC1118x1)) {
                    if (z11) {
                        C1024c0 c1024c0 = m4412T instanceof C1024c0 ? (C1024c0) m4412T : null;
                        interfaceC4580l.invoke(c1024c0 != null ? c1024c0.f3977a : null);
                    }
                    return C1087p2.f4072h;
                }
                C1083o2 mo4364e = ((InterfaceC1118x1) m4412T).mo4364e();
                if (mo4364e == null) {
                    C4753m.m18651d(m4412T, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    m4388B0((AbstractC1056i2) m4412T);
                } else {
                    InterfaceC1055i1 interfaceC1055i1 = C1087p2.f4072h;
                    if (z10 && (m4412T instanceof c)) {
                        synchronized (m4412T) {
                            r3 = ((c) m4412T).m4442f();
                            if (r3 == null || ((interfaceC4580l instanceof C1108v) && !((c) m4412T).m4444h())) {
                                if (m4423p(m4412T, mo4364e, m4421k0)) {
                                    if (r3 == null) {
                                        return m4421k0;
                                    }
                                    interfaceC1055i1 = m4421k0;
                                }
                            }
                            C2245s c2245s = C2245s.f8873a;
                        }
                    }
                    if (r3 != null) {
                        if (z11) {
                            interfaceC4580l.invoke(r3);
                        }
                        return interfaceC1055i1;
                    }
                    if (m4423p(m4412T, mo4364e, m4421k0)) {
                        return m4421k0;
                    }
                }
            }
        }
    }

    /* renamed from: m0 */
    public String mo4256m0() {
        return C1105u0.m4580a(this);
    }

    /* renamed from: o0 */
    public final C1108v m4422o0(C2559w c2559w) {
        while (c2559w.mo10178p()) {
            c2559w = c2559w.m10189o();
        }
        while (true) {
            c2559w = c2559w.m10188n();
            if (!c2559w.mo10178p()) {
                if (c2559w instanceof C1108v) {
                    return (C1108v) c2559w;
                }
                if (c2559w instanceof C1083o2) {
                    return null;
                }
            }
        }
    }

    /* renamed from: p */
    public final boolean m4423p(Object obj, C1083o2 c1083o2, AbstractC1056i2 abstractC1056i2) {
        int m10193t;
        d dVar = new d(abstractC1056i2, this, obj);
        do {
            m10193t = c1083o2.m10189o().m10193t(abstractC1056i2, c1083o2, dVar);
            if (m10193t == 1) {
                return true;
            }
        } while (m10193t != 2);
        return false;
    }

    /* renamed from: p0 */
    public final void m4424p0(C1083o2 c1083o2, Throwable th) {
        m4429t0(th);
        Object m10187m = c1083o2.m10187m();
        C4753m.m18651d(m10187m, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        C1039f0 c1039f0 = null;
        for (C2559w c2559w = (C2559w) m10187m; !C4753m.m18648a(c2559w, c1083o2); c2559w = c2559w.m10188n()) {
            if (c2559w instanceof AbstractC1036e2) {
                AbstractC1056i2 abstractC1056i2 = (AbstractC1056i2) c2559w;
                try {
                    abstractC1056i2.mo4259u(th);
                } catch (Throwable th2) {
                    if (c1039f0 != null) {
                        C2227a.m8956a(c1039f0, th2);
                    } else {
                        c1039f0 = new C1039f0("Exception in completion handler " + abstractC1056i2 + " for " + this, th2);
                        C2245s c2245s = C2245s.f8873a;
                    }
                }
            }
        }
        if (c1039f0 != null) {
            mo4254V(c1039f0);
        }
        m4386A(th);
    }

    /* renamed from: q */
    public final void m4425q(Throwable th, List<? extends Throwable> list) {
        if (list.size() <= 1) {
            return;
        }
        Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(list.size()));
        Throwable m10101l = !C1101t0.m4576d() ? th : C2536k0.m10101l(th);
        for (Throwable th2 : list) {
            if (C1101t0.m4576d()) {
                th2 = C2536k0.m10101l(th2);
            }
            if (th2 != th && th2 != m10101l && !(th2 instanceof CancellationException) && newSetFromMap.add(th2)) {
                C2227a.m8956a(th, th2);
            }
        }
    }

    /* renamed from: q0 */
    public final void m4426q0(C1083o2 c1083o2, Throwable th) {
        Object m10187m = c1083o2.m10187m();
        C4753m.m18651d(m10187m, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        C1039f0 c1039f0 = null;
        for (C2559w c2559w = (C2559w) m10187m; !C4753m.m18648a(c2559w, c1083o2); c2559w = c2559w.m10188n()) {
            if (c2559w instanceof AbstractC1056i2) {
                AbstractC1056i2 abstractC1056i2 = (AbstractC1056i2) c2559w;
                try {
                    abstractC1056i2.mo4259u(th);
                } catch (Throwable th2) {
                    if (c1039f0 != null) {
                        C2227a.m8956a(c1039f0, th2);
                    } else {
                        c1039f0 = new C1039f0("Exception in completion handler " + abstractC1056i2 + " for " + this, th2);
                        C2245s c2245s = C2245s.f8873a;
                    }
                }
            }
        }
        if (c1039f0 != null) {
            mo4254V(c1039f0);
        }
    }

    /* renamed from: r */
    public void mo4272r(Object obj) {
    }

    /* renamed from: s */
    public final Object m4427s(InterfaceC3281d<Object> interfaceC3281d) {
        Object m4412T;
        Throwable m10098i;
        do {
            m4412T = m4412T();
            if (!(m4412T instanceof InterfaceC1118x1)) {
                if (!(m4412T instanceof C1024c0)) {
                    return C1066k2.m4470h(m4412T);
                }
                Throwable th = ((C1024c0) m4412T).f3977a;
                if (!C1101t0.m4576d()) {
                    throw th;
                }
                if (!(interfaceC3281d instanceof InterfaceC3471e)) {
                    throw th;
                }
                m10098i = C2536k0.m10098i(th, (InterfaceC3471e) interfaceC3281d);
                throw m10098i;
            }
        } while (m4393E0(m4412T) < 0);
        return m4428t(interfaceC3281d);
    }

    @Override // p038ce.InterfaceC1026c2
    public final boolean start() {
        int m4393E0;
        do {
            m4393E0 = m4393E0(m4412T());
            if (m4393E0 == 0) {
                return false;
            }
        } while (m4393E0 != 1);
        return true;
    }

    /* renamed from: t */
    public final Object m4428t(InterfaceC3281d<Object> interfaceC3281d) {
        a aVar = new a(C3384b.m12580b(interfaceC3281d), this);
        aVar.m4530B();
        C1092r.m4565a(aVar, mo4278x0(new C1099s2(aVar)));
        Object m4553y = aVar.m4553y();
        if (m4553y == C3385c.m12581c()) {
            C3474h.m12927c(interfaceC3281d);
        }
        return m4553y;
    }

    /* renamed from: t0 */
    public void m4429t0(Throwable th) {
    }

    public String toString() {
        return m4400I0() + '@' + C1105u0.m4581b(this);
    }

    /* renamed from: u */
    public final boolean m4430u(Throwable th) {
        return m4431v(th);
    }

    /* renamed from: u0 */
    public void mo4257u0(Object obj) {
    }

    /* renamed from: v */
    public final boolean m4431v(Object obj) {
        Object obj2;
        C2538l0 c2538l0;
        C2538l0 c2538l02;
        C2538l0 c2538l03;
        obj2 = C1066k2.f4039a;
        if (mo4316Q() && (obj2 = m4436z(obj)) == C1066k2.f4040b) {
            return true;
        }
        c2538l0 = C1066k2.f4039a;
        if (obj2 == c2538l0) {
            obj2 = m4417d0(obj);
        }
        c2538l02 = C1066k2.f4039a;
        if (obj2 == c2538l02 || obj2 == C1066k2.f4040b) {
            return true;
        }
        c2538l03 = C1066k2.f4042d;
        if (obj2 == c2538l03) {
            return false;
        }
        mo4272r(obj2);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Throwable] */
    @Override // p038ce.InterfaceC1095r2
    /* renamed from: v0 */
    public CancellationException mo4432v0() {
        CancellationException cancellationException;
        Object m4412T = m4412T();
        if (m4412T instanceof c) {
            cancellationException = ((c) m4412T).m4442f();
        } else if (m4412T instanceof C1024c0) {
            cancellationException = ((C1024c0) m4412T).f3977a;
        } else {
            if (m4412T instanceof InterfaceC1118x1) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + m4412T).toString());
            }
            cancellationException = null;
        }
        CancellationException cancellationException2 = cancellationException instanceof CancellationException ? cancellationException : null;
        if (cancellationException2 != null) {
            return cancellationException2;
        }
        return new C1031d2("Parent job is " + m4395F0(m4412T), cancellationException, this);
    }

    @Override // p038ce.InterfaceC1026c2
    /* renamed from: w */
    public final InterfaceC6124b<InterfaceC1026c2> mo4277w() {
        return C6127e.m24439b(new e(null));
    }

    /* renamed from: w0 */
    public void mo4433w0() {
    }

    /* renamed from: x */
    public final Throwable m4434x() {
        Object m4412T = m4412T();
        if (!(m4412T instanceof InterfaceC1118x1)) {
            return m4406M(m4412T);
        }
        throw new IllegalStateException("This job has not completed yet".toString());
    }

    @Override // p038ce.InterfaceC1026c2
    /* renamed from: x0 */
    public final InterfaceC1055i1 mo4278x0(InterfaceC4580l<? super Throwable, C2245s> interfaceC4580l) {
        return mo4276l(false, true, interfaceC4580l);
    }

    /* renamed from: y */
    public void m4435y(Throwable th) {
        m4431v(th);
    }

    @Override // p038ce.InterfaceC1026c2
    /* renamed from: y0 */
    public void mo4279y0(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new C1031d2(mo4249B(), null, this);
        }
        m4435y(cancellationException);
    }

    /* renamed from: z */
    public final Object m4436z(Object obj) {
        C2538l0 c2538l0;
        Object m4405L0;
        C2538l0 c2538l02;
        do {
            Object m4412T = m4412T();
            if (!(m4412T instanceof InterfaceC1118x1) || ((m4412T instanceof c) && ((c) m4412T).m4444h())) {
                c2538l0 = C1066k2.f4039a;
                return c2538l0;
            }
            m4405L0 = m4405L0(m4412T, new C1024c0(m4396G(obj), false, 2, null));
            c2538l02 = C1066k2.f4041c;
        } while (m4405L0 == c2538l02);
        return m4405L0;
    }

    @Override // p146jd.InterfaceC3284g
    /* renamed from: z0 */
    public <R> R mo4370z0(R r10, InterfaceC4584p<? super R, ? super InterfaceC3284g.b, ? extends R> interfaceC4584p) {
        return (R) InterfaceC1026c2.a.m4281b(this, r10, interfaceC4584p);
    }
}
