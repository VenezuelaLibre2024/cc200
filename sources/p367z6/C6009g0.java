package p367z6;

import android.os.Parcel;
import android.os.Parcelable;
import p125i6.C2602b;

/* renamed from: z6.g0 */
/* loaded from: classes.dex */
public final class C6009g0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m10422N = C2602b.m10422N(parcel);
        int i10 = 0;
        int i11 = 0;
        boolean z10 = false;
        C6042x c6042x = null;
        float f10 = 0.0f;
        while (parcel.dataPosition() < m10422N) {
            int m10412D = C2602b.m10412D(parcel);
            int m10446v = C2602b.m10446v(m10412D);
            if (m10446v == 2) {
                f10 = C2602b.m10410B(parcel, m10412D);
            } else if (m10446v == 3) {
                i10 = C2602b.m10414F(parcel, m10412D);
            } else if (m10446v == 4) {
                i11 = C2602b.m10414F(parcel, m10412D);
            } else if (m10446v == 5) {
                z10 = C2602b.m10447w(parcel, m10412D);
            } else if (m10446v != 6) {
                C2602b.m10421M(parcel, m10412D);
            } else {
                c6042x = (C6042x) C2602b.m10439o(parcel, m10412D, C6042x.CREATOR);
            }
        }
        C2602b.m10445u(parcel, m10422N);
        return new C6044y(f10, i10, i11, z10, c6042x);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C6044y[i10];
    }
}
