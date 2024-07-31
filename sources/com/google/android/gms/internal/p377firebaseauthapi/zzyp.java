package com.google.android.gms.internal.p377firebaseauthapi;

import p321w7.C5376j;
import p337x7.C5712r;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzyp implements zzadm<zzafm> {
    private final /* synthetic */ C5376j zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ zzacf zzc;
    private final /* synthetic */ zzyl zzd;

    public zzyp(zzyl zzylVar, C5376j c5376j, String str, zzacf zzacfVar) {
        this.zza = c5376j;
        this.zzb = str;
        this.zzc = zzacfVar;
        this.zzd = zzylVar;
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzadm
    public final /* synthetic */ void zza(zzafm zzafmVar) {
        this.zzd.zza(new zzaeo(this.zza, zzafmVar.zzc(), this.zzb), this.zzc);
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzadj
    public final void zza(String str) {
        this.zzc.zza(C5712r.m22812a(str));
    }
}
