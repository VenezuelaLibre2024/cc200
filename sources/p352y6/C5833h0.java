package p352y6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.maps.zza;
import com.google.android.gms.internal.maps.zzac;
import com.google.android.gms.internal.maps.zzad;
import com.google.android.gms.internal.maps.zzaf;
import com.google.android.gms.internal.maps.zzag;
import com.google.android.gms.internal.maps.zzai;
import com.google.android.gms.internal.maps.zzaj;
import com.google.android.gms.internal.maps.zzal;
import com.google.android.gms.internal.maps.zzam;
import com.google.android.gms.internal.maps.zzc;
import com.google.android.gms.internal.maps.zzk;
import com.google.android.gms.internal.maps.zzl;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLngBounds;
import p252r6.InterfaceC4307b;
import p367z6.C6001c0;
import p367z6.C6008g;
import p367z6.C6018l;
import p367z6.C6022n;
import p367z6.C6030r;
import p367z6.C6034t;

/* renamed from: y6.h0 */
/* loaded from: classes.dex */
public final class C5833h0 extends zza implements InterfaceC5820b {
    public C5833h0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IGoogleMapDelegate");
    }

    @Override // p352y6.InterfaceC5820b
    /* renamed from: A */
    public final void mo23391A(InterfaceC5843m0 interfaceC5843m0) {
        Parcel zza = zza();
        zzc.zze(zza, interfaceC5843m0);
        zzc(99, zza);
    }

    @Override // p352y6.InterfaceC5820b
    /* renamed from: C */
    public final void mo23392C(InterfaceC4307b interfaceC4307b) {
        Parcel zza = zza();
        zzc.zze(zza, interfaceC4307b);
        zzc(4, zza);
    }

    @Override // p352y6.InterfaceC5820b
    /* renamed from: D1 */
    public final void mo23393D1(InterfaceC5844n interfaceC5844n) {
        Parcel zza = zza();
        zzc.zze(zza, interfaceC5844n);
        zzc(29, zza);
    }

    @Override // p352y6.InterfaceC5820b
    /* renamed from: F0 */
    public final void mo23394F0() {
        zzc(94, zza());
    }

    @Override // p352y6.InterfaceC5820b
    /* renamed from: F1 */
    public final void mo23395F1(InterfaceC5852r interfaceC5852r) {
        Parcel zza = zza();
        zzc.zze(zza, interfaceC5852r);
        zzc(30, zza);
    }

    @Override // p352y6.InterfaceC5820b
    /* renamed from: G */
    public final void mo23396G(int i10, int i11, int i12, int i13) {
        Parcel zza = zza();
        zza.writeInt(i10);
        zza.writeInt(i11);
        zza.writeInt(i12);
        zza.writeInt(i13);
        zzc(39, zza);
    }

    @Override // p352y6.InterfaceC5820b
    /* renamed from: G0 */
    public final zzag mo23397G0(C6030r c6030r) {
        Parcel zza = zza();
        zzc.zzd(zza, c6030r);
        Parcel zzJ = zzJ(10, zza);
        zzag zzb = zzaf.zzb(zzJ.readStrongBinder());
        zzJ.recycle();
        return zzb;
    }

    @Override // p352y6.InterfaceC5820b
    /* renamed from: H */
    public final zzl mo23398H(C6008g c6008g) {
        Parcel zza = zza();
        zzc.zzd(zza, c6008g);
        Parcel zzJ = zzJ(35, zza);
        zzl zzb = zzk.zzb(zzJ.readStrongBinder());
        zzJ.recycle();
        return zzb;
    }

    @Override // p352y6.InterfaceC5820b
    /* renamed from: I */
    public final void mo23399I(InterfaceC5837j0 interfaceC5837j0) {
        Parcel zza = zza();
        zzc.zze(zza, interfaceC5837j0);
        zzc(33, zza);
    }

    @Override // p352y6.InterfaceC5820b
    /* renamed from: I1 */
    public final void mo23400I1(InterfaceC5856t interfaceC5856t) {
        Parcel zza = zza();
        zzc.zze(zza, interfaceC5856t);
        zzc(31, zza);
    }

    @Override // p352y6.InterfaceC5820b
    /* renamed from: J1 */
    public final void mo23401J1(InterfaceC5859w interfaceC5859w) {
        Parcel zza = zza();
        zzc.zze(zza, interfaceC5859w);
        zzc(85, zza);
    }

    @Override // p352y6.InterfaceC5820b
    /* renamed from: O0 */
    public final InterfaceC5826e mo23402O0() {
        InterfaceC5826e c5823c0;
        Parcel zzJ = zzJ(25, zza());
        IBinder readStrongBinder = zzJ.readStrongBinder();
        if (readStrongBinder == null) {
            c5823c0 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
            c5823c0 = queryLocalInterface instanceof InterfaceC5826e ? (InterfaceC5826e) queryLocalInterface : new C5823c0(readStrongBinder);
        }
        zzJ.recycle();
        return c5823c0;
    }

    @Override // p352y6.InterfaceC5820b
    /* renamed from: P0 */
    public final void mo23403P0(InterfaceC5836j interfaceC5836j) {
        Parcel zza = zza();
        zzc.zze(zza, interfaceC5836j);
        zzc(84, zza);
    }

    @Override // p352y6.InterfaceC5820b
    /* renamed from: S0 */
    public final boolean mo23404S0() {
        Parcel zzJ = zzJ(40, zza());
        boolean zzf = zzc.zzf(zzJ);
        zzJ.recycle();
        return zzf;
    }

    @Override // p352y6.InterfaceC5820b
    /* renamed from: T0 */
    public final void mo23405T0(InterfaceC5861y interfaceC5861y) {
        Parcel zza = zza();
        zzc.zze(zza, interfaceC5861y);
        zzc(87, zza);
    }

    @Override // p352y6.InterfaceC5820b
    /* renamed from: U */
    public final CameraPosition mo23406U() {
        Parcel zzJ = zzJ(1, zza());
        CameraPosition cameraPosition = (CameraPosition) zzc.zza(zzJ, CameraPosition.CREATOR);
        zzJ.recycle();
        return cameraPosition;
    }

    @Override // p352y6.InterfaceC5820b
    /* renamed from: U0 */
    public final void mo23407U0(InterfaceC4307b interfaceC4307b) {
        Parcel zza = zza();
        zzc.zze(zza, interfaceC4307b);
        zzc(5, zza);
    }

    @Override // p352y6.InterfaceC5820b
    /* renamed from: X0 */
    public final zzaj mo23408X0(C6034t c6034t) {
        Parcel zza = zza();
        zzc.zzd(zza, c6034t);
        Parcel zzJ = zzJ(9, zza);
        zzaj zzb = zzai.zzb(zzJ.readStrongBinder());
        zzJ.recycle();
        return zzb;
    }

    @Override // p352y6.InterfaceC5820b
    /* renamed from: a0 */
    public final boolean mo23409a0(C6018l c6018l) {
        Parcel zza = zza();
        zzc.zzd(zza, c6018l);
        Parcel zzJ = zzJ(91, zza);
        boolean zzf = zzc.zzf(zzJ);
        zzJ.recycle();
        return zzf;
    }

    @Override // p352y6.InterfaceC5820b
    /* renamed from: b1 */
    public final InterfaceC5824d mo23410b1() {
        InterfaceC5824d c5862z;
        Parcel zzJ = zzJ(26, zza());
        IBinder readStrongBinder = zzJ.readStrongBinder();
        if (readStrongBinder == null) {
            c5862z = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IProjectionDelegate");
            c5862z = queryLocalInterface instanceof InterfaceC5824d ? (InterfaceC5824d) queryLocalInterface : new C5862z(readStrongBinder);
        }
        zzJ.recycle();
        return c5862z;
    }

    @Override // p352y6.InterfaceC5820b
    /* renamed from: d1 */
    public final void mo23411d1(InterfaceC5840l interfaceC5840l) {
        Parcel zza = zza();
        zzc.zze(zza, interfaceC5840l);
        zzc(28, zza);
    }

    @Override // p352y6.InterfaceC5820b
    /* renamed from: f1 */
    public final void mo23412f1(InterfaceC5821b0 interfaceC5821b0, InterfaceC4307b interfaceC4307b) {
        Parcel zza = zza();
        zzc.zze(zza, interfaceC5821b0);
        zzc.zze(zza, interfaceC4307b);
        zzc(38, zza);
    }

    @Override // p352y6.InterfaceC5820b
    /* renamed from: j1 */
    public final void mo23413j1(InterfaceC5851q0 interfaceC5851q0) {
        Parcel zza = zza();
        zzc.zze(zza, interfaceC5851q0);
        zzc(96, zza);
    }

    @Override // p352y6.InterfaceC5820b
    /* renamed from: l0 */
    public final boolean mo23414l0() {
        Parcel zzJ = zzJ(17, zza());
        boolean zzf = zzc.zzf(zzJ);
        zzJ.recycle();
        return zzf;
    }

    @Override // p352y6.InterfaceC5820b
    /* renamed from: m */
    public final float mo23415m() {
        Parcel zzJ = zzJ(3, zza());
        float readFloat = zzJ.readFloat();
        zzJ.recycle();
        return readFloat;
    }

    @Override // p352y6.InterfaceC5820b
    /* renamed from: o */
    public final void mo23416o(InterfaceC5855s0 interfaceC5855s0) {
        Parcel zza = zza();
        zzc.zze(zza, interfaceC5855s0);
        zzc(89, zza);
    }

    @Override // p352y6.InterfaceC5820b
    /* renamed from: o0 */
    public final void mo23417o0(float f10) {
        Parcel zza = zza();
        zza.writeFloat(f10);
        zzc(93, zza);
    }

    @Override // p352y6.InterfaceC5820b
    /* renamed from: p */
    public final void mo23418p(InterfaceC5832h interfaceC5832h) {
        Parcel zza = zza();
        zzc.zze(zza, interfaceC5832h);
        zzc(32, zza);
    }

    @Override // p352y6.InterfaceC5820b
    /* renamed from: p1 */
    public final zzad mo23419p1(C6022n c6022n) {
        Parcel zza = zza();
        zzc.zzd(zza, c6022n);
        Parcel zzJ = zzJ(11, zza);
        zzad zzb = zzac.zzb(zzJ.readStrongBinder());
        zzJ.recycle();
        return zzb;
    }

    @Override // p352y6.InterfaceC5820b
    /* renamed from: q1 */
    public final float mo23420q1() {
        Parcel zzJ = zzJ(2, zza());
        float readFloat = zzJ.readFloat();
        zzJ.recycle();
        return readFloat;
    }

    @Override // p352y6.InterfaceC5820b
    /* renamed from: r */
    public final zzam mo23421r(C6001c0 c6001c0) {
        Parcel zza = zza();
        zzc.zzd(zza, c6001c0);
        Parcel zzJ = zzJ(13, zza);
        zzam zzb = zzal.zzb(zzJ.readStrongBinder());
        zzJ.recycle();
        return zzb;
    }

    @Override // p352y6.InterfaceC5820b
    /* renamed from: s */
    public final void mo23422s(LatLngBounds latLngBounds) {
        Parcel zza = zza();
        zzc.zzd(zza, latLngBounds);
        zzc(95, zza);
    }

    @Override // p352y6.InterfaceC5820b
    public final void setBuildingsEnabled(boolean z10) {
        Parcel zza = zza();
        int i10 = zzc.zza;
        zza.writeInt(z10 ? 1 : 0);
        zzc(41, zza);
    }

    @Override // p352y6.InterfaceC5820b
    public final boolean setIndoorEnabled(boolean z10) {
        Parcel zza = zza();
        int i10 = zzc.zza;
        zza.writeInt(z10 ? 1 : 0);
        Parcel zzJ = zzJ(20, zza);
        boolean zzf = zzc.zzf(zzJ);
        zzJ.recycle();
        return zzf;
    }

    @Override // p352y6.InterfaceC5820b
    public final void setMapType(int i10) {
        Parcel zza = zza();
        zza.writeInt(i10);
        zzc(16, zza);
    }

    @Override // p352y6.InterfaceC5820b
    public final void setMyLocationEnabled(boolean z10) {
        Parcel zza = zza();
        int i10 = zzc.zza;
        zza.writeInt(z10 ? 1 : 0);
        zzc(22, zza);
    }

    @Override // p352y6.InterfaceC5820b
    public final void setTrafficEnabled(boolean z10) {
        Parcel zza = zza();
        int i10 = zzc.zza;
        zza.writeInt(z10 ? 1 : 0);
        zzc(18, zza);
    }

    @Override // p352y6.InterfaceC5820b
    /* renamed from: v0 */
    public final void mo23423v0(float f10) {
        Parcel zza = zza();
        zza.writeFloat(f10);
        zzc(92, zza);
    }

    @Override // p352y6.InterfaceC5820b
    /* renamed from: v1 */
    public final void mo23424v1(InterfaceC5847o0 interfaceC5847o0) {
        Parcel zza = zza();
        zzc.zze(zza, interfaceC5847o0);
        zzc(97, zza);
    }
}
