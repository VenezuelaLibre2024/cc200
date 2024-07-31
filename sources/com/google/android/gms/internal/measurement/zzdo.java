package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzdf;
import p108h6.C2394s;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzdo extends zzdf.zza {
    private final /* synthetic */ Boolean zzc;
    private final /* synthetic */ zzdf zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdo(zzdf zzdfVar, Boolean bool) {
        super(zzdfVar);
        this.zzc = bool;
        this.zzd = zzdfVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzdf.zza
    public final void zza() {
        zzcu zzcuVar;
        zzcu zzcuVar2;
        if (this.zzc != null) {
            zzcuVar2 = this.zzd.zzj;
            ((zzcu) C2394s.m9619l(zzcuVar2)).setMeasurementEnabled(this.zzc.booleanValue(), this.zza);
        } else {
            zzcuVar = this.zzd.zzj;
            ((zzcu) C2394s.m9619l(zzcuVar)).clearMeasurementEnabled(this.zza);
        }
    }
}
