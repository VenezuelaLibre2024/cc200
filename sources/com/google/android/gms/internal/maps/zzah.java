package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.List;
import p252r6.InterfaceC4307b;
import p367z6.C6004e;
import p367z6.C6024o;
import p367z6.C6046z;

/* loaded from: classes.dex */
public final class zzah extends zza implements zzaj {
    public zzah(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IPolylineDelegate");
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final void zzA(boolean z10) {
        Parcel zza = zza();
        int i10 = zzc.zza;
        zza.writeInt(z10 ? 1 : 0);
        zzc(11, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final void zzB(float f10) {
        Parcel zza = zza();
        zza.writeFloat(f10);
        zzc(5, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final void zzC(float f10) {
        Parcel zza = zza();
        zza.writeFloat(f10);
        zzc(9, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final boolean zzD(zzaj zzajVar) {
        Parcel zza = zza();
        zzc.zze(zza, zzajVar);
        Parcel zzJ = zzJ(15, zza);
        boolean zzf = zzc.zzf(zzJ);
        zzJ.recycle();
        return zzf;
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final boolean zzE() {
        Parcel zzJ = zzJ(18, zza());
        boolean zzf = zzc.zzf(zzJ);
        zzJ.recycle();
        return zzf;
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final boolean zzF() {
        Parcel zzJ = zzJ(14, zza());
        boolean zzf = zzc.zzf(zzJ);
        zzJ.recycle();
        return zzf;
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final boolean zzG() {
        Parcel zzJ = zzJ(12, zza());
        boolean zzf = zzc.zzf(zzJ);
        zzJ.recycle();
        return zzf;
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final float zzd() {
        Parcel zzJ = zzJ(6, zza());
        float readFloat = zzJ.readFloat();
        zzJ.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final float zze() {
        Parcel zzJ = zzJ(10, zza());
        float readFloat = zzJ.readFloat();
        zzJ.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final int zzf() {
        Parcel zzJ = zzJ(8, zza());
        int readInt = zzJ.readInt();
        zzJ.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final int zzg() {
        Parcel zzJ = zzJ(24, zza());
        int readInt = zzJ.readInt();
        zzJ.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final int zzh() {
        Parcel zzJ = zzJ(16, zza());
        int readInt = zzJ.readInt();
        zzJ.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final InterfaceC4307b zzi() {
        Parcel zzJ = zzJ(28, zza());
        InterfaceC4307b m16570c = InterfaceC4307b.a.m16570c(zzJ.readStrongBinder());
        zzJ.recycle();
        return m16570c;
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final C6004e zzj() {
        Parcel zzJ = zzJ(22, zza());
        C6004e c6004e = (C6004e) zzc.zza(zzJ, C6004e.CREATOR);
        zzJ.recycle();
        return c6004e;
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final C6004e zzk() {
        Parcel zzJ = zzJ(20, zza());
        C6004e c6004e = (C6004e) zzc.zza(zzJ, C6004e.CREATOR);
        zzJ.recycle();
        return c6004e;
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final String zzl() {
        Parcel zzJ = zzJ(2, zza());
        String readString = zzJ.readString();
        zzJ.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final List zzm() {
        Parcel zzJ = zzJ(26, zza());
        ArrayList createTypedArrayList = zzJ.createTypedArrayList(C6024o.CREATOR);
        zzJ.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final List zzn() {
        Parcel zzJ = zzJ(4, zza());
        ArrayList createTypedArrayList = zzJ.createTypedArrayList(LatLng.CREATOR);
        zzJ.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final List zzo() {
        Parcel zzJ = zzJ(30, zza());
        ArrayList createTypedArrayList = zzJ.createTypedArrayList(C6046z.CREATOR);
        zzJ.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final void zzp() {
        zzc(1, zza());
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final void zzq(boolean z10) {
        Parcel zza = zza();
        int i10 = zzc.zza;
        zza.writeInt(z10 ? 1 : 0);
        zzc(17, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final void zzr(int i10) {
        Parcel zza = zza();
        zza.writeInt(i10);
        zzc(7, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final void zzs(C6004e c6004e) {
        Parcel zza = zza();
        zzc.zzd(zza, c6004e);
        zzc(21, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final void zzt(boolean z10) {
        Parcel zza = zza();
        int i10 = zzc.zza;
        zza.writeInt(z10 ? 1 : 0);
        zzc(13, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final void zzu(int i10) {
        Parcel zza = zza();
        zza.writeInt(i10);
        zzc(23, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final void zzv(List list) {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzc(25, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final void zzw(List list) {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzc(3, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final void zzx(List list) {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzc(29, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final void zzy(C6004e c6004e) {
        Parcel zza = zza();
        zzc.zzd(zza, c6004e);
        zzc(19, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final void zzz(InterfaceC4307b interfaceC4307b) {
        Parcel zza = zza();
        zzc.zze(zza, interfaceC4307b);
        zzc(27, zza);
    }
}
