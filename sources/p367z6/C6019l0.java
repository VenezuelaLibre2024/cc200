package p367z6;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import p125i6.C2602b;

/* renamed from: z6.l0 */
/* loaded from: classes.dex */
public final class C6019l0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m10422N = C2602b.m10422N(parcel);
        float f10 = 0.0f;
        float f11 = 0.0f;
        boolean z10 = true;
        boolean z11 = false;
        IBinder iBinder = null;
        while (parcel.dataPosition() < m10422N) {
            int m10412D = C2602b.m10412D(parcel);
            int m10446v = C2602b.m10446v(m10412D);
            if (m10446v == 2) {
                iBinder = C2602b.m10413E(parcel, m10412D);
            } else if (m10446v == 3) {
                z11 = C2602b.m10447w(parcel, m10412D);
            } else if (m10446v == 4) {
                f10 = C2602b.m10410B(parcel, m10412D);
            } else if (m10446v == 5) {
                z10 = C2602b.m10447w(parcel, m10412D);
            } else if (m10446v != 6) {
                C2602b.m10421M(parcel, m10412D);
            } else {
                f11 = C2602b.m10410B(parcel, m10412D);
            }
        }
        C2602b.m10445u(parcel, m10422N);
        return new C6001c0(iBinder, z11, f10, z10, f11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C6001c0[i10];
    }
}
