package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzdf;
import p108h6.C2394s;

/* loaded from: classes.dex */
final class zzee extends zzdf.zza {
    private final /* synthetic */ zzdf.zzc zzc;
    private final /* synthetic */ zzdf zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzee(zzdf zzdfVar, zzdf.zzc zzcVar) {
        super(zzdfVar);
        this.zzc = zzcVar;
        this.zzd = zzdfVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzdf.zza
    public final void zza() {
        zzcu zzcuVar;
        zzcuVar = this.zzd.zzj;
        ((zzcu) C2394s.m9619l(zzcuVar)).setEventInterceptor(this.zzc);
    }
}
