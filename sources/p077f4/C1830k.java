package p077f4;

import android.util.Pair;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import p077f4.AbstractC1820a;
import p109h7.InterfaceC2424g;
import p152k4.C3348a;
import p222p5.C4015a0;
import p222p5.C4041n0;
import p222p5.C4051w;
import p235q4.C4164b;
import p264s3.C4463m1;
import p264s3.C4499t2;
import p289u3.C4809c;
import p333x3.C5561c0;
import p333x3.C5582v;
import p333x3.C5585y;
import p333x3.InterfaceC5559b0;
import p333x3.InterfaceC5571k;
import p333x3.InterfaceC5572l;
import p333x3.InterfaceC5573m;
import p333x3.InterfaceC5576p;
import p333x3.InterfaceC5586z;

/* renamed from: f4.k */
/* loaded from: classes.dex */
public final class C1830k implements InterfaceC5571k, InterfaceC5586z {

    /* renamed from: y */
    public static final InterfaceC5576p f6886y = new InterfaceC5576p() { // from class: f4.j
        @Override // p333x3.InterfaceC5576p
        /* renamed from: b */
        public final InterfaceC5571k[] mo161b() {
            InterfaceC5571k[] m7510s;
            m7510s = C1830k.m7510s();
            return m7510s;
        }
    };

    /* renamed from: a */
    public final int f6887a;

    /* renamed from: b */
    public final C4015a0 f6888b;

    /* renamed from: c */
    public final C4015a0 f6889c;

    /* renamed from: d */
    public final C4015a0 f6890d;

    /* renamed from: e */
    public final C4015a0 f6891e;

    /* renamed from: f */
    public final ArrayDeque<AbstractC1820a.a> f6892f;

    /* renamed from: g */
    public final C1832m f6893g;

    /* renamed from: h */
    public final List<C3348a.b> f6894h;

    /* renamed from: i */
    public int f6895i;

    /* renamed from: j */
    public int f6896j;

    /* renamed from: k */
    public long f6897k;

    /* renamed from: l */
    public int f6898l;

    /* renamed from: m */
    public C4015a0 f6899m;

    /* renamed from: n */
    public int f6900n;

    /* renamed from: o */
    public int f6901o;

    /* renamed from: p */
    public int f6902p;

    /* renamed from: q */
    public int f6903q;

    /* renamed from: r */
    public InterfaceC5573m f6904r;

    /* renamed from: s */
    public a[] f6905s;

    /* renamed from: t */
    public long[][] f6906t;

    /* renamed from: u */
    public int f6907u;

    /* renamed from: v */
    public long f6908v;

    /* renamed from: w */
    public int f6909w;

    /* renamed from: x */
    public C4164b f6910x;

    /* renamed from: f4.k$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final C1834o f6911a;

        /* renamed from: b */
        public final C1837r f6912b;

        /* renamed from: c */
        public final InterfaceC5559b0 f6913c;

        /* renamed from: d */
        public final C5561c0 f6914d;

        /* renamed from: e */
        public int f6915e;

