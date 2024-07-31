package p108h6;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import p125i6.C2602b;

/* renamed from: h6.s0 */
/* loaded from: classes.dex */
public final class C2395s0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m10422N = C2602b.m10422N(parcel);
        Account account = null;
        int i10 = 0;
        int i11 = 0;
        GoogleSignInAccount googleSignInAccount = null;
        while (parcel.dataPosition() < m10422N) {
            int m10412D = C2602b.m10412D(parcel);
            int m10446v = C2602b.m10446v(m10412D);
            if (m10446v == 1) {
                i10 = C2602b.m10414F(parcel, m10412D);
            } else if (m10446v == 2) {
                account = (Account) C2602b.m10439o(parcel, m10412D, Account.CREATOR);
            } else if (m10446v == 3) {
                i11 = C2602b.m10414F(parcel, m10412D);
            } else if (m10446v != 4) {
                C2602b.m10421M(parcel, m10412D);
            } else {
                googleSignInAccount = (GoogleSignInAccount) C2602b.m10439o(parcel, m10412D, GoogleSignInAccount.CREATOR);
            }
        }
        C2602b.m10445u(parcel, m10422N);
        return new C2392r0(i10, account, i11, googleSignInAccount);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C2392r0[i10];
    }
}
