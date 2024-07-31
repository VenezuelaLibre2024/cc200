package p200o;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: o.d */
/* loaded from: classes.dex */
public class C3823d extends AbstractC3824e {

    /* renamed from: a */
    public final Object f13754a = new Object();

    /* renamed from: b */
    public final ExecutorService f13755b = Executors.newFixedThreadPool(4, new a());

    /* renamed from: c */
    public volatile Handler f13756c;

    /* renamed from: o.d$a */
    /* loaded from: classes.dex */
    public class a implements ThreadFactory {

        /* renamed from: a */
        public final AtomicInteger f13757a = new AtomicInteger(0);

        public a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName("arch_disk_io_" + this.f13757a.getAndIncrement());
            return thread;
        }
    }

    /* renamed from: o.d$b */
    /* loaded from: classes.dex */
    public static class b {
        /* renamed from: a */
        public static Handler m14536a(Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    /* renamed from: d */
    public static Handler m14535d(Looper looper) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            return b.m14536a(looper);
        }
        if (i10 >= 17) {
            try {
                return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
            } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            } catch (InvocationTargetException unused2) {
                return new Handler(looper);
            }
        }
        return new Handler(looper);
    }

    @Override // p200o.AbstractC3824e
    /* renamed from: a */
    public void mo14532a(Runnable runnable) {
        this.f13755b.execute(runnable);
    }

    @Override // p200o.AbstractC3824e
    /* renamed from: b */
    public boolean mo14533b() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    @Override // p200o.AbstractC3824e
    /* renamed from: c */
    public void mo14534c(Runnable runnable) {
        if (this.f13756c == null) {
            synchronized (this.f13754a) {
                if (this.f13756c == null) {
                    this.f13756c = m14535d(Looper.getMainLooper());
                }
            }
        }
        this.f13756c.post(runnable);
    }
}
