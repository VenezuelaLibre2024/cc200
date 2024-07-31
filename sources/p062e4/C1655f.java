package p062e4;

import java.io.EOFException;
import p062e4.InterfaceC1656g;
import p152k4.C3348a;
import p221p4.C4007h;
import p221p4.C4010k;
import p221p4.C4012m;
import p222p5.C4014a;
import p222p5.C4015a0;
import p222p5.C4041n0;
import p264s3.C4463m1;
import p289u3.C4816f0;
import p333x3.C5570j;
import p333x3.C5582v;
import p333x3.C5583w;
import p333x3.C5585y;
import p333x3.InterfaceC5559b0;
import p333x3.InterfaceC5571k;
import p333x3.InterfaceC5572l;
import p333x3.InterfaceC5573m;
import p333x3.InterfaceC5576p;

/* renamed from: e4.f */
/* loaded from: classes.dex */
public final class C1655f implements InterfaceC5571k {

    /* renamed from: u */
    public static final InterfaceC5576p f6094u = C1654e.f6093b;

    /* renamed from: v */
    public static final C4007h.a f6095v = C1653d.f6092a;

    /* renamed from: a */
    public final int f6096a;

    /* renamed from: b */
    public final long f6097b;

    /* renamed from: c */
    public final C4015a0 f6098c;

    /* renamed from: d */
    public final C4816f0.a f6099d;

    /* renamed from: e */
    public final C5582v f6100e;

    /* renamed from: f */
    public final C5583w f6101f;

    /* renamed from: g */
    public final InterfaceC5559b0 f6102g;

    /* renamed from: h */
    public InterfaceC5573m f6103h;

    /* renamed from: i */
    public InterfaceC5559b0 f6104i;

    /* renamed from: j */
    public InterfaceC5559b0 f6105j;

    /* renamed from: k */
    public int f6106k;

    /* renamed from: l */
    public C3348a f6107l;

    /* renamed from: m */
    public long f6108m;

    /* renamed from: n */
    public long f6109n;

    /* renamed from: o */
    public long f6110o;

    /* renamed from: p */
    public int f6111p;

    /* renamed from: q */
    public InterfaceC1656g f6112q;

    /* renamed from: r */
    public boolean f6113r;

    /* renamed from: s */
    public boolean f6114s;

    /* renamed from: t */
    public long f6115t;

    public C1655f() {
        this(0);
    }

    public C1655f(int i10) {
        this(i10, -9223372036854775807L);
    }

    public C1655f(int i10, long j10) {
        this.f6096a = (i10 & 2) != 0 ? i10 | 1 : i10;
        this.f6097b = j10;
        this.f6098c = new C4015a0(10);
        this.f6099d = new C4816f0.a();
        this.f6100e = new C5582v();
        this.f6108m = -9223372036854775807L;
        this.f6101f = new C5583w();
        C5570j c5570j = new C5570j();
        this.f6102g = c5570j;
        this.f6105j = c5570j;
    }

    /* renamed from: l */
    public static long m6560l(C3348a c3348a) {
        if (c3348a == null) {
            return -9223372036854775807L;
        }
        int m12414f = c3348a.m12414f();
        for (int i10 = 0; i10 < m12414f; i10++) {
            C3348a.b m12413e = c3348a.m12413e(i10);
            if (m12413e instanceof C4012m) {
                C4012m c4012m = (C4012m) m12413e;
                if (c4012m.f14428h.equals("TLEN")) {
                    return C4041n0.m15396B0(Long.parseLong(c4012m.f14441k.get(0)));
                }
            }
        }
        return -9223372036854775807L;
    }

    /* renamed from: m */
    public static int m6561m(C4015a0 c4015a0, int i10) {
        if (c4015a0.m15232g() >= i10 + 4) {
            c4015a0.m15223T(i10);
            int m15241p = c4015a0.m15241p();
            if (m15241p == 1483304551 || m15241p == 1231971951) {
                return m15241p;
            }
        }
        if (c4015a0.m15232g() < 40) {
            return 0;
        }
        c4015a0.m15223T(36);
        return c4015a0.m15241p() == 1447187017 ? 1447187017 : 0;
    }

    /* renamed from: n */
    public static boolean m6562n(int i10, long j10) {
        return ((long) (i10 & (-128000))) == (j10 & (-128000));
    }

    /* renamed from: o */
    public static /* synthetic */ InterfaceC5571k[] m6563o() {
        return new InterfaceC5571k[]{new C1655f()};
    }

    /* renamed from: p */
    public static /* synthetic */ boolean m6564p(int i10, int i11, int i12, int i13, int i14) {
        return (i11 == 67 && i12 == 79 && i13 == 77 && (i14 == 77 || i10 == 2)) || (i11 == 77 && i12 == 76 && i13 == 76 && (i14 == 84 || i10 == 2));
    }

