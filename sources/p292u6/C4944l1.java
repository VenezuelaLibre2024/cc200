package p292u6;

import android.os.Parcel;
import android.os.Parcelable;
import p125i6.C2602b;

/* renamed from: u6.l1 */
/* loaded from: classes.dex */
public final class C4944l1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m10422N = C2602b.m10422N(parcel);
        C4926g0 c4926g0 = null;
        C4953o1 c4953o1 = null;
        C4921f c4921f = null;
        C4959q1 c4959q1 = null;
        while (parcel.dataPosition() < m10422N) {
            int m10412D = C2602b.m10412D(parcel);
            int m10446v = C2602b.m10446v(m10412D);
            if (m10446v == 1) {
                c4926g0 = (C4926g0) C2602b.m10439o(parcel, m10412D, C4926g0.CREATOR);
            } else if (m10446v == 2) {
                c4953o1 = (C4953o1) C2602b.m10439o(parcel, m10412D, C4953o1.CREATOR);
            } else if (m10446v == 3) {
                c4921f = (C4921f) C2602b.m10439o(parcel, m10412D, C4921f.CREATOR);
            } else if (m10446v != 4) {
                C2602b.m10421M(parcel, m10412D);
            } else {
                c4959q1 = (C4959q1) C2602b.m10439o(parcel, m10412D, C4959q1.CREATOR);
            }
        }
        C2602b.m10445u(parcel, m10422N);
        return new C4917e(c4926g0, c4953o1, c4921f, c4959q1);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C4917e[i10];
    }
}
