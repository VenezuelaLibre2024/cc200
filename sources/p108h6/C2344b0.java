package p108h6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p125i6.C2602b;

/* renamed from: h6.b0 */
/* loaded from: classes.dex */
public final class C2344b0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m10422N = C2602b.m10422N(parcel);
        int i10 = 0;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < m10422N) {
            int m10412D = C2602b.m10412D(parcel);
            int m10446v = C2602b.m10446v(m10412D);
            if (m10446v == 1) {
                i10 = C2602b.m10414F(parcel, m10412D);
            } else if (m10446v != 2) {
                C2602b.m10421M(parcel, m10412D);
            } else {
                arrayList = C2602b.m10444t(parcel, m10412D, C2385p.CREATOR);
            }
        }
        C2602b.m10445u(parcel, m10422N);
        return new C2406w(i10, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C2406w[i10];
    }
}
