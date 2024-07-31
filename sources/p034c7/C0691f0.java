package p034c7;

import android.os.Parcel;
import android.os.Parcelable;
import p125i6.C2602b;

/* renamed from: c7.f0 */
/* loaded from: classes.dex */
public final class C0691f0 implements Parcelable.Creator<C0705g0> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C0705g0 createFromParcel(Parcel parcel) {
        int m10422N = C2602b.m10422N(parcel);
        String str = null;
        C0618a0 c0618a0 = null;
        String str2 = null;
        long j10 = 0;
        while (parcel.dataPosition() < m10422N) {
            int m10412D = C2602b.m10412D(parcel);
            int m10446v = C2602b.m10446v(m10412D);
            if (m10446v == 2) {
                str = C2602b.m10440p(parcel, m10412D);
            } else if (m10446v == 3) {
                c0618a0 = (C0618a0) C2602b.m10439o(parcel, m10412D, C0618a0.CREATOR);
            } else if (m10446v == 4) {
                str2 = C2602b.m10440p(parcel, m10412D);
            } else if (m10446v != 5) {
                C2602b.m10421M(parcel, m10412D);
            } else {
                j10 = C2602b.m10417I(parcel, m10412D);
            }
        }
        C2602b.m10445u(parcel, m10422N);
        return new C0705g0(str, c0618a0, str2, j10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C0705g0[] newArray(int i10) {
        return new C0705g0[i10];
    }
}
