package p301v0;

/* renamed from: v0.s1 */
/* loaded from: classes.dex */
public final class C5083s1 {

    /* renamed from: a */
    public static final b f19079a;

    /* renamed from: v0.s1$a */
    /* loaded from: classes.dex */
    public static class a {
        /* renamed from: h */
        public static void m20549h(byte b10, byte b11, byte b12, byte b13, char[] cArr, int i10) {
            if (m20554m(b11) || (((b10 << 28) + (b11 + 112)) >> 30) != 0 || m20554m(b12) || m20554m(b13)) {
                throw C5031b0.m19812c();
            }
            int m20559r = ((b10 & 7) << 18) | (m20559r(b11) << 12) | (m20559r(b12) << 6) | m20559r(b13);
            cArr[i10] = m20553l(m20559r);
            cArr[i10 + 1] = m20558q(m20559r);
        }

        /* renamed from: i */
        public static void m20550i(byte b10, char[] cArr, int i10) {
            cArr[i10] = (char) b10;
        }

        /* renamed from: j */
        public static void m20551j(byte b10, byte b11, byte b12, char[] cArr, int i10) {
            if (m20554m(b11) || ((b10 == -32 && b11 < -96) || ((b10 == -19 && b11 >= -96) || m20554m(b12)))) {
                throw C5031b0.m19812c();
            }
            cArr[i10] = (char) (((b10 & 15) << 12) | (m20559r(b11) << 6) | m20559r(b12));
        }

        /* renamed from: k */
        public static void m20552k(byte b10, byte b11, char[] cArr, int i10) {
            if (b10 < -62 || m20554m(b11)) {
                throw C5031b0.m19812c();
            }
            cArr[i10] = (char) (((b10 & 31) << 6) | m20559r(b11));
        }

        /* renamed from: l */
        public static char m20553l(int i10) {
            return (char) ((i10 >>> 10) + 55232);
        }

        /* renamed from: m */
        public static boolean m20554m(byte b10) {
            return b10 > -65;
        }

        /* renamed from: n */
        public static boolean m20555n(byte b10) {
            return b10 >= 0;
        }

        /* renamed from: o */
        public static boolean m20556o(byte b10) {
            return b10 < -16;
        }

        /* renamed from: p */
        public static boolean m20557p(byte b10) {
            return b10 < -32;
        }

        /* renamed from: q */
        public static char m20558q(int i10) {
            return (char) ((i10 & 1023) + 56320);
        }

        /* renamed from: r */
        public static int m20559r(byte b10) {
            return b10 & 63;
        }
    }

    /* renamed from: v0.s1$b */
    /* loaded from: classes.dex */
    public static abstract class b {
        /* renamed from: a */
        public abstract String mo20560a(byte[] bArr, int i10, int i11);

        /* renamed from: b */
        public abstract int mo20561b(CharSequence charSequence, byte[] bArr, int i10, int i11);

        /* renamed from: c */
        public final boolean m20562c(byte[] bArr, int i10, int i11) {
            return mo20563d(0, bArr, i10, i11) == 0;
        }

        /* renamed from: d */
        public abstract int mo20563d(int i10, byte[] bArr, int i11, int i12);
    }

    /* renamed from: v0.s1$c */
    /* loaded from: classes.dex */
    public static final class c extends b {
        /* renamed from: e */
        public static int m20564e(byte[] bArr, int i10, int i11) {
            while (i10 < i11 && bArr[i10] >= 0) {
                i10++;
            }
            if (i10 >= i11) {
                return 0;
            }
            return m20565f(bArr, i10, i11);
        }

