package p034c7;

import android.os.RemoteException;
import p108h6.C2394s;

/* renamed from: c7.da */
/* loaded from: classes.dex */
public final class RunnableC0673da implements Runnable {

    /* renamed from: h */
    public final /* synthetic */ C0871rc f2877h;

    /* renamed from: i */
    public final /* synthetic */ C0966y9 f2878i;

    public RunnableC0673da(C0966y9 c0966y9, C0871rc c0871rc) {
        this.f2877h = c0871rc;
        this.f2878i = c0966y9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0821o4 interfaceC0821o4;
        interfaceC0821o4 = this.f2878i.f3778d;
        if (interfaceC0821o4 == null) {
            this.f2878i.zzj().m3914B().m3995a("Failed to reset data on the service: not connected to service");
            return;
        }
        try {
            C2394s.m9619l(this.f2877h);
            interfaceC0821o4.mo3667p0(this.f2877h);
        } catch (RemoteException e10) {
            this.f2878i.zzj().m3914B().m3996b("Failed to reset data on the service: remote exception", e10);
        }
        this.f2878i.m4042c0();
    }
}
