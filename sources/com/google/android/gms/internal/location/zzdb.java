package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import p125i6.AbstractC2601a;
import p125i6.C2603c;
import p320w6.InterfaceC5323r0;
import p320w6.InterfaceC5329u0;

/* loaded from: classes.dex */
public final class zzdb extends AbstractC2601a {
    public static final Parcelable.Creator<zzdb> CREATOR = new zzdc();
    private final int zza;
    private final IBinder zzb;
    private final IBinder zzc;
    private final PendingIntent zzd;
    private final String zze;
    private final String zzf;

    public zzdb(int i10, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, String str, String str2) {
        this.zza = i10;
        this.zzb = iBinder;
        this.zzc = iBinder2;
        this.zzd = pendingIntent;
        this.zze = Build.VERSION.SDK_INT >= 30 ? null : str;
        this.zzf = str2;
    }

    public static zzdb zza(PendingIntent pendingIntent, String str, String str2) {
        return new zzdb(3, null, null, pendingIntent, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.os.IBinder] */
    /* JADX WARN: Type inference failed for: r8v0, types: [w6.r0, android.os.IBinder] */
    public static zzdb zzb(IInterface iInterface, InterfaceC5323r0 interfaceC5323r0, String str, String str2) {
        if (iInterface == null) {
            iInterface = null;
        }
        return new zzdb(2, iInterface, interfaceC5323r0, null, null, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.os.IBinder] */
    /* JADX WARN: Type inference failed for: r8v0, types: [w6.u0, android.os.IBinder] */
    public static zzdb zzc(IInterface iInterface, InterfaceC5329u0 interfaceC5329u0, String str, String str2) {
        if (iInterface == null) {
            iInterface = null;
        }
        return new zzdb(1, iInterface, interfaceC5329u0, null, null, str2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10485u(parcel, 1, this.zza);
        C2603c.m10484t(parcel, 2, this.zzb, false);
        C2603c.m10484t(parcel, 3, this.zzc, false);
        C2603c.m10454D(parcel, 4, this.zzd, i10, false);
        C2603c.m10456F(parcel, 5, this.zze, false);
        C2603c.m10456F(parcel, 6, this.zzf, false);
        C2603c.m10466b(parcel, m10465a);
    }
}
