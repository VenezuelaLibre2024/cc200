package com.google.android.gms.internal.p375authapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import p108h6.C2343b;
import p335x5.C5596a;

/* loaded from: classes.dex */
final class zbz extends zbi {
    public final /* synthetic */ TaskCompletionSource zba;

    public zbz(zbaa zbaaVar, TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.p375authapi.zbj
    public final void zbb(Status status, C5596a c5596a) {
        if (status.m4991N()) {
            this.zba.setResult(c5596a);
        } else {
            this.zba.setException(C2343b.m9513a(status));
        }
    }
}
