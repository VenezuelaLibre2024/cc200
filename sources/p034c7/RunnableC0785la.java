package p034c7;

import android.os.RemoteException;
import p108h6.C2394s;

/* renamed from: c7.la */
/* loaded from: classes.dex */
public final class RunnableC0785la implements Runnable {

    /* renamed from: h */
    public final /* synthetic */ C0871rc f3283h;

    /* renamed from: i */
    public final /* synthetic */ C0966y9 f3284i;

    public RunnableC0785la(C0966y9 c0966y9, C0871rc c0871rc) {
        this.f3283h = c0871rc;
        this.f3284i = c0966y9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0821o4 interfaceC0821o4;
        interfaceC0821o4 = this.f3284i.f3778d;
        if (interfaceC0821o4 == null) {
            this.f3284i.zzj().m3914B().m3995a("Failed to send consent settings to service");
            return;
        }
        try {
            C2394s.m9619l(this.f3283h);
            interfaceC0821o4.mo3669q0(this.f3283h);
            this.f3284i.m4042c0();
        } catch (RemoteException e10) {
            this.f3284i.zzj().m3914B().m3996b("Failed to send consent settings to the service", e10);
        }
    }
}
