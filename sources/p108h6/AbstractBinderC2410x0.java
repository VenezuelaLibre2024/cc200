package p108h6;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.common.zzb;
import com.google.android.gms.internal.common.zzc;

/* renamed from: h6.x0 */
/* loaded from: classes.dex */
public abstract class AbstractBinderC2410x0 extends zzb implements InterfaceC2376m {
    public AbstractBinderC2410x0() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    @Override // com.google.android.gms.internal.common.zzb
    public final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            int readInt = parcel.readInt();
            IBinder readStrongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) zzc.zza(parcel, Bundle.CREATOR);
            zzc.zzb(parcel);
            mo9560x0(readInt, readStrongBinder, bundle);
        } else if (i10 == 2) {
            int readInt2 = parcel.readInt();
            Bundle bundle2 = (Bundle) zzc.zza(parcel, Bundle.CREATOR);
            zzc.zzb(parcel);
            mo9559W(readInt2, bundle2);
        } else {
            if (i10 != 3) {
                return false;
            }
            int readInt3 = parcel.readInt();
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            C2375l1 c2375l1 = (C2375l1) zzc.zza(parcel, C2375l1.CREATOR);
            zzc.zzb(parcel);
            mo9558B(readInt3, readStrongBinder2, c2375l1);
        }
        parcel2.writeNoException();
        return true;
    }
}
