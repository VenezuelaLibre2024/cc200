package p335x5;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import p125i6.C2602b;

/* renamed from: x5.y */
/* loaded from: classes.dex */
public final class C5624y implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m10422N = C2602b.m10422N(parcel);
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < m10422N) {
            int m10412D = C2602b.m10412D(parcel);
            if (C2602b.m10446v(m10412D) != 1) {
                C2602b.m10421M(parcel, m10412D);
            } else {
                pendingIntent = (PendingIntent) C2602b.m10439o(parcel, m10412D, PendingIntent.CREATOR);
            }
        }
        C2602b.m10445u(parcel, m10422N);
        return new C5605f(pendingIntent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C5605f[i10];
    }
}
