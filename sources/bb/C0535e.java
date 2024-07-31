package bb;

import java.math.BigInteger;
import java.util.Arrays;
import p013ab.C0085c;
import p129ia.C2674f;
import p211oa.C3968e;
import p211oa.C3971h;

/* renamed from: bb.e */
/* loaded from: classes.dex */
public final class C0535e {

    /* renamed from: a */
    public static final char[] f2385a = ";<>@[\\]_`~!\r\t,:\n-.$/\"|*()?{}'".toCharArray();

    /* renamed from: b */
    public static final char[] f2386b = "0123456789&\r\t,:#-.$/+%*=^".toCharArray();

    /* renamed from: c */
    public static final BigInteger[] f2387c;

    /* renamed from: bb.e$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f2388a;

        static {
            int[] iArr = new int[b.values().length];
            f2388a = iArr;
            try {
                iArr[b.ALPHA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2388a[b.LOWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2388a[b.MIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2388a[b.PUNCT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2388a[b.ALPHA_SHIFT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2388a[b.PUNCT_SHIFT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* renamed from: bb.e$b */
    /* loaded from: classes.dex */
    public enum b {
        ALPHA,
        LOWER,
        MIXED,
        PUNCT,
        ALPHA_SHIFT,
        PUNCT_SHIFT
    }

