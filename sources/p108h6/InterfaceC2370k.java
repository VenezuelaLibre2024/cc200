package p108h6;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.common.zzb;

/* renamed from: h6.k */
/* loaded from: classes.dex */
public interface InterfaceC2370k extends IInterface {

    /* renamed from: h6.k$a */
    /* loaded from: classes.dex */
    public static abstract class a extends zzb implements InterfaceC2370k {
        /* renamed from: c */
        public static InterfaceC2370k m9579c(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            return queryLocalInterface instanceof InterfaceC2370k ? (InterfaceC2370k) queryLocalInterface : new C2408w1(iBinder);
        }
    }

    Account zzb();
}
