package p320w6;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.internal.location.zzd;
import com.google.android.gms.location.LocationRequest;
import p125i6.C2602b;

/* renamed from: w6.x0 */
/* loaded from: classes.dex */
public final class C5335x0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m10422N = C2602b.m10422N(parcel);
        WorkSource workSource = new WorkSource();
        String str = null;
        zzd zzdVar = null;
        long j10 = Long.MAX_VALUE;
        long j11 = Long.MAX_VALUE;
        boolean z10 = false;
        int i10 = 0;
        int i11 = 0;
        boolean z11 = false;
        int i12 = 102;
        long j12 = 3600000;
        long j13 = 600000;
        long j14 = 0;
        int i13 = Integer.MAX_VALUE;
        float f10 = 0.0f;
        long j15 = -1;
        while (parcel.dataPosition() < m10422N) {
            int m10412D = C2602b.m10412D(parcel);
            switch (C2602b.m10446v(m10412D)) {
                case 1:
                    i12 = C2602b.m10414F(parcel, m10412D);
                    break;
                case 2:
                    j12 = C2602b.m10417I(parcel, m10412D);
                    break;
                case 3:
                    j13 = C2602b.m10417I(parcel, m10412D);
                    break;
                case 4:
                default:
                    C2602b.m10421M(parcel, m10412D);
                    break;
                case 5:
                    j10 = C2602b.m10417I(parcel, m10412D);
                    break;
                case 6:
                    i13 = C2602b.m10414F(parcel, m10412D);
                    break;
                case 7:
                    f10 = C2602b.m10410B(parcel, m10412D);
                    break;
                case 8:
                    j14 = C2602b.m10417I(parcel, m10412D);
                    break;
                case 9:
                    z10 = C2602b.m10447w(parcel, m10412D);
                    break;
                case 10:
                    j11 = C2602b.m10417I(parcel, m10412D);
                    break;
                case 11:
                    j15 = C2602b.m10417I(parcel, m10412D);
                    break;
                case 12:
                    i10 = C2602b.m10414F(parcel, m10412D);
                    break;
                case 13:
                    i11 = C2602b.m10414F(parcel, m10412D);
                    break;
                case 14:
                    str = C2602b.m10440p(parcel, m10412D);
                    break;
                case 15:
                    z11 = C2602b.m10447w(parcel, m10412D);
                    break;
                case 16:
                    workSource = (WorkSource) C2602b.m10439o(parcel, m10412D, WorkSource.CREATOR);
                    break;
                case 17:
                    zzdVar = (zzd) C2602b.m10439o(parcel, m10412D, zzd.CREATOR);
                    break;
            }
        }
        C2602b.m10445u(parcel, m10422N);
        return new LocationRequest(i12, j12, j13, j14, j10, j11, i13, f10, z10, j15, i10, i11, str, z11, workSource, zzdVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new LocationRequest[i10];
    }
}
