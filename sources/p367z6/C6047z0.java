package p367z6;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import p125i6.C2602b;

/* renamed from: z6.z0 */
/* loaded from: classes.dex */
public final class C6047z0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m10422N = C2602b.m10422N(parcel);
        IBinder iBinder = null;
        while (parcel.dataPosition() < m10422N) {
            int m10412D = C2602b.m10412D(parcel);
            if (C2602b.m10446v(m10412D) != 2) {
                C2602b.m10421M(parcel, m10412D);
            } else {
                iBinder = C2602b.m10413E(parcel, m10412D);
            }
        }
        C2602b.m10445u(parcel, m10422N);
        return new C6042x(iBinder);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C6042x[i10];
    }
}
