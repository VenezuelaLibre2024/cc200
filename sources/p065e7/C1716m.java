package p065e7;

import android.os.Parcel;
import android.os.Parcelable;
import p064e6.C1667b;
import p108h6.C2398t0;
import p125i6.C2602b;

/* renamed from: e7.m */
/* loaded from: classes.dex */
public final class C1716m implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m10422N = C2602b.m10422N(parcel);
        C1667b c1667b = null;
        int i10 = 0;
        C2398t0 c2398t0 = null;
        while (parcel.dataPosition() < m10422N) {
            int m10412D = C2602b.m10412D(parcel);
            int m10446v = C2602b.m10446v(m10412D);
            if (m10446v == 1) {
                i10 = C2602b.m10414F(parcel, m10412D);
            } else if (m10446v == 2) {
                c1667b = (C1667b) C2602b.m10439o(parcel, m10412D, C1667b.CREATOR);
            } else if (m10446v != 3) {
                C2602b.m10421M(parcel, m10412D);
            } else {
                c2398t0 = (C2398t0) C2602b.m10439o(parcel, m10412D, C2398t0.CREATOR);
            }
        }
        C2602b.m10445u(parcel, m10422N);
        return new C1715l(i10, c1667b, c2398t0);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C1715l[i10];
    }
}