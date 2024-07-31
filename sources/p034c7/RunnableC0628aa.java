package p034c7;

import p108h6.C2394s;

/* renamed from: c7.aa */
/* loaded from: classes.dex */
public final class RunnableC0628aa implements Runnable {

    /* renamed from: h */
    public final /* synthetic */ C0871rc f2767h;

    /* renamed from: i */
    public final /* synthetic */ boolean f2768i;

    /* renamed from: j */
    public final /* synthetic */ C0787lc f2769j;

    /* renamed from: k */
    public final /* synthetic */ C0966y9 f2770k;

    public RunnableC0628aa(C0966y9 c0966y9, C0871rc c0871rc, boolean z10, C0787lc c0787lc) {
        this.f2767h = c0871rc;
        this.f2768i = z10;
        this.f2769j = c0787lc;
        this.f2770k = c0966y9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0821o4 interfaceC0821o4;
        interfaceC0821o4 = this.f2770k.f3778d;
        if (interfaceC0821o4 == null) {
            this.f2770k.zzj().m3914B().m3995a("Discarding data. Failed to set user property");
            return;
        }
        C2394s.m9619l(this.f2767h);
        this.f2770k.m4017B(interfaceC0821o4, this.f2768i ? null : this.f2769j, this.f2767h);
        this.f2770k.m4042c0();
    }
}
