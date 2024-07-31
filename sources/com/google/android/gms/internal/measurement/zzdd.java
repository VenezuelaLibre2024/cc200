package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p125i6.AbstractC2601a;
import p125i6.C2603c;

/* loaded from: classes.dex */
public final class zzdd extends AbstractC2601a {
    public static final Parcelable.Creator<zzdd> CREATOR = new zzdg();
    public final long zza;
    public final long zzb;
    public final boolean zzc;
    public final String zzd;
    public final String zze;
    public final String zzf;
    public final Bundle zzg;
    public final String zzh;

    public zzdd(long j10, long j11, boolean z10, String str, String str2, String str3, Bundle bundle, String str4) {
        this.zza = j10;
        this.zzb = j11;
        this.zzc = z10;
        this.zzd = str;
        this.zze = str2;
        this.zzf = str3;
        this.zzg = bundle;
        this.zzh = str4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10489y(parcel, 1, this.zza);
        C2603c.m10489y(parcel, 2, this.zzb);
        C2603c.m10471g(parcel, 3, this.zzc);
        C2603c.m10456F(parcel, 4, this.zzd, false);
        C2603c.m10456F(parcel, 5, this.zze, false);
        C2603c.m10456F(parcel, 6, this.zzf, false);
        C2603c.m10474j(parcel, 7, this.zzg, false);
        C2603c.m10456F(parcel, 8, this.zzh, false);
        C2603c.m10466b(parcel, m10465a);
    }
}
