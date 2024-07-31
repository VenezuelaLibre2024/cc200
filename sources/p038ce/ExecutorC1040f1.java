package p038ce;

import java.util.concurrent.Executor;
import p146jd.C3285h;

/* renamed from: ce.f1 */
/* loaded from: classes2.dex */
public final class ExecutorC1040f1 implements Executor {

    /* renamed from: h */
    public final AbstractC1064k0 f3999h;

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        AbstractC1064k0 abstractC1064k0 = this.f3999h;
        C3285h c3285h = C3285h.f11452h;
        if (abstractC1064k0.mo4340I0(c3285h)) {
            this.f3999h.mo4339H0(c3285h, runnable);
        } else {
            runnable.run();
        }
    }

    public String toString() {
        return this.f3999h.toString();
    }
}
