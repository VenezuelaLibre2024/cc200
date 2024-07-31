package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import p108h6.C2394s;
import p125i6.AbstractC2601a;
import p125i6.C2603c;

/* loaded from: classes.dex */
public final class zzav extends AbstractC2601a {
    public static final Parcelable.Creator<zzav> CREATOR = new zzaw();
    public final int zza;
    public final String zzb;
    public final int zzc;

    public zzav(int i10, String str, int i11) {
        this.zza = 1;
        this.zzb = (String) C2394s.m9619l(str);
        this.zzc = i11;
    }

    public zzav(String str, int i10) {
        this(1, str, i10);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10485u(parcel, 1, this.zza);
        C2603c.m10456F(parcel, 2, this.zzb, false);
        C2603c.m10485u(parcel, 3, this.zzc);
        C2603c.m10466b(parcel, m10465a);
    }
}
