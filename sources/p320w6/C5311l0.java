package p320w6;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.internal.location.zzd;
import p125i6.C2602b;

/* renamed from: w6.l0 */
/* loaded from: classes.dex */
public final class C5311l0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m10422N = C2602b.m10422N(parcel);
        WorkSource workSource = new WorkSource();
        String str = null;
        zzd zzdVar = null;
        long j10 = Long.MAX_VALUE;
        long j11 = Long.MAX_VALUE;
        int i10 = 0;
        boolean z10 = false;
        int i11 = 0;
        int i12 = 102;
        while (parcel.dataPosition() < m10422N) {
            int m10412D = C2602b.m10412D(parcel);
            switch (C2602b.m10446v(m10412D)) {
                case 1:
                    j10 = C2602b.m10417I(parcel, m10412D);
                    break;
                case 2:
                    i10 = C2602b.m10414F(parcel, m10412D);
                    break;
                case 3:
                    i12 = C2602b.m10414F(parcel, m10412D);
                    break;
                case 4:
                    j11 = C2602b.m10417I(parcel, m10412D);
                    break;
                case 5:
                    z10 = C2602b.m10447w(parcel, m10412D);
                    break;
                case 6:
                    workSource = (WorkSource) C2602b.m10439o(parcel, m10412D, WorkSource.CREATOR);
                    break;
                case 7:
                    i11 = C2602b.m10414F(parcel, m10412D);
                    break;
                case 8:
                    str = C2602b.m10440p(parcel, m10412D);
                    break;
                case 9:
                    zzdVar = (zzd) C2602b.m10439o(parcel, m10412D, zzd.CREATOR);
                    break;
                default:
                    C2602b.m10421M(parcel, m10412D);
                    break;
            }
        }
        C2602b.m10445u(parcel, m10422N);
        return new C5296e(j10, i10, i12, j11, z10, i11, str, workSource, zzdVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C5296e[i10];
    }
}
