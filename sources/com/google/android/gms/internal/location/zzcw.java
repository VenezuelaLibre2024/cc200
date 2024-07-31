package com.google.android.gms.internal.location;

import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;
import p096g6.C2034j;
import p320w6.AbstractBinderC5321q0;

/* loaded from: classes.dex */
final class zzcw extends AbstractBinderC5321q0 {
    private final zzcs zza;

    public zzcw(zzcs zzcsVar) {
        this.zza = zzcsVar;
    }

    @Override // p320w6.InterfaceC5323r0
    public final void zzd(LocationAvailability locationAvailability) {
        this.zza.zza().m8161c(new zzcu(this, locationAvailability));
    }

    @Override // p320w6.InterfaceC5323r0
    public final void zze(LocationResult locationResult) {
        this.zza.zza().m8161c(new zzct(this, locationResult));
    }

    @Override // p320w6.InterfaceC5323r0
    public final void zzf() {
        this.zza.zza().m8161c(new zzcv(this));
    }

    public final zzcw zzg(C2034j c2034j) {
        this.zza.zzc(c2034j);
        return this;
    }

    public final void zzh() {
        this.zza.zza().m8159a();
    }
}
