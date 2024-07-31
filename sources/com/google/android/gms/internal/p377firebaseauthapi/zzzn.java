package com.google.android.gms.internal.p377firebaseauthapi;

import p337x7.C5712r;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzzn implements zzadm<zzagi> {
    private final /* synthetic */ zzagf zza;
    private final /* synthetic */ zzacf zzb;

    public zzzn(zzyl zzylVar, zzagf zzagfVar, zzacf zzacfVar) {
        this.zza = zzagfVar;
        this.zzb = zzacfVar;
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzadm
    public final /* synthetic */ void zza(zzagi zzagiVar) {
        zzagi zzagiVar2 = zzagiVar;
        zzagf zzagfVar = this.zza;
        if (zzagfVar instanceof zzagj) {
            this.zzb.zzb(zzagiVar2.zza());
            return;
        }
        if (zzagfVar instanceof zzagl) {
            this.zzb.zza(zzagiVar2);
            return;
        }
        throw new IllegalArgumentException("startMfaEnrollmentRequest must be an instance of either StartPhoneMfaEnrollmentRequest or StartTotpMfaEnrollmentRequest but was " + this.zza.getClass().getName() + ".");
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzadj
    public final void zza(String str) {
        this.zzb.zza(C5712r.m22812a(str));
    }
}
