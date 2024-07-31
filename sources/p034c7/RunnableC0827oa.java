package p034c7;

import android.os.RemoteException;
import android.text.TextUtils;
import p108h6.C2394s;

/* renamed from: c7.oa */
/* loaded from: classes.dex */
public final class RunnableC0827oa implements Runnable {

    /* renamed from: h */
    public final /* synthetic */ boolean f3410h;

    /* renamed from: i */
    public final /* synthetic */ C0871rc f3411i;

    /* renamed from: j */
    public final /* synthetic */ boolean f3412j;

    /* renamed from: k */
    public final /* synthetic */ C0705g0 f3413k;

    /* renamed from: l */
    public final /* synthetic */ String f3414l;

    /* renamed from: m */
    public final /* synthetic */ C0966y9 f3415m;

    public RunnableC0827oa(C0966y9 c0966y9, boolean z10, C0871rc c0871rc, boolean z11, C0705g0 c0705g0, String str) {
        this.f3410h = z10;
        this.f3411i = c0871rc;
        this.f3412j = z11;
        this.f3413k = c0705g0;
        this.f3414l = str;
        this.f3415m = c0966y9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0821o4 interfaceC0821o4;
        interfaceC0821o4 = this.f3415m.f3778d;
        if (interfaceC0821o4 == null) {
            this.f3415m.zzj().m3914B().m3995a("Discarding data. Failed to send event to service");
            return;
        }
        if (this.f3410h) {
            C2394s.m9619l(this.f3411i);
            this.f3415m.m4017B(interfaceC0821o4, this.f3412j ? null : this.f3413k, this.f3411i);
        } else {
            try {
                if (TextUtils.isEmpty(this.f3414l)) {
                    C2394s.m9619l(this.f3411i);
                    interfaceC0821o4.mo3662i1(this.f3413k, this.f3411i);
                } else {
                    interfaceC0821o4.mo3658f0(this.f3413k, this.f3414l, this.f3415m.zzj().m3922J());
                }
            } catch (RemoteException e10) {
                this.f3415m.zzj().m3914B().m3996b("Failed to send event to the service", e10);
            }
        }
        this.f3415m.m4042c0();
    }
}
