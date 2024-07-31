package p034c7;

/* renamed from: c7.d9 */
/* loaded from: classes.dex */
public final class RunnableC0672d9 implements Runnable {

    /* renamed from: h */
    public final /* synthetic */ C0928w f2875h;

    /* renamed from: i */
    public final /* synthetic */ C0936w7 f2876i;

    public RunnableC0672d9(C0936w7 c0936w7, C0928w c0928w) {
        this.f2875h = c0928w;
        this.f2876i = c0936w7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f2876i.mo3095e().m3424u(this.f2875h)) {
            this.f2876i.mo3105o().m4029P(false);
        } else {
            this.f2876i.zzj().m3917E().m3996b("Lower precedence consent source ignored, proposed source", Integer.valueOf(this.f2875h.m3930a()));
        }
    }
}
