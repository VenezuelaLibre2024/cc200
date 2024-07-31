package p034c7;

import android.content.Context;
import java.lang.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p108h6.C2394s;
import p207o6.InterfaceC3935d;

/* renamed from: c7.d6 */
/* loaded from: classes.dex */
public final class C0669d6 extends AbstractC0740i7 {

    /* renamed from: l */
    public static final AtomicLong f2860l = new AtomicLong(Long.MIN_VALUE);

    /* renamed from: c */
    public C0725h6 f2861c;

    /* renamed from: d */
    public C0725h6 f2862d;

    /* renamed from: e */
    public final PriorityBlockingQueue<C0739i6<?>> f2863e;

    /* renamed from: f */
    public final BlockingQueue<C0739i6<?>> f2864f;

    /* renamed from: g */
    public final Thread.UncaughtExceptionHandler f2865g;

    /* renamed from: h */
    public final Thread.UncaughtExceptionHandler f2866h;

    /* renamed from: i */
    public final Object f2867i;

    /* renamed from: j */
    public final Semaphore f2868j;

    /* renamed from: k */
    public volatile boolean f2869k;

    public C0669d6(C0767k6 c0767k6) {
        super(c0767k6);
        this.f2867i = new Object();
        this.f2868j = new Semaphore(2);
        this.f2863e = new PriorityBlockingQueue<>();
        this.f2864f = new LinkedBlockingQueue();
        this.f2865g = new C0697f6(this, "Thread death: Uncaught exception on worker thread");
        this.f2866h = new C0697f6(this, "Thread death: Uncaught exception on network thread");
    }

    /* renamed from: B */
    public final void m3144B(Runnable runnable) {
        m3430k();
        C2394s.m9619l(runnable);
        m3149t(new C0739i6<>(this, runnable, true, "Task exception on worker thread"));
    }

    /* renamed from: E */
    public final boolean m3145E() {
        return Thread.currentThread() == this.f2861c;
    }

    @Override // p034c7.C0754j7
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C0718h mo3092a() {
        return super.mo3092a();
    }

    @Override // p034c7.C0754j7
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C0970z mo3093c() {
        return super.mo3093c();
    }

    @Override // p034c7.C0754j7
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ C0905u4 mo3094d() {
        return super.mo3094d();
    }

    @Override // p034c7.C0754j7
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ C0738i5 mo3095e() {
        return super.mo3095e();
    }

    @Override // p034c7.C0754j7
    /* renamed from: f */
    public final /* bridge */ /* synthetic */ C0857qc mo3096f() {
        return super.mo3096f();
    }

    @Override // p034c7.C0754j7
    /* renamed from: g */
    public final void mo3097g() {
        if (Thread.currentThread() != this.f2862d) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    @Override // p034c7.C0754j7
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ void mo3098h() {
        super.mo3098h();
    }

    @Override // p034c7.C0754j7
    /* renamed from: i */
    public final void mo3099i() {
        if (Thread.currentThread() != this.f2861c) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    @Override // p034c7.AbstractC0740i7
    /* renamed from: o */
    public final boolean mo3146o() {
        return false;
    }

    /* renamed from: q */
    public final <T> T m3147q(AtomicReference<T> atomicReference, long j10, String str, Runnable runnable) {
        synchronized (atomicReference) {
            zzl().m3152y(runnable);
            try {
                atomicReference.wait(j10);
            } catch (InterruptedException unused) {
                zzj().m3919G().m3995a("Interrupted waiting for " + str);
                return null;
            }
        }
        T t10 = atomicReference.get();
        if (t10 == null) {
            zzj().m3919G().m3995a("Timed out waiting for " + str);
        }
        return t10;
    }

    /* renamed from: r */
    public final <V> Future<V> m3148r(Callable<V> callable) {
        m3430k();
        C2394s.m9619l(callable);
        C0739i6<?> c0739i6 = new C0739i6<>(this, (Callable<?>) callable, false, "Task exception on worker thread");
        if (Thread.currentThread() == this.f2861c) {
            if (!this.f2863e.isEmpty()) {
                zzj().m3919G().m3995a("Callable skipped the worker queue.");
            }
            c0739i6.run();
        } else {
            m3149t(c0739i6);
        }
        return c0739i6;
    }

    /* renamed from: t */
    public final void m3149t(C0739i6<?> c0739i6) {
        synchronized (this.f2867i) {
            this.f2863e.add(c0739i6);
            C0725h6 c0725h6 = this.f2861c;
            if (c0725h6 == null) {
                C0725h6 c0725h62 = new C0725h6(this, "Measurement Worker", this.f2863e);
                this.f2861c = c0725h62;
                c0725h62.setUncaughtExceptionHandler(this.f2865g);
                this.f2861c.start();
            } else {
                c0725h6.m3293a();
            }
        }
    }

    /* renamed from: u */
    public final void m3150u(Runnable runnable) {
        m3430k();
        C2394s.m9619l(runnable);
        C0739i6<?> c0739i6 = new C0739i6<>(this, runnable, false, "Task exception on network thread");
        synchronized (this.f2867i) {
            this.f2864f.add(c0739i6);
            C0725h6 c0725h6 = this.f2862d;
            if (c0725h6 == null) {
                C0725h6 c0725h62 = new C0725h6(this, "Measurement Network", this.f2864f);
                this.f2862d = c0725h62;
                c0725h62.setUncaughtExceptionHandler(this.f2866h);
                this.f2862d.start();
            } else {
                c0725h6.m3293a();
            }
        }
    }

    /* renamed from: w */
    public final <V> Future<V> m3151w(Callable<V> callable) {
        m3430k();
        C2394s.m9619l(callable);
        C0739i6<?> c0739i6 = new C0739i6<>(this, (Callable<?>) callable, true, "Task exception on worker thread");
        if (Thread.currentThread() == this.f2861c) {
            c0739i6.run();
        } else {
            m3149t(c0739i6);
        }
        return c0739i6;
    }

    /* renamed from: y */
    public final void m3152y(Runnable runnable) {
        m3430k();
        C2394s.m9619l(runnable);
        m3149t(new C0739i6<>(this, runnable, false, "Task exception on worker thread"));
    }

    @Override // p034c7.C0754j7, p034c7.InterfaceC0782l7
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    @Override // p034c7.C0754j7, p034c7.InterfaceC0782l7
    public final /* bridge */ /* synthetic */ InterfaceC3935d zzb() {
        return super.zzb();
    }

    @Override // p034c7.C0754j7, p034c7.InterfaceC0782l7
    public final /* bridge */ /* synthetic */ C0647c zzd() {
        return super.zzd();
    }

    @Override // p034c7.C0754j7, p034c7.InterfaceC0782l7
    public final /* bridge */ /* synthetic */ C0919v4 zzj() {
        return super.zzj();
    }

    @Override // p034c7.C0754j7, p034c7.InterfaceC0782l7
    public final /* bridge */ /* synthetic */ C0669d6 zzl() {
        return super.zzl();
    }
}
