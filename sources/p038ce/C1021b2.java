package p038ce;

import gd.C2245s;
import sd.InterfaceC4580l;

/* renamed from: ce.b2 */
/* loaded from: classes2.dex */
public final class C1021b2 extends AbstractC1056i2 {

    /* renamed from: l */
    public final InterfaceC4580l<Throwable, C2245s> f3971l;

    /* JADX WARN: Multi-variable type inference failed */
    public C1021b2(InterfaceC4580l<? super Throwable, C2245s> interfaceC4580l) {
        this.f3971l = interfaceC4580l;
    }

    @Override // sd.InterfaceC4580l
    public /* bridge */ /* synthetic */ C2245s invoke(Throwable th) {
        mo4259u(th);
        return C2245s.f8873a;
    }

    @Override // p038ce.AbstractC1034e0
    /* renamed from: u */
    public void mo4259u(Throwable th) {
        this.f3971l.invoke(th);
    }
}
