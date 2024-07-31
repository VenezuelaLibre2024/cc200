package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzdf;
import p108h6.C2394s;
import p252r6.BinderC4309d;

/* loaded from: classes.dex */
final class zzeo extends zzdf.zza {
    private final /* synthetic */ Bundle zzc;
    private final /* synthetic */ Activity zzd;
    private final /* synthetic */ zzdf.zzd zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzeo(zzdf.zzd zzdVar, Bundle bundle, Activity activity) {
        super(zzdf.this);
        this.zzc = bundle;
        this.zzd = activity;
        this.zze = zzdVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzdf.zza
    public final void zza() {
        Bundle bundle;
        zzcu zzcuVar;
        if (this.zzc != null) {
            bundle = new Bundle();
            if (this.zzc.containsKey("com.google.app_measurement.screen_service")) {
                Object obj = this.zzc.get("com.google.app_measurement.screen_service");
                if (obj instanceof Bundle) {
                    bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                }
            }
        } else {
            bundle = null;
        }
        zzcuVar = zzdf.this.zzj;
        ((zzcu) C2394s.m9619l(zzcuVar)).onActivityCreated(BinderC4309d.m16572g(this.zzd), bundle, this.zzb);
    }
}
