package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.location.Location;
import android.os.IInterface;
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
public interface zzo extends IInterface {
    @Deprecated
    Location zzd();

    @Deprecated
    InterfaceC2373l zze(C5296e c5296e, zzq zzqVar);

    @Deprecated
    LocationAvailability zzf(String str);

    void zzg(C5308k c5308k, PendingIntent pendingIntent, zzm zzmVar);

    void zzh(C5318p c5318p, zzs zzsVar, String str);

    void zzi(zzk zzkVar);

    @Deprecated
    void zzj(C5310l c5310l, zzq zzqVar);

    void zzk(zzdb zzdbVar, LocationRequest locationRequest, InterfaceC2022g interfaceC2022g);

    void zzl(PendingIntent pendingIntent, InterfaceC2022g interfaceC2022g);

    void zzm(PendingIntent pendingIntent);

    void zzn(PendingIntent pendingIntent, zzm zzmVar, String str);

    void zzo(String[] strArr, zzm zzmVar, String str);

    void zzp(PendingIntent pendingIntent, InterfaceC2022g interfaceC2022g);

    void zzq(C5294d c5294d, PendingIntent pendingIntent, InterfaceC2022g interfaceC2022g);

    void zzr(long j10, boolean z10, PendingIntent pendingIntent);

    void zzs(C5301g0 c5301g0, PendingIntent pendingIntent, InterfaceC2022g interfaceC2022g);

    void zzt(PendingIntent pendingIntent, C5330v c5330v, InterfaceC2022g interfaceC2022g);

    @Deprecated
    void zzu(Location location);

    void zzv(Location location, InterfaceC2022g interfaceC2022g);

    @Deprecated
    void zzw(boolean z10);

    void zzx(boolean z10, InterfaceC2022g interfaceC2022g);

    void zzy(zzdb zzdbVar, InterfaceC2022g interfaceC2022g);

    @Deprecated
    void zzz(zzdf zzdfVar);
}
