package com.google.android.gms.internal.p377firebaseauthapi;

import p337x7.C5712r;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzyo implements zzadm<zzaen> {
    private final /* synthetic */ zzacf zza;
    private final /* synthetic */ zzyl zzb;

    public zzyo(zzyl zzylVar, zzacf zzacfVar) {
        this.zza = zzacfVar;
        this.zzb = zzylVar;
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzadm
    public final /* synthetic */ void zza(zzaen zzaenVar) {
        zzaen zzaenVar2 = zzaenVar;
        if (zzaenVar2.zzf()) {
            this.zza.zza(new zzyi(zzaenVar2.zzc(), zzaenVar2.zze(), null));
        } else {
            this.zzb.zza(new zzafm(zzaenVar2.zzd(), zzaenVar2.zzb(), Long.valueOf(zzaenVar2.zza()), "Bearer"), null, null, Boolean.valueOf(zzaenVar2.zzg()), null, this.zza, this);
        }
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzadj
    public final void zza(String str) {
        this.zza.zza(C5712r.m22812a(str));
    }
}
