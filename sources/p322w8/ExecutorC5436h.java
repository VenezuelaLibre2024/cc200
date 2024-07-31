package p322w8;

import java.util.concurrent.Executor;

/* renamed from: w8.h */
/* loaded from: classes.dex */
public final /* synthetic */ class ExecutorC5436h implements Executor {

    /* renamed from: h */
    public static final Executor f20277h = new ExecutorC5436h();

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }
}
