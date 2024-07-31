package p321w7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p377firebaseauthapi.zzags;
import io.flutter.plugins.firebase.auth.Constants;
import p108h6.C2394s;
import p125i6.C2603c;

/* renamed from: w7.s0 */
/* loaded from: classes.dex */
public class C5406s0 extends AbstractC5368h {
    public static final Parcelable.Creator<C5406s0> CREATOR = new C5410t1();

    /* renamed from: h */
    public final String f20239h;

    public C5406s0(String str) {
        this.f20239h = C2394s.m9613f(str);
    }

    /* renamed from: L */
    public static zzags m21552L(C5406s0 c5406s0, String str) {
        C2394s.m9619l(c5406s0);
        return new zzags(null, null, c5406s0.mo21462I(), null, null, c5406s0.f20239h, str, null, null);
    }

    @Override // p321w7.AbstractC5368h
    /* renamed from: I */
    public String mo21462I() {
        return Constants.SIGN_IN_METHOD_PLAY_GAMES;
    }

    @Override // p321w7.AbstractC5368h
    /* renamed from: J */
    public String mo21463J() {
        return Constants.SIGN_IN_METHOD_PLAY_GAMES;
    }

    @Override // p321w7.AbstractC5368h
    /* renamed from: K */
    public final AbstractC5368h mo21464K() {
        return new C5406s0(this.f20239h);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10456F(parcel, 1, this.f20239h, false);
        C2603c.m10466b(parcel, m10465a);
    }
}
