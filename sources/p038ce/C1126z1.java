package p038ce;

import gd.C2245s;
import sd.InterfaceC4580l;

/* renamed from: ce.z1 */
/* loaded from: classes2.dex */
public final class C1126z1 extends AbstractC1068l {

    /* renamed from: h */
    public final InterfaceC4580l<Throwable, C2245s> f4103h;

    /* JADX WARN: Multi-variable type inference failed */
    public C1126z1(InterfaceC4580l<? super Throwable, C2245s> interfaceC4580l) {
        this.f4103h = interfaceC4580l;
    }

    @Override // p038ce.AbstractC1072m
    /* renamed from: e */
    public void mo4305e(Throwable th) {
        this.f4103h.invoke(th);
    }

    @Override // sd.InterfaceC4580l
    public /* bridge */ /* synthetic */ C2245s invoke(Throwable th) {
        mo4305e(th);
        return C2245s.f8873a;
    }

    public String toString() {
        return "InvokeOnCancel[" + C1105u0.m4580a(this.f4103h) + '@' + C1105u0.m4581b(this) + ']';
    }
}
