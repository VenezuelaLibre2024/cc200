package p034c7;

import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzby;
import com.google.android.gms.internal.measurement.zzok;
import com.google.android.gms.internal.measurement.zzpz;
import p194n6.C3760a;

/* renamed from: c7.t5 */
/* loaded from: classes.dex */
public final class RunnableC0892t5 implements Runnable {

    /* renamed from: h */
    public final /* synthetic */ zzby f3588h;

    /* renamed from: i */
    public final /* synthetic */ ServiceConnection f3589i;

    /* renamed from: j */
    public final /* synthetic */ ServiceConnectionC0850q5 f3590j;

    public RunnableC0892t5(ServiceConnectionC0850q5 serviceConnectionC0850q5, zzby zzbyVar, ServiceConnection serviceConnection) {
        this.f3588h = zzbyVar;
        this.f3589i = serviceConnection;
        this.f3590j = serviceConnectionC0850q5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        C0947x4 m3914B;
        String str2;
        ServiceConnectionC0850q5 serviceConnectionC0850q5 = this.f3590j;
        C0864r5 c0864r5 = serviceConnectionC0850q5.f3464i;
        str = serviceConnectionC0850q5.f3463h;
        zzby zzbyVar = this.f3588h;
        ServiceConnection serviceConnection = this.f3589i;
        Bundle m3816a = c0864r5.m3816a(str, zzbyVar);
        c0864r5.f3506a.zzl().mo3099i();
        c0864r5.f3506a.m3496L();
        if (m3816a != null) {
            long j10 = m3816a.getLong("install_begin_timestamp_seconds", 0L) * 1000;
            if (j10 == 0) {
                m3914B = c0864r5.f3506a.zzj().m3919G();
                str2 = "Service response is missing Install Referrer install timestamp";
            } else {
                String string = m3816a.getString("install_referrer");
                if (string == null || string.isEmpty()) {
                    m3914B = c0864r5.f3506a.zzj().m3914B();
                    str2 = "No referrer defined in Install Referrer response";
                } else {
                    c0864r5.f3506a.zzj().m3918F().m3996b("InstallReferrer API result", string);
                    Bundle m3812x = c0864r5.f3506a.m3491G().m3812x(Uri.parse("?" + string), zzpz.zza() && c0864r5.f3506a.m3513u().m3281o(C0733i0.f3040B0), zzok.zza() && c0864r5.f3506a.m3513u().m3281o(C0733i0.f3084X0));
                    if (m3812x == null) {
                        m3914B = c0864r5.f3506a.zzj().m3914B();
                        str2 = "No campaign params defined in Install Referrer result";
                    } else {
                        String string2 = m3812x.getString("medium");
                        if ((string2 == null || "(not set)".equalsIgnoreCase(string2) || "organic".equalsIgnoreCase(string2)) ? false : true) {
                            long j11 = m3816a.getLong("referrer_click_timestamp_seconds", 0L) * 1000;
                            if (j11 == 0) {
                                m3914B = c0864r5.f3506a.zzj().m3914B();
                                str2 = "Install Referrer is missing click timestamp for ad campaign";
                            } else {
                                m3812x.putLong("click_timestamp", j11);
                            }
                        }
                        if (j10 == c0864r5.f3506a.m3485A().f3154h.m3618a()) {
                            c0864r5.f3506a.zzj().m3918F().m3995a("Logging Install Referrer campaign from module while it may have already been logged.");
                        }
                        if (c0864r5.f3506a.m3503k()) {
                            c0864r5.f3506a.m3485A().f3154h.m3619b(j10);
                            c0864r5.f3506a.zzj().m3918F().m3996b("Logging Install Referrer campaign from gmscore with ", "referrer API v2");
                            m3812x.putString("_cis", "referrer API v2");
                            c0864r5.f3506a.m3487C().m3960U("auto", "_cmp", m3812x, str);
                        }
                    }
                }
            }
            m3914B.m3995a(str2);
        }
        if (serviceConnection != null) {
            C3760a.m14312b().m14317c(c0864r5.f3506a.zza(), serviceConnection);
        }
    }
}
