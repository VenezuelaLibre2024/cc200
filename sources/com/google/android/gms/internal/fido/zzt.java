package com.google.android.gms.internal.fido;

import android.app.Activity;
import android.app.PendingIntent;

/* loaded from: classes.dex */
public final class zzt {
    private final PendingIntent zza;

    public zzt(PendingIntent pendingIntent) {
        this.zza = pendingIntent;
    }

    public final boolean hasPendingIntent() {
        return this.zza != null;
    }

    public final void launchPendingIntent(Activity activity, int i10) {
        PendingIntent pendingIntent = this.zza;
        if (pendingIntent == null) {
            throw new IllegalStateException("No PendingIntent available");
        }
        activity.startIntentSenderForResult(pendingIntent.getIntentSender(), i10, null, 0, 0, 0);
    }
}
