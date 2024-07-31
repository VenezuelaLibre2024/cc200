package p352y6;

import android.os.Parcel;
import com.google.android.gms.internal.maps.zzaf;
import com.google.android.gms.internal.maps.zzag;
import com.google.android.gms.internal.maps.zzb;
import com.google.android.gms.internal.maps.zzc;

/* renamed from: y6.v */
/* loaded from: classes.dex */
public abstract class AbstractBinderC5858v extends zzb implements InterfaceC5859w {
    public AbstractBinderC5858v() {
        super("com.google.android.gms.maps.internal.IOnPolygonClickListener");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        zzag zzb = zzaf.zzb(parcel.readStrongBinder());
        zzc.zzc(parcel);
        mo22709K0(zzb);
        parcel2.writeNoException();
        return true;
    }
}
