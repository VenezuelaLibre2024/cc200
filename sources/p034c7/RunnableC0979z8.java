package p034c7;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: c7.z8 */
/* loaded from: classes.dex */
public final class RunnableC0979z8 implements Runnable {

    /* renamed from: h */
    public final /* synthetic */ AtomicReference f3844h;

    /* renamed from: i */
    public final /* synthetic */ C0936w7 f3845i;

    public RunnableC0979z8(C0936w7 c0936w7, AtomicReference atomicReference) {
        this.f3844h = atomicReference;
        this.f3845i = c0936w7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f3844h) {
            try {
                this.f3844h.set(Long.valueOf(this.f3845i.mo3092a().m3287u(this.f3845i.mo3101k().m3697A(), C0733i0.f3065O)));
            } finally {
                this.f3844h.notify();
            }
        }
    }
}
