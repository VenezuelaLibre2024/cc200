package com.google.android.gms.internal.p375authapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import p108h6.C2343b;
import p335x5.C5605f;

/* loaded from: classes.dex */
final class zbae extends zbs {
    public final /* synthetic */ TaskCompletionSource zba;

    public zbae(zbag zbagVar, TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.p375authapi.zbt
    public final void zbb(Status status, C5605f c5605f) {
        if (status.m4991N()) {
            this.zba.setResult(c5605f);
        } else {
            this.zba.setException(C2343b.m9513a(status));
        }
    }
}
