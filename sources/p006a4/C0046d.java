package p006a4;

import p152k4.C3348a;
import p222p5.C4014a;
import p222p5.C4015a0;
import p222p5.C4041n0;
import p333x3.C5577q;
import p333x3.C5578r;
import p333x3.C5579s;
import p333x3.C5580t;
import p333x3.C5585y;
import p333x3.InterfaceC5559b0;
import p333x3.InterfaceC5571k;
import p333x3.InterfaceC5572l;
import p333x3.InterfaceC5573m;
import p333x3.InterfaceC5576p;
import p333x3.InterfaceC5586z;

/* renamed from: a4.d */
/* loaded from: classes.dex */
public final class C0046d implements InterfaceC5571k {

    /* renamed from: o */
    public static final InterfaceC5576p f79o = new InterfaceC5576p() { // from class: a4.c
        @Override // p333x3.InterfaceC5576p
        /* renamed from: b */
        public final InterfaceC5571k[] mo161b() {
            InterfaceC5571k[] m163j;
            m163j = C0046d.m163j();
            return m163j;
        }
    };

    /* renamed from: a */
    public final byte[] f80a;

    /* renamed from: b */
    public final C4015a0 f81b;

    /* renamed from: c */
    public final boolean f82c;

    /* renamed from: d */
    public final C5577q.a f83d;

    /* renamed from: e */
    public InterfaceC5573m f84e;

    /* renamed from: f */
    public InterfaceC5559b0 f85f;

    /* renamed from: g */
    public int f86g;

    /* renamed from: h */
    public C3348a f87h;

    /* renamed from: i */
    public C5580t f88i;

    /* renamed from: j */
    public int f89j;

    /* renamed from: k */
    public int f90k;

    /* renamed from: l */
    public C0044b f91l;

    /* renamed from: m */
    public int f92m;

    /* renamed from: n */
    public long f93n;

    public C0046d() {
        this(0);
    }

    public C0046d(int i10) {
        this.f80a = new byte[42];
        this.f81b = new C4015a0(new byte[32768], 0);
        this.f82c = (i10 & 1) != 0;
        this.f83d = new C5577q.a();
        this.f86g = 0;
    }

    /* renamed from: j */
    public static /* synthetic */ InterfaceC5571k[] m163j() {
        return new InterfaceC5571k[]{new C0046d()};
    }

    @Override // p333x3.InterfaceC5571k
    /* renamed from: b */
    public void mo164b(InterfaceC5573m interfaceC5573m) {
        this.f84e = interfaceC5573m;
        this.f85f = interfaceC5573m.mo3032e(0, 1);
        interfaceC5573m.mo3034n();
    }

