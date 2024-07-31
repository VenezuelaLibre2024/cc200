package p321w7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p377firebaseauthapi.zzags;
import io.flutter.plugins.firebase.auth.Constants;
import p108h6.C2394s;
import p125i6.C2603c;

/* renamed from: w7.f0 */
/* loaded from: classes.dex */
public class C5361f0 extends AbstractC5368h {
    public static final Parcelable.Creator<C5361f0> CREATOR = new C5389m1();

    /* renamed from: h */
    public final String f20192h;

    /* renamed from: i */
    public final String f20193i;

    public C5361f0(String str, String str2) {
        if (str == null && str2 == null) {
            throw new IllegalArgumentException("Must specify an idToken or an accessToken.");
        }
        if (str != null && str.length() == 0) {
            throw new IllegalArgumentException("idToken cannot be empty");
        }
        if (str2 != null && str2.length() == 0) {
            throw new IllegalArgumentException("accessToken cannot be empty");
        }
        this.f20192h = str;
        this.f20193i = str2;
    }

    /* renamed from: L */
    public static zzags m21495L(C5361f0 c5361f0, String str) {
        C2394s.m9619l(c5361f0);
        return new zzags(c5361f0.f20192h, c5361f0.f20193i, c5361f0.mo21462I(), null, null, null, str, null, null);
    }

    @Override // p321w7.AbstractC5368h
    /* renamed from: I */
    public String mo21462I() {
        return Constants.SIGN_IN_METHOD_GOOGLE;
    }

    @Override // p321w7.AbstractC5368h
    /* renamed from: J */
    public String mo21463J() {
        return Constants.SIGN_IN_METHOD_GOOGLE;
    }

    @Override // p321w7.AbstractC5368h
    /* renamed from: K */
    public final AbstractC5368h mo21464K() {
        return new C5361f0(this.f20192h, this.f20193i);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10456F(parcel, 1, this.f20192h, false);
        C2603c.m10456F(parcel, 2, this.f20193i, false);
        C2603c.m10466b(parcel, m10465a);
    }
}
