package p108h6;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.common.zza;
import p252r6.InterfaceC4307b;

/* renamed from: h6.y1 */
/* loaded from: classes.dex */
public final class C2414y1 extends zza implements InterfaceC2407w0 {
    public C2414y1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    @Override // p108h6.InterfaceC2407w0
    public final int zzc() {
        Parcel zzB = zzB(2, zza());
        int readInt = zzB.readInt();
        zzB.recycle();
        return readInt;
    }

    @Override // p108h6.InterfaceC2407w0
    public final InterfaceC4307b zzd() {
        Parcel zzB = zzB(1, zza());
        InterfaceC4307b m16570c = InterfaceC4307b.a.m16570c(zzB.readStrongBinder());
        zzB.recycle();
        return m16570c;
    }
}
