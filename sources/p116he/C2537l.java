package p116he;

import gd.C2245s;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p038ce.AbstractC1030d1;
import p038ce.AbstractC1064k0;
import p038ce.AbstractC1074m1;
import p038ce.C1029d0;
import p038ce.C1044g0;
import p038ce.C1080o;
import p038ce.C1084p;
import p038ce.C1101t0;
import p038ce.C1105u0;
import p038ce.C1123y2;
import p038ce.InterfaceC1076n;
import p146jd.InterfaceC3281d;
import p146jd.InterfaceC3284g;
import p173ld.InterfaceC3471e;
import td.C4753m;

/* renamed from: he.l */
/* loaded from: classes2.dex */
public final class C2537l<T> extends AbstractC1030d1<T> implements InterfaceC3471e, InterfaceC3281d<T> {

    /* renamed from: o */
    public static final AtomicReferenceFieldUpdater f9976o = AtomicReferenceFieldUpdater.newUpdater(C2537l.class, Object.class, "_reusableCancellableContinuation");
    private volatile Object _reusableCancellableContinuation;

    /* renamed from: k */
    public final AbstractC1064k0 f9977k;

    /* renamed from: l */
    public final InterfaceC3281d<T> f9978l;

    /* renamed from: m */
    public Object f9979m;

    /* renamed from: n */
    public final Object f9980n;

    /* JADX WARN: Multi-variable type inference failed */
    public C2537l(AbstractC1064k0 abstractC1064k0, InterfaceC3281d<? super T> interfaceC3281d) {
        super(-1);
        C2538l0 c2538l0;
        this.f9977k = abstractC1064k0;
        this.f9978l = interfaceC3281d;
        c2538l0 = C2539m.f9982a;
        this.f9979m = c2538l0;
        this.f9980n = C2546p0.m10148b(getContext());
    }

    @Override // p038ce.AbstractC1030d1
    /* renamed from: a */
    public void mo4289a(Object obj, Throwable th) {
        if (obj instanceof C1029d0) {
            ((C1029d0) obj).f3983b.invoke(th);
        }
    }

    @Override // p038ce.AbstractC1030d1
    /* renamed from: b */
    public InterfaceC3281d<T> mo4290b() {
        return this;
    }

    @Override // p173ld.InterfaceC3471e
    public InterfaceC3471e getCallerFrame() {
        InterfaceC3281d<T> interfaceC3281d = this.f9978l;
        if (interfaceC3281d instanceof InterfaceC3471e) {
            return (InterfaceC3471e) interfaceC3281d;
        }
        return null;
    }

    @Override // p146jd.InterfaceC3281d
    public InterfaceC3284g getContext() {
        return this.f9978l.getContext();
    }

    @Override // p173ld.InterfaceC3471e
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // p038ce.AbstractC1030d1
    /* renamed from: n */
    public Object mo4294n() {
        C2538l0 c2538l0;
        C2538l0 c2538l02;
        Object obj = this.f9979m;
        if (C1101t0.m4573a()) {
            c2538l02 = C2539m.f9982a;
            if (!(obj != c2538l02)) {
                throw new AssertionError();
            }
        }
        c2538l0 = C2539m.f9982a;
        this.f9979m = c2538l0;
        return obj;
    }

    /* renamed from: o */
    public final void m10102o() {
        do {
        } while (f9976o.get(this) == C2539m.f9983b);
    }

    /* renamed from: p */
    public final C1084p<T> m10103p() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9976o;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                f9976o.set(this, C2539m.f9983b);
                return null;
            }
            if (obj instanceof C1084p) {
                if (C1080o.m4523a(f9976o, this, obj, C2539m.f9983b)) {
                    return (C1084p) obj;
                }
            } else if (obj != C2539m.f9983b && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
    }

    /* renamed from: q */
    public final C1084p<?> m10104q() {
        Object obj = f9976o.get(this);
        if (obj instanceof C1084p) {
            return (C1084p) obj;
        }
        return null;
    }

    /* renamed from: r */
    public final boolean m10105r() {
        return f9976o.get(this) != null;
    }

    @Override // p146jd.InterfaceC3281d
    public void resumeWith(Object obj) {
        InterfaceC3284g context = this.f9978l.getContext();
        Object m4325d = C1044g0.m4325d(obj, null, 1, null);
        if (this.f9977k.mo4340I0(context)) {
            this.f9979m = m4325d;
            this.f3984j = 0;
            this.f9977k.mo4339H0(context, this);
            return;
        }
        C1101t0.m4573a();
        AbstractC1074m1 m4601b = C1123y2.f4101a.m4601b();
        if (m4601b.m4481R0()) {
            this.f9979m = m4325d;
            this.f3984j = 0;
            m4601b.m4478N0(this);
            return;
        }
        m4601b.m4480P0(true);
        try {
            InterfaceC3284g context2 = getContext();
            Object m10149c = C2546p0.m10149c(context2, this.f9980n);
            try {
                this.f9978l.resumeWith(obj);
                C2245s c2245s = C2245s.f8873a;
                do {
                } while (m4601b.m4484U0());
            } finally {
                C2546p0.m10147a(context2, m10149c);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    /* renamed from: s */
    public final boolean m10106s(Throwable th) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9976o;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            C2538l0 c2538l0 = C2539m.f9983b;
            if (C4753m.m18648a(obj, c2538l0)) {
                if (C1080o.m4523a(f9976o, this, c2538l0, th)) {
                    return true;
                }
            } else {
                if (obj instanceof Throwable) {
                    return true;
                }
                if (C1080o.m4523a(f9976o, this, obj, null)) {
                    return false;
                }
            }
        }
    }

    /* renamed from: t */
    public final void m10107t() {
        m10102o();
        C1084p<?> m10104q = m10104q();
        if (m10104q != null) {
            m10104q.m4549t();
        }
    }

    public String toString() {
        return "DispatchedContinuation[" + this.f9977k + ", " + C1105u0.m4582c(this.f9978l) + ']';
    }

    /* renamed from: u */
    public final Throwable m10108u(InterfaceC1076n<?> interfaceC1076n) {
        C2538l0 c2538l0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9976o;
        do {
            Object obj = atomicReferenceFieldUpdater.get(this);
            c2538l0 = C2539m.f9983b;
            if (obj != c2538l0) {
                if (obj instanceof Throwable) {
                    if (C1080o.m4523a(f9976o, this, obj, null)) {
                        return (Throwable) obj;
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        } while (!C1080o.m4523a(f9976o, this, c2538l0, interfaceC1076n));
        return null;
    }
}
