package com.google.android.gms.internal.p377firebaseauthapi;

import com.google.android.gms.tasks.TaskCompletionSource;
import p108h6.C2394s;
import p321w7.C5394o0;
import p337x7.InterfaceC5720t1;

/* loaded from: classes.dex */
public final class zzabz extends zzacw<Void, InterfaceC5720t1> {
    private final C5394o0 zzy;

    public zzabz(C5394o0 c5394o0) {
        super(2);
        this.zzy = (C5394o0) C2394s.m9619l(c5394o0);
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzadh
    public final String zza() {
        return "updatePhoneNumber";
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzadh
    public final void zza(TaskCompletionSource taskCompletionSource, zzace zzaceVar) {
        this.zzg = new zzadg(this, taskCompletionSource);
        zzaceVar.zza(new zzxy(this.zzd.zze(), this.zzy), this.zzb);
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzacw
    public final void zzb() {
        ((InterfaceC5720t1) this.zze).mo5269a(this.zzj, zzaag.zza(this.zzc, this.zzk));
        zzb(null);
    }
}
