package p320w6;

import android.os.Parcel;
import android.os.Parcelable;
import p125i6.C2602b;

/* renamed from: w6.y */
/* loaded from: classes.dex */
public final class C5336y implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m10422N = C2602b.m10422N(parcel);
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        while (parcel.dataPosition() < m10422N) {
            int m10412D = C2602b.m10412D(parcel);
            switch (C2602b.m10446v(m10412D)) {
                case 1:
                    z10 = C2602b.m10447w(parcel, m10412D);
                    break;
                case 2:
                    z11 = C2602b.m10447w(parcel, m10412D);
                    break;
                case 3:
                    z12 = C2602b.m10447w(parcel, m10412D);
                    break;
                case 4:
                    z13 = C2602b.m10447w(parcel, m10412D);
                    break;
                case 5:
                    z14 = C2602b.m10447w(parcel, m10412D);
                    break;
                case 6:
                    z15 = C2602b.m10447w(parcel, m10412D);
                    break;
                default:
                    C2602b.m10421M(parcel, m10412D);
                    break;
            }
        }
        C2602b.m10445u(parcel, m10422N);
        return new C5324s(z10, z11, z12, z13, z14, z15);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C5324s[i10];
    }
}
