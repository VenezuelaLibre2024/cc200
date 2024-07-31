package p038ce;

import gd.C2227a;
import gd.C2237k;
import gd.C2238l;
import gd.C2245s;
import je.AbstractRunnableC3293h;
import je.InterfaceC3294i;
import p116he.C2536k0;
import p116he.C2537l;
import p116he.C2546p0;
import p146jd.InterfaceC3281d;
import p146jd.InterfaceC3284g;
import p173ld.InterfaceC3471e;
import td.C4753m;

/* renamed from: ce.d1 */
/* loaded from: classes2.dex */
public abstract class AbstractC1030d1<T> extends AbstractRunnableC3293h {

    /* renamed from: j */
    public int f3984j;

    public AbstractC1030d1(int i10) {
        this.f3984j = i10;
    }

    /* renamed from: a */
    public void mo4289a(Object obj, Throwable th) {
    }

    /* renamed from: b */
    public abstract InterfaceC3281d<T> mo4290b();

    /* renamed from: d */
    public Throwable mo4291d(Object obj) {
        C1024c0 c1024c0 = obj instanceof C1024c0 ? (C1024c0) obj : null;
        if (c1024c0 != null) {
            return c1024c0.f3977a;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: i */
    public <T> T mo4292i(Object obj) {
        return obj;
    }

    /* renamed from: l */
    public final void m4293l(Throwable th, Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            C2227a.m8956a(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        C4753m.m18650c(th);
        C1073m0.m4472a(mo4290b().getContext(), new C1097s0("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    /* renamed from: n */
    public abstract Object mo4294n();

    @Override // java.lang.Runnable
    public final void run() {
        Object m8966b;
        Object m8966b2;
        Object m8966b3;
        if (C1101t0.m4573a()) {
            if (!(this.f3984j != -1)) {
                throw new AssertionError();
            }
        }
        InterfaceC3294i interfaceC3294i = this.f11491i;
        try {
            InterfaceC3281d<T> mo4290b = mo4290b();
            C4753m.m18651d(mo4290b, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            C2537l c2537l = (C2537l) mo4290b;
            InterfaceC3281d<T> interfaceC3281d = c2537l.f9978l;
            Object obj = c2537l.f9980n;
            InterfaceC3284g context = interfaceC3281d.getContext();
            Object m10149c = C2546p0.m10149c(context, obj);
            C1052h3<?> m4379g = m10149c != C2546p0.f9994a ? C1059j0.m4379g(interfaceC3281d, context, m10149c) : null;
            try {
                InterfaceC3284g context2 = interfaceC3281d.getContext();
                Object mo4294n = mo4294n();
                Throwable mo4291d = mo4291d(mo4294n);
                InterfaceC1026c2 interfaceC1026c2 = (mo4291d == null && C1035e1.m4308b(this.f3984j)) ? (InterfaceC1026c2) context2.mo4368d(InterfaceC1026c2.f3979c) : null;
                if (interfaceC1026c2 != null && !interfaceC1026c2.mo4255a()) {
                    Throwable mo4273K = interfaceC1026c2.mo4273K();
                    mo4289a(mo4294n, mo4273K);
                    C2237k.a aVar = C2237k.f8865i;
                    if (C1101t0.m4576d() && (interfaceC3281d instanceof InterfaceC3471e)) {
                        mo4273K = C2536k0.m10098i(mo4273K, (InterfaceC3471e) interfaceC3281d);
                    }
                    m8966b2 = C2237k.m8966b(C2238l.m8974a(mo4273K));
                } else if (mo4291d != null) {
                    C2237k.a aVar2 = C2237k.f8865i;
                    m8966b2 = C2237k.m8966b(C2238l.m8974a(mo4291d));
                } else {
                    C2237k.a aVar3 = C2237k.f8865i;
                    m8966b2 = C2237k.m8966b(mo4292i(mo4294n));
                }
                interfaceC3281d.resumeWith(m8966b2);
                C2245s c2245s = C2245s.f8873a;
                try {
                    C2237k.a aVar4 = C2237k.f8865i;
                    interfaceC3294i.mo11942a();
                    m8966b3 = C2237k.m8966b(c2245s);
                } catch (Throwable th) {
                    C2237k.a aVar5 = C2237k.f8865i;
                    m8966b3 = C2237k.m8966b(C2238l.m8974a(th));
                }
                m4293l(null, C2237k.m8968d(m8966b3));
            } finally {
                if (m4379g == null || m4379g.m4354S0()) {
                    C2546p0.m10147a(context, m10149c);
                }
            }
        } catch (Throwable th2) {
            try {
                C2237k.a aVar6 = C2237k.f8865i;
                interfaceC3294i.mo11942a();
                m8966b = C2237k.m8966b(C2245s.f8873a);
            } catch (Throwable th3) {
                C2237k.a aVar7 = C2237k.f8865i;
                m8966b = C2237k.m8966b(C2238l.m8974a(th3));
            }
            m4293l(th2, C2237k.m8968d(m8966b));
        }
    }
}
