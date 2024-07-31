package com.google.android.gms.internal.location;

import com.google.android.gms.location.LocationResult;
import p096g6.C2034j;
import p320w6.AbstractC5312m;

/* loaded from: classes.dex */
final class zzct implements C2034j.b {
    public final /* synthetic */ LocationResult zza;

    public zzct(zzcw zzcwVar, LocationResult locationResult) {
        this.zza = locationResult;
    }

    @Override // p096g6.C2034j.b
    public final /* synthetic */ void notifyListener(Object obj) {
        ((AbstractC5312m) obj).onLocationResult(this.zza);
    }

    @Override // p096g6.C2034j.b
    public final void onNotifyListenerFailed() {
    }
}
