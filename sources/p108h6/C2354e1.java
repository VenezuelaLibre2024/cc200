package p108h6;

import android.os.Parcel;
import android.os.Parcelable;
import p125i6.C2602b;

/* renamed from: h6.e1 */
/* loaded from: classes.dex */
public final class C2354e1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m10422N = C2602b.m10422N(parcel);
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = false;
        int i11 = 0;
        int i12 = 0;
        while (parcel.dataPosition() < m10422N) {
            int m10412D = C2602b.m10412D(parcel);
            int m10446v = C2602b.m10446v(m10412D);
            if (m10446v == 1) {
                i10 = C2602b.m10414F(parcel, m10412D);
            } else if (m10446v == 2) {
                z10 = C2602b.m10447w(parcel, m10412D);
            } else if (m10446v == 3) {
                z11 = C2602b.m10447w(parcel, m10412D);
            } else if (m10446v == 4) {
                i11 = C2602b.m10414F(parcel, m10412D);
            } else if (m10446v != 5) {
                C2602b.m10421M(parcel, m10412D);
            } else {
                i12 = C2602b.m10414F(parcel, m10412D);
            }
        }
        C2602b.m10445u(parcel, m10422N);
        return new C2400u(i10, z10, z11, i11, i12);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C2400u[i10];
    }
}
