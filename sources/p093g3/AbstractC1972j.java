package p093g3;

import android.annotation.SuppressLint;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* renamed from: g3.j */
/* loaded from: classes.dex */
public abstract class AbstractC1972j {
    @SuppressLint({"ThreadPoolCreation"})
    /* renamed from: a */
    public static Executor m7989a() {
        return new ExecutorC1976n(Executors.newSingleThreadExecutor());
    }
}
