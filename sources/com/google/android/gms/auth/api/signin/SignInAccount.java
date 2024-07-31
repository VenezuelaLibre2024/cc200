package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import p008a6.C0069k;
import p108h6.C2394s;
import p125i6.AbstractC2601a;
import p125i6.C2603c;

/* loaded from: classes.dex */
public class SignInAccount extends AbstractC2601a implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInAccount> CREATOR = new C0069k();

    /* renamed from: h */
    @Deprecated
    public final String f4454h;

    /* renamed from: i */
    public final GoogleSignInAccount f4455i;

    /* renamed from: j */
    @Deprecated
    public final String f4456j;

    public SignInAccount(String str, GoogleSignInAccount googleSignInAccount, String str2) {
        this.f4455i = googleSignInAccount;
        this.f4454h = C2394s.m9614g(str, "8.3 and 8.4 SDKs require non-null email");
        this.f4456j = C2394s.m9614g(str2, "8.3 and 8.4 SDKs require non-null userId");
    }

    /* renamed from: I */
    public final GoogleSignInAccount m4970I() {
        return this.f4455i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f4454h;
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10456F(parcel, 4, str, false);
        C2603c.m10454D(parcel, 7, this.f4455i, i10, false);
        C2603c.m10456F(parcel, 8, this.f4456j, false);
        C2603c.m10466b(parcel, m10465a);
    }
}
