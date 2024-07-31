package ge;

import p038ce.InterfaceC1026c2;
import p116he.C2530h0;
import p146jd.InterfaceC3284g;
import sd.InterfaceC4584p;
import td.AbstractC4754n;
import td.C4753m;

/* renamed from: ge.k */
/* loaded from: classes2.dex */
public final class C2256k {

    /* renamed from: ge.k$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC4754n implements InterfaceC4584p<Integer, InterfaceC3284g.b, Integer> {

        /* renamed from: h */
        public final /* synthetic */ C2254i<?> f8894h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C2254i<?> c2254i) {
            super(2);
            this.f8894h = c2254i;
        }

        /* renamed from: a */
        public final Integer m8991a(int i10, InterfaceC3284g.b bVar) {
            InterfaceC3284g.c<?> key = bVar.getKey();
            InterfaceC3284g.b mo4368d = this.f8894h.f8887i.mo4368d(key);
            if (key != InterfaceC1026c2.f3979c) {
                return Integer.valueOf(bVar != mo4368d ? Integer.MIN_VALUE : i10 + 1);
            }
            InterfaceC1026c2 interfaceC1026c2 = (InterfaceC1026c2) mo4368d;
            C4753m.m18651d(bVar, "null cannot be cast to non-null type kotlinx.coroutines.Job");
            InterfaceC1026c2 m8990b = C2256k.m8990b((InterfaceC1026c2) bVar, interfaceC1026c2);
            if (m8990b == interfaceC1026c2) {
                if (interfaceC1026c2 != null) {
                    i10++;
                }
                return Integer.valueOf(i10);
            }
            throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + m8990b + ", expected child of " + interfaceC1026c2 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
        }

        @Override // sd.InterfaceC4584p
        public /* bridge */ /* synthetic */ Integer invoke(Integer num, InterfaceC3284g.b bVar) {
            return m8991a(num.intValue(), bVar);
        }
    }

    /* renamed from: a */
    public static final void m8989a(C2254i<?> c2254i, InterfaceC3284g interfaceC3284g) {
        if (((Number) interfaceC3284g.mo4370z0(0, new a(c2254i))).intValue() == c2254i.f8888j) {
            return;
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + c2254i.f8887i + ",\n\t\tbut emission happened in " + interfaceC3284g + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
    }

    /* renamed from: b */
    public static final InterfaceC1026c2 m8990b(InterfaceC1026c2 interfaceC1026c2, InterfaceC1026c2 interfaceC1026c22) {
        while (interfaceC1026c2 != null) {
            if (interfaceC1026c2 == interfaceC1026c22 || !(interfaceC1026c2 instanceof C2530h0)) {
                return interfaceC1026c2;
            }
            interfaceC1026c2 = interfaceC1026c2.getParent();
        }
        return null;
    }
}
