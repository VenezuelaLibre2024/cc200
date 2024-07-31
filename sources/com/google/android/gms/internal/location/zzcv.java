package com.google.android.gms.internal.location;

import p096g6.C2034j;

/* loaded from: classes.dex */
final class zzcv implements C2034j.b {
    public final /* synthetic */ zzcw zza;

    public zzcv(zzcw zzcwVar) {
        this.zza = zzcwVar;
    }

    @Override // p096g6.C2034j.b
    public final /* bridge */ /* synthetic */ void notifyListener(Object obj) {
        zzcs zzcsVar;
        zzcsVar = this.zza.zza;
        zzcsVar.zzb();
    }

    @Override // p096g6.C2034j.b
    public final void onNotifyListenerFailed() {
    }
}
