package com.google.android.gms.internal.p377firebaseauthapi;

import com.google.android.gms.tasks.OnFailureListener;
import p154k6.C3363a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzadv implements OnFailureListener {
    public zzadv(zzadt zzadtVar) {
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        C3363a c3363a;
        c3363a = zzadt.zza;
        c3363a.m12508c("SmsRetrieverClient failed to start: " + exc.getMessage(), new Object[0]);
    }
}
