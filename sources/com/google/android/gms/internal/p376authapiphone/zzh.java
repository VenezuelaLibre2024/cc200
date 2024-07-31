package com.google.android.gms.internal.p376authapiphone;

import android.os.IBinder;
import android.os.Parcel;
import p096g6.InterfaceC2022g;

/* loaded from: classes.dex */
public final class zzh extends zza {
    public zzh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
    }

    public final void zzc(zze zzeVar) {
        Parcel zza = zza();
        zzc.zzc(zza, zzeVar);
        zzb(4, zza);
    }

    public final void zzd(String str, zzg zzgVar) {
        Parcel zza = zza();
        zza.writeString(str);
        zzc.zzc(zza, zzgVar);
        zzb(5, zza);
    }

    public final void zze(InterfaceC2022g interfaceC2022g) {
        Parcel zza = zza();
        zzc.zzc(zza, interfaceC2022g);
        zzb(3, zza);
    }

    public final void zzf(InterfaceC2022g interfaceC2022g) {
        Parcel zza = zza();
        zzc.zzc(zza, interfaceC2022g);
        zzb(6, zza);
    }

    public final void zzg(zzj zzjVar) {
        Parcel zza = zza();
        zzc.zzc(zza, zzjVar);
        zzb(1, zza);
    }

    public final void zzh(String str, zzj zzjVar) {
        Parcel zza = zza();
        zza.writeString(str);
        zzc.zzc(zza, zzjVar);
        zzb(2, zza);
    }
}
