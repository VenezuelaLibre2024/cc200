package p321w7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p377firebaseauthapi.zzags;
import io.flutter.plugins.firebase.auth.Constants;
import p108h6.C2394s;
import p125i6.C2603c;

/* renamed from: w7.d0 */
/* loaded from: classes.dex */
public class C5353d0 extends AbstractC5368h {
    public static final Parcelable.Creator<C5353d0> CREATOR = new C5386l1();

    /* renamed from: h */
    public String f20161h;

    public C5353d0(String str) {
        this.f20161h = C2394s.m9613f(str);
    }

    /* renamed from: L */
    public static zzags m21461L(C5353d0 c5353d0, String str) {
        C2394s.m9619l(c5353d0);
        return new zzags(null, c5353d0.f20161h, c5353d0.mo21462I(), null, null, null, str, null, null);
    }

    @Override // p321w7.AbstractC5368h
    /* renamed from: I */
    public String mo21462I() {
        return Constants.SIGN_IN_METHOD_GITHUB;
    }

    @Override // p321w7.AbstractC5368h
    /* renamed from: J */
    public String mo21463J() {
        return Constants.SIGN_IN_METHOD_GITHUB;
    }

    @Override // p321w7.AbstractC5368h
    /* renamed from: K */
    public final AbstractC5368h mo21464K() {
        return new C5353d0(this.f20161h);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10456F(parcel, 1, this.f20161h, false);
        C2603c.m10466b(parcel, m10465a);
    }
}
