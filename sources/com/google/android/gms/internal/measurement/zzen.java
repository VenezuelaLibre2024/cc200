package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzdf;
import p108h6.C2394s;
import p252r6.BinderC4309d;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzen extends zzdf.zza {
    private final /* synthetic */ String zzc;
    private final /* synthetic */ String zzd;
    private final /* synthetic */ Object zze;
    private final /* synthetic */ boolean zzf;
    private final /* synthetic */ zzdf zzg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzen(zzdf zzdfVar, String str, String str2, Object obj, boolean z10) {
        super(zzdfVar);
        this.zzc = str;
        this.zzd = str2;
        this.zze = obj;
        this.zzf = z10;
        this.zzg = zzdfVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzdf.zza
    public final void zza() {
        zzcu zzcuVar;
        zzcuVar = this.zzg.zzj;
        ((zzcu) C2394s.m9619l(zzcuVar)).setUserProperty(this.zzc, this.zzd, BinderC4309d.m16572g(this.zze), this.zzf, this.zza);
    }
}
