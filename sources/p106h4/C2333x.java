package p106h4;

import p222p5.C4015a0;
import p222p5.C4033j0;
import p222p5.C4041n0;
import p333x3.AbstractC5556a;
import p333x3.InterfaceC5572l;

/* renamed from: h4.x */
/* loaded from: classes.dex */
public final class C2333x extends AbstractC5556a {

    /* renamed from: h4.x$b */
    /* loaded from: classes.dex */
    public static final class b implements AbstractC5556a.f {

        /* renamed from: a */
        public final C4033j0 f9567a;

        /* renamed from: b */
        public final C4015a0 f9568b;

        public b(C4033j0 c4033j0) {
            this.f9567a = c4033j0;
            this.f9568b = new C4015a0();
        }

        /* renamed from: d */
        public static void m9495d(C4015a0 c4015a0) {
            int m9494k;
            int m15232g = c4015a0.m15232g();
            if (c4015a0.m15226a() < 10) {
                c4015a0.m15223T(m15232g);
                return;
            }
            c4015a0.m15224U(9);
            int m15210G = c4015a0.m15210G() & 7;
            if (c4015a0.m15226a() < m15210G) {
                c4015a0.m15223T(m15232g);
                return;
            }
            c4015a0.m15224U(m15210G);
            if (c4015a0.m15226a() < 4) {
                c4015a0.m15223T(m15232g);
                return;
            }
            if (C2333x.m9494k(c4015a0.m15230e(), c4015a0.m15231f()) == 443) {
                c4015a0.m15224U(4);
                int m15216M = c4015a0.m15216M();
                if (c4015a0.m15226a() < m15216M) {
                    c4015a0.m15223T(m15232g);
                    return;
                }
                c4015a0.m15224U(m15216M);
            }
            while (c4015a0.m15226a() >= 4 && (m9494k = C2333x.m9494k(c4015a0.m15230e(), c4015a0.m15231f())) != 442 && m9494k != 441 && (m9494k >>> 8) == 1) {
                c4015a0.m15224U(4);
                if (c4015a0.m15226a() < 2) {
                    c4015a0.m15223T(m15232g);
                    return;
                }
                c4015a0.m15223T(Math.min(c4015a0.m15232g(), c4015a0.m15231f() + c4015a0.m15216M()));
            }
        }

        @Override // p333x3.AbstractC5556a.f
        /* renamed from: a */
        public AbstractC5556a.e mo159a(InterfaceC5572l interfaceC5572l, long j10) {
            long position = interfaceC5572l.getPosition();
            int min = (int) Math.min(20000L, interfaceC5572l.mo3029b() - position);
            this.f9568b.m15219P(min);
            interfaceC5572l.mo22430p(this.f9568b.m15230e(), 0, min);
            return m9496c(this.f9568b, j10, position);
        }

        @Override // p333x3.AbstractC5556a.f
        /* renamed from: b */
        public void mo9348b() {
            this.f9568b.m15220Q(C4041n0.f14518f);
        }

        /* renamed from: c */
        public final AbstractC5556a.e m9496c(C4015a0 c4015a0, long j10, long j11) {
            int i10 = -1;
            int i11 = -1;
            long j12 = -9223372036854775807L;
            while (c4015a0.m15226a() >= 4) {
                if (C2333x.m9494k(c4015a0.m15230e(), c4015a0.m15231f()) != 442) {
                    c4015a0.m15224U(1);
                } else {
                    c4015a0.m15224U(4);
                    long m9498l = C2334y.m9498l(c4015a0);
                    if (m9498l != -9223372036854775807L) {
                        long m15363b = this.f9567a.m15363b(m9498l);
                        if (m15363b > j10) {
                            return j12 == -9223372036854775807L ? AbstractC5556a.e.m22401d(m15363b, j11) : AbstractC5556a.e.m22402e(j11 + i11);
                        }
                        if (100000 + m15363b > j10) {
                            return AbstractC5556a.e.m22402e(j11 + c4015a0.m15231f());
                        }
                        i11 = c4015a0.m15231f();
                        j12 = m15363b;
                    }
                    m9495d(c4015a0);
                    i10 = c4015a0.m15231f();
                }
            }
            return j12 != -9223372036854775807L ? AbstractC5556a.e.m22403f(j12, j11 + i10) : AbstractC5556a.e.f20846d;
        }
    }

    public C2333x(C4033j0 c4033j0, long j10, long j11) {
        super(new AbstractC5556a.b(), new b(c4033j0), j10, 0L, j10 + 1, 0L, j11, 188L, 1000);
    }

    /* renamed from: k */
    public static int m9494k(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & 255) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
    }
}
