package p190n2;

import java.util.concurrent.Executor;

/* renamed from: n2.b */
/* loaded from: classes.dex */
public enum EnumC3702b implements Executor {
    INSTANCE;

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public String toString() {
        return "DirectExecutor";
    }
}
