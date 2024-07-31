package p108h6;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import p064e6.C1671d;
import p108h6.InterfaceC2370k;
import p125i6.AbstractC2601a;

/* renamed from: h6.g */
/* loaded from: classes.dex */
public class C2358g extends AbstractC2601a {
    public static final Parcelable.Creator<C2358g> CREATOR = new C2384o1();

    /* renamed from: v */
    public static final Scope[] f9615v = new Scope[0];

    /* renamed from: w */
    public static final C1671d[] f9616w = new C1671d[0];

    /* renamed from: h */
    public final int f9617h;

    /* renamed from: i */
    public final int f9618i;

    /* renamed from: j */
    public final int f9619j;

    /* renamed from: k */
    public String f9620k;

    /* renamed from: l */
    public IBinder f9621l;

    /* renamed from: m */
    public Scope[] f9622m;

    /* renamed from: n */
    public Bundle f9623n;

    /* renamed from: o */
    public Account f9624o;

    /* renamed from: p */
    public C1671d[] f9625p;

    /* renamed from: q */
    public C1671d[] f9626q;

    /* renamed from: r */
    public final boolean f9627r;

    /* renamed from: s */
    public final int f9628s;

    /* renamed from: t */
    public boolean f9629t;

    /* renamed from: u */
    public final String f9630u;

    public C2358g(int i10, int i11, int i12, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, C1671d[] c1671dArr, C1671d[] c1671dArr2, boolean z10, int i13, boolean z11, String str2) {
        scopeArr = scopeArr == null ? f9615v : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        c1671dArr = c1671dArr == null ? f9616w : c1671dArr;
        c1671dArr2 = c1671dArr2 == null ? f9616w : c1671dArr2;
        this.f9617h = i10;
        this.f9618i = i11;
        this.f9619j = i12;
        if ("com.google.android.gms".equals(str)) {
            this.f9620k = "com.google.android.gms";
        } else {
            this.f9620k = str;
        }
        if (i10 < 2) {
            this.f9624o = iBinder != null ? BinderC2340a.m9511e(InterfaceC2370k.a.m9579c(iBinder)) : null;
        } else {
            this.f9621l = iBinder;
            this.f9624o = account;
        }
        this.f9622m = scopeArr;
        this.f9623n = bundle;
        this.f9625p = c1671dArr;
        this.f9626q = c1671dArr2;
        this.f9627r = z10;
        this.f9628s = i13;
        this.f9629t = z11;
        this.f9630u = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        C2384o1.m9587a(this, parcel, i10);
    }

    public final String zza() {
        return this.f9630u;
    }
}
