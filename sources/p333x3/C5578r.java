package p333x3;

import java.util.Arrays;
import java.util.List;
import p126i7.AbstractC2651u;
import p152k4.C3348a;
import p192n4.C3729a;
import p221p4.C4007h;
import p222p5.C4015a0;
import p222p5.C4054z;
import p264s3.C4499t2;
import p333x3.C5580t;

/* renamed from: x3.r */
/* loaded from: classes.dex */
public final class C5578r {

    /* renamed from: x3.r$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public C5580t f20936a;

        public a(C5580t c5580t) {
            this.f20936a = c5580t;
        }
    }

    /* renamed from: a */
    public static boolean m22477a(InterfaceC5572l interfaceC5572l) {
        C4015a0 c4015a0 = new C4015a0(4);
        interfaceC5572l.mo22430p(c4015a0.m15230e(), 0, 4);
        return c4015a0.m15212I() == 1716281667;
    }

    /* renamed from: b */
    public static int m22478b(InterfaceC5572l interfaceC5572l) {
        interfaceC5572l.mo22427l();
        C4015a0 c4015a0 = new C4015a0(2);
        interfaceC5572l.mo22430p(c4015a0.m15230e(), 0, 2);
        int m15216M = c4015a0.m15216M();
        int i10 = m15216M >> 2;
        interfaceC5572l.mo22427l();
        if (i10 == 16382) {
            return m15216M;
        }
        throw C4499t2.m17594a("First frame does not start with sync code.", null);
    }

    /* renamed from: c */
    public static C3348a m22479c(InterfaceC5572l interfaceC5572l, boolean z10) {
        C3348a m22502a = new C5583w().m22502a(interfaceC5572l, z10 ? null : C4007h.f14423b);
        if (m22502a == null || m22502a.m12414f() == 0) {
            return null;
        }
        return m22502a;
    }

    /* renamed from: d */
    public static C3348a m22480d(InterfaceC5572l interfaceC5572l, boolean z10) {
        interfaceC5572l.mo22427l();
        long mo3030f = interfaceC5572l.mo3030f();
        C3348a m22479c = m22479c(interfaceC5572l, z10);
        interfaceC5572l.mo22428m((int) (interfaceC5572l.mo3030f() - mo3030f));
        return m22479c;
    }

    /* renamed from: e */
    public static boolean m22481e(InterfaceC5572l interfaceC5572l, a aVar) {
        C5580t m22490a;
        interfaceC5572l.mo22427l();
        C4054z c4054z = new C4054z(new byte[4]);
        interfaceC5572l.mo22430p(c4054z.f14602a, 0, 4);
        boolean m15600g = c4054z.m15600g();
        int m15601h = c4054z.m15601h(7);
        int m15601h2 = c4054z.m15601h(24) + 4;
        if (m15601h == 0) {
            m22490a = m22484h(interfaceC5572l);
        } else {
            C5580t c5580t = aVar.f20936a;
            if (c5580t == null) {
                throw new IllegalArgumentException();
            }
            if (m15601h == 3) {
                m22490a = c5580t.m22491b(m22483g(interfaceC5572l, m15601h2));
            } else if (m15601h == 4) {
                m22490a = c5580t.m22492c(m22486j(interfaceC5572l, m15601h2));
            } else {
                if (m15601h != 6) {
                    interfaceC5572l.mo22428m(m15601h2);
                    return m15600g;
                }
                C4015a0 c4015a0 = new C4015a0(m15601h2);
                interfaceC5572l.readFully(c4015a0.m15230e(), 0, m15601h2);
                c4015a0.m15224U(4);
                m22490a = c5580t.m22490a(AbstractC2651u.m10771v(C3729a.m14042a(c4015a0)));
            }
        }
        aVar.f20936a = m22490a;
        return m15600g;
    }

    /* renamed from: f */
    public static C5580t.a m22482f(C4015a0 c4015a0) {
        c4015a0.m15224U(1);
        int m15213J = c4015a0.m15213J();
        long m15231f = c4015a0.m15231f() + m15213J;
        int i10 = m15213J / 18;
        long[] jArr = new long[i10];
        long[] jArr2 = new long[i10];
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                break;
            }
            long m15251z = c4015a0.m15251z();
            if (m15251z == -1) {
                jArr = Arrays.copyOf(jArr, i11);
                jArr2 = Arrays.copyOf(jArr2, i11);
                break;
            }
            jArr[i11] = m15251z;
            jArr2[i11] = c4015a0.m15251z();
            c4015a0.m15224U(2);
            i11++;
        }
        c4015a0.m15224U((int) (m15231f - c4015a0.m15231f()));
        return new C5580t.a(jArr, jArr2);
    }

    /* renamed from: g */
    public static C5580t.a m22483g(InterfaceC5572l interfaceC5572l, int i10) {
        C4015a0 c4015a0 = new C4015a0(i10);
        interfaceC5572l.readFully(c4015a0.m15230e(), 0, i10);
        return m22482f(c4015a0);
    }

    /* renamed from: h */
    public static C5580t m22484h(InterfaceC5572l interfaceC5572l) {
        byte[] bArr = new byte[38];
        interfaceC5572l.readFully(bArr, 0, 38);
        return new C5580t(bArr, 4);
    }

    /* renamed from: i */
    public static void m22485i(InterfaceC5572l interfaceC5572l) {
        C4015a0 c4015a0 = new C4015a0(4);
        interfaceC5572l.readFully(c4015a0.m15230e(), 0, 4);
        if (c4015a0.m15212I() != 1716281667) {
            throw C4499t2.m17594a("Failed to read FLAC stream marker.", null);
        }
    }

    /* renamed from: j */
    public static List<String> m22486j(InterfaceC5572l interfaceC5572l, int i10) {
        C4015a0 c4015a0 = new C4015a0(i10);
        interfaceC5572l.readFully(c4015a0.m15230e(), 0, i10);
        c4015a0.m15224U(4);
        return Arrays.asList(C5565e0.m22447j(c4015a0, false, false).f20894b);
    }
}
