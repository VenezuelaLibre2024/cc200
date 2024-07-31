package p321w7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p377firebaseauthapi.zzags;
import io.flutter.plugins.firebase.auth.Constants;
import p108h6.C2394s;
import p125i6.C2603c;

/* renamed from: w7.l */
/* loaded from: classes.dex */
public class C5384l extends AbstractC5368h {
    public static final Parcelable.Creator<C5384l> CREATOR = new C5351c2();

    /* renamed from: h */
    public final String f20219h;

    public C5384l(String str) {
        this.f20219h = C2394s.m9613f(str);
    }

    /* renamed from: L */
    public static zzags m21523L(C5384l c5384l, String str) {
        C2394s.m9619l(c5384l);
        return new zzags(null, c5384l.f20219h, c5384l.mo21462I(), null, null, null, str, null, null);
    }

    @Override // p321w7.AbstractC5368h
    /* renamed from: I */
    public String mo21462I() {
        return Constants.SIGN_IN_METHOD_FACEBOOK;
    }

    @Override // p321w7.AbstractC5368h
    /* renamed from: J */
    public String mo21463J() {
        return Constants.SIGN_IN_METHOD_FACEBOOK;
    }

    @Override // p321w7.AbstractC5368h
    /* renamed from: K */
    public final AbstractC5368h mo21464K() {
        return new C5384l(this.f20219h);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10456F(parcel, 1, this.f20219h, false);
        C2603c.m10466b(parcel, m10465a);
    }
}
