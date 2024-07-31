package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import p125i6.AbstractC2601a;
import p125i6.C2603c;
import p320w6.AbstractBinderC5321q0;
import p320w6.AbstractBinderC5327t0;
import p320w6.InterfaceC5323r0;
import p320w6.InterfaceC5329u0;

@Deprecated
/* loaded from: classes.dex */
public final class zzdf extends AbstractC2601a {
    public static final Parcelable.Creator<zzdf> CREATOR = new zzdg();
    private final int zza;
    private final zzdd zzb;
    private final InterfaceC5329u0 zzc;
    private final InterfaceC5323r0 zzd;
    private final PendingIntent zze;
    private final zzk zzf;
    private final String zzg;

    public zzdf(int i10, zzdd zzddVar, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, IBinder iBinder3, String str) {
        this.zza = i10;
        this.zzb = zzddVar;
        zzk zzkVar = null;
        this.zzc = iBinder != null ? AbstractBinderC5327t0.zzb(iBinder) : null;
        this.zze = pendingIntent;
        this.zzd = iBinder2 != null ? AbstractBinderC5321q0.zzb(iBinder2) : null;
        if (iBinder3 != null) {
            IInterface queryLocalInterface = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            zzkVar = queryLocalInterface instanceof zzk ? (zzk) queryLocalInterface : new zzi(iBinder3);
        }
        this.zzf = zzkVar;
        this.zzg = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10485u(parcel, 1, this.zza);
        C2603c.m10454D(parcel, 2, this.zzb, i10, false);
        InterfaceC5329u0 interfaceC5329u0 = this.zzc;
        C2603c.m10484t(parcel, 3, interfaceC5329u0 == null ? null : interfaceC5329u0.asBinder(), false);
        C2603c.m10454D(parcel, 4, this.zze, i10, false);
        InterfaceC5323r0 interfaceC5323r0 = this.zzd;
        C2603c.m10484t(parcel, 5, interfaceC5323r0 == null ? null : interfaceC5323r0.asBinder(), false);
        zzk zzkVar = this.zzf;
        C2603c.m10484t(parcel, 6, zzkVar != null ? zzkVar.asBinder() : null, false);
        C2603c.m10456F(parcel, 8, this.zzg, false);
        C2603c.m10466b(parcel, m10465a);
    }
}
