package com.google.android.gms.internal.auth;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import p096g6.InterfaceC2022g;
import p277t5.C4693b;

/* loaded from: classes.dex */
public final class zzp extends zza {
    public zzp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.account.data.IGoogleAuthService");
    }

    public final void zzd(InterfaceC2022g interfaceC2022g, zzbw zzbwVar) {
        Parcel zza = zza();
        zzc.zzd(zza, interfaceC2022g);
        zzc.zzc(zza, zzbwVar);
        zzc(2, zza);
    }

    public final void zze(zzm zzmVar, C4693b c4693b) {
        Parcel zza = zza();
        zzc.zzd(zza, zzmVar);
        zzc.zzc(zza, c4693b);
        zzc(4, zza);
    }

    public final void zzf(zzo zzoVar, Account account, String str, Bundle bundle) {
        Parcel zza = zza();
        zzc.zzd(zza, zzoVar);
        zzc.zzc(zza, account);
        zza.writeString(str);
        zzc.zzc(zza, bundle);
        zzc(1, zza);
    }

    public final void zzg(zzk zzkVar, Account account) {
        Parcel zza = zza();
        zzc.zzd(zza, zzkVar);
        zzc.zzc(zza, account);
        zzc(6, zza);
    }

    public final void zzh(zzk zzkVar, String str) {
        Parcel zza = zza();
        zzc.zzd(zza, zzkVar);
        zza.writeString(str);
        zzc(3, zza);
    }
}
