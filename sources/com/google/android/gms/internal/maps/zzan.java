package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.Parcel;
import p367z6.C5997a0;

/* loaded from: classes.dex */
public final class zzan extends zza implements zzap {
    public zzan(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.ITileProviderDelegate");
    }

    @Override // com.google.android.gms.internal.maps.zzap
    public final C5997a0 zzb(int i10, int i11, int i12) {
        Parcel zza = zza();
        zza.writeInt(i10);
        zza.writeInt(i11);
        zza.writeInt(i12);
        Parcel zzJ = zzJ(1, zza);
        C5997a0 c5997a0 = (C5997a0) zzc.zza(zzJ, C5997a0.CREATOR);
        zzJ.recycle();
        return c5997a0;
    }
}
