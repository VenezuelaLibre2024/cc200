package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzdf;
import p108h6.C2394s;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzds extends zzdf.zza {
    private final /* synthetic */ long zzc;
    private final /* synthetic */ zzdf zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzds(zzdf zzdfVar, long j10) {
        super(zzdfVar);
        this.zzc = j10;
        this.zzd = zzdfVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzdf.zza
    public final void zza() {
        zzcu zzcuVar;
        zzcuVar = this.zzd.zzj;
        ((zzcu) C2394s.m9619l(zzcuVar)).setSessionTimeoutDuration(this.zzc);
    }
}
