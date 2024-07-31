package p038ce;

import ie.C2706b;
import p116he.C2527g;
import p116he.C2530h0;
import p146jd.InterfaceC3281d;
import p146jd.InterfaceC3284g;
import p161kd.C3385c;
import p173ld.C3474h;
import sd.InterfaceC4584p;

/* renamed from: ce.q0 */
/* loaded from: classes2.dex */
public final class C1089q0 {
    /* renamed from: a */
    public static final InterfaceC1085p0 m4557a(InterfaceC3284g interfaceC3284g) {
        InterfaceC1014a0 m4345b;
        if (interfaceC3284g.mo4368d(InterfaceC1026c2.f3979c) == null) {
            m4345b = C1051h2.m4345b(null, 1, null);
            interfaceC3284g = interfaceC3284g.mo4369e0(m4345b);
        }
        return new C2527g(interfaceC3284g);
    }

    /* renamed from: b */
    public static final InterfaceC1085p0 m4558b() {
        return new C2527g(C1115w2.m4594b(null, 1, null).mo4369e0(C1045g1.m4328c()));
    }

    /* renamed from: c */
    public static final <R> Object m4559c(InterfaceC4584p<? super InterfaceC1085p0, ? super InterfaceC3281d<? super R>, ? extends Object> interfaceC4584p, InterfaceC3281d<? super R> interfaceC3281d) {
        C2530h0 c2530h0 = new C2530h0(interfaceC3281d.getContext(), interfaceC3281d);
        Object m11037b = C2706b.m11037b(c2530h0, c2530h0, interfaceC4584p);
        if (m11037b == C3385c.m12581c()) {
            C3474h.m12927c(interfaceC3281d);
        }
        return m11037b;
    }

    /* renamed from: d */
    public static final void m4560d(InterfaceC1085p0 interfaceC1085p0) {
        C1046g2.m4337i(interfaceC1085p0.mo1763b());
    }

    /* renamed from: e */
    public static final boolean m4561e(InterfaceC1085p0 interfaceC1085p0) {
        InterfaceC1026c2 interfaceC1026c2 = (InterfaceC1026c2) interfaceC1085p0.mo1763b().mo4368d(InterfaceC1026c2.f3979c);
        if (interfaceC1026c2 != null) {
            return interfaceC1026c2.mo4255a();
        }
        return true;
    }
}
