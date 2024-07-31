package com.google.android.gms.internal.p377firebaseauthapi;

import com.google.android.gms.tasks.TaskCompletionSource;
import p108h6.C2394s;
import p321w7.C5356e;
import p337x7.InterfaceC5720t1;

/* loaded from: classes.dex */
final class zzabj extends zzacw<Void, InterfaceC5720t1> {
    private final zzya zzy;
    private final String zzz;

    public zzabj(String str, C5356e c5356e, String str2, String str3, String str4) {
        super(4);
        C2394s.m9614g(str, "email cannot be null or empty");
        this.zzy = new zzya(str, c5356e, str2, str3);
        this.zzz = str4;
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzadh
    public final String zza() {
        return this.zzz;
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
