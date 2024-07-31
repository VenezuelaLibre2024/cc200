package p108h6;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.common.zza;
import com.google.android.gms.internal.common.zzc;
import p064e6.C1670c0;
import p064e6.C1674e0;
import p064e6.C1678g0;
import p252r6.InterfaceC4307b;

/* renamed from: h6.z0 */
/* loaded from: classes.dex */
public final class C2416z0 extends zza implements InterfaceC2345b1 {
    public C2416z0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    @Override // p108h6.InterfaceC2345b1
    /* renamed from: N0 */
    public final C1674e0 mo9514N0(C1670c0 c1670c0) {
        Parcel zza = zza();
        zzc.zzc(zza, c1670c0);
        Parcel zzB = zzB(6, zza);
        C1674e0 c1674e0 = (C1674e0) zzc.zza(zzB, C1674e0.CREATOR);
        zzB.recycle();
        return c1674e0;
    }

    @Override // p108h6.InterfaceC2345b1
    /* renamed from: s0 */
    public final C1674e0 mo9515s0(C1670c0 c1670c0) {
        Parcel zza = zza();
        zzc.zzc(zza, c1670c0);
        Parcel zzB = zzB(8, zza);
        C1674e0 c1674e0 = (C1674e0) zzc.zza(zzB, C1674e0.CREATOR);
        zzB.recycle();
        return c1674e0;
    }

    @Override // p108h6.InterfaceC2345b1
    /* renamed from: t1 */
    public final boolean mo9516t1(C1678g0 c1678g0, InterfaceC4307b interfaceC4307b) {
        Parcel zza = zza();
        zzc.zzc(zza, c1678g0);
        zzc.zze(zza, interfaceC4307b);
        Parcel zzB = zzB(5, zza);
        boolean zzf = zzc.zzf(zzB);
        zzB.recycle();
        return zzf;
    }

    @Override // p108h6.InterfaceC2345b1
    public final boolean zzi() {
        Parcel zzB = zzB(7, zza());
        boolean zzf = zzc.zzf(zzB);
        zzB.recycle();
        return zzf;
    }
}
