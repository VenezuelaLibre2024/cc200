package p367z6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import p125i6.C2602b;

/* renamed from: z6.x0 */
/* loaded from: classes.dex */
public final class C6043x0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m10422N = C2602b.m10422N(parcel);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = null;
        float f10 = 0.0f;
        ArrayList arrayList3 = null;
        int i10 = 0;
        int i11 = 0;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        int i12 = 0;
        float f11 = 0.0f;
        while (parcel.dataPosition() < m10422N) {
            int m10412D = C2602b.m10412D(parcel);
            switch (C2602b.m10446v(m10412D)) {
                case 2:
                    arrayList2 = C2602b.m10444t(parcel, m10412D, LatLng.CREATOR);
                    break;
                case 3:
                    C2602b.m10416H(parcel, m10412D, arrayList, C6043x0.class.getClassLoader());
                    break;
                case 4:
                    f11 = C2602b.m10410B(parcel, m10412D);
                    break;
                case 5:
                    i10 = C2602b.m10414F(parcel, m10412D);
                    break;
                case 6:
                    i11 = C2602b.m10414F(parcel, m10412D);
                    break;
                case 7:
                    f10 = C2602b.m10410B(parcel, m10412D);
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
                    i12 = C2602b.m10414F(parcel, m10412D);
                    break;
                case 12:
                    arrayList3 = C2602b.m10444t(parcel, m10412D, C6024o.CREATOR);
                    break;
                default:
                    C2602b.m10421M(parcel, m10412D);
                    break;
            }
        }
        C2602b.m10445u(parcel, m10422N);
        return new C6030r(arrayList2, arrayList, f11, i10, i11, f10, z10, z11, z12, i12, arrayList3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C6030r[i10];
    }
}
