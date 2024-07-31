package p034c7;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: c7.y6 */
/* loaded from: classes.dex */
public final class CallableC0963y6 implements Callable<List<C0690f>> {

    /* renamed from: a */
    public final /* synthetic */ String f3770a;

    /* renamed from: b */
    public final /* synthetic */ String f3771b;

    /* renamed from: c */
    public final /* synthetic */ String f3772c;

    /* renamed from: d */
    public final /* synthetic */ BinderC0823o6 f3773d;

    public CallableC0963y6(BinderC0823o6 binderC0823o6, String str, String str2, String str3) {
        this.f3770a = str;
        this.f3771b = str2;
        this.f3772c = str3;
        this.f3773d = binderC0823o6;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<C0690f> call() {
        C0968yb c0968yb;
        C0968yb c0968yb2;
        c0968yb = this.f3773d.f3394a;
        c0968yb.m4097k0();
        c0968yb2 = this.f3773d.f3394a;
        return c0968yb2.m4080a0().m3565M(this.f3770a, this.f3771b, this.f3772c);
    }
}
