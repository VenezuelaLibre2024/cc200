package p038ce;

import gd.C2245s;
import ie.C2705a;
import ie.C2706b;
import p116he.C2530h0;
import p116he.C2546p0;
import p146jd.C3285h;
import p146jd.InterfaceC3281d;
import p146jd.InterfaceC3282e;
import p146jd.InterfaceC3284g;
import p161kd.C3385c;
import p173ld.C3474h;
import sd.InterfaceC4584p;
import td.C4753m;

/* renamed from: ce.k */
/* loaded from: classes2.dex */
public final /* synthetic */ class C1063k {
    /* renamed from: a */
    public static final <T> InterfaceC1117x0<T> m4454a(InterfaceC1085p0 interfaceC1085p0, InterfaceC3284g interfaceC3284g, EnumC1093r0 enumC1093r0, InterfaceC4584p<? super InterfaceC1085p0, ? super InterfaceC3281d<? super T>, ? extends Object> interfaceC4584p) {
        InterfaceC3284g m4376d = C1059j0.m4376d(interfaceC1085p0, interfaceC3284g);
        C1121y0 c1071l2 = enumC1093r0.m4569f() ? new C1071l2(m4376d, interfaceC4584p) : new C1121y0(m4376d, true);
        ((AbstractC1013a) c1071l2).m4253R0(enumC1093r0, c1071l2, interfaceC4584p);
        return (InterfaceC1117x0<T>) c1071l2;
    }

    /* renamed from: b */
    public static /* synthetic */ InterfaceC1117x0 m4455b(InterfaceC1085p0 interfaceC1085p0, InterfaceC3284g interfaceC3284g, EnumC1093r0 enumC1093r0, InterfaceC4584p interfaceC4584p, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC3284g = C3285h.f11452h;
        }
        if ((i10 & 2) != 0) {
            enumC1093r0 = EnumC1093r0.DEFAULT;
        }
        return C1053i.m4356a(interfaceC1085p0, interfaceC3284g, enumC1093r0, interfaceC4584p);
    }

    /* renamed from: c */
    public static final InterfaceC1026c2 m4456c(InterfaceC1085p0 interfaceC1085p0, InterfaceC3284g interfaceC3284g, EnumC1093r0 enumC1093r0, InterfaceC4584p<? super InterfaceC1085p0, ? super InterfaceC3281d<? super C2245s>, ? extends Object> interfaceC4584p) {
        InterfaceC3284g m4376d = C1059j0.m4376d(interfaceC1085p0, interfaceC3284g);
        AbstractC1013a c1075m2 = enumC1093r0.m4569f() ? new C1075m2(m4376d, interfaceC4584p) : new C1107u2(m4376d, true);
        c1075m2.m4253R0(enumC1093r0, c1075m2, interfaceC4584p);
        return c1075m2;
    }

    /* renamed from: d */
    public static /* synthetic */ InterfaceC1026c2 m4457d(InterfaceC1085p0 interfaceC1085p0, InterfaceC3284g interfaceC3284g, EnumC1093r0 enumC1093r0, InterfaceC4584p interfaceC4584p, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC3284g = C3285h.f11452h;
        }
        if ((i10 & 2) != 0) {
            enumC1093r0 = EnumC1093r0.DEFAULT;
        }
        return C1053i.m4358c(interfaceC1085p0, interfaceC3284g, enumC1093r0, interfaceC4584p);
    }

    /* renamed from: e */
    public static final <T> Object m4458e(InterfaceC3284g interfaceC3284g, InterfaceC4584p<? super InterfaceC1085p0, ? super InterfaceC3281d<? super T>, ? extends Object> interfaceC4584p, InterfaceC3281d<? super T> interfaceC3281d) {
        Object m4269S0;
        InterfaceC3284g context = interfaceC3281d.getContext();
        InterfaceC3284g m4377e = C1059j0.m4377e(context, interfaceC3284g);
        C1046g2.m4337i(m4377e);
        if (m4377e == context) {
            C2530h0 c2530h0 = new C2530h0(m4377e, interfaceC3281d);
            m4269S0 = C2706b.m11037b(c2530h0, c2530h0, interfaceC4584p);
        } else {
            InterfaceC3282e.b bVar = InterfaceC3282e.f11449e;
            if (C4753m.m18648a(m4377e.mo4368d(bVar), context.mo4368d(bVar))) {
                C1052h3 c1052h3 = new C1052h3(m4377e, interfaceC3281d);
                InterfaceC3284g context2 = c1052h3.getContext();
                Object m10149c = C2546p0.m10149c(context2, null);
                try {
                    Object m11037b = C2706b.m11037b(c1052h3, c1052h3, interfaceC4584p);
                    C2546p0.m10147a(context2, m10149c);
                    m4269S0 = m11037b;
                } catch (Throwable th) {
                    C2546p0.m10147a(context2, m10149c);
                    throw th;
                }
            } else {
                C1025c1 c1025c1 = new C1025c1(m4377e, interfaceC3281d);
                C2705a.m11035d(interfaceC4584p, c1025c1, c1025c1, null, 4, null);
                m4269S0 = c1025c1.m4269S0();
            }
        }
        if (m4269S0 == C3385c.m12581c()) {
            C3474h.m12927c(interfaceC3281d);
        }
        return m4269S0;
    }
}
