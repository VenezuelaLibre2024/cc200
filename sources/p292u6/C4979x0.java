package p292u6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p125i6.C2602b;

/* renamed from: u6.x0 */
/* loaded from: classes.dex */
public final class C4979x0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m10422N = C2602b.m10422N(parcel);
        byte[] bArr = null;
        Double d10 = null;
        String str = null;
        ArrayList arrayList = null;
        Integer num = null;
        C4918e0 c4918e0 = null;
        String str2 = null;
        C4913d c4913d = null;
        Long l10 = null;
        while (parcel.dataPosition() < m10422N) {
            int m10412D = C2602b.m10412D(parcel);
            switch (C2602b.m10446v(m10412D)) {
                case 2:
                    bArr = C2602b.m10431g(parcel, m10412D);
                    break;
                case 3:
                    d10 = C2602b.m10409A(parcel, m10412D);
                    break;
                case 4:
                    str = C2602b.m10440p(parcel, m10412D);
                    break;
                case 5:
                    arrayList = C2602b.m10444t(parcel, m10412D, C4972v.CREATOR);
                    break;
                case 6:
                    num = C2602b.m10415G(parcel, m10412D);
                    break;
                case 7:
                    c4918e0 = (C4918e0) C2602b.m10439o(parcel, m10412D, C4918e0.CREATOR);
                    break;
                case 8:
                    str2 = C2602b.m10440p(parcel, m10412D);
                    break;
                case 9:
                    c4913d = (C4913d) C2602b.m10439o(parcel, m10412D, C4913d.CREATOR);
                    break;
                case 10:
                    l10 = C2602b.m10418J(parcel, m10412D);
                    break;
                default:
                    C2602b.m10421M(parcel, m10412D);
                    break;
            }
        }
        C2602b.m10445u(parcel, m10422N);
        return new C4978x(bArr, d10, str, arrayList, num, c4918e0, str2, c4913d, l10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C4978x[i10];
    }
}
