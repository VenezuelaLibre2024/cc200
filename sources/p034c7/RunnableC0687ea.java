package p034c7;

import android.os.RemoteException;
import p108h6.C2394s;

/* renamed from: c7.ea */
/* loaded from: classes.dex */
public final class RunnableC0687ea implements Runnable {

    /* renamed from: h */
    public final /* synthetic */ C0871rc f2899h;

    /* renamed from: i */
    public final /* synthetic */ C0966y9 f2900i;

    public RunnableC0687ea(C0966y9 c0966y9, C0871rc c0871rc) {
        this.f2899h = c0871rc;
        this.f2900i = c0966y9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0821o4 interfaceC0821o4;
        interfaceC0821o4 = this.f2900i.f3778d;
        if (interfaceC0821o4 == null) {
            this.f2900i.zzj().m3914B().m3995a("Discarding data. Failed to send app launch");
            return;
        }
        try {
            C2394s.m9619l(this.f2899h);
            interfaceC0821o4.mo3656Y(this.f2899h);
            this.f2900i.mo3102l().m3834E();
            this.f2900i.m4017B(interfaceC0821o4, null, this.f2899h);
            this.f2900i.m4042c0();
        } catch (RemoteException e10) {
            this.f2900i.zzj().m3914B().m3996b("Failed to send app launch to the service", e10);
        }
    }
}
