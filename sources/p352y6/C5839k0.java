package p352y6;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.maps.zza;
import com.google.android.gms.internal.maps.zzc;
import p252r6.InterfaceC4307b;

/* renamed from: y6.k0 */
/* loaded from: classes.dex */
public final class C5839k0 extends zza implements InterfaceC5822c {
    public C5839k0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IMapViewDelegate");
    }

    @Override // p352y6.InterfaceC5822c
    public final InterfaceC4307b getView() {
        Parcel zzJ = zzJ(8, zza());
        InterfaceC4307b m16570c = InterfaceC4307b.a.m16570c(zzJ.readStrongBinder());
        zzJ.recycle();
        return m16570c;
    }

    @Override // p352y6.InterfaceC5822c
    /* renamed from: h1 */
    public final void mo23425h1(InterfaceC5848p interfaceC5848p) {
        Parcel zza = zza();
        zzc.zze(zza, interfaceC5848p);
        zzc(9, zza);
    }

    @Override // p352y6.InterfaceC5822c
    public final void onCreate(Bundle bundle) {
        Parcel zza = zza();
        zzc.zzd(zza, bundle);
        zzc(2, zza);
    }

    @Override // p352y6.InterfaceC5822c
    public final void onDestroy() {
        zzc(5, zza());
    }

    @Override // p352y6.InterfaceC5822c
    public final void onResume() {
        zzc(3, zza());
    }

    @Override // p352y6.InterfaceC5822c
    public final void onSaveInstanceState(Bundle bundle) {
        Parcel zza = zza();
        zzc.zzd(zza, bundle);
        Parcel zzJ = zzJ(7, zza);
        if (zzJ.readInt() != 0) {
            bundle.readFromParcel(zzJ);
        }
        zzJ.recycle();
    }

    @Override // p352y6.InterfaceC5822c
    public final void onStart() {
        zzc(12, zza());
    }

    @Override // p352y6.InterfaceC5822c
    public final void onStop() {
        zzc(13, zza());
    }
}
