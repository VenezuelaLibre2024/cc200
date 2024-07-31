package p320w6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.location.zzd;
import p125i6.C2602b;

/* renamed from: w6.v0 */
/* loaded from: classes.dex */
public final class C5331v0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m10422N = C2602b.m10422N(parcel);
        String str = null;
        zzd zzdVar = null;
        int i10 = 0;
        boolean z10 = false;
        long j10 = Long.MAX_VALUE;
        while (parcel.dataPosition() < m10422N) {
            int m10412D = C2602b.m10412D(parcel);
            int m10446v = C2602b.m10446v(m10412D);
            if (m10446v == 1) {
                j10 = C2602b.m10417I(parcel, m10412D);
            } else if (m10446v == 2) {
                i10 = C2602b.m10414F(parcel, m10412D);
            } else if (m10446v == 3) {
                z10 = C2602b.m10447w(parcel, m10412D);
            } else if (m10446v == 4) {
                str = C2602b.m10440p(parcel, m10412D);
            } else if (m10446v != 5) {
                C2602b.m10421M(parcel, m10412D);
            } else {
                zzdVar = (zzd) C2602b.m10439o(parcel, m10412D, zzd.CREATOR);
            }
        }
        C2602b.m10445u(parcel, m10422N);
        return new C5310l(j10, i10, z10, str, zzdVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C5310l[i10];
    }
}
