package p368z7;

import android.os.Process;
import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: z7.b */
/* loaded from: classes.dex */
public class ThreadFactoryC6050b implements ThreadFactory {

    /* renamed from: e */
    public static final ThreadFactory f22498e = Executors.defaultThreadFactory();

    /* renamed from: a */
    public final AtomicLong f22499a = new AtomicLong();

    /* renamed from: b */
    public final String f22500b;

    /* renamed from: c */
    public final int f22501c;

    /* renamed from: d */
    public final StrictMode.ThreadPolicy f22502d;

    public ThreadFactoryC6050b(String str, int i10, StrictMode.ThreadPolicy threadPolicy) {
        this.f22500b = str;
        this.f22501c = i10;
        this.f22502d = threadPolicy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m24255b(Runnable runnable) {
        Process.setThreadPriority(this.f22501c);
        StrictMode.ThreadPolicy threadPolicy = this.f22502d;
        if (threadPolicy != null) {
            StrictMode.setThreadPolicy(threadPolicy);
        }
        runnable.run();
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(final Runnable runnable) {
        Thread newThread = f22498e.newThread(new Runnable() { // from class: z7.a
            @Override // java.lang.Runnable
            public final void run() {
                ThreadFactoryC6050b.this.m24255b(runnable);
            }
        });
        newThread.setName(String.format(Locale.ROOT, "%s Thread #%d", this.f22500b, Long.valueOf(this.f22499a.getAndIncrement())));
        return newThread;
    }
}
