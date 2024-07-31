package p291u5;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.internal.auth.zzb;
import com.google.android.gms.internal.auth.zzc;

/* renamed from: u5.c */
/* loaded from: classes.dex */
public abstract class AbstractBinderC4895c extends zzb implements InterfaceC4896d {
    public AbstractBinderC4895c() {
        super("com.google.android.gms.auth.account.IWorkAccountCallback");
    }

    @Override // com.google.android.gms.internal.auth.zzb
    public final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            if (i10 != 2) {
                return false;
            }
            int i12 = zzc.zza;
            int readInt = parcel.readInt();
            zzc.zzb(parcel);
            zzc(readInt != 0);
        } else {
            Account account = (Account) zzc.zza(parcel, Account.CREATOR);
            zzc.zzb(parcel);
            zzb(account);
        }
        return true;
    }
}
