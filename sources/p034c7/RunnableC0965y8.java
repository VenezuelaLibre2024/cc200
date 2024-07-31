package p034c7;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: c7.y8 */
/* loaded from: classes.dex */
public final class RunnableC0965y8 implements Runnable {

    /* renamed from: h */
    public final /* synthetic */ AtomicReference f3775h;

    /* renamed from: i */
    public final /* synthetic */ C0936w7 f3776i;

    public RunnableC0965y8(C0936w7 c0936w7, AtomicReference atomicReference) {
        this.f3775h = atomicReference;
        this.f3776i = c0936w7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f3775h) {
            try {
                this.f3775h.set(Integer.valueOf(this.f3776i.mo3092a().m3283q(this.f3776i.mo3101k().m3697A(), C0733i0.f3067P)));
            } finally {
                this.f3775h.notify();
            }
        }
    }
}
