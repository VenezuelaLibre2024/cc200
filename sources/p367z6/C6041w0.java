package p367z6;

import android.os.Parcel;
import android.os.Parcelable;
import p125i6.C2602b;
import p367z6.C6026p;

/* renamed from: z6.w0 */
/* loaded from: classes.dex */
public final class C6041w0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m10422N = C2602b.m10422N(parcel);
        int i10 = 0;
        C6026p.a aVar = null;
        int i11 = 0;
        while (parcel.dataPosition() < m10422N) {
            int m10412D = C2602b.m10412D(parcel);
            int m10446v = C2602b.m10446v(m10412D);
            if (m10446v == 2) {
                i10 = C2602b.m10414F(parcel, m10412D);
            } else if (m10446v == 3) {
                i11 = C2602b.m10414F(parcel, m10412D);
            } else if (m10446v != 4) {
                C2602b.m10421M(parcel, m10412D);
            } else {
                aVar = (C6026p.a) C2602b.m10439o(parcel, m10412D, C6026p.a.CREATOR);
            }
        }
        C2602b.m10445u(parcel, m10422N);
        return new C6026p(i10, i11, aVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C6026p[i10];
    }
}
