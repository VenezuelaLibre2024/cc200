package p290u4;

import p206o5.InterfaceC3894b;
import p206o5.InterfaceC3906h;
import p222p5.C4014a;
import p222p5.C4015a0;
import p222p5.C4041n0;
import p222p5.C4050v;
import p264s3.C4463m1;
import p264s3.C4468n1;
import p304v3.C5110g;
import p317w3.C5247m;
import p317w3.InterfaceC5248n;
import p317w3.InterfaceC5255u;
import p317w3.InterfaceC5256v;
import p333x3.InterfaceC5559b0;

/* renamed from: u4.l0 */
/* loaded from: classes.dex */
public class C4867l0 implements InterfaceC5559b0 {

    /* renamed from: A */
    public C4463m1 f18356A;

    /* renamed from: B */
    public C4463m1 f18357B;

    /* renamed from: C */
    public int f18358C;

    /* renamed from: D */
    public boolean f18359D;

    /* renamed from: E */
    public boolean f18360E;

    /* renamed from: F */
    public long f18361F;

    /* renamed from: G */
    public boolean f18362G;

    /* renamed from: a */
    public final C4863j0 f18363a;

    /* renamed from: d */
    public final InterfaceC5256v f18366d;

    /* renamed from: e */
    public final InterfaceC5255u.a f18367e;

    /* renamed from: f */
    public d f18368f;

    /* renamed from: g */
    public C4463m1 f18369g;

    /* renamed from: h */
    public InterfaceC5248n f18370h;

    /* renamed from: p */
    public int f18378p;

    /* renamed from: q */
    public int f18379q;

    /* renamed from: r */
    public int f18380r;

    /* renamed from: s */
    public int f18381s;

    /* renamed from: w */
    public boolean f18385w;

    /* renamed from: z */
    public boolean f18388z;

    /* renamed from: b */
    public final b f18364b = new b();

    /* renamed from: i */
    public int f18371i = 1000;

    /* renamed from: j */
    public int[] f18372j = new int[1000];

    /* renamed from: k */
    public long[] f18373k = new long[1000];

    /* renamed from: n */
    public long[] f18376n = new long[1000];

    /* renamed from: m */
    public int[] f18375m = new int[1000];

    /* renamed from: l */
    public int[] f18374l = new int[1000];

    /* renamed from: o */
    public InterfaceC5559b0.a[] f18377o = new InterfaceC5559b0.a[1000];

    /* renamed from: c */
    public final C4877q0<c> f18365c = new C4877q0<>(C4865k0.f18354a);

    /* renamed from: t */
    public long f18382t = Long.MIN_VALUE;

    /* renamed from: u */
    public long f18383u = Long.MIN_VALUE;

    /* renamed from: v */
    public long f18384v = Long.MIN_VALUE;

    /* renamed from: y */
    public boolean f18387y = true;

    /* renamed from: x */
    public boolean f18386x = true;

    /* renamed from: u4.l0$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        public int f18389a;

        /* renamed from: b */
        public long f18390b;