        /* renamed from: f */
        public static int m20565f(byte[] bArr, int i10, int i11) {
            while (i10 < i11) {
                int i12 = i10 + 1;
                byte b10 = bArr[i10];
                if (b10 < 0) {
                    if (b10 < -32) {
                        if (i12 >= i11) {
                            return b10;
                        }
                        if (b10 >= -62) {
                            i10 = i12 + 1;
                            if (bArr[i12] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (b10 >= -16) {
                        if (i12 >= i11 - 2) {
                            return C5083s1.m20539l(bArr, i12, i11);
                        }
                        int i13 = i12 + 1;
                        byte b11 = bArr[i12];
                        if (b11 <= -65 && (((b10 << 28) + (b11 + 112)) >> 30) == 0) {
                            int i14 = i13 + 1;
                            if (bArr[i13] <= -65) {
                                i12 = i14 + 1;
                                if (bArr[i14] > -65) {
                                }
                            }
                        }
                        return -1;
                    }
                    if (i12 >= i11 - 1) {
                        return C5083s1.m20539l(bArr, i12, i11);
                    }
                    int i15 = i12 + 1;
                    byte b12 = bArr[i12];
                    if (b12 <= -65 && ((b10 != -32 || b12 >= -96) && (b10 != -19 || b12 < -96))) {
                        i10 = i15 + 1;
                        if (bArr[i15] > -65) {
                        }
                    }
                    return -1;
                }
                i10 = i12;
            }
            return 0;
        }

        @Override // p301v0.C5083s1.b
        /* renamed from: a */
        public String mo20560a(byte[] bArr, int i10, int i11) {
            if ((i10 | i11 | ((bArr.length - i10) - i11)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
            }
            int i12 = i10 + i11;
            char[] cArr = new char[i11];
            int i13 = 0;
            while (i10 < i12) {
                byte b10 = bArr[i10];
                if (!a.m20555n(b10)) {
                    break;
                }
                i10++;
                a.m20550i(b10, cArr, i13);
                i13++;
            }
            int i14 = i13;
            while (i10 < i12) {
                int i15 = i10 + 1;
                byte b11 = bArr[i10];
                if (a.m20555n(b11)) {
                    int i16 = i14 + 1;
                    a.m20550i(b11, cArr, i14);
                    while (i15 < i12) {
                        byte b12 = bArr[i15];
                        if (!a.m20555n(b12)) {
                            break;
                        }
                        i15++;
                        a.m20550i(b12, cArr, i16);
                        i16++;
                    }
                    i10 = i15;
                    i14 = i16;
                } else if (a.m20557p(b11)) {
                    if (i15 >= i12) {
                        throw C5031b0.m19812c();
                    }
                    a.m20552k(b11, bArr[i15], cArr, i14);
                    i10 = i15 + 1;
                    i14++;
                } else if (a.m20556o(b11)) {
                    if (i15 >= i12 - 1) {
                        throw C5031b0.m19812c();
                    }
                    int i17 = i15 + 1;
                    a.m20551j(b11, bArr[i15], bArr[i17], cArr, i14);
                    i10 = i17 + 1;
                    i14++;
                } else {
                    if (i15 >= i12 - 2) {
                        throw C5031b0.m19812c();
                    }
                    int i18 = i15 + 1;
                    byte b13 = bArr[i15];
                    int i19 = i18 + 1;
                    a.m20549h(b11, b13, bArr[i18], bArr[i19], cArr, i14);
                    i10 = i19 + 1;
                    i14 = i14 + 1 + 1;
                }
            }
            return new String(cArr, 0, i14);
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
        
            return r10 + r0;
         */
        @Override // p301v0.C5083s1.b
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int mo20561b(java.lang.CharSequence r8, byte[] r9, int r10, int r11) {
            /*
                Method dump skipped, instructions count: 254
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p301v0.C5083s1.c.mo20561b(java.lang.CharSequence, byte[], int, int):int");
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
        
            if (r8[r9] > (-65)) goto L69;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0046, code lost:
        
            if (r8[r9] > (-65)) goto L88;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x007f, code lost:
        
            if (r8[r9] > (-65)) goto L109;
         */
        @Override // p301v0.C5083s1.b
        /* renamed from: d */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int mo20563d(int r7, byte[] r8, int r9, int r10) {
            /*
                r6 = this;
                if (r7 == 0) goto L82
                if (r9 < r10) goto L5
                return r7
            L5:
                byte r0 = (byte) r7
                r1 = -32
                r2 = -1
                r3 = -65
                if (r0 >= r1) goto L1c
                r7 = -62
                if (r0 < r7) goto L1b
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r9 <= r3) goto L18
                goto L1b
            L18:
                r9 = r7
                goto L82
            L1b:
                return r2
            L1c:
                r4 = -16
                if (r0 >= r4) goto L49
                int r7 = r7 >> 8
                int r7 = ~r7
                byte r7 = (byte) r7
                if (r7 != 0) goto L34
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r7 < r10) goto L31
                int r7 = p301v0.C5083s1.m20528a(r0, r9)
                return r7
            L31:
                r5 = r9
                r9 = r7
                r7 = r5
            L34:
                if (r7 > r3) goto L48
                r4 = -96
                if (r0 != r1) goto L3c
                if (r7 < r4) goto L48
            L3c:
                r1 = -19
                if (r0 != r1) goto L42
                if (r7 >= r4) goto L48
            L42:
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r9 <= r3) goto L18
            L48:
                return r2
            L49:
                int r1 = r7 >> 8
                int r1 = ~r1
                byte r1 = (byte) r1
                r4 = 0
                if (r1 != 0) goto L5d
                int r7 = r9 + 1
                r1 = r8[r9]
                if (r7 < r10) goto L5b
                int r7 = p301v0.C5083s1.m20528a(r0, r1)
                return r7
            L5b:
                r9 = r7
                goto L60
            L5d:
                int r7 = r7 >> 16
                byte r4 = (byte) r7
            L60:
                if (r4 != 0) goto L6e
                int r7 = r9 + 1
                r4 = r8[r9]
                if (r7 < r10) goto L6d
                int r7 = p301v0.C5083s1.m20529b(r0, r1, r4)
                return r7
            L6d:
                r9 = r7
            L6e:
                if (r1 > r3) goto L81
                int r7 = r0 << 28
                int r1 = r1 + 112
                int r7 = r7 + r1
                int r7 = r7 >> 30
                if (r7 != 0) goto L81
                if (r4 > r3) goto L81
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r9 <= r3) goto L18
            L81:
                return r2
            L82:
                int r7 = m20564e(r8, r9, r10)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: p301v0.C5083s1.c.mo20563d(int, byte[], int, int):int");
        }
    }

    /* renamed from: v0.s1$d */
    /* loaded from: classes.dex */
    public static class d extends IllegalArgumentException {
        public d(int i10, int i11) {
            super("Unpaired surrogate at index " + i10 + " of " + i11);
        }
    }

    /* renamed from: v0.s1$e */
    /* loaded from: classes.dex */
    public static final class e extends b {
        /* renamed from: e */
        public static boolean m20566e() {
            return C5080r1.m20464C() && C5080r1.m20465D();
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0039, code lost:
        
            return -1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x008e, code lost:
        
            return -1;
         */
        /* renamed from: f */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static int m20567f(byte[] r8, long r9, int r11) {
            /*
                int r0 = m20568g(r8, r9, r11)
                int r11 = r11 - r0
                long r0 = (long) r0
                long r9 = r9 + r0
            L7:
                r0 = 0
                r1 = r0
            L9:
                r2 = 1
                if (r11 <= 0) goto L1a
                long r4 = r9 + r2
                byte r1 = p301v0.C5080r1.m20497s(r8, r9)
                if (r1 < 0) goto L19
                int r11 = r11 + (-1)
                r9 = r4
                goto L9
            L19:
                r9 = r4
            L1a:
                if (r11 != 0) goto L1d
                return r0
            L1d:
                int r11 = r11 + (-1)
                r0 = -32
                r4 = -65
                r5 = -1
                if (r1 >= r0) goto L3a
                if (r11 != 0) goto L29
                return r1
            L29:
                int r11 = r11 + (-1)
                r0 = -62
                if (r1 < r0) goto L39
                long r2 = r2 + r9
                byte r9 = p301v0.C5080r1.m20497s(r8, r9)
                if (r9 <= r4) goto L37
                goto L39
            L37:
                r9 = r2
                goto L7
            L39:
                return r5
            L3a:
                r6 = -16
                if (r1 >= r6) goto L64
                r6 = 2
                if (r11 >= r6) goto L46
                int r8 = m20569h(r8, r1, r9, r11)
                return r8
            L46:
                int r11 = r11 + (-2)
                long r6 = r9 + r2
                byte r9 = p301v0.C5080r1.m20497s(r8, r9)
                if (r9 > r4) goto L63
                r10 = -96
                if (r1 != r0) goto L56
                if (r9 < r10) goto L63
            L56:
                r0 = -19
                if (r1 != r0) goto L5c
                if (r9 >= r10) goto L63
            L5c:
                long r2 = r2 + r6
                byte r9 = p301v0.C5080r1.m20497s(r8, r6)
                if (r9 <= r4) goto L37
            L63:
                return r5
            L64:
                r0 = 3
                if (r11 >= r0) goto L6c
                int r8 = m20569h(r8, r1, r9, r11)
                return r8
            L6c:
                int r11 = r11 + (-3)
                long r6 = r9 + r2
                byte r9 = p301v0.C5080r1.m20497s(r8, r9)
                if (r9 > r4) goto L8e
                int r10 = r1 << 28
                int r9 = r9 + 112
                int r10 = r10 + r9
                int r9 = r10 >> 30
                if (r9 != 0) goto L8e
                long r9 = r6 + r2
                byte r0 = p301v0.C5080r1.m20497s(r8, r6)
                if (r0 > r4) goto L8e
                long r2 = r2 + r9
                byte r9 = p301v0.C5080r1.m20497s(r8, r9)
                if (r9 <= r4) goto L37
            L8e:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: p301v0.C5083s1.e.m20567f(byte[], long, int):int");
        }

        /* renamed from: g */
        public static int m20568g(byte[] bArr, long j10, int i10) {
            int i11 = 0;
            if (i10 < 16) {
                return 0;
            }
            while (i11 < i10) {
                long j11 = 1 + j10;
                if (C5080r1.m20497s(bArr, j10) < 0) {
                    return i11;
                }
                i11++;
                j10 = j11;
            }
            return i10;
        }

        /* renamed from: h */
        public static int m20569h(byte[] bArr, int i10, long j10, int i11) {
            if (i11 == 0) {
                return C5083s1.m20536i(i10);
            }
            if (i11 == 1) {
                return C5083s1.m20537j(i10, C5080r1.m20497s(bArr, j10));
            }
            if (i11 == 2) {
                return C5083s1.m20538k(i10, C5080r1.m20497s(bArr, j10), C5080r1.m20497s(bArr, j10 + 1));
            }
            throw new AssertionError();
        }

        @Override // p301v0.C5083s1.b
        /* renamed from: a */
        public String mo20560a(byte[] bArr, int i10, int i11) {
            if ((i10 | i11 | ((bArr.length - i10) - i11)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
            }
            int i12 = i10 + i11;
            char[] cArr = new char[i11];
            int i13 = 0;
            while (i10 < i12) {
                byte m20497s = C5080r1.m20497s(bArr, i10);
                if (!a.m20555n(m20497s)) {
                    break;
                }
                i10++;
                a.m20550i(m20497s, cArr, i13);
                i13++;
            }
            int i14 = i13;
            while (i10 < i12) {
                int i15 = i10 + 1;
                byte m20497s2 = C5080r1.m20497s(bArr, i10);
                if (a.m20555n(m20497s2)) {
                    int i16 = i14 + 1;
                    a.m20550i(m20497s2, cArr, i14);
                    while (i15 < i12) {
                        byte m20497s3 = C5080r1.m20497s(bArr, i15);
                        if (!a.m20555n(m20497s3)) {
                            break;
                        }
                        i15++;
                        a.m20550i(m20497s3, cArr, i16);
                        i16++;
                    }
                    i10 = i15;
                    i14 = i16;
                } else if (a.m20557p(m20497s2)) {
                    if (i15 >= i12) {
                        throw C5031b0.m19812c();
                    }
                    a.m20552k(m20497s2, C5080r1.m20497s(bArr, i15), cArr, i14);
                    i10 = i15 + 1;
                    i14++;
                } else if (a.m20556o(m20497s2)) {
                    if (i15 >= i12 - 1) {
                        throw C5031b0.m19812c();
                    }
                    int i17 = i15 + 1;
                    a.m20551j(m20497s2, C5080r1.m20497s(bArr, i15), C5080r1.m20497s(bArr, i17), cArr, i14);
                    i10 = i17 + 1;
                    i14++;
                } else {
                    if (i15 >= i12 - 2) {
                        throw C5031b0.m19812c();
                    }
                    int i18 = i15 + 1;
                    byte m20497s4 = C5080r1.m20497s(bArr, i15);
                    int i19 = i18 + 1;
                    a.m20549h(m20497s2, m20497s4, C5080r1.m20497s(bArr, i18), C5080r1.m20497s(bArr, i19), cArr, i14);
                    i10 = i19 + 1;
                    i14 = i14 + 1 + 1;
                }
            }
            return new String(cArr, 0, i14);
        }

        @Override // p301v0.C5083s1.b
        /* renamed from: b */
        public int mo20561b(CharSequence charSequence, byte[] bArr, int i10, int i11) {
            char c10;
            long j10;
            long j11;
            long j12;
            char c11;
            int i12;
            char charAt;
            long j13 = i10;
            long j14 = i11 + j13;
            int length = charSequence.length();
            if (length > i11 || bArr.length - i11 < i10) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(length - 1) + " at index " + (i10 + i11));
            }
            int i13 = 0;
            while (true) {
                c10 = 128;
                j10 = 1;
                if (i13 >= length || (charAt = charSequence.charAt(i13)) >= 128) {
                    break;
                }
                C5080r1.m20469H(bArr, j13, (byte) charAt);
                i13++;
                j13 = 1 + j13;
            }
            if (i13 == length) {
                return (int) j13;
            }
            while (i13 < length) {
                char charAt2 = charSequence.charAt(i13);
                if (charAt2 < c10 && j13 < j14) {
                    long j15 = j13 + j10;
                    C5080r1.m20469H(bArr, j13, (byte) charAt2);
                    j12 = j10;
                    j11 = j15;
                    c11 = c10;
                } else if (charAt2 < 2048 && j13 <= j14 - 2) {
                    long j16 = j13 + j10;
                    C5080r1.m20469H(bArr, j13, (byte) ((charAt2 >>> 6) | 960));
                    long j17 = j16 + j10;
                    C5080r1.m20469H(bArr, j16, (byte) ((charAt2 & '?') | 128));
                    long j18 = j10;
                    c11 = 128;
                    j11 = j17;
                    j12 = j18;
                } else {
                    if ((charAt2 >= 55296 && 57343 >= charAt2) || j13 > j14 - 3) {
                        if (j13 > j14 - 4) {
                            if (55296 <= charAt2 && charAt2 <= 57343 && ((i12 = i13 + 1) == length || !Character.isSurrogatePair(charAt2, charSequence.charAt(i12)))) {
                                throw new d(i13, length);
                            }
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + j13);
                        }
                        int i14 = i13 + 1;
                        if (i14 != length) {
                            char charAt3 = charSequence.charAt(i14);
                            if (Character.isSurrogatePair(charAt2, charAt3)) {
                                int codePoint = Character.toCodePoint(charAt2, charAt3);
                                long j19 = j13 + 1;
                                C5080r1.m20469H(bArr, j13, (byte) ((codePoint >>> 18) | 240));
                                long j20 = j19 + 1;
                                c11 = 128;
                                C5080r1.m20469H(bArr, j19, (byte) (((codePoint >>> 12) & 63) | 128));
                                long j21 = j20 + 1;
                                C5080r1.m20469H(bArr, j20, (byte) (((codePoint >>> 6) & 63) | 128));
                                j12 = 1;
                                j11 = j21 + 1;
                                C5080r1.m20469H(bArr, j21, (byte) ((codePoint & 63) | 128));
                                i13 = i14;
                            } else {
                                i13 = i14;
                            }
                        }
                        throw new d(i13 - 1, length);
                    }
                    long j22 = j13 + j10;
                    C5080r1.m20469H(bArr, j13, (byte) ((charAt2 >>> '\f') | 480));
                    long j23 = j22 + j10;
                    C5080r1.m20469H(bArr, j22, (byte) (((charAt2 >>> 6) & 63) | 128));
                    C5080r1.m20469H(bArr, j23, (byte) ((charAt2 & '?') | 128));
                    j11 = j23 + 1;
                    j12 = 1;
                    c11 = 128;
                }
                i13++;
                c10 = c11;
                long j24 = j12;
                j13 = j11;
                j10 = j24;
            }
            return (int) j13;
        }

        /* JADX WARN: Code restructure failed: missing block: B:34:0x0059, code lost:
        
            if (p301v0.C5080r1.m20497s(r13, r2) > (-65)) goto L102;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x009e, code lost:
        
            if (p301v0.C5080r1.m20497s(r13, r2) > (-65)) goto L123;
         */
        @Override // p301v0.C5083s1.b
        /* renamed from: d */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int mo20563d(int r12, byte[] r13, int r14, int r15) {
            /*
                Method dump skipped, instructions count: 204
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p301v0.C5083s1.e.mo20563d(int, byte[], int, int):int");
        }
    }

    static {
        f19079a = (!e.m20566e() || C5036d.m19830c()) ? new c() : new e();
    }

    /* renamed from: e */
    public static String m20532e(byte[] bArr, int i10, int i11) {
        return f19079a.mo20560a(bArr, i10, i11);
    }

    /* renamed from: f */
    public static int m20533f(CharSequence charSequence, byte[] bArr, int i10, int i11) {
        return f19079a.mo20561b(charSequence, bArr, i10, i11);
    }

    /* renamed from: g */
    public static int m20534g(CharSequence charSequence) {
        int length = charSequence.length();
        int i10 = 0;
        while (i10 < length && charSequence.charAt(i10) < 128) {
            i10++;
        }
        int i11 = length;
        while (true) {
            if (i10 < length) {
                char charAt = charSequence.charAt(i10);
                if (charAt >= 2048) {
                    i11 += m20535h(charSequence, i10);
                    break;
                }
                i11 += (127 - charAt) >>> 31;
                i10++;
            } else {
                break;
            }
        }
        if (i11 >= length) {
            return i11;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i11 + 4294967296L));
    }

    /* renamed from: h */
    public static int m20535h(CharSequence charSequence, int i10) {
        int length = charSequence.length();
        int i11 = 0;
        while (i10 < length) {
            char charAt = charSequence.charAt(i10);
            if (charAt < 2048) {
                i11 += (127 - charAt) >>> 31;
            } else {
                i11 += 2;
                if (55296 <= charAt && charAt <= 57343) {
                    if (Character.codePointAt(charSequence, i10) < 65536) {
                        throw new d(i10, length);
                    }
                    i10++;
                }
            }
            i10++;
        }
        return i11;
    }

    /* renamed from: i */
    public static int m20536i(int i10) {
        if (i10 > -12) {
            return -1;
        }
        return i10;
    }

    /* renamed from: j */
    public static int m20537j(int i10, int i11) {
        if (i10 > -12 || i11 > -65) {
            return -1;
        }
        return i10 ^ (i11 << 8);
    }

    /* renamed from: k */
    public static int m20538k(int i10, int i11, int i12) {
        if (i10 > -12 || i11 > -65 || i12 > -65) {
            return -1;
        }
        return (i10 ^ (i11 << 8)) ^ (i12 << 16);
    }

    /* renamed from: l */
    public static int m20539l(byte[] bArr, int i10, int i11) {
        byte b10 = bArr[i10 - 1];
        int i12 = i11 - i10;
        if (i12 == 0) {
            return m20536i(b10);
        }
        if (i12 == 1) {
            return m20537j(b10, bArr[i10]);
        }
        if (i12 == 2) {
            return m20538k(b10, bArr[i10], bArr[i10 + 1]);
        }
        throw new AssertionError();
    }

    /* renamed from: m */
    public static boolean m20540m(byte[] bArr) {
        return f19079a.m20562c(bArr, 0, bArr.length);
    }

    /* renamed from: n */
    public static boolean m20541n(byte[] bArr, int i10, int i11) {
        return f19079a.m20562c(bArr, i10, i11);
    }
}
