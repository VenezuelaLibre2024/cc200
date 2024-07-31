package p301v0;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p079f6.C1841a;

/* renamed from: v0.i */
/* loaded from: classes.dex */
public abstract class AbstractC5051i {

    /* renamed from: a */
    public int f18936a;

    /* renamed from: b */
    public int f18937b;

    /* renamed from: c */
    public int f18938c;

    /* renamed from: d */
    public C5054j f18939d;

    /* renamed from: e */
    public boolean f18940e;

    /* renamed from: v0.i$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC5051i {

        /* renamed from: f */
        public final byte[] f18941f;

        /* renamed from: g */
        public final boolean f18942g;

        /* renamed from: h */
        public int f18943h;

        /* renamed from: i */
        public int f18944i;

        /* renamed from: j */
        public int f18945j;

        /* renamed from: k */
        public int f18946k;

        /* renamed from: l */
        public int f18947l;

        /* renamed from: m */
        public boolean f18948m;

        /* renamed from: n */
        public int f18949n;

        public b(byte[] bArr, int i10, int i11, boolean z10) {
            super();
            this.f18949n = C1841a.e.API_PRIORITY_OTHER;
            this.f18941f = bArr;
            this.f18943h = i11 + i10;
            this.f18945j = i10;
            this.f18946k = i10;
            this.f18942g = z10;
        }

        public /* synthetic */ b(byte[] bArr, int i10, int i11, boolean z10, a aVar) {
            this(bArr, i10, i11, z10);
        }

        @Override // p301v0.AbstractC5051i
        /* renamed from: A */
        public String mo19995A() {
            int m20023J = m20023J();
            if (m20023J > 0) {
                int i10 = this.f18943h;
                int i11 = this.f18945j;
                if (m20023J <= i10 - i11) {
                    String m20532e = C5083s1.m20532e(this.f18941f, i11, m20023J);
                    this.f18945j += m20023J;
                    return m20532e;
                }
            }
            if (m20023J == 0) {
                return "";
            }
            if (m20023J <= 0) {
                throw C5031b0.m19815f();
            }
            throw C5031b0.m19819k();
        }

        @Override // p301v0.AbstractC5051i
        /* renamed from: B */
        public int mo19996B() {
            if (mo20002e()) {
                this.f18947l = 0;
                return 0;
            }
            int m20023J = m20023J();
            this.f18947l = m20023J;
            if (C5086t1.m20575a(m20023J) != 0) {
                return this.f18947l;
            }
            throw C5031b0.m19811b();
        }

        @Override // p301v0.AbstractC5051i
        /* renamed from: C */
        public int mo19997C() {
            return m20023J();
        }

        @Override // p301v0.AbstractC5051i
        /* renamed from: D */
        public long mo19998D() {
            return m20024K();
        }

        @Override // p301v0.AbstractC5051i
        /* renamed from: E */
        public boolean mo19999E(int i10) {
            int m20576b = C5086t1.m20576b(i10);
            if (m20576b == 0) {
                m20029P();
                return true;
            }
            if (m20576b == 1) {
                m20028O(8);
                return true;
            }
            if (m20576b == 2) {
                m20028O(m20023J());
                return true;
            }
            if (m20576b == 3) {
                m20027N();
                mo20000a(C5086t1.m20577c(C5086t1.m20575a(i10), 4));
                return true;
            }
            if (m20576b == 4) {
                return false;
            }
            if (m20576b != 5) {
                throw C5031b0.m19813d();
            }
            m20028O(4);
            return true;
        }

        /* renamed from: F */
        public byte m20019F() {
            int i10 = this.f18945j;
            if (i10 == this.f18943h) {
                throw C5031b0.m19819k();
            }
            byte[] bArr = this.f18941f;
            this.f18945j = i10 + 1;
            return bArr[i10];
        }

        /* renamed from: G */
        public byte[] m20020G(int i10) {
            if (i10 > 0) {
                int i11 = this.f18943h;
                int i12 = this.f18945j;
                if (i10 <= i11 - i12) {
                    int i13 = i10 + i12;
                    this.f18945j = i13;
                    return Arrays.copyOfRange(this.f18941f, i12, i13);
                }
            }
            if (i10 > 0) {
                throw C5031b0.m19819k();
            }
            if (i10 == 0) {
                return C5028a0.f18864c;
            }
            throw C5031b0.m19815f();
        }

