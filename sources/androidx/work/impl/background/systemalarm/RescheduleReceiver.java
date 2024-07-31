package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import p029c2.AbstractC0592j;
import p044d2.C1527i;

/* loaded from: classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {

    /* renamed from: a */
    public static final String f2031a = AbstractC0592j.m2972f("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        AbstractC0592j.m2970c().mo2973a(f2031a, String.format("Received intent %s", intent), new Throwable[0]);
        if (Build.VERSION.SDK_INT < 23) {
            context.startService(C0423a.m2167e(context));
            return;
        }
        try {
            C1527i.m6192k(context).m6204t(goAsync());
        } catch (IllegalStateException e10) {
            AbstractC0592j.m2970c().mo2974b(f2031a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e10);
        }
    }
}
