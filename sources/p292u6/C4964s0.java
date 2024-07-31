package p292u6;

import android.os.Parcel;
import android.os.Parcelable;
import p125i6.C2602b;

/* renamed from: u6.s0 */
/* loaded from: classes.dex */
public final class C4964s0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m10422N = C2602b.m10422N(parcel);
        byte[][] bArr = null;
        while (parcel.dataPosition() < m10422N) {
            int m10412D = C2602b.m10412D(parcel);
            if (C2602b.m10446v(m10412D) != 1) {
                C2602b.m10421M(parcel, m10412D);
            } else {
                bArr = C2602b.m10432h(parcel, m10412D);
            }
        }
        C2602b.m10445u(parcel, m10422N);
        return new C4961r0(bArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C4961r0[i10];
    }
}