    /* renamed from: q */
    public static C1652c m6565q(C3348a c3348a, long j10) {
        if (c3348a == null) {
            return null;
        }
        int m12414f = c3348a.m12414f();
        for (int i10 = 0; i10 < m12414f; i10++) {
            C3348a.b m12413e = c3348a.m12413e(i10);
            if (m12413e instanceof C4010k) {
                return C1652c.m6555b(j10, (C4010k) m12413e, m6560l(c3348a));
            }
        }
        return null;
    }

    @Override // p333x3.InterfaceC5571k
    /* renamed from: b */
    public void mo164b(InterfaceC5573m interfaceC5573m) {
        this.f6103h = interfaceC5573m;
        InterfaceC5559b0 mo3032e = interfaceC5573m.mo3032e(0, 1);
        this.f6104i = mo3032e;
        this.f6105j = mo3032e;
        this.f6103h.mo3034n();
    }

    @Override // p333x3.InterfaceC5571k
    /* renamed from: c */
    public void mo165c(long j10, long j11) {
        this.f6106k = 0;
        this.f6108m = -9223372036854775807L;
        this.f6109n = 0L;
        this.f6111p = 0;
        this.f6115t = j11;
        InterfaceC1656g interfaceC1656g = this.f6112q;
        if (!(interfaceC1656g instanceof C1651b) || ((C1651b) interfaceC1656g).m6552b(j11)) {
            return;
        }
        this.f6114s = true;
        this.f6105j = this.f6102g;
    }

    /* renamed from: e */
    public final void m6566e() {
        C4014a.m15202h(this.f6104i);
        C4041n0.m15463j(this.f6103h);
    }

    /* renamed from: f */
    public final InterfaceC1656g m6567f(InterfaceC5572l interfaceC5572l) {
        long m6560l;
        long j10;
        long mo3035d;
        long mo6551e;
        InterfaceC1656g m6571r = m6571r(interfaceC5572l);
        C1652c m6565q = m6565q(this.f6107l, interfaceC5572l.getPosition());
        if (this.f6113r) {
            return new InterfaceC1656g.a();
        }
        if ((this.f6096a & 4) != 0) {
            if (m6565q != null) {
                mo3035d = m6565q.mo3035d();
                mo6551e = m6565q.mo6551e();
            } else if (m6571r != null) {
                mo3035d = m6571r.mo3035d();
                mo6551e = m6571r.mo6551e();
            } else {
                m6560l = m6560l(this.f6107l);
                j10 = -1;
                m6571r = new C1651b(m6560l, interfaceC5572l.getPosition(), j10);
            }
            j10 = mo6551e;
            m6560l = mo3035d;
            m6571r = new C1651b(m6560l, interfaceC5572l.getPosition(), j10);
        } else if (m6565q != null) {
            m6571r = m6565q;
        } else if (m6571r == null) {
            m6571r = null;
        }
        if (m6571r == null || !(m6571r.mo3036f() || (this.f6096a & 1) == 0)) {
            return m6570k(interfaceC5572l, (this.f6096a & 2) != 0);
        }
        return m6571r;
    }

    @Override // p333x3.InterfaceC5571k
    /* renamed from: g */
    public int mo169g(InterfaceC5572l interfaceC5572l, C5585y c5585y) {
        m6566e();
        int m6573t = m6573t(interfaceC5572l);
        if (m6573t == -1 && (this.f6112q instanceof C1651b)) {
            long m6568i = m6568i(this.f6109n);
            if (this.f6112q.mo3035d() != m6568i) {
                ((C1651b) this.f6112q).m6554g(m6568i);
                this.f6103h.mo3033j(this.f6112q);
            }
        }
        return m6573t;
    }

    @Override // p333x3.InterfaceC5571k
    /* renamed from: h */
    public boolean mo170h(InterfaceC5572l interfaceC5572l) {
        return m6575v(interfaceC5572l, true);
    }

    /* renamed from: i */
    public final long m6568i(long j10) {
        return this.f6108m + ((j10 * 1000000) / this.f6099d.f18047d);
    }

    /* renamed from: j */
    public void m6569j() {
        this.f6113r = true;
    }

    /* renamed from: k */
    public final InterfaceC1656g m6570k(InterfaceC5572l interfaceC5572l, boolean z10) {
        interfaceC5572l.mo22430p(this.f6098c.m15230e(), 0, 4);
        this.f6098c.m15223T(0);
        this.f6099d.m19063a(this.f6098c.m15241p());
        return new C1650a(interfaceC5572l.mo3029b(), interfaceC5572l.getPosition(), this.f6099d, z10);
    }

