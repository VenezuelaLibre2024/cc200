package p034c7;

import android.os.Parcel;
import android.os.Parcelable;
import p125i6.C2602b;

/* renamed from: c7.e */
/* loaded from: classes.dex */
public final class C0676e implements Parcelable.Creator<C0690f> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C0690f createFromParcel(Parcel parcel) {
        int m10422N = C2602b.m10422N(parcel);
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        String str = null;
        String str2 = null;
        C0787lc c0787lc = null;
        String str3 = null;
        C0705g0 c0705g0 = null;
        C0705g0 c0705g02 = null;
        C0705g0 c0705g03 = null;
        boolean z10 = false;
        while (parcel.dataPosition() < m10422N) {
            int m10412D = C2602b.m10412D(parcel);
            switch (C2602b.m10446v(m10412D)) {
                case 2:
                    str = C2602b.m10440p(parcel, m10412D);
                    break;
                case 3:
                    str2 = C2602b.m10440p(parcel, m10412D);
                    break;
                case 4:
                    c0787lc = (C0787lc) C2602b.m10439o(parcel, m10412D, C0787lc.CREATOR);
                    break;
                case 5:
                    j10 = C2602b.m10417I(parcel, m10412D);
                    break;
                case 6:
                    z10 = C2602b.m10447w(parcel, m10412D);
                    break;
                case 7:
                    str3 = C2602b.m10440p(parcel, m10412D);
                    break;
                case 8:
                    c0705g0 = (C0705g0) C2602b.m10439o(parcel, m10412D, C0705g0.CREATOR);
                    break;
                case 9:
                    j11 = C2602b.m10417I(parcel, m10412D);
                    break;
                case 10:
                    c0705g02 = (C0705g0) C2602b.m10439o(parcel, m10412D, C0705g0.CREATOR);
                    break;
                case 11:
                    j12 = C2602b.m10417I(parcel, m10412D);
                    break;
                case 12:
                    c0705g03 = (C0705g0) C2602b.m10439o(parcel, m10412D, C0705g0.CREATOR);
                    break;
                default:
                    C2602b.m10421M(parcel, m10412D);
                    break;
            }
        }
        C2602b.m10445u(parcel, m10422N);
        return new C0690f(str, str2, c0787lc, j10, z10, str3, c0705g0, j11, c0705g02, j12, c0705g03);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C0690f[] newArray(int i10) {
        return new C0690f[i10];
    }
}
