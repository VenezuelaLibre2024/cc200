package p034c7;

import android.os.Handler;

/* renamed from: c7.hb */
/* loaded from: classes.dex */
public final class C0730hb {

    /* renamed from: a */
    public RunnableC0786lb f3034a;

    /* renamed from: b */
    public final /* synthetic */ C0716gb f3035b;

    public C0730hb(C0716gb c0716gb) {
        this.f3035b = c0716gb;
    }

    /* renamed from: a */
    public final void m3297a() {
        Handler handler;
        this.f3035b.mo3099i();
        if (this.f3034a != null) {
            handler = this.f3035b.f2999c;
            handler.removeCallbacks(this.f3034a);
        }
        this.f3035b.mo3095e().f3167u.m3527a(false);
        this.f3035b.m3256y(false);
    }

    /* renamed from: b */
    public final void m3298b(long j10) {
        Handler handler;
        this.f3034a = new RunnableC0786lb(this, this.f3035b.zzb().mo14932a(), j10);
        handler = this.f3035b.f2999c;
        handler.postDelayed(this.f3034a, 2000L);
    }
}
