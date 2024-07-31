package p034c7;

import android.os.Parcel;
import android.os.Parcelable;
import p125i6.C2602b;

/* renamed from: c7.tb */
/* loaded from: classes.dex */
public final class C0898tb implements Parcelable.Creator<C0856qb> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C0856qb createFromParcel(Parcel parcel) {
        int m10422N = C2602b.m10422N(parcel);
        String str = null;
        long j10 = 0;
        int i10 = 0;
        while (parcel.dataPosition() < m10422N) {
            int m10412D = C2602b.m10412D(parcel);
            int m10446v = C2602b.m10446v(m10412D);
            if (m10446v == 1) {
                str = C2602b.m10440p(parcel, m10412D);
            } else if (m10446v == 2) {
                j10 = C2602b.m10417I(parcel, m10412D);
            } else if (m10446v != 3) {
                C2602b.m10421M(parcel, m10412D);
            } else {
                i10 = C2602b.m10414F(parcel, m10412D);
            }
        }
        C2602b.m10445u(parcel, m10422N);
        return new C0856qb(str, j10, i10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C0856qb[] newArray(int i10) {
        return new C0856qb[i10];
    }
}
