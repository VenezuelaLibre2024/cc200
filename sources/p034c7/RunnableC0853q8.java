package p034c7;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: c7.q8 */
/* loaded from: classes.dex */
public final class RunnableC0853q8 implements Runnable {

    /* renamed from: h */
    public final /* synthetic */ long f3471h;

    /* renamed from: i */
    public final /* synthetic */ C0936w7 f3472i;

    public RunnableC0853q8(C0936w7 c0936w7, long j10) {
        this.f3471h = j10;
        this.f3472i = c0936w7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f3472i.m3991z(this.f3471h, true);
        this.f3472i.mo3105o().m4025L(new AtomicReference<>());
    }
}
