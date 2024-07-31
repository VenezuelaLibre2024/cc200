package com.google.android.gms.internal.maps;

import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.Parcel;
import p252r6.InterfaceC4307b;
import p367z6.C6026p;

/* loaded from: classes.dex */
public final class zzg extends zza implements zzi {
    public zzg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
    }

    @Override // com.google.android.gms.internal.maps.zzi
    public final InterfaceC4307b zzd() {
        Parcel zzJ = zzJ(4, zza());
        InterfaceC4307b m16570c = InterfaceC4307b.a.m16570c(zzJ.readStrongBinder());
        zzJ.recycle();
        return m16570c;
    }

    @Override // com.google.android.gms.internal.maps.zzi
    public final InterfaceC4307b zze(float f10) {
        Parcel zza = zza();
        zza.writeFloat(f10);
        Parcel zzJ = zzJ(5, zza);
        InterfaceC4307b m16570c = InterfaceC4307b.a.m16570c(zzJ.readStrongBinder());
        zzJ.recycle();
        return m16570c;
    }

    @Override // com.google.android.gms.internal.maps.zzi
    public final InterfaceC4307b zzf(String str) {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzJ = zzJ(2, zza);
        InterfaceC4307b m16570c = InterfaceC4307b.a.m16570c(zzJ.readStrongBinder());
        zzJ.recycle();
        return m16570c;
    }

    @Override // com.google.android.gms.internal.maps.zzi
    public final InterfaceC4307b zzg(Bitmap bitmap) {
        Parcel zza = zza();
        zzc.zzd(zza, bitmap);
        Parcel zzJ = zzJ(6, zza);
        InterfaceC4307b m16570c = InterfaceC4307b.a.m16570c(zzJ.readStrongBinder());
        zzJ.recycle();
        return m16570c;
    }

    @Override // com.google.android.gms.internal.maps.zzi
    public final InterfaceC4307b zzh(String str) {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzJ = zzJ(3, zza);
        InterfaceC4307b m16570c = InterfaceC4307b.a.m16570c(zzJ.readStrongBinder());
        zzJ.recycle();
        return m16570c;
    }

    @Override // com.google.android.gms.internal.maps.zzi
    public final InterfaceC4307b zzi(String str) {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzJ = zzJ(7, zza);
        InterfaceC4307b m16570c = InterfaceC4307b.a.m16570c(zzJ.readStrongBinder());
        zzJ.recycle();
        return m16570c;
    }

    @Override // com.google.android.gms.internal.maps.zzi
    public final InterfaceC4307b zzj(C6026p c6026p) {
        Parcel zza = zza();
        zzc.zzd(zza, c6026p);
        Parcel zzJ = zzJ(8, zza);
        InterfaceC4307b m16570c = InterfaceC4307b.a.m16570c(zzJ.readStrongBinder());
        zzJ.recycle();
        return m16570c;
    }

    @Override // com.google.android.gms.internal.maps.zzi
    public final InterfaceC4307b zzk(int i10) {
        Parcel zza = zza();
        zza.writeInt(i10);
        Parcel zzJ = zzJ(1, zza);
        InterfaceC4307b m16570c = InterfaceC4307b.a.m16570c(zzJ.readStrongBinder());
        zzJ.recycle();
        return m16570c;
    }
}