    /* renamed from: r */
    public final InterfaceC1656g m6571r(InterfaceC5572l interfaceC5572l) {
        C4015a0 c4015a0 = new C4015a0(this.f6099d.f18046c);
        interfaceC5572l.mo22430p(c4015a0.m15230e(), 0, this.f6099d.f18046c);
        C4816f0.a aVar = this.f6099d;
        int i10 = aVar.f18044a & 1;
        int i11 = 21;
        int i12 = aVar.f18048e;
        if (i10 != 0) {
            if (i12 != 1) {
                i11 = 36;
            }
        } else if (i12 == 1) {
            i11 = 13;
        }
        int i13 = i11;
        int m6561m = m6561m(c4015a0, i13);
        if (m6561m != 1483304551 && m6561m != 1231971951) {
            if (m6561m != 1447187017) {
                interfaceC5572l.mo22427l();
                return null;
            }
            C1657h m6576b = C1657h.m6576b(interfaceC5572l.mo3029b(), interfaceC5572l.getPosition(), this.f6099d, c4015a0);
            interfaceC5572l.mo22428m(this.f6099d.f18046c);
            return m6576b;
        }
        C1658i m6577b = C1658i.m6577b(interfaceC5572l.mo3029b(), interfaceC5572l.getPosition(), this.f6099d, c4015a0);
        if (m6577b != null && !this.f6100e.m22498a()) {
            interfaceC5572l.mo22427l();
            interfaceC5572l.mo22425h(i13 + 141);
            interfaceC5572l.mo22430p(this.f6098c.m15230e(), 0, 3);
            this.f6098c.m15223T(0);
            this.f6100e.m22501d(this.f6098c.m15213J());
        }
        interfaceC5572l.mo22428m(this.f6099d.f18046c);
        return (m6577b == null || m6577b.mo3036f() || m6561m != 1231971951) ? m6577b : m6570k(interfaceC5572l, false);
    }

    @Override // p333x3.InterfaceC5571k
    public void release() {
    }

