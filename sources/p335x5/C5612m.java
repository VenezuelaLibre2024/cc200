package p335x5;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.AuthorizationRequest;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import p125i6.C2602b;

/* renamed from: x5.m */
/* loaded from: classes.dex */
public final class C5612m implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m10422N = C2602b.m10422N(parcel);
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        ArrayList arrayList = null;
        String str = null;
        Account account = null;
        String str2 = null;
        String str3 = null;
        while (parcel.dataPosition() < m10422N) {
            int m10412D = C2602b.m10412D(parcel);
            switch (C2602b.m10446v(m10412D)) {
                case 1:
                    arrayList = C2602b.m10444t(parcel, m10412D, Scope.CREATOR);
                    break;
                case 2:
                    str = C2602b.m10440p(parcel, m10412D);
                    break;
                case 3:
                    z10 = C2602b.m10447w(parcel, m10412D);
                    break;
                case 4:
                    z11 = C2602b.m10447w(parcel, m10412D);
                    break;
                case 5:
                    account = (Account) C2602b.m10439o(parcel, m10412D, Account.CREATOR);
                    break;
                case 6:
                    str2 = C2602b.m10440p(parcel, m10412D);
                    break;
                case 7:
                    str3 = C2602b.m10440p(parcel, m10412D);
                    break;
                case 8:
                    z12 = C2602b.m10447w(parcel, m10412D);
                    break;
                default:
                    C2602b.m10421M(parcel, m10412D);
                    break;
            }
        }
        C2602b.m10445u(parcel, m10422N);
        return new AuthorizationRequest(arrayList, str, z10, z11, account, str2, str3, z12);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new AuthorizationRequest[i10];
    }
}
