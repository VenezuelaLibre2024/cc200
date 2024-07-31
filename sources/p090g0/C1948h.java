package p090g0;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import p133j0.C3205d;

/* renamed from: g0.h */
/* loaded from: classes.dex */
public final class C1948h {

    /* renamed from: g0.h$a */
    /* loaded from: classes.dex */
    public static class a implements Executor {

        /* renamed from: h */
        public final Handler f7758h;

        public a(Handler handler) {
            this.f7758h = (Handler) C3205d.m11414j(handler);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            if (this.f7758h.post((Runnable) C3205d.m11414j(runnable))) {
                return;
            }
            throw new RejectedExecutionException(this.f7758h + " is shutting down");
        }
    }

    /* renamed from: a */
    public static Executor m7860a(Handler handler) {
        return new a(handler);
    }
}
