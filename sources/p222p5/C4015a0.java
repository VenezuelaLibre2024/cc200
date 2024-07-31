package p222p5;

import java.nio.charset.Charset;
import java.util.Arrays;
import p109h7.C2422e;
import p126i7.AbstractC2657x;
import p155k7.C3365b;
import p155k7.C3371h;

/* renamed from: p5.a0 */
/* loaded from: classes.dex */
public final class C4015a0 {

    /* renamed from: d */
    public static final char[] f14444d = {'\r', '\n'};

    /* renamed from: e */
    public static final char[] f14445e = {'\n'};

    /* renamed from: f */
    public static final AbstractC2657x<Charset> f14446f = AbstractC2657x.m10826w(C2422e.f9745a, C2422e.f9747c, C2422e.f9750f, C2422e.f9748d, C2422e.f9749e);

    /* renamed from: a */
    public byte[] f14447a;

    /* renamed from: b */
    public int f14448b;

    /* renamed from: c */
    public int f14449c;

    public C4015a0() {
        this.f14447a = C4041n0.f14518f;
    }

    public C4015a0(int i10) {
        this.f14447a = new byte[i10];
        this.f14449c = i10;
    }

    public C4015a0(byte[] bArr) {
        this.f14447a = bArr;
        this.f14449c = bArr.length;
    }

    public C4015a0(byte[] bArr, int i10) {
        this.f14447a = bArr;
        this.f14449c = i10;
    }

    /* renamed from: A */
    public String m15204A() {
        return m15239n((char) 0);
    }

    /* renamed from: B */
    public String m15205B(int i10) {
        if (i10 == 0) {
            return "";
        }
        int i11 = this.f14448b;
        int i12 = (i11 + i10) - 1;
        String m15401E = C4041n0.m15401E(this.f14447a, i11, (i12 >= this.f14449c || this.f14447a[i12] != 0) ? i10 : i10 - 1);
        this.f14448b += i10;
        return m15401E;
    }

    /* renamed from: C */
    public short m15206C() {
        byte[] bArr = this.f14447a;
        int i10 = this.f14448b;
        int i11 = i10 + 1;
        this.f14448b = i11;
        int i12 = (bArr[i10] & 255) << 8;
        this.f14448b = i11 + 1;
        return (short) ((bArr[i11] & 255) | i12);
    }

    /* renamed from: D */
    public String m15207D(int i10) {
        return m15208E(i10, C2422e.f9747c);
    }

    /* renamed from: E */
    public String m15208E(int i10, Charset charset) {
        String str = new String(this.f14447a, this.f14448b, i10, charset);
        this.f14448b += i10;
        return str;
    }

    /* renamed from: F */
    public int m15209F() {
        return (m15210G() << 21) | (m15210G() << 14) | (m15210G() << 7) | m15210G();
    }

    /* renamed from: G */
    public int m15210G() {
        byte[] bArr = this.f14447a;
        int i10 = this.f14448b;
        this.f14448b = i10 + 1;
        return bArr[i10] & 255;
    }

    /* renamed from: H */
    public int m15211H() {
        byte[] bArr = this.f14447a;
        int i10 = this.f14448b;
        int i11 = i10 + 1;
        this.f14448b = i11;
        int i12 = (bArr[i10] & 255) << 8;
        int i13 = i11 + 1;
        this.f14448b = i13;
        int i14 = (bArr[i11] & 255) | i12;
        this.f14448b = i13 + 2;
        return i14;
    }

    /* renamed from: I */
    public long m15212I() {
        byte[] bArr = this.f14447a;
        int i10 = this.f14448b + 1;
        this.f14448b = i10;
        long j10 = (bArr[r1] & 255) << 24;
        int i11 = i10 + 1;
        this.f14448b = i11;
        int i12 = i11 + 1;
        this.f14448b = i12;
        long j11 = j10 | ((bArr[i10] & 255) << 16) | ((bArr[i11] & 255) << 8);
        this.f14448b = i12 + 1;
        return j11 | (bArr[i12] & 255);
    }

    /* renamed from: J */
    public int m15213J() {
        byte[] bArr = this.f14447a;
        int i10 = this.f14448b;
        int i11 = i10 + 1;
        this.f14448b = i11;
        int i12 = (bArr[i10] & 255) << 16;
        int i13 = i11 + 1;
        this.f14448b = i13;
        int i14 = i12 | ((bArr[i11] & 255) << 8);
        this.f14448b = i13 + 1;
        return (bArr[i13] & 255) | i14;
    }

    /* renamed from: K */
    public int m15214K() {
        int m15241p = m15241p();
        if (m15241p >= 0) {
            return m15241p;
        }
        throw new IllegalStateException("Top bit not zero: " + m15241p);
    }