        /* renamed from: H */
        public int m20021H() {
            int i10 = this.f18945j;
            if (this.f18943h - i10 < 4) {
                throw C5031b0.m19819k();
            }
            byte[] bArr = this.f18941f;
            this.f18945j = i10 + 4;
            return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
        }

        /* renamed from: I */
        public long m20022I() {
            int i10 = this.f18945j;
            if (this.f18943h - i10 < 8) {
                throw C5031b0.m19819k();
            }
            byte[] bArr = this.f18941f;
            this.f18945j = i10 + 8;
            return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x0068, code lost:
        
            if (r2[r3] < 0) goto L72;
         */
        /* renamed from: J */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int m20023J() {
            /*
                r5 = this;
                int r0 = r5.f18945j
                int r1 = r5.f18943h
                if (r1 != r0) goto L7
                goto L6a
            L7:
                byte[] r2 = r5.f18941f
                int r3 = r0 + 1
                r0 = r2[r0]
                if (r0 < 0) goto L12
                r5.f18945j = r3
                return r0
            L12:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L18
                goto L6a
            L18:
                int r1 = r3 + 1
                r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L24
                r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
                goto L70
            L24:
                int r3 = r1 + 1
                r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L31
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L2f:
                r1 = r3
                goto L70
            L31:
                int r1 = r3 + 1
                r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L3f
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L70
            L3f:
                int r3 = r1 + 1
                r1 = r2[r1]
                int r4 = r1 << 28
                r0 = r0 ^ r4
                r4 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r4
                if (r1 >= 0) goto L2f
                int r1 = r3 + 1
                r3 = r2[r3]
                if (r3 >= 0) goto L70
                int r3 = r1 + 1
                r1 = r2[r1]
                if (r1 >= 0) goto L2f
                int r1 = r3 + 1
                r3 = r2[r3]
                if (r3 >= 0) goto L70
                int r3 = r1 + 1
                r1 = r2[r1]
                if (r1 >= 0) goto L2f
                int r1 = r3 + 1
                r2 = r2[r3]
                if (r2 >= 0) goto L70
            L6a:
                long r0 = r5.m20025L()
                int r0 = (int) r0
                return r0
            L70:
                r5.f18945j = r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p301v0.AbstractC5051i.b.m20023J():int");
        }

        /* JADX WARN: Code restructure failed: missing block: B:39:0x00b4, code lost:
        
            if (r2[r0] < 0) goto L86;
         */
        /* renamed from: K */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public long m20024K() {
            /*
                Method dump skipped, instructions count: 192
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p301v0.AbstractC5051i.b.m20024K():long");
        }

        /* renamed from: L */
        public long m20025L() {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                j10 |= (r3 & Byte.MAX_VALUE) << i10;
                if ((m20019F() & 128) == 0) {
                    return j10;
                }
            }
            throw C5031b0.m19814e();
        }

        /* renamed from: M */
        public final void m20026M() {
            int i10 = this.f18943h + this.f18944i;
            this.f18943h = i10;
            int i11 = i10 - this.f18946k;
            int i12 = this.f18949n;
            if (i11 <= i12) {
                this.f18944i = 0;
                return;
            }
            int i13 = i11 - i12;
            this.f18944i = i13;
            this.f18943h = i10 - i13;
        }

        /* renamed from: N */
        public void m20027N() {
            int mo19996B;
            do {
                mo19996B = mo19996B();
                if (mo19996B == 0) {
                    return;
                }
            } while (mo19999E(mo19996B));
        }

        /* renamed from: O */
        public void m20028O(int i10) {
            if (i10 >= 0) {
                int i11 = this.f18943h;
                int i12 = this.f18945j;
                if (i10 <= i11 - i12) {
                    this.f18945j = i12 + i10;
                    return;
                }
            }
            if (i10 >= 0) {
                throw C5031b0.m19819k();
            }
            throw C5031b0.m19815f();
        }

        /* renamed from: P */
        public final void m20029P() {
            if (this.f18943h - this.f18945j >= 10) {
                m20030Q();
            } else {
                m20031R();
            }
        }

        /* renamed from: Q */
        public final void m20030Q() {
            for (int i10 = 0; i10 < 10; i10++) {
                byte[] bArr = this.f18941f;
                int i11 = this.f18945j;
                this.f18945j = i11 + 1;
                if (bArr[i11] >= 0) {
                    return;
                }
            }
            throw C5031b0.m19814e();
        }

        /* renamed from: R */
        public final void m20031R() {
            for (int i10 = 0; i10 < 10; i10++) {
                if (m20019F() >= 0) {
                    return;
                }
            }
            throw C5031b0.m19814e();
        }

        @Override // p301v0.AbstractC5051i
        /* renamed from: a */
        public void mo20000a(int i10) {
            if (this.f18947l != i10) {
                throw C5031b0.m19810a();
            }
        }

        @Override // p301v0.AbstractC5051i
        /* renamed from: d */
        public int mo20001d() {
            return this.f18945j - this.f18946k;
        }

        @Override // p301v0.AbstractC5051i
        /* renamed from: e */
        public boolean mo20002e() {
            return this.f18945j == this.f18943h;
        }

        @Override // p301v0.AbstractC5051i
        /* renamed from: k */
        public void mo20003k(int i10) {
            this.f18949n = i10;
            m20026M();
        }

        @Override // p301v0.AbstractC5051i
        /* renamed from: l */
        public int mo20004l(int i10) {
            if (i10 < 0) {
                throw C5031b0.m19815f();
            }
            int mo20001d = i10 + mo20001d();
            int i11 = this.f18949n;
            if (mo20001d > i11) {
                throw C5031b0.m19819k();
            }
            this.f18949n = mo20001d;
            m20026M();
            return i11;
        }

        @Override // p301v0.AbstractC5051i
        /* renamed from: m */
        public boolean mo20005m() {
            return m20024K() != 0;
        }

        @Override // p301v0.AbstractC5051i
        /* renamed from: n */
        public AbstractC5048h mo20006n() {
            int m20023J = m20023J();
            if (m20023J > 0) {
                int i10 = this.f18943h;
                int i11 = this.f18945j;
                if (m20023J <= i10 - i11) {
                    AbstractC5048h m19948C = (this.f18942g && this.f18948m) ? AbstractC5048h.m19948C(this.f18941f, i11, m20023J) : AbstractC5048h.m19953h(this.f18941f, i11, m20023J);
                    this.f18945j += m20023J;
                    return m19948C;
                }
            }
            return m20023J == 0 ? AbstractC5048h.f18921i : AbstractC5048h.m19947B(m20020G(m20023J));
        }

        @Override // p301v0.AbstractC5051i
        /* renamed from: o */
        public double mo20007o() {
            return Double.longBitsToDouble(m20022I());
        }

        @Override // p301v0.AbstractC5051i
        /* renamed from: p */
        public int mo20008p() {
            return m20023J();
        }

        @Override // p301v0.AbstractC5051i
        /* renamed from: q */
        public int mo20009q() {
            return m20021H();
        }

        @Override // p301v0.AbstractC5051i
        /* renamed from: r */
        public long mo20010r() {
            return m20022I();
        }

        @Override // p301v0.AbstractC5051i
        /* renamed from: s */
        public float mo20011s() {
            return Float.intBitsToFloat(m20021H());
        }

        @Override // p301v0.AbstractC5051i
        /* renamed from: t */
        public int mo20012t() {
            return m20023J();
        }

        @Override // p301v0.AbstractC5051i
        /* renamed from: u */
        public long mo20013u() {
            return m20024K();
        }

        @Override // p301v0.AbstractC5051i
        /* renamed from: v */
        public int mo20014v() {
            return m20021H();
        }

        @Override // p301v0.AbstractC5051i
        /* renamed from: w */
        public long mo20015w() {
            return m20022I();
        }

        @Override // p301v0.AbstractC5051i
        /* renamed from: x */
        public int mo20016x() {
            return AbstractC5051i.m19988b(m20023J());
        }

        @Override // p301v0.AbstractC5051i
        /* renamed from: y */
        public long mo20017y() {
            return AbstractC5051i.m19989c(m20024K());
        }

        @Override // p301v0.AbstractC5051i
        /* renamed from: z */
        public String mo20018z() {
            int m20023J = m20023J();
            if (m20023J > 0) {
                int i10 = this.f18943h;
                int i11 = this.f18945j;
                if (m20023J <= i10 - i11) {
                    String str = new String(this.f18941f, i11, m20023J, C5028a0.f18862a);
                    this.f18945j += m20023J;
                    return str;
                }
            }
            if (m20023J == 0) {
                return "";
            }
            if (m20023J < 0) {
                throw C5031b0.m19815f();
            }
            throw C5031b0.m19819k();
        }
    }

    /* renamed from: v0.i$c */
    /* loaded from: classes.dex */
    public static final class c extends AbstractC5051i {

        /* renamed from: f */
        public final InputStream f18950f;

        /* renamed from: g */
        public final byte[] f18951g;

        /* renamed from: h */
        public int f18952h;

        /* renamed from: i */
        public int f18953i;

        /* renamed from: j */
        public int f18954j;

        /* renamed from: k */
        public int f18955k;

        /* renamed from: l */
        public int f18956l;

        /* renamed from: m */
        public int f18957m;

        /* renamed from: n */
        public a f18958n;

        /* renamed from: v0.i$c$a */
        /* loaded from: classes.dex */
        public interface a {
            /* renamed from: a */
            void m20051a();
        }

        public c(InputStream inputStream, int i10) {
            super();
            this.f18957m = C1841a.e.API_PRIORITY_OTHER;
            this.f18958n = null;
            C5028a0.m19790b(inputStream, "input");
            this.f18950f = inputStream;
            this.f18951g = new byte[i10];
            this.f18952h = 0;
            this.f18954j = 0;
            this.f18956l = 0;
        }

        public /* synthetic */ c(InputStream inputStream, int i10, a aVar) {
            this(inputStream, i10);
        }

        @Override // p301v0.AbstractC5051i
        /* renamed from: A */
        public String mo19995A() {
            byte[] m20034H;
            int m20039M = m20039M();
            int i10 = this.f18954j;
            int i11 = this.f18952h;
            if (m20039M <= i11 - i10 && m20039M > 0) {
                m20034H = this.f18951g;
                this.f18954j = i10 + m20039M;
            } else {
                if (m20039M == 0) {
                    return "";
                }
                if (m20039M <= i11) {
                    m20043Q(m20039M);
                    m20034H = this.f18951g;
                    this.f18954j = m20039M + 0;
                } else {
                    m20034H = m20034H(m20039M, false);
                }
                i10 = 0;
            }
            return C5083s1.m20532e(m20034H, i10, m20039M);
        }

        @Override // p301v0.AbstractC5051i
        /* renamed from: B */
        public int mo19996B() {
            if (mo20002e()) {
                this.f18955k = 0;
                return 0;
            }
            int m20039M = m20039M();
            this.f18955k = m20039M;
            if (C5086t1.m20575a(m20039M) != 0) {
                return this.f18955k;
            }
            throw C5031b0.m19811b();
        }

        @Override // p301v0.AbstractC5051i
        /* renamed from: C */
        public int mo19997C() {
            return m20039M();
        }

        @Override // p301v0.AbstractC5051i
        /* renamed from: D */
        public long mo19998D() {
            return m20040N();
        }

        @Override // p301v0.AbstractC5051i
        /* renamed from: E */
        public boolean mo19999E(int i10) {
            int m20576b = C5086t1.m20576b(i10);
            if (m20576b == 0) {
                m20047U();
                return true;
            }
            if (m20576b == 1) {
                m20045S(8);
                return true;
            }
            if (m20576b == 2) {
                m20045S(m20039M());
                return true;
            }
            if (m20576b == 3) {
                m20044R();
                mo20000a(C5086t1.m20577c(C5086t1.m20575a(i10), 4));
                return true;
            }
            if (m20576b == 4) {
                return false;
            }
            if (m20576b != 5) {
                throw C5031b0.m19813d();
            }
            m20045S(4);
            return true;
        }

        /* renamed from: F */
        public final AbstractC5048h m20032F(int i10) {
            byte[] m20035I = m20035I(i10);
            if (m20035I != null) {
                return AbstractC5048h.m19952e(m20035I);
            }
            int i11 = this.f18954j;
            int i12 = this.f18952h;
            int i13 = i12 - i11;
            this.f18956l += i12;
            this.f18954j = 0;
            this.f18952h = 0;
            List<byte[]> m20036J = m20036J(i10 - i13);
            byte[] bArr = new byte[i10];
            System.arraycopy(this.f18951g, i11, bArr, 0, i13);
            for (byte[] bArr2 : m20036J) {
                System.arraycopy(bArr2, 0, bArr, i13, bArr2.length);
                i13 += bArr2.length;
            }
            return AbstractC5048h.m19947B(bArr);
        }

        /* renamed from: G */
        public byte m20033G() {
            if (this.f18954j == this.f18952h) {
                m20043Q(1);
            }
            byte[] bArr = this.f18951g;
            int i10 = this.f18954j;
            this.f18954j = i10 + 1;
            return bArr[i10];
        }

        /* renamed from: H */
        public final byte[] m20034H(int i10, boolean z10) {
            byte[] m20035I = m20035I(i10);
            if (m20035I != null) {
                return z10 ? (byte[]) m20035I.clone() : m20035I;
            }
            int i11 = this.f18954j;
            int i12 = this.f18952h;
            int i13 = i12 - i11;
            this.f18956l += i12;
            this.f18954j = 0;
            this.f18952h = 0;
            List<byte[]> m20036J = m20036J(i10 - i13);
            byte[] bArr = new byte[i10];
            System.arraycopy(this.f18951g, i11, bArr, 0, i13);
            for (byte[] bArr2 : m20036J) {
                System.arraycopy(bArr2, 0, bArr, i13, bArr2.length);
                i13 += bArr2.length;
            }
            return bArr;
        }

        /* renamed from: I */
        public final byte[] m20035I(int i10) {
            if (i10 == 0) {
                return C5028a0.f18864c;
            }
            if (i10 < 0) {
                throw C5031b0.m19815f();
            }
            int i11 = this.f18956l;
            int i12 = this.f18954j;
            int i13 = i11 + i12 + i10;
            if (i13 - this.f18938c > 0) {
                throw C5031b0.m19818j();
            }
            int i14 = this.f18957m;
            if (i13 > i14) {
                m20045S((i14 - i11) - i12);
                throw C5031b0.m19819k();
            }
            int i15 = this.f18952h - i12;
            int i16 = i10 - i15;
            if (i16 >= 4096 && i16 > this.f18950f.available()) {
                return null;
            }
            byte[] bArr = new byte[i10];
            System.arraycopy(this.f18951g, this.f18954j, bArr, 0, i15);
            this.f18956l += this.f18952h;
            this.f18954j = 0;
            this.f18952h = 0;
            while (i15 < i10) {
                int read = this.f18950f.read(bArr, i15, i10 - i15);
                if (read == -1) {
                    throw C5031b0.m19819k();
                }
                this.f18956l += read;
                i15 += read;
            }
            return bArr;
        }

        /* renamed from: J */
        public final List<byte[]> m20036J(int i10) {
            ArrayList arrayList = new ArrayList();
            while (i10 > 0) {
                int min = Math.min(i10, 4096);
                byte[] bArr = new byte[min];
                int i11 = 0;
                while (i11 < min) {
                    int read = this.f18950f.read(bArr, i11, min - i11);
                    if (read == -1) {
                        throw C5031b0.m19819k();
                    }
                    this.f18956l += read;
                    i11 += read;
                }
                i10 -= min;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        /* renamed from: K */
        public int m20037K() {
            int i10 = this.f18954j;
            if (this.f18952h - i10 < 4) {
                m20043Q(4);
                i10 = this.f18954j;
            }
            byte[] bArr = this.f18951g;
            this.f18954j = i10 + 4;
            return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
        }

        /* renamed from: L */
        public long m20038L() {
            int i10 = this.f18954j;
            if (this.f18952h - i10 < 8) {
                m20043Q(8);
                i10 = this.f18954j;
            }
            byte[] bArr = this.f18951g;
            this.f18954j = i10 + 8;
            return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x0068, code lost:
        
            if (r2[r3] < 0) goto L72;
         */
        /* renamed from: M */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int m20039M() {
            /*
                r5 = this;
                int r0 = r5.f18954j
                int r1 = r5.f18952h
                if (r1 != r0) goto L7
                goto L6a
            L7:
                byte[] r2 = r5.f18951g
                int r3 = r0 + 1
                r0 = r2[r0]
                if (r0 < 0) goto L12
                r5.f18954j = r3
                return r0
            L12:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L18
                goto L6a
            L18:
                int r1 = r3 + 1
                r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L24
                r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
                goto L70
            L24:
                int r3 = r1 + 1
                r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L31
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L2f:
                r1 = r3
                goto L70
            L31:
                int r1 = r3 + 1
                r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L3f
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L70
            L3f:
                int r3 = r1 + 1
                r1 = r2[r1]
                int r4 = r1 << 28
                r0 = r0 ^ r4
                r4 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r4
                if (r1 >= 0) goto L2f
                int r1 = r3 + 1
                r3 = r2[r3]
                if (r3 >= 0) goto L70
                int r3 = r1 + 1
                r1 = r2[r1]
                if (r1 >= 0) goto L2f
                int r1 = r3 + 1
                r3 = r2[r3]
                if (r3 >= 0) goto L70
                int r3 = r1 + 1
                r1 = r2[r1]
                if (r1 >= 0) goto L2f
                int r1 = r3 + 1
                r2 = r2[r3]
                if (r2 >= 0) goto L70
            L6a:
                long r0 = r5.m20041O()
                int r0 = (int) r0
                return r0
            L70:
                r5.f18954j = r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p301v0.AbstractC5051i.c.m20039M():int");
        }

        /* JADX WARN: Code restructure failed: missing block: B:39:0x00b4, code lost:
        
            if (r2[r0] < 0) goto L86;
         */
        /* renamed from: N */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public long m20040N() {
            /*
                Method dump skipped, instructions count: 192
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p301v0.AbstractC5051i.c.m20040N():long");
        }

        /* renamed from: O */
        public long m20041O() {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                j10 |= (r3 & Byte.MAX_VALUE) << i10;
                if ((m20033G() & 128) == 0) {
                    return j10;
                }
            }
            throw C5031b0.m19814e();
        }

        /* renamed from: P */
        public final void m20042P() {
            int i10 = this.f18952h + this.f18953i;
            this.f18952h = i10;
            int i11 = this.f18956l + i10;
            int i12 = this.f18957m;
            if (i11 <= i12) {
                this.f18953i = 0;
                return;
            }
            int i13 = i11 - i12;
            this.f18953i = i13;
            this.f18952h = i10 - i13;
        }

        /* renamed from: Q */
        public final void m20043Q(int i10) {
            if (m20050X(i10)) {
                return;
            }
            if (i10 <= (this.f18938c - this.f18956l) - this.f18954j) {
                throw C5031b0.m19819k();
            }
            throw C5031b0.m19818j();
        }

        /* renamed from: R */
        public void m20044R() {
            int mo19996B;
            do {
                mo19996B = mo19996B();
                if (mo19996B == 0) {
                    return;
                }
            } while (mo19999E(mo19996B));
        }

        /* renamed from: S */
        public void m20045S(int i10) {
            int i11 = this.f18952h;
            int i12 = this.f18954j;
            if (i10 > i11 - i12 || i10 < 0) {
                m20046T(i10);
            } else {
                this.f18954j = i12 + i10;
            }
        }

        /* renamed from: T */
        public final void m20046T(int i10) {
            if (i10 < 0) {
                throw C5031b0.m19815f();
            }
            int i11 = this.f18956l;
            int i12 = this.f18954j;
            int i13 = i11 + i12 + i10;
            int i14 = this.f18957m;
            if (i13 > i14) {
                m20045S((i14 - i11) - i12);
                throw C5031b0.m19819k();
            }
            int i15 = 0;
            if (this.f18958n == null) {
                this.f18956l = i11 + i12;
                int i16 = this.f18952h - i12;
                this.f18952h = 0;
                this.f18954j = 0;
                i15 = i16;
                while (i15 < i10) {
                    try {
                        long j10 = i10 - i15;
                        long skip = this.f18950f.skip(j10);
                        if (skip < 0 || skip > j10) {
                            throw new IllegalStateException(this.f18950f.getClass() + "#skip returned invalid result: " + skip + "\nThe InputStream implementation is buggy.");
                        }
                        if (skip == 0) {
                            break;
                        } else {
                            i15 += (int) skip;
                        }
                    } finally {
                        this.f18956l += i15;
                        m20042P();
                    }
                }
            }
            if (i15 >= i10) {
                return;
            }
            int i17 = this.f18952h;
            int i18 = i17 - this.f18954j;
            this.f18954j = i17;
            while (true) {
                m20043Q(1);
                int i19 = i10 - i18;
                int i20 = this.f18952h;
                if (i19 <= i20) {
                    this.f18954j = i19;
                    return;
                } else {
                    i18 += i20;
                    this.f18954j = i20;
                }
            }
        }

        /* renamed from: U */
        public final void m20047U() {
            if (this.f18952h - this.f18954j >= 10) {
                m20048V();
            } else {
                m20049W();
            }
        }

        /* renamed from: V */
        public final void m20048V() {
            for (int i10 = 0; i10 < 10; i10++) {
                byte[] bArr = this.f18951g;
                int i11 = this.f18954j;
                this.f18954j = i11 + 1;
                if (bArr[i11] >= 0) {
                    return;
                }
            }
            throw C5031b0.m19814e();
        }

        /* renamed from: W */
        public final void m20049W() {
            for (int i10 = 0; i10 < 10; i10++) {
                if (m20033G() >= 0) {
                    return;
                }
            }
            throw C5031b0.m19814e();
        }

        /* renamed from: X */
        public final boolean m20050X(int i10) {
            int i11 = this.f18954j;
            if (i11 + i10 <= this.f18952h) {
                throw new IllegalStateException("refillBuffer() called when " + i10 + " bytes were already available in buffer");
            }
            int i12 = this.f18938c;
            int i13 = this.f18956l;
            if (i10 > (i12 - i13) - i11 || i13 + i11 + i10 > this.f18957m) {
                return false;
            }
            a aVar = this.f18958n;
            if (aVar != null) {
                aVar.m20051a();
            }
            int i14 = this.f18954j;
            if (i14 > 0) {
                int i15 = this.f18952h;
                if (i15 > i14) {
                    byte[] bArr = this.f18951g;
                    System.arraycopy(bArr, i14, bArr, 0, i15 - i14);
                }
                this.f18956l += i14;
                this.f18952h -= i14;
                this.f18954j = 0;
            }
            InputStream inputStream = this.f18950f;
            byte[] bArr2 = this.f18951g;
            int i16 = this.f18952h;
            int read = inputStream.read(bArr2, i16, Math.min(bArr2.length - i16, (this.f18938c - this.f18956l) - i16));
            if (read == 0 || read < -1 || read > this.f18951g.length) {
                throw new IllegalStateException(this.f18950f.getClass() + "#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
            }
            if (read <= 0) {
                return false;
            }
            this.f18952h += read;
            m20042P();
            if (this.f18952h >= i10) {
                return true;
            }
            return m20050X(i10);
        }

        @Override // p301v0.AbstractC5051i
        /* renamed from: a */
        public void mo20000a(int i10) {
            if (this.f18955k != i10) {
                throw C5031b0.m19810a();
            }
        }

        @Override // p301v0.AbstractC5051i
        /* renamed from: d */
        public int mo20001d() {
            return this.f18956l + this.f18954j;
        }

        @Override // p301v0.AbstractC5051i
        /* renamed from: e */
        public boolean mo20002e() {
            return this.f18954j == this.f18952h && !m20050X(1);
        }

        @Override // p301v0.AbstractC5051i
        /* renamed from: k */
        public void mo20003k(int i10) {
            this.f18957m = i10;
            m20042P();
        }

        @Override // p301v0.AbstractC5051i
        /* renamed from: l */
        public int mo20004l(int i10) {
            if (i10 < 0) {
                throw C5031b0.m19815f();
            }
            int i11 = i10 + this.f18956l + this.f18954j;
            int i12 = this.f18957m;
            if (i11 > i12) {
                throw C5031b0.m19819k();
            }
            this.f18957m = i11;
            m20042P();
            return i12;
        }

        @Override // p301v0.AbstractC5051i
        /* renamed from: m */
        public boolean mo20005m() {
            return m20040N() != 0;
        }

        @Override // p301v0.AbstractC5051i
        /* renamed from: n */
        public AbstractC5048h mo20006n() {
            int m20039M = m20039M();
            int i10 = this.f18952h;
            int i11 = this.f18954j;
            if (m20039M > i10 - i11 || m20039M <= 0) {
                return m20039M == 0 ? AbstractC5048h.f18921i : m20032F(m20039M);
            }
            AbstractC5048h m19953h = AbstractC5048h.m19953h(this.f18951g, i11, m20039M);
            this.f18954j += m20039M;
            return m19953h;
        }

        @Override // p301v0.AbstractC5051i
        /* renamed from: o */
        public double mo20007o() {
            return Double.longBitsToDouble(m20038L());
        }

        @Override // p301v0.AbstractC5051i
        /* renamed from: p */
        public int mo20008p() {
            return m20039M();
        }

        @Override // p301v0.AbstractC5051i
        /* renamed from: q */
        public int mo20009q() {
            return m20037K();
        }

        @Override // p301v0.AbstractC5051i
        /* renamed from: r */
        public long mo20010r() {
            return m20038L();
        }

        @Override // p301v0.AbstractC5051i
        /* renamed from: s */
        public float mo20011s() {
            return Float.intBitsToFloat(m20037K());
        }

        @Override // p301v0.AbstractC5051i
        /* renamed from: t */
        public int mo20012t() {
            return m20039M();
        }

        @Override // p301v0.AbstractC5051i
        /* renamed from: u */
        public long mo20013u() {
            return m20040N();
        }

        @Override // p301v0.AbstractC5051i
        /* renamed from: v */
        public int mo20014v() {
            return m20037K();
        }

        @Override // p301v0.AbstractC5051i
        /* renamed from: w */
        public long mo20015w() {
            return m20038L();
        }

        @Override // p301v0.AbstractC5051i
        /* renamed from: x */
        public int mo20016x() {
            return AbstractC5051i.m19988b(m20039M());
        }

        @Override // p301v0.AbstractC5051i
        /* renamed from: y */
        public long mo20017y() {
            return AbstractC5051i.m19989c(m20040N());
        }

        @Override // p301v0.AbstractC5051i
        /* renamed from: z */
        public String mo20018z() {
            int m20039M = m20039M();
            if (m20039M > 0) {
                int i10 = this.f18952h;
                int i11 = this.f18954j;
                if (m20039M <= i10 - i11) {
                    String str = new String(this.f18951g, i11, m20039M, C5028a0.f18862a);
                    this.f18954j += m20039M;
                    return str;
                }
            }
            if (m20039M == 0) {
                return "";
            }
            if (m20039M > this.f18952h) {
                return new String(m20034H(m20039M, false), C5028a0.f18862a);
            }
            m20043Q(m20039M);
            String str2 = new String(this.f18951g, this.f18954j, m20039M, C5028a0.f18862a);
            this.f18954j += m20039M;
            return str2;
        }
    }

    public AbstractC5051i() {
        this.f18937b = 100;
        this.f18938c = C1841a.e.API_PRIORITY_OTHER;
        this.f18940e = false;
    }

    public /* synthetic */ AbstractC5051i(a aVar) {
        this();
    }

    /* renamed from: b */
    public static int m19988b(int i10) {
        return (-(i10 & 1)) ^ (i10 >>> 1);
    }

    /* renamed from: c */
    public static long m19989c(long j10) {
        return (-(j10 & 1)) ^ (j10 >>> 1);
    }

    /* renamed from: f */
    public static AbstractC5051i m19990f(InputStream inputStream) {
        return m19991g(inputStream, 4096);
    }

    /* renamed from: g */
    public static AbstractC5051i m19991g(InputStream inputStream, int i10) {
        if (i10 > 0) {
            return inputStream == null ? m19992h(C5028a0.f18864c) : new c(inputStream, i10);
        }
        throw new IllegalArgumentException("bufferSize must be > 0");
    }

    /* renamed from: h */
    public static AbstractC5051i m19992h(byte[] bArr) {
        return m19993i(bArr, 0, bArr.length);
    }

    /* renamed from: i */
    public static AbstractC5051i m19993i(byte[] bArr, int i10, int i11) {
        return m19994j(bArr, i10, i11, false);
    }

    /* renamed from: j */
    public static AbstractC5051i m19994j(byte[] bArr, int i10, int i11, boolean z10) {
        b bVar = new b(bArr, i10, i11, z10);
        try {
            bVar.mo20004l(i11);
            return bVar;
        } catch (C5031b0 e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    /* renamed from: A */
    public abstract String mo19995A();

    /* renamed from: B */
    public abstract int mo19996B();

    /* renamed from: C */
    public abstract int mo19997C();

    /* renamed from: D */
    public abstract long mo19998D();

    /* renamed from: E */
    public abstract boolean mo19999E(int i10);

    /* renamed from: a */
    public abstract void mo20000a(int i10);

    /* renamed from: d */
    public abstract int mo20001d();

    /* renamed from: e */
    public abstract boolean mo20002e();

    /* renamed from: k */
    public abstract void mo20003k(int i10);

    /* renamed from: l */
    public abstract int mo20004l(int i10);

    /* renamed from: m */
    public abstract boolean mo20005m();

    /* renamed from: n */
    public abstract AbstractC5048h mo20006n();

    /* renamed from: o */
    public abstract double mo20007o();

    /* renamed from: p */
    public abstract int mo20008p();

    /* renamed from: q */
    public abstract int mo20009q();

    /* renamed from: r */
    public abstract long mo20010r();

    /* renamed from: s */
    public abstract float mo20011s();

    /* renamed from: t */
    public abstract int mo20012t();

    /* renamed from: u */
    public abstract long mo20013u();

    /* renamed from: v */
    public abstract int mo20014v();

    /* renamed from: w */
    public abstract long mo20015w();

    /* renamed from: x */
    public abstract int mo20016x();

    /* renamed from: y */
    public abstract long mo20017y();

    /* renamed from: z */
    public abstract String mo20018z();
}
