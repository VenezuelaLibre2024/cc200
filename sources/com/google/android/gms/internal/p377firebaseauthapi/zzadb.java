package com.google.android.gms.internal.p377firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.C1260b;

/* loaded from: classes.dex */
final class zzadb implements zzadd {
    private final /* synthetic */ Status zza;

    public zzadb(zzacy zzacyVar, Status status) {
        this.zza = status;
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzadd
    public final void zza(C1260b.b bVar, Object... objArr) {
        bVar.onVerificationFailed(zzach.zza(this.zza));
    }
}