    /* renamed from: L */
    public long m15215L() {
        long m15251z = m15251z();
        if (m15251z >= 0) {
            return m15251z;
        }
        throw new IllegalStateException("Top bit not zero: " + m15251z);
    }

    /* renamed from: M */
    public int m15216M() {
        byte[] bArr = this.f14447a;
        int i10 = this.f14448b;
        int i11 = i10 + 1;
        this.f14448b = i11;
        int i12 = (bArr[i10] & 255) << 8;
        this.f14448b = i11 + 1;
        return (bArr[i11] & 255) | i12;
    }

    /* renamed from: N */
    public long m15217N() {
        int i10;
        int i11;
        long j10 = this.f14447a[this.f14448b];
        int i12 = 7;
        while (true) {
            if (i12 < 0) {
                break;
            }
            if (((1 << i12) & j10) != 0) {
                i12--;
            } else if (i12 < 6) {
                j10 &= r6 - 1;
                i11 = 7 - i12;
            } else if (i12 == 7) {
                i11 = 1;
            }
        }
        i11 = 0;
        if (i11 == 0) {
            throw new NumberFormatException("Invalid UTF-8 sequence first byte: " + j10);
        }
        for (i10 = 1; i10 < i11; i10++) {
            if ((this.f14447a[this.f14448b + i10] & 192) != 128) {
                throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: " + j10);
            }
            j10 = (j10 << 6) | (r3 & 63);
        }
        this.f14448b += i11;
        return j10;
    }

    /* renamed from: O */
    public Charset m15218O() {
        if (m15226a() >= 3) {
            byte[] bArr = this.f14447a;
            int i10 = this.f14448b;
            if (bArr[i10] == -17 && bArr[i10 + 1] == -69 && bArr[i10 + 2] == -65) {
                this.f14448b = i10 + 3;
                return C2422e.f9747c;
            }
        }
        if (m15226a() < 2) {
            return null;
        }
        byte[] bArr2 = this.f14447a;
        int i11 = this.f14448b;
        if (bArr2[i11] == -2 && bArr2[i11 + 1] == -1) {
            this.f14448b = i11 + 2;
            return C2422e.f9748d;
        }
        if (bArr2[i11] != -1 || bArr2[i11 + 1] != -2) {
            return null;
        }
        this.f14448b = i11 + 2;
        return C2422e.f9749e;
    }

    /* renamed from: P */
    public void m15219P(int i10) {
        m15221R(m15227b() < i10 ? new byte[i10] : this.f14447a, i10);
    }

    /* renamed from: Q */
    public void m15220Q(byte[] bArr) {
        m15221R(bArr, bArr.length);
    }

    /* renamed from: R */
    public void m15221R(byte[] bArr, int i10) {
        this.f14447a = bArr;
        this.f14449c = i10;
        this.f14448b = 0;
    }

    /* renamed from: S */
    public void m15222S(int i10) {
        C4014a.m15195a(i10 >= 0 && i10 <= this.f14447a.length);
        this.f14449c = i10;
    }

    /* renamed from: T */
    public void m15223T(int i10) {
        C4014a.m15195a(i10 >= 0 && i10 <= this.f14449c);
        this.f14448b = i10;
    }

    /* renamed from: U */
    public void m15224U(int i10) {
        m15223T(this.f14448b + i10);
    }

    /* renamed from: V */
    public final void m15225V(Charset charset) {
        if (m15238m(charset, f14444d) == '\r') {
            m15238m(charset, f14445e);
        }
    }

    /* renamed from: a */
    public int m15226a() {
        return this.f14449c - this.f14448b;
    }

    /* renamed from: b */
    public int m15227b() {
        return this.f14447a.length;
    }

    /* renamed from: c */
    public void m15228c(int i10) {
        if (i10 > m15227b()) {
            this.f14447a = Arrays.copyOf(this.f14447a, i10);
        }
    }

    /* renamed from: d */
    public final int m15229d(Charset charset) {
        int i10;
        if (charset.equals(C2422e.f9747c) || charset.equals(C2422e.f9745a)) {
            i10 = 1;
        } else {
            if (!charset.equals(C2422e.f9750f) && !charset.equals(C2422e.f9749e) && !charset.equals(C2422e.f9748d)) {
                throw new IllegalArgumentException("Unsupported charset: " + charset);
            }
            i10 = 2;
        }
        int i11 = this.f14448b;
        while (true) {
            int i12 = this.f14449c;
            if (i11 >= i12 - (i10 - 1)) {
                return i12;
            }
            if ((charset.equals(C2422e.f9747c) || charset.equals(C2422e.f9745a)) && C4041n0.m15486u0(this.f14447a[i11])) {
                return i11;
            }
            if (charset.equals(C2422e.f9750f) || charset.equals(C2422e.f9748d)) {
                byte[] bArr = this.f14447a;
                if (bArr[i11] == 0 && C4041n0.m15486u0(bArr[i11 + 1])) {
                    return i11;
                }
            }
            if (charset.equals(C2422e.f9749e)) {
                byte[] bArr2 = this.f14447a;
                if (bArr2[i11 + 1] == 0 && C4041n0.m15486u0(bArr2[i11])) {
                    return i11;
                }
            }
            i11 += i10;
        }
    }

