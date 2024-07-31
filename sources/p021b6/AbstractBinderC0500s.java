package p021b6;

import android.os.Parcel;
import com.google.android.gms.internal.p375authapi.zbb;

/* renamed from: b6.s */
/* loaded from: classes.dex */
public abstract class AbstractBinderC0500s extends zbb implements InterfaceC0501t {
    public AbstractBinderC0500s() {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
    }

    @Override // com.google.android.gms.internal.p375authapi.zbb
    public final boolean zba(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            mo2449D();
        } else {
            if (i10 != 2) {
                return false;
            }
            mo2450n();
        }
        return true;
    }
}
