package com.google.android.gms.internal.p375authapi;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import p096g6.C2074w;

/* loaded from: classes.dex */
final class zbao extends zbq {
    public final /* synthetic */ TaskCompletionSource zba;

    public zbao(zbaq zbaqVar, TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.p375authapi.zbr
    public final void zbb(Status status, PendingIntent pendingIntent) {
        C2074w.m8279b(status, pendingIntent, this.zba);
    }
}
