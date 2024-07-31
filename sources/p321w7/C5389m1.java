package p321w7;

import android.os.Parcel;
import android.os.Parcelable;
import p125i6.C2602b;

/* renamed from: w7.m1 */
/* loaded from: classes.dex */
public final class C5389m1 implements Parcelable.Creator<C5361f0> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C5361f0 createFromParcel(Parcel parcel) {
        int m10422N = C2602b.m10422N(parcel);
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < m10422N) {
            int m10412D = C2602b.m10412D(parcel);
            int m10446v = C2602b.m10446v(m10412D);
            if (m10446v == 1) {
                str = C2602b.m10440p(parcel, m10412D);
            } else if (m10446v != 2) {
                C2602b.m10421M(parcel, m10412D);
            } else {
                str2 = C2602b.m10440p(parcel, m10412D);
            }
        }
        C2602b.m10445u(parcel, m10422N);
        return new C5361f0(str, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C5361f0[] newArray(int i10) {
        return new C5361f0[i10];
    }
}
