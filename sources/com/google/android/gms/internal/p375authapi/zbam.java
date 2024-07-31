package com.google.android.gms.internal.p375authapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import p096g6.C2074w;
import p335x5.C5600c;

/* loaded from: classes.dex */
final class zbam extends zbl {
    public final /* synthetic */ TaskCompletionSource zba;

    public zbam(zbaq zbaqVar, TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.p375authapi.zbm
    public final void zbb(Status status, C5600c c5600c) {
        C2074w.m8279b(status, c5600c, this.zba);
    }
}
