package p337x7;

import android.os.Parcel;
import android.os.Parcelable;
import io.flutter.plugins.firebase.auth.Constants;
import java.util.Map;
import p108h6.C2394s;
import p125i6.C2603c;
import p321w7.InterfaceC5364g;

/* renamed from: x7.f2 */
/* loaded from: classes.dex */
public final class C5676f2 implements InterfaceC5364g {
    public static final Parcelable.Creator<C5676f2> CREATOR = new C5672e2();

    /* renamed from: h */
    public final String f21159h;

    /* renamed from: i */
    public final String f21160i;

    /* renamed from: j */
    public Map<String, Object> f21161j;

    /* renamed from: k */
    public boolean f21162k;

    public C5676f2(String str, String str2, boolean z10) {
        C2394s.m9613f(str);
        C2394s.m9613f(str2);
        this.f21159h = str;
        this.f21160i = str2;
        this.f21161j = C5695l0.m22784d(str2);
        this.f21162k = z10;
    }

    public C5676f2(boolean z10) {
        this.f21162k = z10;
        this.f21160i = null;
        this.f21159h = null;
        this.f21161j = null;
    }

    @Override // p321w7.InterfaceC5364g
    /* renamed from: D */
    public final boolean mo21496D() {
        return this.f21162k;
    }

    @Override // p321w7.InterfaceC5364g
    /* renamed from: c */
    public final String mo21497c() {
        return this.f21159h;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // p321w7.InterfaceC5364g
    /* renamed from: q */
    public final String mo21498q() {
        Map<String, Object> map;
        String str;
        if (Constants.SIGN_IN_METHOD_GITHUB.equals(this.f21159h)) {
            map = this.f21161j;
            str = "login";
        } else {
            if (!Constants.SIGN_IN_METHOD_TWITTER.equals(this.f21159h)) {
                return null;
            }
            map = this.f21161j;
            str = "screen_name";
        }
        return (String) map.get(str);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10456F(parcel, 1, mo21497c(), false);
        C2603c.m10456F(parcel, 2, this.f21160i, false);
        C2603c.m10471g(parcel, 3, mo21496D());
        C2603c.m10466b(parcel, m10465a);
    }

    @Override // p321w7.InterfaceC5364g
    /* renamed from: x */
    public final Map<String, Object> mo21499x() {
        return this.f21161j;
    }
}
