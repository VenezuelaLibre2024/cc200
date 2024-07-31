package p108h6;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: h6.y0 */
/* loaded from: classes.dex */
public final class C2413y0 implements InterfaceC2379n {

    /* renamed from: a */
    public final IBinder f9729a;

    public C2413y0(IBinder iBinder) {
        this.f9729a = iBinder;
    }

    @Override // p108h6.InterfaceC2379n
    /* renamed from: C1 */
    public final void mo9584C1(InterfaceC2376m interfaceC2376m, C2358g c2358g) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            obtain.writeStrongBinder(interfaceC2376m != null ? interfaceC2376m.asBinder() : null);
            if (c2358g != null) {
                obtain.writeInt(1);
                C2384o1.m9587a(c2358g, obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f9729a.transact(46, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f9729a;
    }
}
