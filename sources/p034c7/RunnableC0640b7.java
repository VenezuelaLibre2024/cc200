package p034c7;

/* renamed from: c7.b7 */
/* loaded from: classes.dex */
public final class RunnableC0640b7 implements Runnable {

    /* renamed from: h */
    public final /* synthetic */ C0705g0 f2787h;

    /* renamed from: i */
    public final /* synthetic */ String f2788i;

    /* renamed from: j */
    public final /* synthetic */ BinderC0823o6 f2789j;

    public RunnableC0640b7(BinderC0823o6 binderC0823o6, C0705g0 c0705g0, String str) {
        this.f2787h = c0705g0;
        this.f2788i = str;
        this.f2789j = binderC0823o6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0968yb c0968yb;
        C0968yb c0968yb2;
        c0968yb = this.f2789j.f3394a;
        c0968yb.m4097k0();
        c0968yb2 = this.f2789j.f3394a;
        c0968yb2.m4100m(this.f2787h, this.f2788i);
    }
}
