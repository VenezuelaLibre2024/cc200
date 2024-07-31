package p307v6;

import android.os.Parcel;
import android.os.Parcelable;
import p125i6.C2602b;

/* renamed from: v6.g */
/* loaded from: classes.dex */
public final class C5132g implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m10422N = C2602b.m10422N(parcel);
        String str = null;
        int i10 = 0;
        String str2 = null;
        while (parcel.dataPosition() < m10422N) {
            int m10412D = C2602b.m10412D(parcel);
            int m10446v = C2602b.m10446v(m10412D);
            if (m10446v == 2) {
                i10 = C2602b.m10414F(parcel, m10412D);
            } else if (m10446v == 3) {
                str = C2602b.m10440p(parcel, m10412D);
            } else if (m10446v != 4) {
                C2602b.m10421M(parcel, m10412D);
            } else {
                str2 = C2602b.m10440p(parcel, m10412D);
            }
        }
        C2602b.m10445u(parcel, m10422N);
        return new C5126a(i10, str, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C5126a[i10];
    }
}
