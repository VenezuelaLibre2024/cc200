package com.google.android.gms.internal.p377firebaseauthapi;

import com.google.firebase.auth.C1260b;
import p195n7.C3773m;
import p321w7.C5394o0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzadr extends C1260b.b {
    private final /* synthetic */ C1260b.b zza;
    private final /* synthetic */ String zzb;

    public zzadr(C1260b.b bVar, String str) {
        this.zza = bVar;
        this.zzb = str;
    }

    @Override // com.google.firebase.auth.C1260b.b
    public final void onCodeAutoRetrievalTimeOut(String str) {
        zzads.zza.remove(this.zzb);
        this.zza.onCodeAutoRetrievalTimeOut(str);
    }

    @Override // com.google.firebase.auth.C1260b.b
    public final void onCodeSent(String str, C1260b.a aVar) {
        this.zza.onCodeSent(str, aVar);
    }

    @Override // com.google.firebase.auth.C1260b.b
    public final void onVerificationCompleted(C5394o0 c5394o0) {
        zzads.zza.remove(this.zzb);
        this.zza.onVerificationCompleted(c5394o0);
    }

    @Override // com.google.firebase.auth.C1260b.b
    public final void onVerificationFailed(C3773m c3773m) {
        zzads.zza.remove(this.zzb);
        this.zza.onVerificationFailed(c3773m);
    }
}
