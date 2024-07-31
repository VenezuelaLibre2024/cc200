package p336x6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLngBounds;
import p125i6.C2602b;

/* renamed from: x6.l */
/* loaded from: classes.dex */
public final class C5638l implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m10422N = C2602b.m10422N(parcel);
        CameraPosition cameraPosition = null;
        Float f10 = null;
        Float f11 = null;
        LatLngBounds latLngBounds = null;
        Integer num = null;
        String str = null;
        byte b10 = -1;
        byte b11 = -1;
        byte b12 = -1;
        byte b13 = -1;
        byte b14 = -1;
        byte b15 = -1;
        byte b16 = -1;
        byte b17 = -1;
        byte b18 = -1;
        byte b19 = -1;
        byte b20 = -1;
        byte b21 = -1;
        int i10 = 0;
        while (parcel.dataPosition() < m10422N) {
            int m10412D = C2602b.m10412D(parcel);
            switch (C2602b.m10446v(m10412D)) {
                case 2:
                    b10 = C2602b.m10449y(parcel, m10412D);
                    break;
                case 3:
                    b11 = C2602b.m10449y(parcel, m10412D);
                    break;
                case 4:
                    i10 = C2602b.m10414F(parcel, m10412D);
                    break;
                case 5:
                    cameraPosition = (CameraPosition) C2602b.m10439o(parcel, m10412D, CameraPosition.CREATOR);
                    break;
                case 6:
                    b12 = C2602b.m10449y(parcel, m10412D);
                    break;
                case 7:
                    b13 = C2602b.m10449y(parcel, m10412D);
                    break;
                case 8:
                    b14 = C2602b.m10449y(parcel, m10412D);
                    break;
                case 9:
                    b15 = C2602b.m10449y(parcel, m10412D);
                    break;
                case 10:
                    b16 = C2602b.m10449y(parcel, m10412D);
                    break;
                case 11:
                    b17 = C2602b.m10449y(parcel, m10412D);
                    break;
                case 12:
                    b18 = C2602b.m10449y(parcel, m10412D);
                    break;
                case 13:
                default:
                    C2602b.m10421M(parcel, m10412D);
                    break;
                case 14:
                    b19 = C2602b.m10449y(parcel, m10412D);
                    break;
                case 15:
                    b20 = C2602b.m10449y(parcel, m10412D);
                    break;
                case 16:
                    f10 = C2602b.m10411C(parcel, m10412D);
                    break;
                case 17:
                    f11 = C2602b.m10411C(parcel, m10412D);
                    break;
                case 18:
                    latLngBounds = (LatLngBounds) C2602b.m10439o(parcel, m10412D, LatLngBounds.CREATOR);
                    break;
                case 19:
                    b21 = C2602b.m10449y(parcel, m10412D);
                    break;
                case 20:
                    num = C2602b.m10415G(parcel, m10412D);
                    break;
                case 21:
                    str = C2602b.m10440p(parcel, m10412D);
                    break;
            }
        }
        C2602b.m10445u(parcel, m10422N);
        return new GoogleMapOptions(b10, b11, i10, cameraPosition, b12, b13, b14, b15, b16, b17, b18, b19, b20, f10, f11, latLngBounds, b21, num, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new GoogleMapOptions[i10];
    }
}
