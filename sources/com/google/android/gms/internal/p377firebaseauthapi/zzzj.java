package com.google.android.gms.internal.p377firebaseauthapi;

import java.util.List;
import p337x7.C5712r;

/* loaded from: classes.dex */
final class zzzj implements zzadm<zzafc> {
    private final /* synthetic */ zzadm zza;
    private final /* synthetic */ zzafm zzb;
    private final /* synthetic */ zzzg zzc;

    public zzzj(zzzg zzzgVar, zzadm zzadmVar, zzafm zzafmVar) {
        this.zza = zzadmVar;
        this.zzb = zzafmVar;
        this.zzc = zzzgVar;
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzadm
    public final /* synthetic */ void zza(zzafc zzafcVar) {
        List<zzafb> zza = zzafcVar.zza();
        if (zza == null || zza.isEmpty()) {
            this.zza.zza("No users.");
            return;
        }
        zzafb zzafbVar = zza.get(0);
        zzagb zzagbVar = new zzagb();
        zzagbVar.zzd(this.zzb.zzc()).zza(this.zzc.zza);
        zzzg zzzgVar = this.zzc;
        zzyl.zza(zzzgVar.zzc, zzzgVar.zzb, this.zzb, zzafbVar, zzagbVar, this.zza);
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzadj
    public final void zza(String str) {
        this.zzc.zzb.zza(C5712r.m22812a(str));
    }
}
