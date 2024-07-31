package p048d6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.Parcel;

/* renamed from: d6.c */
/* loaded from: classes.dex */
public interface InterfaceC1565c extends IInterface {

    /* renamed from: d6.c$a */
    /* loaded from: classes.dex */
    public static class a implements InterfaceC1565c {

        /* renamed from: a */
        public final IBinder f5860a;

        public a(IBinder iBinder) {
            this.f5860a = iBinder;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this.f5860a;
        }

        @Override // p048d6.InterfaceC1565c
        /* renamed from: t */
        public void mo6404t(Message message) {
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken("com.google.android.gms.iid.IMessengerCompat");
            obtain.writeInt(1);
            message.writeToParcel(obtain, 0);
            try {
                this.f5860a.transact(1, obtain, null, 1);
            } finally {
                obtain.recycle();
            }
        }
    }

    /* renamed from: t */
    void mo6404t(Message message);
}
