package p321w7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p377firebaseauthapi.zzags;
import io.flutter.plugins.firebase.auth.Constants;
import p108h6.C2394s;
import p125i6.C2603c;

/* renamed from: w7.z0 */
/* loaded from: classes.dex */
public class C5427z0 extends AbstractC5368h {
    public static final Parcelable.Creator<C5427z0> CREATOR = new C5416v1();

    /* renamed from: h */
    public String f20252h;

    /* renamed from: i */
    public String f20253i;

    public C5427z0(String str, String str2) {
        this.f20252h = C2394s.m9613f(str);
        this.f20253i = C2394s.m9613f(str2);
    }

    /* renamed from: L */
    public static zzags m21581L(C5427z0 c5427z0, String str) {
        C2394s.m9619l(c5427z0);
        return new zzags(null, c5427z0.f20252h, c5427z0.mo21462I(), null, c5427z0.f20253i, null, str, null, null);
    }

    @Override // p321w7.AbstractC5368h
    /* renamed from: I */
    public String mo21462I() {
        return Constants.SIGN_IN_METHOD_TWITTER;
    }

    @Override // p321w7.AbstractC5368h
    /* renamed from: J */
    public String mo21463J() {
        return Constants.SIGN_IN_METHOD_TWITTER;
    }

    @Override // p321w7.AbstractC5368h
    /* renamed from: K */
    public final AbstractC5368h mo21464K() {
        return new C5427z0(this.f20252h, this.f20253i);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10456F(parcel, 1, this.f20252h, false);
        C2603c.m10456F(parcel, 2, this.f20253i, false);
        C2603c.m10466b(parcel, m10465a);
    }
}
