package com.google.android.gms.internal.p377firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import p108h6.C2394s;
import p337x7.C5685i;
import p337x7.InterfaceC5720t1;

/* loaded from: classes.dex */
final class zzaba extends zzacw<Void, InterfaceC5720t1> {
    private final String zzaa;
    private final String zzab;
    private final String zzy;
    private final String zzz;

    public zzaba(String str, String str2, String str3, String str4) {
        super(2);
        C2394s.m9614g(str, "email cannot be null or empty");
        C2394s.m9614g(str2, "password cannot be null or empty");
        this.zzy = str;
        this.zzz = str2;
        this.zzaa = str3;
        this.zzab = str4;
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzadh
    public final String zza() {
        return "reauthenticateWithEmailPassword";
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzadh
    public final void zza(TaskCompletionSource taskCompletionSource, zzace zzaceVar) {
        this.zzg = new zzadg(this, taskCompletionSource);
        zzaceVar.zzb(this.zzy, this.zzz, this.zzaa, this.zzab, this.zzb);
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
