package p038ce;

import gd.C2237k;
import gd.C2238l;
import gd.C2245s;
import p116he.C2537l;
import p116he.C2546p0;
import p146jd.InterfaceC3281d;
import p146jd.InterfaceC3284g;
import td.C4753m;

/* renamed from: ce.e1 */
/* loaded from: classes2.dex */
public final class C1035e1 {
    /* renamed from: a */
    public static final <T> void m4307a(AbstractC1030d1<? super T> abstractC1030d1, int i10) {
        if (C1101t0.m4573a()) {
            if (!(i10 != -1)) {
                throw new AssertionError();
            }
        }
        InterfaceC3281d<? super T> mo4290b = abstractC1030d1.mo4290b();
        boolean z10 = i10 == 4;
        if (z10 || !(mo4290b instanceof C2537l) || m4308b(i10) != m4308b(abstractC1030d1.f3984j)) {
            m4310d(abstractC1030d1, mo4290b, z10);
            return;
        }
        AbstractC1064k0 abstractC1064k0 = ((C2537l) mo4290b).f9977k;
        InterfaceC3284g context = mo4290b.getContext();
        if (abstractC1064k0.mo4340I0(context)) {
            abstractC1064k0.mo4339H0(context, abstractC1030d1);
        } else {
            m4311e(abstractC1030d1);
        }
    }

    /* renamed from: b */
    public static final boolean m4308b(int i10) {
        return i10 == 1 || i10 == 2;
    }

    /* renamed from: c */
    public static final boolean m4309c(int i10) {
        return i10 == 2;
    }

    /* renamed from: d */
    public static final <T> void m4310d(AbstractC1030d1<? super T> abstractC1030d1, InterfaceC3281d<? super T> interfaceC3281d, boolean z10) {
        Object mo4292i;
        Object mo4294n = abstractC1030d1.mo4294n();
        Throwable mo4291d = abstractC1030d1.mo4291d(mo4294n);
        if (mo4291d != null) {
            C2237k.a aVar = C2237k.f8865i;
            mo4292i = C2238l.m8974a(mo4291d);
        } else {
            C2237k.a aVar2 = C2237k.f8865i;
            mo4292i = abstractC1030d1.mo4292i(mo4294n);
        }
        Object m8966b = C2237k.m8966b(mo4292i);
        if (!z10) {
            interfaceC3281d.resumeWith(m8966b);
            return;
        }
        C4753m.m18651d(interfaceC3281d, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        C2537l c2537l = (C2537l) interfaceC3281d;
        InterfaceC3281d<T> interfaceC3281d2 = c2537l.f9978l;
        Object obj = c2537l.f9980n;
        InterfaceC3284g context = interfaceC3281d2.getContext();
        Object m10149c = C2546p0.m10149c(context, obj);
        C1052h3<?> m4379g = m10149c != C2546p0.f9994a ? C1059j0.m4379g(interfaceC3281d2, context, m10149c) : null;
        try {
            c2537l.f9978l.resumeWith(m8966b);
            C2245s c2245s = C2245s.f8873a;
        } finally {
            if (m4379g == null || m4379g.m4354S0()) {
                C2546p0.m10147a(context, m10149c);
            }
        }
    }

    /* renamed from: e */
    public static final void m4311e(AbstractC1030d1<?> abstractC1030d1) {
        AbstractC1074m1 m4601b = C1123y2.f4101a.m4601b();
        if (m4601b.m4481R0()) {
            m4601b.m4478N0(abstractC1030d1);
            return;
        }
        m4601b.m4480P0(true);
        try {
            m4310d(abstractC1030d1, abstractC1030d1.mo4290b(), true);
            do {
            } while (m4601b.m4484U0());
        } finally {
            try {
            } finally {
            }
        }
    }
}
