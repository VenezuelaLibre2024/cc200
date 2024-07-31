package p337x7;

import android.os.Handler;
import android.os.HandlerThread;
import com.google.android.gms.internal.p377firebaseauthapi.zzg;
import p108h6.C2394s;
import p154k6.C3363a;
import p195n7.C3767g;
import p207o6.C3938g;

/* renamed from: x7.t */
/* loaded from: classes.dex */
public final class C5718t {

    /* renamed from: h */
    public static C3363a f21245h = new C3363a("TokenRefresher", "FirebaseAuth:");

    /* renamed from: a */
    public final C3767g f21246a;

    /* renamed from: b */
    public volatile long f21247b;

    /* renamed from: c */
    public volatile long f21248c;

    /* renamed from: d */
    public long f21249d;

    /* renamed from: e */
    public HandlerThread f21250e;

    /* renamed from: f */
    public Handler f21251f;

    /* renamed from: g */
    public Runnable f21252g;

    public C5718t(C3767g c3767g) {
        f21245h.m12512g("Initializing TokenRefresher", new Object[0]);
        C3767g c3767g2 = (C3767g) C2394s.m9619l(c3767g);
        this.f21246a = c3767g2;
        HandlerThread handlerThread = new HandlerThread("TokenRefresher", 10);
        this.f21250e = handlerThread;
        handlerThread.start();
        this.f21251f = new zzg(this.f21250e.getLooper());
        this.f21252g = new RunnableC5727w(this, c3767g2.m14350q());
        this.f21249d = 300000L;
    }

    /* renamed from: b */
    public final void m22822b() {
        this.f21251f.removeCallbacks(this.f21252g);
    }

    /* renamed from: c */
    public final void m22823c() {
        f21245h.m12512g("Scheduling refresh for " + (this.f21247b - this.f21249d), new Object[0]);
        m22822b();
        this.f21248c = Math.max((this.f21247b - C3938g.m14938d().mo14932a()) - this.f21249d, 0L) / 1000;
        this.f21251f.postDelayed(this.f21252g, this.f21248c * 1000);
    }

    /* renamed from: d */
    public final void m22824d() {
        int i10 = (int) this.f21248c;
        this.f21248c = (i10 == 30 || i10 == 60 || i10 == 120 || i10 == 240 || i10 == 480) ? 2 * this.f21248c : i10 != 960 ? 30L : 960L;
        this.f21247b = C3938g.m14938d().mo14932a() + (this.f21248c * 1000);
        f21245h.m12512g("Scheduling refresh for " + this.f21247b, new Object[0]);
        this.f21251f.postDelayed(this.f21252g, this.f21248c * 1000);
    }
}
