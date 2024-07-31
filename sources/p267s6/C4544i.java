package p267s6;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.common.zza;
import com.google.android.gms.internal.common.zzc;
import p252r6.InterfaceC4307b;

/* renamed from: s6.i */
/* loaded from: classes.dex */
public final class C4544i extends zza {
    public C4544i(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    /* renamed from: c */
    public final InterfaceC4307b m17974c(InterfaceC4307b interfaceC4307b, String str, int i10, InterfaceC4307b interfaceC4307b2) {
        Parcel zza = zza();
        zzc.zze(zza, interfaceC4307b);
        zza.writeString(str);
        zza.writeInt(i10);
        zzc.zze(zza, interfaceC4307b2);
        Parcel zzB = zzB(2, zza);
        InterfaceC4307b m16570c = InterfaceC4307b.a.m16570c(zzB.readStrongBinder());
        zzB.recycle();
        return m16570c;
    }

    /* renamed from: e */
    public final InterfaceC4307b m17975e(InterfaceC4307b interfaceC4307b, String str, int i10, InterfaceC4307b interfaceC4307b2) {
        Parcel zza = zza();
        zzc.zze(zza, interfaceC4307b);
        zza.writeString(str);
        zza.writeInt(i10);
        zzc.zze(zza, interfaceC4307b2);
        Parcel zzB = zzB(3, zza);
        InterfaceC4307b m16570c = InterfaceC4307b.a.m16570c(zzB.readStrongBinder());
        zzB.recycle();
        return m16570c;
    }
}
