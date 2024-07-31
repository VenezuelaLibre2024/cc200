package p079f6;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import p064e6.C1667b;
import p125i6.C2602b;

/* renamed from: f6.y */
/* loaded from: classes.dex */
public final class C1865y implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m10422N = C2602b.m10422N(parcel);
        String str = null;
        C1667b c1667b = null;
        int i10 = 0;
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < m10422N) {
            int m10412D = C2602b.m10412D(parcel);
            int m10446v = C2602b.m10446v(m10412D);
            if (m10446v == 1) {
                i10 = C2602b.m10414F(parcel, m10412D);
            } else if (m10446v == 2) {
                str = C2602b.m10440p(parcel, m10412D);
            } else if (m10446v == 3) {
                pendingIntent = (PendingIntent) C2602b.m10439o(parcel, m10412D, PendingIntent.CREATOR);
            } else if (m10446v != 4) {
                C2602b.m10421M(parcel, m10412D);
            } else {
                c1667b = (C1667b) C2602b.m10439o(parcel, m10412D, C1667b.CREATOR);
            }
        }
        C2602b.m10445u(parcel, m10422N);
        return new Status(i10, str, pendingIntent, c1667b);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new Status[i10];
    }
}
