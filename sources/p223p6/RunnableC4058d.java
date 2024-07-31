package p223p6;

import android.os.Process;

/* renamed from: p6.d */
/* loaded from: classes.dex */
public final class RunnableC4058d implements Runnable {

    /* renamed from: h */
    public final Runnable f14612h;

    public RunnableC4058d(Runnable runnable, int i10) {
        this.f14612h = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(0);
        this.f14612h.run();
    }
}
