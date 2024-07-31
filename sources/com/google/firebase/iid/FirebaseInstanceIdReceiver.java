package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.C1285b;
import java.util.concurrent.ExecutionException;
import p048d6.AbstractC1563b;
import p048d6.C1561a;
import p099g9.C2184l;

/* loaded from: classes.dex */
public final class FirebaseInstanceIdReceiver extends AbstractC1563b {
    /* renamed from: g */
    public static Intent m5363g(Context context, String str, Bundle bundle) {
        return new Intent(str).putExtras(bundle);
    }

    @Override // p048d6.AbstractC1563b
    /* renamed from: b */
    public int mo5364b(Context context, C1561a c1561a) {
        try {
            return ((Integer) Tasks.await(new C2184l(context).m8789k(c1561a.m6388I()))).intValue();
        } catch (InterruptedException | ExecutionException e10) {
            Log.e("FirebaseMessaging", "Failed to send message to service.", e10);
            return 500;
        }
    }

    @Override // p048d6.AbstractC1563b
    /* renamed from: c */
    public void mo5365c(Context context, Bundle bundle) {
        Intent m5363g = m5363g(context, "com.google.firebase.messaging.NOTIFICATION_DISMISS", bundle);
        if (C1285b.m5454B(m5363g)) {
            C1285b.m5474s(m5363g);
        }
    }
}
