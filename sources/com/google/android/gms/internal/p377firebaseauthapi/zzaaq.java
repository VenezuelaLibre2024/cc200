package com.google.android.gms.internal.p377firebaseauthapi;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzaaq extends zzacw<zzafi, Void> {
    private final zzxw zzy;

    public zzaaq() {
        super(11);
        this.zzy = new zzxw();
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzadh
    public final String zza() {
        return "getRecaptchaParam";
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzadh
    public final void zza(TaskCompletionSource<zzafi> taskCompletionSource, zzace zzaceVar) {
        this.zzg = new zzadg(this, taskCompletionSource);
        zzaceVar.zza(this.zzy, this.zzb);
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzacw
    public final void zzb() {
        zzb(this.zzu);
    }
}
