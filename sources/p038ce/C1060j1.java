package p038ce;

import gd.C2245s;

/* renamed from: ce.j1 */
/* loaded from: classes2.dex */
public final class C1060j1 extends AbstractC1068l {

    /* renamed from: h */
    public final InterfaceC1055i1 f4017h;

    public C1060j1(InterfaceC1055i1 interfaceC1055i1) {
        this.f4017h = interfaceC1055i1;
    }

    @Override // p038ce.AbstractC1072m
    /* renamed from: e */
    public void mo4305e(Throwable th) {
        this.f4017h.dispose();
    }

    @Override // sd.InterfaceC4580l
    public /* bridge */ /* synthetic */ C2245s invoke(Throwable th) {
        mo4305e(th);
        return C2245s.f8873a;
    }

    public String toString() {
        return "DisposeOnCancel[" + this.f4017h + ']';
    }
}
