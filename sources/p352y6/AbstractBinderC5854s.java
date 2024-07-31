package p352y6;

import android.os.Parcel;
import com.google.android.gms.internal.maps.zzac;
import com.google.android.gms.internal.maps.zzad;
import com.google.android.gms.internal.maps.zzb;
import com.google.android.gms.internal.maps.zzc;

/* renamed from: y6.s */
/* loaded from: classes.dex */
public abstract class AbstractBinderC5854s extends zzb implements InterfaceC5856t {
    public AbstractBinderC5854s() {
        super("com.google.android.gms.maps.internal.IOnMarkerDragListener");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            zzad zzb = zzac.zzb(parcel.readStrongBinder());
            zzc.zzc(parcel);
            mo22701Z0(zzb);
        } else if (i10 == 2) {
            zzad zzb2 = zzac.zzb(parcel.readStrongBinder());
            zzc.zzc(parcel);
            mo22702a(zzb2);
        } else {
            if (i10 != 3) {
                return false;
            }
            zzad zzb3 = zzac.zzb(parcel.readStrongBinder());
            zzc.zzc(parcel);
            mo22703b(zzb3);
        }
        parcel2.writeNoException();
        return true;
    }
}
