package p108h6;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import p125i6.AbstractC2601a;
import p125i6.C2603c;

/* renamed from: h6.r0 */
/* loaded from: classes.dex */
public final class C2392r0 extends AbstractC2601a {
    public static final Parcelable.Creator<C2392r0> CREATOR = new C2395s0();

    /* renamed from: h */
    public final int f9693h;

    /* renamed from: i */
    public final Account f9694i;

    /* renamed from: j */
    public final int f9695j;

    /* renamed from: k */
    public final GoogleSignInAccount f9696k;

    public C2392r0(int i10, Account account, int i11, GoogleSignInAccount googleSignInAccount) {
        this.f9693h = i10;
        this.f9694i = account;
        this.f9695j = i11;
        this.f9696k = googleSignInAccount;
    }

    public C2392r0(Account account, int i10, GoogleSignInAccount googleSignInAccount) {
        this(2, account, i10, googleSignInAccount);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10485u(parcel, 1, this.f9693h);
        C2603c.m10454D(parcel, 2, this.f9694i, i10, false);
        C2603c.m10485u(parcel, 3, this.f9695j);
        C2603c.m10454D(parcel, 4, this.f9696k, i10, false);
        C2603c.m10466b(parcel, m10465a);
    }
}
