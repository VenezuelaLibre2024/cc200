package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p125i6.C2602b;

/* loaded from: classes.dex */
public final class zzdg implements Parcelable.Creator<zzdd> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzdd createFromParcel(Parcel parcel) {
        int m10422N = C2602b.m10422N(parcel);
        long j10 = 0;
        long j11 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        Bundle bundle = null;
        String str4 = null;
        boolean z10 = false;
        while (parcel.dataPosition() < m10422N) {
            int m10412D = C2602b.m10412D(parcel);
            switch (C2602b.m10446v(m10412D)) {
                case 1:
                    j10 = C2602b.m10417I(parcel, m10412D);
                    break;
                case 2:
                    j11 = C2602b.m10417I(parcel, m10412D);
                    break;
                case 3:
                    z10 = C2602b.m10447w(parcel, m10412D);
                    break;
                case 4:
                    str = C2602b.m10440p(parcel, m10412D);
                    break;
                case 5:
                    str2 = C2602b.m10440p(parcel, m10412D);
                    break;
                case 6:
                    str3 = C2602b.m10440p(parcel, m10412D);
                    break;
                case 7:
                    bundle = C2602b.m10430f(parcel, m10412D);
                    break;
                case 8:
                    str4 = C2602b.m10440p(parcel, m10412D);
                    break;
                default:
                    C2602b.m10421M(parcel, m10412D);
                    break;
            }
        }
        C2602b.m10445u(parcel, m10422N);
        return new zzdd(j10, j11, z10, str, str2, str3, bundle, str4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzdd[] newArray(int i10) {
        return new zzdd[i10];
    }
}
