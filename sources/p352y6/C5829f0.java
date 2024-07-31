package p352y6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.maps.zza;
import com.google.android.gms.internal.maps.zzc;
import com.google.android.gms.internal.maps.zzh;
import com.google.android.gms.internal.maps.zzi;
import com.google.android.gms.maps.GoogleMapOptions;
import p252r6.InterfaceC4307b;

/* renamed from: y6.f0 */
/* loaded from: classes.dex */
public final class C5829f0 extends zza implements InterfaceC5831g0 {
    public C5829f0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.ICreator");
    }

    @Override // p352y6.InterfaceC5831g0
    /* renamed from: L */
    public final InterfaceC5822c mo23448L(InterfaceC4307b interfaceC4307b, GoogleMapOptions googleMapOptions) {
        InterfaceC5822c c5839k0;
        Parcel zza = zza();
        zzc.zze(zza, interfaceC4307b);
        zzc.zzd(zza, googleMapOptions);
        Parcel zzJ = zzJ(3, zza);
        IBinder readStrongBinder = zzJ.readStrongBinder();
        if (readStrongBinder == null) {
            c5839k0 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
            c5839k0 = queryLocalInterface instanceof InterfaceC5822c ? (InterfaceC5822c) queryLocalInterface : new C5839k0(readStrongBinder);
        }
        zzJ.recycle();
        return c5839k0;
    }

    @Override // p352y6.InterfaceC5831g0
    /* renamed from: a1 */
    public final void mo23449a1(InterfaceC4307b interfaceC4307b, int i10) {
        Parcel zza = zza();
        zzc.zze(zza, interfaceC4307b);
        zza.writeInt(18020000);
        zzc(6, zza);
    }

    @Override // p352y6.InterfaceC5831g0
    /* renamed from: e1 */
    public final void mo23450e1(InterfaceC4307b interfaceC4307b) {
        Parcel zza = zza();
        zzc.zze(zza, interfaceC4307b);
        zzc(11, zza);
    }

    @Override // p352y6.InterfaceC5831g0
    /* renamed from: o1 */
    public final void mo23451o1(InterfaceC4307b interfaceC4307b, int i10) {
        Parcel zza = zza();
        zzc.zze(zza, interfaceC4307b);
        zza.writeInt(i10);
        zzc(10, zza);
    }

    @Override // p352y6.InterfaceC5831g0
    public final int zzd() {
        Parcel zzJ = zzJ(9, zza());
        int readInt = zzJ.readInt();
        zzJ.recycle();
        return readInt;
    }

    @Override // p352y6.InterfaceC5831g0
    public final InterfaceC5818a zze() {
        InterfaceC5818a c5857u;
        Parcel zzJ = zzJ(4, zza());
        IBinder readStrongBinder = zzJ.readStrongBinder();
        if (readStrongBinder == null) {
            c5857u = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            c5857u = queryLocalInterface instanceof InterfaceC5818a ? (InterfaceC5818a) queryLocalInterface : new C5857u(readStrongBinder);
        }
        zzJ.recycle();
        return c5857u;
    }

    @Override // p352y6.InterfaceC5831g0
    public final zzi zzj() {
        Parcel zzJ = zzJ(5, zza());
        zzi zzb = zzh.zzb(zzJ.readStrongBinder());
        zzJ.recycle();
        return zzb;
    }
}
