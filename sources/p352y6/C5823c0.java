package p352y6;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.maps.zza;
import com.google.android.gms.internal.maps.zzc;

/* renamed from: y6.c0 */
/* loaded from: classes.dex */
public final class C5823c0 extends zza implements InterfaceC5826e {
    public C5823c0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IUiSettingsDelegate");
    }

    @Override // p352y6.InterfaceC5826e
    /* renamed from: A1 */
    public final boolean mo23426A1() {
        Parcel zzJ = zzJ(9, zza());
        boolean zzf = zzc.zzf(zzJ);
        zzJ.recycle();
        return zzf;
    }

    @Override // p352y6.InterfaceC5826e
    /* renamed from: M */
    public final boolean mo23427M() {
        Parcel zzJ = zzJ(14, zza());
        boolean zzf = zzc.zzf(zzJ);
        zzJ.recycle();
        return zzf;
    }

    @Override // p352y6.InterfaceC5826e
    /* renamed from: N */
    public final boolean mo23428N() {
        Parcel zzJ = zzJ(13, zza());
        boolean zzf = zzc.zzf(zzJ);
        zzJ.recycle();
        return zzf;
    }

    @Override // p352y6.InterfaceC5826e
    /* renamed from: b0 */
    public final boolean mo23429b0() {
        Parcel zzJ = zzJ(10, zza());
        boolean zzf = zzc.zzf(zzJ);
        zzJ.recycle();
        return zzf;
    }

    @Override // p352y6.InterfaceC5826e
    /* renamed from: c0 */
    public final boolean mo23430c0() {
        Parcel zzJ = zzJ(11, zza());
        boolean zzf = zzc.zzf(zzJ);
        zzJ.recycle();
        return zzf;
    }

    @Override // p352y6.InterfaceC5826e
    /* renamed from: m1 */
    public final boolean mo23431m1() {
        Parcel zzJ = zzJ(12, zza());
        boolean zzf = zzc.zzf(zzJ);
        zzJ.recycle();
        return zzf;
    }

    @Override // p352y6.InterfaceC5826e
    public final void setCompassEnabled(boolean z10) {
        Parcel zza = zza();
        int i10 = zzc.zza;
        zza.writeInt(z10 ? 1 : 0);
        zzc(2, zza);
    }

    @Override // p352y6.InterfaceC5826e
    public final void setMapToolbarEnabled(boolean z10) {
        Parcel zza = zza();
        int i10 = zzc.zza;
        zza.writeInt(z10 ? 1 : 0);
        zzc(18, zza);
    }

    @Override // p352y6.InterfaceC5826e
    public final void setMyLocationButtonEnabled(boolean z10) {
        Parcel zza = zza();
        int i10 = zzc.zza;
        zza.writeInt(z10 ? 1 : 0);
        zzc(3, zza);
    }

    @Override // p352y6.InterfaceC5826e
    public final void setRotateGesturesEnabled(boolean z10) {
        Parcel zza = zza();
        int i10 = zzc.zza;
        zza.writeInt(z10 ? 1 : 0);
        zzc(7, zza);
    }

    @Override // p352y6.InterfaceC5826e
    public final void setScrollGesturesEnabled(boolean z10) {
        Parcel zza = zza();
        int i10 = zzc.zza;
        zza.writeInt(z10 ? 1 : 0);
        zzc(4, zza);
    }

    @Override // p352y6.InterfaceC5826e
    public final void setTiltGesturesEnabled(boolean z10) {
        Parcel zza = zza();
        int i10 = zzc.zza;
        zza.writeInt(z10 ? 1 : 0);
        zzc(6, zza);
    }

    @Override // p352y6.InterfaceC5826e
    public final void setZoomControlsEnabled(boolean z10) {
        Parcel zza = zza();
        int i10 = zzc.zza;
        zza.writeInt(z10 ? 1 : 0);
        zzc(1, zza);
    }

    @Override // p352y6.InterfaceC5826e
    public final void setZoomGesturesEnabled(boolean z10) {
        Parcel zza = zza();
        int i10 = zzc.zza;
        zza.writeInt(z10 ? 1 : 0);
        zzc(5, zza);
    }

    @Override // p352y6.InterfaceC5826e
    /* renamed from: y0 */
    public final boolean mo23432y0() {
        Parcel zzJ = zzJ(19, zza());
        boolean zzf = zzc.zzf(zzJ);
        zzJ.recycle();
        return zzf;
    }

    @Override // p352y6.InterfaceC5826e
    /* renamed from: z */
    public final boolean mo23433z() {
        Parcel zzJ = zzJ(15, zza());
        boolean zzf = zzc.zzf(zzJ);
        zzJ.recycle();
        return zzf;
    }
}
