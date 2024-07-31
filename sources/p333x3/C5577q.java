package p333x3;

import p222p5.C4015a0;
import p222p5.C4041n0;
import p264s3.C4499t2;

/* renamed from: x3.q */
/* loaded from: classes.dex */
public final class C5577q {

    /* renamed from: x3.q$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public long f20935a;
    }

    /* renamed from: a */
    public static boolean m22467a(C4015a0 c4015a0, C5580t c5580t, int i10) {
        int m22476j = m22476j(c4015a0, i10);
        return m22476j != -1 && m22476j <= c5580t.f20940b;
    }

    /* renamed from: b */
    public static boolean m22468b(C4015a0 c4015a0, int i10) {
        return c4015a0.m15210G() == C4041n0.m15485u(c4015a0.m15230e(), i10, c4015a0.m15231f() - 1, 0);
    }

    /* renamed from: c */
    public static boolean m22469c(C4015a0 c4015a0, C5580t c5580t, boolean z10, a aVar) {
        try {
            long m15217N = c4015a0.m15217N();
            if (!z10) {
                m15217N *= c5580t.f20940b;
            }
            aVar.f20935a = m15217N;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    /* renamed from: d */
    public static boolean m22470d(C4015a0 c4015a0, C5580t c5580t, int i10, a aVar) {
        int m15231f = c4015a0.m15231f();
        long m15212I = c4015a0.m15212I();
        long j10 = m15212I >>> 16;
        if (j10 != i10) {
            return false;
        }
        return m22473g((int) ((m15212I >> 4) & 15), c5580t) && m22472f((int) ((m15212I >> 1) & 7), c5580t) && !(((m15212I & 1) > 1L ? 1 : ((m15212I & 1) == 1L ? 0 : -1)) == 0) && m22469c(c4015a0, c5580t, ((j10 & 1) > 1L ? 1 : ((j10 & 1) == 1L ? 0 : -1)) == 0, aVar) && m22467a(c4015a0, c5580t, (int) ((m15212I >> 12) & 15)) && m22471e(c4015a0, c5580t, (int) ((m15212I >> 8) & 15)) && m22468b(c4015a0, m15231f);
    }

    /* renamed from: e */
    public static boolean m22471e(C4015a0 c4015a0, C5580t c5580t, int i10) {
        int i11 = c5580t.f20943e;
        if (i10 == 0) {
            return true;
        }
        if (i10 <= 11) {
            return i10 == c5580t.f20944f;
        }
        if (i10 == 12) {
            return c4015a0.m15210G() * 1000 == i11;
        }
        if (i10 > 14) {
            return false;
        }
        int m15216M = c4015a0.m15216M();
        if (i10 == 14) {
            m15216M *= 10;
        }
        return m15216M == i11;
    }

    /* renamed from: f */
    public static boolean m22472f(int i10, C5580t c5580t) {
        return i10 == 0 || i10 == c5580t.f20947i;
    }

    /* renamed from: g */
    public static boolean m22473g(int i10, C5580t c5580t) {
        return i10 <= 7 ? i10 == c5580t.f20945g - 1 : i10 <= 10 && c5580t.f20945g == 2;
    }

    /* renamed from: h */
    public static boolean m22474h(InterfaceC5572l interfaceC5572l, C5580t c5580t, int i10, a aVar) {
        long mo3030f = interfaceC5572l.mo3030f();
        byte[] bArr = new byte[2];
        interfaceC5572l.mo22430p(bArr, 0, 2);
        if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i10) {
            interfaceC5572l.mo22427l();
            interfaceC5572l.mo22425h((int) (mo3030f - interfaceC5572l.getPosition()));
            return false;
        }
        C4015a0 c4015a0 = new C4015a0(16);
        System.arraycopy(bArr, 0, c4015a0.m15230e(), 0, 2);
        c4015a0.m15222S(C5574n.m22462c(interfaceC5572l, c4015a0.m15230e(), 2, 14));
        interfaceC5572l.mo22427l();
        interfaceC5572l.mo22425h((int) (mo3030f - interfaceC5572l.getPosition()));
        return m22470d(c4015a0, c5580t, i10, aVar);
    }

    /* renamed from: i */
    public static long m22475i(InterfaceC5572l interfaceC5572l, C5580t c5580t) {
        interfaceC5572l.mo22427l();
        interfaceC5572l.mo22425h(1);
        byte[] bArr = new byte[1];
        interfaceC5572l.mo22430p(bArr, 0, 1);
        boolean z10 = (bArr[0] & 1) == 1;
        interfaceC5572l.mo22425h(2);
        int i10 = z10 ? 7 : 6;
        C4015a0 c4015a0 = new C4015a0(i10);
        c4015a0.m15222S(C5574n.m22462c(interfaceC5572l, c4015a0.m15230e(), 0, i10));
        interfaceC5572l.mo22427l();
        a aVar = new a();
        if (m22469c(c4015a0, c5580t, z10, aVar)) {
            return aVar.f20935a;
        }
        throw C4499t2.m17594a(null, null);
    }

    /* renamed from: j */
    public static int m22476j(C4015a0 c4015a0, int i10) {
        switch (i10) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i10 - 2);
            case 6:
                return c4015a0.m15210G() + 1;
            case 7:
                return c4015a0.m15216M() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i10 - 8);
            default:
                return -1;
        }
    }
}
