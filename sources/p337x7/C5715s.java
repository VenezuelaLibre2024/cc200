package p337x7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p125i6.C2602b;
import p321w7.C5403r0;
import p321w7.C5421x0;

/* renamed from: x7.s */
/* loaded from: classes.dex */
public final class C5715s implements Parcelable.Creator<C5706p> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C5706p createFromParcel(Parcel parcel) {
        int m10422N = C2602b.m10422N(parcel);
        String str = null;
        String str2 = null;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        C5685i c5685i = null;
        while (parcel.dataPosition() < m10422N) {
            int m10412D = C2602b.m10412D(parcel);
            int m10446v = C2602b.m10446v(m10412D);
            if (m10446v == 1) {
                str = C2602b.m10440p(parcel, m10412D);
            } else if (m10446v == 2) {
                str2 = C2602b.m10440p(parcel, m10412D);
            } else if (m10446v == 3) {
                arrayList = C2602b.m10444t(parcel, m10412D, C5403r0.CREATOR);
            } else if (m10446v == 4) {
                arrayList2 = C2602b.m10444t(parcel, m10412D, C5421x0.CREATOR);
            } else if (m10446v != 5) {
                C2602b.m10421M(parcel, m10412D);
            } else {
                c5685i = (C5685i) C2602b.m10439o(parcel, m10412D, C5685i.CREATOR);
            }
        }
        C2602b.m10445u(parcel, m10422N);
        return new C5706p(str, str2, arrayList, arrayList2, c5685i);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C5706p[] newArray(int i10) {
        return new C5706p[i10];
    }
}
