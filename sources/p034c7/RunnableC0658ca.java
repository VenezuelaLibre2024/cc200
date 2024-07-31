package p034c7;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;
import p108h6.C2394s;

/* renamed from: c7.ca */
/* loaded from: classes.dex */
public final class RunnableC0658ca implements Runnable {

    /* renamed from: h */
    public final /* synthetic */ AtomicReference f2838h;

    /* renamed from: i */
    public final /* synthetic */ C0871rc f2839i;

    /* renamed from: j */
    public final /* synthetic */ C0966y9 f2840j;

    public RunnableC0658ca(C0966y9 c0966y9, AtomicReference atomicReference, C0871rc c0871rc) {
        this.f2838h = atomicReference;
        this.f2839i = c0871rc;
        this.f2840j = c0966y9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        InterfaceC0821o4 interfaceC0821o4;
        synchronized (this.f2838h) {
            try {
                try {
                } finally {
                    this.f2838h.notify();
                }
            } catch (RemoteException e10) {
                this.f2840j.zzj().m3914B().m3996b("Failed to get app instance id", e10);
                atomicReference = this.f2838h;
            }
            if (!this.f2840j.mo3095e().m3410G().m3644y()) {
                this.f2840j.zzj().m3920H().m3995a("Analytics storage consent denied; will not get app instance id");
                this.f2840j.mo3103m().m3955P(null);
                this.f2840j.mo3095e().f3155i.m3674b(null);
                this.f2838h.set(null);
                return;
            }
            interfaceC0821o4 = this.f2840j.f3778d;
            if (interfaceC0821o4 == null) {
                this.f2840j.zzj().m3914B().m3995a("Failed to get app instance id");
                return;
            }
            C2394s.m9619l(this.f2839i);
            this.f2838h.set(interfaceC0821o4.mo3672y(this.f2839i));
            String str = (String) this.f2838h.get();
            if (str != null) {
                this.f2840j.mo3103m().m3955P(str);
                this.f2840j.mo3095e().f3155i.m3674b(str);
            }
            this.f2840j.m4042c0();
            atomicReference = this.f2838h;
            atomicReference.notify();
        }
    }
}
