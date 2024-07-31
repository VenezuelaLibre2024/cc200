package p182m6;

import android.os.Parcel;
import android.os.Parcelable;
import p125i6.C2602b;
import p182m6.AbstractC3537a;

/* renamed from: m6.e */
/* loaded from: classes.dex */
public final class C3541e implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m10422N = C2602b.m10422N(parcel);
        String str = null;
        int i10 = 0;
        AbstractC3537a.a aVar = null;
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
                aVar = (AbstractC3537a.a) C2602b.m10439o(parcel, m10412D, AbstractC3537a.a.CREATOR);
            }
        }
        C2602b.m10445u(parcel, m10422N);
        return new C3543g(i10, str, aVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C3543g[i10];
    }
}
