package com.google.android.gms.internal.p377firebaseauthapi;

import p337x7.C5712r;

/* loaded from: classes.dex */
final class zzzp implements zzadm<zzaep> {
    private final /* synthetic */ zzzm zza;

    public zzzp(zzzm zzzmVar) {
        this.zza = zzzmVar;
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzadm
    public final /* synthetic */ void zza(zzaep zzaepVar) {
        zzaep zzaepVar2 = zzaepVar;
        zzafm zzafmVar = new zzafm(zzaepVar2.zzb(), zzaepVar2.zza(), Long.valueOf(zzafo.zza(zzaepVar2.zza())), "Bearer");
        zzzm zzzmVar = this.zza;
        zzzmVar.zzb.zza(zzafmVar, null, null, Boolean.FALSE, null, zzzmVar.zza, this);
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzadj
    public final void zza(String str) {
        this.zza.zza.zza(C5712r.m22812a(str));
    }
}
