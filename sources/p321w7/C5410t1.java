package p321w7;

import android.os.Parcel;
import android.os.Parcelable;
import p125i6.C2602b;

/* renamed from: w7.t1 */
/* loaded from: classes.dex */
public final class C5410t1 implements Parcelable.Creator<C5406s0> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C5406s0 createFromParcel(Parcel parcel) {
        int m10422N = C2602b.m10422N(parcel);
        String str = null;
        while (parcel.dataPosition() < m10422N) {
            int m10412D = C2602b.m10412D(parcel);
            if (C2602b.m10446v(m10412D) != 1) {
                C2602b.m10421M(parcel, m10412D);
            } else {
                str = C2602b.m10440p(parcel, m10412D);
            }
        }
        C2602b.m10445u(parcel, m10422N);
        return new C5406s0(str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C5406s0[] newArray(int i10) {
        return new C5406s0[i10];
    }
}
