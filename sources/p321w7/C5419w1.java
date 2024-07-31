package p321w7;

import android.os.Parcel;
import android.os.Parcelable;
import p125i6.C2602b;

/* renamed from: w7.w1 */
/* loaded from: classes.dex */
public final class C5419w1 implements Parcelable.Creator<C5350c1> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C5350c1 createFromParcel(Parcel parcel) {
        int m10422N = C2602b.m10422N(parcel);
        boolean z10 = false;
        String str = null;
        String str2 = null;
        boolean z11 = false;
        while (parcel.dataPosition() < m10422N) {
            int m10412D = C2602b.m10412D(parcel);
            int m10446v = C2602b.m10446v(m10412D);
            if (m10446v == 2) {
                str = C2602b.m10440p(parcel, m10412D);
            } else if (m10446v == 3) {
                str2 = C2602b.m10440p(parcel, m10412D);
            } else if (m10446v == 4) {
                z10 = C2602b.m10447w(parcel, m10412D);
            } else if (m10446v != 5) {
                C2602b.m10421M(parcel, m10412D);
            } else {
                z11 = C2602b.m10447w(parcel, m10412D);
            }
        }
        C2602b.m10445u(parcel, m10422N);
        return new C5350c1(str, str2, z10, z11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C5350c1[] newArray(int i10) {
        return new C5350c1[i10];
    }
}
