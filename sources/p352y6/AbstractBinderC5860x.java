package p352y6;

import android.os.Parcel;
import com.google.android.gms.internal.maps.zzai;
import com.google.android.gms.internal.maps.zzaj;
import com.google.android.gms.internal.maps.zzb;
import com.google.android.gms.internal.maps.zzc;

/* renamed from: y6.x */
/* loaded from: classes.dex */
public abstract class AbstractBinderC5860x extends zzb implements InterfaceC5861y {
    public AbstractBinderC5860x() {
        super("com.google.android.gms.maps.internal.IOnPolylineClickListener");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        zzaj zzb = zzai.zzb(parcel.readStrongBinder());
        zzc.zzc(parcel);
        mo22710K(zzb);
        parcel2.writeNoException();
        return true;
    }
}