        public a(C1834o c1834o, C1837r c1837r, InterfaceC5559b0 interfaceC5559b0) {
            this.f6911a = c1834o;
            this.f6912b = c1837r;
            this.f6913c = interfaceC5559b0;
            this.f6914d = "audio/true-hd".equals(c1834o.f6933f.f16506s) ? new C5561c0() : null;
        }
    }

    public C1830k() {
        this(0);
    }

    public C1830k(int i10) {
        this.f6887a = i10;
        this.f6895i = (i10 & 4) != 0 ? 3 : 0;
        this.f6893g = new C1832m();
        this.f6894h = new ArrayList();
        this.f6891e = new C4015a0(16);
        this.f6892f = new ArrayDeque<>();
        this.f6888b = new C4015a0(C4051w.f14559a);
        this.f6889c = new C4015a0(4);
        this.f6890d = new C4015a0();
        this.f6900n = -1;
        this.f6904r = InterfaceC5573m.f20932g;
        this.f6905s = new a[0];
    }

    /* renamed from: E */
    public static boolean m7502E(int i10) {
        return i10 == 1836019574 || i10 == 1953653099 || i10 == 1835297121 || i10 == 1835626086 || i10 == 1937007212 || i10 == 1701082227 || i10 == 1835365473;
    }

    /* renamed from: F */
    public static boolean m7503F(int i10) {
        return i10 == 1835296868 || i10 == 1836476516 || i10 == 1751411826 || i10 == 1937011556 || i10 == 1937011827 || i10 == 1937011571 || i10 == 1668576371 || i10 == 1701606260 || i10 == 1937011555 || i10 == 1937011578 || i10 == 1937013298 || i10 == 1937007471 || i10 == 1668232756 || i10 == 1953196132 || i10 == 1718909296 || i10 == 1969517665 || i10 == 1801812339 || i10 == 1768715124;
    }

    /* renamed from: l */
    public static int m7506l(int i10) {
        if (i10 != 1751476579) {
            return i10 != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    /* renamed from: m */
    public static long[][] m7507m(a[] aVarArr) {
        long[][] jArr = new long[aVarArr.length];
        int[] iArr = new int[aVarArr.length];
        long[] jArr2 = new long[aVarArr.length];
        boolean[] zArr = new boolean[aVarArr.length];
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            jArr[i10] = new long[aVarArr[i10].f6912b.f6963b];
            jArr2[i10] = aVarArr[i10].f6912b.f6967f[0];
        }
        long j10 = 0;
        int i11 = 0;
        while (i11 < aVarArr.length) {
            long j11 = Long.MAX_VALUE;
            int i12 = -1;
            for (int i13 = 0; i13 < aVarArr.length; i13++) {
                if (!zArr[i13] && jArr2[i13] <= j11) {
                    j11 = jArr2[i13];
                    i12 = i13;
                }
            }
            int i14 = iArr[i12];
            jArr[i12][i14] = j10;
            j10 += aVarArr[i12].f6912b.f6965d[i14];
            int i15 = i14 + 1;
            iArr[i12] = i15;
            if (i15 < jArr[i12].length) {
                jArr2[i12] = aVarArr[i12].f6912b.f6967f[i15];
            } else {
                zArr[i12] = true;
                i11++;
            }
        }
        return jArr;
    }

    /* renamed from: p */
    public static int m7508p(C1837r c1837r, long j10) {
        int m7556a = c1837r.m7556a(j10);
        return m7556a == -1 ? c1837r.m7557b(j10) : m7556a;
    }

    /* renamed from: r */
    public static /* synthetic */ C1834o m7509r(C1834o c1834o) {
        return c1834o;
    }

    /* renamed from: s */
    public static /* synthetic */ InterfaceC5571k[] m7510s() {
        return new InterfaceC5571k[]{new C1830k()};
    }

    /* renamed from: t */
    public static long m7511t(C1837r c1837r, long j10, long j11) {
        int m7508p = m7508p(c1837r, j10);
        return m7508p == -1 ? j11 : Math.min(c1837r.f6964c[m7508p], j11);
    }

    /* renamed from: x */
    public static int m7512x(C4015a0 c4015a0) {
        c4015a0.m15223T(8);
        int m7506l = m7506l(c4015a0.m15241p());
        if (m7506l != 0) {
            return m7506l;
        }
        c4015a0.m15224U(4);
        while (c4015a0.m15226a() > 0) {
            int m7506l2 = m7506l(c4015a0.m15241p());
            if (m7506l2 != 0) {
                return m7506l2;
            }
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0108  */
    /* renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m7513A(p333x3.InterfaceC5572l r9) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p077f4.C1830k.m7513A(x3.l):boolean");
    }

    /* renamed from: B */
    public final boolean m7514B(InterfaceC5572l interfaceC5572l, C5585y c5585y) {
        boolean z10;
        long j10 = this.f6897k - this.f6898l;
        long position = interfaceC5572l.getPosition() + j10;
        C4015a0 c4015a0 = this.f6899m;
        if (c4015a0 != null) {
            interfaceC5572l.readFully(c4015a0.m15230e(), this.f6898l, (int) j10);
            if (this.f6896j == 1718909296) {
                this.f6909w = m7512x(c4015a0);
            } else if (!this.f6892f.isEmpty()) {
                this.f6892f.peek().m7393e(new AbstractC1820a.b(this.f6896j, c4015a0));
            }
        } else {
            if (j10 >= 262144) {
                c5585y.f20962a = interfaceC5572l.getPosition() + j10;
                z10 = true;
                m7522v(position);
                return (z10 || this.f6895i == 2) ? false : true;
            }
            interfaceC5572l.mo22428m((int) j10);
        }
        z10 = false;
        m7522v(position);
        if (z10) {
        }
    }

    /* renamed from: C */
    public final int m7515C(InterfaceC5572l interfaceC5572l, C5585y c5585y) {
        int i10;
        C5585y c5585y2;
        long position = interfaceC5572l.getPosition();
        if (this.f6900n == -1) {
            int m7520q = m7520q(position);
            this.f6900n = m7520q;
            if (m7520q == -1) {
                return -1;
            }
        }
        a aVar = this.f6905s[this.f6900n];
        InterfaceC5559b0 interfaceC5559b0 = aVar.f6913c;
        int i11 = aVar.f6915e;
        C1837r c1837r = aVar.f6912b;
        long j10 = c1837r.f6964c[i11];
        int i12 = c1837r.f6965d[i11];
        C5561c0 c5561c0 = aVar.f6914d;
        long j11 = (j10 - position) + this.f6901o;
        if (j11 < 0) {
            i10 = 1;
            c5585y2 = c5585y;
        } else {
            if (j11 < 262144) {
                if (aVar.f6911a.f6934g == 1) {
                    j11 += 8;
                    i12 -= 8;
                }
                interfaceC5572l.mo22428m((int) j11);
                C1834o c1834o = aVar.f6911a;
                if (c1834o.f6937j == 0) {
                    if ("audio/ac4".equals(c1834o.f6933f.f16506s)) {
                        if (this.f6902p == 0) {
                            C4809c.m18995a(i12, this.f6890d);
                            interfaceC5559b0.m22408e(this.f6890d, 7);
                            this.f6902p += 7;
                        }
                        i12 += 7;
                    } else if (c5561c0 != null) {
                        c5561c0.m22413d(interfaceC5572l);
                    }
                    while (true) {
                        int i13 = this.f6902p;
                        if (i13 >= i12) {
                            break;
                        }
                        int m22407c = interfaceC5559b0.m22407c(interfaceC5572l, i12 - i13, false);
                        this.f6901o += m22407c;
                        this.f6902p += m22407c;
                        this.f6903q -= m22407c;
                    }
                } else {
                    byte[] m15230e = this.f6889c.m15230e();
                    m15230e[0] = 0;
                    m15230e[1] = 0;
                    m15230e[2] = 0;
                    int i14 = aVar.f6911a.f6937j;
                    int i15 = 4 - i14;
                    while (this.f6902p < i12) {
                        int i16 = this.f6903q;
                        if (i16 == 0) {
                            interfaceC5572l.readFully(m15230e, i15, i14);
                            this.f6901o += i14;
                            this.f6889c.m15223T(0);
                            int m15241p = this.f6889c.m15241p();
                            if (m15241p < 0) {
                                throw C4499t2.m17594a("Invalid NAL length", null);
                            }
                            this.f6903q = m15241p;
                            this.f6888b.m15223T(0);
                            interfaceC5559b0.m22408e(this.f6888b, 4);
                            this.f6902p += 4;
                            i12 += i15;
                        } else {
                            int m22407c2 = interfaceC5559b0.m22407c(interfaceC5572l, i16, false);
                            this.f6901o += m22407c2;
                            this.f6902p += m22407c2;
                            this.f6903q -= m22407c2;
                        }
                    }
                }
                int i17 = i12;
                C1837r c1837r2 = aVar.f6912b;
                long j12 = c1837r2.f6967f[i11];
                int i18 = c1837r2.f6968g[i11];
                if (c5561c0 != null) {
                    c5561c0.m22412c(interfaceC5559b0, j12, i18, i17, 0, null);
                    if (i11 + 1 == aVar.f6912b.f6963b) {
                        c5561c0.m22410a(interfaceC5559b0, null);
                    }
                } else {
                    interfaceC5559b0.mo4851a(j12, i18, i17, 0, null);
                }
                aVar.f6915e++;
                this.f6900n = -1;
                this.f6901o = 0;
                this.f6902p = 0;
                this.f6903q = 0;
                return 0;
            }
            c5585y2 = c5585y;
            i10 = 1;
        }
        c5585y2.f20962a = j10;
        return i10;
    }

    /* renamed from: D */
    public final int m7516D(InterfaceC5572l interfaceC5572l, C5585y c5585y) {
        int m7539c = this.f6893g.m7539c(interfaceC5572l, c5585y, this.f6894h);
        if (m7539c == 1 && c5585y.f20962a == 0) {
            m7518n();
        }
        return m7539c;
    }

    /* renamed from: G */
    public final void m7517G(a aVar, long j10) {
        C1837r c1837r = aVar.f6912b;
        int m7556a = c1837r.m7556a(j10);
        if (m7556a == -1) {
            m7556a = c1837r.m7557b(j10);
        }
        aVar.f6915e = m7556a;
    }

    @Override // p333x3.InterfaceC5571k
    /* renamed from: b */
    public void mo164b(InterfaceC5573m interfaceC5573m) {
        this.f6904r = interfaceC5573m;
    }

    @Override // p333x3.InterfaceC5571k
    /* renamed from: c */
    public void mo165c(long j10, long j11) {
        this.f6892f.clear();
        this.f6898l = 0;
        this.f6900n = -1;
        this.f6901o = 0;
        this.f6902p = 0;
        this.f6903q = 0;
        if (j10 == 0) {
            if (this.f6895i != 3) {
                m7518n();
                return;
            } else {
                this.f6893g.m7542g();
                this.f6894h.clear();
                return;
            }
        }
        for (a aVar : this.f6905s) {
            m7517G(aVar, j11);
            C5561c0 c5561c0 = aVar.f6914d;
            if (c5561c0 != null) {
                c5561c0.m22411b();
            }
        }
    }

    @Override // p333x3.InterfaceC5586z
    /* renamed from: d */
    public long mo3035d() {
        return this.f6908v;
    }

    @Override // p333x3.InterfaceC5586z
    /* renamed from: f */
    public boolean mo3036f() {
        return true;
    }

    @Override // p333x3.InterfaceC5571k
    /* renamed from: g */
    public int mo169g(InterfaceC5572l interfaceC5572l, C5585y c5585y) {
        while (true) {
            int i10 = this.f6895i;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        return m7515C(interfaceC5572l, c5585y);
                    }
                    if (i10 == 3) {
                        return m7516D(interfaceC5572l, c5585y);
                    }
                    throw new IllegalStateException();
                }
                if (m7514B(interfaceC5572l, c5585y)) {
                    return 1;
                }
            } else if (!m7513A(interfaceC5572l)) {
                return -1;
            }
        }
    }

    @Override // p333x3.InterfaceC5571k
    /* renamed from: h */
    public boolean mo170h(InterfaceC5572l interfaceC5572l) {
        return C1833n.m7546d(interfaceC5572l, (this.f6887a & 2) != 0);
    }

    @Override // p333x3.InterfaceC5586z
    /* renamed from: i */
    public InterfaceC5586z.a mo3037i(long j10) {
        return m7519o(j10, -1);
    }

    /* renamed from: n */
    public final void m7518n() {
        this.f6895i = 0;
        this.f6898l = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008e  */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p333x3.InterfaceC5586z.a m7519o(long r17, int r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r19
            f4.k$a[] r4 = r0.f6905s
            int r5 = r4.length
            if (r5 != 0) goto L13
            x3.z$a r1 = new x3.z$a
            x3.a0 r2 = p333x3.C5557a0.f20850c
            r1.<init>(r2)
            return r1
        L13:
            r5 = -1
            r7 = -1
            if (r3 == r7) goto L1a
            r8 = r3
            goto L1c
        L1a:
            int r8 = r0.f6907u
        L1c:
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r8 == r7) goto L58
            r4 = r4[r8]
            f4.r r4 = r4.f6912b
            int r8 = m7508p(r4, r1)
            if (r8 != r7) goto L35
            x3.z$a r1 = new x3.z$a
            x3.a0 r2 = p333x3.C5557a0.f20850c
            r1.<init>(r2)
            return r1
        L35:
            long[] r11 = r4.f6967f
            r12 = r11[r8]
            long[] r11 = r4.f6964c
            r14 = r11[r8]
            int r11 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r11 >= 0) goto L5e
            int r11 = r4.f6963b
            int r11 = r11 + (-1)
            if (r8 >= r11) goto L5e
            int r1 = r4.m7557b(r1)
            if (r1 == r7) goto L5e
            if (r1 == r8) goto L5e
            long[] r2 = r4.f6967f
            r5 = r2[r1]
            long[] r2 = r4.f6964c
            r1 = r2[r1]
            goto L60
        L58:
            r14 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r12 = r1
        L5e:
            r1 = r5
            r5 = r9
        L60:
            if (r3 != r7) goto L7f
            r3 = 0
        L63:
            f4.k$a[] r4 = r0.f6905s
            int r7 = r4.length
            if (r3 >= r7) goto L7f
            int r7 = r0.f6907u
            if (r3 == r7) goto L7c
            r4 = r4[r3]
            f4.r r4 = r4.f6912b
            long r14 = m7511t(r4, r12, r14)
            int r7 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r7 == 0) goto L7c
            long r1 = m7511t(r4, r5, r1)
        L7c:
            int r3 = r3 + 1
            goto L63
        L7f:
            x3.a0 r3 = new x3.a0
            r3.<init>(r12, r14)
            int r4 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r4 != 0) goto L8e
            x3.z$a r1 = new x3.z$a
            r1.<init>(r3)
            return r1
        L8e:
            x3.a0 r4 = new x3.a0
            r4.<init>(r5, r1)
            x3.z$a r1 = new x3.z$a
            r1.<init>(r3, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p077f4.C1830k.m7519o(long, int):x3.z$a");
    }

    /* renamed from: q */
    public final int m7520q(long j10) {
        int i10 = -1;
        int i11 = -1;
        int i12 = 0;
        long j11 = Long.MAX_VALUE;
        boolean z10 = true;
        long j12 = Long.MAX_VALUE;
        boolean z11 = true;
        long j13 = Long.MAX_VALUE;
        while (true) {
            a[] aVarArr = this.f6905s;
            if (i12 >= aVarArr.length) {
                break;
            }
            a aVar = aVarArr[i12];
            int i13 = aVar.f6915e;
            C1837r c1837r = aVar.f6912b;
            if (i13 != c1837r.f6963b) {
                long j14 = c1837r.f6964c[i13];
                long j15 = ((long[][]) C4041n0.m15463j(this.f6906t))[i12][i13];
                long j16 = j14 - j10;
                boolean z12 = j16 < 0 || j16 >= 262144;
                if ((!z12 && z11) || (z12 == z11 && j16 < j13)) {
                    z11 = z12;
                    j13 = j16;
                    i11 = i12;
                    j12 = j15;
                }
                if (j15 < j11) {
                    z10 = z12;
                    i10 = i12;
                    j11 = j15;
                }
            }
            i12++;
        }
        return (j11 == Long.MAX_VALUE || !z10 || j12 < j11 + 10485760) ? i11 : i10;
    }

    @Override // p333x3.InterfaceC5571k
    public void release() {
    }

    /* renamed from: u */
    public final void m7521u(InterfaceC5572l interfaceC5572l) {
        this.f6890d.m15219P(8);
        interfaceC5572l.mo22430p(this.f6890d.m15230e(), 0, 8);
        C1821b.m7404e(this.f6890d);
        interfaceC5572l.mo22428m(this.f6890d.m15231f());
        interfaceC5572l.mo22427l();
    }

    /* renamed from: v */
    public final void m7522v(long j10) {
        while (!this.f6892f.isEmpty() && this.f6892f.peek().f6786b == j10) {
            AbstractC1820a.a pop = this.f6892f.pop();
            if (pop.f6785a == 1836019574) {
                m7524y(pop);
                this.f6892f.clear();
                this.f6895i = 2;
            } else if (!this.f6892f.isEmpty()) {
                this.f6892f.peek().m7392d(pop);
            }
        }
        if (this.f6895i != 2) {
            m7518n();
        }
    }

    /* renamed from: w */
    public final void m7523w() {
        if (this.f6909w != 2 || (this.f6887a & 2) == 0) {
            return;
        }
        this.f6904r.mo3032e(0, 4).mo4852b(new C4463m1.b().m17467Z(this.f6910x == null ? null : new C3348a(this.f6910x)).m17448G());
        this.f6904r.mo3034n();
        this.f6904r.mo3033j(new InterfaceC5586z.b(-9223372036854775807L));
    }

    /* renamed from: y */
    public final void m7524y(AbstractC1820a.a aVar) {
        C3348a c3348a;
        C3348a c3348a2;
        List<C1837r> list;
        int i10;
        int i11;
        ArrayList arrayList = new ArrayList();
        boolean z10 = this.f6909w == 1;
        C5582v c5582v = new C5582v();
        AbstractC1820a.b m7395g = aVar.m7395g(1969517665);
        if (m7395g != null) {
            Pair<C3348a, C3348a> m7397B = C1821b.m7397B(m7395g);
            C3348a c3348a3 = (C3348a) m7397B.first;
            C3348a c3348a4 = (C3348a) m7397B.second;
            if (c3348a3 != null) {
                c5582v.m22500c(c3348a3);
            }
            c3348a = c3348a4;
            c3348a2 = c3348a3;
        } else {
            c3348a = null;
            c3348a2 = null;
        }
        AbstractC1820a.a m7394f = aVar.m7394f(1835365473);
        long j10 = -9223372036854775807L;
        C3348a m7413n = m7394f != null ? C1821b.m7413n(m7394f) : null;
        List<C1837r> m7396A = C1821b.m7396A(aVar, c5582v, -9223372036854775807L, null, (this.f6887a & 1) != 0, z10, new InterfaceC2424g() { // from class: f4.i
            @Override // p109h7.InterfaceC2424g
            public final Object apply(Object obj) {
                C1834o m7509r;
                m7509r = C1830k.m7509r((C1834o) obj);
                return m7509r;
            }
        });
        int size = m7396A.size();
        long j11 = -9223372036854775807L;
        int i12 = 0;
        int i13 = -1;
        while (i12 < size) {
            C1837r c1837r = m7396A.get(i12);
            if (c1837r.f6963b == 0) {
                list = m7396A;
                i10 = size;
            } else {
                C1834o c1834o = c1837r.f6962a;
                list = m7396A;
                i10 = size;
                long j12 = c1834o.f6932e;
                if (j12 == j10) {
                    j12 = c1837r.f6969h;
                }
                long max = Math.max(j11, j12);
                a aVar2 = new a(c1834o, c1837r, this.f6904r.mo3032e(i12, c1834o.f6929b));
                int i14 = "audio/true-hd".equals(c1834o.f6933f.f16506s) ? c1837r.f6966e * 16 : c1837r.f6966e + 30;
                C4463m1.b m17411b = c1834o.f6933f.m17411b();
                m17411b.m17466Y(i14);
                if (c1834o.f6929b == 2 && j12 > 0 && (i11 = c1837r.f6963b) > 1) {
                    m17411b.m17459R(i11 / (((float) j12) / 1000000.0f));
                }
                C1827h.m7500k(c1834o.f6929b, c5582v, m17411b);
                int i15 = c1834o.f6929b;
                C3348a[] c3348aArr = new C3348a[2];
                c3348aArr[0] = c3348a;
                c3348aArr[1] = this.f6894h.isEmpty() ? null : new C3348a(this.f6894h);
                C1827h.m7501l(i15, c3348a2, m7413n, m17411b, c3348aArr);
                aVar2.f6913c.mo4852b(m17411b.m17448G());
                if (c1834o.f6929b == 2 && i13 == -1) {
                    i13 = arrayList.size();
                }
                arrayList.add(aVar2);
                j11 = max;
            }
            i12++;
            m7396A = list;
            size = i10;
            j10 = -9223372036854775807L;
        }
        this.f6907u = i13;
        this.f6908v = j11;
        a[] aVarArr = (a[]) arrayList.toArray(new a[0]);
        this.f6905s = aVarArr;
        this.f6906t = m7507m(aVarArr);
        this.f6904r.mo3034n();
        this.f6904r.mo3033j(this);
    }

    /* renamed from: z */
    public final void m7525z(long j10) {
        if (this.f6896j == 1836086884) {
            int i10 = this.f6898l;
            this.f6910x = new C4164b(0L, j10, -9223372036854775807L, j10 + i10, this.f6897k - i10);
        }
    }
}
