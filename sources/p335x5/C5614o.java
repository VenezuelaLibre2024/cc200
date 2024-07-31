package p335x5;

import android.os.Parcel;
import android.os.Parcelable;
import p125i6.C2602b;
import p335x5.C5598b;

/* renamed from: x5.o */
/* loaded from: classes.dex */
public final class C5614o implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m10422N = C2602b.m10422N(parcel);
        boolean z10 = false;
        int i10 = 0;
        C5598b.e eVar = null;
        C5598b.b bVar = null;
        String str = null;
        C5598b.d dVar = null;
        C5598b.c cVar = null;
        while (parcel.dataPosition() < m10422N) {
            int m10412D = C2602b.m10412D(parcel);
            switch (C2602b.m10446v(m10412D)) {
                case 1:
                    eVar = (C5598b.e) C2602b.m10439o(parcel, m10412D, C5598b.e.CREATOR);
                    break;
                case 2:
                    bVar = (C5598b.b) C2602b.m10439o(parcel, m10412D, C5598b.b.CREATOR);
                    break;
                case 3:
                    str = C2602b.m10440p(parcel, m10412D);
                    break;
                case 4:
                    z10 = C2602b.m10447w(parcel, m10412D);
                    break;
                case 5:
                    i10 = C2602b.m10414F(parcel, m10412D);
                    break;
                case 6:
                    dVar = (C5598b.d) C2602b.m10439o(parcel, m10412D, C5598b.d.CREATOR);
                    break;
                case 7:
                    cVar = (C5598b.c) C2602b.m10439o(parcel, m10412D, C5598b.c.CREATOR);
                    break;
                default:
                    C2602b.m10421M(parcel, m10412D);
                    break;
            }
        }
        C2602b.m10445u(parcel, m10422N);
        return new C5598b(eVar, bVar, str, z10, i10, dVar, cVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C5598b[i10];
    }
}
