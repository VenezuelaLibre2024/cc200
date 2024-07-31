package p367z6;

import android.os.Parcel;
import android.os.Parcelable;
import p125i6.C2602b;

/* renamed from: z6.h0 */
/* loaded from: classes.dex */
public final class C6011h0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m10422N = C2602b.m10422N(parcel);
        double d10 = 0.0d;
        C6044y c6044y = null;
        while (parcel.dataPosition() < m10422N) {
            int m10412D = C2602b.m10412D(parcel);
            int m10446v = C2602b.m10446v(m10412D);
            if (m10446v == 2) {
                c6044y = (C6044y) C2602b.m10439o(parcel, m10412D, C6044y.CREATOR);
            } else if (m10446v != 3) {
                C2602b.m10421M(parcel, m10412D);
            } else {
                d10 = C2602b.m10450z(parcel, m10412D);
            }
        }
        C2602b.m10445u(parcel, m10422N);
        return new C6046z(c6044y, d10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C6046z[i10];
    }
}
