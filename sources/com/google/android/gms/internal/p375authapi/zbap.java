package com.google.android.gms.internal.p375authapi;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import p096g6.C2074w;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zbap extends zbo {
    public final /* synthetic */ TaskCompletionSource zba;

    public zbap(zbaq zbaqVar, TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.p375authapi.zbp
    public final void zbb(Status status, PendingIntent pendingIntent) {
        C2074w.m8279b(status, pendingIntent, this.zba);
    }
}
