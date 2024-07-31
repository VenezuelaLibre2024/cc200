package p261s0;

import p146jd.InterfaceC3281d;
import p246r0.C4257a;
import p246r0.InterfaceC4258b;
import sd.InterfaceC4580l;
import td.C4753m;

/* renamed from: s0.b */
/* loaded from: classes.dex */
public final class C4386b<T> implements InterfaceC4258b<T> {

    /* renamed from: a */
    public final InterfaceC4580l<C4257a, T> f16102a;

    /* JADX WARN: Multi-variable type inference failed */
    public C4386b(InterfaceC4580l<? super C4257a, ? extends T> interfaceC4580l) {
        C4753m.m18653f(interfaceC4580l, "produceNewData");
        this.f16102a = interfaceC4580l;
    }

    @Override // p246r0.InterfaceC4258b
    /* renamed from: a */
    public Object mo16338a(C4257a c4257a, InterfaceC3281d<? super T> interfaceC3281d) {
        return this.f16102a.invoke(c4257a);
    }
}
