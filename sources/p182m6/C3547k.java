package p182m6;

import android.os.Parcel;
import android.os.Parcelable;
import p125i6.C2602b;

/* renamed from: m6.k */
/* loaded from: classes.dex */
public final class C3547k implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m10422N = C2602b.m10422N(parcel);
        Parcel parcel2 = null;
        int i10 = 0;
        C3544h c3544h = null;
        while (parcel.dataPosition() < m10422N) {
            int m10412D = C2602b.m10412D(parcel);
            int m10446v = C2602b.m10446v(m10412D);
            if (m10446v == 1) {
                i10 = C2602b.m10414F(parcel, m10412D);
            } else if (m10446v == 2) {
                parcel2 = C2602b.m10437m(parcel, m10412D);
            } else if (m10446v != 3) {
                C2602b.m10421M(parcel, m10412D);
            } else {
                c3544h = (C3544h) C2602b.m10439o(parcel, m10412D, C3544h.CREATOR);
            }
        }
        C2602b.m10445u(parcel, m10422N);
        return new C3539c(i10, parcel2, c3544h);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C3539c[i10];
    }
}
