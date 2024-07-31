package p041d;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: d.a */
/* loaded from: classes.dex */
public interface InterfaceC1507a extends IInterface {

    /* renamed from: e */
    public static final String f5492e = "android$support$v4$os$IResultReceiver".replace('$', '.');

    /* renamed from: d.a$a */
    /* loaded from: classes.dex */
    public static abstract class a extends Binder implements InterfaceC1507a {

        /* renamed from: d.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C6158a implements InterfaceC1507a {

            /* renamed from: a */
            public IBinder f5493a;

            public C6158a(IBinder iBinder) {
                this.f5493a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f5493a;
            }
        }

        public a() {
            attachInterface(this, InterfaceC1507a.f5492e);
        }

        /* renamed from: c */
        public static InterfaceC1507a m6110c(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(InterfaceC1507a.f5492e);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof InterfaceC1507a)) ? new C6158a(iBinder) : (InterfaceC1507a) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            String str = InterfaceC1507a.f5492e;
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i10 != 1) {
                return super.onTransact(i10, parcel, parcel2, i11);
            }
            mo6109K1(parcel.readInt(), (Bundle) b.m6112b(parcel, Bundle.CREATOR));
            return true;
        }
    }

    /* renamed from: d.a$b */
    /* loaded from: classes.dex */
    public static class b {
        /* renamed from: b */
        public static <T> T m6112b(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }
    }

    /* renamed from: K1 */
    void mo6109K1(int i10, Bundle bundle);
}
