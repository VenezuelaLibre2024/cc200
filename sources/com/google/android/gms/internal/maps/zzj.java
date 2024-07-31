package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.List;
import p252r6.InterfaceC4307b;
import p367z6.C6024o;

/* loaded from: classes.dex */
public final class zzj extends zza implements zzl {
    public zzj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.ICircleDelegate");
    }

    @Override // com.google.android.gms.internal.maps.zzl
    public final boolean zzA() {
        Parcel zzJ = zzJ(16, zza());
        boolean zzf = zzc.zzf(zzJ);
        zzJ.recycle();
        return zzf;
    }

    @Override // com.google.android.gms.internal.maps.zzl
    public final double zzd() {
        Parcel zzJ = zzJ(6, zza());
        double readDouble = zzJ.readDouble();
        zzJ.recycle();
        return readDouble;
    }

    @Override // com.google.android.gms.internal.maps.zzl
    public final float zze() {
        Parcel zzJ = zzJ(8, zza());
        float readFloat = zzJ.readFloat();
        zzJ.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.maps.zzl
    public final float zzf() {
        Parcel zzJ = zzJ(14, zza());
        float readFloat = zzJ.readFloat();
        zzJ.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.maps.zzl
    public final int zzg() {
        Parcel zzJ = zzJ(12, zza());
        int readInt = zzJ.readInt();
        zzJ.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.maps.zzl
    public final int zzh() {
        Parcel zzJ = zzJ(10, zza());
        int readInt = zzJ.readInt();
        zzJ.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.maps.zzl
    public final int zzi() {
        Parcel zzJ = zzJ(18, zza());
        int readInt = zzJ.readInt();
        zzJ.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.maps.zzl
    public final InterfaceC4307b zzj() {
        Parcel zzJ = zzJ(24, zza());
        InterfaceC4307b m16570c = InterfaceC4307b.a.m16570c(zzJ.readStrongBinder());
        zzJ.recycle();
        return m16570c;
    }

    @Override // com.google.android.gms.internal.maps.zzl
    public final LatLng zzk() {
        Parcel zzJ = zzJ(4, zza());
        LatLng latLng = (LatLng) zzc.zza(zzJ, LatLng.CREATOR);
        zzJ.recycle();
        return latLng;
    }

    @Override // com.google.android.gms.internal.maps.zzl
    public final String zzl() {
        Parcel zzJ = zzJ(2, zza());
        String readString = zzJ.readString();
        zzJ.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.maps.zzl
    public final List zzm() {
        Parcel zzJ = zzJ(22, zza());
        ArrayList createTypedArrayList = zzJ.createTypedArrayList(C6024o.CREATOR);
        zzJ.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.internal.maps.zzl
    public final void zzn() {
        zzc(1, zza());
    }

    @Override // com.google.android.gms.internal.maps.zzl
    public final void zzo(LatLng latLng) {
        Parcel zza = zza();
        zzc.zzd(zza, latLng);
        zzc(3, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzl
    public final void zzp(boolean z10) {
        Parcel zza = zza();
        int i10 = zzc.zza;
        zza.writeInt(z10 ? 1 : 0);
        zzc(19, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzl
    public final void zzq(int i10) {
        Parcel zza = zza();
        zza.writeInt(i10);
        zzc(11, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzl
    public final void zzr(double d10) {
        Parcel zza = zza();
        zza.writeDouble(d10);
        zzc(5, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzl
    public final void zzs(int i10) {
        Parcel zza = zza();
        zza.writeInt(i10);
        zzc(9, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzl
    public final void zzt(List list) {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzc(21, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzl
    public final void zzu(float f10) {
        Parcel zza = zza();
        zza.writeFloat(f10);
        zzc(7, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzl
    public final void zzv(InterfaceC4307b interfaceC4307b) {
        Parcel zza = zza();
        zzc.zze(zza, interfaceC4307b);
        zzc(23, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzl
    public final void zzw(boolean z10) {
        Parcel zza = zza();
        int i10 = zzc.zza;
        zza.writeInt(z10 ? 1 : 0);
        zzc(15, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzl
    public final void zzx(float f10) {
        Parcel zza = zza();
        zza.writeFloat(f10);
        zzc(13, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzl
    public final boolean zzy(zzl zzlVar) {
        Parcel zza = zza();
        zzc.zze(zza, zzlVar);
        Parcel zzJ = zzJ(17, zza);
        boolean zzf = zzc.zzf(zzJ);
        zzJ.recycle();
        return zzf;
    }

    @Override // com.google.android.gms.internal.maps.zzl
    public final boolean zzz() {
        Parcel zzJ = zzJ(20, zza());
        boolean zzf = zzc.zzf(zzJ);
        zzJ.recycle();
        return zzf;
    }
}
