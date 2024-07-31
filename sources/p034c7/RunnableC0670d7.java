package p034c7;

/* renamed from: c7.d7 */
/* loaded from: classes.dex */
public final class RunnableC0670d7 implements Runnable {

    /* renamed from: h */
    public final /* synthetic */ C0787lc f2870h;

    /* renamed from: i */
    public final /* synthetic */ C0871rc f2871i;

    /* renamed from: j */
    public final /* synthetic */ BinderC0823o6 f2872j;

    public RunnableC0670d7(BinderC0823o6 binderC0823o6, C0787lc c0787lc, C0871rc c0871rc) {
        this.f2870h = c0787lc;
        this.f2871i = c0871rc;
        this.f2872j = binderC0823o6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0968yb c0968yb;
        C0968yb c0968yb2;
        C0968yb c0968yb3;
        c0968yb = this.f2872j.f3394a;
        c0968yb.m4097k0();
        if (this.f2870h.m3529I() == null) {
            c0968yb3 = this.f2872j.f3394a;
            c0968yb3.m4116y(this.f2870h.f3289i, this.f2871i);
        } else {
            c0968yb2 = this.f2872j.f3394a;
            c0968yb2.m4105p(this.f2870h, this.f2871i);
        }
    }
}
