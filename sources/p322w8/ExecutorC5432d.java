package p322w8;

import java.util.concurrent.Executor;

/* renamed from: w8.d */
/* loaded from: classes.dex */
public final /* synthetic */ class ExecutorC5432d implements Executor {

    /* renamed from: h */
    public static final Executor f20266h = new ExecutorC5432d();

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }
}
