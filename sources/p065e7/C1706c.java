package p065e7;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import p125i6.C2602b;

/* renamed from: e7.c */
/* loaded from: classes.dex */
public final class C1706c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m10422N = C2602b.m10422N(parcel);
        int i10 = 0;
        Intent intent = null;
        int i11 = 0;
        while (parcel.dataPosition() < m10422N) {
            int m10412D = C2602b.m10412D(parcel);
            int m10446v = C2602b.m10446v(m10412D);
            if (m10446v == 1) {
                i10 = C2602b.m10414F(parcel, m10412D);
            } else if (m10446v == 2) {
                i11 = C2602b.m10414F(parcel, m10412D);
            } else if (m10446v != 3) {
                C2602b.m10421M(parcel, m10412D);
            } else {
                intent = (Intent) C2602b.m10439o(parcel, m10412D, Intent.CREATOR);
            }
        }
        C2602b.m10445u(parcel, m10422N);
        return new C1705b(i10, i11, intent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C1705b[i10];
    }
}