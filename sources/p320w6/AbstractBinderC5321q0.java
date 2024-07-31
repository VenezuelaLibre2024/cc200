package p320w6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.location.zzb;
import com.google.android.gms.internal.location.zzc;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;

/* renamed from: w6.q0 */
/* loaded from: classes.dex */
public abstract class AbstractBinderC5321q0 extends zzb implements InterfaceC5323r0 {
    public AbstractBinderC5321q0() {
        super("com.google.android.gms.location.ILocationCallback");
    }

    public static InterfaceC5323r0 zzb(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
        return queryLocalInterface instanceof InterfaceC5323r0 ? (InterfaceC5323r0) queryLocalInterface : new C5319p0(iBinder);
    }

    @Override // com.google.android.gms.internal.location.zzb
    public final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            LocationResult locationResult = (LocationResult) zzc.zza(parcel, LocationResult.CREATOR);
            zzc.zzb(parcel);
            zze(locationResult);
        } else if (i10 == 2) {
            LocationAvailability locationAvailability = (LocationAvailability) zzc.zza(parcel, LocationAvailability.CREATOR);
            zzc.zzb(parcel);
            zzd(locationAvailability);
        } else {
            if (i10 != 3) {
                return false;
            }
            zzf();
        }
        return true;
    }
}
