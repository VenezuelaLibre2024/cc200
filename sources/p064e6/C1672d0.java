package p064e6;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import p125i6.C2602b;

/* renamed from: e6.d0 */
/* loaded from: classes.dex */
public final class C1672d0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m10422N = C2602b.m10422N(parcel);
        String str = null;
        IBinder iBinder = null;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        while (parcel.dataPosition() < m10422N) {
            int m10412D = C2602b.m10412D(parcel);
            switch (C2602b.m10446v(m10412D)) {
                case 1:
                    str = C2602b.m10440p(parcel, m10412D);
                    break;
                case 2:
                    z10 = C2602b.m10447w(parcel, m10412D);
                    break;
                case 3:
                    z11 = C2602b.m10447w(parcel, m10412D);
                    break;
                case 4:
                    iBinder = C2602b.m10413E(parcel, m10412D);
                    break;
                case 5:
                    z12 = C2602b.m10447w(parcel, m10412D);
                    break;
                case 6:
                    z13 = C2602b.m10447w(parcel, m10412D);
                    break;
                default:
                    C2602b.m10421M(parcel, m10412D);
                    break;
            }
        }
        C2602b.m10445u(parcel, m10422N);
        return new C1670c0(str, z10, z11, iBinder, z12, z13);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C1670c0[i10];
    }
}
