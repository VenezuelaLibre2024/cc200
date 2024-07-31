package com.google.android.gms.internal.p376authapiphone;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import p096g6.C2074w;

/* loaded from: classes.dex */
final class zzaa extends zzi {
    public final /* synthetic */ TaskCompletionSource zza;

    public zzaa(zzab zzabVar, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.p376authapiphone.zzj
    public final void zzb(Status status) {
        C2074w.m8278a(status, this.zza);
    }
}