    /* renamed from: s */
    public final boolean m6572s(InterfaceC5572l interfaceC5572l) {
        InterfaceC1656g interfaceC1656g = this.f6112q;
        if (interfaceC1656g != null) {
            long mo6551e = interfaceC1656g.mo6551e();
            if (mo6551e != -1 && interfaceC5572l.mo3030f() > mo6551e - 4) {
                return true;
            }
        }
        try {
            return !interfaceC5572l.mo22424e(this.f6098c.m15230e(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    /* renamed from: t */
    public final int m6573t(InterfaceC5572l interfaceC5572l) {
        if (this.f6106k == 0) {
            try {
                m6575v(interfaceC5572l, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.f6112q == null) {
            InterfaceC1656g m6567f = m6567f(interfaceC5572l);
            this.f6112q = m6567f;
            this.f6103h.mo3033j(m6567f);
            this.f6105j.mo4852b(new C4463m1.b().m17474g0(this.f6099d.f18045b).m17466Y(4096).m17451J(this.f6099d.f18048e).m17475h0(this.f6099d.f18047d).m17457P(this.f6100e.f20955a).m17458Q(this.f6100e.f20956b).m17467Z((this.f6096a & 8) != 0 ? null : this.f6107l).m17448G());
            this.f6110o = interfaceC5572l.getPosition();
        } else if (this.f6110o != 0) {
            long position = interfaceC5572l.getPosition();
            long j10 = this.f6110o;
            if (position < j10) {
                interfaceC5572l.mo22428m((int) (j10 - position));
            }
        }
        return m6574u(interfaceC5572l);
    }

    /* renamed from: u */
    public final int m6574u(InterfaceC5572l interfaceC5572l) {
        if (this.f6111p == 0) {
            interfaceC5572l.mo22427l();
            if (m6572s(interfaceC5572l)) {
                return -1;
            }
            this.f6098c.m15223T(0);
            int m15241p = this.f6098c.m15241p();
            if (!m6562n(m15241p, this.f6106k) || C4816f0.m19059j(m15241p) == -1) {
                interfaceC5572l.mo22428m(1);
                this.f6106k = 0;
                return 0;
            }
            this.f6099d.m19063a(m15241p);
            if (this.f6108m == -9223372036854775807L) {
                this.f6108m = this.f6112q.mo6550a(interfaceC5572l.getPosition());
                if (this.f6097b != -9223372036854775807L) {
                    this.f6108m += this.f6097b - this.f6112q.mo6550a(0L);
                }
            }
            this.f6111p = this.f6099d.f18046c;
            InterfaceC1656g interfaceC1656g = this.f6112q;
            if (interfaceC1656g instanceof C1651b) {
                C1651b c1651b = (C1651b) interfaceC1656g;
                c1651b.m6553c(m6568i(this.f6109n + r0.f18050g), interfaceC5572l.getPosition() + this.f6099d.f18046c);
                if (this.f6114s && c1651b.m6552b(this.f6115t)) {
                    this.f6114s = false;
                    this.f6105j = this.f6104i;
                }
            }
        }
        int m22407c = this.f6105j.m22407c(interfaceC5572l, this.f6111p, true);
        if (m22407c == -1) {
            return -1;
        }
        int i10 = this.f6111p - m22407c;
        this.f6111p = i10;
        if (i10 > 0) {
            return 0;
        }
        this.f6105j.mo4851a(m6568i(this.f6109n), 1, this.f6099d.f18046c, 0, null);
        this.f6109n += this.f6099d.f18050g;
        this.f6111p = 0;
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x009e, code lost:
    
        if (r13 == false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a0, code lost:
    
        r12.mo22428m(r1 + r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00a8, code lost:
    
        r11.f6106k = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00aa, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00a5, code lost:
    
        r12.mo22427l();
     */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m6575v(p333x3.InterfaceC5572l r12, boolean r13) {
        /*
            r11 = this;
            if (r13 == 0) goto L6
            r0 = 32768(0x8000, float:4.5918E-41)
            goto L8
        L6:
            r0 = 131072(0x20000, float:1.83671E-40)
        L8:
            r12.mo22427l()
            long r1 = r12.getPosition()
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r2 = 0
            r3 = 1
            r4 = 0
            if (r1 != 0) goto L42
            int r1 = r11.f6096a
            r1 = r1 & 8
            if (r1 != 0) goto L20
            r1 = r3
            goto L21
        L20:
            r1 = r4
        L21:
            if (r1 == 0) goto L25
            r1 = r2
            goto L27
        L25:
            p4.h$a r1 = p062e4.C1655f.f6095v
        L27:
            x3.w r5 = r11.f6101f
            k4.a r1 = r5.m22502a(r12, r1)
            r11.f6107l = r1
            if (r1 == 0) goto L36
            x3.v r5 = r11.f6100e
            r5.m22500c(r1)
        L36:
            long r5 = r12.mo3030f()
            int r1 = (int) r5
            if (r13 != 0) goto L40
            r12.mo22428m(r1)
        L40:
            r5 = r4
            goto L44
        L42:
            r1 = r4
            r5 = r1
        L44:
            r6 = r5
            r7 = r6
        L46:
            boolean r8 = r11.m6572s(r12)
            if (r8 == 0) goto L55
            if (r6 <= 0) goto L4f
            goto L9e
        L4f:
            java.io.EOFException r12 = new java.io.EOFException
            r12.<init>()
            throw r12
        L55:
            p5.a0 r8 = r11.f6098c
            r8.m15223T(r4)
            p5.a0 r8 = r11.f6098c
            int r8 = r8.m15241p()
            if (r5 == 0) goto L69
            long r9 = (long) r5
            boolean r9 = m6562n(r8, r9)
            if (r9 == 0) goto L70
        L69:
            int r9 = p289u3.C4816f0.m19059j(r8)
            r10 = -1
            if (r9 != r10) goto L90
        L70:
            int r5 = r7 + 1
            if (r7 != r0) goto L7e
            if (r13 == 0) goto L77
            return r4
        L77:
            java.lang.String r12 = "Searched too many bytes."
            s3.t2 r12 = p264s3.C4499t2.m17594a(r12, r2)
            throw r12
        L7e:
            if (r13 == 0) goto L89
            r12.mo22427l()
            int r6 = r1 + r5
            r12.mo22425h(r6)
            goto L8c
        L89:
            r12.mo22428m(r3)
        L8c:
            r6 = r4
            r7 = r5
            r5 = r6
            goto L46
        L90:
            int r6 = r6 + 1
            if (r6 != r3) goto L9b
            u3.f0$a r5 = r11.f6099d
            r5.m19063a(r8)
            r5 = r8
            goto Lab
        L9b:
            r8 = 4
            if (r6 != r8) goto Lab
        L9e:
            if (r13 == 0) goto La5
            int r1 = r1 + r7
            r12.mo22428m(r1)
            goto La8
        La5:
            r12.mo22427l()
        La8:
            r11.f6106k = r5
            return r3
        Lab:
            int r9 = r9 + (-4)
            r12.mo22425h(r9)
            goto L46
        */
        throw new UnsupportedOperationException("Method not decompiled: p062e4.C1655f.m6575v(x3.l, boolean):boolean");
    }
}