        /* renamed from: c */
        public InterfaceC5559b0.a f18391c;
    }

    /* renamed from: u4.l0$c */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a */
        public final C4463m1 f18392a;

        /* renamed from: b */
        public final InterfaceC5256v.b f18393b;

        public c(C4463m1 c4463m1, InterfaceC5256v.b bVar) {
            this.f18392a = c4463m1;
            this.f18393b = bVar;
        }

        public /* synthetic */ c(C4463m1 c4463m1, InterfaceC5256v.b bVar, a aVar) {
            this(c4463m1, bVar);
        }
    }

    /* renamed from: u4.l0$d */
    /* loaded from: classes.dex */
    public interface d {
        /* renamed from: a */
        void mo19296a(C4463m1 c4463m1);
    }

    public C4867l0(InterfaceC3894b interfaceC3894b, InterfaceC5256v interfaceC5256v, InterfaceC5255u.a aVar) {
        this.f18366d = interfaceC5256v;
        this.f18367e = aVar;
        this.f18363a = new C4863j0(interfaceC3894b);
    }

    /* renamed from: L */
    public static /* synthetic */ void m19344L(c cVar) {
        cVar.f18393b.release();
    }

    /* renamed from: k */
    public static C4867l0 m19346k(InterfaceC3894b interfaceC3894b, InterfaceC5256v interfaceC5256v, InterfaceC5255u.a aVar) {
        return new C4867l0(interfaceC3894b, (InterfaceC5256v) C4014a.m15199e(interfaceC5256v), (InterfaceC5255u.a) C4014a.m15199e(aVar));
    }

    /* renamed from: l */
    public static C4867l0 m19347l(InterfaceC3894b interfaceC3894b) {
        return new C4867l0(interfaceC3894b, null, null);
    }

    /* renamed from: A */
    public final synchronized long m19348A() {
        return Math.max(this.f18383u, m19349B(this.f18381s));
    }

    /* renamed from: B */
    public final long m19349B(int i10) {
        long j10 = Long.MIN_VALUE;
        if (i10 == 0) {
            return Long.MIN_VALUE;
        }
        int m19351D = m19351D(i10 - 1);
        for (int i11 = 0; i11 < i10; i11++) {
            j10 = Math.max(j10, this.f18376n[m19351D]);
            if ((this.f18375m[m19351D] & 1) != 0) {
                break;
            }
            m19351D--;
            if (m19351D == -1) {
                m19351D = this.f18371i - 1;
            }
        }
        return j10;
    }

    /* renamed from: C */
    public final int m19350C() {
        return this.f18379q + this.f18381s;
    }

    /* renamed from: D */
    public final int m19351D(int i10) {
        int i11 = this.f18380r + i10;
        int i12 = this.f18371i;
        return i11 < i12 ? i11 : i11 - i12;
    }

    /* renamed from: E */
    public final synchronized int m19352E(long j10, boolean z10) {
        int m19351D = m19351D(this.f18381s);
        if (m19355H() && j10 >= this.f18376n[m19351D]) {
            if (j10 > this.f18384v && z10) {
                return this.f18378p - this.f18381s;
            }
            int m19392v = m19392v(m19351D, this.f18378p - this.f18381s, j10, true);
            if (m19392v == -1) {
                return 0;
            }
            return m19392v;
        }
        return 0;
    }

    /* renamed from: F */
    public final synchronized C4463m1 m19353F() {
        return this.f18387y ? null : this.f18357B;
    }

    /* renamed from: G */
    public final int m19354G() {
        return this.f18379q + this.f18378p;
    }

    /* renamed from: H */
    public final boolean m19355H() {
        return this.f18381s != this.f18378p;
    }

    /* renamed from: I */
    public final void m19356I() {
        this.f18388z = true;
    }

    /* renamed from: J */
    public final synchronized boolean m19357J() {
        return this.f18385w;
    }

    /* renamed from: K */
    public synchronized boolean m19358K(boolean z10) {
        C4463m1 c4463m1;
        boolean z11 = true;
        if (m19355H()) {
            if (this.f18365c.m19434e(m19350C()).f18392a != this.f18369g) {
                return true;
            }
            return m19359M(m19351D(this.f18381s));
        }
        if (!z10 && !this.f18385w && ((c4463m1 = this.f18357B) == null || c4463m1 == this.f18369g)) {
            z11 = false;
        }
        return z11;
    }

    /* renamed from: M */
    public final boolean m19359M(int i10) {
        InterfaceC5248n interfaceC5248n = this.f18370h;
        return interfaceC5248n == null || interfaceC5248n.getState() == 4 || ((this.f18375m[i10] & 1073741824) == 0 && this.f18370h.mo21122e());
    }

    /* renamed from: N */
    public void m19360N() {
        InterfaceC5248n interfaceC5248n = this.f18370h;
        if (interfaceC5248n != null && interfaceC5248n.getState() == 1) {
            throw ((InterfaceC5248n.a) C4014a.m15199e(this.f18370h.mo21118a()));
        }
    }

    /* renamed from: O */
    public final void m19361O(C4463m1 c4463m1, C4468n1 c4468n1) {
        C4463m1 c4463m12 = this.f18369g;
        boolean z10 = c4463m12 == null;
        C5247m c5247m = z10 ? null : c4463m12.f16509v;
        this.f18369g = c4463m1;
        C5247m c5247m2 = c4463m1.f16509v;
        InterfaceC5256v interfaceC5256v = this.f18366d;
        c4468n1.f16559b = interfaceC5256v != null ? c4463m1.m17412c(interfaceC5256v.mo21232e(c4463m1)) : c4463m1;
        c4468n1.f16558a = this.f18370h;
        if (this.f18366d == null) {
            return;
        }
        if (z10 || !C4041n0.m15449c(c5247m, c5247m2)) {
            InterfaceC5248n interfaceC5248n = this.f18370h;
            InterfaceC5248n mo21229b = this.f18366d.mo21229b(this.f18367e, c4463m1);
            this.f18370h = mo21229b;
            c4468n1.f16558a = mo21229b;
            if (interfaceC5248n != null) {
                interfaceC5248n.mo21121d(this.f18367e);
            }
        }
    }

    /* renamed from: P */
    public final synchronized int m19362P(C4468n1 c4468n1, C5110g c5110g, boolean z10, boolean z11, b bVar) {
        c5110g.f19285k = false;
        if (!m19355H()) {
            if (!z11 && !this.f18385w) {
                C4463m1 c4463m1 = this.f18357B;
                if (c4463m1 == null || (!z10 && c4463m1 == this.f18369g)) {
                    return -3;
                }
                m19361O((C4463m1) C4014a.m15199e(c4463m1), c4468n1);
                return -5;
            }
            c5110g.m20752u(4);
            return -4;
        }
        C4463m1 c4463m12 = this.f18365c.m19434e(m19350C()).f18392a;
        if (!z10 && c4463m12 == this.f18369g) {
            int m19351D = m19351D(this.f18381s);
            if (!m19359M(m19351D)) {
                c5110g.f19285k = true;
                return -3;
            }
            c5110g.m20752u(this.f18375m[m19351D]);
            if (this.f18381s == this.f18378p - 1 && (z11 || this.f18385w)) {
                c5110g.m20743i(536870912);
            }
            long j10 = this.f18376n[m19351D];
            c5110g.f19286l = j10;
            if (j10 < this.f18382t) {
                c5110g.m20743i(Integer.MIN_VALUE);
            }
            bVar.f18389a = this.f18374l[m19351D];
            bVar.f18390b = this.f18373k[m19351D];
            bVar.f18391c = this.f18377o[m19351D];
            return -4;
        }
        m19361O(c4463m12, c4468n1);
        return -5;
    }

    /* renamed from: Q */
    public final synchronized int m19363Q() {
        return m19355H() ? this.f18372j[m19351D(this.f18381s)] : this.f18358C;
    }

    /* renamed from: R */
    public void m19364R() {
        m19388r();
        m19367U();
    }

    /* renamed from: S */
    public int m19365S(C4468n1 c4468n1, C5110g c5110g, int i10, boolean z10) {
        int m19362P = m19362P(c4468n1, c5110g, (i10 & 2) != 0, z10, this.f18364b);
        if (m19362P == -4 && !c5110g.m20748q()) {
            boolean z11 = (i10 & 1) != 0;
            if ((i10 & 4) == 0) {
                C4863j0 c4863j0 = this.f18363a;
                b bVar = this.f18364b;
                if (z11) {
                    c4863j0.m19332f(c5110g, bVar);
                } else {
                    c4863j0.m19335m(c5110g, bVar);
                }
            }
            if (!z11) {
                this.f18381s++;
            }
        }
        return m19362P;
    }

    /* renamed from: T */
    public void m19366T() {
        m19369W(true);
        m19367U();
    }

    /* renamed from: U */
    public final void m19367U() {
        InterfaceC5248n interfaceC5248n = this.f18370h;
        if (interfaceC5248n != null) {
            interfaceC5248n.mo21121d(this.f18367e);
            this.f18370h = null;
            this.f18369g = null;
        }
    }

    /* renamed from: V */
    public final void m19368V() {
        m19369W(false);
    }

    /* renamed from: W */
    public void m19369W(boolean z10) {
        this.f18363a.m19336n();
        this.f18378p = 0;
        this.f18379q = 0;
        this.f18380r = 0;
        this.f18381s = 0;
        this.f18386x = true;
        this.f18382t = Long.MIN_VALUE;
        this.f18383u = Long.MIN_VALUE;
        this.f18384v = Long.MIN_VALUE;
        this.f18385w = false;
        this.f18365c.m19431b();
        if (z10) {
            this.f18356A = null;
            this.f18357B = null;
            this.f18387y = true;
        }
    }

    /* renamed from: X */
    public final synchronized void m19370X() {
        this.f18381s = 0;
        this.f18363a.m19337o();
    }

    /* renamed from: Y */
    public final synchronized boolean m19371Y(int i10) {
        boolean z10;
        m19370X();
        int i11 = this.f18379q;
        if (i10 >= i11 && i10 <= this.f18378p + i11) {
            this.f18382t = Long.MIN_VALUE;
            this.f18381s = i10 - i11;
            z10 = true;
        }
        z10 = false;
        return z10;
    }

    /* renamed from: Z */
    public final synchronized boolean m19372Z(long j10, boolean z10) {
        m19370X();
        int m19351D = m19351D(this.f18381s);
        if (m19355H() && j10 >= this.f18376n[m19351D] && (j10 <= this.f18384v || z10)) {
            int m19392v = m19392v(m19351D, this.f18378p - this.f18381s, j10, true);
            if (m19392v == -1) {
                return false;
            }
            this.f18382t = j10;
            this.f18381s += m19392v;
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0059  */
    @Override // p333x3.InterfaceC5559b0
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo4851a(long r12, int r14, int r15, int r16, p333x3.InterfaceC5559b0.a r17) {
        /*
            r11 = this;
            r8 = r11
            boolean r0 = r8.f18388z
            if (r0 == 0) goto L10
            s3.m1 r0 = r8.f18356A
            java.lang.Object r0 = p222p5.C4014a.m15202h(r0)
            s3.m1 r0 = (p264s3.C4463m1) r0
            r11.mo4852b(r0)
        L10:
            r0 = r14 & 1
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L18
            r3 = r2
            goto L19
        L18:
            r3 = r1
        L19:
            boolean r4 = r8.f18386x
            if (r4 == 0) goto L22
            if (r3 != 0) goto L20
            return
        L20:
            r8.f18386x = r1
        L22:
            long r4 = r8.f18361F
            long r4 = r4 + r12
            boolean r6 = r8.f18359D
            if (r6 == 0) goto L54
            long r6 = r8.f18382t
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 >= 0) goto L30
            return
        L30:
            if (r0 != 0) goto L54
            boolean r0 = r8.f18360E
            if (r0 != 0) goto L50
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r6 = "Overriding unexpected non-sync sample for format: "
            r0.append(r6)
            s3.m1 r6 = r8.f18357B
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            java.lang.String r6 = "SampleQueue"
            p222p5.C4046r.m15529i(r6, r0)
            r8.f18360E = r2
        L50:
            r0 = r14 | 1
            r6 = r0
            goto L55
        L54:
            r6 = r14
        L55:
            boolean r0 = r8.f18362G
            if (r0 == 0) goto L66
            if (r3 == 0) goto L65
            boolean r0 = r11.m19380h(r4)
            if (r0 != 0) goto L62
            goto L65
        L62:
            r8.f18362G = r1
            goto L66
        L65:
            return
        L66:
            u4.j0 r0 = r8.f18363a
            long r0 = r0.m19331e()
            r7 = r15
            long r2 = (long) r7
            long r0 = r0 - r2
            r2 = r16
            long r2 = (long) r2
            long r9 = r0 - r2
            r0 = r11
            r1 = r4
            r3 = r6
            r4 = r9
            r6 = r15
            r7 = r17
            r0.m19381i(r1, r3, r4, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p290u4.C4867l0.mo4851a(long, int, int, int, x3.b0$a):void");
    }

    /* renamed from: a0 */
    public final void m19373a0(long j10) {
        if (this.f18361F != j10) {
            this.f18361F = j10;
            m19356I();
        }
    }

    @Override // p333x3.InterfaceC5559b0
    /* renamed from: b */
    public final void mo4852b(C4463m1 c4463m1) {
        C4463m1 mo19393w = mo19393w(c4463m1);
        this.f18388z = false;
        this.f18356A = c4463m1;
        boolean m19375c0 = m19375c0(mo19393w);
        d dVar = this.f18368f;
        if (dVar == null || !m19375c0) {
            return;
        }
        dVar.mo19296a(mo19393w);
    }

    /* renamed from: b0 */
    public final void m19374b0(long j10) {
        this.f18382t = j10;
    }

    /* renamed from: c0 */
    public final synchronized boolean m19375c0(C4463m1 c4463m1) {
        this.f18387y = false;
        if (C4041n0.m15449c(c4463m1, this.f18357B)) {
            return false;
        }
        if (!this.f18365c.m19436g() && this.f18365c.m19435f().f18392a.equals(c4463m1)) {
            c4463m1 = this.f18365c.m19435f().f18392a;
        }
        this.f18357B = c4463m1;
        C4463m1 c4463m12 = this.f18357B;
        this.f18359D = C4050v.m15544a(c4463m12.f16506s, c4463m12.f16503p);
        this.f18360E = false;
        return true;
    }

    @Override // p333x3.InterfaceC5559b0
    /* renamed from: d */
    public final void mo4853d(C4015a0 c4015a0, int i10, int i11) {
        this.f18363a.m19339q(c4015a0, i10);
    }

    /* renamed from: d0 */
    public final void m19376d0(d dVar) {
        this.f18368f = dVar;
    }

    /* renamed from: e0 */
    public final synchronized void m19377e0(int i10) {
        boolean z10;
        if (i10 >= 0) {
            try {
                if (this.f18381s + i10 <= this.f18378p) {
                    z10 = true;
                    C4014a.m15195a(z10);
                    this.f18381s += i10;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        z10 = false;
        C4014a.m15195a(z10);
        this.f18381s += i10;
    }

    @Override // p333x3.InterfaceC5559b0
    /* renamed from: f */
    public final int mo4854f(InterfaceC3906h interfaceC3906h, int i10, boolean z10, int i11) {
        return this.f18363a.m19338p(interfaceC3906h, i10, z10);
    }

    /* renamed from: f0 */
    public final void m19378f0(int i10) {
        this.f18358C = i10;
    }

    /* renamed from: g0 */
    public final void m19379g0() {
        this.f18362G = true;
    }

    /* renamed from: h */
    public final synchronized boolean m19380h(long j10) {
        if (this.f18378p == 0) {
            return j10 > this.f18383u;
        }
        if (m19348A() >= j10) {
            return false;
        }
        m19390t(this.f18379q + m19382j(j10));
        return true;
    }

    /* renamed from: i */
    public final synchronized void m19381i(long j10, int i10, long j11, int i11, InterfaceC5559b0.a aVar) {
        int i12 = this.f18378p;
        if (i12 > 0) {
            int m19351D = m19351D(i12 - 1);
            C4014a.m15195a(this.f18373k[m19351D] + ((long) this.f18374l[m19351D]) <= j11);
        }
        this.f18385w = (536870912 & i10) != 0;
        this.f18384v = Math.max(this.f18384v, j10);
        int m19351D2 = m19351D(this.f18378p);
        this.f18376n[m19351D2] = j10;
        this.f18373k[m19351D2] = j11;
        this.f18374l[m19351D2] = i11;
        this.f18375m[m19351D2] = i10;
        this.f18377o[m19351D2] = aVar;
        this.f18372j[m19351D2] = this.f18358C;
        if (this.f18365c.m19436g() || !this.f18365c.m19435f().f18392a.equals(this.f18357B)) {
            InterfaceC5256v interfaceC5256v = this.f18366d;
            this.f18365c.m19430a(m19354G(), new c((C4463m1) C4014a.m15199e(this.f18357B), interfaceC5256v != null ? interfaceC5256v.mo21230c(this.f18367e, this.f18357B) : InterfaceC5256v.b.f19936a));
        }
        int i13 = this.f18378p + 1;
        this.f18378p = i13;
        int i14 = this.f18371i;
        if (i13 == i14) {
            int i15 = i14 + 1000;
            int[] iArr = new int[i15];
            long[] jArr = new long[i15];
            long[] jArr2 = new long[i15];
            int[] iArr2 = new int[i15];
            int[] iArr3 = new int[i15];
            InterfaceC5559b0.a[] aVarArr = new InterfaceC5559b0.a[i15];
            int i16 = this.f18380r;
            int i17 = i14 - i16;
            System.arraycopy(this.f18373k, i16, jArr, 0, i17);
            System.arraycopy(this.f18376n, this.f18380r, jArr2, 0, i17);
            System.arraycopy(this.f18375m, this.f18380r, iArr2, 0, i17);
            System.arraycopy(this.f18374l, this.f18380r, iArr3, 0, i17);
            System.arraycopy(this.f18377o, this.f18380r, aVarArr, 0, i17);
            System.arraycopy(this.f18372j, this.f18380r, iArr, 0, i17);
            int i18 = this.f18380r;
            System.arraycopy(this.f18373k, 0, jArr, i17, i18);
            System.arraycopy(this.f18376n, 0, jArr2, i17, i18);
            System.arraycopy(this.f18375m, 0, iArr2, i17, i18);
            System.arraycopy(this.f18374l, 0, iArr3, i17, i18);
            System.arraycopy(this.f18377o, 0, aVarArr, i17, i18);
            System.arraycopy(this.f18372j, 0, iArr, i17, i18);
            this.f18373k = jArr;
            this.f18376n = jArr2;
            this.f18375m = iArr2;
            this.f18374l = iArr3;
            this.f18377o = aVarArr;
            this.f18372j = iArr;
            this.f18380r = 0;
            this.f18371i = i15;
        }
    }

    /* renamed from: j */
    public final int m19382j(long j10) {
        int i10 = this.f18378p;
        int m19351D = m19351D(i10 - 1);
        while (i10 > this.f18381s && this.f18376n[m19351D] >= j10) {
            i10--;
            m19351D--;
            if (m19351D == -1) {
                m19351D = this.f18371i - 1;
            }
        }
        return i10;
    }

    /* renamed from: m */
    public final synchronized long m19383m(long j10, boolean z10, boolean z11) {
        int i10;
        int i11 = this.f18378p;
        if (i11 != 0) {
            long[] jArr = this.f18376n;
            int i12 = this.f18380r;
            if (j10 >= jArr[i12]) {
                if (z11 && (i10 = this.f18381s) != i11) {
                    i11 = i10 + 1;
                }
                int m19392v = m19392v(i12, i11, j10, z10);
                if (m19392v == -1) {
                    return -1L;
                }
                return m19386p(m19392v);
            }
        }
        return -1L;
    }

    /* renamed from: n */
    public final synchronized long m19384n() {
        int i10 = this.f18378p;
        if (i10 == 0) {
            return -1L;
        }
        return m19386p(i10);
    }

    /* renamed from: o */
    public synchronized long m19385o() {
        int i10 = this.f18381s;
        if (i10 == 0) {
            return -1L;
        }
        return m19386p(i10);
    }

    /* renamed from: p */
    public final long m19386p(int i10) {
        this.f18383u = Math.max(this.f18383u, m19349B(i10));
        this.f18378p -= i10;
        int i11 = this.f18379q + i10;
        this.f18379q = i11;
        int i12 = this.f18380r + i10;
        this.f18380r = i12;
        int i13 = this.f18371i;
        if (i12 >= i13) {
            this.f18380r = i12 - i13;
        }
        int i14 = this.f18381s - i10;
        this.f18381s = i14;
        if (i14 < 0) {
            this.f18381s = 0;
        }
        this.f18365c.m19433d(i11);
        if (this.f18378p != 0) {
            return this.f18373k[this.f18380r];
        }
        int i15 = this.f18380r;
        if (i15 == 0) {
            i15 = this.f18371i;
        }
        return this.f18373k[i15 - 1] + this.f18374l[r6];
    }

    /* renamed from: q */
    public final void m19387q(long j10, boolean z10, boolean z11) {
        this.f18363a.m19329b(m19383m(j10, z10, z11));
    }

    /* renamed from: r */
    public final void m19388r() {
        this.f18363a.m19329b(m19384n());
    }

    /* renamed from: s */
    public final void m19389s() {
        this.f18363a.m19329b(m19385o());
    }

    /* renamed from: t */
    public final long m19390t(int i10) {
        int m19354G = m19354G() - i10;
        boolean z10 = false;
        C4014a.m15195a(m19354G >= 0 && m19354G <= this.f18378p - this.f18381s);
        int i11 = this.f18378p - m19354G;
        this.f18378p = i11;
        this.f18384v = Math.max(this.f18383u, m19349B(i11));
        if (m19354G == 0 && this.f18385w) {
            z10 = true;
        }
        this.f18385w = z10;
        this.f18365c.m19432c(i10);
        int i12 = this.f18378p;
        if (i12 == 0) {
            return 0L;
        }
        return this.f18373k[m19351D(i12 - 1)] + this.f18374l[r9];
    }

    /* renamed from: u */
    public final void m19391u(int i10) {
        this.f18363a.m19330c(m19390t(i10));
    }

    /* renamed from: v */
    public final int m19392v(int i10, int i11, long j10, boolean z10) {
        int i12 = -1;
        for (int i13 = 0; i13 < i11; i13++) {
            long[] jArr = this.f18376n;
            if (jArr[i10] > j10) {
                return i12;
            }
            if (!z10 || (this.f18375m[i10] & 1) != 0) {
                if (jArr[i10] == j10) {
                    return i13;
                }
                i12 = i13;
            }
            i10++;
            if (i10 == this.f18371i) {
                i10 = 0;
            }
        }
        return i12;
    }

    /* renamed from: w */
    public C4463m1 mo19393w(C4463m1 c4463m1) {
        return (this.f18361F == 0 || c4463m1.f16510w == Long.MAX_VALUE) ? c4463m1 : c4463m1.m17411b().m17478k0(c4463m1.f16510w + this.f18361F).m17448G();
    }

    /* renamed from: x */
    public final int m19394x() {
        return this.f18379q;
    }

    /* renamed from: y */
    public final synchronized long m19395y() {
        return this.f18378p == 0 ? Long.MIN_VALUE : this.f18376n[this.f18380r];
    }

    /* renamed from: z */
    public final synchronized long m19396z() {
        return this.f18384v;
    }
}
