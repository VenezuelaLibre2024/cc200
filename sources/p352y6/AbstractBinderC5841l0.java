package p352y6;

import android.os.Parcel;
import com.google.android.gms.internal.maps.zzb;

/* renamed from: y6.l0 */
/* loaded from: classes.dex */
public abstract class AbstractBinderC5841l0 extends zzb implements InterfaceC5843m0 {
    public AbstractBinderC5841l0() {
        super("com.google.android.gms.maps.internal.IOnCameraIdleListener");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        zzb();
        parcel2.writeNoException();
        return true;
    }
}
