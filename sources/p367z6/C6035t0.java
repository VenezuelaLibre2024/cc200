package p367z6;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import p125i6.C2602b;

/* renamed from: z6.t0 */
/* loaded from: classes.dex */
public final class C6035t0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m10422N = C2602b.m10422N(parcel);
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        int i10 = 0;
        int i11 = 0;
        LatLng latLng = null;
        String str = null;
        String str2 = null;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        String str3 = null;
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        float f16 = 1.0f;
        float f17 = 0.5f;
        while (parcel.dataPosition() < m10422N) {
            int m10412D = C2602b.m10412D(parcel);
            switch (C2602b.m10446v(m10412D)) {
                case 2:
                    latLng = (LatLng) C2602b.m10439o(parcel, m10412D, LatLng.CREATOR);
                    break;
                case 3:
                    str = C2602b.m10440p(parcel, m10412D);
                    break;
                case 4:
                    str2 = C2602b.m10440p(parcel, m10412D);
                    break;
                case 5:
                    iBinder = C2602b.m10413E(parcel, m10412D);
                    break;
                case 6:
                    f10 = C2602b.m10410B(parcel, m10412D);
                    break;
                case 7:
                    f11 = C2602b.m10410B(parcel, m10412D);
                    break;
                case 8:
                    z10 = C2602b.m10447w(parcel, m10412D);
                    break;
                case 9:
                    z11 = C2602b.m10447w(parcel, m10412D);
                    break;
                case 10:
                    z12 = C2602b.m10447w(parcel, m10412D);
                    break;
                case 11:
                    f12 = C2602b.m10410B(parcel, m10412D);
                    break;
                case 12:
                    f17 = C2602b.m10410B(parcel, m10412D);
                    break;
                case 13:
                    f13 = C2602b.m10410B(parcel, m10412D);
                    break;
                case 14:
                    f16 = C2602b.m10410B(parcel, m10412D);
                    break;
                case 15:
                    f14 = C2602b.m10410B(parcel, m10412D);
                    break;
                case 16:
                default:
                    C2602b.m10421M(parcel, m10412D);
                    break;
                case 17:
                    i10 = C2602b.m10414F(parcel, m10412D);
                    break;
                case 18:
                    iBinder2 = C2602b.m10413E(parcel, m10412D);
                    break;
                case 19:
                    i11 = C2602b.m10414F(parcel, m10412D);
                    break;
                case 20:
                    str3 = C2602b.m10440p(parcel, m10412D);
                    break;
                case 21:
                    f15 = C2602b.m10410B(parcel, m10412D);
                    break;
            }
        }
        C2602b.m10445u(parcel, m10422N);
        return new C6022n(latLng, str, str2, iBinder, f10, f11, z10, z11, z12, f12, f17, f13, f16, f14, i10, iBinder2, i11, str3, f15);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C6022n[i10];
    }
}
