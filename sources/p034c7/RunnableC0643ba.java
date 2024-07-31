package p034c7;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;
import p108h6.C2394s;

/* renamed from: c7.ba */
/* loaded from: classes.dex */
public final class RunnableC0643ba implements Runnable {

    /* renamed from: h */
    public final /* synthetic */ AtomicReference f2793h;

    /* renamed from: i */
    public final /* synthetic */ C0871rc f2794i;

    /* renamed from: j */
    public final /* synthetic */ Bundle f2795j;

    /* renamed from: k */
    public final /* synthetic */ C0966y9 f2796k;

    public RunnableC0643ba(C0966y9 c0966y9, AtomicReference atomicReference, C0871rc c0871rc, Bundle bundle) {
        this.f2793h = atomicReference;
        this.f2794i = c0871rc;
        this.f2795j = bundle;
        this.f2796k = c0966y9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        InterfaceC0821o4 interfaceC0821o4;
        synchronized (this.f2793h) {
            try {
                try {
                    interfaceC0821o4 = this.f2796k.f3778d;
                } finally {
                    this.f2793h.notify();
                }
            } catch (RemoteException e10) {
                this.f2796k.zzj().m3914B().m3996b("Failed to get trigger URIs; remote exception", e10);
                atomicReference = this.f2793h;
            }
            if (interfaceC0821o4 == null) {
                this.f2796k.zzj().m3914B().m3995a("Failed to get trigger URIs; not connected to service");
                return;
            }
            C2394s.m9619l(this.f2794i);
            this.f2793h.set(interfaceC0821o4.mo3663j(this.f2794i, this.f2795j));
            this.f2796k.m4042c0();
            atomicReference = this.f2793h;
            atomicReference.notify();
        }
    }
}
