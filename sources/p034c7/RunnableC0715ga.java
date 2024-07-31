package p034c7;

import android.os.Bundle;
import android.os.RemoteException;
import p108h6.C2394s;

/* renamed from: c7.ga */
/* loaded from: classes.dex */
public final class RunnableC0715ga implements Runnable {

    /* renamed from: h */
    public final /* synthetic */ C0871rc f2996h;

    /* renamed from: i */
    public final /* synthetic */ Bundle f2997i;

    /* renamed from: j */
    public final /* synthetic */ C0966y9 f2998j;

    public RunnableC0715ga(C0966y9 c0966y9, C0871rc c0871rc, Bundle bundle) {
        this.f2996h = c0871rc;
        this.f2997i = bundle;
        this.f2998j = c0966y9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0821o4 interfaceC0821o4;
        interfaceC0821o4 = this.f2998j.f3778d;
        if (interfaceC0821o4 == null) {
            this.f2998j.zzj().m3914B().m3995a("Failed to send default event parameters to service");
            return;
        }
        try {
            C2394s.m9619l(this.f2996h);
            interfaceC0821o4.mo3665l1(this.f2997i, this.f2996h);
        } catch (RemoteException e10) {
            this.f2998j.zzj().m3914B().m3996b("Failed to send default event parameters to service", e10);
        }
    }
}
