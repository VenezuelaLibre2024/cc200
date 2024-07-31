package com.google.android.gms.internal.location;

import com.google.android.gms.tasks.TaskCompletionSource;
import p096g6.C2074w;
import p320w6.InterfaceC5323r0;

/* loaded from: classes.dex */
final class zzcp extends zzj {
    public final /* synthetic */ TaskCompletionSource zza;
    public final /* synthetic */ InterfaceC5323r0 zzb;

    public zzcp(TaskCompletionSource taskCompletionSource, InterfaceC5323r0 interfaceC5323r0) {
        this.zza = taskCompletionSource;
        this.zzb = interfaceC5323r0;
    }

    @Override // com.google.android.gms.internal.location.zzk
    public final void zzd(zzg zzgVar) {
        C2074w.m8278a(zzgVar.getStatus(), this.zza);
    }

    @Override // com.google.android.gms.internal.location.zzk
    public final void zze() {
        this.zzb.zzf();
    }
}
