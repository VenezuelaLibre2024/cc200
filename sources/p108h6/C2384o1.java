package p108h6;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import p064e6.C1671d;
import p125i6.C2602b;
import p125i6.C2603c;

/* renamed from: h6.o1 */
/* loaded from: classes.dex */
public final class C2384o1 implements Parcelable.Creator {
    /* renamed from: a */
    public static void m9587a(C2358g c2358g, Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10485u(parcel, 1, c2358g.f9617h);
        C2603c.m10485u(parcel, 2, c2358g.f9618i);
        C2603c.m10485u(parcel, 3, c2358g.f9619j);
        C2603c.m10456F(parcel, 4, c2358g.f9620k, false);
        C2603c.m10484t(parcel, 5, c2358g.f9621l, false);
        C2603c.m10459I(parcel, 6, c2358g.f9622m, i10, false);
        C2603c.m10474j(parcel, 7, c2358g.f9623n, false);
        C2603c.m10454D(parcel, 8, c2358g.f9624o, i10, false);
        C2603c.m10459I(parcel, 10, c2358g.f9625p, i10, false);
        C2603c.m10459I(parcel, 11, c2358g.f9626q, i10, false);
        C2603c.m10471g(parcel, 12, c2358g.f9627r);
        C2603c.m10485u(parcel, 13, c2358g.f9628s);
        C2603c.m10471g(parcel, 14, c2358g.f9629t);
        C2603c.m10456F(parcel, 15, c2358g.zza(), false);
        C2603c.m10466b(parcel, m10465a);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m10422N = C2602b.m10422N(parcel);
        Scope[] scopeArr = C2358g.f9615v;
        Bundle bundle = new Bundle();
        C1671d[] c1671dArr = C2358g.f9616w;
        C1671d[] c1671dArr2 = c1671dArr;
        String str = null;
        IBinder iBinder = null;
        Account account = null;
        String str2 = null;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        boolean z10 = false;
        int i13 = 0;
        boolean z11 = false;
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
                    i12 = C2602b.m10414F(parcel, m10412D);
                    break;
                case 4:
                    str = C2602b.m10440p(parcel, m10412D);
                    break;
                case 5:
                    iBinder = C2602b.m10413E(parcel, m10412D);
                    break;
                case 6:
                    scopeArr = (Scope[]) C2602b.m10443s(parcel, m10412D, Scope.CREATOR);
                    break;
                case 7:
                    bundle = C2602b.m10430f(parcel, m10412D);
                    break;
                case 8:
                    account = (Account) C2602b.m10439o(parcel, m10412D, Account.CREATOR);
                    break;
                case 9:
                default:
                    C2602b.m10421M(parcel, m10412D);
                    break;
                case 10:
                    c1671dArr = (C1671d[]) C2602b.m10443s(parcel, m10412D, C1671d.CREATOR);
                    break;
                case 11:
                    c1671dArr2 = (C1671d[]) C2602b.m10443s(parcel, m10412D, C1671d.CREATOR);
                    break;
                case 12:
                    z10 = C2602b.m10447w(parcel, m10412D);
                    break;
                case 13:
                    i13 = C2602b.m10414F(parcel, m10412D);
                    break;
                case 14:
                    z11 = C2602b.m10447w(parcel, m10412D);
                    break;
                case 15:
                    str2 = C2602b.m10440p(parcel, m10412D);
                    break;
            }
        }
        C2602b.m10445u(parcel, m10422N);
        return new C2358g(i10, i11, i12, str, iBinder, scopeArr, bundle, account, c1671dArr, c1671dArr2, z10, i13, z11, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C2358g[i10];
    }
}
