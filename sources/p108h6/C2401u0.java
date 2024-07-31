package p108h6;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import p064e6.C1667b;
import p125i6.C2602b;

/* renamed from: h6.u0 */
/* loaded from: classes.dex */
public final class C2401u0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m10422N = C2602b.m10422N(parcel);
        IBinder iBinder = null;
        C1667b c1667b = null;
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = false;
        while (parcel.dataPosition() < m10422N) {
            int m10412D = C2602b.m10412D(parcel);
            int m10446v = C2602b.m10446v(m10412D);
            if (m10446v == 1) {
                i10 = C2602b.m10414F(parcel, m10412D);
            } else if (m10446v == 2) {
                iBinder = C2602b.m10413E(parcel, m10412D);
            } else if (m10446v == 3) {
                c1667b = (C1667b) C2602b.m10439o(parcel, m10412D, C1667b.CREATOR);
            } else if (m10446v == 4) {
                z10 = C2602b.m10447w(parcel, m10412D);
            } else if (m10446v != 5) {
                C2602b.m10421M(parcel, m10412D);
            } else {
                z11 = C2602b.m10447w(parcel, m10412D);
            }
        }
        C2602b.m10445u(parcel, m10422N);
        return new C2398t0(i10, iBinder, c1667b, z10, z11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C2398t0[i10];
    }
}
