package com.google.android.gms.internal.p377firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import p125i6.C2602b;

/* loaded from: classes.dex */
public final class zzafl implements Parcelable.Creator<zzafm> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzafm createFromParcel(Parcel parcel) {
        int m10422N = C2602b.m10422N(parcel);
        String str = null;
        String str2 = null;
        Long l10 = null;
        String str3 = null;
        Long l11 = null;
        while (parcel.dataPosition() < m10422N) {
            int m10412D = C2602b.m10412D(parcel);
            int m10446v = C2602b.m10446v(m10412D);
            if (m10446v == 2) {
                str = C2602b.m10440p(parcel, m10412D);
            } else if (m10446v == 3) {
                str2 = C2602b.m10440p(parcel, m10412D);
            } else if (m10446v == 4) {
                l10 = C2602b.m10418J(parcel, m10412D);
            } else if (m10446v == 5) {
                str3 = C2602b.m10440p(parcel, m10412D);
            } else if (m10446v != 6) {
                C2602b.m10421M(parcel, m10412D);
            } else {
                l11 = C2602b.m10418J(parcel, m10412D);
            }
        }
        C2602b.m10445u(parcel, m10422N);
        return new zzafm(str, str2, l10, str3, l11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzafm[] newArray(int i10) {
        return new zzafm[i10];
    }
}
