package com.google.android.gms.internal.p377firebaseauthapi;

import com.google.android.gms.tasks.TaskCompletionSource;
import p108h6.C2394s;
import p321w7.C5376j;
import p321w7.InterfaceC5372i;
import p337x7.C5684h2;
import p337x7.C5685i;
import p337x7.InterfaceC5720t1;

/* loaded from: classes.dex */
public final class zzabp extends zzacw<InterfaceC5372i, InterfaceC5720t1> {
    private final zzyf zzy;

    public zzabp(C5376j c5376j, String str) {
        super(2);
        C2394s.m9620m(c5376j, "credential cannot be null");
        this.zzy = new zzyf(c5376j, str);
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzadh
    public final String zza() {
        return "sendSignInLinkToEmail";
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzadh
    public final void zza(TaskCompletionSource taskCompletionSource, zzace zzaceVar) {
        this.zzg = new zzadg(this, taskCompletionSource);
        zzaceVar.zza(this.zzy, this.zzb);
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzacw
    public final void zzb() {
        C5685i zza = zzaag.zza(this.zzc, this.zzk);
        ((InterfaceC5720t1) this.zze).mo5269a(this.zzj, zza);
        zzb(new C5684h2(zza));
    }
}