    /* renamed from: e */
    public byte[] m15230e() {
        return this.f14447a;
    }

    /* renamed from: f */
    public int m15231f() {
        return this.f14448b;
    }

    /* renamed from: g */
    public int m15232g() {
        return this.f14449c;
    }

    /* renamed from: h */
    public char m15233h(Charset charset) {
        C4014a.m15196b(f14446f.contains(charset), "Unsupported charset: " + charset);
        return (char) (m15234i(charset) >> 16);
    }

    /* renamed from: i */
    public final int m15234i(Charset charset) {
        byte m12518a;
        char m12520c;
        int i10 = 2;
        if ((charset.equals(C2422e.f9747c) || charset.equals(C2422e.f9745a)) && m15226a() >= 1) {
            m12518a = (byte) C3365b.m12518a(C3371h.m12540a(this.f14447a[this.f14448b]));
            i10 = 1;
        } else {
            if ((charset.equals(C2422e.f9750f) || charset.equals(C2422e.f9748d)) && m15226a() >= 2) {
                byte[] bArr = this.f14447a;
                int i11 = this.f14448b;
                m12520c = C3365b.m12520c(bArr[i11], bArr[i11 + 1]);
            } else {
                if (!charset.equals(C2422e.f9749e) || m15226a() < 2) {
                    return 0;
                }
                byte[] bArr2 = this.f14447a;
                int i12 = this.f14448b;
                m12520c = C3365b.m12520c(bArr2[i12 + 1], bArr2[i12]);
            }
            m12518a = (byte) m12520c;
        }
        return (C3365b.m12518a(m12518a) << 16) + i10;
    }

    /* renamed from: j */
    public int m15235j() {
        return this.f14447a[this.f14448b] & 255;
    }

    /* renamed from: k */
    public void m15236k(C4054z c4054z, int i10) {
        m15237l(c4054z.f14602a, 0, i10);
        c4054z.m15609p(0);
    }

    /* renamed from: l */
    public void m15237l(byte[] bArr, int i10, int i11) {
        System.arraycopy(this.f14447a, this.f14448b, bArr, i10, i11);
        this.f14448b += i11;
    }

    /* renamed from: m */
    public final char m15238m(Charset charset, char[] cArr) {
        int m15234i = m15234i(charset);
        if (m15234i == 0) {
            return (char) 0;
        }
        char c10 = (char) (m15234i >> 16);
        if (!C3365b.m12519b(cArr, c10)) {
            return (char) 0;
        }
        this.f14448b += m15234i & 65535;
        return c10;
    }

    /* renamed from: n */
    public String m15239n(char c10) {
        if (m15226a() == 0) {
            return null;
        }
        int i10 = this.f14448b;
        while (i10 < this.f14449c && this.f14447a[i10] != c10) {
            i10++;
        }
        byte[] bArr = this.f14447a;
        int i11 = this.f14448b;
        String m15401E = C4041n0.m15401E(bArr, i11, i10 - i11);
        this.f14448b = i10;
        if (i10 < this.f14449c) {
            this.f14448b = i10 + 1;
        }
        return m15401E;
    }

    /* renamed from: o */
    public double m15240o() {
        return Double.longBitsToDouble(m15251z());
    }

    /* renamed from: p */
    public int m15241p() {
        byte[] bArr = this.f14447a;
        int i10 = this.f14448b;
        int i11 = i10 + 1;
        this.f14448b = i11;
        int i12 = (bArr[i10] & 255) << 24;
        int i13 = i11 + 1;
        this.f14448b = i13;
        int i14 = i12 | ((bArr[i11] & 255) << 16);
        int i15 = i13 + 1;
        this.f14448b = i15;
        int i16 = i14 | ((bArr[i13] & 255) << 8);
        this.f14448b = i15 + 1;
        return (bArr[i15] & 255) | i16;
    }

    /* renamed from: q */
    public int m15242q() {
        byte[] bArr = this.f14447a;
        int i10 = this.f14448b;
        int i11 = i10 + 1;
        this.f14448b = i11;
        int i12 = ((bArr[i10] & 255) << 24) >> 8;
        int i13 = i11 + 1;
        this.f14448b = i13;
        int i14 = i12 | ((bArr[i11] & 255) << 8);
        this.f14448b = i13 + 1;
        return (bArr[i13] & 255) | i14;
    }

    /* renamed from: r */
    public String m15243r() {
        return m15244s(C2422e.f9747c);
    }

