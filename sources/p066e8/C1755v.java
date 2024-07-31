package p066e8;

import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;
import p023b8.C0515g;
import p023b8.InterfaceC0509a;
import p171l8.InterfaceC3458i;

/* renamed from: e8.v */
/* loaded from: classes.dex */
public class C1755v implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    public final a f6481a;

    /* renamed from: b */
    public final InterfaceC3458i f6482b;

    /* renamed from: c */
    public final Thread.UncaughtExceptionHandler f6483c;

    /* renamed from: d */
    public final InterfaceC0509a f6484d;

    /* renamed from: e */
    public final AtomicBoolean f6485e = new AtomicBoolean(false);

    /* renamed from: e8.v$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        void mo6948a(InterfaceC3458i interfaceC3458i, Thread thread, Throwable th);
    }

    public C1755v(a aVar, InterfaceC3458i interfaceC3458i, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, InterfaceC0509a interfaceC0509a) {
        this.f6481a = aVar;
        this.f6482b = interfaceC3458i;
        this.f6483c = uncaughtExceptionHandler;
        this.f6484d = interfaceC0509a;
    }

    /* renamed from: a */
    public boolean m7032a() {
        return this.f6485e.get();
    }

    /* renamed from: b */
    public final boolean m7033b(Thread thread, Throwable th) {
        if (thread == null) {
            C0515g.m2482f().m2486d("Crashlytics will not record uncaught exception; null thread");
            return false;
        }
        if (th == null) {
            C0515g.m2482f().m2486d("Crashlytics will not record uncaught exception; null throwable");
            return false;
        }
        if (!this.f6484d.mo2460b()) {
            return true;
        }
        C0515g.m2482f().m2484b("Crashlytics will not record uncaught exception; native crash exists for session.");
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Thread$UncaughtExceptionHandler] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Thread$UncaughtExceptionHandler] */
    /* JADX WARN: Type inference failed for: r2v3, types: [b8.g] */
    /* JADX WARN: Type inference failed for: r3v1, types: [b8.g] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Thread] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Thread] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.concurrent.atomic.AtomicBoolean] */
    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        ?? r02 = "Completed exception processing. Invoking default exception handler.";
        this.f6485e.set(true);
        try {
            try {
                if (m7033b(thread, th)) {
                    this.f6481a.mo6948a(this.f6482b, thread, th);
                } else {
                    C0515g.m2482f().m2484b("Uncaught exception will not be recorded by Crashlytics.");
                }
            } catch (Exception e10) {
                C0515g.m2482f().m2487e("An error occurred in the uncaught exception handler", e10);
            }
        } finally {
            C0515g.m2482f().m2484b(r02);
            this.f6483c.uncaughtException(thread, th);
            this.f6485e.set(false);
        }
    }
}
