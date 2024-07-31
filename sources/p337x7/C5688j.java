package p337x7;

import android.os.Parcel;
import android.os.Parcelable;
import p125i6.C2602b;

/* renamed from: x7.j */
/* loaded from: classes.dex */
public final class C5688j implements Parcelable.Creator<C5691k> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C5691k createFromParcel(Parcel parcel) {
        int m10422N = C2602b.m10422N(parcel);
        long j10 = 0;
        long j11 = 0;
        while (parcel.dataPosition() < m10422N) {
            int m10412D = C2602b.m10412D(parcel);
            int m10446v = C2602b.m10446v(m10412D);
            if (m10446v == 1) {
                j10 = C2602b.m10417I(parcel, m10412D);
            } else if (m10446v != 2) {
                C2602b.m10421M(parcel, m10412D);
            } else {
                j11 = C2602b.m10417I(parcel, m10412D);
            }
        }
        C2602b.m10445u(parcel, m10422N);
        return new C5691k(j10, j11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C5691k[] newArray(int i10) {
        return new C5691k[i10];
    }
}
