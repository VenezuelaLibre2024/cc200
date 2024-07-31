package p064e6;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import p125i6.C2602b;

/* renamed from: e6.h0 */
/* loaded from: classes.dex */
public final class C1680h0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m10422N = C2602b.m10422N(parcel);
        String str = null;
        boolean z10 = false;
        boolean z11 = false;
        IBinder iBinder = null;
        while (parcel.dataPosition() < m10422N) {
            int m10412D = C2602b.m10412D(parcel);
            int m10446v = C2602b.m10446v(m10412D);
            if (m10446v == 1) {
                str = C2602b.m10440p(parcel, m10412D);
            } else if (m10446v == 2) {
                iBinder = C2602b.m10413E(parcel, m10412D);
            } else if (m10446v == 3) {
                z10 = C2602b.m10447w(parcel, m10412D);
            } else if (m10446v != 4) {
                C2602b.m10421M(parcel, m10412D);
            } else {
                z11 = C2602b.m10447w(parcel, m10412D);
            }
        }
        C2602b.m10445u(parcel, m10422N);
        return new C1678g0(str, iBinder, z10, z11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C1678g0[i10];
    }
}
