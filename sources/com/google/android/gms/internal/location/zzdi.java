package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import p125i6.C2602b;

/* loaded from: classes.dex */
public final class zzdi implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m10422N = C2602b.m10422N(parcel);
        double d10 = 0.0d;
        double d11 = 0.0d;
        int i10 = 0;
        short s10 = 0;
        int i11 = 0;
        String str = null;
        float f10 = 0.0f;
        long j10 = 0;
        int i12 = -1;
        while (parcel.dataPosition() < m10422N) {
            int m10412D = C2602b.m10412D(parcel);
            switch (C2602b.m10446v(m10412D)) {
                case 1:
                    str = C2602b.m10440p(parcel, m10412D);
                    break;
                case 2:
                    j10 = C2602b.m10417I(parcel, m10412D);
                    break;
                case 3:
                    s10 = C2602b.m10419K(parcel, m10412D);
                    break;
                case 4:
                    d10 = C2602b.m10450z(parcel, m10412D);
                    break;
                case 5:
                    d11 = C2602b.m10450z(parcel, m10412D);
                    break;
                case 6:
                    f10 = C2602b.m10410B(parcel, m10412D);
                    break;
                case 7:
                    i10 = C2602b.m10414F(parcel, m10412D);
                    break;
                case 8:
                    i11 = C2602b.m10414F(parcel, m10412D);
                    break;
                case 9:
                    i12 = C2602b.m10414F(parcel, m10412D);
                    break;
                default:
                    C2602b.m10421M(parcel, m10412D);
                    break;
            }
        }
        C2602b.m10445u(parcel, m10422N);
        return new zzdh(str, i10, s10, d10, d11, f10, j10, i11, i12);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzdh[i10];
    }
}
