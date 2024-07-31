package com.google.android.gms.internal.p377firebaseauthapi;

import com.google.firebase.auth.C1260b;

/* loaded from: classes.dex */
final class zzadc implements zzadd {
    private final /* synthetic */ String zza;

    public zzadc(zzacy zzacyVar, String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzadd
    public final void zza(C1260b.b bVar, Object... objArr) {
        bVar.onCodeAutoRetrievalTimeOut(this.zza);
    }
}
