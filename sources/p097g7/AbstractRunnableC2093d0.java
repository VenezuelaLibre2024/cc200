package p097g7;

import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: g7.d0 */
/* loaded from: classes.dex */
public abstract class AbstractRunnableC2093d0 implements Runnable {

    /* renamed from: a */
    private final TaskCompletionSource f8205a;

    public AbstractRunnableC2093d0() {
        this.f8205a = null;
    }

    public AbstractRunnableC2093d0(TaskCompletionSource taskCompletionSource) {
        this.f8205a = taskCompletionSource;
    }

    /* renamed from: a */
    public void mo5115a(Exception exc) {
        TaskCompletionSource taskCompletionSource = this.f8205a;
        if (taskCompletionSource != null) {
            taskCompletionSource.trySetException(exc);
        }
    }

    /* renamed from: b */
    public abstract void mo5116b();

    /* renamed from: c */
    public final TaskCompletionSource m8319c() {
        return this.f8205a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            mo5116b();
        } catch (Exception e10) {
            mo5115a(e10);
        }
    }
}
