package p352y6;

import android.os.Parcel;
import com.google.android.gms.internal.maps.zzac;
import com.google.android.gms.internal.maps.zzad;
import com.google.android.gms.internal.maps.zzb;
import com.google.android.gms.internal.maps.zzc;
import p252r6.InterfaceC4307b;

/* renamed from: y6.i0 */
/* loaded from: classes.dex */
public abstract class AbstractBinderC5835i0 extends zzb implements InterfaceC5837j0 {
    public AbstractBinderC5835i0() {
        super("com.google.android.gms.maps.internal.IInfoWindowAdapter");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) {
        InterfaceC4307b mo22707b;
        if (i10 == 1) {
            zzad zzb = zzac.zzb(parcel.readStrongBinder());
            zzc.zzc(parcel);
            mo22707b = mo22707b(zzb);
        } else {
            if (i10 != 2) {
                return false;
            }
            zzad zzb2 = zzac.zzb(parcel.readStrongBinder());
            zzc.zzc(parcel);
            mo22707b = mo22706a(zzb2);
        }
        parcel2.writeNoException();
        zzc.zze(parcel2, mo22707b);
        return true;
    }
}
