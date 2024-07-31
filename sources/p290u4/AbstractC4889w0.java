package p290u4;

import p206o5.InterfaceC3917m0;
import p264s3.AbstractC4505u3;
import p264s3.C4503u1;
import p290u4.InterfaceC4882t;

/* renamed from: u4.w0 */
/* loaded from: classes.dex */
public abstract class AbstractC4889w0 extends AbstractC4854f<Void> {

    /* renamed from: s */
    public static final Void f18490s = null;

    /* renamed from: r */
    public final InterfaceC4882t f18491r;

    public AbstractC4889w0(InterfaceC4882t interfaceC4882t) {
        this.f18491r = interfaceC4882t;
    }

    @Override // p290u4.AbstractC4854f, p290u4.AbstractC4844a
    /* renamed from: C */
    public final void mo4714C(InterfaceC3917m0 interfaceC3917m0) {
        super.mo4714C(interfaceC3917m0);
        mo19420V();
    }

    @Override // p290u4.AbstractC4854f
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public final InterfaceC4882t.b mo19257G(Void r12, InterfaceC4882t.b bVar) {
        return mo19418N(bVar);
    }

    /* renamed from: N */
    public abstract InterfaceC4882t.b mo19418N(InterfaceC4882t.b bVar);

    /* renamed from: O */
    public long m19456O(long j10) {
        return j10;
    }

    @Override // p290u4.AbstractC4854f
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public final long mo19258H(Void r12, long j10) {
        return m19456O(j10);
    }

    /* renamed from: Q */
    public int m19458Q(int i10) {
        return i10;
    }

    @Override // p290u4.AbstractC4854f
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public final int mo19259I(Void r12, int i10) {
        return m19458Q(i10);
    }

    @Override // p290u4.AbstractC4854f
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public final void m19256J(Void r12, InterfaceC4882t interfaceC4882t, AbstractC4505u3 abstractC4505u3) {
        mo19419T(abstractC4505u3);
    }

    /* renamed from: T */
    public abstract void mo19419T(AbstractC4505u3 abstractC4505u3);

    /* renamed from: U */
    public final void m19461U() {
        m19261L(f18490s, this.f18491r);
    }

    /* renamed from: V */
    public abstract void mo19420V();

    @Override // p290u4.InterfaceC4882t
    /* renamed from: g */
    public C4503u1 mo4733g() {
        return this.f18491r.mo4733g();
    }

    @Override // p290u4.InterfaceC4882t
    /* renamed from: j */
    public boolean mo19447j() {
        return this.f18491r.mo19447j();
    }

    @Override // p290u4.InterfaceC4882t
    /* renamed from: l */
    public AbstractC4505u3 mo19448l() {
        return this.f18491r.mo19448l();
    }
}
