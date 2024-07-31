package com.google.android.gms.internal.p377firebaseauthapi;

import p337x7.C5712r;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzzd implements zzadm<zzafm> {
    public final /* synthetic */ zzacf zza;
    public final /* synthetic */ zzyl zzb;
    private final /* synthetic */ zzagx zzc;

    public zzzd(zzyl zzylVar, zzagx zzagxVar, zzacf zzacfVar) {
        this.zzc = zzagxVar;
        this.zza = zzacfVar;
        this.zzb = zzylVar;
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzadm
    public final /* synthetic */ void zza(zzafm zzafmVar) {
        zzadk zzadkVar;
        this.zzc.zza(zzafmVar.zzc());
        zzadkVar = this.zzb.zza;
        zzadkVar.zza(this.zzc, new zzzc(this, this));
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzadj
    public final void zza(String str) {
        this.zza.zza(C5712r.m22812a(str));
    }
}
