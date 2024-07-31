package p367z6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import p125i6.C2602b;

/* renamed from: z6.q0 */
/* loaded from: classes.dex */
public final class C6029q0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m10422N = C2602b.m10422N(parcel);
        LatLng latLng = null;
        LatLng latLng2 = null;
        while (parcel.dataPosition() < m10422N) {
            int m10412D = C2602b.m10412D(parcel);
            int m10446v = C2602b.m10446v(m10412D);
            if (m10446v == 2) {
                latLng = (LatLng) C2602b.m10439o(parcel, m10412D, LatLng.CREATOR);
            } else if (m10446v != 3) {
                C2602b.m10421M(parcel, m10412D);
            } else {
                latLng2 = (LatLng) C2602b.m10439o(parcel, m10412D, LatLng.CREATOR);
            }
        }
        C2602b.m10445u(parcel, m10422N);
        return new LatLngBounds(latLng, latLng2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new LatLngBounds[i10];
    }
}
