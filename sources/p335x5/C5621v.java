package p335x5;

import android.os.Parcel;
import android.os.Parcelable;
import p125i6.C2602b;
import p335x5.C5598b;

/* renamed from: x5.v */
/* loaded from: classes.dex */
public final class C5621v implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m10422N = C2602b.m10422N(parcel);
        byte[] bArr = null;
        boolean z10 = false;
        String str = null;
        while (parcel.dataPosition() < m10422N) {
            int m10412D = C2602b.m10412D(parcel);
            int m10446v = C2602b.m10446v(m10412D);
            if (m10446v == 1) {
                z10 = C2602b.m10447w(parcel, m10412D);
            } else if (m10446v == 2) {
                bArr = C2602b.m10431g(parcel, m10412D);
            } else if (m10446v != 3) {
                C2602b.m10421M(parcel, m10412D);
            } else {
                str = C2602b.m10440p(parcel, m10412D);
            }
        }
        C2602b.m10445u(parcel, m10422N);
        return new C5598b.d(z10, bArr, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C5598b.d[i10];
    }
}
