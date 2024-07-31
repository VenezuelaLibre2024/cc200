package p019b4;

import p222p5.C4014a;
import p222p5.C4015a0;
import p333x3.C5585y;
import p333x3.InterfaceC5571k;
import p333x3.InterfaceC5572l;
import p333x3.InterfaceC5573m;
import p333x3.InterfaceC5576p;
import p333x3.InterfaceC5586z;

/* renamed from: b4.c */
/* loaded from: classes.dex */
public final class C0476c implements InterfaceC5571k {

    /* renamed from: q */
    public static final InterfaceC5576p f2245q = new InterfaceC5576p() { // from class: b4.b
        @Override // p333x3.InterfaceC5576p
        /* renamed from: b */
        public final InterfaceC5571k[] mo161b() {
            InterfaceC5571k[] m2391f;
            m2391f = C0476c.m2391f();
            return m2391f;
        }
    };

    /* renamed from: f */
    public InterfaceC5573m f2251f;

    /* renamed from: h */
    public boolean f2253h;

    /* renamed from: i */
    public long f2254i;

    /* renamed from: j */
    public int f2255j;

    /* renamed from: k */
    public int f2256k;

    /* renamed from: l */
    public int f2257l;

    /* renamed from: m */
    public long f2258m;

    /* renamed from: n */
    public boolean f2259n;

    /* renamed from: o */
    public C0474a f2260o;

    /* renamed from: p */
    public C0479f f2261p;

    /* renamed from: a */
    public final C4015a0 f2246a = new C4015a0(4);

    /* renamed from: b */
    public final C4015a0 f2247b = new C4015a0(9);

    /* renamed from: c */
    public final C4015a0 f2248c = new C4015a0(11);

    /* renamed from: d */
    public final C4015a0 f2249d = new C4015a0();

    /* renamed from: e */
    public final C0477d f2250e = new C0477d();

    /* renamed from: g */
    public int f2252g = 1;

    /* renamed from: f */
    public static /* synthetic */ InterfaceC5571k[] m2391f() {
        return new InterfaceC5571k[]{new C0476c()};
    }

    @Override // p333x3.InterfaceC5571k
    /* renamed from: b */
    public void mo164b(InterfaceC5573m interfaceC5573m) {
        this.f2251f = interfaceC5573m;
    }

    @Override // p333x3.InterfaceC5571k
    /* renamed from: c */
    public void mo165c(long j10, long j11) {
        if (j10 == 0) {
            this.f2252g = 1;
            this.f2253h = false;
        } else {
            this.f2252g = 3;
        }
        this.f2255j = 0;
    }

    /* renamed from: d */
    public final void m2392d() {
        if (this.f2259n) {
            return;
        }
        this.f2251f.mo3033j(new InterfaceC5586z.b(-9223372036854775807L));
        this.f2259n = true;
    }

    /* renamed from: e */
    public final long m2393e() {
        if (this.f2253h) {
            return this.f2254i + this.f2258m;
        }
        if (this.f2250e.m2408d() == -9223372036854775807L) {
            return 0L;
        }
        return this.f2258m;
    }

    @Override // p333x3.InterfaceC5571k
    /* renamed from: g */
    public int mo169g(InterfaceC5572l interfaceC5572l, C5585y c5585y) {
        C4014a.m15202h(this.f2251f);
        while (true) {
            int i10 = this.f2252g;
            if (i10 != 1) {
                if (i10 == 2) {
                    m2398m(interfaceC5572l);
                } else if (i10 != 3) {
                    if (i10 != 4) {
                        throw new IllegalStateException();
                    }
                    if (m2396k(interfaceC5572l)) {
                        return 0;
                    }
                } else if (!m2397l(interfaceC5572l)) {
                    return -1;
                }
            } else if (!m2395j(interfaceC5572l)) {
                return -1;
            }
        }
    }

    @Override // p333x3.InterfaceC5571k
    /* renamed from: h */
    public boolean mo170h(InterfaceC5572l interfaceC5572l) {
        interfaceC5572l.mo22430p(this.f2246a.m15230e(), 0, 3);
        this.f2246a.m15223T(0);
        if (this.f2246a.m15213J() != 4607062) {
            return false;
        }
        interfaceC5572l.mo22430p(this.f2246a.m15230e(), 0, 2);
        this.f2246a.m15223T(0);
        if ((this.f2246a.m15216M() & 250) != 0) {
            return false;
        }
        interfaceC5572l.mo22430p(this.f2246a.m15230e(), 0, 4);
        this.f2246a.m15223T(0);
        int m15241p = this.f2246a.m15241p();
        interfaceC5572l.mo22427l();
        interfaceC5572l.mo22425h(m15241p);
        interfaceC5572l.mo22430p(this.f2246a.m15230e(), 0, 4);
        this.f2246a.m15223T(0);
        return this.f2246a.m15241p() == 0;
    }

