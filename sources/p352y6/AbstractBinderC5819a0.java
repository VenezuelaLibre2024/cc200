package p352y6;

import android.graphics.Bitmap;
import android.os.Parcel;
import com.google.android.gms.internal.maps.zzb;
import com.google.android.gms.internal.maps.zzc;
import p252r6.InterfaceC4307b;

/* renamed from: y6.a0 */
/* loaded from: classes.dex */
public abstract class AbstractBinderC5819a0 extends zzb implements InterfaceC5821b0 {
    public AbstractBinderC5819a0() {
        super("com.google.android.gms.maps.internal.ISnapshotReadyCallback");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            Bitmap bitmap = (Bitmap) zzc.zza(parcel, Bitmap.CREATOR);
            zzc.zzc(parcel);
            mo22712V(bitmap);
        } else {
            if (i10 != 2) {
                return false;
            }
            InterfaceC4307b m16570c = InterfaceC4307b.a.m16570c(parcel.readStrongBinder());
            zzc.zzc(parcel);
            mo22711E0(m16570c);
        }
        parcel2.writeNoException();
        return true;
    }
}
