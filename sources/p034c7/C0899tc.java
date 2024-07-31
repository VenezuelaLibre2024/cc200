package p034c7;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.internal.measurement.zzph;
import java.util.Objects;

/* renamed from: c7.tc */
/* loaded from: classes.dex */
public final class C0899tc extends BroadcastReceiver {

    /* renamed from: a */
    public final C0767k6 f3602a;

    public C0899tc(C0767k6 c0767k6) {
        this.f3602a = c0767k6;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            this.f3602a.zzj().m3919G().m3995a("App receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        if (action == null) {
            this.f3602a.zzj().m3919G().m3995a("App receiver called with null action");
            return;
        }
        if (!action.equals("com.google.android.gms.measurement.TRIGGERS_AVAILABLE")) {
            this.f3602a.zzj().m3919G().m3995a("App receiver called with unknown action");
            return;
        }
        final C0767k6 c0767k6 = this.f3602a;
        if (zzph.zza() && c0767k6.m3513u().m3260A(null, C0733i0.f3054I0)) {
            c0767k6.zzj().m3918F().m3995a("App receiver notified triggers are available");
            c0767k6.zzl().m3152y(new Runnable() { // from class: c7.vc
                @Override // java.lang.Runnable
                public final void run() {
                    C0767k6 c0767k62 = C0767k6.this;
                    if (!c0767k62.m3491G().m3785Q0()) {
                        c0767k62.zzj().m3919G().m3995a("registerTrigger called but app not eligible");
                        return;
                    }
                    final C0936w7 m3487C = c0767k62.m3487C();
                    Objects.requireNonNull(m3487C);
                    new Thread(new Runnable() { // from class: c7.sc
                        @Override // java.lang.Runnable
                        public final void run() {
                            C0936w7.this.m3977l0();
                        }
                    }).start();
                }
            });
        }
    }
}
