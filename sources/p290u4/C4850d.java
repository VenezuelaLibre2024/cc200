package p290u4;

import p193n5.InterfaceC3752s;
import p222p5.C4014a;
import p222p5.C4041n0;
import p222p5.C4050v;
import p264s3.C4463m1;
import p264s3.C4465m3;
import p264s3.C4468n1;
import p290u4.InterfaceC4878r;
import p304v3.C5110g;

/* renamed from: u4.d */
/* loaded from: classes.dex */
public final class C4850d implements InterfaceC4878r, InterfaceC4878r.a {

    /* renamed from: h */
    public final InterfaceC4878r f18223h;

    /* renamed from: i */
    public InterfaceC4878r.a f18224i;

    /* renamed from: j */
    public a[] f18225j = new a[0];

    /* renamed from: k */
    public long f18226k;

    /* renamed from: l */
    public long f18227l;

    /* renamed from: m */
    public long f18228m;

    /* renamed from: u4.d$a */
    /* loaded from: classes.dex */
    public final class a implements InterfaceC4869m0 {

        /* renamed from: h */
        public final InterfaceC4869m0 f18229h;

        /* renamed from: i */
        public boolean f18230i;

        public a(InterfaceC4869m0 interfaceC4869m0) {
            this.f18229h = interfaceC4869m0;
        }

        @Override // p290u4.InterfaceC4869m0
        /* renamed from: a */
        public void mo19250a() {
            this.f18229h.mo19250a();
        }

        /* renamed from: b */
        public void m19251b() {
            this.f18230i = false;
        }

        @Override // p290u4.InterfaceC4869m0
        /* renamed from: e */
        public boolean mo19252e() {
            return !C4850d.this.m19247n() && this.f18229h.mo19252e();
        }

        @Override // p290u4.InterfaceC4869m0
        /* renamed from: j */
        public int mo19253j(C4468n1 c4468n1, C5110g c5110g, int i10) {
            if (C4850d.this.m19247n()) {
                return -3;
            }
            if (this.f18230i) {
                c5110g.m20752u(4);
                return -4;
            }
            int mo19253j = this.f18229h.mo19253j(c4468n1, c5110g, i10);
            if (mo19253j == -5) {
                C4463m1 c4463m1 = (C4463m1) C4014a.m15199e(c4468n1.f16559b);
                int i11 = c4463m1.f16488I;
                if (i11 != 0 || c4463m1.f16489J != 0) {
                    C4850d c4850d = C4850d.this;
                    if (c4850d.f18227l != 0) {
                        i11 = 0;
                    }
                    c4468n1.f16559b = c4463m1.m17411b().m17457P(i11).m17458Q(c4850d.f18228m == Long.MIN_VALUE ? c4463m1.f16489J : 0).m17448G();
                }
                return -5;
            }
            C4850d c4850d2 = C4850d.this;
            long j10 = c4850d2.f18228m;
            if (j10 == Long.MIN_VALUE || ((mo19253j != -4 || c5110g.f19286l < j10) && !(mo19253j == -3 && c4850d2.mo4789f() == Long.MIN_VALUE && !c5110g.f19285k))) {
                return mo19253j;
            }
            c5110g.mo6366l();
            c5110g.m20752u(4);
            this.f18230i = true;
            return -4;
        }

        @Override // p290u4.InterfaceC4869m0
        /* renamed from: n */
        public int mo19254n(long j10) {
            if (C4850d.this.m19247n()) {
                return -3;
            }
            return this.f18229h.mo19254n(j10);
        }
    }

    public C4850d(InterfaceC4878r interfaceC4878r, boolean z10, long j10, long j11) {
        this.f18223h = interfaceC4878r;
        this.f18226k = z10 ? j10 : -9223372036854775807L;
        this.f18227l = j10;
        this.f18228m = j11;
    }

