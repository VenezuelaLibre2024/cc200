package com.google.android.gms.internal.location;

import com.google.android.gms.tasks.TaskCompletionSource;
import p096g6.C2034j;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzck implements zzcs {
    public final /* synthetic */ C2034j zza;
    public final /* synthetic */ TaskCompletionSource zzb;

    public zzck(zzda zzdaVar, C2034j c2034j, TaskCompletionSource taskCompletionSource) {
        this.zza = c2034j;
        this.zzb = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.location.zzcs
    public final C2034j zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.location.zzcs
    public final void zzb() {
        this.zzb.trySetResult(null);
    }

    @Override // com.google.android.gms.internal.location.zzcs
    public final void zzc(C2034j c2034j) {
        throw new IllegalStateException();
    }
}
