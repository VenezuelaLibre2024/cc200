package p352y6;

import android.os.Parcel;
import com.google.android.gms.internal.maps.zzb;
import com.google.android.gms.internal.maps.zzc;
import com.google.android.gms.internal.maps.zzk;
import com.google.android.gms.internal.maps.zzl;

/* renamed from: y6.r0 */
/* loaded from: classes.dex */
public abstract class AbstractBinderC5853r0 extends zzb implements InterfaceC5855s0 {
    public AbstractBinderC5853r0() {
        super("com.google.android.gms.maps.internal.IOnCircleClickListener");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        zzl zzb = zzk.zzb(parcel.readStrongBinder());
        zzc.zzc(parcel);
        mo22708g1(zzb);
        parcel2.writeNoException();
        return true;
    }
}
