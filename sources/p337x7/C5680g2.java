package p337x7;

import android.os.Parcel;
import android.os.Parcelable;
import p125i6.C2602b;
import p321w7.C5428z1;

/* renamed from: x7.g2 */
/* loaded from: classes.dex */
public final class C5680g2 implements Parcelable.Creator<C5684h2> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C5684h2 createFromParcel(Parcel parcel) {
        int m10422N = C2602b.m10422N(parcel);
        C5685i c5685i = null;
        C5676f2 c5676f2 = null;
        C5428z1 c5428z1 = null;
        while (parcel.dataPosition() < m10422N) {
            int m10412D = C2602b.m10412D(parcel);
            int m10446v = C2602b.m10446v(m10412D);
            if (m10446v == 1) {
                c5685i = (C5685i) C2602b.m10439o(parcel, m10412D, C5685i.CREATOR);
            } else if (m10446v == 2) {
                c5676f2 = (C5676f2) C2602b.m10439o(parcel, m10412D, C5676f2.CREATOR);
            } else if (m10446v != 3) {
                C2602b.m10421M(parcel, m10412D);
            } else {
                c5428z1 = (C5428z1) C2602b.m10439o(parcel, m10412D, C5428z1.CREATOR);
            }
        }
        C2602b.m10445u(parcel, m10422N);
        return new C5684h2(c5685i, c5676f2, c5428z1);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C5684h2[] newArray(int i10) {
        return new C5684h2[i10];
    }
}
