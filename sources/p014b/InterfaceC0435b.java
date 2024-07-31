package p014b;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: b.b */
/* loaded from: classes.dex */
public interface InterfaceC0435b extends IInterface {

    /* renamed from: b.b$a */
    /* loaded from: classes.dex */
    public static abstract class a extends Binder implements InterfaceC0435b {

        /* renamed from: b.b$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C6144a implements InterfaceC0435b {

            /* renamed from: a */
            public IBinder f2121a;

            public C6144a(IBinder iBinder) {
                this.f2121a = iBinder;
            }

            @Override // p014b.InterfaceC0435b
            /* renamed from: V0 */
            public boolean mo2243V0(InterfaceC0434a interfaceC0434a, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    obtain.writeStrongInterface(interfaceC0434a);
                    b.m2249b(obtain, bundle, 0);
                    this.f2121a.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // p014b.InterfaceC0435b
            /* renamed from: Z */
            public boolean mo2244Z(InterfaceC0434a interfaceC0434a, Uri uri, Bundle bundle, List<Bundle> list) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    obtain.writeStrongInterface(interfaceC0434a);
                    b.m2249b(obtain, uri, 0);
                    b.m2249b(obtain, bundle, 0);
                    obtain.writeTypedList(list);
                    this.f2121a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f2121a;
            }

            @Override // p014b.InterfaceC0435b
            /* renamed from: k0 */
            public boolean mo2245k0(long j10) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    obtain.writeLong(j10);
                    this.f2121a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // p014b.InterfaceC0435b
            /* renamed from: u0 */
            public boolean mo2246u0(InterfaceC0434a interfaceC0434a) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    obtain.writeStrongInterface(interfaceC0434a);
                    this.f2121a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: c */
        public static InterfaceC0435b m2247c(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.customtabs.ICustomTabsService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof InterfaceC0435b)) ? new C6144a(iBinder) : (InterfaceC0435b) queryLocalInterface;
        }
    }

    /* renamed from: b.b$b */
    /* loaded from: classes.dex */
    public static class b {
        /* renamed from: b */
        public static <T extends Parcelable> void m2249b(Parcel parcel, T t10, int i10) {
            if (t10 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                t10.writeToParcel(parcel, i10);
            }
        }
    }

    /* renamed from: V0 */
    boolean mo2243V0(InterfaceC0434a interfaceC0434a, Bundle bundle);

    /* renamed from: Z */
    boolean mo2244Z(InterfaceC0434a interfaceC0434a, Uri uri, Bundle bundle, List<Bundle> list);

    /* renamed from: k0 */
    boolean mo2245k0(long j10);

    /* renamed from: u0 */
    boolean mo2246u0(InterfaceC0434a interfaceC0434a);
}
