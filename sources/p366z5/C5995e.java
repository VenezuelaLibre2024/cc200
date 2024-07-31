package p366z5;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p125i6.C2602b;

/* renamed from: z5.e */
/* loaded from: classes.dex */
public final class C5995e implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m10422N = C2602b.m10422N(parcel);
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        PendingIntent pendingIntent = null;
        Bundle bundle = null;
        byte[] bArr = null;
        while (parcel.dataPosition() < m10422N) {
            int m10412D = C2602b.m10412D(parcel);
            int m10446v = C2602b.m10446v(m10412D);
            if (m10446v == 1) {
                i11 = C2602b.m10414F(parcel, m10412D);
            } else if (m10446v == 2) {
                pendingIntent = (PendingIntent) C2602b.m10439o(parcel, m10412D, PendingIntent.CREATOR);
            } else if (m10446v == 3) {
                i12 = C2602b.m10414F(parcel, m10412D);
            } else if (m10446v == 4) {
                bundle = C2602b.m10430f(parcel, m10412D);
            } else if (m10446v == 5) {
                bArr = C2602b.m10431g(parcel, m10412D);
            } else if (m10446v != 1000) {
                C2602b.m10421M(parcel, m10412D);
            } else {
                i10 = C2602b.m10414F(parcel, m10412D);
            }
        }
        C2602b.m10445u(parcel, m10422N);
        return new C5993c(i10, i11, pendingIntent, i12, bundle, bArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C5993c[i10];
    }
}
