package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzdf;
import p108h6.C2394s;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzel extends zzdf.zza {
    private final /* synthetic */ Long zzc;
    private final /* synthetic */ String zzd;
    private final /* synthetic */ String zze;
    private final /* synthetic */ Bundle zzf;
    private final /* synthetic */ boolean zzg;
    private final /* synthetic */ boolean zzh;
    private final /* synthetic */ zzdf zzi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzel(zzdf zzdfVar, Long l10, String str, String str2, Bundle bundle, boolean z10, boolean z11) {
        super(zzdfVar);
        this.zzc = l10;
        this.zzd = str;
        this.zze = str2;
        this.zzf = bundle;
        this.zzg = z10;
        this.zzh = z11;
        this.zzi = zzdfVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzdf.zza
    public final void zza() {
        zzcu zzcuVar;
        Long l10 = this.zzc;
        long longValue = l10 == null ? this.zza : l10.longValue();
        zzcuVar = this.zzi.zzj;
        ((zzcu) C2394s.m9619l(zzcuVar)).logEvent(this.zzd, this.zze, this.zzf, this.zzg, this.zzh, longValue);
    }
}
