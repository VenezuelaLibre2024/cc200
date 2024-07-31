package p038ce;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: ce.c3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class C1027c3 {
    /* renamed from: b */
    public static final AbstractC1098s1 m4287b(int i10, String str) {
        if (i10 >= 1) {
            return C1106u1.m4584b(Executors.newScheduledThreadPool(i10, new ThreadFactory() { // from class: ce.b3

                /* renamed from: a */
                public final /* synthetic */ int f3972a;

                /* renamed from: b */
                public final /* synthetic */ String f3973b;

                /* renamed from: c */
                public final /* synthetic */ AtomicInteger f3974c;

                public /* synthetic */ ThreadFactoryC1022b3(int i102, String str2, AtomicInteger atomicInteger) {
                    r1 = i102;
                    r2 = str2;
                    r3 = atomicInteger;
                }

                @Override // java.util.concurrent.ThreadFactory
                public final Thread newThread(Runnable runnable) {
                    Thread m4288c;
                    m4288c = C1027c3.m4288c(r1, r2, r3, runnable);
                    return m4288c;
                }
            }));
        }
        throw new IllegalArgumentException(("Expected at least one thread, but " + i102 + " specified").toString());
    }

    /* renamed from: c */
    public static final Thread m4288c(int i10, String str, AtomicInteger atomicInteger, Runnable runnable) {
        if (i10 != 1) {
            str = str + '-' + atomicInteger.incrementAndGet();
        }
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(true);
        return thread;
    }
}