    /* renamed from: i */
    public final C4015a0 m2394i(InterfaceC5572l interfaceC5572l) {
        if (this.f2257l > this.f2249d.m15227b()) {
            C4015a0 c4015a0 = this.f2249d;
            c4015a0.m15221R(new byte[Math.max(c4015a0.m15227b() * 2, this.f2257l)], 0);
        } else {
            this.f2249d.m15223T(0);
        }
        this.f2249d.m15222S(this.f2257l);
        interfaceC5572l.readFully(this.f2249d.m15230e(), 0, this.f2257l);
        return this.f2249d;
    }

    /* renamed from: j */
    public final boolean m2395j(InterfaceC5572l interfaceC5572l) {
        if (!interfaceC5572l.mo22423d(this.f2247b.m15230e(), 0, 9, true)) {
            return false;
        }
        this.f2247b.m15223T(0);
        this.f2247b.m15224U(4);
        int m15210G = this.f2247b.m15210G();
        boolean z10 = (m15210G & 4) != 0;
        boolean z11 = (m15210G & 1) != 0;
        if (z10 && this.f2260o == null) {
            this.f2260o = new C0474a(this.f2251f.mo3032e(8, 1));
        }
        if (z11 && this.f2261p == null) {
            this.f2261p = new C0479f(this.f2251f.mo3032e(9, 2));
        }
        this.f2251f.mo3034n();
        this.f2255j = (this.f2247b.m15241p() - 9) + 4;
        this.f2252g = 2;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0071 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0083  */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m2396k(p333x3.InterfaceC5572l r10) {
        /*
            r9 = this;
            long r0 = r9.m2393e()
            int r2 = r9.f2256k
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = 0
            r6 = 1
            r7 = 8
            if (r2 != r7) goto L24
            b4.a r7 = r9.f2260o
            if (r7 == 0) goto L24
            r9.m2392d()
            b4.a r2 = r9.f2260o
        L1a:
            p5.a0 r10 = r9.m2394i(r10)
            boolean r5 = r2.m2411a(r10, r0)
        L22:
            r10 = r6
            goto L6d
        L24:
            r7 = 9
            if (r2 != r7) goto L32
            b4.f r7 = r9.f2261p
            if (r7 == 0) goto L32
            r9.m2392d()
            b4.f r2 = r9.f2261p
            goto L1a
        L32:
            r7 = 18
            if (r2 != r7) goto L67
            boolean r2 = r9.f2259n
            if (r2 != 0) goto L67
            b4.d r2 = r9.f2250e
            p5.a0 r10 = r9.m2394i(r10)
            boolean r5 = r2.m2411a(r10, r0)
            b4.d r10 = r9.f2250e
            long r0 = r10.m2408d()
            int r10 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r10 == 0) goto L22
            x3.m r10 = r9.f2251f
            x3.x r2 = new x3.x
            b4.d r7 = r9.f2250e
            long[] r7 = r7.m2409e()
            b4.d r8 = r9.f2250e
            long[] r8 = r8.m2410f()
            r2.<init>(r7, r8, r0)
            r10.mo3033j(r2)
            r9.f2259n = r6
            goto L22
        L67:
            int r0 = r9.f2257l
            r10.mo22428m(r0)
            r10 = r5
        L6d:
            boolean r0 = r9.f2253h
            if (r0 != 0) goto L87
            if (r5 == 0) goto L87
            r9.f2253h = r6
            b4.d r0 = r9.f2250e
            long r0 = r0.m2408d()
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L83
            long r0 = r9.f2258m
            long r0 = -r0
            goto L85
        L83:
            r0 = 0
        L85:
            r9.f2254i = r0
        L87:
            r0 = 4
            r9.f2255j = r0
            r0 = 2
            r9.f2252g = r0
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p019b4.C0476c.m2396k(x3.l):boolean");
    }

    /* renamed from: l */
    public final boolean m2397l(InterfaceC5572l interfaceC5572l) {
        if (!interfaceC5572l.mo22423d(this.f2248c.m15230e(), 0, 11, true)) {
            return false;
        }
        this.f2248c.m15223T(0);
        this.f2256k = this.f2248c.m15210G();
        this.f2257l = this.f2248c.m15213J();
        this.f2258m = this.f2248c.m15213J();
        this.f2258m = ((this.f2248c.m15210G() << 24) | this.f2258m) * 1000;
        this.f2248c.m15224U(3);
        this.f2252g = 4;
        return true;
    }

    /* renamed from: m */
    public final void m2398m(InterfaceC5572l interfaceC5572l) {
        interfaceC5572l.mo22428m(this.f2255j);
        this.f2255j = 0;
        this.f2252g = 3;
    }

    @Override // p333x3.InterfaceC5571k
    public void release() {
    }
}
