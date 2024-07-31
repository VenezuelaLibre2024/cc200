package p337x7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p377firebaseauthapi.zzafm;
import com.google.android.gms.internal.p377firebaseauthapi.zzafp;
import java.util.ArrayList;
import p125i6.C2602b;
import p321w7.C5428z1;

/* renamed from: x7.h */
/* loaded from: classes.dex */
public final class C5681h implements Parcelable.Creator<C5685i> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C5685i createFromParcel(Parcel parcel) {
        int m10422N = C2602b.m10422N(parcel);
        zzafm zzafmVar = null;
        C5669e c5669e = null;
        String str = null;
        String str2 = null;
        ArrayList arrayList = null;
        ArrayList<String> arrayList2 = null;
        String str3 = null;
        Boolean bool = null;
        C5691k c5691k = null;
        C5428z1 c5428z1 = null;
        C5701n0 c5701n0 = null;
        ArrayList arrayList3 = null;
        boolean z10 = false;
        while (parcel.dataPosition() < m10422N) {
            int m10412D = C2602b.m10412D(parcel);
            switch (C2602b.m10446v(m10412D)) {
                case 1:
                    zzafmVar = (zzafm) C2602b.m10439o(parcel, m10412D, zzafm.CREATOR);
                    break;
                case 2:
                    c5669e = (C5669e) C2602b.m10439o(parcel, m10412D, C5669e.CREATOR);
                    break;
                case 3:
                    str = C2602b.m10440p(parcel, m10412D);
                    break;
                case 4:
                    str2 = C2602b.m10440p(parcel, m10412D);
                    break;
                case 5:
                    arrayList = C2602b.m10444t(parcel, m10412D, C5669e.CREATOR);
                    break;
                case 6:
                    arrayList2 = C2602b.m10442r(parcel, m10412D);
                    break;
                case 7:
                    str3 = C2602b.m10440p(parcel, m10412D);
                    break;
                case 8:
                    bool = C2602b.m10448x(parcel, m10412D);
                    break;
                case 9:
                    c5691k = (C5691k) C2602b.m10439o(parcel, m10412D, C5691k.CREATOR);
                    break;
                case 10:
                    z10 = C2602b.m10447w(parcel, m10412D);
                    break;
                case 11:
                    c5428z1 = (C5428z1) C2602b.m10439o(parcel, m10412D, C5428z1.CREATOR);
                    break;
                case 12:
                    c5701n0 = (C5701n0) C2602b.m10439o(parcel, m10412D, C5701n0.CREATOR);
                    break;
                case 13:
                    arrayList3 = C2602b.m10444t(parcel, m10412D, zzafp.CREATOR);
                    break;
                default:
                    C2602b.m10421M(parcel, m10412D);
                    break;
            }
        }
        C2602b.m10445u(parcel, m10422N);
        return new C5685i(zzafmVar, c5669e, str, str2, arrayList, arrayList2, str3, bool, c5691k, z10, c5428z1, c5701n0, arrayList3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C5685i[] newArray(int i10) {
        return new C5685i[i10];
    }
}
