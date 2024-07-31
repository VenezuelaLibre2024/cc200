package p335x5;

import android.os.Parcel;
import android.os.Parcelable;
import p125i6.C2602b;

/* renamed from: x5.r */
/* loaded from: classes.dex */
public final class C5617r implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m10422N = C2602b.m10422N(parcel);
        int i10 = 0;
        while (parcel.dataPosition() < m10422N) {
            int m10412D = C2602b.m10412D(parcel);
            if (C2602b.m10446v(m10412D) != 1) {
                C2602b.m10421M(parcel, m10412D);
            } else {
                i10 = C2602b.m10414F(parcel, m10412D);
            }
        }
        C2602b.m10445u(parcel, m10422N);
        return new C5602d(i10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C5602d[i10];
    }
}
