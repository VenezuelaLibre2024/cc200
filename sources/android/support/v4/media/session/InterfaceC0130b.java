package android.support.v4.media.session;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: android.support.v4.media.session.b */
/* loaded from: classes.dex */
public interface InterfaceC0130b extends IInterface {

    /* renamed from: android.support.v4.media.session.b$a */
    /* loaded from: classes.dex */
    public static abstract class a extends Binder implements InterfaceC0130b {

        /* renamed from: android.support.v4.media.session.b$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C6134a implements InterfaceC0130b {

            /* renamed from: a */
            public IBinder f419a;

            public C6134a(IBinder iBinder) {
                this.f419a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f419a;
            }

            @Override // android.support.v4.media.session.InterfaceC0130b
            /* renamed from: l */
            public void mo557l(InterfaceC0129a interfaceC0129a) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    obtain.writeStrongBinder(interfaceC0129a != null ? interfaceC0129a.asBinder() : null);
                    this.f419a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: c */
        public static InterfaceC0130b m558c(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof InterfaceC0130b)) ? new C6134a(iBinder) : (InterfaceC0130b) queryLocalInterface;
        }
    }

    /* renamed from: l */
    void mo557l(InterfaceC0129a interfaceC0129a);
}
