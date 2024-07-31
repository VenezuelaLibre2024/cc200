package p223p6;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import p108h6.C2394s;

/* renamed from: p6.b */
/* loaded from: classes.dex */
public class ThreadFactoryC4056b implements ThreadFactory {

    /* renamed from: a */
    public final String f14607a;

    /* renamed from: b */
    public final ThreadFactory f14608b = Executors.defaultThreadFactory();

    public ThreadFactoryC4056b(String str) {
        C2394s.m9620m(str, "Name must not be null");
        this.f14607a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f14608b.newThread(new RunnableC4058d(runnable, 0));
        newThread.setName(this.f14607a);
        return newThread;
    }
}
