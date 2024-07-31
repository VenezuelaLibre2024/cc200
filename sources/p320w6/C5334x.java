package p320w6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import p125i6.C2602b;

/* renamed from: w6.x */
/* loaded from: classes.dex */
public final class C5334x implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m10422N = C2602b.m10422N(parcel);
        Status status = null;
        C5324s c5324s = null;
        while (parcel.dataPosition() < m10422N) {
            int m10412D = C2602b.m10412D(parcel);
            int m10446v = C2602b.m10446v(m10412D);
            if (m10446v == 1) {
                status = (Status) C2602b.m10439o(parcel, m10412D, Status.CREATOR);
            } else if (m10446v != 2) {
                C2602b.m10421M(parcel, m10412D);
            } else {
                c5324s = (C5324s) C2602b.m10439o(parcel, m10412D, C5324s.CREATOR);
            }
        }
        C2602b.m10445u(parcel, m10422N);
        return new C5322r(status, c5324s);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C5322r[i10];
    }
}
