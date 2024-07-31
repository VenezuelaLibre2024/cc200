package p034c7;

import android.os.RemoteException;
import android.text.TextUtils;
import p108h6.C2394s;

/* renamed from: c7.na */
/* loaded from: classes.dex */
public final class RunnableC0813na implements Runnable {

    /* renamed from: h */
    public final /* synthetic */ boolean f3367h = true;

    /* renamed from: i */
    public final /* synthetic */ C0871rc f3368i;

    /* renamed from: j */
    public final /* synthetic */ boolean f3369j;

    /* renamed from: k */
    public final /* synthetic */ C0690f f3370k;

    /* renamed from: l */
    public final /* synthetic */ C0690f f3371l;

    /* renamed from: m */
    public final /* synthetic */ C0966y9 f3372m;

    public RunnableC0813na(C0966y9 c0966y9, boolean z10, C0871rc c0871rc, boolean z11, C0690f c0690f, C0690f c0690f2) {
        this.f3368i = c0871rc;
        this.f3369j = z11;
        this.f3370k = c0690f;
        this.f3371l = c0690f2;
        this.f3372m = c0966y9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0821o4 interfaceC0821o4;
        interfaceC0821o4 = this.f3372m.f3778d;
        if (interfaceC0821o4 == null) {
            this.f3372m.zzj().m3914B().m3995a("Discarding data. Failed to send conditional user property to service");
            return;
        }
        if (this.f3367h) {
            C2394s.m9619l(this.f3368i);
            this.f3372m.m4017B(interfaceC0821o4, this.f3369j ? null : this.f3370k, this.f3368i);
        } else {
            try {
                if (TextUtils.isEmpty(this.f3371l.f2907h)) {
                    C2394s.m9619l(this.f3368i);
                    interfaceC0821o4.mo3653C0(this.f3370k, this.f3368i);
                } else {
                    interfaceC0821o4.mo3659g0(this.f3370k);
                }
            } catch (RemoteException e10) {
                this.f3372m.zzj().m3914B().m3996b("Failed to send conditional user property to the service", e10);
            }
        }
        this.f3372m.m4042c0();
    }
}
