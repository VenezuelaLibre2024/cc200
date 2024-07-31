package p277t5;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.TokenData;
import java.util.ArrayList;
import p125i6.C2602b;

/* renamed from: t5.p */
/* loaded from: classes.dex */
public final class C4707p implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m10422N = C2602b.m10422N(parcel);
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = false;
        String str = null;
        Long l10 = null;
        ArrayList<String> arrayList = null;
        String str2 = null;
        while (parcel.dataPosition() < m10422N) {
            int m10412D = C2602b.m10412D(parcel);
            switch (C2602b.m10446v(m10412D)) {
                case 1:
                    i10 = C2602b.m10414F(parcel, m10412D);
                    break;
                case 2:
                    str = C2602b.m10440p(parcel, m10412D);
                    break;
                case 3:
                    l10 = C2602b.m10418J(parcel, m10412D);
                    break;
                case 4:
                    z10 = C2602b.m10447w(parcel, m10412D);
                    break;
                case 5:
                    z11 = C2602b.m10447w(parcel, m10412D);
                    break;
                case 6:
                    arrayList = C2602b.m10442r(parcel, m10412D);
                    break;
                case 7:
                    str2 = C2602b.m10440p(parcel, m10412D);
                    break;
                default:
                    C2602b.m10421M(parcel, m10412D);
                    break;
            }
        }
        C2602b.m10445u(parcel, m10422N);
        return new TokenData(i10, str, l10, z10, z11, arrayList, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new TokenData[i10];
    }
}
