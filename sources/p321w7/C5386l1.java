package p321w7;

import android.os.Parcel;
import android.os.Parcelable;
import p125i6.C2602b;

/* renamed from: w7.l1 */
/* loaded from: classes.dex */
public final class C5386l1 implements Parcelable.Creator<C5353d0> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C5353d0 createFromParcel(Parcel parcel) {
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
        return new C5353d0(str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C5353d0[] newArray(int i10) {
        return new C5353d0[i10];
    }
}
