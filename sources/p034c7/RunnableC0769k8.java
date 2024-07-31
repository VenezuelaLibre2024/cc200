package p034c7;

/* renamed from: c7.k8 */
/* loaded from: classes.dex */
public final class RunnableC0769k8 implements Runnable {

    /* renamed from: h */
    public final /* synthetic */ boolean f3250h;

    /* renamed from: i */
    public final /* synthetic */ C0936w7 f3251i;

    public RunnableC0769k8(C0936w7 c0936w7, boolean z10) {
        this.f3250h = z10;
        this.f3251i = c0936w7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean m3503k = this.f3251i.f3198a.m3503k();
        boolean m3502j = this.f3251i.f3198a.m3502j();
        this.f3251i.f3198a.m3500h(this.f3250h);
        if (m3502j == this.f3250h) {
            this.f3251i.f3198a.zzj().m3918F().m3996b("Default data collection state already set to", Boolean.valueOf(this.f3250h));
        }
        if (this.f3251i.f3198a.m3503k() == m3503k || this.f3251i.f3198a.m3503k() != this.f3251i.f3198a.m3502j()) {
            this.f3251i.f3198a.zzj().m3920H().m3997c("Default data collection is different than actual status", Boolean.valueOf(this.f3250h), Boolean.valueOf(m3503k));
        }
        this.f3251i.m3983r0();
    }
}
