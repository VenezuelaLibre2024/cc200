package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzdf;
import p108h6.C2394s;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzdp extends zzdf.zza {
    private final /* synthetic */ zzdf zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdp(zzdf zzdfVar) {
        super(zzdfVar);
        this.zzc = zzdfVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzdf.zza
    public final void zza() {
        zzcu zzcuVar;
        zzcuVar = this.zzc.zzj;
        ((zzcu) C2394s.m9619l(zzcuVar)).resetAnalyticsData(this.zza);
    }
}
