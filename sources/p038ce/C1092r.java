package p038ce;

import p116he.C2537l;
import p146jd.InterfaceC3281d;

/* renamed from: ce.r */
/* loaded from: classes2.dex */
public final class C1092r {
    /* renamed from: a */
    public static final void m4565a(InterfaceC1076n<?> interfaceC1076n, InterfaceC1055i1 interfaceC1055i1) {
        interfaceC1076n.mo4486c(new C1060j1(interfaceC1055i1));
    }

    /* renamed from: b */
    public static final <T> C1084p<T> m4566b(InterfaceC3281d<? super T> interfaceC3281d) {
        if (!(interfaceC3281d instanceof C2537l)) {
            return new C1084p<>(interfaceC3281d, 1);
        }
        C1084p<T> m10103p = ((C2537l) interfaceC3281d).m10103p();
        if (m10103p != null) {
            if (!m10103p.m4538K()) {
                m10103p = null;
            }
            if (m10103p != null) {
                return m10103p;
            }
        }
        return new C1084p<>(interfaceC3281d, 2);
    }
}
