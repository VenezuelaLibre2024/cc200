package p352y6;

import android.os.Parcel;
import com.google.android.gms.internal.maps.zzb;
import com.google.android.gms.internal.maps.zzc;

/* renamed from: y6.p0 */
/* loaded from: classes.dex */
public abstract class AbstractBinderC5849p0 extends zzb implements InterfaceC5851q0 {
    public AbstractBinderC5849p0() {
        super("com.google.android.gms.maps.internal.IOnCameraMoveStartedListener");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        int readInt = parcel.readInt();
        zzc.zzc(parcel);
        zzb(readInt);
        parcel2.writeNoException();
        return true;
    }
}
