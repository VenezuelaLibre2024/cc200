package p108h6;

import android.os.Parcel;
import android.os.Parcelable;
import p125i6.C2602b;

/* renamed from: h6.m0 */
/* loaded from: classes.dex */
public final class C2377m0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m10422N = C2602b.m10422N(parcel);
        String str = null;
        String str2 = null;
        long j10 = 0;
        long j11 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = -1;
        while (parcel.dataPosition() < m10422N) {
            int m10412D = C2602b.m10412D(parcel);
            switch (C2602b.m10446v(m10412D)) {
                case 1:
                    i10 = C2602b.m10414F(parcel, m10412D);
                    break;
                case 2:
                    i11 = C2602b.m10414F(parcel, m10412D);
                    break;
                case 3:
                    i12 = C2602b.m10414F(parcel, m10412D);
                    break;
                case 4:
                    j10 = C2602b.m10417I(parcel, m10412D);
                    break;
                case 5:
                    j11 = C2602b.m10417I(parcel, m10412D);
                    break;
                case 6:
                    str = C2602b.m10440p(parcel, m10412D);
                    break;
                case 7:
                    str2 = C2602b.m10440p(parcel, m10412D);
                    break;
                case 8:
                    i13 = C2602b.m10414F(parcel, m10412D);
                    break;
                case 9:
                    i14 = C2602b.m10414F(parcel, m10412D);
                    break;
                default:
                    C2602b.m10421M(parcel, m10412D);
                    break;
            }
        }
        C2602b.m10445u(parcel, m10422N);
        return new C2385p(i10, i11, i12, j10, j11, str, str2, i13, i14);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C2385p[i10];
    }
}
