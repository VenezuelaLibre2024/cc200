package p038ce;

import p146jd.InterfaceC3284g;

/* renamed from: ce.g3 */
/* loaded from: classes2.dex */
public final class C1047g3 extends AbstractC1064k0 {

    /* renamed from: j */
    public static final C1047g3 f4007j = new C1047g3();

    @Override // p038ce.AbstractC1064k0
    /* renamed from: H0 */
    public void mo4339H0(InterfaceC3284g interfaceC3284g, Runnable runnable) {
        C1067k3 c1067k3 = (C1067k3) interfaceC3284g.mo4368d(C1067k3.f4046j);
        if (c1067k3 == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
        c1067k3.f4047i = true;
    }

    @Override // p038ce.AbstractC1064k0
    /* renamed from: I0 */
    public boolean mo4340I0(InterfaceC3284g interfaceC3284g) {
        return false;
    }

    @Override // p038ce.AbstractC1064k0
    public String toString() {
        return "Dispatchers.Unconfined";
    }
}
