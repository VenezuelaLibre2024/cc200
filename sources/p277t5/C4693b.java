package p277t5;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import p125i6.AbstractC2601a;
import p125i6.C2603c;

/* renamed from: t5.b */
/* loaded from: classes.dex */
public class C4693b extends AbstractC2601a {
    public static final Parcelable.Creator<C4693b> CREATOR = new C4699h();

    /* renamed from: h */
    public final int f17532h;

    /* renamed from: i */
    public int f17533i;

    /* renamed from: j */
    @Deprecated
    public String f17534j;

    /* renamed from: k */
    public Account f17535k;

    public C4693b(int i10, int i11, String str, Account account) {
        this.f17532h = i10;
        this.f17533i = i11;
        this.f17534j = str;
        if (account != null || TextUtils.isEmpty(str)) {
            this.f17535k = account;
        } else {
            this.f17535k = new Account(str, "com.google");
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10485u(parcel, 1, this.f17532h);
        C2603c.m10485u(parcel, 2, this.f17533i);
        C2603c.m10456F(parcel, 3, this.f17534j, false);
        C2603c.m10454D(parcel, 4, this.f17535k, i10, false);
        C2603c.m10466b(parcel, m10465a);
    }
}
