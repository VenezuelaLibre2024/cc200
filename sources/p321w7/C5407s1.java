package p321w7;

import android.os.Parcel;
import android.os.Parcelable;
import p125i6.C2602b;

/* renamed from: w7.s1 */
/* loaded from: classes.dex */
public final class C5407s1 implements Parcelable.Creator<C5403r0> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C5403r0 createFromParcel(Parcel parcel) {
        int m10422N = C2602b.m10422N(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        long j10 = 0;
        while (parcel.dataPosition() < m10422N) {
            int m10412D = C2602b.m10412D(parcel);
            int m10446v = C2602b.m10446v(m10412D);
            if (m10446v == 1) {
                str = C2602b.m10440p(parcel, m10412D);
            } else if (m10446v == 2) {
                str2 = C2602b.m10440p(parcel, m10412D);
            } else if (m10446v == 3) {
                j10 = C2602b.m10417I(parcel, m10412D);
            } else if (m10446v != 4) {
                C2602b.m10421M(parcel, m10412D);
            } else {
                str3 = C2602b.m10440p(parcel, m10412D);
            }
        }
        C2602b.m10445u(parcel, m10422N);
        return new C5403r0(str, str2, j10, str3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C5403r0[] newArray(int i10) {
        return new C5403r0[i10];
    }
}