    /* renamed from: r */
    public static boolean m19245r(long j10, InterfaceC3752s[] interfaceC3752sArr) {
        if (j10 != 0) {
            for (InterfaceC3752s interfaceC3752s : interfaceC3752sArr) {
                if (interfaceC3752s != null) {
                    C4463m1 mo14093o = interfaceC3752s.mo14093o();
                    if (!C4050v.m15544a(mo14093o.f16506s, mo14093o.f16503p)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // p290u4.InterfaceC4878r, p290u4.InterfaceC4871n0
    /* renamed from: b */
    public long mo4785b() {
        long mo4785b = this.f18223h.mo4785b();
        if (mo4785b != Long.MIN_VALUE) {
            long j10 = this.f18228m;
            if (j10 == Long.MIN_VALUE || mo4785b < j10) {
                return mo4785b;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // p290u4.InterfaceC4878r, p290u4.InterfaceC4871n0
    /* renamed from: c */
    public boolean mo4786c(long j10) {
        return this.f18223h.mo4786c(j10);
    }

    @Override // p290u4.InterfaceC4878r
    /* renamed from: d */
    public long mo4787d(long j10, C4465m3 c4465m3) {
        long j11 = this.f18227l;
        if (j10 == j11) {
            return j11;
        }
        return this.f18223h.mo4787d(j10, m19246h(j10, c4465m3));
    }

    @Override // p290u4.InterfaceC4878r, p290u4.InterfaceC4871n0
    /* renamed from: f */
    public long mo4789f() {
        long mo4789f = this.f18223h.mo4789f();
        if (mo4789f != Long.MIN_VALUE) {
            long j10 = this.f18228m;
            if (j10 == Long.MIN_VALUE || mo4789f < j10) {
                return mo4789f;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // p290u4.InterfaceC4878r, p290u4.InterfaceC4871n0
    /* renamed from: g */
    public void mo4790g(long j10) {
        this.f18223h.mo4790g(j10);
    }

    /* renamed from: h */
    public final C4465m3 m19246h(long j10, C4465m3 c4465m3) {
        long m15479r = C4041n0.m15479r(c4465m3.f16554a, 0L, j10 - this.f18227l);
        long j11 = c4465m3.f16555b;
        long j12 = this.f18228m;
        long m15479r2 = C4041n0.m15479r(j11, 0L, j12 == Long.MIN_VALUE ? Long.MAX_VALUE : j12 - j10);
        return (m15479r == c4465m3.f16554a && m15479r2 == c4465m3.f16555b) ? c4465m3 : new C4465m3(m15479r, m15479r2);
    }

    @Override // p290u4.InterfaceC4878r
    /* renamed from: i */
    public void mo4792i(InterfaceC4878r.a aVar, long j10) {
        this.f18224i = aVar;
        this.f18223h.mo4792i(this, j10);
    }

    @Override // p290u4.InterfaceC4878r, p290u4.InterfaceC4871n0
    public boolean isLoading() {
        return this.f18223h.isLoading();
    }

    @Override // p290u4.InterfaceC4878r.a
    /* renamed from: k */
    public void mo17309k(InterfaceC4878r interfaceC4878r) {
        ((InterfaceC4878r.a) C4014a.m15199e(this.f18224i)).mo17309k(this);
    }

    @Override // p290u4.InterfaceC4878r
    /* renamed from: l */
    public void mo4793l() {
        this.f18223h.mo4793l();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0032, code lost:
    
        if (r0 > r6) goto L17;
     */
    @Override // p290u4.InterfaceC4878r
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long mo4794m(long r6) {
        /*
            r5 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5.f18226k = r0
            u4.d$a[] r0 = r5.f18225j
            int r1 = r0.length
            r2 = 0
            r3 = r2
        Lc:
            if (r3 >= r1) goto L18
            r4 = r0[r3]
            if (r4 == 0) goto L15
            r4.m19251b()
        L15:
            int r3 = r3 + 1
            goto Lc
        L18:
            u4.r r0 = r5.f18223h
            long r0 = r0.mo4794m(r6)
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 == 0) goto L34
            long r6 = r5.f18227l
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 < 0) goto L35
            long r6 = r5.f18228m
            r3 = -9223372036854775808
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 == 0) goto L34
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 > 0) goto L35
        L34:
            r2 = 1
        L35:
            p222p5.C4014a.m15200f(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p290u4.C4850d.mo4794m(long):long");
    }

    /* renamed from: n */
    public boolean m19247n() {
        return this.f18226k != -9223372036854775807L;
    }

    @Override // p290u4.InterfaceC4871n0.a
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public void mo4788e(InterfaceC4878r interfaceC4878r) {
        ((InterfaceC4878r.a) C4014a.m15199e(this.f18224i)).mo4788e(this);
    }

    @Override // p290u4.InterfaceC4878r
    /* renamed from: p */
    public long mo4795p() {
        if (m19247n()) {
            long j10 = this.f18226k;
            this.f18226k = -9223372036854775807L;
            long mo4795p = mo4795p();
            return mo4795p != -9223372036854775807L ? mo4795p : j10;
        }
        long mo4795p2 = this.f18223h.mo4795p();
        if (mo4795p2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        boolean z10 = true;
        C4014a.m15200f(mo4795p2 >= this.f18227l);
        long j11 = this.f18228m;
        if (j11 != Long.MIN_VALUE && mo4795p2 > j11) {
            z10 = false;
        }
        C4014a.m15200f(z10);
        return mo4795p2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0062, code lost:
    
        if (r2 > r4) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006e  */
    @Override // p290u4.InterfaceC4878r
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long mo4796q(p193n5.InterfaceC3752s[] r13, boolean[] r14, p290u4.InterfaceC4869m0[] r15, boolean[] r16, long r17) {
        /*
            r12 = this;
            r0 = r12
            r1 = r15
            int r2 = r1.length
            u4.d$a[] r2 = new p290u4.C4850d.a[r2]
            r0.f18225j = r2
            int r2 = r1.length
            u4.m0[] r9 = new p290u4.InterfaceC4869m0[r2]
            r10 = 0
            r2 = r10
        Lc:
            int r3 = r1.length
            r11 = 0
            if (r2 >= r3) goto L25
            u4.d$a[] r3 = r0.f18225j
            r4 = r1[r2]
            u4.d$a r4 = (p290u4.C4850d.a) r4
            r3[r2] = r4
            r4 = r3[r2]
            if (r4 == 0) goto L20
            r3 = r3[r2]
            u4.m0 r11 = r3.f18229h
        L20:
            r9[r2] = r11
            int r2 = r2 + 1
            goto Lc
        L25:
            u4.r r2 = r0.f18223h
            r3 = r13
            r4 = r14
            r5 = r9
            r6 = r16
            r7 = r17
            long r2 = r2.mo4796q(r3, r4, r5, r6, r7)
            boolean r4 = r12.m19247n()
            if (r4 == 0) goto L47
            long r4 = r0.f18227l
            int r6 = (r17 > r4 ? 1 : (r17 == r4 ? 0 : -1))
            if (r6 != 0) goto L47
            r6 = r13
            boolean r4 = m19245r(r4, r13)
            if (r4 == 0) goto L47
            r4 = r2
            goto L4c
        L47:
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L4c:
            r0.f18226k = r4
            int r4 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r4 == 0) goto L67
            long r4 = r0.f18227l
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 < 0) goto L65
            long r4 = r0.f18228m
            r6 = -9223372036854775808
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 == 0) goto L67
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 > 0) goto L65
            goto L67
        L65:
            r4 = r10
            goto L68
        L67:
            r4 = 1
        L68:
            p222p5.C4014a.m15200f(r4)
        L6b:
            int r4 = r1.length
            if (r10 >= r4) goto L97
            r4 = r9[r10]
            if (r4 != 0) goto L77
            u4.d$a[] r4 = r0.f18225j
            r4[r10] = r11
            goto L8e
        L77:
            u4.d$a[] r4 = r0.f18225j
            r5 = r4[r10]
            if (r5 == 0) goto L85
            r5 = r4[r10]
            u4.m0 r5 = r5.f18229h
            r6 = r9[r10]
            if (r5 == r6) goto L8e
        L85:
            u4.d$a r5 = new u4.d$a
            r6 = r9[r10]
            r5.<init>(r6)
            r4[r10] = r5
        L8e:
            u4.d$a[] r4 = r0.f18225j
            r4 = r4[r10]
            r1[r10] = r4
            int r10 = r10 + 1
            goto L6b
        L97:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p290u4.C4850d.mo4796q(n5.s[], boolean[], u4.m0[], boolean[], long):long");
    }

    @Override // p290u4.InterfaceC4878r
    /* renamed from: s */
    public C4885u0 mo4798s() {
        return this.f18223h.mo4798s();
    }

    @Override // p290u4.InterfaceC4878r
    /* renamed from: t */
    public void mo4799t(long j10, boolean z10) {
        this.f18223h.mo4799t(j10, z10);
    }

    /* renamed from: u */
    public void m19249u(long j10, long j11) {
        this.f18227l = j10;
        this.f18228m = j11;
    }
}
