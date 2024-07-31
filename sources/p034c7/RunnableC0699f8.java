package p034c7;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: c7.f8 */
/* loaded from: classes.dex */
public final class RunnableC0699f8 implements Runnable {

    /* renamed from: h */
    public final /* synthetic */ AtomicReference f2929h;

    /* renamed from: i */
    public final /* synthetic */ C0936w7 f2930i;

    public RunnableC0699f8(C0936w7 c0936w7, AtomicReference atomicReference) {
        this.f2929h = atomicReference;
        this.f2930i = c0936w7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f2929h) {
            try {
                this.f2929h.set(Boolean.valueOf(this.f2930i.mo3092a().m3263E(this.f2930i.mo3101k().m3697A())));
            } finally {
                this.f2929h.notify();
            }
        }
    }
}
