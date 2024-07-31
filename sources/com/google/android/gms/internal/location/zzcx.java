package com.google.android.gms.internal.location;

import android.location.Location;
import p096g6.C2034j;
import p320w6.InterfaceC5314n;

/* loaded from: classes.dex */
final class zzcx implements C2034j.b {
    public final /* synthetic */ Location zza;

    public zzcx(zzcz zzczVar, Location location) {
        this.zza = location;
    }

    @Override // p096g6.C2034j.b
    public final /* bridge */ /* synthetic */ void notifyListener(Object obj) {
        ((InterfaceC5314n) obj).onLocationChanged(this.zza);
    }

    @Override // p096g6.C2034j.b
    public final void onNotifyListenerFailed() {
    }
}
