package p034c7;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import p108h6.C2394s;

/* renamed from: c7.f5 */
/* loaded from: classes.dex */
public class C0696f5 extends BroadcastReceiver {

    /* renamed from: d */
    public static final String f2921d = C0696f5.class.getName();

    /* renamed from: a */
    public final C0968yb f2922a;

    /* renamed from: b */
    public boolean f2923b;

    /* renamed from: c */
    public boolean f2924c;

    public C0696f5(C0968yb c0968yb) {
        C2394s.m9619l(c0968yb);
        this.f2922a = c0968yb;
    }

    /* renamed from: b */
    public final void m3165b() {
        this.f2922a.m4099l0();
        this.f2922a.zzl().mo3099i();
        if (this.f2923b) {
            return;
        }
        this.f2922a.zza().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        this.f2924c = this.f2922a.m4084c0().m3127v();
        this.f2922a.zzj().m3918F().m3996b("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.f2924c));
        this.f2923b = true;
    }

    /* renamed from: c */
    public final void m3166c() {
        this.f2922a.m4099l0();
        this.f2922a.zzl().mo3099i();
        this.f2922a.zzl().mo3099i();
        if (this.f2923b) {
            this.f2922a.zzj().m3918F().m3995a("Unregistering connectivity change receiver");
            this.f2923b = false;
            this.f2924c = false;
            try {
                this.f2922a.zza().unregisterReceiver(this);
            } catch (IllegalArgumentException e10) {
                this.f2922a.zzj().m3914B().m3996b("Failed to unregister the network broadcast receiver", e10);
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        this.f2922a.m4099l0();
        String action = intent.getAction();
        this.f2922a.zzj().m3918F().m3996b("NetworkBroadcastReceiver received action", action);
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            this.f2922a.zzj().m3919G().m3996b("NetworkBroadcastReceiver received unknown action", action);
            return;
        }
        boolean m3127v = this.f2922a.m4084c0().m3127v();
        if (this.f2924c != m3127v) {
            this.f2924c = m3127v;
            this.f2922a.zzl().m3152y(new RunnableC0752j5(this, m3127v));
        }
    }
}
