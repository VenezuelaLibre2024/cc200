package p116he;

import gd.C2237k;
import gd.C2238l;
import gd.C2245s;
import java.util.concurrent.CancellationException;
import p038ce.AbstractC1074m1;
import p038ce.C1044g0;
import p038ce.C1052h3;
import p038ce.C1059j0;
import p038ce.C1101t0;
import p038ce.C1123y2;
import p038ce.InterfaceC1026c2;
import p146jd.InterfaceC3281d;
import p146jd.InterfaceC3284g;
import sd.InterfaceC4580l;

/* renamed from: he.m */
/* loaded from: classes2.dex */
public final class C2539m {

    /* renamed from: a */
    public static final C2538l0 f9982a = new C2538l0("UNDEFINED");

    /* renamed from: b */
    public static final C2538l0 f9983b = new C2538l0("REUSABLE_CLAIMED");

    /* JADX WARN: Finally extract failed */
    /* renamed from: b */
    public static final <T> void m10110b(InterfaceC3281d<? super T> interfaceC3281d, Object obj, InterfaceC4580l<? super Throwable, C2245s> interfaceC4580l) {
        boolean z10;
        if (!(interfaceC3281d instanceof C2537l)) {
            interfaceC3281d.resumeWith(obj);
            return;
        }
        C2537l c2537l = (C2537l) interfaceC3281d;
        Object m4324c = C1044g0.m4324c(obj, interfaceC4580l);
        if (c2537l.f9977k.mo4340I0(c2537l.getContext())) {
            c2537l.f9979m = m4324c;
            c2537l.f3984j = 1;
            c2537l.f9977k.mo4339H0(c2537l.getContext(), c2537l);
            return;
        }
        C1101t0.m4573a();
        AbstractC1074m1 m4601b = C1123y2.f4101a.m4601b();
        if (m4601b.m4481R0()) {
            c2537l.f9979m = m4324c;
            c2537l.f3984j = 1;
            m4601b.m4478N0(c2537l);
            return;
        }
        m4601b.m4480P0(true);
        try {
            InterfaceC1026c2 interfaceC1026c2 = (InterfaceC1026c2) c2537l.getContext().mo4368d(InterfaceC1026c2.f3979c);
            if (interfaceC1026c2 == null || interfaceC1026c2.mo4255a()) {
                z10 = false;
            } else {
                CancellationException mo4273K = interfaceC1026c2.mo4273K();
                c2537l.mo4289a(m4324c, mo4273K);
                C2237k.a aVar = C2237k.f8865i;
                c2537l.resumeWith(C2237k.m8966b(C2238l.m8974a(mo4273K)));
                z10 = true;
            }
            if (!z10) {
                InterfaceC3281d<T> interfaceC3281d2 = c2537l.f9978l;
                Object obj2 = c2537l.f9980n;
                InterfaceC3284g context = interfaceC3281d2.getContext();
                Object m10149c = C2546p0.m10149c(context, obj2);
                C1052h3<?> m4379g = m10149c != C2546p0.f9994a ? C1059j0.m4379g(interfaceC3281d2, context, m10149c) : null;
                try {
                    c2537l.f9978l.resumeWith(obj);
                    C2245s c2245s = C2245s.f8873a;
                    if (m4379g == null || m4379g.m4354S0()) {
                        C2546p0.m10147a(context, m10149c);
                    }
                } catch (Throwable th) {
                    if (m4379g == null || m4379g.m4354S0()) {
                        C2546p0.m10147a(context, m10149c);
                    }
                    throw th;
                }
            }
            do {
            } while (m4601b.m4484U0());
        } finally {
            try {
            } finally {
            }
        }
    }

    /* renamed from: c */
    public static /* synthetic */ void m10111c(InterfaceC3281d interfaceC3281d, Object obj, InterfaceC4580l interfaceC4580l, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            interfaceC4580l = null;
        }
        m10110b(interfaceC3281d, obj, interfaceC4580l);
    }
}
