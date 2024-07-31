package p108h6;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.common.zza;
import com.google.android.gms.internal.common.zzc;

/* renamed from: h6.w1 */
/* loaded from: classes.dex */
public final class C2408w1 extends zza implements InterfaceC2370k {
    public C2408w1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
    }

    @Override // p108h6.InterfaceC2370k
    public final Account zzb() {
        Parcel zzB = zzB(2, zza());
        Account account = (Account) zzc.zza(zzB, Account.CREATOR);
        zzB.recycle();
        return account;
    }
}
