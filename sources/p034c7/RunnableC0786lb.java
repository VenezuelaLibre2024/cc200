package p034c7;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzpn;

/* renamed from: c7.lb */
/* loaded from: classes.dex */
public final class RunnableC0786lb implements Runnable {

    /* renamed from: h */
    public long f3285h;

    /* renamed from: i */
    public long f3286i;

    /* renamed from: j */
    public final /* synthetic */ C0730hb f3287j;

    public RunnableC0786lb(C0730hb c0730hb, long j10, long j11) {
        this.f3287j = c0730hb;
        this.f3285h = j10;
        this.f3286i = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f3287j.f3035b.zzl().m3152y(new Runnable() { // from class: c7.kb
            public /* synthetic */ RunnableC0772kb() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                RunnableC0786lb runnableC0786lb = RunnableC0786lb.this;
                C0730hb c0730hb = runnableC0786lb.f3287j;
                long j10 = runnableC0786lb.f3285h;
                long j11 = runnableC0786lb.f3286i;
                c0730hb.f3035b.mo3099i();
                c0730hb.f3035b.zzj().m3913A().m3995a("Application going to the background");
                c0730hb.f3035b.mo3095e().f3167u.m3527a(true);
                c0730hb.f3035b.m3256y(true);
                if (!c0730hb.f3035b.mo3092a().m3270M()) {
                    c0730hb.f3035b.f3002f.m3651e(j11);
                    c0730hb.f3035b.m3257z(false, false, j11);
                }
                if (zzpn.zza() && c0730hb.f3035b.mo3092a().m3281o(C0733i0.f3050G0)) {
                    c0730hb.f3035b.zzj().m3917E().m3996b("Application backgrounded at: timestamp_millis", Long.valueOf(j10));
                } else {
                    c0730hb.f3035b.mo3103m().m3956Q("auto", "_ab", j10, new Bundle());
                }
            }
        });
    }
}
