package p367z6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import p125i6.C2602b;

/* renamed from: z6.r0 */
/* loaded from: classes.dex */
public final class C6031r0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m10422N = C2602b.m10422N(parcel);
        double d10 = 0.0d;
        double d11 = 0.0d;
        while (parcel.dataPosition() < m10422N) {
            int m10412D = C2602b.m10412D(parcel);
            int m10446v = C2602b.m10446v(m10412D);
            if (m10446v == 2) {
                d10 = C2602b.m10450z(parcel, m10412D);
            } else if (m10446v != 3) {
                C2602b.m10421M(parcel, m10412D);
            } else {
                d11 = C2602b.m10450z(parcel, m10412D);
            }
        }
        C2602b.m10445u(parcel, m10422N);
        return new LatLng(d10, d11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new LatLng[i10];
    }
}
