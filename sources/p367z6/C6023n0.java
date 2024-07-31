package p367z6;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import p125i6.C2602b;

/* renamed from: z6.n0 */
/* loaded from: classes.dex */
public final class C6023n0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m10422N = C2602b.m10422N(parcel);
        IBinder iBinder = null;
        int i10 = 0;
        Float f10 = null;
        while (parcel.dataPosition() < m10422N) {
            int m10412D = C2602b.m10412D(parcel);
            int m10446v = C2602b.m10446v(m10412D);
            if (m10446v == 2) {
                i10 = C2602b.m10414F(parcel, m10412D);
            } else if (m10446v == 3) {
                iBinder = C2602b.m10413E(parcel, m10412D);
            } else if (m10446v != 4) {
                C2602b.m10421M(parcel, m10412D);
            } else {
                f10 = C2602b.m10411C(parcel, m10412D);
            }
        }
        C2602b.m10445u(parcel, m10422N);
        return new C6004e(i10, iBinder, f10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C6004e[i10];
    }
}
