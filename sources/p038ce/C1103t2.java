package p038ce;

import gd.C2237k;
import gd.C2245s;
import p146jd.InterfaceC3281d;

/* renamed from: ce.t2 */
/* loaded from: classes2.dex */
public final class C1103t2 extends AbstractC1056i2 {

    /* renamed from: l */
    public final InterfaceC3281d<C2245s> f4092l;

    /* JADX WARN: Multi-variable type inference failed */
    public C1103t2(InterfaceC3281d<? super C2245s> interfaceC3281d) {
        this.f4092l = interfaceC3281d;
    }

    @Override // sd.InterfaceC4580l
    public /* bridge */ /* synthetic */ C2245s invoke(Throwable th) {
        mo4259u(th);
        return C2245s.f8873a;
    }

    @Override // p038ce.AbstractC1034e0
    /* renamed from: u */
    public void mo4259u(Throwable th) {
        InterfaceC3281d<C2245s> interfaceC3281d = this.f4092l;
        C2237k.a aVar = C2237k.f8865i;
        interfaceC3281d.resumeWith(C2237k.m8966b(C2245s.f8873a));
    }
}
