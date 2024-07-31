package com.google.android.gms.internal.fido;

import android.os.IBinder;
import android.os.Parcel;
import p292u6.C4942l;
import p292u6.C4945m;

/* loaded from: classes.dex */
public final class zzn extends zza {
    public zzn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.fido.fido2.internal.privileged.IFido2PrivilegedService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzc(zzg zzgVar, String str) {
        Parcel zza = zza();
        int i10 = zzc.zza;
        zza.writeStrongBinder(zzgVar);
        zza.writeString(str);
        zzb(4, zza);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzd(zzm zzmVar, C4942l c4942l) {
        Parcel zza = zza();
        int i10 = zzc.zza;
        zza.writeStrongBinder(zzmVar);
        zzc.zzd(zza, c4942l);
        zzb(1, zza);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zze(zzm zzmVar, C4945m c4945m) {
        Parcel zza = zza();
        int i10 = zzc.zza;
        zza.writeStrongBinder(zzmVar);
        zzc.zzd(zza, c4945m);
        zzb(2, zza);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzf(zze zzeVar) {
        Parcel zza = zza();
        int i10 = zzc.zza;
        zza.writeStrongBinder(zzeVar);
        zzb(3, zza);
    }
}
