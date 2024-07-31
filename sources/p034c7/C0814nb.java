package p034c7;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzoj;

/* renamed from: c7.nb */
/* loaded from: classes.dex */
public final class C0814nb {

    /* renamed from: a */
    public long f3373a;

    /* renamed from: b */
    public long f3374b;

    /* renamed from: c */
    public final AbstractC0900u f3375c;

    /* renamed from: d */
    public final /* synthetic */ C0716gb f3376d;

    public C0814nb(C0716gb c0716gb) {
        this.f3376d = c0716gb;
        this.f3375c = new C0800mb(this, c0716gb.f3198a);
        long mo14933b = c0716gb.zzb().mo14933b();
        this.f3373a = mo14933b;
        this.f3374b = mo14933b;
    }

    /* renamed from: c */
    public static /* synthetic */ void m3647c(C0814nb c0814nb) {
        c0814nb.f3376d.mo3099i();
        c0814nb.m3650d(false, false, c0814nb.f3376d.zzb().mo14933b());
        c0814nb.f3376d.mo3100j().m3107q(c0814nb.f3376d.zzb().mo14933b());
    }

    /* renamed from: a */
    public final long m3648a(long j10) {
        long j11 = j10 - this.f3374b;
        this.f3374b = j10;
        return j11;
    }

    /* renamed from: b */
    public final void m3649b() {
        this.f3375c.m3850a();
        this.f3373a = 0L;
        this.f3374b = 0L;
    }

    /* renamed from: d */
    public final boolean m3650d(boolean z10, boolean z11, long j10) {
        this.f3376d.mo3099i();
        this.f3376d.m3155q();
        if (!zzoj.zza() || !this.f3376d.mo3092a().m3281o(C0733i0.f3118n0) || this.f3376d.f3198a.m3503k()) {
            this.f3376d.mo3095e().f3164r.m3619b(this.f3376d.zzb().mo14932a());
        }
        long j11 = j10 - this.f3373a;
        if (!z10 && j11 < 1000) {
            this.f3376d.zzj().m3918F().m3996b("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j11));
            return false;
        }
        if (!z11) {
            j11 = m3648a(j10);
        }
        this.f3376d.zzj().m3918F().m3996b("Recording user engagement, ms", Long.valueOf(j11));
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j11);
        C0857qc.m3741L(this.f3376d.mo3104n().m3724x(!this.f3376d.mo3092a().m3270M()), bundle, true);
        if (!z11) {
            this.f3376d.mo3103m().m3989x0("auto", "_e", bundle);
        }
        this.f3373a = j10;
        this.f3375c.m3850a();
        this.f3375c.m3851b(3600000L);
        return true;
    }

    /* renamed from: e */
    public final void m3651e(long j10) {
        this.f3375c.m3850a();
    }

    /* renamed from: f */
    public final void m3652f(long j10) {
        this.f3376d.mo3099i();
        this.f3375c.m3850a();
        this.f3373a = j10;
        this.f3374b = j10;
    }
}
