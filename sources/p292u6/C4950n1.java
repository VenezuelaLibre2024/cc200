package p292u6;

import android.os.Parcel;
import android.os.Parcelable;
import p125i6.C2602b;

/* renamed from: u6.n1 */
/* loaded from: classes.dex */
public final class C4950n1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m10422N = C2602b.m10422N(parcel);
        boolean z10 = false;
        while (parcel.dataPosition() < m10422N) {
            int m10412D = C2602b.m10412D(parcel);
            if (C2602b.m10446v(m10412D) != 1) {
                C2602b.m10421M(parcel, m10412D);
            } else {
                z10 = C2602b.m10447w(parcel, m10412D);
            }
        }
        C2602b.m10445u(parcel, m10422N);
        return new C4921f(z10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C4921f[i10];
    }
}