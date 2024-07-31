package p337x7;

import android.os.Parcel;
import android.os.Parcelable;
import p125i6.C2602b;

/* renamed from: x7.d */
/* loaded from: classes.dex */
public final class C5665d implements Parcelable.Creator<C5669e> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C5669e createFromParcel(Parcel parcel) {
        int m10422N = C2602b.m10422N(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        boolean z10 = false;
        while (parcel.dataPosition() < m10422N) {
            int m10412D = C2602b.m10412D(parcel);
            switch (C2602b.m10446v(m10412D)) {
                case 1:
                    str = C2602b.m10440p(parcel, m10412D);
                    break;
                case 2:
                    str2 = C2602b.m10440p(parcel, m10412D);
                    break;
                case 3:
                    str5 = C2602b.m10440p(parcel, m10412D);
                    break;
                case 4:
                    str4 = C2602b.m10440p(parcel, m10412D);
                    break;
                case 5:
                    str3 = C2602b.m10440p(parcel, m10412D);
                    break;
                case 6:
                    str6 = C2602b.m10440p(parcel, m10412D);
                    break;
                case 7:
                    z10 = C2602b.m10447w(parcel, m10412D);
                    break;
                case 8:
                    str7 = C2602b.m10440p(parcel, m10412D);
                    break;
                default:
                    C2602b.m10421M(parcel, m10412D);
                    break;
            }
        }
        C2602b.m10445u(parcel, m10422N);
        return new C5669e(str, str2, str3, str4, str5, str6, z10, str7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C5669e[] newArray(int i10) {
        return new C5669e[i10];
    }
}
