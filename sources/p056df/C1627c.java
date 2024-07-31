package p056df;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import td.C4753m;

/* renamed from: df.c */
/* loaded from: classes2.dex */
public final class C1627c {

    /* renamed from: a */
    public static final Executor f5972a;

    /* renamed from: b */
    public static final Handler f5973b;

    static {
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
        C4753m.m18652e(newCachedThreadPool, "newCachedThreadPool()");
        f5972a = newCachedThreadPool;
        f5973b = new Handler(Looper.getMainLooper());
    }

    /* renamed from: a */
    public static final Executor m6489a() {
        return f5972a;
    }

    /* renamed from: b */
    public static final Handler m6490b() {
        return f5973b;
    }
}
