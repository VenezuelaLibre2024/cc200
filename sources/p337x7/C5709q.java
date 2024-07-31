package p337x7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p125i6.C2602b;
import p321w7.C5403r0;
import p321w7.C5421x0;
import p321w7.C5428z1;

/* renamed from: x7.q */
/* loaded from: classes.dex */
public final class C5709q implements Parcelable.Creator<C5703o> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C5703o createFromParcel(Parcel parcel) {
        int m10422N = C2602b.m10422N(parcel);
        ArrayList arrayList = null;
        C5706p c5706p = null;
        String str = null;
        C5428z1 c5428z1 = null;
        C5685i c5685i = null;
        ArrayList arrayList2 = null;
        while (parcel.dataPosition() < m10422N) {
            int m10412D = C2602b.m10412D(parcel);
            switch (C2602b.m10446v(m10412D)) {
                case 1:
                    arrayList = C2602b.m10444t(parcel, m10412D, C5403r0.CREATOR);
                    break;
                case 2:
                    c5706p = (C5706p) C2602b.m10439o(parcel, m10412D, C5706p.CREATOR);
                    break;
                case 3:
                    str = C2602b.m10440p(parcel, m10412D);
                    break;
                case 4:
                    c5428z1 = (C5428z1) C2602b.m10439o(parcel, m10412D, C5428z1.CREATOR);
                    break;
                case 5:
                    c5685i = (C5685i) C2602b.m10439o(parcel, m10412D, C5685i.CREATOR);
                    break;
                case 6:
                    arrayList2 = C2602b.m10444t(parcel, m10412D, C5421x0.CREATOR);
                    break;
                default:
                    C2602b.m10421M(parcel, m10412D);
                    break;
            }
        }
        C2602b.m10445u(parcel, m10422N);
        return new C5703o(arrayList, c5706p, str, c5428z1, c5685i, arrayList2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C5703o[] newArray(int i10) {
        return new C5703o[i10];
    }
}
