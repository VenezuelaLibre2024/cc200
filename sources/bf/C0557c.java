package bf;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

/* renamed from: bf.c */
/* loaded from: classes2.dex */
public final class C0557c implements InterfaceC0559e, InterfaceC0558d, Cloneable, ByteChannel {

    /* renamed from: j */
    public static final byte[] f2506j = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};

    /* renamed from: h */
    public C0570p f2507h;

    /* renamed from: i */
    public long f2508i;

    @Override // bf.InterfaceC0559e
    /* renamed from: A */
    public C0557c mo2804A() {
        return this;
    }

    @Override // bf.InterfaceC0559e
    /* renamed from: B */
    public boolean mo2805B() {
        return this.f2508i == 0;
    }

    @Override // bf.InterfaceC0559e
    /* renamed from: B0 */
    public void mo2806B0(long j10) {
        if (this.f2508i < j10) {
            throw new EOFException();
        }
    }

    @Override // bf.InterfaceC0573s
    /* renamed from: C0 */
    public void mo2798C0(C0557c c0557c, long j10) {
        if (c0557c == null) {
            throw new IllegalArgumentException("source == null");
        }
        if (c0557c == this) {
            throw new IllegalArgumentException("source == this");
        }
        C0576v.m2921b(c0557c.f2508i, 0L, j10);
        while (j10 > 0) {
            C0570p c0570p = c0557c.f2507h;
            if (j10 < c0570p.f2542c - c0570p.f2541b) {
                C0570p c0570p2 = this.f2507h;
                C0570p c0570p3 = c0570p2 != null ? c0570p2.f2546g : null;
                if (c0570p3 != null && c0570p3.f2544e) {
                    if ((c0570p3.f2542c + j10) - (c0570p3.f2543d ? 0 : c0570p3.f2541b) <= 8192) {
                        c0570p.m2914f(c0570p3, (int) j10);
                        c0557c.f2508i -= j10;
                        this.f2508i += j10;
                        return;
                    }
                }
                c0557c.f2507h = c0570p.m2913e((int) j10);
            }
            C0570p c0570p4 = c0557c.f2507h;
            long j11 = c0570p4.f2542c - c0570p4.f2541b;
            c0557c.f2507h = c0570p4.m2910b();
            C0570p c0570p5 = this.f2507h;
            if (c0570p5 == null) {
                this.f2507h = c0570p4;
                c0570p4.f2546g = c0570p4;
                c0570p4.f2545f = c0570p4;
            } else {
                c0570p5.f2546g.m2911c(c0570p4).m2909a();
            }
            c0557c.f2508i -= j11;
            this.f2508i += j11;
            j10 -= j11;
        }
    }

    @Override // bf.InterfaceC0559e
    /* renamed from: E0 */
    public long mo2808E0(byte b10) {
        return m2817K(b10, 0L, Long.MAX_VALUE);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a5 A[EDGE_INSN: B:41:0x00a5->B:38:0x00a5 BREAK  A[LOOP:0: B:4:0x000b->B:40:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009d  */
    @Override // bf.InterfaceC0559e
    /* renamed from: F0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long mo2809F0() {
        /*
            r14 = this;
            long r0 = r14.f2508i
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lac
            r0 = 0
            r1 = r0
            r4 = r2
        Lb:
            bf.p r6 = r14.f2507h
            byte[] r7 = r6.f2540a
            int r8 = r6.f2541b
            int r9 = r6.f2542c
        L13:
            if (r8 >= r9) goto L91
            r10 = r7[r8]
            r11 = 48
            if (r10 < r11) goto L22
            r11 = 57
            if (r10 > r11) goto L22
            int r11 = r10 + (-48)
            goto L3a
        L22:
            r11 = 97
            if (r10 < r11) goto L2f
            r11 = 102(0x66, float:1.43E-43)
            if (r10 > r11) goto L2f
            int r11 = r10 + (-97)
        L2c:
            int r11 = r11 + 10
            goto L3a
        L2f:
            r11 = 65
            if (r10 < r11) goto L72
            r11 = 70
            if (r10 > r11) goto L72
            int r11 = r10 + (-65)
            goto L2c
        L3a:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 != 0) goto L4a
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L13
        L4a:
            bf.c r0 = new bf.c
            r0.<init>()
            bf.c r0 = r0.mo2826d0(r4)
            bf.c r0 = r0.mo2807C(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Number too large: "
            r2.append(r3)
            java.lang.String r0 = r0.m2825c0()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L72:
            if (r0 == 0) goto L76
            r1 = 1
            goto L91
        L76:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.append(r2)
            java.lang.String r2 = java.lang.Integer.toHexString(r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L91:
            if (r8 != r9) goto L9d
            bf.p r7 = r6.m2910b()
            r14.f2507h = r7
            bf.C0571q.m2915a(r6)
            goto L9f
        L9d:
            r6.f2541b = r8
        L9f:
            if (r1 != 0) goto La5
            bf.p r6 = r14.f2507h
            if (r6 != 0) goto Lb
        La5:
            long r1 = r14.f2508i
            long r6 = (long) r0
            long r1 = r1 - r6
            r14.f2508i = r1
            return r4
        Lac:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "size == 0"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: bf.C0557c.mo2809F0():long");
    }

    /* renamed from: G0 */
    public C0557c m2810G0(String str, int i10, int i11, Charset charset) {
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (i10 < 0) {
            throw new IllegalAccessError("beginIndex < 0: " + i10);
        }
        if (i11 < i10) {
            throw new IllegalArgumentException("endIndex < beginIndex: " + i11 + " < " + i10);
        }
        if (i11 <= str.length()) {
            if (charset == null) {
                throw new IllegalArgumentException("charset == null");
            }
            if (charset.equals(C0576v.f2555a)) {
                return m2814I0(str, i10, i11);
            }
            byte[] bytes = str.substring(i10, i11).getBytes(charset);
            return mo2822Y(bytes, 0, bytes.length);
        }
        throw new IllegalArgumentException("endIndex > string.length: " + i11 + " > " + str.length());
    }

    @Override // bf.InterfaceC0559e
    /* renamed from: H */
    public long mo2811H(InterfaceC0573s interfaceC0573s) {
        long j10 = this.f2508i;
        if (j10 > 0) {
            interfaceC0573s.mo2798C0(this, j10);
        }
        return j10;
    }

    @Override // bf.InterfaceC0558d
    /* renamed from: H0 */
    public C0557c mo2820S(String str) {
        return m2814I0(str, 0, str.length());
    }

    /* renamed from: I */
    public final byte m2813I(long j10) {
        int i10;
        C0576v.m2921b(this.f2508i, j10, 1L);
        long j11 = this.f2508i;
        if (j11 - j10 <= j10) {
            long j12 = j10 - j11;
            C0570p c0570p = this.f2507h;
            do {
                c0570p = c0570p.f2546g;
                int i11 = c0570p.f2542c;
                i10 = c0570p.f2541b;
                j12 += i11 - i10;
            } while (j12 < 0);
            return c0570p.f2540a[i10 + ((int) j12)];
        }
        C0570p c0570p2 = this.f2507h;
        while (true) {
            int i12 = c0570p2.f2542c;
            int i13 = c0570p2.f2541b;
            long j13 = i12 - i13;
            if (j10 < j13) {
                return c0570p2.f2540a[i13 + ((int) j10)];
            }
            j10 -= j13;
            c0570p2 = c0570p2.f2545f;
        }
    }

    /* renamed from: I0 */
    public C0557c m2814I0(String str, int i10, int i11) {
        int i12;
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (i10 < 0) {
            throw new IllegalArgumentException("beginIndex < 0: " + i10);
        }
        if (i11 < i10) {
            throw new IllegalArgumentException("endIndex < beginIndex: " + i11 + " < " + i10);
        }
        if (i11 > str.length()) {
            throw new IllegalArgumentException("endIndex > string.length: " + i11 + " > " + str.length());
        }
        while (i10 < i11) {
            char charAt = str.charAt(i10);
            if (charAt < 128) {
                C0570p m2836l0 = m2836l0(1);
                byte[] bArr = m2836l0.f2540a;
                int i13 = m2836l0.f2542c - i10;
                int min = Math.min(i11, 8192 - i13);
                int i14 = i10 + 1;
                bArr[i10 + i13] = (byte) charAt;
                while (i14 < min) {
                    char charAt2 = str.charAt(i14);
                    if (charAt2 >= 128) {
                        break;
                    }
                    bArr[i14 + i13] = (byte) charAt2;
                    i14++;
                }
                int i15 = m2836l0.f2542c;
                int i16 = (i13 + i14) - i15;
                m2836l0.f2542c = i15 + i16;
                this.f2508i += i16;
                i10 = i14;
            } else {
                if (charAt < 2048) {
                    i12 = (charAt >> 6) | 192;
                } else if (charAt < 55296 || charAt > 57343) {
                    mo2807C((charAt >> '\f') | 224);
                    i12 = ((charAt >> 6) & 63) | 128;
                } else {
                    int i17 = i10 + 1;
                    char charAt3 = i17 < i11 ? str.charAt(i17) : (char) 0;
                    if (charAt > 56319 || charAt3 < 56320 || charAt3 > 57343) {
                        mo2807C(63);
                        i10 = i17;
                    } else {
                        int i18 = (((charAt & 10239) << 10) | (9215 & charAt3)) + 65536;
                        mo2807C((i18 >> 18) | 240);
                        mo2807C(((i18 >> 12) & 63) | 128);
                        mo2807C(((i18 >> 6) & 63) | 128);
                        mo2807C((i18 & 63) | 128);
                        i10 += 2;
                    }
                }
                mo2807C(i12);
                mo2807C((charAt & '?') | 128);
                i10++;
            }
        }
        return this;
    }

    /* renamed from: J0 */
    public C0557c m2816J0(int i10) {
        int i11;
        int i12;
        if (i10 >= 128) {
            if (i10 < 2048) {
                i12 = (i10 >> 6) | 192;
            } else {
                if (i10 < 65536) {
                    if (i10 >= 55296 && i10 <= 57343) {
                        mo2807C(63);
                        return this;
                    }
                    i11 = (i10 >> 12) | 224;
                } else {
                    if (i10 > 1114111) {
                        throw new IllegalArgumentException("Unexpected code point: " + Integer.toHexString(i10));
                    }
                    mo2807C((i10 >> 18) | 240);
                    i11 = ((i10 >> 12) & 63) | 128;
                }
                mo2807C(i11);
                i12 = ((i10 >> 6) & 63) | 128;
            }
            mo2807C(i12);
            i10 = (i10 & 63) | 128;
        }
        mo2807C(i10);
        return this;
    }

    /* renamed from: K */
    public long m2817K(byte b10, long j10, long j11) {
        C0570p c0570p;
        long j12 = 0;
        if (j10 < 0 || j11 < j10) {
            throw new IllegalArgumentException(String.format("size=%s fromIndex=%s toIndex=%s", Long.valueOf(this.f2508i), Long.valueOf(j10), Long.valueOf(j11)));
        }
        long j13 = this.f2508i;
        long j14 = j11 > j13 ? j13 : j11;
        if (j10 == j14 || (c0570p = this.f2507h) == null) {
            return -1L;
        }
        if (j13 - j10 < j10) {
            while (j13 > j10) {
                c0570p = c0570p.f2546g;
                j13 -= c0570p.f2542c - c0570p.f2541b;
            }
        } else {
            while (true) {
                long j15 = (c0570p.f2542c - c0570p.f2541b) + j12;
                if (j15 >= j10) {
                    break;
                }
                c0570p = c0570p.f2545f;
                j12 = j15;
            }
            j13 = j12;
        }
        long j16 = j10;
        while (j13 < j14) {
            byte[] bArr = c0570p.f2540a;
            int min = (int) Math.min(c0570p.f2542c, (c0570p.f2541b + j14) - j13);
            for (int i10 = (int) ((c0570p.f2541b + j16) - j13); i10 < min; i10++) {
                if (bArr[i10] == b10) {
                    return (i10 - c0570p.f2541b) + j13;
                }
            }
            j13 += c0570p.f2542c - c0570p.f2541b;
            c0570p = c0570p.f2545f;
            j16 = j13;
        }
        return -1L;
    }

    @Override // bf.InterfaceC0559e
    /* renamed from: L */
    public String mo2818L(long j10) {
        if (j10 < 0) {
            throw new IllegalArgumentException("limit < 0: " + j10);
        }
        long j11 = j10 != Long.MAX_VALUE ? j10 + 1 : Long.MAX_VALUE;
        long m2817K = m2817K((byte) 10, 0L, j11);
        if (m2817K != -1) {
            return m2830f0(m2817K);
        }
        if (j11 < m2831g0() && m2813I(j11 - 1) == 13 && m2813I(j11) == 10) {
            return m2830f0(j11);
        }
        C0557c c0557c = new C0557c();
        m2849w(c0557c, 0L, Math.min(32L, m2831g0()));
        throw new EOFException("\\n not found: limit=" + Math.min(m2831g0(), j10) + " content=" + c0557c.m2821W().mo2866o() + (char) 8230);
    }

    /* renamed from: P */
    public int m2819P(byte[] bArr, int i10, int i11) {
        C0576v.m2921b(bArr.length, i10, i11);
        C0570p c0570p = this.f2507h;
        if (c0570p == null) {
            return -1;
        }
        int min = Math.min(i11, c0570p.f2542c - c0570p.f2541b);
        System.arraycopy(c0570p.f2540a, c0570p.f2541b, bArr, i10, min);
        int i12 = c0570p.f2541b + min;
        c0570p.f2541b = i12;
        this.f2508i -= min;
        if (i12 == c0570p.f2542c) {
            this.f2507h = c0570p.m2910b();
            C0571q.m2915a(c0570p);
        }
        return min;
    }

    @Override // bf.InterfaceC0574t
    /* renamed from: T */
    public long mo2800T(C0557c c0557c, long j10) {
        if (c0557c == null) {
            throw new IllegalArgumentException("sink == null");
        }
        if (j10 < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j10);
        }
        long j11 = this.f2508i;
        if (j11 == 0) {
            return -1L;
        }
        if (j10 > j11) {
            j10 = j11;
        }
        c0557c.mo2798C0(this, j10);
        return j10;
    }

    /* renamed from: W */
    public C0560f m2821W() {
        return new C0560f(mo2854z());
    }

    @Override // bf.InterfaceC0559e, bf.InterfaceC0558d
    /* renamed from: b */
    public C0557c mo2823b() {
        return this;
    }

    /* renamed from: b0 */
    public String m2824b0(long j10, Charset charset) {
        C0576v.m2921b(this.f2508i, 0L, j10);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        }
        if (j10 > 2147483647L) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j10);
        }
        if (j10 == 0) {
            return "";
        }
        C0570p c0570p = this.f2507h;
        int i10 = c0570p.f2541b;
        if (i10 + j10 > c0570p.f2542c) {
            return new String(mo2841p0(j10), charset);
        }
        String str = new String(c0570p.f2540a, i10, (int) j10, charset);
        int i11 = (int) (c0570p.f2541b + j10);
        c0570p.f2541b = i11;
        this.f2508i -= j10;
        if (i11 == c0570p.f2542c) {
            this.f2507h = c0570p.m2910b();
            C0571q.m2915a(c0570p);
        }
        return str;
    }

    @Override // bf.InterfaceC0574t
    /* renamed from: c */
    public C0575u mo2801c() {
        return C0575u.f2551d;
    }

    /* renamed from: c0 */
    public String m2825c0() {
        try {
            return m2824b0(this.f2508i, C0576v.f2555a);
        } catch (EOFException e10) {
            throw new AssertionError(e10);
        }
    }

    @Override // bf.InterfaceC0574t, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // bf.InterfaceC0559e
    /* renamed from: e */
    public void mo2827e(long j10) {
        while (j10 > 0) {
            if (this.f2507h == null) {
                throw new EOFException();
            }
            int min = (int) Math.min(j10, r0.f2542c - r0.f2541b);
            long j11 = min;
            this.f2508i -= j11;
            j10 -= j11;
            C0570p c0570p = this.f2507h;
            int i10 = c0570p.f2541b + min;
            c0570p.f2541b = i10;
            if (i10 == c0570p.f2542c) {
                this.f2507h = c0570p.m2910b();
                C0571q.m2915a(c0570p);
            }
        }
    }

    /* renamed from: e0 */
    public String m2828e0(long j10) {
        return m2824b0(j10, C0576v.f2555a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0557c)) {
            return false;
        }
        C0557c c0557c = (C0557c) obj;
        long j10 = this.f2508i;
        if (j10 != c0557c.f2508i) {
            return false;
        }
        long j11 = 0;
        if (j10 == 0) {
            return true;
        }
        C0570p c0570p = this.f2507h;
        C0570p c0570p2 = c0557c.f2507h;
        int i10 = c0570p.f2541b;
        int i11 = c0570p2.f2541b;
        while (j11 < this.f2508i) {
            long min = Math.min(c0570p.f2542c - i10, c0570p2.f2542c - i11);
            int i12 = 0;
            while (i12 < min) {
                int i13 = i10 + 1;
                int i14 = i11 + 1;
                if (c0570p.f2540a[i10] != c0570p2.f2540a[i11]) {
                    return false;
                }
                i12++;
                i10 = i13;
                i11 = i14;
            }
            if (i10 == c0570p.f2542c) {
                c0570p = c0570p.f2545f;
                i10 = c0570p.f2541b;
            }
            if (i11 == c0570p2.f2542c) {
                c0570p2 = c0570p2.f2545f;
                i11 = c0570p2.f2541b;
            }
            j11 += min;
        }
        return true;
    }

    /* renamed from: f */
    public final void m2829f() {
        try {
            mo2827e(this.f2508i);
        } catch (EOFException e10) {
            throw new AssertionError(e10);
        }
    }

    /* renamed from: f0 */
    public String m2830f0(long j10) {
        if (j10 > 0) {
            long j11 = j10 - 1;
            if (m2813I(j11) == 13) {
                String m2828e0 = m2828e0(j11);
                mo2827e(2L);
                return m2828e0;
            }
        }
        String m2828e02 = m2828e0(j10);
        mo2827e(1L);
        return m2828e02;
    }

    @Override // bf.InterfaceC0558d, bf.InterfaceC0573s, java.io.Flushable
    public void flush() {
    }

    /* renamed from: g0 */
    public final long m2831g0() {
        return this.f2508i;
    }

    /* renamed from: h0 */
    public final C0560f m2832h0() {
        long j10 = this.f2508i;
        if (j10 <= 2147483647L) {
            return m2833i0((int) j10);
        }
        throw new IllegalArgumentException("size > Integer.MAX_VALUE: " + this.f2508i);
    }

    public int hashCode() {
        C0570p c0570p = this.f2507h;
        if (c0570p == null) {
            return 0;
        }
        int i10 = 1;
        do {
            int i11 = c0570p.f2542c;
            for (int i12 = c0570p.f2541b; i12 < i11; i12++) {
                i10 = (i10 * 31) + c0570p.f2540a[i12];
            }
            c0570p = c0570p.f2545f;
        } while (c0570p != this.f2507h);
        return i10;
    }

    /* renamed from: i0 */
    public final C0560f m2833i0(int i10) {
        return i10 == 0 ? C0560f.f2510l : new C0572r(this, i10);
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    @Override // bf.InterfaceC0559e
    /* renamed from: k0 */
    public String mo2834k0() {
        return mo2818L(Long.MAX_VALUE);
    }

    /* renamed from: l */
    public C0557c clone() {
        C0557c c0557c = new C0557c();
        if (this.f2508i == 0) {
            return c0557c;
        }
        C0570p m2912d = this.f2507h.m2912d();
        c0557c.f2507h = m2912d;
        m2912d.f2546g = m2912d;
        m2912d.f2545f = m2912d;
        C0570p c0570p = this.f2507h;
        while (true) {
            c0570p = c0570p.f2545f;
            if (c0570p == this.f2507h) {
                c0557c.f2508i = this.f2508i;
                return c0557c;
            }
            c0557c.f2507h.f2546g.m2911c(c0570p.m2912d());
        }
    }

    /* renamed from: l0 */
    public C0570p m2836l0(int i10) {
        if (i10 < 1 || i10 > 8192) {
            throw new IllegalArgumentException();
        }
        C0570p c0570p = this.f2507h;
        if (c0570p != null) {
            C0570p c0570p2 = c0570p.f2546g;
            return (c0570p2.f2542c + i10 > 8192 || !c0570p2.f2544e) ? c0570p2.m2911c(C0571q.m2916b()) : c0570p2;
        }
        C0570p m2916b = C0571q.m2916b();
        this.f2507h = m2916b;
        m2916b.f2546g = m2916b;
        m2916b.f2545f = m2916b;
        return m2916b;
    }

    @Override // bf.InterfaceC0559e
    /* renamed from: m */
    public C0560f mo2837m(long j10) {
        return new C0560f(mo2841p0(j10));
    }

    @Override // bf.InterfaceC0559e
    /* renamed from: m0 */
    public int mo2838m0() {
        return C0576v.m2922c(readInt());
    }

    /* renamed from: n */
    public final long m2839n() {
        long j10 = this.f2508i;
        if (j10 == 0) {
            return 0L;
        }
        C0570p c0570p = this.f2507h.f2546g;
        return (c0570p.f2542c >= 8192 || !c0570p.f2544e) ? j10 : j10 - (r3 - c0570p.f2541b);
    }

    /* renamed from: n0 */
    public C0557c m2840n0(C0560f c0560f) {
        if (c0560f == null) {
            throw new IllegalArgumentException("byteString == null");
        }
        c0560f.mo2861A(this);
        return this;
    }

    @Override // bf.InterfaceC0559e
    /* renamed from: p0 */
    public byte[] mo2841p0(long j10) {
        C0576v.m2921b(this.f2508i, 0L, j10);
        if (j10 <= 2147483647L) {
            byte[] bArr = new byte[(int) j10];
            readFully(bArr);
            return bArr;
        }
        throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j10);
    }

    @Override // bf.InterfaceC0558d
    /* renamed from: r0 */
    public C0557c mo2845t0(byte[] bArr) {
        if (bArr != null) {
            return mo2822Y(bArr, 0, bArr.length);
        }
        throw new IllegalArgumentException("source == null");
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) {
        C0570p c0570p = this.f2507h;
        if (c0570p == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), c0570p.f2542c - c0570p.f2541b);
        byteBuffer.put(c0570p.f2540a, c0570p.f2541b, min);
        int i10 = c0570p.f2541b + min;
        c0570p.f2541b = i10;
        this.f2508i -= min;
        if (i10 == c0570p.f2542c) {
            this.f2507h = c0570p.m2910b();
            C0571q.m2915a(c0570p);
        }
        return min;
    }

    @Override // bf.InterfaceC0559e
    public byte readByte() {
        long j10 = this.f2508i;
        if (j10 == 0) {
            throw new IllegalStateException("size == 0");
        }
        C0570p c0570p = this.f2507h;
        int i10 = c0570p.f2541b;
        int i11 = c0570p.f2542c;
        int i12 = i10 + 1;
        byte b10 = c0570p.f2540a[i10];
        this.f2508i = j10 - 1;
        if (i12 == i11) {
            this.f2507h = c0570p.m2910b();
            C0571q.m2915a(c0570p);
        } else {
            c0570p.f2541b = i12;
        }
        return b10;
    }

    @Override // bf.InterfaceC0559e
    public void readFully(byte[] bArr) {
        int i10 = 0;
        while (i10 < bArr.length) {
            int m2819P = m2819P(bArr, i10, bArr.length - i10);
            if (m2819P == -1) {
                throw new EOFException();
            }
            i10 += m2819P;
        }
    }

    @Override // bf.InterfaceC0559e
    public int readInt() {
        long j10 = this.f2508i;
        if (j10 < 4) {
            throw new IllegalStateException("size < 4: " + this.f2508i);
        }
        C0570p c0570p = this.f2507h;
        int i10 = c0570p.f2541b;
        int i11 = c0570p.f2542c;
        if (i11 - i10 < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        byte[] bArr = c0570p.f2540a;
        int i12 = i10 + 1;
        int i13 = i12 + 1;
        int i14 = ((bArr[i10] & 255) << 24) | ((bArr[i12] & 255) << 16);
        int i15 = i13 + 1;
        int i16 = i14 | ((bArr[i13] & 255) << 8);
        int i17 = i15 + 1;
        int i18 = i16 | (bArr[i15] & 255);
        this.f2508i = j10 - 4;
        if (i17 == i11) {
            this.f2507h = c0570p.m2910b();
            C0571q.m2915a(c0570p);
        } else {
            c0570p.f2541b = i17;
        }
        return i18;
    }

    @Override // bf.InterfaceC0559e
    public short readShort() {
        long j10 = this.f2508i;
        if (j10 < 2) {
            throw new IllegalStateException("size < 2: " + this.f2508i);
        }
        C0570p c0570p = this.f2507h;
        int i10 = c0570p.f2541b;
        int i11 = c0570p.f2542c;
        if (i11 - i10 < 2) {
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        byte[] bArr = c0570p.f2540a;
        int i12 = i10 + 1;
        int i13 = i12 + 1;
        int i14 = ((bArr[i10] & 255) << 8) | (bArr[i12] & 255);
        this.f2508i = j10 - 2;
        if (i13 == i11) {
            this.f2507h = c0570p.m2910b();
            C0571q.m2915a(c0570p);
        } else {
            c0570p.f2541b = i13;
        }
        return (short) i14;
    }

    @Override // bf.InterfaceC0558d
    /* renamed from: s0 */
    public C0557c mo2822Y(byte[] bArr, int i10, int i11) {
        if (bArr == null) {
            throw new IllegalArgumentException("source == null");
        }
        long j10 = i11;
        C0576v.m2921b(bArr.length, i10, j10);
        int i12 = i11 + i10;
        while (i10 < i12) {
            C0570p m2836l0 = m2836l0(1);
            int min = Math.min(i12 - i10, 8192 - m2836l0.f2542c);
            System.arraycopy(bArr, i10, m2836l0.f2540a, m2836l0.f2542c, min);
            i10 += min;
            m2836l0.f2542c += min;
        }
        this.f2508i += j10;
        return this;
    }

    public String toString() {
        return m2832h0().toString();
    }

    /* renamed from: u0 */
    public long m2847u0(InterfaceC0574t interfaceC0574t) {
        if (interfaceC0574t == null) {
            throw new IllegalArgumentException("source == null");
        }
        long j10 = 0;
        while (true) {
            long mo2800T = interfaceC0574t.mo2800T(this, 8192L);
            if (mo2800T == -1) {
                return j10;
            }
            j10 += mo2800T;
        }
    }

    @Override // bf.InterfaceC0558d
    /* renamed from: v0 */
    public C0557c mo2807C(int i10) {
        C0570p m2836l0 = m2836l0(1);
        byte[] bArr = m2836l0.f2540a;
        int i11 = m2836l0.f2542c;
        m2836l0.f2542c = i11 + 1;
        bArr[i11] = (byte) i10;
        this.f2508i++;
        return this;
    }

    /* renamed from: w */
    public final C0557c m2849w(C0557c c0557c, long j10, long j11) {
        if (c0557c == null) {
            throw new IllegalArgumentException("out == null");
        }
        C0576v.m2921b(this.f2508i, j10, j11);
        if (j11 == 0) {
            return this;
        }
        c0557c.f2508i += j11;
        C0570p c0570p = this.f2507h;
        while (true) {
            int i10 = c0570p.f2542c;
            int i11 = c0570p.f2541b;
            if (j10 < i10 - i11) {
                break;
            }
            j10 -= i10 - i11;
            c0570p = c0570p.f2545f;
        }
        while (j11 > 0) {
            C0570p m2912d = c0570p.m2912d();
            int i12 = (int) (m2912d.f2541b + j10);
            m2912d.f2541b = i12;
            m2912d.f2542c = Math.min(i12 + ((int) j11), m2912d.f2542c);
            C0570p c0570p2 = c0557c.f2507h;
            if (c0570p2 == null) {
                m2912d.f2546g = m2912d;
                m2912d.f2545f = m2912d;
                c0557c.f2507h = m2912d;
            } else {
                c0570p2.f2546g.m2911c(m2912d);
            }
            j11 -= m2912d.f2542c - m2912d.f2541b;
            c0570p = c0570p.f2545f;
            j10 = 0;
        }
        return this;
    }

    @Override // bf.InterfaceC0559e
    /* renamed from: w0 */
    public short mo2850w0() {
        return C0576v.m2923d(readShort());
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            throw new IllegalArgumentException("source == null");
        }
        int remaining = byteBuffer.remaining();
        int i10 = remaining;
        while (i10 > 0) {
            C0570p m2836l0 = m2836l0(1);
            int min = Math.min(i10, 8192 - m2836l0.f2542c);
            byteBuffer.get(m2836l0.f2540a, m2836l0.f2542c, min);
            i10 -= min;
            m2836l0.f2542c += min;
        }
        this.f2508i += remaining;
        return remaining;
    }

    @Override // bf.InterfaceC0558d
    /* renamed from: x */
    public C0557c mo2815J() {
        return this;
    }

    @Override // bf.InterfaceC0558d
    /* renamed from: x0 */
    public C0557c mo2826d0(long j10) {
        if (j10 == 0) {
            return mo2807C(48);
        }
        int numberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j10)) / 4) + 1;
        C0570p m2836l0 = m2836l0(numberOfTrailingZeros);
        byte[] bArr = m2836l0.f2540a;
        int i10 = m2836l0.f2542c;
        for (int i11 = (i10 + numberOfTrailingZeros) - 1; i11 >= i10; i11--) {
            bArr[i11] = f2506j[(int) (15 & j10)];
            j10 >>>= 4;
        }
        m2836l0.f2542c += numberOfTrailingZeros;
        this.f2508i += numberOfTrailingZeros;
        return this;
    }

    @Override // bf.InterfaceC0558d
    /* renamed from: y0 */
    public C0557c mo2846u(int i10) {
        C0570p m2836l0 = m2836l0(4);
        byte[] bArr = m2836l0.f2540a;
        int i11 = m2836l0.f2542c;
        int i12 = i11 + 1;
        bArr[i11] = (byte) ((i10 >>> 24) & 255);
        int i13 = i12 + 1;
        bArr[i12] = (byte) ((i10 >>> 16) & 255);
        int i14 = i13 + 1;
        bArr[i13] = (byte) ((i10 >>> 8) & 255);
        bArr[i14] = (byte) (i10 & 255);
        m2836l0.f2542c = i14 + 1;
        this.f2508i += 4;
        return this;
    }

    @Override // bf.InterfaceC0559e
    /* renamed from: z */
    public byte[] mo2854z() {
        try {
            return mo2841p0(this.f2508i);
        } catch (EOFException e10) {
            throw new AssertionError(e10);
        }
    }

    @Override // bf.InterfaceC0558d
    /* renamed from: z0 */
    public C0557c mo2842r(int i10) {
        C0570p m2836l0 = m2836l0(2);
        byte[] bArr = m2836l0.f2540a;
        int i11 = m2836l0.f2542c;
        int i12 = i11 + 1;
        bArr[i11] = (byte) ((i10 >>> 8) & 255);
        bArr[i12] = (byte) (i10 & 255);
        m2836l0.f2542c = i12 + 1;
        this.f2508i += 2;
        return this;
    }
}
