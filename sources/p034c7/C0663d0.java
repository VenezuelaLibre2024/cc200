package p034c7;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p125i6.C2602b;

/* renamed from: c7.d0 */
/* loaded from: classes.dex */
public final class C0663d0 implements Parcelable.Creator<C0618a0> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C0618a0 createFromParcel(Parcel parcel) {
        int m10422N = C2602b.m10422N(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < m10422N) {
            int m10412D = C2602b.m10412D(parcel);
            if (C2602b.m10446v(m10412D) != 2) {
                C2602b.m10421M(parcel, m10412D);
            } else {
                bundle = C2602b.m10430f(parcel, m10412D);
            }
        }
        C2602b.m10445u(parcel, m10422N);
        return new C0618a0(bundle);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C0618a0[] newArray(int i10) {
        return new C0618a0[i10];
    }
}
