package p321w7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p377firebaseauthapi.zzags;
import p125i6.C2602b;

/* renamed from: w7.a2 */
/* loaded from: classes.dex */
public final class C5343a2 implements Parcelable.Creator<C5428z1> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C5428z1 createFromParcel(Parcel parcel) {
        int m10422N = C2602b.m10422N(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        zzags zzagsVar = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
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
                    str3 = C2602b.m10440p(parcel, m10412D);
                    break;
                case 4:
                    zzagsVar = (zzags) C2602b.m10439o(parcel, m10412D, zzags.CREATOR);
                    break;
                case 5:
                    str4 = C2602b.m10440p(parcel, m10412D);
                    break;
                case 6:
                    str5 = C2602b.m10440p(parcel, m10412D);
                    break;
                case 7:
                    str6 = C2602b.m10440p(parcel, m10412D);
                    break;
                default:
                    C2602b.m10421M(parcel, m10412D);
                    break;
            }
        }
        C2602b.m10445u(parcel, m10422N);
        return new C5428z1(str, str2, str3, zzagsVar, str4, str5, str6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C5428z1[] newArray(int i10) {
        return new C5428z1[i10];
    }
}
