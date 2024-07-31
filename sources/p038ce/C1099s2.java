package p038ce;

import gd.C2237k;
import gd.C2238l;
import gd.C2245s;

/* renamed from: ce.s2 */
/* loaded from: classes2.dex */
public final class C1099s2<T> extends AbstractC1056i2 {

    /* renamed from: l */
    public final C1084p<T> f4085l;

    /* JADX WARN: Multi-variable type inference failed */
    public C1099s2(C1084p<? super T> c1084p) {
        this.f4085l = c1084p;
    }

    @Override // sd.InterfaceC4580l
    public /* bridge */ /* synthetic */ C2245s invoke(Throwable th) {
        mo4259u(th);
        return C2245s.f8873a;
    }

    @Override // p038ce.AbstractC1034e0
    /* renamed from: u */
    public void mo4259u(Throwable th) {
        C1084p<T> c1084p;
        Object m4470h;
        Object m4412T = m4365v().m4412T();
        if (C1101t0.m4573a() && !(!(m4412T instanceof InterfaceC1118x1))) {
            throw new AssertionError();
        }
        if (m4412T instanceof C1024c0) {
            c1084p = this.f4085l;
            C2237k.a aVar = C2237k.f8865i;
            m4470h = C2238l.m8974a(((C1024c0) m4412T).f3977a);
        } else {
            c1084p = this.f4085l;
            C2237k.a aVar2 = C2237k.f8865i;
            m4470h = C1066k2.m4470h(m4412T);
        }
        c1084p.resumeWith(C2237k.m8966b(m4470h));
    }
}
