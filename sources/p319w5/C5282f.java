package p319w5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p125i6.C2602b;

/* renamed from: w5.f */
/* loaded from: classes.dex */
public final class C5282f implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m10422N = C2602b.m10422N(parcel);
        ArrayList<String> arrayList = null;
        ArrayList<String> arrayList2 = null;
        ArrayList<String> arrayList3 = null;
        ArrayList<String> arrayList4 = null;
        ArrayList<String> arrayList5 = null;
        int i10 = 0;
        while (parcel.dataPosition() < m10422N) {
            int m10412D = C2602b.m10412D(parcel);
            switch (C2602b.m10446v(m10412D)) {
                case 1:
                    i10 = C2602b.m10414F(parcel, m10412D);
                    break;
                case 2:
                    arrayList = C2602b.m10442r(parcel, m10412D);
                    break;
                case 3:
                    arrayList2 = C2602b.m10442r(parcel, m10412D);
                    break;
                case 4:
                    arrayList3 = C2602b.m10442r(parcel, m10412D);
                    break;
                case 5:
                    arrayList4 = C2602b.m10442r(parcel, m10412D);
                    break;
                case 6:
                    arrayList5 = C2602b.m10442r(parcel, m10412D);
                    break;
                default:
                    C2602b.m10421M(parcel, m10412D);
                    break;
            }
        }
        C2602b.m10445u(parcel, m10422N);
        return new C5281e(i10, arrayList, arrayList2, arrayList3, arrayList4, arrayList5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C5281e[i10];
    }
}
