package p352y6;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.maps.zza;
import com.google.android.gms.internal.maps.zzc;
import com.google.android.gms.maps.model.LatLng;
import p252r6.InterfaceC4307b;
import p367z6.C6005e0;

/* renamed from: y6.z */
/* loaded from: classes.dex */
public final class C5862z extends zza implements InterfaceC5824d {
    public C5862z(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IProjectionDelegate");
    }

    @Override // p352y6.InterfaceC5824d
    /* renamed from: R */
    public final InterfaceC4307b mo23434R(LatLng latLng) {
        Parcel zza = zza();
        zzc.zzd(zza, latLng);
        Parcel zzJ = zzJ(2, zza);
        InterfaceC4307b m16570c = InterfaceC4307b.a.m16570c(zzJ.readStrongBinder());
        zzJ.recycle();
        return m16570c;
    }

    @Override // p352y6.InterfaceC5824d
    /* renamed from: d0 */
    public final C6005e0 mo23435d0() {
        Parcel zzJ = zzJ(3, zza());
        C6005e0 c6005e0 = (C6005e0) zzc.zza(zzJ, C6005e0.CREATOR);
        zzJ.recycle();
        return c6005e0;
    }

    @Override // p352y6.InterfaceC5824d
    /* renamed from: n0 */
    public final LatLng mo23436n0(InterfaceC4307b interfaceC4307b) {
        Parcel zza = zza();
        zzc.zze(zza, interfaceC4307b);
        Parcel zzJ = zzJ(1, zza);
        LatLng latLng = (LatLng) zzc.zza(zzJ, LatLng.CREATOR);
        zzJ.recycle();
        return latLng;
    }
}
