package p321w7;

import android.os.Parcel;
import android.os.Parcelable;
import p125i6.C2602b;

/* renamed from: w7.q1 */
/* loaded from: classes.dex */
public final class C5401q1 implements Parcelable.Creator<C5394o0> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C5394o0 createFromParcel(Parcel parcel) {
        int m10422N = C2602b.m10422N(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        boolean z10 = false;
        while (parcel.dataPosition() < m10422N) {
            int m10412D = C2602b.m10412D(parcel);
            int m10446v = C2602b.m10446v(m10412D);
            if (m10446v == 1) {
                str = C2602b.m10440p(parcel, m10412D);
            } else if (m10446v == 2) {
                str2 = C2602b.m10440p(parcel, m10412D);
            } else if (m10446v == 4) {
                str3 = C2602b.m10440p(parcel, m10412D);
            } else if (m10446v == 5) {
                z10 = C2602b.m10447w(parcel, m10412D);
            } else if (m10446v != 6) {
                C2602b.m10421M(parcel, m10412D);
            } else {
                str4 = C2602b.m10440p(parcel, m10412D);
            }
        }
        C2602b.m10445u(parcel, m10422N);
        return new C5394o0(str, str2, str3, z10, str4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C5394o0[] newArray(int i10) {
        return new C5394o0[i10];
    }
}
