package com.google.android.gms.internal.p376authapiphone;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import p096g6.C2074w;

/* loaded from: classes.dex */
final class zzq extends zzf {
    public final /* synthetic */ TaskCompletionSource zza;

    public zzq(zzr zzrVar, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.p376authapiphone.zzg
    public final void zzb(Status status, boolean z10) {
        C2074w.m8279b(status, Boolean.valueOf(z10), this.zza);
    }
}
