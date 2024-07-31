package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;
import p029c2.AbstractC0592j;
import p029c2.AbstractC0602t;
import p029c2.C0594l;

/* loaded from: classes.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {

    /* renamed from: a */
    public static final String f2073a = AbstractC0592j.m2972f("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        AbstractC0592j.m2970c().mo2973a(f2073a, "Requesting diagnostics", new Throwable[0]);
        try {
            AbstractC0602t.m2987e(context).m2991c(C0594l.m2978e(DiagnosticsWorker.class));
        } catch (IllegalStateException e10) {
            AbstractC0592j.m2970c().mo2974b(f2073a, "WorkManager is not initialized", e10);
        }
    }
}
