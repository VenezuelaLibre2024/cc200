package p034c7;

/* renamed from: c7.x */
/* loaded from: classes.dex */
public final class RunnableC0942x implements Runnable {

    /* renamed from: h */
    public final /* synthetic */ InterfaceC0782l7 f3722h;

    /* renamed from: i */
    public final /* synthetic */ AbstractC0900u f3723i;

    public RunnableC0942x(AbstractC0900u abstractC0900u, InterfaceC0782l7 interfaceC0782l7) {
        this.f3722h = interfaceC0782l7;
        this.f3723i = abstractC0900u;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f3722h.zzd();
        if (C0647c.m3114a()) {
            this.f3722h.zzl().m3152y(this);
            return;
        }
        boolean m3852e = this.f3723i.m3852e();
        this.f3723i.f3606c = 0L;
        if (m3852e) {
            this.f3723i.mo3524d();
        }
    }
}
