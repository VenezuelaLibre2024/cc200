package com.google.android.gms.internal.p377firebaseauthapi;

import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import io.flutter.plugins.firebase.auth.Constants;
import p321w7.C5394o0;

/* loaded from: classes.dex */
final class zzzc implements zzadm<zzaha> {
    private final /* synthetic */ zzadm zza;
    private final /* synthetic */ zzzd zzb;

    public zzzc(zzzd zzzdVar, zzadm zzadmVar) {
        this.zza = zzadmVar;
        this.zzb = zzzdVar;
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzadm
    public final /* synthetic */ void zza(zzaha zzahaVar) {
        zzaha zzahaVar2 = zzahaVar;
        if (TextUtils.isEmpty(zzahaVar2.zze())) {
            this.zzb.zzb.zza(new zzafm(zzahaVar2.zzd(), zzahaVar2.zzb(), Long.valueOf(zzahaVar2.zza()), "Bearer"), null, Constants.SIGN_IN_METHOD_PHONE, Boolean.valueOf(zzahaVar2.zzf()), null, this.zzb.zza, this.zza);
        } else {
            this.zzb.zza.zza(new Status(17025), C5394o0.m21542P(zzahaVar2.zzc(), zzahaVar2.zze()));
        }
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzadj
    public final void zza(String str) {
        this.zza.zza(str);
    }
}
