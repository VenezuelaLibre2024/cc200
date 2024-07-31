package p097g7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: g7.a */
/* loaded from: classes.dex */
public class C2086a implements IInterface {

    /* renamed from: a */
    public final IBinder f8186a;

    /* renamed from: b */
    public final String f8187b;

    public C2086a(IBinder iBinder, String str) {
        this.f8186a = iBinder;
        this.f8187b = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f8186a;
    }

    /* renamed from: c */
    public final Parcel m8287c() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f8187b);
        return obtain;
    }

    /* renamed from: e */
    public final void m8288e(int i10, Parcel parcel) {
        try {
            this.f8186a.transact(i10, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
