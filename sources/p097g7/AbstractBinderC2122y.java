package p097g7;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: g7.y */
/* loaded from: classes.dex */
public abstract class AbstractBinderC2122y extends BinderC2111n implements InterfaceC2123z {
    /* renamed from: c */
    public static InterfaceC2123z m8339c(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IIntegrityService");
        return queryLocalInterface instanceof InterfaceC2123z ? (InterfaceC2123z) queryLocalInterface : new C2121x(iBinder);
    }
}
