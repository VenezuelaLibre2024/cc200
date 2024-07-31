package p352y6;

import android.os.Parcel;
import com.google.android.gms.internal.maps.zzac;
import com.google.android.gms.internal.maps.zzad;
import com.google.android.gms.internal.maps.zzb;
import com.google.android.gms.internal.maps.zzc;

/* renamed from: y6.q */
/* loaded from: classes.dex */
public abstract class AbstractBinderC5850q extends zzb implements InterfaceC5852r {
    public AbstractBinderC5850q() {
        super("com.google.android.gms.maps.internal.IOnMarkerClickListener");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        zzad zzb = zzac.zzb(parcel.readStrongBinder());
        zzc.zzc(parcel);
        boolean mo22695a = mo22695a(zzb);
        parcel2.writeNoException();
        parcel2.writeInt(mo22695a ? 1 : 0);
        return true;
    }
}
