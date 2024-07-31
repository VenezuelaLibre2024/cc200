package p048d6;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;

/* renamed from: d6.w */
/* loaded from: classes.dex */
public final class C1590w {

    /* renamed from: a */
    public final Messenger f5906a;

    /* renamed from: b */
    public final C1579l f5907b;

    public C1590w(IBinder iBinder) {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (C1589v.m6428a(interfaceDescriptor, "android.os.IMessenger")) {
            this.f5906a = new Messenger(iBinder);
            this.f5907b = null;
        } else {
            if (!C1589v.m6428a(interfaceDescriptor, "com.google.android.gms.iid.IMessengerCompat")) {
                Log.w("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor)));
                throw new RemoteException();
            }
            this.f5907b = new C1579l(iBinder);
            this.f5906a = null;
        }
    }

    /* renamed from: a */
    public final void m6429a(Message message) {
        Messenger messenger = this.f5906a;
        if (messenger != null) {
            messenger.send(message);
            return;
        }
        C1579l c1579l = this.f5907b;
        if (c1579l == null) {
            throw new IllegalStateException("Both messengers are null");
        }
        c1579l.m6420b(message);
    }
}
