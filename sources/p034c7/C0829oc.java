package p034c7;

import android.os.Parcel;
import android.os.Parcelable;
import p125i6.C2602b;

/* renamed from: c7.oc */
/* loaded from: classes.dex */
public final class C0829oc implements Parcelable.Creator<C0787lc> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C0787lc createFromParcel(Parcel parcel) {
        int m10422N = C2602b.m10422N(parcel);
        String str = null;
        Long l10 = null;
        Float f10 = null;
        String str2 = null;
        String str3 = null;
        Double d10 = null;
        int i10 = 0;
        long j10 = 0;
        while (parcel.dataPosition() < m10422N) {
            int m10412D = C2602b.m10412D(parcel);
            switch (C2602b.m10446v(m10412D)) {
                case 1:
                    i10 = C2602b.m10414F(parcel, m10412D);
                    break;
                case 2:
                    str = C2602b.m10440p(parcel, m10412D);
                    break;
                case 3:
                    j10 = C2602b.m10417I(parcel, m10412D);
                    break;
                case 4:
                    l10 = C2602b.m10418J(parcel, m10412D);
                    break;
                case 5:
                    f10 = C2602b.m10411C(parcel, m10412D);
                    break;
                case 6:
                    str2 = C2602b.m10440p(parcel, m10412D);
                    break;
                case 7:
                    str3 = C2602b.m10440p(parcel, m10412D);
                    break;
                case 8:
                    d10 = C2602b.m10409A(parcel, m10412D);
                    break;
                default:
                    C2602b.m10421M(parcel, m10412D);
                    break;
            }
        }
        C2602b.m10445u(parcel, m10422N);
        return new C0787lc(i10, str, j10, l10, f10, str2, str3, d10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C0787lc[] newArray(int i10) {
        return new C0787lc[i10];
    }
}
