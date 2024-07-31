package com.google.android.gms.internal.auth;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import p319w5.C5277a;
import p319w5.C5278b;
import p319w5.C5285i;

/* loaded from: classes.dex */
public abstract class zzas extends zzb implements zzat {
    public zzas() {
        super("com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferCallbacks");
    }

    @Override // com.google.android.gms.internal.auth.zzb
    public final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) {
        switch (i10) {
            case 1:
                Status status = (Status) zzc.zza(parcel, Status.CREATOR);
                zzc.zzb(parcel);
                zzh(status);
                return true;
            case 2:
                Status status2 = (Status) zzc.zza(parcel, Status.CREATOR);
                C5285i c5285i = (C5285i) zzc.zza(parcel, C5285i.CREATOR);
                zzc.zzb(parcel);
                zzf(status2, c5285i);
                return true;
            case 3:
                Status status3 = (Status) zzc.zza(parcel, Status.CREATOR);
                C5278b c5278b = (C5278b) zzc.zza(parcel, C5278b.CREATOR);
                zzc.zzb(parcel);
                zzg(status3, c5278b);
                return true;
            case 4:
                zze();
                return true;
            case 5:
                Status status4 = (Status) zzc.zza(parcel, Status.CREATOR);
                zzc.zzb(parcel);
                zzd(status4);
                return true;
            case 6:
                byte[] createByteArray = parcel.createByteArray();
                zzc.zzb(parcel);
                zzb(createByteArray);
                return true;
            case 7:
                C5277a c5277a = (C5277a) zzc.zza(parcel, C5277a.CREATOR);
                zzc.zzb(parcel);
                zzc(c5277a);
                return true;
            default:
                return false;
        }
    }
}
