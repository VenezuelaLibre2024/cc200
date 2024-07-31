package p352y6;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.maps.zza;
import com.google.android.gms.internal.maps.zzc;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import p252r6.InterfaceC4307b;

/* renamed from: y6.u */
/* loaded from: classes.dex */
public final class C5857u extends zza implements InterfaceC5818a {
    public C5857u(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
    }

    @Override // p352y6.InterfaceC5818a
    /* renamed from: O */
    public final InterfaceC4307b mo23384O(LatLng latLng) {
        Parcel zza = zza();
        zzc.zzd(zza, latLng);
        Parcel zzJ = zzJ(8, zza);
        InterfaceC4307b m16570c = InterfaceC4307b.a.m16570c(zzJ.readStrongBinder());
        zzJ.recycle();
        return m16570c;
    }

    @Override // p352y6.InterfaceC5818a
    /* renamed from: Q0 */
    public final InterfaceC4307b mo23385Q0(CameraPosition cameraPosition) {
        Parcel zza = zza();
        zzc.zzd(zza, cameraPosition);
        Parcel zzJ = zzJ(7, zza);
        InterfaceC4307b m16570c = InterfaceC4307b.a.m16570c(zzJ.readStrongBinder());
        zzJ.recycle();
        return m16570c;
    }

    @Override // p352y6.InterfaceC5818a
    /* renamed from: h */
    public final InterfaceC4307b mo23386h(LatLngBounds latLngBounds, int i10) {
        Parcel zza = zza();
        zzc.zzd(zza, latLngBounds);
        zza.writeInt(i10);
        Parcel zzJ = zzJ(10, zza);
        InterfaceC4307b m16570c = InterfaceC4307b.a.m16570c(zzJ.readStrongBinder());
        zzJ.recycle();
        return m16570c;
    }

    @Override // p352y6.InterfaceC5818a
    /* renamed from: n1 */
    public final InterfaceC4307b mo23387n1(float f10) {
        Parcel zza = zza();
        zza.writeFloat(f10);
        Parcel zzJ = zzJ(4, zza);
        InterfaceC4307b m16570c = InterfaceC4307b.a.m16570c(zzJ.readStrongBinder());
        zzJ.recycle();
        return m16570c;
    }

    @Override // p352y6.InterfaceC5818a
    /* renamed from: r0 */
    public final InterfaceC4307b mo23388r0(float f10, int i10, int i11) {
        Parcel zza = zza();
        zza.writeFloat(f10);
        zza.writeInt(i10);
        zza.writeInt(i11);
        Parcel zzJ = zzJ(6, zza);
        InterfaceC4307b m16570c = InterfaceC4307b.a.m16570c(zzJ.readStrongBinder());
        zzJ.recycle();
        return m16570c;
    }

    @Override // p352y6.InterfaceC5818a
    /* renamed from: s1 */
    public final InterfaceC4307b mo23389s1(LatLng latLng, float f10) {
        Parcel zza = zza();
        zzc.zzd(zza, latLng);
        zza.writeFloat(f10);
        Parcel zzJ = zzJ(9, zza);
        InterfaceC4307b m16570c = InterfaceC4307b.a.m16570c(zzJ.readStrongBinder());
        zzJ.recycle();
        return m16570c;
    }

    @Override // p352y6.InterfaceC5818a
    /* renamed from: u1 */
    public final InterfaceC4307b mo23390u1(float f10, float f11) {
        Parcel zza = zza();
        zza.writeFloat(f10);
        zza.writeFloat(f11);
        Parcel zzJ = zzJ(3, zza);
        InterfaceC4307b m16570c = InterfaceC4307b.a.m16570c(zzJ.readStrongBinder());
        zzJ.recycle();
        return m16570c;
    }

    @Override // p352y6.InterfaceC5818a
    public final InterfaceC4307b zoomBy(float f10) {
        Parcel zza = zza();
        zza.writeFloat(f10);
        Parcel zzJ = zzJ(5, zza);
        InterfaceC4307b m16570c = InterfaceC4307b.a.m16570c(zzJ.readStrongBinder());
        zzJ.recycle();
        return m16570c;
    }

    @Override // p352y6.InterfaceC5818a
    public final InterfaceC4307b zoomIn() {
        Parcel zzJ = zzJ(1, zza());
        InterfaceC4307b m16570c = InterfaceC4307b.a.m16570c(zzJ.readStrongBinder());
        zzJ.recycle();
        return m16570c;
    }

    @Override // p352y6.InterfaceC5818a
    public final InterfaceC4307b zoomOut() {
        Parcel zzJ = zzJ(2, zza());
        InterfaceC4307b m16570c = InterfaceC4307b.a.m16570c(zzJ.readStrongBinder());
        zzJ.recycle();
        return m16570c;
    }
}
