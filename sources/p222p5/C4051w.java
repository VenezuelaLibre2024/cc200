package p222p5;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: p5.w */
/* loaded from: classes.dex */
public final class C4051w {

    /* renamed from: a */
    public static final byte[] f14559a = {0, 0, 0, 1};

    /* renamed from: b */
    public static final float[] f14560b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* renamed from: c */
    public static final Object f14561c = new Object();

    /* renamed from: d */
    public static int[] f14562d = new int[10];

    /* renamed from: p5.w$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final int f14563a;

        /* renamed from: b */
        public final boolean f14564b;

        /* renamed from: c */
        public final int f14565c;

        /* renamed from: d */
        public final int f14566d;

        /* renamed from: e */
        public final int[] f14567e;

        /* renamed from: f */
        public final int f14568f;

        /* renamed from: g */
        public final int f14569g;

        /* renamed from: h */
        public final int f14570h;

        /* renamed from: i */
        public final int f14571i;

        /* renamed from: j */
        public final float f14572j;

        /* renamed from: k */
        public final int f14573k;

        /* renamed from: l */
        public final int f14574l;

        /* renamed from: m */
        public final int f14575m;

        public a(int i10, boolean z10, int i11, int i12, int[] iArr, int i13, int i14, int i15, int i16, float f10, int i17, int i18, int i19) {
            this.f14563a = i10;
            this.f14564b = z10;
            this.f14565c = i11;
            this.f14566d = i12;
            this.f14567e = iArr;
            this.f14568f = i13;
            this.f14569g = i14;
            this.f14570h = i15;
            this.f14571i = i16;
            this.f14572j = f10;
            this.f14573k = i17;
            this.f14574l = i18;
            this.f14575m = i19;
        }
    }

    /* renamed from: p5.w$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        public final int f14576a;

        /* renamed from: b */
        public final int f14577b;

        /* renamed from: c */
        public final boolean f14578c;

        public b(int i10, int i11, boolean z10) {
            this.f14576a = i10;
            this.f14577b = i11;
            this.f14578c = z10;
        }
    }

    /* renamed from: p5.w$c */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a */
        public final int f14579a;

        /* renamed from: b */
        public final int f14580b;

        /* renamed from: c */
        public final int f14581c;

        /* renamed from: d */
        public final int f14582d;

        /* renamed from: e */
        public final int f14583e;

        /* renamed from: f */
        public final int f14584f;

        /* renamed from: g */
        public final int f14585g;

        /* renamed from: h */
        public final float f14586h;

        /* renamed from: i */
        public final boolean f14587i;

        /* renamed from: j */
        public final boolean f14588j;

        /* renamed from: k */
        public final int f14589k;

        /* renamed from: l */
        public final int f14590l;

        /* renamed from: m */
        public final int f14591m;

        /* renamed from: n */
        public final boolean f14592n;

        public c(int i10, int i11, int i12, int i13, int i14, int i15, int i16, float f10, boolean z10, boolean z11, int i17, int i18, int i19, boolean z12) {
            this.f14579a = i10;
            this.f14580b = i11;
            this.f14581c = i12;
            this.f14582d = i13;
            this.f14583e = i14;
            this.f14584f = i15;
            this.f14585g = i16;
            this.f14586h = f10;
            this.f14587i = z10;
            this.f14588j = z11;
            this.f14589k = i17;
            this.f14590l = i18;
            this.f14591m = i19;
            this.f14592n = z12;
        }
    }

    /* renamed from: a */
    public static void m15565a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    /* renamed from: b */
    public static void m15566b(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int i12 = i10 + 1;
            if (i12 >= position) {
                byteBuffer.clear();
                return;
            }
            int i13 = byteBuffer.get(i10) & 255;
            if (i11 == 3) {
                if (i13 == 1 && (byteBuffer.get(i12) & 31) == 7) {
                    ByteBuffer duplicate = byteBuffer.duplicate();
                    duplicate.position(i10 - 3);
                    duplicate.limit(position);
                    byteBuffer.position(0);
                    byteBuffer.put(duplicate);
                    return;
                }
            } else if (i13 == 0) {
                i11++;
            }
            if (i13 != 0) {
                i11 = 0;
            }
            i10 = i12;
        }
    }

    /* renamed from: c */
    public static int m15567c(byte[] bArr, int i10, int i11, boolean[] zArr) {
        int i12 = i11 - i10;
        C4014a.m15200f(i12 >= 0);
        if (i12 == 0) {
            return i11;
        }
        if (zArr[0]) {
            m15565a(zArr);
            return i10 - 3;
        }
        if (i12 > 1 && zArr[1] && bArr[i10] == 1) {
            m15565a(zArr);
            return i10 - 2;
        }
        if (i12 > 2 && zArr[2] && bArr[i10] == 0 && bArr[i10 + 1] == 1) {
            m15565a(zArr);
            return i10 - 1;
        }
        int i13 = i11 - 1;
        int i14 = i10 + 2;
        while (i14 < i13) {
            if ((bArr[i14] & 254) == 0) {
                int i15 = i14 - 2;
                if (bArr[i15] == 0 && bArr[i14 - 1] == 0 && bArr[i14] == 1) {
                    m15565a(zArr);
                    return i15;
                }
                i14 -= 2;
            }
            i14 += 3;
        }
        zArr[0] = i12 <= 2 ? !(i12 != 2 ? !(zArr[1] && bArr[i13] == 1) : !(zArr[2] && bArr[i11 + (-2)] == 0 && bArr[i13] == 1)) : bArr[i11 + (-3)] == 0 && bArr[i11 + (-2)] == 0 && bArr[i13] == 1;
        zArr[1] = i12 <= 1 ? zArr[2] && bArr[i13] == 0 : bArr[i11 + (-2)] == 0 && bArr[i13] == 0;
        zArr[2] = bArr[i13] == 0;
        return i11;
    }

    /* renamed from: d */
    public static int m15568d(byte[] bArr, int i10, int i11) {
        while (i10 < i11 - 2) {
            if (bArr[i10] == 0 && bArr[i10 + 1] == 0 && bArr[i10 + 2] == 3) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    /* renamed from: e */
    public static int m15569e(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & 126) >> 1;
    }

    /* renamed from: f */
    public static int m15570f(byte[] bArr, int i10) {
        return bArr[i10 + 3] & 31;
    }

    /* renamed from: g */
    public static boolean m15571g(String str, byte b10) {
        if ("video/avc".equals(str) && (b10 & 31) == 6) {
            return true;
        }
        return "video/hevc".equals(str) && ((b10 & 126) >> 1) == 39;
    }

    /* renamed from: h */
    public static a m15572h(byte[] bArr, int i10, int i11) {
        return m15573i(bArr, i10 + 2, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01b6  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p222p5.C4051w.a m15573i(byte[] r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 472
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p222p5.C4051w.m15573i(byte[], int, int):p5.w$a");
    }

    /* renamed from: j */
    public static b m15574j(byte[] bArr, int i10, int i11) {
        return m15575k(bArr, i10 + 1, i11);
    }

    /* renamed from: k */
    public static b m15575k(byte[] bArr, int i10, int i11) {
        C4017b0 c4017b0 = new C4017b0(bArr, i10, i11);
        int m15261h = c4017b0.m15261h();
        int m15261h2 = c4017b0.m15261h();
        c4017b0.m15264k();
        return new b(m15261h, m15261h2, c4017b0.m15257d());
    }

    /* renamed from: l */
    public static c m15576l(byte[] bArr, int i10, int i11) {
        return m15577m(bArr, i10 + 1, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0145  */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p222p5.C4051w.c m15577m(byte[] r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p222p5.C4051w.m15577m(byte[], int, int):p5.w$c");
    }

    /* renamed from: n */
    public static void m15578n(C4017b0 c4017b0) {
        for (int i10 = 0; i10 < 4; i10++) {
            int i11 = 0;
            while (i11 < 6) {
                int i12 = 1;
                if (c4017b0.m15257d()) {
                    int min = Math.min(64, 1 << ((i10 << 1) + 4));
                    if (i10 > 1) {
                        c4017b0.m15260g();
                    }
                    for (int i13 = 0; i13 < min; i13++) {
                        c4017b0.m15260g();
                    }
                } else {
                    c4017b0.m15261h();
                }
                if (i10 == 3) {
                    i12 = 3;
                }
                i11 += i12;
            }
        }
    }

    /* renamed from: o */
    public static void m15579o(C4017b0 c4017b0, int i10) {
        int i11 = 8;
        int i12 = 8;
        for (int i13 = 0; i13 < i10; i13++) {
            if (i11 != 0) {
                i11 = ((c4017b0.m15260g() + i12) + 256) % 256;
            }
            if (i11 != 0) {
                i12 = i11;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: p */
    public static void m15580p(C4017b0 c4017b0) {
        int m15261h = c4017b0.m15261h();
        int[] iArr = new int[0];
        int[] iArr2 = new int[0];
        int i10 = -1;
        int i11 = 0;
        int i12 = -1;
        while (i11 < m15261h) {
            if ((i11 != 0 && c4017b0.m15257d()) == true) {
                int i13 = i10 + i12;
                int m15261h2 = (1 - ((c4017b0.m15257d() ? 1 : 0) * 2)) * (c4017b0.m15261h() + 1);
                int i14 = i13 + 1;
                boolean[] zArr = new boolean[i14];
                for (int i15 = 0; i15 <= i13; i15++) {
                    if (c4017b0.m15257d()) {
                        zArr[i15] = true;
                    } else {
                        zArr[i15] = c4017b0.m15257d();
                    }
                }
                int[] iArr3 = new int[i14];
                int[] iArr4 = new int[i14];
                int i16 = 0;
                for (int i17 = i12 - 1; i17 >= 0; i17--) {
                    int i18 = iArr2[i17] + m15261h2;
                    if (i18 < 0 && zArr[i10 + i17]) {
                        iArr3[i16] = i18;
                        i16++;
                    }
                }
                if (m15261h2 < 0 && zArr[i13]) {
                    iArr3[i16] = m15261h2;
                    i16++;
                }
                for (int i19 = 0; i19 < i10; i19++) {
                    int i20 = iArr[i19] + m15261h2;
                    if (i20 < 0 && zArr[i19]) {
                        iArr3[i16] = i20;
                        i16++;
                    }
                }
                int[] copyOf = Arrays.copyOf(iArr3, i16);
                int i21 = 0;
                for (int i22 = i10 - 1; i22 >= 0; i22--) {
                    int i23 = iArr[i22] + m15261h2;
                    if (i23 > 0 && zArr[i22]) {
                        iArr4[i21] = i23;
                        i21++;
                    }
                }
                if (m15261h2 > 0 && zArr[i13]) {
                    iArr4[i21] = m15261h2;
                    i21++;
                }
                for (int i24 = 0; i24 < i12; i24++) {
                    int i25 = iArr2[i24] + m15261h2;
                    if (i25 > 0 && zArr[i10 + i24]) {
                        iArr4[i21] = i25;
                        i21++;
                    }
                }
                iArr2 = Arrays.copyOf(iArr4, i21);
                iArr = copyOf;
                i10 = i16;
                i12 = i21;
            } else {
                int m15261h3 = c4017b0.m15261h();
                int m15261h4 = c4017b0.m15261h();
                int[] iArr5 = new int[m15261h3];
                for (int i26 = 0; i26 < m15261h3; i26++) {
                    iArr5[i26] = c4017b0.m15261h() + 1;
                    c4017b0.m15264k();
                }
                int[] iArr6 = new int[m15261h4];
                for (int i27 = 0; i27 < m15261h4; i27++) {
                    iArr6[i27] = c4017b0.m15261h() + 1;
                    c4017b0.m15264k();
                }
                i10 = m15261h3;
                iArr = iArr5;
                i12 = m15261h4;
                iArr2 = iArr6;
            }
            i11++;
        }
    }

    /* renamed from: q */
    public static int m15581q(byte[] bArr, int i10) {
        int i11;
        synchronized (f14561c) {
            int i12 = 0;
            int i13 = 0;
            while (i12 < i10) {
                try {
                    i12 = m15568d(bArr, i12, i10);
                    if (i12 < i10) {
                        int[] iArr = f14562d;
                        if (iArr.length <= i13) {
                            f14562d = Arrays.copyOf(iArr, iArr.length * 2);
                        }
                        f14562d[i13] = i12;
                        i12 += 3;
                        i13++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            i11 = i10 - i13;
            int i14 = 0;
            int i15 = 0;
            for (int i16 = 0; i16 < i13; i16++) {
                int i17 = f14562d[i16] - i15;
                System.arraycopy(bArr, i15, bArr, i14, i17);
                int i18 = i14 + i17;
                int i19 = i18 + 1;
                bArr[i18] = 0;
                i14 = i19 + 1;
                bArr[i19] = 0;
                i15 += i17 + 3;
            }
            System.arraycopy(bArr, i15, bArr, i14, i11 - i14);
        }
        return i11;
    }
}
