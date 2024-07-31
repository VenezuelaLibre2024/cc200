package p223p6;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.common.zzi;
import java.util.concurrent.Executor;

/* renamed from: p6.a */
/* loaded from: classes.dex */
public class ExecutorC4055a implements Executor {

    /* renamed from: h */
    public final Handler f14606h;

    public ExecutorC4055a(Looper looper) {
        this.f14606h = new zzi(looper);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f14606h.post(runnable);
    }
}
