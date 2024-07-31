package p193n5;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: n5.p */
/* loaded from: classes2.dex */
public final /* synthetic */ class ExecutorC3749p implements Executor {

    /* renamed from: h */
    public final /* synthetic */ Handler f13463h;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f13463h.post(runnable);
    }
}
