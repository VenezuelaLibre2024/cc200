package p034c7;

/* renamed from: c7.wa */
/* loaded from: classes.dex */
public final class RunnableC0939wa implements Runnable {

    /* renamed from: h */
    public final /* synthetic */ InterfaceC0821o4 f3718h;

    /* renamed from: i */
    public final /* synthetic */ ServiceConnectionC0869ra f3719i;

    public RunnableC0939wa(ServiceConnectionC0869ra serviceConnectionC0869ra, InterfaceC0821o4 interfaceC0821o4) {
        this.f3718h = interfaceC0821o4;
        this.f3719i = serviceConnectionC0869ra;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f3719i) {
            this.f3719i.f3517h = false;
            if (!this.f3719i.f3519j.m4037X()) {
                this.f3719i.f3519j.zzj().m3913A().m3995a("Connected to remote service");
                this.f3719i.f3519j.m4016A(this.f3718h);
            }
        }
    }
}
