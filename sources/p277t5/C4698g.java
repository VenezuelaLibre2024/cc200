package p277t5;

import android.os.Parcel;
import android.os.Parcelable;
import p125i6.C2602b;

/* renamed from: t5.g */
/* loaded from: classes.dex */
public final class C4698g implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m10422N = C2602b.m10422N(parcel);
        String str = null;
        String str2 = null;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        long j10 = 0;
        while (parcel.dataPosition() < m10422N) {
            int m10412D = C2602b.m10412D(parcel);
            switch (C2602b.m10446v(m10412D)) {
                case 1:
                    i10 = C2602b.m10414F(parcel, m10412D);
                    break;
                case 2:
                    j10 = C2602b.m10417I(parcel, m10412D);
                    break;
                case 3:
                    str = C2602b.m10440p(parcel, m10412D);
                    break;
                case 4:
                    i11 = C2602b.m10414F(parcel, m10412D);
                    break;
                case 5:
                    i12 = C2602b.m10414F(parcel, m10412D);
                    break;
                case 6:
                    str2 = C2602b.m10440p(parcel, m10412D);
                    break;
                default:
                    C2602b.m10421M(parcel, m10412D);
                    break;
            }
        }
        C2602b.m10445u(parcel, m10422N);
        return new C4692a(i10, j10, str, i11, i12, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C4692a[i10];
    }
}
