package p320w6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationAvailability;
import p125i6.C2602b;

/* renamed from: w6.w0 */
/* loaded from: classes.dex */
public final class C5333w0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m10422N = C2602b.m10422N(parcel);
        int i10 = 1;
        int i11 = 1;
        int i12 = 1000;
        long j10 = 0;
        C5338z[] c5338zArr = null;
        boolean z10 = false;
        while (parcel.dataPosition() < m10422N) {
            int m10412D = C2602b.m10412D(parcel);
            switch (C2602b.m10446v(m10412D)) {
                case 1:
                    i10 = C2602b.m10414F(parcel, m10412D);
                    break;
                case 2:
                    i11 = C2602b.m10414F(parcel, m10412D);
                    break;
                case 3:
                    j10 = C2602b.m10417I(parcel, m10412D);
                    break;
                case 4:
                    i12 = C2602b.m10414F(parcel, m10412D);
                    break;
                case 5:
                    c5338zArr = (C5338z[]) C2602b.m10443s(parcel, m10412D, C5338z.CREATOR);
                    break;
                case 6:
                    z10 = C2602b.m10447w(parcel, m10412D);
                    break;
                default:
                    C2602b.m10421M(parcel, m10412D);
                    break;
            }
        }
        C2602b.m10445u(parcel, m10422N);
        return new LocationAvailability(i12, i10, i11, j10, c5338zArr, z10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new LocationAvailability[i10];
    }
}
