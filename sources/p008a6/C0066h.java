package p008a6;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import p021b6.C0481a;
import p125i6.C2602b;

/* renamed from: a6.h */
/* loaded from: classes.dex */
public final class C0066h implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m10422N = C2602b.m10422N(parcel);
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        ArrayList arrayList = null;
        Account account = null;
        String str = null;
        String str2 = null;
        ArrayList arrayList2 = null;
        String str3 = null;
        while (parcel.dataPosition() < m10422N) {
            int m10412D = C2602b.m10412D(parcel);
            switch (C2602b.m10446v(m10412D)) {
                case 1:
                    i10 = C2602b.m10414F(parcel, m10412D);
                    break;
                case 2:
                    arrayList = C2602b.m10444t(parcel, m10412D, Scope.CREATOR);
                    break;
                case 3:
                    account = (Account) C2602b.m10439o(parcel, m10412D, Account.CREATOR);
                    break;
                case 4:
                    z10 = C2602b.m10447w(parcel, m10412D);
                    break;
                case 5:
                    z11 = C2602b.m10447w(parcel, m10412D);
                    break;
                case 6:
                    z12 = C2602b.m10447w(parcel, m10412D);
                    break;
                case 7:
                    str = C2602b.m10440p(parcel, m10412D);
                    break;
                case 8:
                    str2 = C2602b.m10440p(parcel, m10412D);
                    break;
                case 9:
                    arrayList2 = C2602b.m10444t(parcel, m10412D, C0481a.CREATOR);
                    break;
                case 10:
                    str3 = C2602b.m10440p(parcel, m10412D);
                    break;
                default:
                    C2602b.m10421M(parcel, m10412D);
                    break;
            }
        }
        C2602b.m10445u(parcel, m10422N);
        return new GoogleSignInOptions(i10, arrayList, account, z10, z11, z12, str, str2, arrayList2, str3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new GoogleSignInOptions[i10];
    }
}
