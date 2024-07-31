package p182m6;

import android.os.Parcel;
import android.os.Parcelable;
import p125i6.C2602b;
import p169l6.C3435b;
import p182m6.AbstractC3537a;

/* renamed from: m6.d */
/* loaded from: classes.dex */
public final class C3540d implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m10422N = C2602b.m10422N(parcel);
        String str = null;
        String str2 = null;
        C3435b c3435b = null;
        int i10 = 0;
        int i11 = 0;
        boolean z10 = false;
        int i12 = 0;
        boolean z11 = false;
        int i13 = 0;
        while (parcel.dataPosition() < m10422N) {
            int m10412D = C2602b.m10412D(parcel);
            switch (C2602b.m10446v(m10412D)) {
                case 1:
                    i10 = C2602b.m10414F(parcel, m10412D);
                    break;
                case 2:
                    i11 = C2602b.m10414F(parcel, m10412D);
                    break;
                case 3:
                    z10 = C2602b.m10447w(parcel, m10412D);
                    break;
                case 4:
                    i12 = C2602b.m10414F(parcel, m10412D);
                    break;
                case 5:
                    z11 = C2602b.m10447w(parcel, m10412D);
                    break;
                case 6:
                    str = C2602b.m10440p(parcel, m10412D);
                    break;
                case 7:
                    i13 = C2602b.m10414F(parcel, m10412D);
                    break;
                case 8:
                    str2 = C2602b.m10440p(parcel, m10412D);
                    break;
                case 9:
                    c3435b = (C3435b) C2602b.m10439o(parcel, m10412D, C3435b.CREATOR);
                    break;
                default:
                    C2602b.m10421M(parcel, m10412D);
                    break;
            }
        }
        C2602b.m10445u(parcel, m10422N);
        return new AbstractC3537a.a(i10, i11, z10, i12, z11, str, i13, str2, c3435b);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new AbstractC3537a.a[i10];
    }
}
