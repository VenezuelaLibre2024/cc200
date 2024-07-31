package ie;

import gd.C2237k;
import gd.C2238l;
import p038ce.C1024c0;
import p038ce.C1032d3;
import p038ce.C1066k2;
import p038ce.C1101t0;
import p116he.C2530h0;
import p116he.C2536k0;
import p116he.C2546p0;
import p146jd.InterfaceC3281d;
import p146jd.InterfaceC3284g;
import p161kd.C3385c;
import p173ld.C3474h;
import p173ld.InterfaceC3471e;
import sd.InterfaceC4584p;
import td.C4741a0;

/* renamed from: ie.b */
/* loaded from: classes2.dex */
public final class C2706b {
    /* renamed from: a */
    public static final <R, T> void m11036a(InterfaceC4584p<? super R, ? super InterfaceC3281d<? super T>, ? extends Object> interfaceC4584p, R r10, InterfaceC3281d<? super T> interfaceC3281d) {
        Object m8974a;
        InterfaceC3281d m12925a = C3474h.m12925a(interfaceC3281d);
        try {
            InterfaceC3284g context = interfaceC3281d.getContext();
            Object m10149c = C2546p0.m10149c(context, null);
            try {
                m8974a = ((InterfaceC4584p) C4741a0.m18631a(interfaceC4584p, 2)).invoke(r10, m12925a);
            } finally {
                C2546p0.m10147a(context, m10149c);
            }
        } catch (Throwable th) {
            C2237k.a aVar = C2237k.f8865i;
            m8974a = C2238l.m8974a(th);
        }
        if (m8974a != C3385c.m12581c()) {
            C2237k.a aVar2 = C2237k.f8865i;
            m12925a.resumeWith(C2237k.m8966b(m8974a));
        }
    }

    /* renamed from: b */
    public static final <T, R> Object m11037b(C2530h0<? super T> c2530h0, R r10, InterfaceC4584p<? super R, ? super InterfaceC3281d<? super T>, ? extends Object> interfaceC4584p) {
        Object c1024c0;
        Object m4419j0;
        Throwable m10098i;
        try {
            c1024c0 = ((InterfaceC4584p) C4741a0.m18631a(interfaceC4584p, 2)).invoke(r10, c2530h0);
        } catch (Throwable th) {
            c1024c0 = new C1024c0(th, false, 2, null);
        }
        if (c1024c0 == C3385c.m12581c() || (m4419j0 = c2530h0.m4419j0(c1024c0)) == C1066k2.f4040b) {
            return C3385c.m12581c();
        }
        if (!(m4419j0 instanceof C1024c0)) {
            return C1066k2.m4470h(m4419j0);
        }
        Throwable th2 = ((C1024c0) m4419j0).f3977a;
        InterfaceC3281d<? super T> interfaceC3281d = c2530h0.f9969k;
        if (!C1101t0.m4576d() || !(interfaceC3281d instanceof InterfaceC3471e)) {
            throw th2;
        }
        m10098i = C2536k0.m10098i(th2, (InterfaceC3471e) interfaceC3281d);
        throw m10098i;
    }

    /* renamed from: c */
    public static final <T, R> Object m11038c(C2530h0<? super T> c2530h0, R r10, InterfaceC4584p<? super R, ? super InterfaceC3281d<? super T>, ? extends Object> interfaceC4584p) {
        Object c1024c0;
        Object m4419j0;
        Throwable m10098i;
        Throwable m10098i2;
        try {
            c1024c0 = ((InterfaceC4584p) C4741a0.m18631a(interfaceC4584p, 2)).invoke(r10, c2530h0);
        } catch (Throwable th) {
            c1024c0 = new C1024c0(th, false, 2, null);
        }
        if (c1024c0 == C3385c.m12581c() || (m4419j0 = c2530h0.m4419j0(c1024c0)) == C1066k2.f4040b) {
            return C3385c.m12581c();
        }
        if (m4419j0 instanceof C1024c0) {
            Throwable th2 = ((C1024c0) m4419j0).f3977a;
            if (((th2 instanceof C1032d3) && ((C1032d3) th2).f3986h == c2530h0) ? false : true) {
                InterfaceC3281d<? super T> interfaceC3281d = c2530h0.f9969k;
                if (!C1101t0.m4576d() || !(interfaceC3281d instanceof InterfaceC3471e)) {
                    throw th2;
                }
                m10098i2 = C2536k0.m10098i(th2, (InterfaceC3471e) interfaceC3281d);
                throw m10098i2;
            }
            if (c1024c0 instanceof C1024c0) {
                Throwable th3 = ((C1024c0) c1024c0).f3977a;
                InterfaceC3281d<? super T> interfaceC3281d2 = c2530h0.f9969k;
                if (!C1101t0.m4576d() || !(interfaceC3281d2 instanceof InterfaceC3471e)) {
                    throw th3;
                }
                m10098i = C2536k0.m10098i(th3, (InterfaceC3471e) interfaceC3281d2);
                throw m10098i;
            }
        } else {
            c1024c0 = C1066k2.m4470h(m4419j0);
        }
        return c1024c0;
    }
}
