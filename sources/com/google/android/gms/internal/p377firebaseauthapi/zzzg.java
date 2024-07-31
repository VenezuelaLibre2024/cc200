package com.google.android.gms.internal.p377firebaseauthapi;

import p337x7.C5712r;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzzg implements zzadm<zzafm> {
    public final /* synthetic */ String zza;
    public final /* synthetic */ zzacf zzb;
    public final /* synthetic */ zzyl zzc;

    public zzzg(zzyl zzylVar, String str, zzacf zzacfVar) {
        this.zza = str;
        this.zzb = zzacfVar;
        this.zzc = zzylVar;
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzadm
    public final /* synthetic */ void zza(zzafm zzafmVar) {
        zzadk zzadkVar;
        zzafm zzafmVar2 = zzafmVar;
        zzaez zzaezVar = new zzaez(zzafmVar2.zzc());
        zzadkVar = this.zzc.zza;
        zzadkVar.zza(zzaezVar, new zzzj(this, this, zzafmVar2));
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzadj
    public final void zza(String str) {
        this.zzb.zza(C5712r.m22812a(str));
    }
}
