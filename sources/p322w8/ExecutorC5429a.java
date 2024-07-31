package p322w8;

import java.util.concurrent.Executor;

/* renamed from: w8.a */
/* loaded from: classes.dex */
public final /* synthetic */ class ExecutorC5429a implements Executor {

    /* renamed from: h */
    public static final Executor f20261h = new ExecutorC5429a();

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }
}
