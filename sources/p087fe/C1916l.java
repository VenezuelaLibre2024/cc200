package p087fe;

import gd.C2245s;
import p146jd.InterfaceC3281d;
import p161kd.C3385c;
import sd.InterfaceC4584p;

/* renamed from: fe.l */
/* loaded from: classes2.dex */
public final class C1916l<T> extends AbstractC1905a<T> {

    /* renamed from: h */
    public final InterfaceC4584p<InterfaceC1907c<? super T>, InterfaceC3281d<? super C2245s>, Object> f7254h;

    /* JADX WARN: Multi-variable type inference failed */
    public C1916l(InterfaceC4584p<? super InterfaceC1907c<? super T>, ? super InterfaceC3281d<? super C2245s>, ? extends Object> interfaceC4584p) {
        this.f7254h = interfaceC4584p;
    }

    @Override // p087fe.AbstractC1905a
    /* renamed from: b */
    public Object mo7782b(InterfaceC1907c<? super T> interfaceC1907c, InterfaceC3281d<? super C2245s> interfaceC3281d) {
        Object invoke = this.f7254h.invoke(interfaceC1907c, interfaceC3281d);
        return invoke == C3385c.m12581c() ? invoke : C2245s.f8873a;
    }
}
