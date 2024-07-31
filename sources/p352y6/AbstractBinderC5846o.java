package p352y6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.maps.zzb;
import com.google.android.gms.internal.maps.zzc;

/* renamed from: y6.o */
/* loaded from: classes.dex */
public abstract class AbstractBinderC5846o extends zzb implements InterfaceC5848p {
    public AbstractBinderC5846o() {
        super("com.google.android.gms.maps.internal.IOnMapReadyCallback");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) {
        InterfaceC5820b c5833h0;
        if (i10 != 1) {
            return false;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder == null) {
            c5833h0 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            c5833h0 = queryLocalInterface instanceof InterfaceC5820b ? (InterfaceC5820b) queryLocalInterface : new C5833h0(readStrongBinder);
        }
        zzc.zzc(parcel);
        mo22697J(c5833h0);
        parcel2.writeNoException();
        return true;
    }
}
