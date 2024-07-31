package p034c7;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: c7.b9 */
/* loaded from: classes.dex */
public final class RunnableC0642b9 implements Runnable {

    /* renamed from: h */
    public final /* synthetic */ AtomicReference f2791h;

    /* renamed from: i */
    public final /* synthetic */ C0936w7 f2792i;

    public RunnableC0642b9(C0936w7 c0936w7, AtomicReference atomicReference) {
        this.f2791h = atomicReference;
        this.f2792i = c0936w7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f2791h) {
            try {
                this.f2791h.set(Double.valueOf(this.f2792i.mo3092a().m3276j(this.f2792i.mo3101k().m3697A(), C0733i0.f3069Q)));
            } finally {
                this.f2791h.notify();
            }
        }
    }
}
