package p291u5;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.auth.zza;
import com.google.android.gms.internal.auth.zzc;

/* renamed from: u5.e */
/* loaded from: classes.dex */
public final class C4897e extends zza implements InterfaceC4899g {
    public C4897e(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.account.IWorkAccountService");
    }

    @Override // p291u5.InterfaceC4899g
    /* renamed from: T */
    public final void mo19462T(InterfaceC4896d interfaceC4896d, String str) {
        Parcel zza = zza();
        zzc.zzd(zza, interfaceC4896d);
        zza.writeString(str);
        zzc(2, zza);
    }

    @Override // p291u5.InterfaceC4899g
    /* renamed from: h0 */
    public final void mo19463h0(InterfaceC4896d interfaceC4896d, Account account) {
        Parcel zza = zza();
        zzc.zzd(zza, interfaceC4896d);
        zzc.zzc(zza, account);
        zzc(3, zza);
    }

    @Override // p291u5.InterfaceC4899g
    /* renamed from: k1 */
    public final void mo19464k1(boolean z10) {
        Parcel zza = zza();
        int i10 = zzc.zza;
        zza.writeInt(z10 ? 1 : 0);
        zzc(1, zza);
    }
}
