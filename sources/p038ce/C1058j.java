package p038ce;

import p146jd.C3285h;
import p146jd.InterfaceC3281d;
import p146jd.InterfaceC3282e;
import p146jd.InterfaceC3284g;
import sd.InterfaceC4584p;

/* renamed from: ce.j */
/* loaded from: classes2.dex */
public final /* synthetic */ class C1058j {
    /* renamed from: a */
    public static final <T> T m4371a(InterfaceC3284g interfaceC3284g, InterfaceC4584p<? super InterfaceC1085p0, ? super InterfaceC3281d<? super T>, ? extends Object> interfaceC4584p) {
        AbstractC1074m1 m4600a;
        C1110v1 c1110v1;
        Thread currentThread = Thread.currentThread();
        InterfaceC3282e interfaceC3282e = (InterfaceC3282e) interfaceC3284g.mo4368d(InterfaceC3282e.f11449e);
        if (interfaceC3282e == null) {
            m4600a = C1123y2.f4101a.m4601b();
            c1110v1 = C1110v1.f4096h;
            interfaceC3284g = interfaceC3284g.mo4369e0(m4600a);
        } else {
            AbstractC1074m1 abstractC1074m1 = interfaceC3282e instanceof AbstractC1074m1 ? (AbstractC1074m1) interfaceC3282e : null;
            if (abstractC1074m1 != null) {
                AbstractC1074m1 abstractC1074m12 = abstractC1074m1.m4485V0() ? abstractC1074m1 : null;
                if (abstractC1074m12 != null) {
                    m4600a = abstractC1074m12;
                    c1110v1 = C1110v1.f4096h;
                }
            }
            m4600a = C1123y2.f4101a.m4600a();
            c1110v1 = C1110v1.f4096h;
        }
        C1043g c1043g = new C1043g(C1059j0.m4376d(c1110v1, interfaceC3284g), currentThread, m4600a);
        c1043g.m4253R0(EnumC1093r0.DEFAULT, c1043g, interfaceC4584p);
        return (T) c1043g.m4320S0();
    }

    /* renamed from: b */
    public static /* synthetic */ Object m4372b(InterfaceC3284g interfaceC3284g, InterfaceC4584p interfaceC4584p, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC3284g = C3285h.f11452h;
        }
        return C1053i.m4360e(interfaceC3284g, interfaceC4584p);
    }
}
