package com.google.android.gms.internal.p377firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import p125i6.C2602b;

/* loaded from: classes.dex */
public final class zzagp implements Parcelable.Creator<zzagq> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzagq createFromParcel(Parcel parcel) {
        int m10422N = C2602b.m10422N(parcel);
        while (parcel.dataPosition() < m10422N) {
            int m10412D = C2602b.m10412D(parcel);
            C2602b.m10446v(m10412D);
            C2602b.m10421M(parcel, m10412D);
        }
        C2602b.m10445u(parcel, m10422N);
        return new zzagq();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzagq[] newArray(int i10) {
        return new zzagq[i10];
    }
}
