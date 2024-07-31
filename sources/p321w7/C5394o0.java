package p321w7;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import io.flutter.plugins.firebase.auth.Constants;
import p108h6.C2394s;
import p125i6.C2603c;

/* renamed from: w7.o0 */
/* loaded from: classes.dex */
public class C5394o0 extends AbstractC5368h implements Cloneable {
    public static final Parcelable.Creator<C5394o0> CREATOR = new C5401q1();

    /* renamed from: h */
    public String f20228h;

    /* renamed from: i */
    public String f20229i;

    /* renamed from: j */
    public String f20230j;

    /* renamed from: k */
    public boolean f20231k;

    /* renamed from: l */
    public String f20232l;

    public C5394o0(String str, String str2, String str3, boolean z10, String str4) {
        C2394s.m9609b(((TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) && (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4))) ? false : true, "Cannot create PhoneAuthCredential without either sessionInfo + smsCode or temporary proof + phoneNumber.");
        this.f20228h = str;
        this.f20229i = str2;
        this.f20230j = str3;
        this.f20231k = z10;
        this.f20232l = str4;
    }

    /* renamed from: M */
    public static C5394o0 m21541M(String str, String str2) {
        return new C5394o0(str, str2, null, true, null);
    }

    /* renamed from: P */
    public static C5394o0 m21542P(String str, String str2) {
        return new C5394o0(null, null, str, true, str2);
    }

    @Override // p321w7.AbstractC5368h
    /* renamed from: I */
    public String mo21462I() {
        return Constants.SIGN_IN_METHOD_PHONE;
    }

    @Override // p321w7.AbstractC5368h
    /* renamed from: J */
    public String mo21463J() {
        return Constants.SIGN_IN_METHOD_PHONE;
    }

    @Override // p321w7.AbstractC5368h
    /* renamed from: K */
    public final AbstractC5368h mo21464K() {
        return (C5394o0) clone();
    }

    /* renamed from: L */
    public String m21543L() {
        return this.f20229i;
    }

    /* renamed from: N */
    public final C5394o0 m21544N(boolean z10) {
        this.f20231k = false;
        return this;
    }

    /* renamed from: O */
    public final String m21545O() {
        return this.f20230j;
    }

    /* renamed from: Q */
    public final boolean m21546Q() {
        return this.f20231k;
    }

    public /* synthetic */ Object clone() {
        return new C5394o0(this.f20228h, m21543L(), this.f20230j, this.f20231k, this.f20232l);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10456F(parcel, 1, this.f20228h, false);
        C2603c.m10456F(parcel, 2, m21543L(), false);
        C2603c.m10456F(parcel, 4, this.f20230j, false);
        C2603c.m10471g(parcel, 5, this.f20231k);
        C2603c.m10456F(parcel, 6, this.f20232l, false);
        C2603c.m10466b(parcel, m10465a);
    }

    public final String zzc() {
        return this.f20228h;
    }

    public final String zzd() {
        return this.f20232l;
    }
}
