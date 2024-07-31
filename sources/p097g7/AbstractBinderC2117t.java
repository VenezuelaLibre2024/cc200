package p097g7;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: g7.t */
/* loaded from: classes.dex */
public abstract class AbstractBinderC2117t extends BinderC2111n implements InterfaceC2118u {
    /* renamed from: c */
    public static InterfaceC2118u m8337c(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IExpressIntegrityService");
        return queryLocalInterface instanceof InterfaceC2118u ? (InterfaceC2118u) queryLocalInterface : new C2116s(iBinder);
    }
}
