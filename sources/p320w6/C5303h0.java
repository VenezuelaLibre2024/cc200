package p320w6;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import p125i6.C2602b;

/* renamed from: w6.h0 */
/* loaded from: classes.dex */
public final class C5303h0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m10422N = C2602b.m10422N(parcel);
        boolean z10 = false;
        boolean z11 = false;
        long j10 = 0;
        long j11 = 0;
        WorkSource workSource = null;
        String str = null;
        int[] iArr = null;
        String str2 = null;
        String str3 = null;
        while (parcel.dataPosition() < m10422N) {
            int m10412D = C2602b.m10412D(parcel);
            switch (C2602b.m10446v(m10412D)) {
                case 1:
                    j10 = C2602b.m10417I(parcel, m10412D);
                    break;
                case 2:
                    z10 = C2602b.m10447w(parcel, m10412D);
                    break;
                case 3:
                    workSource = (WorkSource) C2602b.m10439o(parcel, m10412D, WorkSource.CREATOR);
                    break;
                case 4:
                    str = C2602b.m10440p(parcel, m10412D);
                    break;
                case 5:
                    iArr = C2602b.m10435k(parcel, m10412D);
                    break;
                case 6:
                    z11 = C2602b.m10447w(parcel, m10412D);
                    break;
                case 7:
                    str2 = C2602b.m10440p(parcel, m10412D);
                    break;
                case 8:
                    j11 = C2602b.m10417I(parcel, m10412D);
                    break;
                case 9:
                    str3 = C2602b.m10440p(parcel, m10412D);
                    break;
                default:
                    C2602b.m10421M(parcel, m10412D);
                    break;
            }
        }
        C2602b.m10445u(parcel, m10422N);
        return new C5301g0(j10, z10, workSource, str, iArr, z11, str2, j11, str3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C5301g0[i10];
    }
}
