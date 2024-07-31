package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.ConstraintProxy;
import p029c2.AbstractC0592j;
import p044d2.C1527i;
import p178m2.C3503d;

/* loaded from: classes.dex */
public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {

    /* renamed from: a */
    public static final String f2026a = AbstractC0592j.m2972f("ConstrntProxyUpdtRecvr");

    /* renamed from: androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver$a */
    /* loaded from: classes.dex */
    public class RunnableC0422a implements Runnable {

        /* renamed from: h */
        public final /* synthetic */ Intent f2027h;

        /* renamed from: i */
        public final /* synthetic */ Context f2028i;

        /* renamed from: j */
        public final /* synthetic */ BroadcastReceiver.PendingResult f2029j;

        public RunnableC0422a(Intent intent, Context context, BroadcastReceiver.PendingResult pendingResult) {
            this.f2027h = intent;
            this.f2028i = context;
            this.f2029j = pendingResult;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                boolean booleanExtra = this.f2027h.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra2 = this.f2027h.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                boolean booleanExtra3 = this.f2027h.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra4 = this.f2027h.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                AbstractC0592j.m2970c().mo2973a(ConstraintProxyUpdateReceiver.f2026a, String.format("Updating proxies: BatteryNotLowProxy enabled (%s), BatteryChargingProxy enabled (%s), StorageNotLowProxy (%s), NetworkStateProxy enabled (%s)", Boolean.valueOf(booleanExtra), Boolean.valueOf(booleanExtra2), Boolean.valueOf(booleanExtra3), Boolean.valueOf(booleanExtra4)), new Throwable[0]);
                C3503d.m13047a(this.f2028i, ConstraintProxy.BatteryNotLowProxy.class, booleanExtra);
                C3503d.m13047a(this.f2028i, ConstraintProxy.BatteryChargingProxy.class, booleanExtra2);
                C3503d.m13047a(this.f2028i, ConstraintProxy.StorageNotLowProxy.class, booleanExtra3);
                C3503d.m13047a(this.f2028i, ConstraintProxy.NetworkStateProxy.class, booleanExtra4);
            } finally {
                this.f2029j.finish();
            }
        }
    }

    /* renamed from: a */
    public static Intent m2161a(Context context, boolean z10, boolean z11, boolean z12, boolean z13) {
        Intent intent = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
        intent.setComponent(new ComponentName(context, (Class<?>) ConstraintProxyUpdateReceiver.class));
        intent.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z10).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z11).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z12).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z13);
        return intent;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        if ("androidx.work.impl.background.systemalarm.UpdateProxies".equals(action)) {
            C1527i.m6192k(context).m6200p().mo14611b(new RunnableC0422a(intent, context, goAsync()));
        } else {
            AbstractC0592j.m2970c().mo2973a(f2026a, String.format("Ignoring unknown action %s", action), new Throwable[0]);
        }
    }
}
