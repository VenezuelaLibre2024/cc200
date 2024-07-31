package p034c7;

import java.util.concurrent.Callable;

/* renamed from: c7.e7 */
/* loaded from: classes.dex */
public final class CallableC0684e7 implements Callable<byte[]> {

    /* renamed from: a */
    public final /* synthetic */ C0705g0 f2894a;

    /* renamed from: b */
    public final /* synthetic */ String f2895b;

    /* renamed from: c */
    public final /* synthetic */ BinderC0823o6 f2896c;

    public CallableC0684e7(BinderC0823o6 binderC0823o6, C0705g0 c0705g0, String str) {
        this.f2894a = c0705g0;
        this.f2895b = str;
        this.f2896c = binderC0823o6;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ byte[] call() {
        C0968yb c0968yb;
        C0968yb c0968yb2;
        c0968yb = this.f2896c.f3394a;
        c0968yb.m4097k0();
        c0968yb2 = this.f2896c.f3394a;
        return c0968yb2.m4088f0().m3686t(this.f2894a, this.f2895b);
    }
}
