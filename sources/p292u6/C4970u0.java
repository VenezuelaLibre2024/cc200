package p292u6;

import android.os.Parcel;
import android.os.Parcelable;
import p125i6.C2602b;

/* renamed from: u6.u0 */
/* loaded from: classes.dex */
public final class C4970u0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m10422N = C2602b.m10422N(parcel);
        String str = null;
        String str2 = null;
        byte[] bArr = null;
        C4929h c4929h = null;
        C4925g c4925g = null;
        C4933i c4933i = null;
        C4917e c4917e = null;
        String str3 = null;
        while (parcel.dataPosition() < m10422N) {
            int m10412D = C2602b.m10412D(parcel);
            switch (C2602b.m10446v(m10412D)) {
                case 1:
                    str = C2602b.m10440p(parcel, m10412D);
                    break;
                case 2:
                    str2 = C2602b.m10440p(parcel, m10412D);
                    break;
                case 3:
                    bArr = C2602b.m10431g(parcel, m10412D);
                    break;
                case 4:
                    c4929h = (C4929h) C2602b.m10439o(parcel, m10412D, C4929h.CREATOR);
                    break;
                case 5:
                    c4925g = (C4925g) C2602b.m10439o(parcel, m10412D, C4925g.CREATOR);
                    break;
                case 6:
                    c4933i = (C4933i) C2602b.m10439o(parcel, m10412D, C4933i.CREATOR);
                    break;
                case 7:
                    c4917e = (C4917e) C2602b.m10439o(parcel, m10412D, C4917e.CREATOR);
                    break;
                case 8:
                    str3 = C2602b.m10440p(parcel, m10412D);
                    break;
                default:
                    C2602b.m10421M(parcel, m10412D);
                    break;
            }
        }
        C2602b.m10445u(parcel, m10422N);
        return new C4966t(str, str2, bArr, c4929h, c4925g, c4933i, c4917e, str3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C4966t[i10];
    }
}
