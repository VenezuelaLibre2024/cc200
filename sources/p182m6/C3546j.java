package p182m6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p125i6.C2602b;

/* renamed from: m6.j */
/* loaded from: classes.dex */
public final class C3546j implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m10422N = C2602b.m10422N(parcel);
        String str = null;
        int i10 = 0;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < m10422N) {
            int m10412D = C2602b.m10412D(parcel);
            int m10446v = C2602b.m10446v(m10412D);
            if (m10446v == 1) {
                i10 = C2602b.m10414F(parcel, m10412D);
            } else if (m10446v == 2) {
                str = C2602b.m10440p(parcel, m10412D);
            } else if (m10446v != 3) {
                C2602b.m10421M(parcel, m10412D);
            } else {
                arrayList = C2602b.m10444t(parcel, m10412D, C3543g.CREATOR);
            }
        }
        C2602b.m10445u(parcel, m10422N);
        return new C3542f(i10, str, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C3542f[i10];
    }
}
