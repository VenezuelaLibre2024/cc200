package p292u6;

import android.os.Parcel;
import android.os.Parcelable;
import p125i6.C2602b;

/* renamed from: u6.m1 */
/* loaded from: classes.dex */
public final class C4947m1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m10422N = C2602b.m10422N(parcel);
        C4960r c4960r = null;
        C4908b2 c4908b2 = null;
        C4922f0 c4922f0 = null;
        C4932h2 c4932h2 = null;
        C4940k0 c4940k0 = null;
        C4946m0 c4946m0 = null;
        C4916d2 c4916d2 = null;
        C4955p0 c4955p0 = null;
        C4963s c4963s = null;
        C4961r0 c4961r0 = null;
        while (parcel.dataPosition() < m10422N) {
            int m10412D = C2602b.m10412D(parcel);
            switch (C2602b.m10446v(m10412D)) {
                case 2:
                    c4960r = (C4960r) C2602b.m10439o(parcel, m10412D, C4960r.CREATOR);
                    break;
                case 3:
                    c4908b2 = (C4908b2) C2602b.m10439o(parcel, m10412D, C4908b2.CREATOR);
                    break;
                case 4:
                    c4922f0 = (C4922f0) C2602b.m10439o(parcel, m10412D, C4922f0.CREATOR);
                    break;
                case 5:
                    c4932h2 = (C4932h2) C2602b.m10439o(parcel, m10412D, C4932h2.CREATOR);
                    break;
                case 6:
                    c4940k0 = (C4940k0) C2602b.m10439o(parcel, m10412D, C4940k0.CREATOR);
                    break;
                case 7:
                    c4946m0 = (C4946m0) C2602b.m10439o(parcel, m10412D, C4946m0.CREATOR);
                    break;
                case 8:
                    c4916d2 = (C4916d2) C2602b.m10439o(parcel, m10412D, C4916d2.CREATOR);
                    break;
                case 9:
                    c4955p0 = (C4955p0) C2602b.m10439o(parcel, m10412D, C4955p0.CREATOR);
                    break;
                case 10:
                    c4963s = (C4963s) C2602b.m10439o(parcel, m10412D, C4963s.CREATOR);
                    break;
                case 11:
                    c4961r0 = (C4961r0) C2602b.m10439o(parcel, m10412D, C4961r0.CREATOR);
                    break;
                default:
                    C2602b.m10421M(parcel, m10412D);
                    break;
            }
        }
        C2602b.m10445u(parcel, m10422N);
        return new C4913d(c4960r, c4908b2, c4922f0, c4932h2, c4940k0, c4946m0, c4916d2, c4955p0, c4963s, c4961r0);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C4913d[i10];
    }
}
