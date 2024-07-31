package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import p277t5.C4694c;

/* loaded from: classes.dex */
final class zzz extends zzl {
    public final /* synthetic */ TaskCompletionSource zza;

    public zzz(zzab zzabVar, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.auth.zzm
    public final void zzb(Status status, C4694c c4694c) {
        zzab.zzf(status, c4694c, this.zza);
    }
}
