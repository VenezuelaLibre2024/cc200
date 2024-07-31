package me;

import java.util.concurrent.Executor;

/* renamed from: me.a */
/* loaded from: classes2.dex */
public final class ExecutorC3613a implements Executor {

    /* renamed from: h */
    public static final ExecutorC3613a f12742h = new ExecutorC3613a();

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }
}
