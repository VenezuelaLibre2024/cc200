package com.google.android.gms.internal.p377firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import p108h6.C2394s;
import p321w7.AbstractC5368h;
import p337x7.C5685i;
import p337x7.C5717s1;
import p337x7.InterfaceC5720t1;

/* loaded from: classes.dex */
final class zzaaw extends zzacw<Void, InterfaceC5720t1> {
    private final zzags zzy;

    public zzaaw(AbstractC5368h abstractC5368h, String str) {
        super(2);
        C2394s.m9620m(abstractC5368h, "credential cannot be null");
        this.zzy = C5717s1.m22820a(abstractC5368h, str).zza(false);
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzadh
    public final String zza() {
        return "reauthenticateWithCredential";
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzadh
    public final void zza(TaskCompletionSource taskCompletionSource, zzace zzaceVar) {
        this.zzg = new zzadg(this, taskCompletionSource);
        zzaceVar.zza(this.zzy, this.zzb);
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzacw
    public final void zzb() {
        C5685i zza = zzaag.zza(this.zzc, this.zzk);
        if (!this.zzd.mo21427b().equalsIgnoreCase(zza.mo21427b())) {
            zza(new Status(17024));
        } else {
            ((InterfaceC5720t1) this.zze).mo5269a(this.zzj, zza);
            zzb(null);
        }
    }
}
