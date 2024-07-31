package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.location.Location;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import p096g6.InterfaceC2022g;
import p108h6.InterfaceC2373l;
import p320w6.C5294d;
import p320w6.C5296e;
import p320w6.C5301g0;
import p320w6.C5308k;
import p320w6.C5310l;
import p320w6.C5318p;
import p320w6.C5330v;

/* loaded from: classes.dex */
public final class zzn extends zza implements zzo {
    public zzn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService");
    }

    @Override // com.google.android.gms.internal.location.zzo
    public final Location zzd() {
        Parcel zzb = zzb(7, zza());
        Location location = (Location) zzc.zza(zzb, Location.CREATOR);
        zzb.recycle();
        return location;
    }

    @Override // com.google.android.gms.internal.location.zzo
    public final InterfaceC2373l zze(C5296e c5296e, zzq zzqVar) {
        Parcel zza = zza();
        zzc.zzd(zza, c5296e);
        zzc.zze(zza, zzqVar);
        Parcel zzb = zzb(87, zza);
        InterfaceC2373l m9580c = InterfaceC2373l.a.m9580c(zzb.readStrongBinder());
        zzb.recycle();
        return m9580c;
    }

    @Override // com.google.android.gms.internal.location.zzo
    public final LocationAvailability zzf(String str) {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzb = zzb(34, zza);
        LocationAvailability locationAvailability = (LocationAvailability) zzc.zza(zzb, LocationAvailability.CREATOR);
        zzb.recycle();
        return locationAvailability;
    }

    @Override // com.google.android.gms.internal.location.zzo
    public final void zzg(C5308k c5308k, PendingIntent pendingIntent, zzm zzmVar) {
        Parcel zza = zza();
        zzc.zzd(zza, c5308k);
        zzc.zzd(zza, pendingIntent);
        zzc.zze(zza, zzmVar);
        zzc(57, zza);
    }

    @Override // com.google.android.gms.internal.location.zzo
    public final void zzh(C5318p c5318p, zzs zzsVar, String str) {
        Parcel zza = zza();
        zzc.zzd(zza, c5318p);
        zzc.zze(zza, zzsVar);
        zza.writeString(null);
        zzc(63, zza);
    }

    @Override // com.google.android.gms.internal.location.zzo
    public final void zzi(zzk zzkVar) {
        Parcel zza = zza();
        zzc.zze(zza, zzkVar);
        zzc(67, zza);
    }

    @Override // com.google.android.gms.internal.location.zzo
    public final void zzj(C5310l c5310l, zzq zzqVar) {
        Parcel zza = zza();
        zzc.zzd(zza, c5310l);
        zzc.zze(zza, zzqVar);
        zzc(82, zza);
    }

    @Override // com.google.android.gms.internal.location.zzo
    public final void zzk(zzdb zzdbVar, LocationRequest locationRequest, InterfaceC2022g interfaceC2022g) {
        Parcel zza = zza();
        zzc.zzd(zza, zzdbVar);
        zzc.zzd(zza, locationRequest);
        zzc.zze(zza, interfaceC2022g);
        zzc(88, zza);
    }

    @Override // com.google.android.gms.internal.location.zzo
    public final void zzl(PendingIntent pendingIntent, InterfaceC2022g interfaceC2022g) {
        Parcel zza = zza();
        zzc.zzd(zza, pendingIntent);
        zzc.zze(zza, interfaceC2022g);
        zzc(73, zza);
    }

    @Override // com.google.android.gms.internal.location.zzo
    public final void zzm(PendingIntent pendingIntent) {
        Parcel zza = zza();
        zzc.zzd(zza, pendingIntent);
        zzc(6, zza);
    }

    @Override // com.google.android.gms.internal.location.zzo
    public final void zzn(PendingIntent pendingIntent, zzm zzmVar, String str) {
        Parcel zza = zza();
        zzc.zzd(zza, pendingIntent);
        zzc.zze(zza, zzmVar);
        zza.writeString(str);
        zzc(2, zza);
    }

    @Override // com.google.android.gms.internal.location.zzo
    public final void zzo(String[] strArr, zzm zzmVar, String str) {
        Parcel zza = zza();
        zza.writeStringArray(strArr);
        zzc.zze(zza, zzmVar);
        zza.writeString(str);
        zzc(3, zza);
    }

    @Override // com.google.android.gms.internal.location.zzo
    public final void zzp(PendingIntent pendingIntent, InterfaceC2022g interfaceC2022g) {
        Parcel zza = zza();
        zzc.zzd(zza, pendingIntent);
        zzc.zze(zza, interfaceC2022g);
        zzc(69, zza);
    }

    @Override // com.google.android.gms.internal.location.zzo
    public final void zzq(C5294d c5294d, PendingIntent pendingIntent, InterfaceC2022g interfaceC2022g) {
        Parcel zza = zza();
        zzc.zzd(zza, c5294d);
        zzc.zzd(zza, pendingIntent);
        zzc.zze(zza, interfaceC2022g);
        zzc(72, zza);
    }

    @Override // com.google.android.gms.internal.location.zzo
    public final void zzr(long j10, boolean z10, PendingIntent pendingIntent) {
        Parcel zza = zza();
        zza.writeLong(j10);
        zzc.zzc(zza, true);
        zzc.zzd(zza, pendingIntent);
        zzc(5, zza);
    }

    @Override // com.google.android.gms.internal.location.zzo
    public final void zzs(C5301g0 c5301g0, PendingIntent pendingIntent, InterfaceC2022g interfaceC2022g) {
        Parcel zza = zza();
        zzc.zzd(zza, c5301g0);
        zzc.zzd(zza, pendingIntent);
        zzc.zze(zza, interfaceC2022g);
        zzc(70, zza);
    }

    @Override // com.google.android.gms.internal.location.zzo
    public final void zzt(PendingIntent pendingIntent, C5330v c5330v, InterfaceC2022g interfaceC2022g) {
        Parcel zza = zza();
        zzc.zzd(zza, pendingIntent);
        zzc.zzd(zza, c5330v);
        zzc.zze(zza, interfaceC2022g);
        zzc(79, zza);
    }

    @Override // com.google.android.gms.internal.location.zzo
    public final void zzu(Location location) {
        Parcel zza = zza();
        zzc.zzd(zza, location);
        zzc(13, zza);
    }

    @Override // com.google.android.gms.internal.location.zzo
    public final void zzv(Location location, InterfaceC2022g interfaceC2022g) {
        Parcel zza = zza();
        zzc.zzd(zza, location);
        zzc.zze(zza, interfaceC2022g);
        zzc(85, zza);
    }

    @Override // com.google.android.gms.internal.location.zzo
    public final void zzw(boolean z10) {
        Parcel zza = zza();
        zzc.zzc(zza, z10);
        zzc(12, zza);
    }

    @Override // com.google.android.gms.internal.location.zzo
    public final void zzx(boolean z10, InterfaceC2022g interfaceC2022g) {
        Parcel zza = zza();
        zzc.zzc(zza, z10);
        zzc.zze(zza, interfaceC2022g);
        zzc(84, zza);
    }

    @Override // com.google.android.gms.internal.location.zzo
    public final void zzy(zzdb zzdbVar, InterfaceC2022g interfaceC2022g) {
        Parcel zza = zza();
        zzc.zzd(zza, zzdbVar);
        zzc.zze(zza, interfaceC2022g);
        zzc(89, zza);
    }

    @Override // com.google.android.gms.internal.location.zzo
    public final void zzz(zzdf zzdfVar) {
        Parcel zza = zza();
        zzc.zzd(zza, zzdfVar);
        zzc(59, zza);
    }
}
