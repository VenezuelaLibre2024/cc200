package p084fb;

import java.util.Collection;
import java.util.Map;
import p129ia.C2674f;
import p129ia.EnumC2673e;
import p211oa.C3966c;
import p211oa.C3976m;
import p211oa.EnumC3967d;

/* renamed from: fb.d */
/* loaded from: classes.dex */
public final class C1891d {

    /* renamed from: a */
    public static final char[] f7144a = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ $%*+-./:".toCharArray();

    /* renamed from: fb.d$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f7145a;

        static {
            int[] iArr = new int[EnumC1895h.values().length];
            f7145a = iArr;
            try {
                iArr[EnumC1895h.NUMERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7145a[EnumC1895h.ALPHANUMERIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7145a[EnumC1895h.BYTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7145a[EnumC1895h.KANJI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7145a[EnumC1895h.TERMINATOR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7145a[EnumC1895h.FNC1_FIRST_POSITION.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f7145a[EnumC1895h.FNC1_SECOND_POSITION.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f7145a[EnumC1895h.STRUCTURED_APPEND.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f7145a[EnumC1895h.ECI.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f7145a[EnumC1895h.HANZI.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x0040. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0125 A[LOOP:0: B:2:0x0022->B:23:0x0125, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ed A[SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p211oa.C3968e m7731a(byte[] r22, p084fb.C1897j r23, p084fb.EnumC1893f r24, java.util.Map<p129ia.EnumC2673e, ?> r25) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p084fb.C1891d.m7731a(byte[], fb.j, fb.f, java.util.Map):oa.e");
    }

    /* renamed from: b */
    public static void m7732b(C3966c c3966c, StringBuilder sb2, int i10, boolean z10) {
        while (i10 > 1) {
            if (c3966c.m15048a() < 11) {
                throw C2674f.m10883a();
            }
            int m15051d = c3966c.m15051d(11);
            sb2.append(m7738h(m15051d / 45));
            sb2.append(m7738h(m15051d % 45));
            i10 -= 2;
        }
        if (i10 == 1) {
            if (c3966c.m15048a() < 6) {
                throw C2674f.m10883a();
            }
            sb2.append(m7738h(c3966c.m15051d(6)));
        }
        if (z10) {
            for (int length = sb2.length(); length < sb2.length(); length++) {
                if (sb2.charAt(length) == '%') {
                    if (length < sb2.length() - 1) {
                        int i11 = length + 1;
                        if (sb2.charAt(i11) == '%') {
                            sb2.deleteCharAt(i11);
                        }
                    }
                    sb2.setCharAt(length, (char) 29);
                }
            }
        }
    }

    /* renamed from: c */
    public static void m7733c(C3966c c3966c, StringBuilder sb2, int i10, EnumC3967d enumC3967d, Collection<byte[]> collection, Map<EnumC2673e, ?> map) {
        if (i10 * 8 > c3966c.m15048a()) {
            throw C2674f.m10883a();
        }
        byte[] bArr = new byte[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            bArr[i11] = (byte) c3966c.m15051d(8);
        }
        sb2.append(new String(bArr, enumC3967d == null ? C3976m.m15095a(bArr, map) : enumC3967d.m15053c()));
        collection.add(bArr);
    }

    /* renamed from: d */
    public static void m7734d(C3966c c3966c, StringBuilder sb2, int i10) {
        if (i10 * 13 > c3966c.m15048a()) {
            throw C2674f.m10883a();
        }
        byte[] bArr = new byte[i10 * 2];
        int i11 = 0;
        while (i10 > 0) {
            int m15051d = c3966c.m15051d(13);
            int i12 = (m15051d % 96) | ((m15051d / 96) << 8);
            int i13 = i12 + (i12 < 2560 ? 41377 : 42657);
            bArr[i11] = (byte) ((i13 >> 8) & 255);
            bArr[i11 + 1] = (byte) (i13 & 255);
            i11 += 2;
            i10--;
        }
        sb2.append(new String(bArr, C3976m.f14343c));
    }

    /* renamed from: e */
    public static void m7735e(C3966c c3966c, StringBuilder sb2, int i10) {
        if (i10 * 13 > c3966c.m15048a()) {
            throw C2674f.m10883a();
        }
        byte[] bArr = new byte[i10 * 2];
        int i11 = 0;
        while (i10 > 0) {
            int m15051d = c3966c.m15051d(13);
            int i12 = (m15051d % 192) | ((m15051d / 192) << 8);
            int i13 = i12 + (i12 < 7936 ? 33088 : 49472);
            bArr[i11] = (byte) (i13 >> 8);
            bArr[i11 + 1] = (byte) i13;
            i11 += 2;
            i10--;
        }
        sb2.append(new String(bArr, C3976m.f14342b));
    }

    /* renamed from: f */
    public static void m7736f(C3966c c3966c, StringBuilder sb2, int i10) {
        int m15051d;
        while (i10 >= 3) {
            if (c3966c.m15048a() < 10) {
                throw C2674f.m10883a();
            }
            int m15051d2 = c3966c.m15051d(10);
            if (m15051d2 >= 1000) {
                throw C2674f.m10883a();
            }
            sb2.append(m7738h(m15051d2 / 100));
            sb2.append(m7738h((m15051d2 / 10) % 10));
            sb2.append(m7738h(m15051d2 % 10));
            i10 -= 3;
        }
        if (i10 == 2) {
            if (c3966c.m15048a() < 7) {
                throw C2674f.m10883a();
            }
            int m15051d3 = c3966c.m15051d(7);
            if (m15051d3 >= 100) {
                throw C2674f.m10883a();
            }
            sb2.append(m7738h(m15051d3 / 10));
            m15051d = m15051d3 % 10;
        } else {
            if (i10 != 1) {
                return;
            }
            if (c3966c.m15048a() < 4) {
                throw C2674f.m10883a();
            }
            m15051d = c3966c.m15051d(4);
            if (m15051d >= 10) {
                throw C2674f.m10883a();
            }
        }
        sb2.append(m7738h(m15051d));
    }

    /* renamed from: g */
    public static int m7737g(C3966c c3966c) {
        int m15051d = c3966c.m15051d(8);
        if ((m15051d & 128) == 0) {
            return m15051d & 127;
        }
        if ((m15051d & 192) == 128) {
            return c3966c.m15051d(8) | ((m15051d & 63) << 8);
        }
        if ((m15051d & 224) == 192) {
            return c3966c.m15051d(16) | ((m15051d & 31) << 16);
        }
        throw C2674f.m10883a();
    }

    /* renamed from: h */
    public static char m7738h(int i10) {
        char[] cArr = f7144a;
        if (i10 < cArr.length) {
            return cArr[i10];
        }
        throw C2674f.m10883a();
    }
}
