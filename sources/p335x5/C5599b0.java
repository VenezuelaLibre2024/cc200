package p335x5;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import p125i6.C2602b;
import p292u6.C4966t;

/* renamed from: x5.b0 */
/* loaded from: classes.dex */
public final class C5599b0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m10422N = C2602b.m10422N(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Uri uri = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        C4966t c4966t = null;
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
                    str3 = C2602b.m10440p(parcel, m10412D);
                    break;
                case 4:
                    str4 = C2602b.m10440p(parcel, m10412D);
                    break;
                case 5:
                    uri = (Uri) C2602b.m10439o(parcel, m10412D, Uri.CREATOR);
                    break;
                case 6:
                    str5 = C2602b.m10440p(parcel, m10412D);
                    break;
                case 7:
                    str6 = C2602b.m10440p(parcel, m10412D);
                    break;
                case 8:
                    str7 = C2602b.m10440p(parcel, m10412D);
                    break;
                case 9:
                    c4966t = (C4966t) C2602b.m10439o(parcel, m10412D, C4966t.CREATOR);
                    break;
                default:
                    C2602b.m10421M(parcel, m10412D);
                    break;
            }
        }
        C2602b.m10445u(parcel, m10422N);
        return new C5608i(str, str2, str3, str4, uri, str5, str6, str7, c4966t);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C5608i[i10];
    }
}
