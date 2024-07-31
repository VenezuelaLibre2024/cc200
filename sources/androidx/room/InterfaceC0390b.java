package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.room.InterfaceC0389a;

/* renamed from: androidx.room.b */
/* loaded from: classes.dex */
public interface InterfaceC0390b extends IInterface {

    /* renamed from: androidx.room.b$a */
    /* loaded from: classes.dex */
    public static abstract class a extends Binder implements InterfaceC0390b {

        /* renamed from: androidx.room.b$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C6142a implements InterfaceC0390b {

            /* renamed from: a */
            public IBinder f1832a;

            public C6142a(IBinder iBinder) {
                this.f1832a = iBinder;
            }

            @Override // androidx.room.InterfaceC0390b
            /* renamed from: G1 */
            public void mo1960G1(InterfaceC0389a interfaceC0389a, int i10) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
                    obtain.writeStrongBinder(interfaceC0389a != null ? interfaceC0389a.asBinder() : null);
                    obtain.writeInt(i10);
                    this.f1832a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.room.InterfaceC0390b
            /* renamed from: S */
            public int mo1961S(InterfaceC0389a interfaceC0389a, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
                    obtain.writeStrongBinder(interfaceC0389a != null ? interfaceC0389a.asBinder() : null);
                    obtain.writeString(str);
                    this.f1832a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f1832a;
            }

            @Override // androidx.room.InterfaceC0390b
            /* renamed from: w1 */
            public void mo1962w1(int i10, String[] strArr) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
                    obtain.writeInt(i10);
                    obtain.writeStringArray(strArr);
                    this.f1832a.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "androidx.room.IMultiInstanceInvalidationService");
        }

        /* renamed from: c */
        public static InterfaceC0390b m1965c(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof InterfaceC0390b)) ? new C6142a(iBinder) : (InterfaceC0390b) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            if (i10 == 1) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                int mo1961S = mo1961S(InterfaceC0389a.a.m1964c(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(mo1961S);
                return true;
            }
            if (i10 == 2) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                mo1960G1(InterfaceC0389a.a.m1964c(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                return true;
            }
            if (i10 == 3) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                mo1962w1(parcel.readInt(), parcel.createStringArray());
                return true;
            }
            if (i10 != 1598968902) {
                return super.onTransact(i10, parcel, parcel2, i11);
            }
            parcel2.writeString("androidx.room.IMultiInstanceInvalidationService");
            return true;
        }
    }

    /* renamed from: G1 */
    void mo1960G1(InterfaceC0389a interfaceC0389a, int i10);

    /* renamed from: S */
    int mo1961S(InterfaceC0389a interfaceC0389a, String str);

    /* renamed from: w1 */
    void mo1962w1(int i10, String[] strArr);
}
