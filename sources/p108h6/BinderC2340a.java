package p108h6;

import android.accounts.Account;
import android.os.Binder;
import android.os.RemoteException;
import android.util.Log;
import p108h6.InterfaceC2370k;

/* renamed from: h6.a */
/* loaded from: classes.dex */
public class BinderC2340a extends InterfaceC2370k.a {
    /* renamed from: e */
    public static Account m9511e(InterfaceC2370k interfaceC2370k) {
        Account account = null;
        if (interfaceC2370k != null) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                try {
                    account = interfaceC2370k.zzb();
                } catch (RemoteException unused) {
                    Log.w("AccountAccessor", "Remote account accessor probably died");
                }
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
        return account;
    }
}
