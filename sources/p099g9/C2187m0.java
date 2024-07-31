package p099g9;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.messaging.C1287d;
import p125i6.C2602b;
import p125i6.C2603c;

/* renamed from: g9.m0 */
/* loaded from: classes.dex */
public class C2187m0 implements Parcelable.Creator<C1287d> {
    /* renamed from: c */
    public static void m8801c(C1287d c1287d, Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10474j(parcel, 2, c1287d.f4877h, false);
        C2603c.m10466b(parcel, m10465a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public C1287d createFromParcel(Parcel parcel) {
        int m10422N = C2602b.m10422N(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < m10422N) {
            int m10412D = C2602b.m10412D(parcel);
            if (C2602b.m10446v(m10412D) != 2) {
                C2602b.m10421M(parcel, m10412D);
            } else {
                bundle = C2602b.m10430f(parcel, m10412D);
            }
        }
        C2602b.m10445u(parcel, m10422N);
        return new C1287d(bundle);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: b */
    public C1287d[] newArray(int i10) {
        return new C1287d[i10];
    }
}
