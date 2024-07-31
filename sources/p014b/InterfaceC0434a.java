package p014b;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: b.a */
/* loaded from: classes.dex */
public interface InterfaceC0434a extends IInterface {

    /* renamed from: b.a$a */
    /* loaded from: classes.dex */
    public static abstract class a extends Binder implements InterfaceC0434a {
        public a() {
            attachInterface(this, "android.support.customtabs.ICustomTabsCallback");
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        /* JADX WARN: Failed to find 'out' block for switch in B:8:0x0012. Please report as an issue. */
        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
            }
            if (i10 == 1598968902) {
                parcel2.writeString("android.support.customtabs.ICustomTabsCallback");
                return true;
            }
            switch (i10) {
                case 2:
                    mo2236c1(parcel.readInt(), (Bundle) b.m2241c(parcel, Bundle.CREATOR));
                    return true;
                case 3:
                    mo2234R0(parcel.readString(), (Bundle) b.m2241c(parcel, Bundle.CREATOR));
                    return true;
                case 4:
                    mo2238y1((Bundle) b.m2241c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 5:
                    mo2237r1(parcel.readString(), (Bundle) b.m2241c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 6:
                    mo2232B1(parcel.readInt(), (Uri) b.m2241c(parcel, Uri.CREATOR), parcel.readInt() != 0, (Bundle) b.m2241c(parcel, Bundle.CREATOR));
                    return true;
                case 7:
                    Bundle mo2235X = mo2235X(parcel.readString(), (Bundle) b.m2241c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    b.m2242d(parcel2, mo2235X, 1);
                    return true;
                case 8:
                    mo2233D0(parcel.readInt(), parcel.readInt(), (Bundle) b.m2241c(parcel, Bundle.CREATOR));
                    return true;
                default:
                    return super.onTransact(i10, parcel, parcel2, i11);
            }
        }
    }

    /* renamed from: b.a$b */
    /* loaded from: classes.dex */
    public static class b {
        /* renamed from: c */
        public static <T> T m2241c(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* renamed from: d */
        public static <T extends Parcelable> void m2242d(Parcel parcel, T t10, int i10) {
            if (t10 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                t10.writeToParcel(parcel, i10);
            }
        }
    }

    /* renamed from: B1 */
    void mo2232B1(int i10, Uri uri, boolean z10, Bundle bundle);

    /* renamed from: D0 */
    void mo2233D0(int i10, int i11, Bundle bundle);

    /* renamed from: R0 */
    void mo2234R0(String str, Bundle bundle);

    /* renamed from: X */
    Bundle mo2235X(String str, Bundle bundle);

    /* renamed from: c1 */
    void mo2236c1(int i10, Bundle bundle);

    /* renamed from: r1 */
    void mo2237r1(String str, Bundle bundle);

    /* renamed from: y1 */
    void mo2238y1(Bundle bundle);
}
