package com.google.android.gms.internal.p377firebaseauthapi;

import com.google.android.gms.tasks.TaskCompletionSource;
import p108h6.C2394s;
import p321w7.C5376j;
import p321w7.InterfaceC5372i;
import p337x7.C5684h2;
import p337x7.C5685i;
import p337x7.InterfaceC5720t1;

/* loaded from: classes.dex */
public final class zzaas extends zzacw<InterfaceC5372i, InterfaceC5720t1> {
    private final C5376j zzy;
    private final String zzz;

    public zzaas(C5376j c5376j, String str) {
        super(2);
        this.zzy = (C5376j) C2394s.m9620m(c5376j, "credential cannot be null");
        C2394s.m9614g(c5376j.zzc(), "email cannot be null");
        C2394s.m9614g(c5376j.zzd(), "password cannot be null");
        this.zzz = str;
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzadh
    public final String zza() {
        return "linkEmailAuthCredential";
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzadh
    public final void zza(TaskCompletionSource taskCompletionSource, zzace zzaceVar) {
        this.zzg = new zzadg(this, taskCompletionSource);
        zzaceVar.zza(this.zzy.zzc(), C2394s.m9613f(this.zzy.zzd()), this.zzd.zze(), this.zzd.mo21413N(), this.zzz, this.zzb);
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzacw
    public final void zzb() {
        C5685i zza = zzaag.zza(this.zzc, this.zzk);
        ((InterfaceC5720t1) this.zze).mo5269a(this.zzj, zza);
        zzb(new C5684h2(zza));
    }
}