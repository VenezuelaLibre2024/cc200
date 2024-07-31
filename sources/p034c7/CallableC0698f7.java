package p034c7;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: c7.f7 */
/* loaded from: classes.dex */
public final class CallableC0698f7 implements Callable<List<C0815nc>> {

    /* renamed from: a */
    public final /* synthetic */ String f2927a;

    /* renamed from: b */
    public final /* synthetic */ BinderC0823o6 f2928b;

    public CallableC0698f7(BinderC0823o6 binderC0823o6, String str) {
        this.f2927a = str;
        this.f2928b = binderC0823o6;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<C0815nc> call() {
        C0968yb c0968yb;
        C0968yb c0968yb2;
        c0968yb = this.f2928b.f3394a;
        c0968yb.m4097k0();
        c0968yb2 = this.f2928b.f3394a;
        return c0968yb2.m4080a0().m3556H0(this.f2927a);
    }
}
