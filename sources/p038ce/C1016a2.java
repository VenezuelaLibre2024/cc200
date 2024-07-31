package p038ce;

import gd.C2245s;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import sd.InterfaceC4580l;

/* renamed from: ce.a2 */
/* loaded from: classes2.dex */
public final class C1016a2 extends AbstractC1036e2 {

    /* renamed from: m */
    public static final AtomicIntegerFieldUpdater f3964m = AtomicIntegerFieldUpdater.newUpdater(C1016a2.class, "_invoked");
    private volatile int _invoked;

    /* renamed from: l */
    public final InterfaceC4580l<Throwable, C2245s> f3965l;

    /* JADX WARN: Multi-variable type inference failed */
    public C1016a2(InterfaceC4580l<? super Throwable, C2245s> interfaceC4580l) {
        this.f3965l = interfaceC4580l;
    }

    @Override // sd.InterfaceC4580l
    public /* bridge */ /* synthetic */ C2245s invoke(Throwable th) {
        mo4259u(th);
        return C2245s.f8873a;
    }

    @Override // p038ce.AbstractC1034e0
    /* renamed from: u */
    public void mo4259u(Throwable th) {
        if (f3964m.compareAndSet(this, 0, 1)) {
            this.f3965l.invoke(th);
        }
    }
}
