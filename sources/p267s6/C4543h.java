package p267s6;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.common.zza;
import com.google.android.gms.internal.common.zzc;
import p252r6.InterfaceC4307b;

/* renamed from: s6.h */
/* loaded from: classes.dex */
public final class C4543h extends zza {
    public C4543h(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    /* renamed from: M1 */
    public final InterfaceC4307b m17968M1(InterfaceC4307b interfaceC4307b, String str, int i10, InterfaceC4307b interfaceC4307b2) {
        Parcel zza = zza();
        zzc.zze(zza, interfaceC4307b);
        zza.writeString(str);
        zza.writeInt(i10);
        zzc.zze(zza, interfaceC4307b2);
        Parcel zzB = zzB(8, zza);
        InterfaceC4307b m16570c = InterfaceC4307b.a.m16570c(zzB.readStrongBinder());
        zzB.recycle();
        return m16570c;
    }

    /* renamed from: N1 */
    public final InterfaceC4307b m17969N1(InterfaceC4307b interfaceC4307b, String str, int i10) {
        Parcel zza = zza();
        zzc.zze(zza, interfaceC4307b);
        zza.writeString(str);
        zza.writeInt(i10);
        Parcel zzB = zzB(4, zza);
        InterfaceC4307b m16570c = InterfaceC4307b.a.m16570c(zzB.readStrongBinder());
        zzB.recycle();
        return m16570c;
    }

    /* renamed from: O1 */
    public final InterfaceC4307b m17970O1(InterfaceC4307b interfaceC4307b, String str, boolean z10, long j10) {
        Parcel zza = zza();
        zzc.zze(zza, interfaceC4307b);
        zza.writeString(str);
        zza.writeInt(z10 ? 1 : 0);
        zza.writeLong(j10);
        Parcel zzB = zzB(7, zza);
        InterfaceC4307b m16570c = InterfaceC4307b.a.m16570c(zzB.readStrongBinder());
        zzB.recycle();
        return m16570c;
    }

    /* renamed from: c */
    public final int m17971c(InterfaceC4307b interfaceC4307b, String str, boolean z10) {
        Parcel zza = zza();
        zzc.zze(zza, interfaceC4307b);
        zza.writeString(str);
        zza.writeInt(z10 ? 1 : 0);
        Parcel zzB = zzB(3, zza);
        int readInt = zzB.readInt();
        zzB.recycle();
        return readInt;
    }

    /* renamed from: e */
    public final int m17972e(InterfaceC4307b interfaceC4307b, String str, boolean z10) {
        Parcel zza = zza();
        zzc.zze(zza, interfaceC4307b);
        zza.writeString(str);
        zza.writeInt(z10 ? 1 : 0);
        Parcel zzB = zzB(5, zza);
        int readInt = zzB.readInt();
        zzB.recycle();
        return readInt;
    }

    /* renamed from: g */
    public final InterfaceC4307b m17973g(InterfaceC4307b interfaceC4307b, String str, int i10) {
        Parcel zza = zza();
        zzc.zze(zza, interfaceC4307b);
        zza.writeString(str);
        zza.writeInt(i10);
        Parcel zzB = zzB(2, zza);
        InterfaceC4307b m16570c = InterfaceC4307b.a.m16570c(zzB.readStrongBinder());
        zzB.recycle();
        return m16570c;
    }

    public final int zze() {
        Parcel zzB = zzB(6, zza());
        int readInt = zzB.readInt();
        zzB.recycle();
        return readInt;
    }
}
