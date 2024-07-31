package p038ce;

import gd.C2245s;

/* renamed from: ce.v */
/* loaded from: classes2.dex */
public final class C1108v extends AbstractC1036e2 implements InterfaceC1104u {

    /* renamed from: l */
    public final InterfaceC1112w f4093l;

    public C1108v(InterfaceC1112w interfaceC1112w) {
        this.f4093l = interfaceC1112w;
    }

    @Override // p038ce.InterfaceC1104u
    /* renamed from: c */
    public boolean mo4556c(Throwable th) {
        return m4365v().mo4389C(th);
    }

    @Override // p038ce.InterfaceC1104u
    public InterfaceC1026c2 getParent() {
        return m4365v();
    }

    @Override // sd.InterfaceC4580l
    public /* bridge */ /* synthetic */ C2245s invoke(Throwable th) {
        mo4259u(th);
        return C2245s.f8873a;
    }

    @Override // p038ce.AbstractC1034e0
    /* renamed from: u */
    public void mo4259u(Throwable th) {
        this.f4093l.mo4399I(m4365v());
    }
}
