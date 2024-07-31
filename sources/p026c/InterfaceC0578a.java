package p026c;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: c.a */
/* loaded from: classes.dex */
public interface InterfaceC0578a extends IInterface {

    /* renamed from: d */
    public static final String f2561d = "android$support$v4$app$INotificationSideChannel".replace('$', '.');

    /* renamed from: c.a$a */
    /* loaded from: classes.dex */
    public static abstract class a extends Binder implements InterfaceC0578a {

        /* renamed from: c.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C6145a implements InterfaceC0578a {

            /* renamed from: a */
            public IBinder f2562a;

            public C6145a(IBinder iBinder) {
                this.f2562a = iBinder;
            }

            @Override // p026c.InterfaceC0578a
            /* renamed from: J0 */
            public void mo2928J0(String str, int i10, String str2) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(InterfaceC0578a.f2561d);
                    obtain.writeString(str);
                    obtain.writeInt(i10);
                    obtain.writeString(str2);
                    this.f2562a.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // p026c.InterfaceC0578a
            /* renamed from: P */
            public void mo2929P(String str) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(InterfaceC0578a.f2561d);
                    obtain.writeString(str);
                    this.f2562a.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f2562a;
            }

            @Override // p026c.InterfaceC0578a
            /* renamed from: z1 */
            public void mo2930z1(String str, int i10, String str2, Notification notification) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(InterfaceC0578a.f2561d);
                    obtain.writeString(str);
                    obtain.writeInt(i10);
                    obtain.writeString(str2);
                    b.m2933b(obtain, notification, 0);
                    this.f2562a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        /* renamed from: c */
        public static InterfaceC0578a m2931c(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(InterfaceC0578a.f2561d);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof InterfaceC0578a)) ? new C6145a(iBinder) : (InterfaceC0578a) queryLocalInterface;
        }
    }

    /* renamed from: c.a$b */
    /* loaded from: classes.dex */
    public static class b {
        /* renamed from: b */
        public static <T extends Parcelable> void m2933b(Parcel parcel, T t10, int i10) {
            if (t10 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                t10.writeToParcel(parcel, i10);
            }
        }
    }

    /* renamed from: J0 */
    void mo2928J0(String str, int i10, String str2);

    /* renamed from: P */
    void mo2929P(String str);

    /* renamed from: z1 */
    void mo2930z1(String str, int i10, String str2, Notification notification);
}
