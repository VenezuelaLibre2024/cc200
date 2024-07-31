package ee;

import gd.C2245s;
import p038ce.InterfaceC1062j3;
import p116he.C2522d0;
import p116he.C2556u0;
import sd.InterfaceC4580l;
import td.C4764x;

/* renamed from: ee.k */
/* loaded from: classes2.dex */
public class C1783k<E> extends C1774b<E> {

    /* renamed from: n */
    public final int f6585n;

    /* renamed from: o */
    public final EnumC1773a f6586o;

    public C1783k(int i10, EnumC1773a enumC1773a, InterfaceC4580l<? super E, C2245s> interfaceC4580l) {
        super(i10, interfaceC4580l);
        this.f6585n = i10;
        this.f6586o = enumC1773a;
        if (!(enumC1773a != EnumC1773a.SUSPEND)) {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + C4764x.m18672b(C1774b.class).mo18642a() + " instead").toString());
        }
        if (i10 >= 1) {
            return;
        }
        throw new IllegalArgumentException(("Buffered channel capacity must be at least 1, but " + i10 + " was specified").toString());
    }

    /* renamed from: A0 */
    public final Object m7221A0(E e10, boolean z10) {
        return this.f6586o == EnumC1773a.DROP_LATEST ? m7222y0(e10, z10) : m7223z0(e10);
    }

    @Override // ee.C1774b
    /* renamed from: T */
    public boolean mo7105T() {
        return this.f6586o == EnumC1773a.DROP_OLDEST;
    }

    @Override // ee.C1774b, ee.InterfaceC1786n
    /* renamed from: c */
    public Object mo7116c(E e10) {
        return m7221A0(e10, false);
    }

    /* renamed from: y0 */
    public final Object m7222y0(E e10, boolean z10) {
        InterfaceC4580l<E, C2245s> interfaceC4580l;
        C2556u0 m10061d;
        Object mo7116c = super.mo7116c(e10);
        if (C1779g.m7202i(mo7116c) || C1779g.m7201h(mo7116c)) {
            return mo7116c;
        }
        if (!z10 || (interfaceC4580l = this.f6545c) == null || (m10061d = C2522d0.m10061d(interfaceC4580l, e10, null, 2, null)) == null) {
            return C1779g.f6579b.m7207c(C2245s.f8873a);
        }
        throw m10061d;
    }

    /* renamed from: z0 */
    public final Object m7223z0(E e10) {
        C1780h c1780h;
        Object obj = C1775c.f6559d;
        C1780h c1780h2 = (C1780h) C1774b.f6539i.get(this);
        while (true) {
            long andIncrement = C1774b.f6535e.getAndIncrement(this);
            long j10 = andIncrement & 1152921504606846975L;
            boolean m7104S = m7104S(andIncrement);
            int i10 = C1775c.f6557b;
            long j11 = j10 / i10;
            int i11 = (int) (j10 % i10);
            if (c1780h2.f9971j != j11) {
                C1780h m7089C = m7089C(j11, c1780h2);
                if (m7089C != null) {
                    c1780h = m7089C;
                } else if (m7104S) {
                    return C1779g.f6579b.m7205a(m7094H());
                }
            } else {
                c1780h = c1780h2;
            }
            int m7137t0 = m7137t0(c1780h, i11, e10, j10, obj, m7104S);
            if (m7137t0 == 0) {
                c1780h.m10067b();
                return C1779g.f6579b.m7207c(C2245s.f8873a);
            }
            if (m7137t0 == 1) {
                return C1779g.f6579b.m7207c(C2245s.f8873a);
            }
            if (m7137t0 == 2) {
                if (m7104S) {
                    c1780h.m10085p();
                    return C1779g.f6579b.m7205a(m7094H());
                }
                InterfaceC1062j3 interfaceC1062j3 = obj instanceof InterfaceC1062j3 ? (InterfaceC1062j3) obj : null;
                if (interfaceC1062j3 != null) {
                    m7121f0(interfaceC1062j3, c1780h, i11);
                }
                m7146y((c1780h.f9971j * i10) + i11);
                return C1779g.f6579b.m7207c(C2245s.f8873a);
            }
            if (m7137t0 == 3) {
                throw new IllegalStateException("unexpected".toString());
            }
            if (m7137t0 == 4) {
                if (j10 < m7093G()) {
                    c1780h.m10067b();
                }
                return C1779g.f6579b.m7205a(m7094H());
            }
            if (m7137t0 == 5) {
                c1780h.m10067b();
            }
            c1780h2 = c1780h;
        }
    }
}
