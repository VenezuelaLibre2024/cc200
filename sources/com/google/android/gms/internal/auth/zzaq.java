package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import p108h6.C2394s;
import p125i6.AbstractC2601a;
import p125i6.C2603c;

/* loaded from: classes.dex */
public final class zzaq extends AbstractC2601a {
    public static final Parcelable.Creator<zzaq> CREATOR = new zzar();
    public final int zza;
    public final String zzb;

    public zzaq(int i10, String str) {
        this.zza = 1;
        this.zzb = (String) C2394s.m9619l(str);
    }

    public zzaq(String str) {
        this(1, str);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10485u(parcel, 1, this.zza);
        C2603c.m10456F(parcel, 2, this.zzb, false);
        C2603c.m10466b(parcel, m10465a);
    }
}
