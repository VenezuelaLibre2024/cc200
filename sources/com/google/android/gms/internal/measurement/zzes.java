package com.google.android.gms.internal.measurement;

import android.app.Activity;
import com.google.android.gms.internal.measurement.zzdf;
import p108h6.C2394s;
import p252r6.BinderC4309d;

/* loaded from: classes.dex */
final class zzes extends zzdf.zza {
    private final /* synthetic */ Activity zzc;
    private final /* synthetic */ zzdf.zzd zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzes(zzdf.zzd zzdVar, Activity activity) {
        super(zzdf.this);
        this.zzc = activity;
        this.zzd = zzdVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzdf.zza
    public final void zza() {
        zzcu zzcuVar;
        zzcuVar = zzdf.this.zzj;
        ((zzcu) C2394s.m9619l(zzcuVar)).onActivityPaused(BinderC4309d.m16572g(this.zzc), this.zzb);
    }
}
