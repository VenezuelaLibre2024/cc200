package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationRequest;
import java.util.ArrayList;
import p108h6.C2349d;
import p125i6.C2602b;

/* loaded from: classes.dex */
public final class zzde implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m10422N = C2602b.m10422N(parcel);
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        LocationRequest locationRequest = null;
        ArrayList arrayList = null;
        String str = null;
        String str2 = null;
        long j10 = Long.MAX_VALUE;
        while (parcel.dataPosition() < m10422N) {
            int m10412D = C2602b.m10412D(parcel);
            int m10446v = C2602b.m10446v(m10412D);
            if (m10446v == 1) {
                locationRequest = (LocationRequest) C2602b.m10439o(parcel, m10412D, LocationRequest.CREATOR);
            } else if (m10446v != 5) {
                switch (m10446v) {
                    case 8:
                        z10 = C2602b.m10447w(parcel, m10412D);
                        break;
                    case 9:
                        z11 = C2602b.m10447w(parcel, m10412D);
                        break;
                    case 10:
                        str = C2602b.m10440p(parcel, m10412D);
                        break;
                    case 11:
                        z12 = C2602b.m10447w(parcel, m10412D);
                        break;
                    case 12:
                        z13 = C2602b.m10447w(parcel, m10412D);
                        break;
                    case 13:
                        str2 = C2602b.m10440p(parcel, m10412D);
                        break;
                    case 14:
                        j10 = C2602b.m10417I(parcel, m10412D);
                        break;
                    default:
                        C2602b.m10421M(parcel, m10412D);
                        break;
                }
            } else {
                arrayList = C2602b.m10444t(parcel, m10412D, C2349d.CREATOR);
            }
        }
        C2602b.m10445u(parcel, m10422N);
        return new zzdd(locationRequest, arrayList, z10, z11, str, z12, z13, str2, j10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzdd[i10];
    }
}
