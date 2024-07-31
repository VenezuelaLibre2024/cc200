package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import p252r6.InterfaceC4307b;

/* loaded from: classes.dex */
public final class zzp extends zza implements zzr {
    public zzp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
    }

    @Override // com.google.android.gms.internal.maps.zzr
    public final boolean zzA() {
        Parcel zzJ = zzJ(23, zza());
        boolean zzf = zzc.zzf(zzJ);
        zzJ.recycle();
        return zzf;
    }

    @Override // com.google.android.gms.internal.maps.zzr
    public final boolean zzB() {
        Parcel zzJ = zzJ(16, zza());
        boolean zzf = zzc.zzf(zzJ);
        zzJ.recycle();
        return zzf;
    }

    @Override // com.google.android.gms.internal.maps.zzr
    public final float zzd() {
        Parcel zzJ = zzJ(12, zza());
        float readFloat = zzJ.readFloat();
        zzJ.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.maps.zzr
    public final float zze() {
        Parcel zzJ = zzJ(8, zza());
        float readFloat = zzJ.readFloat();
        zzJ.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.maps.zzr
    public final float zzf() {
        Parcel zzJ = zzJ(18, zza());
        float readFloat = zzJ.readFloat();
        zzJ.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.maps.zzr
    public final float zzg() {
        Parcel zzJ = zzJ(7, zza());
        float readFloat = zzJ.readFloat();
        zzJ.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.maps.zzr
    public final float zzh() {
        Parcel zzJ = zzJ(14, zza());
        float readFloat = zzJ.readFloat();
        zzJ.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.maps.zzr
    public final int zzi() {
        Parcel zzJ = zzJ(20, zza());
        int readInt = zzJ.readInt();
        zzJ.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.maps.zzr
    public final InterfaceC4307b zzj() {
        Parcel zzJ = zzJ(25, zza());
        InterfaceC4307b m16570c = InterfaceC4307b.a.m16570c(zzJ.readStrongBinder());
        zzJ.recycle();
        return m16570c;
    }

    @Override // com.google.android.gms.internal.maps.zzr
    public final LatLng zzk() {
        Parcel zzJ = zzJ(4, zza());
        LatLng latLng = (LatLng) zzc.zza(zzJ, LatLng.CREATOR);
        zzJ.recycle();
        return latLng;
    }

    @Override // com.google.android.gms.internal.maps.zzr
    public final LatLngBounds zzl() {
        Parcel zzJ = zzJ(10, zza());
        LatLngBounds latLngBounds = (LatLngBounds) zzc.zza(zzJ, LatLngBounds.CREATOR);
        zzJ.recycle();
        return latLngBounds;
    }

    @Override // com.google.android.gms.internal.maps.zzr
    public final String zzm() {
        Parcel zzJ = zzJ(2, zza());
        String readString = zzJ.readString();
        zzJ.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.maps.zzr
    public final void zzn() {
        zzc(1, zza());
    }

    @Override // com.google.android.gms.internal.maps.zzr
    public final void zzo(float f10) {
        Parcel zza = zza();
        zza.writeFloat(f10);
        zzc(11, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzr
    public final void zzp(boolean z10) {
        Parcel zza = zza();
        int i10 = zzc.zza;
        zza.writeInt(z10 ? 1 : 0);
        zzc(22, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzr
    public final void zzq(float f10) {
        Parcel zza = zza();
        zza.writeFloat(f10);
        zzc(5, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzr
    public final void zzr(float f10, float f11) {
        Parcel zza = zza();
        zza.writeFloat(f10);
        zza.writeFloat(f11);
        zzc(6, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzr
    public final void zzs(InterfaceC4307b interfaceC4307b) {
        Parcel zza = zza();
        zzc.zze(zza, interfaceC4307b);
        zzc(21, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzr
    public final void zzt(LatLng latLng) {
        Parcel zza = zza();
        zzc.zzd(zza, latLng);
        zzc(3, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzr
    public final void zzu(LatLngBounds latLngBounds) {
        Parcel zza = zza();
        zzc.zzd(zza, latLngBounds);
        zzc(9, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzr
    public final void zzv(InterfaceC4307b interfaceC4307b) {
        Parcel zza = zza();
        zzc.zze(zza, interfaceC4307b);
        zzc(24, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzr
    public final void zzw(float f10) {
        Parcel zza = zza();
        zza.writeFloat(f10);
        zzc(17, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzr
    public final void zzx(boolean z10) {
        Parcel zza = zza();
        int i10 = zzc.zza;
        zza.writeInt(z10 ? 1 : 0);
        zzc(15, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzr
    public final void zzy(float f10) {
        Parcel zza = zza();
        zza.writeFloat(f10);
        zzc(13, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzr
    public final boolean zzz(zzr zzrVar) {
        Parcel zza = zza();
        zzc.zze(zza, zzrVar);
        Parcel zzJ = zzJ(19, zza);
        boolean zzf = zzc.zzf(zzJ);
        zzJ.recycle();
        return zzf;
    }
}
