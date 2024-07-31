package com.google.android.gms.internal.p377firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import p108h6.C2394s;
import p321w7.C5394o0;
import p337x7.C5685i;
import p337x7.InterfaceC5720t1;

/* loaded from: classes.dex */
final class zzabc extends zzacw<Void, InterfaceC5720t1> {
    private final zzye zzy;

    public zzabc(C5394o0 c5394o0, String str) {
        super(2);
        C2394s.m9620m(c5394o0, "credential cannot be null");
        c5394o0.m21544N(false);
        this.zzy = new zzye(c5394o0, str);
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzadh
    public final String zza() {
        return "reauthenticateWithPhoneCredential";
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
