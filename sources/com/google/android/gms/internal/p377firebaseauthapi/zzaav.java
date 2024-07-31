package com.google.android.gms.internal.p377firebaseauthapi;

import com.google.android.gms.tasks.TaskCompletionSource;
import p108h6.C2394s;
import p321w7.AbstractC5368h;
import p321w7.InterfaceC5372i;
import p337x7.C5684h2;
import p337x7.C5685i;
import p337x7.C5717s1;
import p337x7.InterfaceC5720t1;

/* loaded from: classes.dex */
public final class zzaav extends zzacw<InterfaceC5372i, InterfaceC5720t1> {
    private final zzags zzy;

    public zzaav(AbstractC5368h abstractC5368h) {
        super(2);
        C2394s.m9620m(abstractC5368h, "credential cannot be null");
        this.zzy = C5717s1.m22820a(abstractC5368h, null);
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzadh
    public final String zza() {
        return "linkFederatedCredential";
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzadh
    public final void zza(TaskCompletionSource taskCompletionSource, zzace zzaceVar) {
        this.zzg = new zzadg(this, taskCompletionSource);
        zzaceVar.zza(this.zzd.zze(), this.zzy, this.zzb);
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzacw
    public final void zzb() {
        C5685i zza = zzaag.zza(this.zzc, this.zzk);
        ((InterfaceC5720t1) this.zze).mo5269a(this.zzj, zza);
        zzb(new C5684h2(zza));
    }
}
