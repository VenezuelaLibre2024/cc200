package p038ce;

import p146jd.InterfaceC3281d;
import p146jd.InterfaceC3284g;
import sd.InterfaceC4584p;

/* renamed from: ce.a */
/* loaded from: classes2.dex */
public abstract class AbstractC1013a<T> extends C1061j2 implements InterfaceC3281d<T>, InterfaceC1085p0 {

    /* renamed from: j */
    public final InterfaceC3284g f3963j;

    public AbstractC1013a(InterfaceC3284g interfaceC3284g, boolean z10, boolean z11) {
        super(z11);
        if (z10) {
            m4414X((InterfaceC1026c2) interfaceC3284g.mo4368d(InterfaceC1026c2.f3979c));
        }
        this.f3963j = interfaceC3284g.mo4369e0(this);
    }

    @Override // p038ce.C1061j2
    /* renamed from: B */
    public String mo4249B() {
        return C1105u0.m4580a(this) + " was cancelled";
    }

    /* renamed from: O0 */
    public void mo4250O0(Object obj) {
        mo4272r(obj);
    }

    /* renamed from: P0 */
    public void m4251P0(Throwable th, boolean z10) {
    }

    /* renamed from: Q0 */
    public void m4252Q0(T t10) {
    }

    /* renamed from: R0 */
    public final <R> void m4253R0(EnumC1093r0 enumC1093r0, R r10, InterfaceC4584p<? super R, ? super InterfaceC3281d<? super T>, ? extends Object> interfaceC4584p) {
        enumC1093r0.m4568c(interfaceC4584p, r10, this);
    }

    @Override // p038ce.C1061j2
    /* renamed from: V */
    public final void mo4254V(Throwable th) {
        C1073m0.m4472a(this.f3963j, th);
    }

    @Override // p038ce.C1061j2, p038ce.InterfaceC1026c2
    /* renamed from: a */
    public boolean mo4255a() {
        return super.mo4255a();
    }

    @Override // p038ce.InterfaceC1085p0
    /* renamed from: b */
    public InterfaceC3284g mo1763b() {
        return this.f3963j;
    }

    @Override // p146jd.InterfaceC3281d
    public final InterfaceC3284g getContext() {
        return this.f3963j;
    }

    @Override // p038ce.C1061j2
    /* renamed from: m0 */
    public String mo4256m0() {
        String m4374b = C1059j0.m4374b(this.f3963j);
        if (m4374b == null) {
            return super.mo4256m0();
        }
        return '\"' + m4374b + "\":" + super.mo4256m0();
    }

    @Override // p146jd.InterfaceC3281d
    public final void resumeWith(Object obj) {
        Object m4419j0 = m4419j0(C1044g0.m4325d(obj, null, 1, null));
        if (m4419j0 == C1066k2.f4040b) {
            return;
        }
        mo4250O0(m4419j0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p038ce.C1061j2
    /* renamed from: u0 */
    public final void mo4257u0(Object obj) {
        if (!(obj instanceof C1024c0)) {
            m4252Q0(obj);
        } else {
            C1024c0 c1024c0 = (C1024c0) obj;
            m4251P0(c1024c0.f3977a, c1024c0.m4267a());
        }
    }
}
