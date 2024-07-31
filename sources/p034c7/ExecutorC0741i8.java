package p034c7;

import java.util.concurrent.Executor;

/* renamed from: c7.i8 */
/* loaded from: classes.dex */
public final class ExecutorC0741i8 implements Executor {

    /* renamed from: h */
    public final /* synthetic */ C0936w7 f3178h;

    public ExecutorC0741i8(C0936w7 c0936w7) {
        this.f3178h = c0936w7;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f3178h.zzl().m3152y(runnable);
    }
}
