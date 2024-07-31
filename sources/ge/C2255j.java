package ge;

import gd.C2245s;
import p087fe.InterfaceC1907c;
import p146jd.InterfaceC3281d;
import sd.InterfaceC4585q;
import td.C4741a0;
import td.C4751k;
import td.C4753m;

/* renamed from: ge.j */
/* loaded from: classes2.dex */
public final class C2255j {

    /* renamed from: a */
    public static final InterfaceC4585q<InterfaceC1907c<Object>, Object, InterfaceC3281d<? super C2245s>, Object> f8892a;

    /* renamed from: ge.j$a */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a extends C4751k implements InterfaceC4585q<InterfaceC1907c<? super Object>, Object, InterfaceC3281d<? super C2245s>, Object> {

        /* renamed from: h */
        public static final a f8893h = new a();

        public a() {
            super(3, InterfaceC1907c.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // sd.InterfaceC4585q
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object mo7159b(InterfaceC1907c<Object> interfaceC1907c, Object obj, InterfaceC3281d<? super C2245s> interfaceC3281d) {
            return interfaceC1907c.emit(obj, interfaceC3281d);
        }
    }

    static {
        a aVar = a.f8893h;
        C4753m.m18651d(aVar, "null cannot be cast to non-null type kotlin.Function3<kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>, kotlin.Any?, kotlin.coroutines.Continuation<kotlin.Unit>, kotlin.Any?>");
        f8892a = (InterfaceC4585q) C4741a0.m18631a(aVar, 3);
    }
}
