package p097g7;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: g7.n */
/* loaded from: classes.dex */
public class BinderC2111n extends Binder implements IInterface {
    public BinderC2111n(String str) {
        attachInterface(this, str);
    }

    /* renamed from: a */
    public boolean mo8289a(int i10, Parcel parcel, Parcel parcel2, int i11) {
        throw null;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i10, parcel, parcel2, i11)) {
            return true;
        }
        return mo8289a(i10, parcel, parcel2, i11);
    }
}
