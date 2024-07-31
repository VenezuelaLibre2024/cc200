package com.google.android.gms.internal.p377firebaseauthapi;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzade implements Runnable {
    private final /* synthetic */ zzadd zza;
    private final /* synthetic */ zzacy zzb;

    public zzade(zzacy zzacyVar, zzadd zzaddVar) {
        this.zza = zzaddVar;
        this.zzb = zzacyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.zzb.zza.zzh) {
            if (!this.zzb.zza.zzh.isEmpty()) {
                this.zza.zza(this.zzb.zza.zzh.get(0), new Object[0]);
            }
        }
    }
}
