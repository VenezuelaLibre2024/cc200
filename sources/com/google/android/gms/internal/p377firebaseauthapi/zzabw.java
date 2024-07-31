package com.google.android.gms.internal.p377firebaseauthapi;

import com.google.android.gms.tasks.TaskCompletionSource;
import p108h6.C2394s;
import p337x7.InterfaceC5720t1;

/* loaded from: classes.dex */
public final class zzabw extends zzacw<Void, InterfaceC5720t1> {
    private final String zzy;

    public zzabw(String str) {
        super(2);
        this.zzy = C2394s.m9614g(str, "password cannot be null or empty");
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzadh
    public final String zza() {
        return "updatePassword";
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzadh
    public final void zza(TaskCompletionSource taskCompletionSource, zzace zzaceVar) {
        this.zzg = new zzadg(this, taskCompletionSource);
        zzaceVar.zzc(this.zzd.zze(), this.zzy, this.zzb);
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzacw
    public final void zzb() {
        ((InterfaceC5720t1) this.zze).mo5269a(this.zzj, zzaag.zza(this.zzc, this.zzk));
        zzb(null);
    }
}
