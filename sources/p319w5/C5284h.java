package p319w5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashSet;
import p125i6.C2602b;

/* renamed from: w5.h */
/* loaded from: classes.dex */
public final class C5284h implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m10422N = C2602b.m10422N(parcel);
        HashSet hashSet = new HashSet();
        int i10 = 0;
        C5285i c5285i = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (parcel.dataPosition() < m10422N) {
            int m10412D = C2602b.m10412D(parcel);
            int m10446v = C2602b.m10446v(m10412D);
            int i11 = 1;
            if (m10446v != 1) {
                i11 = 2;
                if (m10446v != 2) {
                    i11 = 3;
                    if (m10446v != 3) {
                        i11 = 4;
                        if (m10446v != 4) {
                            i11 = 5;
                            if (m10446v != 5) {
                                C2602b.m10421M(parcel, m10412D);
                            } else {
                                str3 = C2602b.m10440p(parcel, m10412D);
                            }
                        } else {
                            str2 = C2602b.m10440p(parcel, m10412D);
                        }
                    } else {
                        str = C2602b.m10440p(parcel, m10412D);
                    }
                } else {
                    c5285i = (C5285i) C2602b.m10439o(parcel, m10412D, C5285i.CREATOR);
                }
            } else {
                i10 = C2602b.m10414F(parcel, m10412D);
            }
            hashSet.add(Integer.valueOf(i11));
        }
        if (parcel.dataPosition() == m10422N) {
            return new C5283g(hashSet, i10, c5285i, str, str2, str3);
        }
        throw new C2602b.a("Overread allowed size end=" + m10422N, parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C5283g[i10];
    }
}
