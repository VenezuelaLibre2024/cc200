package p335x5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p125i6.C2602b;
import p335x5.C5598b;

/* renamed from: x5.t */
/* loaded from: classes.dex */
public final class C5619t implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m10422N = C2602b.m10422N(parcel);
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        ArrayList<String> arrayList = null;
        while (parcel.dataPosition() < m10422N) {
            int m10412D = C2602b.m10412D(parcel);
            switch (C2602b.m10446v(m10412D)) {
                case 1:
                    z10 = C2602b.m10447w(parcel, m10412D);
                    break;
                case 2:
                    str = C2602b.m10440p(parcel, m10412D);
                    break;
                case 3:
                    str2 = C2602b.m10440p(parcel, m10412D);
                    break;
                case 4:
                    z11 = C2602b.m10447w(parcel, m10412D);
                    break;
                case 5:
                    str3 = C2602b.m10440p(parcel, m10412D);
                    break;
                case 6:
                    arrayList = C2602b.m10442r(parcel, m10412D);
                    break;
                case 7:
                    z12 = C2602b.m10447w(parcel, m10412D);
                    break;
                default:
                    C2602b.m10421M(parcel, m10412D);
                    break;
            }
        }
        C2602b.m10445u(parcel, m10422N);
        return new C5598b.b(z10, str, str2, z11, str3, arrayList, z12);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C5598b.b[i10];
    }
}
