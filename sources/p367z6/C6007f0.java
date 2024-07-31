package p367z6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import p125i6.C2602b;

/* renamed from: z6.f0 */
/* loaded from: classes.dex */
public final class C6007f0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m10422N = C2602b.m10422N(parcel);
        float f10 = 0.0f;
        float f11 = 0.0f;
        LatLng latLng = null;
        float f12 = 0.0f;
        while (parcel.dataPosition() < m10422N) {
            int m10412D = C2602b.m10412D(parcel);
            int m10446v = C2602b.m10446v(m10412D);
            if (m10446v == 2) {
                latLng = (LatLng) C2602b.m10439o(parcel, m10412D, LatLng.CREATOR);
            } else if (m10446v == 3) {
                f10 = C2602b.m10410B(parcel, m10412D);
            } else if (m10446v == 4) {
                f12 = C2602b.m10410B(parcel, m10412D);
            } else if (m10446v != 5) {
                C2602b.m10421M(parcel, m10412D);
            } else {
                f11 = C2602b.m10410B(parcel, m10412D);
            }
        }
        C2602b.m10445u(parcel, m10422N);
        return new CameraPosition(latLng, f10, f12, f11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new CameraPosition[i10];
    }
}
