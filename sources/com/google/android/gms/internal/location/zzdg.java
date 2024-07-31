package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import p125i6.C2602b;

/* loaded from: classes.dex */
public final class zzdg implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m10422N = C2602b.m10422N(parcel);
        zzdd zzddVar = null;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        PendingIntent pendingIntent = null;
        IBinder iBinder3 = null;
        String str = null;
        int i10 = 1;
        while (parcel.dataPosition() < m10422N) {
            int m10412D = C2602b.m10412D(parcel);
            switch (C2602b.m10446v(m10412D)) {
                case 1:
                    i10 = C2602b.m10414F(parcel, m10412D);
                    break;
                case 2:
                    zzddVar = (zzdd) C2602b.m10439o(parcel, m10412D, zzdd.CREATOR);
                    break;
                case 3:
                    iBinder = C2602b.m10413E(parcel, m10412D);
                    break;
                case 4:
                    pendingIntent = (PendingIntent) C2602b.m10439o(parcel, m10412D, PendingIntent.CREATOR);
                    break;
                case 5:
                    iBinder2 = C2602b.m10413E(parcel, m10412D);
                    break;
                case 6:
                    iBinder3 = C2602b.m10413E(parcel, m10412D);
                    break;
                case 7:
                default:
                    C2602b.m10421M(parcel, m10412D);
                    break;
                case 8:
                    str = C2602b.m10440p(parcel, m10412D);
                    break;
            }
        }
        C2602b.m10445u(parcel, m10422N);
        return new zzdf(i10, zzddVar, iBinder, iBinder2, pendingIntent, iBinder3, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzdf[i10];
    }
}
