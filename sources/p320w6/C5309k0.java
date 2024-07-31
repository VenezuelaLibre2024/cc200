package p320w6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p108h6.C2349d;
import p125i6.C2602b;

/* renamed from: w6.k0 */
/* loaded from: classes.dex */
public final class C5309k0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m10422N = C2602b.m10422N(parcel);
        ArrayList arrayList = null;
        String str = null;
        ArrayList arrayList2 = null;
        String str2 = null;
        while (parcel.dataPosition() < m10422N) {
            int m10412D = C2602b.m10412D(parcel);
            int m10446v = C2602b.m10446v(m10412D);
            if (m10446v == 1) {
                arrayList = C2602b.m10444t(parcel, m10412D, C5292c.CREATOR);
            } else if (m10446v == 2) {
                str = C2602b.m10440p(parcel, m10412D);
            } else if (m10446v == 3) {
                arrayList2 = C2602b.m10444t(parcel, m10412D, C2349d.CREATOR);
            } else if (m10446v != 4) {
                C2602b.m10421M(parcel, m10412D);
            } else {
                str2 = C2602b.m10440p(parcel, m10412D);
            }
        }
        C2602b.m10445u(parcel, m10422N);
        return new C5294d(arrayList, str, arrayList2, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C5294d[i10];
    }
}
