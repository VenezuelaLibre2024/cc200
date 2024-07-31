package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import p079f6.AbstractC1846f;
import p079f6.AbstractC1848h;
import p320w6.InterfaceC5290b;

/* loaded from: classes.dex */
public final class zzw implements InterfaceC5290b {
    public final AbstractC1848h<Status> removeActivityUpdates(AbstractC1846f abstractC1846f, PendingIntent pendingIntent) {
        return abstractC1846f.mo7589b(new zzu(this, abstractC1846f, pendingIntent));
    }

    public final AbstractC1848h<Status> requestActivityUpdates(AbstractC1846f abstractC1846f, long j10, PendingIntent pendingIntent) {
        return abstractC1846f.mo7589b(new zzt(this, abstractC1846f, j10, pendingIntent));
    }
}
