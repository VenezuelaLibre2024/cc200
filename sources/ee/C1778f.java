package ee;

import gd.C2245s;
import p079f6.C1841a;
import sd.InterfaceC4580l;

/* renamed from: ee.f */
/* loaded from: classes2.dex */
public final class C1778f {
    /* renamed from: a */
    public static final <E> InterfaceC1776d<E> m7192a(int i10, EnumC1773a enumC1773a, InterfaceC4580l<? super E, C2245s> interfaceC4580l) {
        InterfaceC1776d<E> c1774b;
        if (i10 != -2) {
            if (i10 == -1) {
                if (enumC1773a == EnumC1773a.SUSPEND) {
                    return new C1783k(1, EnumC1773a.DROP_OLDEST, interfaceC4580l);
                }
                throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
            }
            if (i10 != 0) {
                return i10 != Integer.MAX_VALUE ? enumC1773a == EnumC1773a.SUSPEND ? new C1774b(i10, interfaceC4580l) : new C1783k(i10, enumC1773a, interfaceC4580l) : new C1774b(C1841a.e.API_PRIORITY_OTHER, interfaceC4580l);
            }
            c1774b = enumC1773a == EnumC1773a.SUSPEND ? new C1774b<>(0, interfaceC4580l) : new C1783k<>(1, enumC1773a, interfaceC4580l);
        } else {
            c1774b = enumC1773a == EnumC1773a.SUSPEND ? new C1774b<>(InterfaceC1776d.f6576a.m7191a(), interfaceC4580l) : new C1783k<>(1, enumC1773a, interfaceC4580l);
        }
        return c1774b;
    }

    /* renamed from: b */
    public static /* synthetic */ InterfaceC1776d m7193b(int i10, EnumC1773a enumC1773a, InterfaceC4580l interfaceC4580l, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        if ((i11 & 2) != 0) {
            enumC1773a = EnumC1773a.SUSPEND;
        }
        if ((i11 & 4) != 0) {
            interfaceC4580l = null;
        }
        return m7192a(i10, enumC1773a, interfaceC4580l);
    }
}
