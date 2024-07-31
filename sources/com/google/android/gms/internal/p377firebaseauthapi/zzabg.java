package com.google.android.gms.internal.p377firebaseauthapi;

import com.google.android.gms.tasks.TaskCompletionSource;
import p108h6.C2394s;
import p321w7.C5356e;
import p337x7.InterfaceC5720t1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzabg extends zzacw<Void, InterfaceC5720t1> {
    private final zzyb zzy;

    public zzabg(String str, C5356e c5356e) {
        super(6);
        C2394s.m9614g(str, "token cannot be null or empty");
        this.zzy = new zzyb(str, c5356e);
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzadh
    public final String zza() {
        return "sendEmailVerification";
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzadh
    public final void zza(TaskCompletionSource taskCompletionSource, zzace zzaceVar) {
        this.zzg = new zzadg(this, taskCompletionSource);
        zzaceVar.zza(this.zzy, this.zzb);
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzacw
    public final void zzb() {
        zzb(null);
    }
}
