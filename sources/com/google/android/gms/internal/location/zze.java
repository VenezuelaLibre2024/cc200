package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import p064e6.C1671d;
import p125i6.C2602b;

/* loaded from: classes.dex */
public final class zze implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m10422N = C2602b.m10422N(parcel);
        List zzk = zzds.zzk();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        zzd zzdVar = null;
        while (parcel.dataPosition() < m10422N) {
            int m10412D = C2602b.m10412D(parcel);
            switch (C2602b.m10446v(m10412D)) {
                case 1:
                    i10 = C2602b.m10414F(parcel, m10412D);
                    break;
                case 2:
                    i11 = C2602b.m10414F(parcel, m10412D);
                    break;
                case 3:
                    str = C2602b.m10440p(parcel, m10412D);
                    break;
                case 4:
                    str2 = C2602b.m10440p(parcel, m10412D);
                    break;
                case 5:
                    i12 = C2602b.m10414F(parcel, m10412D);
                    break;
                case 6:
                    str3 = C2602b.m10440p(parcel, m10412D);
                    break;
                case 7:
                    zzdVar = (zzd) C2602b.m10439o(parcel, m10412D, zzd.CREATOR);
                    break;
                case 8:
                    zzk = C2602b.m10444t(parcel, m10412D, C1671d.CREATOR);
                    break;
                default:
                    C2602b.m10421M(parcel, m10412D);
                    break;
            }
        }
        C2602b.m10445u(parcel, m10422N);
        return new zzd(i10, i11, str, str2, str3, i12, zzk, zzdVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzd[i10];
    }
}
