package p034c7;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: c7.t6 */
/* loaded from: classes.dex */
public final class CallableC0893t6 implements Callable<List<C0815nc>> {

    /* renamed from: a */
    public final /* synthetic */ String f3591a;

    /* renamed from: b */
    public final /* synthetic */ String f3592b;

    /* renamed from: c */
    public final /* synthetic */ String f3593c;

    /* renamed from: d */
    public final /* synthetic */ BinderC0823o6 f3594d;

    public CallableC0893t6(BinderC0823o6 binderC0823o6, String str, String str2, String str3) {
        this.f3591a = str;
        this.f3592b = str2;
        this.f3593c = str3;
        this.f3594d = binderC0823o6;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<C0815nc> call() {
        C0968yb c0968yb;
        C0968yb c0968yb2;
        c0968yb = this.f3594d.f3394a;
        c0968yb.m4097k0();
        c0968yb2 = this.f3594d.f3394a;
        return c0968yb2.m4080a0().m3594t0(this.f3591a, this.f3592b, this.f3593c);
    }
}
