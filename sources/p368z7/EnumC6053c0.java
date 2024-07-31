package p368z7;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: z7.c0 */
/* loaded from: classes.dex */
public enum EnumC6053c0 implements Executor {
    INSTANCE;


    /* renamed from: i */
    @SuppressLint({"ThreadPoolCreation"})
    public static final Handler f22521i = new Handler(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        f22521i.post(runnable);
    }
}
