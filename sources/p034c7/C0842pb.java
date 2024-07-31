package p034c7;

import android.app.ActivityManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzpt;

/* renamed from: c7.pb */
/* loaded from: classes.dex */
public final class C0842pb {

    /* renamed from: a */
    public final /* synthetic */ C0716gb f3458a;

    public C0842pb(C0716gb c0716gb) {
        this.f3458a = c0716gb;
    }

    /* renamed from: a */
    public final void m3727a() {
        this.f3458a.mo3099i();
        if (this.f3458a.mo3095e().m3423t(this.f3458a.zzb().mo14932a())) {
            this.f3458a.mo3095e().f3160n.m3527a(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                this.f3458a.zzj().m3918F().m3995a("Detected application was in foreground");
                m3729c(this.f3458a.zzb().mo14932a(), false);
            }
        }
    }

    /* renamed from: b */
    public final void m3728b(long j10, boolean z10) {
        this.f3458a.mo3099i();
        this.f3458a.m3255B();
        if (this.f3458a.mo3095e().m3423t(j10)) {
            this.f3458a.mo3095e().f3160n.m3527a(true);
            if (zzpt.zza() && this.f3458a.mo3092a().m3281o(C0733i0.f3128s0)) {
                this.f3458a.mo3101k().m3700D();
            }
        }
        this.f3458a.mo3095e().f3164r.m3619b(j10);
        if (this.f3458a.mo3095e().f3160n.m3528b()) {
            m3729c(j10, z10);
        }
    }

    /* renamed from: c */
    public final void m3729c(long j10, boolean z10) {
        this.f3458a.mo3099i();
        if (this.f3458a.f3198a.m3503k()) {
            this.f3458a.mo3095e().f3164r.m3619b(j10);
            this.f3458a.zzj().m3918F().m3996b("Session started, time", Long.valueOf(this.f3458a.zzb().mo14933b()));
            Long valueOf = Long.valueOf(j10 / 1000);
            this.f3458a.mo3103m().m3962W("auto", "_sid", valueOf, j10);
            this.f3458a.mo3095e().f3165s.m3619b(valueOf.longValue());
            this.f3458a.mo3095e().f3160n.m3527a(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", valueOf.longValue());
            this.f3458a.mo3103m().m3956Q("auto", "_s", j10, bundle);
            String m3673a = this.f3458a.mo3095e().f3170x.m3673a();
            if (TextUtils.isEmpty(m3673a)) {
                return;
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("_ffr", m3673a);
            this.f3458a.mo3103m().m3956Q("auto", "_ssr", j10, bundle2);
        }
    }
}
