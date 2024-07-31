package com.google.android.gms.internal.auth;

import android.os.IBinder;
import android.os.Parcel;
import p366z5.C5992b;

/* loaded from: classes.dex */
public final class zzbh extends zza {
    public zzbh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.internal.IAuthService");
    }

    public final void zzd(zzbg zzbgVar) {
        Parcel zza = zza();
        zzc.zzd(zza, zzbgVar);
        zzc(3, zza);
    }

    public final void zze(zzbg zzbgVar, C5992b c5992b) {
        Parcel zza = zza();
        zzc.zzd(zza, zzbgVar);
        zzc.zzc(zza, c5992b);
        zzc(1, zza);
    }
}
