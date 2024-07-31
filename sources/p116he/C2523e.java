package p116he;

import sd.InterfaceC4584p;

/* renamed from: he.e */
/* loaded from: classes2.dex */
public final class C2523e {

    /* renamed from: a */
    public static final C2538l0 f9963a = new C2538l0("CLOSED");

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [he.f] */
    /* renamed from: b */
    public static final <N extends AbstractC2525f<N>> N m10064b(N n10) {
        while (true) {
            Object m10066a = AbstractC2525f.m10066a(n10);
            if (m10066a == f9963a) {
                return n10;
            }
            ?? r02 = (AbstractC2525f) m10066a;
            if (r02 != 0) {
                n10 = r02;
            } else if (n10.m10075j()) {
                return n10;
            }
        }
    }

    /* renamed from: c */
    public static final <S extends AbstractC2532i0<S>> Object m10065c(S s10, long j10, InterfaceC4584p<? super Long, ? super S, ? extends S> interfaceC4584p) {
        while (true) {
            if (s10.f9971j >= j10 && !s10.mo10073h()) {
                return C2534j0.m10087a(s10);
            }
            Object m10066a = AbstractC2525f.m10066a(s10);
            if (m10066a == f9963a) {
                return C2534j0.m10087a(f9963a);
            }
            S s11 = (S) ((AbstractC2525f) m10066a);
            if (s11 == null) {
                s11 = interfaceC4584p.invoke(Long.valueOf(s10.f9971j + 1), s10);
                if (s10.m10077l(s11)) {
                    if (s10.mo10073h()) {
                        s10.m10076k();
                    }
                }
            }
            s10 = s11;
        }
    }
}
