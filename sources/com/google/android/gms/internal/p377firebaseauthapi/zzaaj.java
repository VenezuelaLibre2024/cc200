package com.google.android.gms.internal.p377firebaseauthapi;

import com.google.android.gms.tasks.TaskCompletionSource;
import p108h6.C2394s;
import p337x7.InterfaceC5720t1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzaaj extends zzacw<Void, InterfaceC5720t1> {
    private final String zzy;
    private final String zzz;

    public zzaaj(String str, String str2) {
        super(7);
        C2394s.m9614g(str, "code cannot be null or empty");
        this.zzy = str;
        this.zzz = str2;
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzadh
    public final String zza() {
        return "applyActionCode";
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzadh
    public final void zza(TaskCompletionSource taskCompletionSource, zzace zzaceVar) {
        this.zzg = new zzadg(this, taskCompletionSource);
        zzaceVar.zza(this.zzy, this.zzz, this.zzb);
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzacw
    public final void zzb() {
        zzb(null);
    }
}