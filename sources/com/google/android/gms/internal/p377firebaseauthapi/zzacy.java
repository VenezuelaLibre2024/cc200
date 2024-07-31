package com.google.android.gms.internal.p377firebaseauthapi;

import com.google.android.gms.common.api.Status;
import p108h6.C2394s;
import p321w7.AbstractC5368h;
import p321w7.C5394o0;
import p337x7.C5712r;
import p337x7.InterfaceC5730x;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzacy implements zzacc {
    public final /* synthetic */ zzacw zza;

    public zzacy(zzacw zzacwVar) {
        this.zza = zzacwVar;
    }

    private final void zza(Status status, AbstractC5368h abstractC5368h, String str, String str2) {
        zzacw.zza(this.zza, status);
        zzacw zzacwVar = this.zza;
        zzacwVar.zzp = abstractC5368h;
        zzacwVar.zzq = str;
        zzacwVar.zzr = str2;
        InterfaceC5730x interfaceC5730x = zzacwVar.zzf;
        if (interfaceC5730x != null) {
            interfaceC5730x.zza(status);
        }
        this.zza.zza(status);
    }

    private final void zza(zzadd zzaddVar) {
        this.zza.zzi.execute(new zzade(this, zzaddVar));
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzacc
    public final void zza() {
        int i10 = this.zza.zza;
        C2394s.m9623p(i10 == 5, "Unexpected response type " + i10);
        zzacw.zza(this.zza);
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzacc
    public final void zza(Status status) {
        String m4988K = status.m4988K();
        if (m4988K != null) {
            if (m4988K.contains("MISSING_MFA_PENDING_CREDENTIAL")) {
                status = new Status(17081);
            } else if (m4988K.contains("MISSING_MFA_ENROLLMENT_ID")) {
                status = new Status(17082);
            } else if (m4988K.contains("INVALID_MFA_PENDING_CREDENTIAL")) {
                status = new Status(17083);
            } else if (m4988K.contains("MFA_ENROLLMENT_NOT_FOUND")) {
                status = new Status(17084);
            } else if (m4988K.contains("ADMIN_ONLY_OPERATION")) {
                status = new Status(17085);
            } else if (m4988K.contains("UNVERIFIED_EMAIL")) {
                status = new Status(17086);
            } else if (m4988K.contains("SECOND_FACTOR_EXISTS")) {
                status = new Status(17087);
            } else if (m4988K.contains("SECOND_FACTOR_LIMIT_EXCEEDED")) {
                status = new Status(17088);
            } else if (m4988K.contains("UNSUPPORTED_FIRST_FACTOR")) {
                status = new Status(17089);
            } else if (m4988K.contains("EMAIL_CHANGE_NEEDS_VERIFICATION")) {
                status = new Status(17090);
            }
        }
        zzacw zzacwVar = this.zza;
        if (zzacwVar.zza != 8) {
            zzacw.zza(zzacwVar, status);
            this.zza.zza(status);
        } else {
            zzacwVar.zzz = true;
            this.zza.zzx = false;
            zza(new zzadb(this, status));
        }
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzacc
    public final void zza(Status status, C5394o0 c5394o0) {
        int i10 = this.zza.zza;
        C2394s.m9623p(i10 == 2, "Unexpected response type " + i10);
        zza(status, c5394o0, null, null);
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzacc
    public final void zza(zzaem zzaemVar) {
        int i10 = this.zza.zza;
        C2394s.m9623p(i10 == 3, "Unexpected response type " + i10);
        zzacw zzacwVar = this.zza;
        zzacwVar.zzl = zzaemVar;
        zzacw.zza(zzacwVar);
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzacc
    public final void zza(zzafi zzafiVar) {
        zzacw zzacwVar = this.zza;
        zzacwVar.zzu = zzafiVar;
        zzacw.zza(zzacwVar);
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzacc
    public final void zza(zzafj zzafjVar) {
        zzacw zzacwVar = this.zza;
        zzacwVar.zzt = zzafjVar;
        zzacw.zza(zzacwVar);
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzacc
    public final void zza(zzafm zzafmVar) {
        int i10 = this.zza.zza;
        C2394s.m9623p(i10 == 1, "Unexpected response type: " + i10);
        zzacw zzacwVar = this.zza;
        zzacwVar.zzj = zzafmVar;
        zzacw.zza(zzacwVar);
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzacc
    public final void zza(zzafm zzafmVar, zzafb zzafbVar) {
        int i10 = this.zza.zza;
        C2394s.m9623p(i10 == 2, "Unexpected response type: " + i10);
        zzacw zzacwVar = this.zza;
        zzacwVar.zzj = zzafmVar;
        zzacwVar.zzk = zzafbVar;
        zzacw.zza(zzacwVar);
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzacc
    public final void zza(zzafv zzafvVar) {
        int i10 = this.zza.zza;
        C2394s.m9623p(i10 == 4, "Unexpected response type " + i10);
        zzacw zzacwVar = this.zza;
        zzacwVar.zzm = zzafvVar;
        zzacw.zza(zzacwVar);
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzacc
    public final void zza(zzaga zzagaVar) {
        zzacw zzacwVar = this.zza;
        zzacwVar.zzw = zzagaVar;
        zzacw.zza(zzacwVar);
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzacc
    public final void zza(zzagi zzagiVar) {
        zzacw zzacwVar = this.zza;
        zzacwVar.zzv = zzagiVar;
        zzacw.zza(zzacwVar);
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzacc
    public final void zza(zzyi zzyiVar) {
        zzacw zzacwVar = this.zza;
        zzacwVar.zzs = zzyiVar;
        zzacwVar.zza(C5712r.m22812a("REQUIRES_SECOND_FACTOR_AUTH"));
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzacc
    public final void zza(zzyj zzyjVar) {
        zza(zzyjVar.zza(), zzyjVar.zzb(), zzyjVar.zzc(), zzyjVar.zzd());
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzacc
    public final void zza(String str) {
        int i10 = this.zza.zza;
        C2394s.m9623p(i10 == 8, "Unexpected response type " + i10);
        zzacw zzacwVar = this.zza;
        zzacwVar.zzo = str;
        zzacwVar.zzz = true;
        this.zza.zzx = true;
        zza(new zzadc(this, str));
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzacc
    public final void zza(C5394o0 c5394o0) {
        int i10 = this.zza.zza;
        C2394s.m9623p(i10 == 8, "Unexpected response type " + i10);
        this.zza.zzz = true;
        this.zza.zzx = true;
        zza(new zzacz(this, c5394o0));
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzacc
    public final void zzb() {
        int i10 = this.zza.zza;
        C2394s.m9623p(i10 == 6, "Unexpected response type " + i10);
        zzacw.zza(this.zza);
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzacc
    public final void zzb(String str) {
        int i10 = this.zza.zza;
        C2394s.m9623p(i10 == 8, "Unexpected response type " + i10);
        this.zza.zzo = str;
        zza(new zzada(this, str));
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzacc
    public final void zzc() {
        int i10 = this.zza.zza;
        C2394s.m9623p(i10 == 9, "Unexpected response type " + i10);
        zzacw.zza(this.zza);
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzacc
    public final void zzc(String str) {
        int i10 = this.zza.zza;
        C2394s.m9623p(i10 == 7, "Unexpected response type " + i10);
        zzacw zzacwVar = this.zza;
        zzacwVar.zzn = str;
        zzacw.zza(zzacwVar);
    }
}
