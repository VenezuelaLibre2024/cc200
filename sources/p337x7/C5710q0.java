package p337x7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p125i6.C2602b;
import p321w7.C5403r0;
import p321w7.C5421x0;

/* renamed from: x7.q0 */
/* loaded from: classes.dex */
public final class C5710q0 implements Parcelable.Creator<C5701n0> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C5701n0 createFromParcel(Parcel parcel) {
        int m10422N = C2602b.m10422N(parcel);
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        while (parcel.dataPosition() < m10422N) {
            int m10412D = C2602b.m10412D(parcel);
            int m10446v = C2602b.m10446v(m10412D);
            if (m10446v == 1) {
                arrayList = C2602b.m10444t(parcel, m10412D, C5403r0.CREATOR);
            } else if (m10446v != 2) {
                C2602b.m10421M(parcel, m10412D);
            } else {
                arrayList2 = C2602b.m10444t(parcel, m10412D, C5421x0.CREATOR);
            }
        }
        C2602b.m10445u(parcel, m10422N);
        return new C5701n0(arrayList, arrayList2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C5701n0[] newArray(int i10) {
        return new C5701n0[i10];
    }
}
