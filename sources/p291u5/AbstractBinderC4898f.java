package p291u5;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.auth.zzb;

/* renamed from: u5.f */
/* loaded from: classes.dex */
public abstract class AbstractBinderC4898f extends zzb implements InterfaceC4899g {
    /* renamed from: c */
    public static InterfaceC4899g m19465c(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.account.IWorkAccountService");
        return queryLocalInterface instanceof InterfaceC4899g ? (InterfaceC4899g) queryLocalInterface : new C4897e(iBinder);
    }
}
