package p337x7;

import android.os.Parcel;
import android.os.Parcelable;
import p125i6.C2602b;

/* renamed from: x7.e2 */
/* loaded from: classes.dex */
public final class C5672e2 implements Parcelable.Creator<C5676f2> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C5676f2 createFromParcel(Parcel parcel) {
        int m10422N = C2602b.m10422N(parcel);
        String str = null;
        boolean z10 = false;
        String str2 = null;
        while (parcel.dataPosition() < m10422N) {
            int m10412D = C2602b.m10412D(parcel);
            int m10446v = C2602b.m10446v(m10412D);
            if (m10446v == 1) {
                str = C2602b.m10440p(parcel, m10412D);
            } else if (m10446v == 2) {
                str2 = C2602b.m10440p(parcel, m10412D);
            } else if (m10446v != 3) {
                C2602b.m10421M(parcel, m10412D);
            } else {
                z10 = C2602b.m10447w(parcel, m10412D);
            }
        }
        C2602b.m10445u(parcel, m10422N);
        return new C5676f2(str, str2, z10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C5676f2[] newArray(int i10) {
        return new C5676f2[i10];
    }
}
