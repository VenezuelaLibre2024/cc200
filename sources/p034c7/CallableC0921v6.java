package p034c7;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: c7.v6 */
/* loaded from: classes.dex */
public final class CallableC0921v6 implements Callable<List<C0690f>> {

    /* renamed from: a */
    public final /* synthetic */ String f3667a;

    /* renamed from: b */
    public final /* synthetic */ String f3668b;

    /* renamed from: c */
    public final /* synthetic */ String f3669c;

    /* renamed from: d */
    public final /* synthetic */ BinderC0823o6 f3670d;

    public CallableC0921v6(BinderC0823o6 binderC0823o6, String str, String str2, String str3) {
        this.f3667a = str;
        this.f3668b = str2;
        this.f3669c = str3;
        this.f3670d = binderC0823o6;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<C0690f> call() {
        C0968yb c0968yb;
        C0968yb c0968yb2;
        c0968yb = this.f3670d.f3394a;
        c0968yb.m4097k0();
        c0968yb2 = this.f3670d.f3394a;
        return c0968yb2.m4080a0().m3565M(this.f3667a, this.f3668b, this.f3669c);
    }
}
