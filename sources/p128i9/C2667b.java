package p128i9;

import android.annotation.SuppressLint;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: i9.b */
/* loaded from: classes.dex */
public class C2667b {

    /* renamed from: a */
    public static final InterfaceC2666a f10412a;

    /* renamed from: b */
    public static volatile InterfaceC2666a f10413b;

    /* renamed from: i9.b$b */
    /* loaded from: classes.dex */
    public static class b implements InterfaceC2666a {
        public b() {
        }

        @Override // p128i9.InterfaceC2666a
        /* renamed from: a */
        public ExecutorService mo10866a(ThreadFactory threadFactory, EnumC2668c enumC2668c) {
            return m10868b(1, threadFactory, enumC2668c);
        }

        @SuppressLint({"ThreadPoolCreation"})
        /* renamed from: b */
        public ExecutorService m10868b(int i10, ThreadFactory threadFactory, EnumC2668c enumC2668c) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i10, i10, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            return Executors.unconfigurableExecutorService(threadPoolExecutor);
        }
    }

    static {
        b bVar = new b();
        f10412a = bVar;
        f10413b = bVar;
    }

    /* renamed from: a */
    public static InterfaceC2666a m10867a() {
        return f10413b;
    }
}
