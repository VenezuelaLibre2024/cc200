package p292u6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p125i6.C2602b;

/* renamed from: u6.t0 */
/* loaded from: classes.dex */
public final class C4967t0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m10422N = C2602b.m10422N(parcel);
        C4981y c4981y = null;
        C4902a0 c4902a0 = null;
        byte[] bArr = null;
        ArrayList arrayList = null;
        Double d10 = null;
        ArrayList arrayList2 = null;
        C4939k c4939k = null;
        Integer num = null;
        C4918e0 c4918e0 = null;
        String str = null;
        C4913d c4913d = null;
        while (parcel.dataPosition() < m10422N) {
            int m10412D = C2602b.m10412D(parcel);
            switch (C2602b.m10446v(m10412D)) {
                case 2:
                    c4981y = (C4981y) C2602b.m10439o(parcel, m10412D, C4981y.CREATOR);
                    break;
                case 3:
                    c4902a0 = (C4902a0) C2602b.m10439o(parcel, m10412D, C4902a0.CREATOR);
                    break;
                case 4:
                    bArr = C2602b.m10431g(parcel, m10412D);
                    break;
                case 5:
                    arrayList = C2602b.m10444t(parcel, m10412D, C4975w.CREATOR);
                    break;
                case 6:
                    d10 = C2602b.m10409A(parcel, m10412D);
                    break;
                case 7:
                    arrayList2 = C2602b.m10444t(parcel, m10412D, C4972v.CREATOR);
                    break;
                case 8:
                    c4939k = (C4939k) C2602b.m10439o(parcel, m10412D, C4939k.CREATOR);
                    break;
                case 9:
                    num = C2602b.m10415G(parcel, m10412D);
                    break;
                case 10:
                    c4918e0 = (C4918e0) C2602b.m10439o(parcel, m10412D, C4918e0.CREATOR);
                    break;
                case 11:
                    str = C2602b.m10440p(parcel, m10412D);
                    break;
                case 12:
                    c4913d = (C4913d) C2602b.m10439o(parcel, m10412D, C4913d.CREATOR);
                    break;
                default:
                    C2602b.m10421M(parcel, m10412D);
                    break;
            }
        }
        C2602b.m10445u(parcel, m10422N);
        return new C4969u(c4981y, c4902a0, bArr, arrayList, d10, arrayList2, c4939k, num, c4918e0, str, c4913d);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C4969u[i10];
    }
}
