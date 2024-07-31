package p223p6;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import p108h6.C2394s;

/* renamed from: p6.c */
/* loaded from: classes.dex */
public class ThreadFactoryC4057c implements ThreadFactory {

    /* renamed from: a */
    public final String f14609a;

    /* renamed from: b */
    public final AtomicInteger f14610b = new AtomicInteger();

    /* renamed from: c */
    public final ThreadFactory f14611c = Executors.defaultThreadFactory();

    public ThreadFactoryC4057c(String str) {
        C2394s.m9620m(str, "Name must not be null");
        this.f14609a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f14611c.newThread(new RunnableC4058d(runnable, 0));
        newThread.setName(this.f14609a + "[" + this.f14610b.getAndIncrement() + "]");
        return newThread;
    }
}