    /* renamed from: s */
    public String m15244s(Charset charset) {
        C4014a.m15196b(f14446f.contains(charset), "Unsupported charset: " + charset);
        if (m15226a() == 0) {
            return null;
        }
        if (!charset.equals(C2422e.f9745a)) {
            m15218O();
        }
        String m15208E = m15208E(m15229d(charset) - this.f14448b, charset);
        if (this.f14448b == this.f14449c) {
            return m15208E;
        }
        m15225V(charset);
        return m15208E;
    }

    /* renamed from: t */
    public int m15245t() {
        byte[] bArr = this.f14447a;
        int i10 = this.f14448b;
        int i11 = i10 + 1;
        this.f14448b = i11;
        int i12 = bArr[i10] & 255;
        int i13 = i11 + 1;
        this.f14448b = i13;
        int i14 = i12 | ((bArr[i11] & 255) << 8);
        int i15 = i13 + 1;
        this.f14448b = i15;
        int i16 = i14 | ((bArr[i13] & 255) << 16);
        this.f14448b = i15 + 1;
        return ((bArr[i15] & 255) << 24) | i16;
    }

    /* renamed from: u */
    public long m15246u() {
        byte[] bArr = this.f14447a;
        int i10 = this.f14448b + 1;
        this.f14448b = i10;
        long j10 = bArr[r1] & 255;
        int i11 = i10 + 1;
        this.f14448b = i11;
        int i12 = i11 + 1;
        this.f14448b = i12;
        long j11 = j10 | ((bArr[i10] & 255) << 8) | ((bArr[i11] & 255) << 16);
        int i13 = i12 + 1;
        this.f14448b = i13;
        long j12 = j11 | ((bArr[i12] & 255) << 24);
        int i14 = i13 + 1;
        this.f14448b = i14;
        long j13 = j12 | ((bArr[i13] & 255) << 32);
        int i15 = i14 + 1;
        this.f14448b = i15;
        long j14 = j13 | ((bArr[i14] & 255) << 40);
        int i16 = i15 + 1;
        this.f14448b = i16;
        long j15 = j14 | ((bArr[i15] & 255) << 48);
        this.f14448b = i16 + 1;
        return j15 | ((bArr[i16] & 255) << 56);
    }

    /* renamed from: v */
    public short m15247v() {
        byte[] bArr = this.f14447a;
        int i10 = this.f14448b;
        int i11 = i10 + 1;
        this.f14448b = i11;
        int i12 = bArr[i10] & 255;
        this.f14448b = i11 + 1;
        return (short) (((bArr[i11] & 255) << 8) | i12);
    }

    /* renamed from: w */
    public long m15248w() {
        byte[] bArr = this.f14447a;
        int i10 = this.f14448b + 1;
        this.f14448b = i10;
        long j10 = bArr[r1] & 255;
        int i11 = i10 + 1;
        this.f14448b = i11;
        int i12 = i11 + 1;
        this.f14448b = i12;
        long j11 = j10 | ((bArr[i10] & 255) << 8) | ((bArr[i11] & 255) << 16);
        this.f14448b = i12 + 1;
        return j11 | ((bArr[i12] & 255) << 24);
    }

    /* renamed from: x */
    public int m15249x() {
        int m15245t = m15245t();
        if (m15245t >= 0) {
            return m15245t;
        }
        throw new IllegalStateException("Top bit not zero: " + m15245t);
    }

    /* renamed from: y */
    public int m15250y() {
        byte[] bArr = this.f14447a;
        int i10 = this.f14448b;
        int i11 = i10 + 1;
        this.f14448b = i11;
        int i12 = bArr[i10] & 255;
        this.f14448b = i11 + 1;
        return ((bArr[i11] & 255) << 8) | i12;
    }

    /* renamed from: z */
    public long m15251z() {
        byte[] bArr = this.f14447a;
        int i10 = this.f14448b + 1;
        this.f14448b = i10;
        long j10 = (bArr[r1] & 255) << 56;
        int i11 = i10 + 1;
        this.f14448b = i11;
        int i12 = i11 + 1;
        this.f14448b = i12;
        long j11 = j10 | ((bArr[i10] & 255) << 48) | ((bArr[i11] & 255) << 40);
        int i13 = i12 + 1;
        this.f14448b = i13;
        long j12 = j11 | ((bArr[i12] & 255) << 32);
        int i14 = i13 + 1;
        this.f14448b = i14;
        long j13 = j12 | ((bArr[i13] & 255) << 24);
        int i15 = i14 + 1;
        this.f14448b = i15;
        long j14 = j13 | ((bArr[i14] & 255) << 16);
        int i16 = i15 + 1;
        this.f14448b = i16;
        long j15 = j14 | ((bArr[i15] & 255) << 8);
        this.f14448b = i16 + 1;
        return j15 | (bArr[i16] & 255);
    }
}
