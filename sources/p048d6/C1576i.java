package p048d6;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import p125i6.C2602b;

/* renamed from: d6.i */
/* loaded from: classes.dex */
public final class C1576i implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m10422N = C2602b.m10422N(parcel);
        Intent intent = null;
        while (parcel.dataPosition() < m10422N) {
            int m10412D = C2602b.m10412D(parcel);
            if (C2602b.m10446v(m10412D) != 1) {
                C2602b.m10421M(parcel, m10412D);
            } else {
                intent = (Intent) C2602b.m10439o(parcel, m10412D, Intent.CREATOR);
            }
        }
        C2602b.m10445u(parcel, m10422N);
        return new C1561a(intent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C1561a[i10];
    }
}
