package p367z6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import p125i6.C2602b;

/* renamed from: z6.y0 */
/* loaded from: classes.dex */
public final class C6045y0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m10422N = C2602b.m10422N(parcel);
        float f10 = 0.0f;
        float f11 = 0.0f;
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        int i11 = 0;
        ArrayList arrayList = null;
        C6004e c6004e = null;
        C6004e c6004e2 = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        while (parcel.dataPosition() < m10422N) {
            int m10412D = C2602b.m10412D(parcel);
            switch (C2602b.m10446v(m10412D)) {
                case 2:
                    arrayList = C2602b.m10444t(parcel, m10412D, LatLng.CREATOR);
                    break;
                case 3:
                    f10 = C2602b.m10410B(parcel, m10412D);
                    break;
                case 4:
                    i10 = C2602b.m10414F(parcel, m10412D);
                    break;
                case 5:
                    f11 = C2602b.m10410B(parcel, m10412D);
                    break;
                case 6:
                    z10 = C2602b.m10447w(parcel, m10412D);
                    break;
                case 7:
                    z11 = C2602b.m10447w(parcel, m10412D);
                    break;
                case 8:
                    z12 = C2602b.m10447w(parcel, m10412D);
                    break;
                case 9:
                    c6004e = (C6004e) C2602b.m10439o(parcel, m10412D, C6004e.CREATOR);
                    break;
                case 10:
                    c6004e2 = (C6004e) C2602b.m10439o(parcel, m10412D, C6004e.CREATOR);
                    break;
                case 11:
                    i11 = C2602b.m10414F(parcel, m10412D);
                    break;
                case 12:
                    arrayList2 = C2602b.m10444t(parcel, m10412D, C6024o.CREATOR);
                    break;
                case 13:
                    arrayList3 = C2602b.m10444t(parcel, m10412D, C6046z.CREATOR);
                    break;
                default:
                    C2602b.m10421M(parcel, m10412D);
                    break;
            }
        }
        C2602b.m10445u(parcel, m10422N);
        return new C6034t(arrayList, f10, i10, f11, z10, z11, z12, c6004e, c6004e2, i11, arrayList2, arrayList3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C6034t[i10];
    }
}
