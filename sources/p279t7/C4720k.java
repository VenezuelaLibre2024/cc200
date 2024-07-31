package p279t7;

import com.google.android.gms.tasks.OnFailureListener;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p108h6.C2394s;
import p253r7.InterfaceC4319b;
import p253r7.InterfaceC4320c;

/* renamed from: t7.k */
/* loaded from: classes.dex */
public class C4720k {

    /* renamed from: a */
    public final C4717h f17620a;

    /* renamed from: b */
    public final Executor f17621b;

    /* renamed from: c */
    public final ScheduledExecutorService f17622c;

    /* renamed from: d */
    public volatile ScheduledFuture<?> f17623d;

    /* renamed from: e */
    public volatile long f17624e = -1;

    public C4720k(C4717h c4717h, @InterfaceC4320c Executor executor, @InterfaceC4319b ScheduledExecutorService scheduledExecutorService) {
        this.f17620a = (C4717h) C2394s.m9619l(c4717h);
        this.f17621b = executor;
        this.f17622c = scheduledExecutorService;
    }

    /* renamed from: e */
    public /* synthetic */ void m18550e(Exception exc) {
        m18555h();
    }

    /* renamed from: c */
    public void m18551c() {
        if (this.f17623d == null || this.f17623d.isDone()) {
            return;
        }
        this.f17623d.cancel(false);
    }

    /* renamed from: d */
    public final long m18552d() {
        if (this.f17624e == -1) {
            return 30L;
        }
        if (this.f17624e * 2 < 960) {
            return this.f17624e * 2;
        }
        return 960L;
    }

    /* renamed from: f */
    public final void m18553f() {
        this.f17620a.m18543h().addOnFailureListener(this.f17621b, new OnFailureListener() { // from class: t7.i
            public /* synthetic */ C4718i() {
            }

            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                C4720k.this.m18550e(exc);
            }
        });
    }

    /* renamed from: g */
    public void m18554g(long j10) {
        m18551c();
        this.f17624e = -1L;
        this.f17623d = this.f17622c.schedule(new RunnableC4719j(this), Math.max(0L, j10), TimeUnit.MILLISECONDS);
    }

    /* renamed from: h */
    public final void m18555h() {
        m18551c();
        this.f17624e = m18552d();
        this.f17623d = this.f17622c.schedule(new RunnableC4719j(this), this.f17624e, TimeUnit.SECONDS);
    }
}
