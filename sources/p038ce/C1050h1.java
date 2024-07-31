package p038ce;

import java.util.concurrent.Future;

/* renamed from: ce.h1 */
/* loaded from: classes2.dex */
public final class C1050h1 implements InterfaceC1055i1 {

    /* renamed from: h */
    public final Future<?> f4009h;

    public C1050h1(Future<?> future) {
        this.f4009h = future;
    }

    @Override // p038ce.InterfaceC1055i1
    public void dispose() {
        this.f4009h.cancel(false);
    }

    public String toString() {
        return "DisposableFutureHandle[" + this.f4009h + ']';
    }
}
