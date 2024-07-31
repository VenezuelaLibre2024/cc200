package p319w5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashSet;
import p125i6.C2602b;

/* renamed from: w5.c */
/* loaded from: classes.dex */
public final class C5279c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m10422N = C2602b.m10422N(parcel);
        HashSet hashSet = new HashSet();
        int i10 = 0;
        ArrayList arrayList = null;
        C5281e c5281e = null;
        int i11 = 0;
        while (parcel.dataPosition() < m10422N) {
            int m10412D = C2602b.m10412D(parcel);
            int m10446v = C2602b.m10446v(m10412D);
            int i12 = 1;
            if (m10446v != 1) {
                i12 = 2;
                if (m10446v != 2) {
                    i12 = 3;
                    if (m10446v != 3) {
                        i12 = 4;
                        if (m10446v != 4) {
                            C2602b.m10421M(parcel, m10412D);
                        } else {
                            c5281e = (C5281e) C2602b.m10439o(parcel, m10412D, C5281e.CREATOR);
                        }
                    } else {
                        i10 = C2602b.m10414F(parcel, m10412D);
                    }
                } else {
                    arrayList = C2602b.m10444t(parcel, m10412D, C5283g.CREATOR);
                }
            } else {
                i11 = C2602b.m10414F(parcel, m10412D);
            }
            hashSet.add(Integer.valueOf(i12));
        }
        if (parcel.dataPosition() == m10422N) {
            return new C5278b(hashSet, i11, arrayList, i10, c5281e);
        }
        throw new C2602b.a("Overread allowed size end=" + m10422N, parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C5278b[i10];
    }
}
