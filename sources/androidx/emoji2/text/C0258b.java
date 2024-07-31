package androidx.emoji2.text;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: androidx.emoji2.text.b */
/* loaded from: classes.dex */
public class C0258b {

    /* renamed from: androidx.emoji2.text.b$a */
    /* loaded from: classes.dex */
    public static class a {
        /* renamed from: a */
        public static Handler m1226a(Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    /* renamed from: b */
    public static ThreadPoolExecutor m1223b(final String str) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactory() { // from class: androidx.emoji2.text.a
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread m1224c;
                m1224c = C0258b.m1224c(str, runnable);
                return m1224c;
            }
        });
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    /* renamed from: c */
    public static /* synthetic */ Thread m1224c(String str, Runnable runnable) {
        Thread thread = new Thread(runnable, str);
        thread.setPriority(10);
        return thread;
    }

    /* renamed from: d */
    public static Handler m1225d() {
        return Build.VERSION.SDK_INT >= 28 ? a.m1226a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper());
    }
}
