package p034c7;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: c7.r8 */
/* loaded from: classes.dex */
public final class RunnableC0867r8 implements Runnable {

    /* renamed from: h */
    public final /* synthetic */ AtomicReference f3510h;

    /* renamed from: i */
    public final /* synthetic */ C0936w7 f3511i;

    public RunnableC0867r8(C0936w7 c0936w7, AtomicReference atomicReference) {
        this.f3510h = atomicReference;
        this.f3511i = c0936w7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f3510h) {
            try {
                this.f3510h.set(this.f3511i.mo3092a().m3292z(this.f3511i.mo3101k().m3697A()));
            } finally {
                this.f3510h.notify();
            }
        }
    }
}
