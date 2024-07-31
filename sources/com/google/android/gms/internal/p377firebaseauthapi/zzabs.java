package com.google.android.gms.internal.p377firebaseauthapi;

import com.google.android.gms.tasks.TaskCompletionSource;
import p108h6.C2394s;
import p337x7.InterfaceC5720t1;

/* loaded from: classes.dex */
public final class zzabs extends zzacw<Void, InterfaceC5720t1> {
    private final String zzaa;
    private final String zzy;
    private final String zzz;

    public zzabs(String str, String str2, String str3) {
        super(2);
        this.zzy = C2394s.m9613f(str);
        this.zzz = C2394s.m9613f(str2);
        this.zzaa = str3;
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzadh
    public final String zza() {
        return "unenrollMfa";
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzadh
    public final void zza(TaskCompletionSource taskCompletionSource, zzace zzaceVar) {
        this.zzg = new zzadg(this, taskCompletionSource);
        zzaceVar.zza(this.zzy, this.zzz, this.zzaa, this.zzb);
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzacw
    public final void zzb() {
        ((InterfaceC5720t1) this.zze).mo5269a(this.zzj, zzaag.zza(this.zzc, this.zzk));
        zzb(null);
    }
}
