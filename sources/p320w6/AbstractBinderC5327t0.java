package p320w6;

import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.location.zzb;
import com.google.android.gms.internal.location.zzc;

/* renamed from: w6.t0 */
/* loaded from: classes.dex */
public abstract class AbstractBinderC5327t0 extends zzb implements InterfaceC5329u0 {
    public AbstractBinderC5327t0() {
        super("com.google.android.gms.location.ILocationListener");
    }

    public static InterfaceC5329u0 zzb(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
        return queryLocalInterface instanceof InterfaceC5329u0 ? (InterfaceC5329u0) queryLocalInterface : new C5325s0(iBinder);
    }

    @Override // com.google.android.gms.internal.location.zzb
    public final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            Location location = (Location) zzc.zza(parcel, Location.CREATOR);
            zzc.zzb(parcel);
            zzd(location);
        } else {
            if (i10 != 2) {
                return false;
            }
            zze();
        }
        return true;
    }
}
