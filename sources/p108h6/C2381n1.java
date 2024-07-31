package p108h6;

import android.os.Parcel;
import android.os.Parcelable;
import p125i6.C2602b;

/* renamed from: h6.n1 */
/* loaded from: classes.dex */
public final class C2381n1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m10422N = C2602b.m10422N(parcel);
        boolean z10 = false;
        boolean z11 = false;
        int i10 = 0;
        C2400u c2400u = null;
        int[] iArr = null;
        int[] iArr2 = null;
        while (parcel.dataPosition() < m10422N) {
            int m10412D = C2602b.m10412D(parcel);
            switch (C2602b.m10446v(m10412D)) {
                case 1:
                    c2400u = (C2400u) C2602b.m10439o(parcel, m10412D, C2400u.CREATOR);
                    break;
                case 2:
                    z10 = C2602b.m10447w(parcel, m10412D);
                    break;
                case 3:
                    z11 = C2602b.m10447w(parcel, m10412D);
                    break;
                case 4:
                    iArr = C2602b.m10435k(parcel, m10412D);
                    break;
                case 5:
                    i10 = C2602b.m10414F(parcel, m10412D);
                    break;
                case 6:
                    iArr2 = C2602b.m10435k(parcel, m10412D);
                    break;
                default:
                    C2602b.m10421M(parcel, m10412D);
                    break;
            }
        }
        C2602b.m10445u(parcel, m10422N);
        return new C2355f(c2400u, z10, z11, iArr, i10, iArr2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C2355f[i10];
    }
}
