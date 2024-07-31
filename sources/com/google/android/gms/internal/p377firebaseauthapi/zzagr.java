package com.google.android.gms.internal.p377firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import p125i6.C2602b;

/* loaded from: classes.dex */
public final class zzagr implements Parcelable.Creator<zzags> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzags createFromParcel(Parcel parcel) {
        int m10422N = C2602b.m10422N(parcel);
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        while (parcel.dataPosition() < m10422N) {
            int m10412D = C2602b.m10412D(parcel);
            switch (C2602b.m10446v(m10412D)) {
                case 2:
                    str = C2602b.m10440p(parcel, m10412D);
                    break;
                case 3:
                    str2 = C2602b.m10440p(parcel, m10412D);
                    break;
                case 4:
                    str3 = C2602b.m10440p(parcel, m10412D);
                    break;
                case 5:
                    str4 = C2602b.m10440p(parcel, m10412D);
                    break;
                case 6:
                    str5 = C2602b.m10440p(parcel, m10412D);
                    break;
                case 7:
                    str6 = C2602b.m10440p(parcel, m10412D);
                    break;
                case 8:
                    str7 = C2602b.m10440p(parcel, m10412D);
                    break;
                case 9:
                    str8 = C2602b.m10440p(parcel, m10412D);
                    break;
                case 10:
                    z10 = C2602b.m10447w(parcel, m10412D);
                    break;
                case 11:
                    z11 = C2602b.m10447w(parcel, m10412D);
                    break;
                case 12:
                    str9 = C2602b.m10440p(parcel, m10412D);
                    break;
                case 13:
                    str10 = C2602b.m10440p(parcel, m10412D);
                    break;
                case 14:
                    str11 = C2602b.m10440p(parcel, m10412D);
                    break;
                case 15:
                    str12 = C2602b.m10440p(parcel, m10412D);
                    break;
                case 16:
                    z12 = C2602b.m10447w(parcel, m10412D);
                    break;
                case 17:
                    str13 = C2602b.m10440p(parcel, m10412D);
                    break;
                default:
                    C2602b.m10421M(parcel, m10412D);
                    break;
            }
        }
        C2602b.m10445u(parcel, m10422N);
        return new zzags(str, str2, str3, str4, str5, str6, str7, str8, z10, z11, str9, str10, str11, str12, z12, str13);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzags[] newArray(int i10) {
        return new zzags[i10];
    }
}
