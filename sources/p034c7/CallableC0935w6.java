package p034c7;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: c7.w6 */
/* loaded from: classes.dex */
public final class CallableC0935w6 implements Callable<List<C0815nc>> {

    /* renamed from: a */
    public final /* synthetic */ String f3693a;

    /* renamed from: b */
    public final /* synthetic */ String f3694b;

    /* renamed from: c */
    public final /* synthetic */ String f3695c;

    /* renamed from: d */
    public final /* synthetic */ BinderC0823o6 f3696d;

    public CallableC0935w6(BinderC0823o6 binderC0823o6, String str, String str2, String str3) {
        this.f3693a = str;
        this.f3694b = str2;
        this.f3695c = str3;
        this.f3696d = binderC0823o6;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<C0815nc> call() {
        C0968yb c0968yb;
        C0968yb c0968yb2;
        c0968yb = this.f3696d.f3394a;
        c0968yb.m4097k0();
        c0968yb2 = this.f3696d.f3394a;
        return c0968yb2.m4080a0().m3594t0(this.f3693a, this.f3694b, this.f3695c);
    }
}
