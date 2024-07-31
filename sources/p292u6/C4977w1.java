package p292u6;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import p125i6.C2602b;

/* renamed from: u6.w1 */
/* loaded from: classes.dex */
public final class C4977w1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m10422N = C2602b.m10422N(parcel);
        C4969u c4969u = null;
        Uri uri = null;
        byte[] bArr = null;
        while (parcel.dataPosition() < m10422N) {
            int m10412D = C2602b.m10412D(parcel);
            int m10446v = C2602b.m10446v(m10412D);
            if (m10446v == 2) {
                c4969u = (C4969u) C2602b.m10439o(parcel, m10412D, C4969u.CREATOR);
            } else if (m10446v == 3) {
                uri = (Uri) C2602b.m10439o(parcel, m10412D, Uri.CREATOR);
            } else if (m10446v != 4) {
                C2602b.m10421M(parcel, m10412D);
            } else {
                bArr = C2602b.m10431g(parcel, m10412D);
            }
        }
        C2602b.m10445u(parcel, m10422N);
        return new C4942l(c4969u, uri, bArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C4942l[i10];
    }
}
