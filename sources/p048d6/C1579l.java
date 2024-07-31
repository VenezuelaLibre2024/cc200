package p048d6;

import android.os.Build;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import p048d6.InterfaceC1565c;

/* renamed from: d6.l */
/* loaded from: classes.dex */
public final class C1579l implements Parcelable {
    public static final Parcelable.Creator<C1579l> CREATOR = new C1577j();

    /* renamed from: h */
    public Messenger f5885h;

    /* renamed from: i */
    public InterfaceC1565c f5886i;

    public C1579l(IBinder iBinder) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f5885h = new Messenger(iBinder);
        } else {
            this.f5886i = new InterfaceC1565c.a(iBinder);
        }
    }

    /* renamed from: a */
    public final IBinder m6419a() {
        Messenger messenger = this.f5885h;
        return messenger != null ? messenger.getBinder() : this.f5886i.asBinder();
    }

    /* renamed from: b */
    public final void m6420b(Message message) {
        Messenger messenger = this.f5885h;
        if (messenger != null) {
            messenger.send(message);
        } else {
            this.f5886i.mo6404t(message);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return m6419a().equals(((C1579l) obj).m6419a());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public final int hashCode() {
        return m6419a().hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        Messenger messenger = this.f5885h;
        parcel.writeStrongBinder(messenger != null ? messenger.getBinder() : this.f5886i.asBinder());
    }
}
