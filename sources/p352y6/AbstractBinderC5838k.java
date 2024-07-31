package p352y6;

import android.os.Parcel;
import com.google.android.gms.internal.maps.zzb;
import com.google.android.gms.internal.maps.zzc;
import com.google.android.gms.maps.model.LatLng;

/* renamed from: y6.k */
/* loaded from: classes.dex */
public abstract class AbstractBinderC5838k extends zzb implements InterfaceC5840l {
    public AbstractBinderC5838k() {
        super("com.google.android.gms.maps.internal.IOnMapClickListener");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        LatLng latLng = (LatLng) zzc.zza(parcel, LatLng.CREATOR);
        zzc.zzc(parcel);
        mo22614d(latLng);
        parcel2.writeNoException();
        return true;
    }
}
