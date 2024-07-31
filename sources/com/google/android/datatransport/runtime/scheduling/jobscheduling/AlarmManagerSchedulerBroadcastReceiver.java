package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
import p093g3.AbstractC1978p;
import p093g3.C1983u;
import p249r3.C4292a;

/* loaded from: classes.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
    /* renamed from: b */
    public static /* synthetic */ void m4699b() {
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int intValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i10 = intent.getExtras().getInt("attemptNumber");
        C1983u.m8008f(context);
        AbstractC1978p.a mo7970d = AbstractC1978p.m7999a().mo7968b(queryParameter).mo7970d(C4292a.m16517b(intValue));
        if (queryParameter2 != null) {
            mo7970d.mo7969c(Base64.decode(queryParameter2, 0));
        }
        C1983u.m8006c().m8010e().m14030v(mo7970d.mo7967a(), i10, new Runnable() { // from class: n3.b
            @Override // java.lang.Runnable
            public final void run() {
                AlarmManagerSchedulerBroadcastReceiver.m4699b();
            }
        });
    }
}