    static {
        BigInteger[] bigIntegerArr = new BigInteger[16];
        f2387c = bigIntegerArr;
        bigIntegerArr[0] = BigInteger.ONE;
        BigInteger valueOf = BigInteger.valueOf(900L);
        bigIntegerArr[1] = valueOf;
        int i10 = 2;
        while (true) {
            BigInteger[] bigIntegerArr2 = f2387c;
            if (i10 >= bigIntegerArr2.length) {
                return;
            }
            bigIntegerArr2[i10] = bigIntegerArr2[i10 - 1].multiply(valueOf);
            i10++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0047, code lost:
    
        if (r11 == 924) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x004b, code lost:
    
        if (r8 >= r12[0]) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x004f, code lost:
    
        if (r12[r8] >= 900) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0051, code lost:
    
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0053, code lost:
    
        if (r13 >= 6) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0055, code lost:
    
        r14.m15072a((byte) (r6 >> ((5 - r13) * 8)));
        r13 = r13 + 1;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int m2592a(int r11, int[] r12, int r13, p211oa.C3971h r14) {
        /*
            r0 = 1
            r1 = 0
            r2 = r1
        L3:
            r3 = r12[r1]
            if (r13 >= r3) goto L8c
            if (r2 != 0) goto L8c
        L9:
            r3 = r12[r1]
            r4 = 927(0x39f, float:1.299E-42)
            if (r13 >= r3) goto L1c
            r3 = r12[r13]
            if (r3 != r4) goto L1c
            int r13 = r13 + 1
            r3 = r12[r13]
            r14.m15077f(r3)
            int r13 = r13 + r0
            goto L9
        L1c:
            r3 = r12[r1]
            if (r13 >= r3) goto L89
            r3 = r12[r13]
            r5 = 900(0x384, float:1.261E-42)
            if (r3 < r5) goto L28
            goto L89
        L28:
            r6 = 0
            r3 = r1
        L2b:
            r8 = 900(0x384, double:4.447E-321)
            long r6 = r6 * r8
            int r8 = r13 + 1
            r13 = r12[r13]
            long r9 = (long) r13
            long r6 = r6 + r9
            int r3 = r3 + r0
            r13 = 5
            if (r3 >= r13) goto L43
            r9 = r12[r1]
            if (r8 >= r9) goto L43
            r9 = r12[r8]
            if (r9 < r5) goto L41
            goto L43
        L41:
            r13 = r8
            goto L2b
        L43:
            if (r3 != r13) goto L63
            r13 = 924(0x39c, float:1.295E-42)
            if (r11 == r13) goto L51
            r13 = r12[r1]
            if (r8 >= r13) goto L63
            r13 = r12[r8]
            if (r13 >= r5) goto L63
        L51:
            r13 = r1
        L52:
            r3 = 6
            if (r13 >= r3) goto L86
            int r3 = 5 - r13
            int r3 = r3 * 8
            long r3 = r6 >> r3
            int r3 = (int) r3
            byte r3 = (byte) r3
            r14.m15072a(r3)
            int r13 = r13 + 1
            goto L52
        L63:
            int r8 = r8 - r3
        L64:
            r13 = r12[r1]
            if (r8 >= r13) goto L86
            if (r2 != 0) goto L86
            int r13 = r8 + 1
            r3 = r12[r8]
            if (r3 >= r5) goto L76
            byte r3 = (byte) r3
            r14.m15072a(r3)
            r8 = r13
            goto L64
        L76:
            if (r3 != r4) goto L81
            int r3 = r13 + 1
            r13 = r12[r13]
            r14.m15077f(r13)
            r8 = r3
            goto L64
        L81:
            int r13 = r13 + (-1)
            r8 = r13
            r2 = r0
            goto L64
        L86:
            r13 = r8
            goto L3
        L89:
            r2 = r0
            goto L3
        L8c:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: bb.C0535e.m2592a(int, int[], int, oa.h):int");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x001f. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:22:0x0022. Please report as an issue. */
    /* renamed from: b */
    public static C3968e m2593b(int[] iArr, String str) {
        int i10;
        C3971h c3971h = new C3971h(iArr.length * 2);
        int m2598g = m2598g(iArr, 1, c3971h);
        C0085c c0085c = new C0085c();
        while (m2598g < iArr[0]) {
            int i11 = m2598g + 1;
            int i12 = iArr[m2598g];
            if (i12 != 913) {
                switch (i12) {
                    case 900:
                        m2598g = m2598g(iArr, i11, c3971h);
                        break;
                    case 901:
                        m2598g = m2592a(i12, iArr, i11, c3971h);
                        break;
                    case 902:
                        m2598g = m2597f(iArr, i11, c3971h);
                        break;
                    default:
                        switch (i12) {
                            case 922:
                            case 923:
                                throw C2674f.m10883a();
                            case 924:
                                m2598g = m2592a(i12, iArr, i11, c3971h);
                                break;
                            case 925:
                                i10 = i11 + 1;
                                m2598g = i10;
                                break;
                            case 926:
                                i10 = i11 + 2;
                                m2598g = i10;
                                break;
                            case 927:
                                m2598g = i11 + 1;
                                c3971h.m15077f(iArr[i11]);
                                break;
                            case 928:
                                m2598g = m2595d(iArr, i11, c0085c);
                                break;
                            default:
                                i11--;
                                m2598g = m2598g(iArr, i11, c3971h);
                                break;
                        }
                }
            } else {
                m2598g = i11 + 1;
                c3971h.m15073b((char) iArr[i11]);
            }
        }
        if (c3971h.m15079h() && c0085c.m365a() == null) {
            throw C2674f.m10883a();
        }
        C3968e c3968e = new C3968e(null, c3971h.toString(), null, str);
        c3968e.m15067n(c0085c);
        return c3968e;
    }

    /* renamed from: c */
    public static String m2594c(int[] iArr, int i10) {
        BigInteger bigInteger = BigInteger.ZERO;
        for (int i11 = 0; i11 < i10; i11++) {
            bigInteger = bigInteger.add(f2387c[(i10 - i11) - 1].multiply(BigInteger.valueOf(iArr[i11])));
        }
        String bigInteger2 = bigInteger.toString();
        if (bigInteger2.charAt(0) == '1') {
            return bigInteger2.substring(1);
        }
        throw C2674f.m10883a();
    }

    /* renamed from: d */
    public static int m2595d(int[] iArr, int i10, C0085c c0085c) {
        if (i10 + 2 > iArr[0]) {
            throw C2674f.m10883a();
        }
        int[] iArr2 = new int[2];
        int i11 = 0;
        while (i11 < 2) {
            iArr2[i11] = iArr[i10];
            i11++;
            i10++;
        }
        String m2594c = m2594c(iArr2, 2);
        if (m2594c.isEmpty()) {
            c0085c.m375k(0);
        } else {
            try {
                c0085c.m375k(Integer.parseInt(m2594c));
            } catch (NumberFormatException unused) {
                throw C2674f.m10883a();
            }
        }
        StringBuilder sb2 = new StringBuilder();
        while (i10 < iArr[0] && i10 < iArr.length && iArr[i10] != 922 && iArr[i10] != 923) {
            sb2.append(String.format("%03d", Integer.valueOf(iArr[i10])));
            i10++;
        }
        if (sb2.length() == 0) {
            throw C2674f.m10883a();
        }
        c0085c.m369e(sb2.toString());
        int i12 = iArr[i10] == 923 ? i10 + 1 : -1;
        while (i10 < iArr[0]) {
            int i13 = iArr[i10];
            if (i13 == 922) {
                i10++;
                c0085c.m372h(true);
            } else {
                if (i13 != 923) {
                    throw C2674f.m10883a();
                }
                int i14 = i10 + 1;
                switch (iArr[i14]) {
                    case 0:
                        C3971h c3971h = new C3971h();
                        i10 = m2598g(iArr, i14 + 1, c3971h);
                        c0085c.m370f(c3971h.toString());
                        break;
                    case 1:
                        C3971h c3971h2 = new C3971h();
                        i10 = m2597f(iArr, i14 + 1, c3971h2);
                        c0085c.m374j(Integer.parseInt(c3971h2.toString()));
                        break;
                    case 2:
                        C3971h c3971h3 = new C3971h();
                        i10 = m2597f(iArr, i14 + 1, c3971h3);
                        c0085c.m377m(Long.parseLong(c3971h3.toString()));
                        break;
                    case 3:
                        C3971h c3971h4 = new C3971h();
                        i10 = m2598g(iArr, i14 + 1, c3971h4);
                        c0085c.m376l(c3971h4.toString());
                        break;
                    case 4:
                        C3971h c3971h5 = new C3971h();
                        i10 = m2598g(iArr, i14 + 1, c3971h5);
                        c0085c.m367c(c3971h5.toString());
                        break;
                    case 5:
                        C3971h c3971h6 = new C3971h();
                        i10 = m2597f(iArr, i14 + 1, c3971h6);
                        c0085c.m371g(Long.parseLong(c3971h6.toString()));
                        break;
                    case 6:
                        C3971h c3971h7 = new C3971h();
                        i10 = m2597f(iArr, i14 + 1, c3971h7);
                        c0085c.m368d(Integer.parseInt(c3971h7.toString()));
                        break;
                    default:
                        throw C2674f.m10883a();
                }
            }
        }
        if (i12 != -1) {
            int i15 = i10 - i12;
            if (c0085c.m366b()) {
                i15--;
            }
            c0085c.m373i(Arrays.copyOfRange(iArr, i12, i15 + i12));
        }
        return i10;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:42:0x007c. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0020. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:55:0x009c. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:65:0x00c1. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c5  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static bb.C0535e.b m2596e(int[] r15, int[] r16, int r17, p211oa.C3971h r18, bb.C0535e.b r19) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: bb.C0535e.m2596e(int[], int[], int, oa.h, bb.e$b):bb.e$b");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:29:0x002e. Please report as an issue. */
    /* renamed from: f */
    public static int m2597f(int[] iArr, int i10, C3971h c3971h) {
        int[] iArr2 = new int[15];
        boolean z10 = false;
        int i11 = 0;
        while (i10 < iArr[0] && !z10) {
            int i12 = i10 + 1;
            int i13 = iArr[i10];
            if (i12 == iArr[0]) {
                z10 = true;
            }
            if (i13 < 900) {
                iArr2[i11] = i13;
                i11++;
            } else {
                if (i13 != 900 && i13 != 901 && i13 != 927 && i13 != 928) {
                    switch (i13) {
                    }
                }
                i12--;
                z10 = true;
            }
            if ((i11 % 15 == 0 || i13 == 902 || z10) && i11 > 0) {
                c3971h.m15075d(m2594c(iArr2, i11));
                i11 = 0;
            }
            i10 = i12;
        }
        return i10;
    }

    /* renamed from: g */
    public static int m2598g(int[] iArr, int i10, C3971h c3971h) {
        int[] iArr2 = new int[(iArr[0] - i10) * 2];
        int[] iArr3 = new int[(iArr[0] - i10) * 2];
        b bVar = b.ALPHA;
        boolean z10 = false;
        int i11 = 0;
        while (i10 < iArr[0] && !z10) {
            int i12 = i10 + 1;
            int i13 = iArr[i10];
            if (i13 < 900) {
                iArr2[i11] = i13 / 30;
                iArr2[i11 + 1] = i13 % 30;
                i11 += 2;
            } else if (i13 == 913) {
                iArr2[i11] = 913;
                i10 = i12 + 1;
                iArr3[i11] = iArr[i12];
                i11++;
            } else if (i13 != 927) {
                if (i13 != 928) {
                    switch (i13) {
                        case 900:
                            iArr2[i11] = 900;
                            i11++;
                            break;
                        case 901:
                        case 902:
                            break;
                        default:
                            switch (i13) {
                            }
                    }
                }
                i12--;
                z10 = true;
            } else {
                b m2596e = m2596e(iArr2, iArr3, i11, c3971h, bVar);
                int i14 = i12 + 1;
                c3971h.m15077f(iArr[i12]);
                int[] iArr4 = new int[(iArr[0] - i14) * 2];
                int[] iArr5 = new int[(iArr[0] - i14) * 2];
                i11 = 0;
                bVar = m2596e;
                i10 = i14;
                iArr2 = iArr4;
                iArr3 = iArr5;
            }
            i10 = i12;
        }
        m2596e(iArr2, iArr3, i11, c3971h, bVar);
        return i10;
    }
}
