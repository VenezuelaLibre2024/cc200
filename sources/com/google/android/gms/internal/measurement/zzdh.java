package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzdf;
import p108h6.C2394s;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzdh extends zzdf.zza {
    private final /* synthetic */ Bundle zzc;
    private final /* synthetic */ zzdf zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdh(zzdf zzdfVar, Bundle bundle) {
        super(zzdfVar);
        this.zzc = bundle;
        this.zzd = zzdfVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzdf.zza
    public final void zza() {
        zzcu zzcuVar;
        zzcuVar = this.zzd.zzj;
        ((zzcu) C2394s.m9619l(zzcuVar)).setConditionalUserProperty(this.zzc, this.zza);
    }
}
