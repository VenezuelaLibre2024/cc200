package p034c7;

import java.util.concurrent.Callable;

/* renamed from: c7.z6 */
/* loaded from: classes.dex */
public final class CallableC0977z6 implements Callable<C0760k> {

    /* renamed from: a */
    public final /* synthetic */ C0871rc f3840a;

    /* renamed from: b */
    public final /* synthetic */ BinderC0823o6 f3841b;

    public CallableC0977z6(BinderC0823o6 binderC0823o6, C0871rc c0871rc) {
        this.f3840a = c0871rc;
        this.f3841b = binderC0823o6;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ C0760k call() {
        C0968yb c0968yb;
        C0968yb c0968yb2;
        c0968yb = this.f3841b.f3394a;
        c0968yb.m4097k0();
        c0968yb2 = this.f3841b.f3394a;
        return new C0760k(c0968yb2.m4081b(this.f3840a.f3534h));
    }
}
