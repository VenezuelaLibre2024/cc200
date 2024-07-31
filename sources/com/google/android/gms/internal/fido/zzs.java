package com.google.android.gms.internal.fido;

import android.os.IBinder;
import android.os.Parcel;
import p292u6.C4969u;
import p292u6.C4978x;

/* loaded from: classes.dex */
public final class zzs extends zza {
    public zzs(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.fido.fido2.internal.regular.IFido2AppService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzc(zzr zzrVar, C4969u c4969u) {
        Parcel zza = zza();
        int i10 = zzc.zza;
        zza.writeStrongBinder(zzrVar);
        zzc.zzd(zza, c4969u);
        zzb(1, zza);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzd(zzr zzrVar, C4978x c4978x) {
        Parcel zza = zza();
        int i10 = zzc.zza;
        zza.writeStrongBinder(zzrVar);
        zzc.zzd(zza, c4978x);
        zzb(2, zza);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zze(zze zzeVar) {
        Parcel zza = zza();
        int i10 = zzc.zza;
        zza.writeStrongBinder(zzeVar);
        zzb(3, zza);
    }
}
