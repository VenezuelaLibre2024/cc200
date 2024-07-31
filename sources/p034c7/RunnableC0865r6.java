package p034c7;

/* renamed from: c7.r6 */
/* loaded from: classes.dex */
public final class RunnableC0865r6 implements Runnable {

    /* renamed from: h */
    public final /* synthetic */ C0690f f3507h;

    /* renamed from: i */
    public final /* synthetic */ C0871rc f3508i;

    /* renamed from: j */
    public final /* synthetic */ BinderC0823o6 f3509j;

    public RunnableC0865r6(BinderC0823o6 binderC0823o6, C0690f c0690f, C0871rc c0871rc) {
        this.f3507h = c0690f;
        this.f3508i = c0871rc;
        this.f3509j = binderC0823o6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0968yb c0968yb;
        C0968yb c0968yb2;
        C0968yb c0968yb3;
        c0968yb = this.f3509j.f3394a;
        c0968yb.m4097k0();
        if (this.f3507h.f2909j.m3529I() == null) {
            c0968yb3 = this.f3509j.f3394a;
            c0968yb3.m4096k(this.f3507h, this.f3508i);
        } else {
            c0968yb2 = this.f3509j.f3394a;
            c0968yb2.m4069P(this.f3507h, this.f3508i);
        }
    }
}
