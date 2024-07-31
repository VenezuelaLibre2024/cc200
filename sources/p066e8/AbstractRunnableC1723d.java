package p066e8;

import android.os.Process;

/* renamed from: e8.d */
/* loaded from: classes.dex */
public abstract class AbstractRunnableC1723d implements Runnable {
    /* renamed from: a */
    public abstract void mo6787a();

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        mo6787a();
    }
}
