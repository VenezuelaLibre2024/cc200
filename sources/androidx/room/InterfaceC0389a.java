package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: androidx.room.a */
/* loaded from: classes.dex */
public interface InterfaceC0389a extends IInterface {

    /* renamed from: androidx.room.a$a */
    /* loaded from: classes.dex */
    public static abstract class a extends Binder implements InterfaceC0389a {

        /* renamed from: androidx.room.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C6141a implements InterfaceC0389a {

            /* renamed from: a */
            public IBinder f1831a;

            public C6141a(IBinder iBinder) {
                this.f1831a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f1831a;
            }

            @Override // androidx.room.InterfaceC0389a
            /* renamed from: x */
            public void mo1963x(String[] strArr) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationCallback");
                    obtain.writeStringArray(strArr);
                    this.f1831a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "androidx.room.IMultiInstanceInvalidationCallback");
        }

        /* renamed from: c */
        public static InterfaceC0389a m1964c(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof InterfaceC0389a)) ? new C6141a(iBinder) : (InterfaceC0389a) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            if (i10 == 1) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationCallback");
                mo1963x(parcel.createStringArray());
                return true;
            }
            if (i10 != 1598968902) {
                return super.onTransact(i10, parcel, parcel2, i11);
            }
            parcel2.writeString("androidx.room.IMultiInstanceInvalidationCallback");
            return true;
        }
    }

    /* renamed from: x */
    void mo1963x(String[] strArr);
}
