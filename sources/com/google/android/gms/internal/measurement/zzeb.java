package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzdf;
import p108h6.C2394s;

/* loaded from: classes.dex */
final class zzeb extends zzdf.zza {
    private final /* synthetic */ Bundle zzc;
    private final /* synthetic */ zzcs zzd;
    private final /* synthetic */ zzdf zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzeb(zzdf zzdfVar, Bundle bundle, zzcs zzcsVar) {
        super(zzdfVar);
        this.zzc = bundle;
        this.zzd = zzcsVar;
        this.zze = zzdfVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzdf.zza
    public final void zza() {
        zzcu zzcuVar;
        zzcuVar = this.zze.zzj;
        ((zzcu) C2394s.m9619l(zzcuVar)).performAction(this.zzc, this.zzd, this.zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzdf.zza
    public final void zzb() {
        this.zzd.zza((Bundle) null);
    }
}
