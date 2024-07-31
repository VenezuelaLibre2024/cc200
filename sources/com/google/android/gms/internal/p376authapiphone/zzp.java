package com.google.android.gms.internal.p376authapiphone;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import p096g6.C2074w;

/* loaded from: classes.dex */
final class zzp extends zzd {
    public final /* synthetic */ TaskCompletionSource zza;

    public zzp(zzr zzrVar, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.p376authapiphone.zze
    public final void zzb(Status status, int i10) {
        C2074w.m8279b(status, Integer.valueOf(i10), this.zza);
    }
}
