package com.google.android.gms.internal.measurement;

import android.app.Activity;
import com.google.android.gms.internal.measurement.zzdf;
import p108h6.C2394s;
import p252r6.BinderC4309d;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzdl extends zzdf.zza {
    private final /* synthetic */ Activity zzc;
    private final /* synthetic */ String zzd;
    private final /* synthetic */ String zze;
    private final /* synthetic */ zzdf zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdl(zzdf zzdfVar, Activity activity, String str, String str2) {
        super(zzdfVar);
        this.zzc = activity;
        this.zzd = str;
        this.zze = str2;
        this.zzf = zzdfVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzdf.zza
    public final void zza() {
        zzcu zzcuVar;
        zzcuVar = this.zzf.zzj;
        ((zzcu) C2394s.m9619l(zzcuVar)).setCurrentScreen(BinderC4309d.m16572g(this.zzc), this.zzd, this.zze, this.zza);
    }
}