    @Override // p333x3.InterfaceC5571k
    /* renamed from: c */
    public void mo165c(long j10, long j11) {
        if (j10 == 0) {
            this.f86g = 0;
        } else {
            C0044b c0044b = this.f91l;
            if (c0044b != null) {
                c0044b.m22374h(j11);
            }
        }
        this.f93n = j11 != 0 ? -1L : 0L;
        this.f92m = 0;
        this.f81b.m15219P(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0020, code lost:
    
        r5.m15223T(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        return r4.f83d.f20935a;
     */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long m166d(p222p5.C4015a0 r5, boolean r6) {
        /*
            r4 = this;
            x3.t r0 = r4.f88i
            p222p5.C4014a.m15199e(r0)
            int r0 = r5.m15231f()
        L9:
            int r1 = r5.m15232g()
            int r1 = r1 + (-16)
            if (r0 > r1) goto L2b
            r5.m15223T(r0)
            x3.t r1 = r4.f88i
            int r2 = r4.f90k
            x3.q$a r3 = r4.f83d
            boolean r1 = p333x3.C5577q.m22470d(r5, r1, r2, r3)
            if (r1 == 0) goto L28
        L20:
            r5.m15223T(r0)
            x3.q$a r5 = r4.f83d
            long r5 = r5.f20935a
            return r5
        L28:
            int r0 = r0 + 1
            goto L9
        L2b:
            if (r6 == 0) goto L60
        L2d:
            int r6 = r5.m15232g()
            int r1 = r4.f89j
            int r6 = r6 - r1
            if (r0 > r6) goto L58
            r5.m15223T(r0)
            r6 = 0
            x3.t r1 = r4.f88i     // Catch: java.lang.IndexOutOfBoundsException -> L45
            int r2 = r4.f90k     // Catch: java.lang.IndexOutOfBoundsException -> L45
            x3.q$a r3 = r4.f83d     // Catch: java.lang.IndexOutOfBoundsException -> L45
            boolean r1 = p333x3.C5577q.m22470d(r5, r1, r2, r3)     // Catch: java.lang.IndexOutOfBoundsException -> L45
            goto L46
        L45:
            r1 = r6
        L46:
            int r2 = r5.m15231f()
            int r3 = r5.m15232g()
            if (r2 <= r3) goto L51
            goto L52
        L51:
            r6 = r1
        L52:
            if (r6 == 0) goto L55
            goto L20
        L55:
            int r0 = r0 + 1
            goto L2d
        L58:
            int r6 = r5.m15232g()
            r5.m15223T(r6)
            goto L63
        L60:
            r5.m15223T(r0)
        L63:
            r5 = -1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p006a4.C0046d.m166d(p5.a0, boolean):long");
    }

    /* renamed from: e */
    public final void m167e(InterfaceC5572l interfaceC5572l) {
        this.f90k = C5578r.m22478b(interfaceC5572l);
        ((InterfaceC5573m) C4041n0.m15463j(this.f84e)).mo3033j(m168f(interfaceC5572l.getPosition(), interfaceC5572l.mo3029b()));
        this.f86g = 5;
    }

    /* renamed from: f */
    public final InterfaceC5586z m168f(long j10, long j11) {
        C4014a.m15199e(this.f88i);
        C5580t c5580t = this.f88i;
        if (c5580t.f20949k != null) {
            return new C5579s(c5580t, j10);
        }
        if (j11 == -1 || c5580t.f20948j <= 0) {
            return new InterfaceC5586z.b(c5580t.m22494f());
        }
        C0044b c0044b = new C0044b(c5580t, this.f90k, j10, j11);
        this.f91l = c0044b;
        return c0044b.m22368b();
    }

    @Override // p333x3.InterfaceC5571k
    /* renamed from: g */
    public int mo169g(InterfaceC5572l interfaceC5572l, C5585y c5585y) {
        int i10 = this.f86g;
        if (i10 == 0) {
            m174m(interfaceC5572l);
            return 0;
        }
        if (i10 == 1) {
            m171i(interfaceC5572l);
            return 0;
        }
        if (i10 == 2) {
            m176o(interfaceC5572l);
            return 0;
        }
        if (i10 == 3) {
            m175n(interfaceC5572l);
            return 0;
        }
        if (i10 == 4) {
            m167e(interfaceC5572l);
            return 0;
        }
        if (i10 == 5) {
            return m173l(interfaceC5572l, c5585y);
        }
        throw new IllegalStateException();
    }

    @Override // p333x3.InterfaceC5571k
    /* renamed from: h */
    public boolean mo170h(InterfaceC5572l interfaceC5572l) {
        C5578r.m22479c(interfaceC5572l, false);
        return C5578r.m22477a(interfaceC5572l);
    }

    /* renamed from: i */
    public final void m171i(InterfaceC5572l interfaceC5572l) {
        byte[] bArr = this.f80a;
        interfaceC5572l.mo22430p(bArr, 0, bArr.length);
        interfaceC5572l.mo22427l();
        this.f86g = 2;
    }

    /* renamed from: k */
    public final void m172k() {
        ((InterfaceC5559b0) C4041n0.m15463j(this.f85f)).mo4851a((this.f93n * 1000000) / ((C5580t) C4041n0.m15463j(this.f88i)).f20943e, 1, this.f92m, 0, null);
    }

    /* renamed from: l */
    public final int m173l(InterfaceC5572l interfaceC5572l, C5585y c5585y) {
        boolean z10;
        C4014a.m15199e(this.f85f);
        C4014a.m15199e(this.f88i);
        C0044b c0044b = this.f91l;
        if (c0044b != null && c0044b.m22370d()) {
            return this.f91l.m22369c(interfaceC5572l, c5585y);
        }
        if (this.f93n == -1) {
            this.f93n = C5577q.m22475i(interfaceC5572l, this.f88i);
            return 0;
        }
        int m15232g = this.f81b.m15232g();
        if (m15232g < 32768) {
            int mo14769c = interfaceC5572l.mo14769c(this.f81b.m15230e(), m15232g, 32768 - m15232g);
            z10 = mo14769c == -1;
            if (!z10) {
                this.f81b.m15222S(m15232g + mo14769c);
            } else if (this.f81b.m15226a() == 0) {
                m172k();
                return -1;
            }
        } else {
            z10 = false;
        }
        int m15231f = this.f81b.m15231f();
        int i10 = this.f92m;
        int i11 = this.f89j;
        if (i10 < i11) {
            C4015a0 c4015a0 = this.f81b;
            c4015a0.m15224U(Math.min(i11 - i10, c4015a0.m15226a()));
        }
        long m166d = m166d(this.f81b, z10);
        int m15231f2 = this.f81b.m15231f() - m15231f;
        this.f81b.m15223T(m15231f);
        this.f85f.m22408e(this.f81b, m15231f2);
        this.f92m += m15231f2;
        if (m166d != -1) {
            m172k();
            this.f92m = 0;
            this.f93n = m166d;
        }
        if (this.f81b.m15226a() < 16) {
            int m15226a = this.f81b.m15226a();
            System.arraycopy(this.f81b.m15230e(), this.f81b.m15231f(), this.f81b.m15230e(), 0, m15226a);
            this.f81b.m15223T(0);
            this.f81b.m15222S(m15226a);
        }
        return 0;
    }

    /* renamed from: m */
    public final void m174m(InterfaceC5572l interfaceC5572l) {
        this.f87h = C5578r.m22480d(interfaceC5572l, !this.f82c);
        this.f86g = 1;
    }

    /* renamed from: n */
    public final void m175n(InterfaceC5572l interfaceC5572l) {
        C5578r.a aVar = new C5578r.a(this.f88i);
        boolean z10 = false;
        while (!z10) {
            z10 = C5578r.m22481e(interfaceC5572l, aVar);
            this.f88i = (C5580t) C4041n0.m15463j(aVar.f20936a);
        }
        C4014a.m15199e(this.f88i);
        this.f89j = Math.max(this.f88i.f20941c, 6);
        ((InterfaceC5559b0) C4041n0.m15463j(this.f85f)).mo4852b(this.f88i.m22495g(this.f80a, this.f87h));
        this.f86g = 4;
    }

    /* renamed from: o */
    public final void m176o(InterfaceC5572l interfaceC5572l) {
        C5578r.m22485i(interfaceC5572l);
        this.f86g = 3;
    }

    @Override // p333x3.InterfaceC5571k
    public void release() {
    }
}
