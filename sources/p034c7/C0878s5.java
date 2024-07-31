package p034c7;

import android.content.Context;
import android.content.Intent;
import p108h6.C2394s;

/* renamed from: c7.s5 */
/* loaded from: classes.dex */
public final class C0878s5 {

    /* renamed from: a */
    public final a f3560a;

    /* renamed from: c7.s5$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        void mo3841a(Context context, Intent intent);
    }

    public C0878s5(a aVar) {
        C2394s.m9619l(aVar);
        this.f3560a = aVar;
    }

    /* renamed from: a */
    public final void m3840a(Context context, Intent intent) {
        C0919v4 zzj = C0767k6.m3480a(context, null, null).zzj();
        if (intent == null) {
            zzj.m3919G().m3995a("Receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        zzj.m3918F().m3996b("Local receiver got", action);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
                zzj.m3919G().m3995a("Install Referrer Broadcasts are deprecated");
            }
        } else {
            Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            className.setAction("com.google.android.gms.measurement.UPLOAD");
            zzj.m3918F().m3995a("Starting wakeful intent.");
            this.f3560a.mo3841a(context, className);
        }
    }
}
