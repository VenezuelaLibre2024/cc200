package com.google.android.gms.internal.p377firebaseauthapi;

import p337x7.C5712r;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzym implements zzadm<zzagy> {
    private final /* synthetic */ zzacf zza;
    private final /* synthetic */ zzyl zzb;

    public zzym(zzyl zzylVar, zzacf zzacfVar) {
        this.zza = zzacfVar;
        this.zzb = zzylVar;
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzadm
    public final /* synthetic */ void zza(zzagy zzagyVar) {
        zzagy zzagyVar2 = zzagyVar;
        if (zzagyVar2.zzf()) {
            this.zza.zza(new zzyi(zzagyVar2.zzc(), zzagyVar2.zze(), null));
        } else {
            this.zzb.zza(new zzafm(zzagyVar2.zzd(), zzagyVar2.zzb(), Long.valueOf(zzagyVar2.zza()), "Bearer"), null, null, Boolean.FALSE, null, this.zza, this);
        }
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzadj
    public final void zza(String str) {
        this.zza.zza(C5712r.m22812a(str));
    }
}
