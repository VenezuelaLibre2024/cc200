package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import p125i6.AbstractC2601a;
import p125i6.C2603c;

/* loaded from: classes.dex */
public final class zzbw extends AbstractC2601a {
    public static final Parcelable.Creator<zzbw> CREATOR = new zzbx();
    public final int zza;
    public String zzb;

    public zzbw() {
        this.zza = 1;
    }

    public zzbw(int i10, String str) {
        this.zza = i10;
        this.zzb = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10485u(parcel, 1, this.zza);
        C2603c.m10456F(parcel, 2, this.zzb, false);
        C2603c.m10466b(parcel, m10465a);
    }

    public final zzbw zza(String str) {
        this.zzb = str;
        return this;
    }
}
