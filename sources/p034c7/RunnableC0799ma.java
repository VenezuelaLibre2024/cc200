package p034c7;

import android.os.RemoteException;
import p108h6.C2394s;

/* renamed from: c7.ma */
/* loaded from: classes.dex */
public final class RunnableC0799ma implements Runnable {

    /* renamed from: h */
    public final /* synthetic */ C0871rc f3338h;

    /* renamed from: i */
    public final /* synthetic */ C0966y9 f3339i;

    public RunnableC0799ma(C0966y9 c0966y9, C0871rc c0871rc) {
        this.f3338h = c0871rc;
        this.f3339i = c0966y9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0821o4 interfaceC0821o4;
        interfaceC0821o4 = this.f3339i.f3778d;
        if (interfaceC0821o4 == null) {
            this.f3339i.zzj().m3914B().m3995a("Failed to send measurementEnabled to service");
            return;
        }
        try {
            C2394s.m9619l(this.f3338h);
            interfaceC0821o4.mo3655M0(this.f3338h);
            this.f3339i.m4042c0();
        } catch (RemoteException e10) {
            this.f3339i.zzj().m3914B().m3996b("Failed to send measurementEnabled to the service", e10);
        }
    }
}
