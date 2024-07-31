package p108h6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.common.zzb;
import com.google.android.gms.internal.common.zzc;
import p252r6.InterfaceC4307b;

/* renamed from: h6.z1 */
/* loaded from: classes.dex */
public abstract class AbstractBinderC2417z1 extends zzb implements InterfaceC2407w0 {
    public AbstractBinderC2417z1() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    /* renamed from: c */
    public static InterfaceC2407w0 m9653c(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
        return queryLocalInterface instanceof InterfaceC2407w0 ? (InterfaceC2407w0) queryLocalInterface : new C2414y1(iBinder);
    }

    @Override // com.google.android.gms.internal.common.zzb
    public final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            InterfaceC4307b zzd = zzd();
            parcel2.writeNoException();
            zzc.zze(parcel2, zzd);
        } else {
            if (i10 != 2) {
                return false;
            }
            int zzc = zzc();
            parcel2.writeNoException();
            parcel2.writeInt(zzc);
        }
        return true;
    }
}
