package p108h6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p064e6.C1671d;
import p125i6.C2602b;

/* renamed from: h6.m1 */
/* loaded from: classes.dex */
public final class C2378m1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m10422N = C2602b.m10422N(parcel);
        Bundle bundle = null;
        C2355f c2355f = null;
        int i10 = 0;
        C1671d[] c1671dArr = null;
        while (parcel.dataPosition() < m10422N) {
            int m10412D = C2602b.m10412D(parcel);
            int m10446v = C2602b.m10446v(m10412D);
            if (m10446v == 1) {
                bundle = C2602b.m10430f(parcel, m10412D);
            } else if (m10446v == 2) {
                c1671dArr = (C1671d[]) C2602b.m10443s(parcel, m10412D, C1671d.CREATOR);
            } else if (m10446v == 3) {
                i10 = C2602b.m10414F(parcel, m10412D);
            } else if (m10446v != 4) {
                C2602b.m10421M(parcel, m10412D);
            } else {
                c2355f = (C2355f) C2602b.m10439o(parcel, m10412D, C2355f.CREATOR);
            }
        }
        C2602b.m10445u(parcel, m10422N);
        return new C2375l1(bundle, c1671dArr, i10, c2355f);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C2375l1[i10];
    }
}
