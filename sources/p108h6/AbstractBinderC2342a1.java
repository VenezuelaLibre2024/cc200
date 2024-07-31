package p108h6;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.common.zzb;

/* renamed from: h6.a1 */
/* loaded from: classes.dex */
public abstract class AbstractBinderC2342a1 extends zzb implements InterfaceC2345b1 {
    /* renamed from: c */
    public static InterfaceC2345b1 m9512c(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
        return queryLocalInterface instanceof InterfaceC2345b1 ? (InterfaceC2345b1) queryLocalInterface : new C2416z0(iBinder);
    }
}
