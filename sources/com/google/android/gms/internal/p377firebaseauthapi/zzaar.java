package com.google.android.gms.internal.p377firebaseauthapi;

import android.text.TextUtils;
import com.google.android.gms.tasks.TaskCompletionSource;
import p108h6.C2394s;
import p321w7.C5349c0;
import p337x7.C5698m0;
import p337x7.InterfaceC5720t1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzaar extends zzacw<C5349c0, InterfaceC5720t1> {
    private final String zzy;

    public zzaar(String str) {
        super(1);
        C2394s.m9614g(str, "refresh token cannot be null");
        this.zzy = str;
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzadh
    public final String zza() {
        return "getAccessToken";
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzadh
    public final void zza(TaskCompletionSource taskCompletionSource, zzace zzaceVar) {
        this.zzg = new zzadg(this, taskCompletionSource);
        zzaceVar.zzb(this.zzy, this.zzb);
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzacw
    public final void zzb() {
        if (TextUtils.isEmpty(this.zzj.zzd())) {
            this.zzj.zzc(this.zzy);
        }
        ((InterfaceC5720t1) this.zze).mo5269a(this.zzj, this.zzd);
        zzb(C5698m0.m22786a(this.zzj.zzc()));
    }
}
