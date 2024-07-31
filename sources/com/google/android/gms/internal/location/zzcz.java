package com.google.android.gms.internal.location;

import android.location.Location;
import p096g6.C2034j;
import p320w6.AbstractBinderC5327t0;

/* loaded from: classes.dex */
final class zzcz extends AbstractBinderC5327t0 {
    private final zzcs zza;

    public zzcz(zzcs zzcsVar) {
        this.zza = zzcsVar;
    }

    @Override // p320w6.InterfaceC5329u0
    public final void zzd(Location location) {
        this.zza.zza().m8161c(new zzcx(this, location));
    }

    @Override // p320w6.InterfaceC5329u0
    public final void zze() {
        this.zza.zza().m8161c(new zzcy(this));
    }

    public final zzcz zzf(C2034j c2034j) {
        this.zza.zzc(c2034j);
        return this;
    }

    public final void zzg() {
        this.zza.zza().m8159a();
    }
}
