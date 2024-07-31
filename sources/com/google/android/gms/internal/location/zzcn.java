package com.google.android.gms.internal.location;

import com.google.android.gms.tasks.TaskCompletionSource;
import p096g6.C2074w;

/* loaded from: classes.dex */
final class zzcn extends zzj {
    public final /* synthetic */ Object zza;
    public final /* synthetic */ TaskCompletionSource zzb;

    public zzcn(Object obj, TaskCompletionSource taskCompletionSource) {
        this.zza = obj;
        this.zzb = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.location.zzk
    public final void zzd(zzg zzgVar) {
        C2074w.m8279b(zzgVar.getStatus(), this.zza, this.zzb);
    }

    @Override // com.google.android.gms.internal.location.zzk
    public final void zze() {
    }
}
