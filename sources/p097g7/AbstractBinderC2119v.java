package p097g7;

import android.os.Bundle;
import android.os.Parcel;

/* renamed from: g7.v */
/* loaded from: classes.dex */
public abstract class AbstractBinderC2119v extends BinderC2111n implements InterfaceC2120w {
    public AbstractBinderC2119v() {
        super("com.google.android.play.core.integrity.protocol.IExpressIntegrityServiceCallback");
    }

    @Override // p097g7.BinderC2111n
    /* renamed from: a */
    public final boolean mo8289a(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 2) {
            Bundle bundle = (Bundle) C2112o.m8327a(parcel, Bundle.CREATOR);
            C2112o.m8328b(parcel);
            mo5129e(bundle);
            return true;
        }
        if (i10 == 3) {
            Bundle bundle2 = (Bundle) C2112o.m8327a(parcel, Bundle.CREATOR);
            C2112o.m8328b(parcel);
            mo5127c(bundle2);
            return true;
        }
        if (i10 == 4) {
            Bundle bundle3 = (Bundle) C2112o.m8327a(parcel, Bundle.CREATOR);
            C2112o.m8328b(parcel);
            mo5128d(bundle3);
            return true;
        }
        if (i10 != 5) {
            return false;
        }
        Bundle bundle4 = (Bundle) C2112o.m8327a(parcel, Bundle.CREATOR);
        C2112o.m8328b(parcel);
        mo5126b(bundle4);
        return true;
    }
}
