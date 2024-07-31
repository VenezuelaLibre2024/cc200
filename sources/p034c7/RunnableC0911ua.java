package p034c7;

/* renamed from: c7.ua */
/* loaded from: classes.dex */
public final class RunnableC0911ua implements Runnable {

    /* renamed from: h */
    public final /* synthetic */ InterfaceC0821o4 f3645h;

    /* renamed from: i */
    public final /* synthetic */ ServiceConnectionC0869ra f3646i;

    public RunnableC0911ua(ServiceConnectionC0869ra serviceConnectionC0869ra, InterfaceC0821o4 interfaceC0821o4) {
        this.f3645h = interfaceC0821o4;
        this.f3646i = serviceConnectionC0869ra;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f3646i) {
            this.f3646i.f3517h = false;
            if (!this.f3646i.f3519j.m4037X()) {
                this.f3646i.f3519j.zzj().m3918F().m3995a("Connected to service");
                this.f3646i.f3519j.m4016A(this.f3645h);
            }
        }
    }
}
