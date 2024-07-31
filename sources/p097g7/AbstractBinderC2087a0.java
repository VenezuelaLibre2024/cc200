package p097g7;

import android.os.Bundle;
import android.os.Parcel;

/* renamed from: g7.a0 */
/* loaded from: classes.dex */
public abstract class AbstractBinderC2087a0 extends BinderC2111n implements InterfaceC2089b0 {
    public AbstractBinderC2087a0() {
        super("com.google.android.play.core.integrity.protocol.IIntegrityServiceCallback");
    }

    @Override // p097g7.BinderC2111n
    /* renamed from: a */
    public final boolean mo8289a(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 2) {
            return false;
        }
        Bundle bundle = (Bundle) C2112o.m8327a(parcel, Bundle.CREATOR);
        C2112o.m8328b(parcel);
        mo5117b(bundle);
        return true;
    }
}
