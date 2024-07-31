package p034c7;

/* renamed from: c7.u6 */
/* loaded from: classes.dex */
public final class RunnableC0907u6 implements Runnable {

    /* renamed from: h */
    public final /* synthetic */ C0690f f3626h;

    /* renamed from: i */
    public final /* synthetic */ BinderC0823o6 f3627i;

    public RunnableC0907u6(BinderC0823o6 binderC0823o6, C0690f c0690f) {
        this.f3626h = c0690f;
        this.f3627i = binderC0823o6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0968yb c0968yb;
        C0968yb c0968yb2;
        C0968yb c0968yb3;
        c0968yb = this.f3627i.f3394a;
        c0968yb.m4097k0();
        if (this.f3626h.f2909j.m3529I() == null) {
            c0968yb3 = this.f3627i.f3394a;
            c0968yb3.m4094j(this.f3626h);
        } else {
            c0968yb2 = this.f3627i.f3394a;
            c0968yb2.m4068O(this.f3626h);
        }
    }
}
