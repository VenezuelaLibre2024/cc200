package com.google.android.gms.internal.location;

import com.google.android.gms.location.LocationAvailability;
import p096g6.C2034j;
import p320w6.AbstractC5312m;

/* loaded from: classes.dex */
final class zzcu implements C2034j.b {
    public final /* synthetic */ LocationAvailability zza;

    public zzcu(zzcw zzcwVar, LocationAvailability locationAvailability) {
        this.zza = locationAvailability;
    }

    @Override // p096g6.C2034j.b
    public final /* synthetic */ void notifyListener(Object obj) {
        ((AbstractC5312m) obj).onLocationAvailability(this.zza);
    }

    @Override // p096g6.C2034j.b
    public final void onNotifyListenerFailed() {
    }
}
