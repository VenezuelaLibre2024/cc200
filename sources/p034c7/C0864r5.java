package p034c7;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzby;
import p237q6.C4194b;
import p237q6.C4195c;

/* renamed from: c7.r5 */
/* loaded from: classes.dex */
public final class C0864r5 {

    /* renamed from: a */
    public final C0767k6 f3506a;

    public C0864r5(C0968yb c0968yb) {
        this.f3506a = c0968yb.m4087e0();
    }

    /* renamed from: a */
    public final Bundle m3816a(String str, zzby zzbyVar) {
        this.f3506a.zzl().mo3099i();
        if (zzbyVar == null) {
            this.f3506a.zzj().m3919G().m3995a("Attempting to use Install Referrer Service while it is not initialized");
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("package_name", str);
        try {
            Bundle zza = zzbyVar.zza(bundle);
            if (zza != null) {
                return zza;
            }
            this.f3506a.zzj().m3914B().m3995a("Install Referrer Service returned a null response");
            return null;
        } catch (Exception e10) {
            this.f3506a.zzj().m3914B().m3996b("Exception occurred while retrieving the Install Referrer", e10.getMessage());
            return null;
        }
    }

    /* renamed from: b */
    public final boolean m3817b() {
        try {
            C4194b m16183a = C4195c.m16183a(this.f3506a.zza());
            if (m16183a != null) {
                return m16183a.m16180e("com.android.vending", 128).versionCode >= 80837300;
            }
            this.f3506a.zzj().m3918F().m3995a("Failed to get PackageManager for Install Referrer Play Store compatibility check");
            return false;
        } catch (Exception e10) {
            this.f3506a.zzj().m3918F().m3996b("Failed to retrieve Play Store version for Install Referrer", e10);
            return false;
        }
    }
}
