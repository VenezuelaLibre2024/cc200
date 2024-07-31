package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzdf;
import p108h6.C2394s;

/* loaded from: classes.dex */
final class zzem extends zzdf.zza {
    private final /* synthetic */ zzdf.zzb zzc;
    private final /* synthetic */ zzdf zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzem(zzdf zzdfVar, zzdf.zzb zzbVar) {
        super(zzdfVar);
        this.zzc = zzbVar;
        this.zzd = zzdfVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzdf.zza
    public final void zza() {
        zzcu zzcuVar;
        zzcuVar = this.zzd.zzj;
        ((zzcu) C2394s.m9619l(zzcuVar)).unregisterOnMeasurementEventListener(this.zzc);
    }
}
