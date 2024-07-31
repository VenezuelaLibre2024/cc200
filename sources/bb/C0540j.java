package bb;

import java.lang.reflect.Array;
import java.util.ArrayList;
import p013ab.C0083a;
import p037cb.C1003a;
import p129ia.C2672d;
import p129ia.C2674f;
import p129ia.C2678j;
import p129ia.C2684p;
import p211oa.C3965b;
import p211oa.C3968e;
import pa.C4104a;

/* renamed from: bb.j */
/* loaded from: classes.dex */
public final class C0540j {

    /* renamed from: a */
    public static final C1003a f2404a = new C1003a();

    /* renamed from: a */
    public static C0533c m2634a(C0538h c0538h) {
        int[] m2625j;
        if (c0538h == null || (m2625j = c0538h.m2625j()) == null) {
            return null;
        }
        int m2649p = m2649p(m2625j);
        int i10 = 0;
        int i11 = 0;
        for (int i12 : m2625j) {
            i11 += m2649p - i12;
            if (i12 > 0) {
                break;
            }
        }
        C0534d[] m2619d = c0538h.m2619d();
        for (int i13 = 0; i11 > 0 && m2619d[i13] == null; i13++) {
            i11--;
        }
        for (int length = m2625j.length - 1; length >= 0; length--) {
            i10 += m2649p - m2625j[length];
            if (m2625j[length] > 0) {
                break;
            }
        }
        for (int length2 = m2619d.length - 1; i10 > 0 && m2619d[length2] == null; length2--) {
            i10--;
        }
        return c0538h.m2616a().m2573a(i11, i10, c0538h.m2626k());
    }

    /* renamed from: b */
    public static void m2635b(C0536f c0536f, C0532b[][] c0532bArr) {
        C0532b c0532b = c0532bArr[0][1];
        int[] m2570a = c0532b.m2570a();
        int m2608j = (c0536f.m2608j() * c0536f.m2610l()) - m2651r(c0536f.m2609k());
        if (m2570a.length == 0) {
            if (m2608j < 1 || m2608j > 928) {
                throw C2678j.m10895a();
            }
        } else if (m2570a[0] == m2608j || m2608j < 1 || m2608j > 928) {
            return;
        }
        c0532b.m2571b(m2608j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0022, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0022, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0022, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0017  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int m2636c(p211oa.C3965b r5, int r6, int r7, boolean r8, int r9, int r10) {
        /*
            if (r8 == 0) goto L4
            r0 = -1
            goto L5
        L4:
            r0 = 1
        L5:
            r1 = 0
            r2 = r9
        L7:
            r3 = 2
            if (r1 >= r3) goto L28
        La:
            if (r8 == 0) goto Lf
            if (r2 < r6) goto L22
            goto L11
        Lf:
            if (r2 >= r7) goto L22
        L11:
            boolean r4 = r5.m15035g(r2, r10)
            if (r8 != r4) goto L22
            int r4 = r9 - r2
            int r4 = java.lang.Math.abs(r4)
            if (r4 <= r3) goto L20
            return r9
        L20:
            int r2 = r2 + r0
            goto La
        L22:
            int r0 = -r0
            r8 = r8 ^ 1
            int r1 = r1 + 1
            goto L7
        L28:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: bb.C0540j.m2636c(oa.b, int, int, boolean, int, int):int");
    }

    /* renamed from: d */
    public static boolean m2637d(int i10, int i11, int i12) {
        return i11 + (-2) <= i10 && i10 <= i12 + 2;
    }

    /* renamed from: e */
    public static int m2638e(int[] iArr, int[] iArr2, int i10) {
        if ((iArr2 == null || iArr2.length <= (i10 / 2) + 3) && i10 >= 0 && i10 <= 512) {
            return f2404a.m4219a(iArr, i10, iArr2);
        }
        throw C2672d.m10881a();
    }

    /* renamed from: f */
    public static C0532b[][] m2639f(C0536f c0536f) {
        int m2584c;
        C0532b[][] c0532bArr = (C0532b[][]) Array.newInstance((Class<?>) C0532b.class, c0536f.m2610l(), c0536f.m2608j() + 2);
        for (int i10 = 0; i10 < c0532bArr.length; i10++) {
            for (int i11 = 0; i11 < c0532bArr[i10].length; i11++) {
                c0532bArr[i10][i11] = new C0532b();
            }
        }
        int i12 = 0;
        for (C0537g c0537g : c0536f.m2613o()) {
            if (c0537g != null) {
                for (C0534d c0534d : c0537g.m2619d()) {
                    if (c0534d != null && (m2584c = c0534d.m2584c()) >= 0 && m2584c < c0532bArr.length) {
                        c0532bArr[m2584c][i12].m2571b(c0534d.m2586e());
                    }
                }
            }
            i12++;
        }
        return c0532bArr;
    }

    /* renamed from: g */
    public static C3968e m2640g(C0536f c0536f) {
        C0532b[][] m2639f = m2639f(c0536f);
        m2635b(c0536f, m2639f);
        ArrayList arrayList = new ArrayList();
        int[] iArr = new int[c0536f.m2610l() * c0536f.m2608j()];
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (int i10 = 0; i10 < c0536f.m2610l(); i10++) {
            int i11 = 0;
            while (i11 < c0536f.m2608j()) {
                int i12 = i11 + 1;
                int[] m2570a = m2639f[i10][i12].m2570a();
                int m2608j = (c0536f.m2608j() * i10) + i11;
                if (m2570a.length == 0) {
                    arrayList.add(Integer.valueOf(m2608j));
                } else if (m2570a.length == 1) {
                    iArr[m2608j] = m2570a[0];
                } else {
                    arrayList3.add(Integer.valueOf(m2608j));
                    arrayList2.add(m2570a);
                }
                i11 = i12;
            }
        }
        int size = arrayList2.size();
        int[][] iArr2 = new int[size];
        for (int i13 = 0; i13 < size; i13++) {
            iArr2[i13] = (int[]) arrayList2.get(i13);
        }
        return m2641h(c0536f.m2609k(), iArr, C0083a.m357b(arrayList), C0083a.m357b(arrayList3), iArr2);
    }

    /* renamed from: h */
    public static C3968e m2641h(int i10, int[] iArr, int[] iArr2, int[] iArr3, int[][] iArr4) {
        int length = iArr3.length;
        int[] iArr5 = new int[length];
        int i11 = 100;
        while (true) {
            int i12 = i11 - 1;
            if (i11 <= 0) {
                throw C2672d.m10881a();
            }
            for (int i13 = 0; i13 < length; i13++) {
                iArr[iArr3[i13]] = iArr4[i13][iArr5[i13]];
            }
            try {
                return m2643j(iArr, i10, iArr2);
            } catch (C2672d unused) {
                if (length == 0) {
                    throw C2672d.m10881a();
                }
                int i14 = 0;
                while (true) {
                    if (i14 >= length) {
                        break;
                    }
                    if (iArr5[i14] < iArr4[i14].length - 1) {
                        iArr5[i14] = iArr5[i14] + 1;
                        break;
                    }
                    iArr5[i14] = 0;
                    if (i14 == length - 1) {
                        throw C2672d.m10881a();
                    }
                    i14++;
                }
                i11 = i12;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0068, code lost:
    
        if (r0 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006a, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006d, code lost:
    
        r3 = r27;
        r6 = r28;
        r7 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0072, code lost:
    
        if (r7 > r5) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0074, code lost:
    
        if (r0 == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0076, code lost:
    
        r8 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007e, code lost:
    
        if (r4.m2612n(r8) == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0082, code lost:
    
        if (r8 == 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0084, code lost:
    
        if (r8 != r5) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0087, code lost:
    
        r9 = new bb.C0537g(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0097, code lost:
    
        r4.m2615q(r8, r9);
        r15 = -1;
        r14 = r10.m2579g();
        r13 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a5, code lost:
    
        if (r14 > r10.m2577e()) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a7, code lost:
    
        r11 = m2653t(r4, r8, r14, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ab, code lost:
    
        if (r11 < 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b1, code lost:
    
        if (r11 <= r10.m2576d()) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b4, code lost:
    
        r19 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c1, code lost:
    
        r20 = r13;
        r23 = r14;
        r21 = r15;
        r11 = m2644k(r22, r10.m2578f(), r10.m2576d(), r0, r19, r23, r3, r6);
        r12 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00e2, code lost:
    
        if (r11 == null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00e4, code lost:
    
        r9.m2621f(r12, r11);
        r3 = java.lang.Math.min(r3, r11.m2587f());
        r6 = java.lang.Math.max(r6, r11.m2587f());
        r13 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00fc, code lost:
    
        r14 = r12 + 1;
        r15 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00fa, code lost:
    
        r13 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b7, code lost:
    
        if (r13 != r15) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b9, code lost:
    
        r20 = r13;
        r12 = r14;
        r21 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00bf, code lost:
    
        r19 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0101, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x008f, code lost:
    
        if (r8 != 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0091, code lost:
    
        r11 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0094, code lost:
    
        r9 = new bb.C0538h(r10, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0093, code lost:
    
        r11 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0078, code lost:
    
        r8 = r5 - r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0109, code lost:
    
        return m2640g(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x006c, code lost:
    
        r0 = false;
     */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p211oa.C3968e m2642i(p211oa.C3965b r22, p129ia.C2684p r23, p129ia.C2684p r24, p129ia.C2684p r25, p129ia.C2684p r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: bb.C0540j.m2642i(oa.b, ia.p, ia.p, ia.p, ia.p, int, int):oa.e");
    }

    /* renamed from: j */
    public static C3968e m2643j(int[] iArr, int i10, int[] iArr2) {
        if (iArr.length == 0) {
            throw C2674f.m10883a();
        }
        int i11 = 1 << (i10 + 1);
        int m2638e = m2638e(iArr, iArr2, i11);
        m2656w(iArr, i11);
        C3968e m2593b = C0535e.m2593b(iArr, String.valueOf(i10));
        m2593b.m15065l(Integer.valueOf(m2638e));
        m2593b.m15064k(Integer.valueOf(iArr2.length));
        return m2593b;
    }

    /* renamed from: k */
    public static C0534d m2644k(C3965b c3965b, int i10, int i11, boolean z10, int i12, int i13, int i14, int i15) {
        int i16;
        int m2632d;
        int m356a;
        int m2636c = m2636c(c3965b, i10, i11, z10, i12, i13);
        int[] m2650q = m2650q(c3965b, i10, i11, z10, m2636c, i13);
        if (m2650q == null) {
            return null;
        }
        int m15856d = C4104a.m15856d(m2650q);
        if (z10) {
            i16 = m2636c + m15856d;
        } else {
            for (int i17 = 0; i17 < m2650q.length / 2; i17++) {
                int i18 = m2650q[i17];
                m2650q[i17] = m2650q[(m2650q.length - 1) - i17];
                m2650q[(m2650q.length - 1) - i17] = i18;
            }
            m2636c -= m15856d;
            i16 = m2636c;
        }
        if (m2637d(m15856d, i14, i15) && (m356a = C0083a.m356a((m2632d = C0539i.m2632d(m2650q)))) != -1) {
            return new C0534d(m2636c, i16, m2647n(m2632d), m356a);
        }
        return null;
    }

    /* renamed from: l */
    public static C0531a m2645l(C0538h c0538h, C0538h c0538h2) {
        C0531a m2624i;
        C0531a m2624i2;
        if (c0538h == null || (m2624i = c0538h.m2624i()) == null) {
            if (c0538h2 == null) {
                return null;
            }
            return c0538h2.m2624i();
        }
        if (c0538h2 == null || (m2624i2 = c0538h2.m2624i()) == null || m2624i.m2565a() == m2624i2.m2565a() || m2624i.m2566b() == m2624i2.m2566b() || m2624i.m2567c() == m2624i2.m2567c()) {
            return m2624i;
        }
        return null;
    }

    /* renamed from: m */
    public static int[] m2646m(int i10) {
        int[] iArr = new int[8];
        int i11 = 0;
        int i12 = 7;
        while (true) {
            int i13 = i10 & 1;
            if (i13 != i11) {
                i12--;
                if (i12 < 0) {
                    return iArr;
                }
                i11 = i13;
            }
            iArr[i12] = iArr[i12] + 1;
            i10 >>= 1;
        }
    }

    /* renamed from: n */
    public static int m2647n(int i10) {
        return m2648o(m2646m(i10));
    }

    /* renamed from: o */
    public static int m2648o(int[] iArr) {
        return ((((iArr[0] - iArr[2]) + iArr[4]) - iArr[6]) + 9) % 9;
    }

    /* renamed from: p */
    public static int m2649p(int[] iArr) {
        int i10 = -1;
        for (int i11 : iArr) {
            i10 = Math.max(i10, i11);
        }
        return i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0027 A[EDGE_INSN: B:17:0x0027->B:18:0x0027 BREAK  A[LOOP:0: B:5:0x000c->B:13:0x000c], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0015  */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int[] m2650q(p211oa.C3965b r7, int r8, int r9, boolean r10, int r11, int r12) {
        /*
            r0 = 8
            int[] r1 = new int[r0]
            r2 = 1
            if (r10 == 0) goto L9
            r3 = r2
            goto La
        L9:
            r3 = -1
        La:
            r4 = 0
            r5 = r10
        Lc:
            if (r10 == 0) goto L11
            if (r11 >= r9) goto L27
            goto L13
        L11:
            if (r11 < r8) goto L27
        L13:
            if (r4 >= r0) goto L27
            boolean r6 = r7.m15035g(r11, r12)
            if (r6 != r5) goto L22
            r6 = r1[r4]
            int r6 = r6 + r2
            r1[r4] = r6
            int r11 = r11 + r3
            goto Lc
        L22:
            int r4 = r4 + 1
            r5 = r5 ^ 1
            goto Lc
        L27:
            if (r4 == r0) goto L34
            if (r10 == 0) goto L2c
            r8 = r9
        L2c:
            if (r11 != r8) goto L32
            r7 = 7
            if (r4 != r7) goto L32
            goto L34
        L32:
            r7 = 0
            return r7
        L34:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: bb.C0540j.m2650q(oa.b, int, int, boolean, int, int):int[]");
    }

    /* renamed from: r */
    public static int m2651r(int i10) {
        return 2 << i10;
    }

    /* renamed from: s */
    public static C0538h m2652s(C3965b c3965b, C0533c c0533c, C2684p c2684p, boolean z10, int i10, int i11) {
        C0538h c0538h = new C0538h(c0533c, z10);
        int i12 = 0;
        while (i12 < 2) {
            int i13 = i12 == 0 ? 1 : -1;
            int m10908c = (int) c2684p.m10908c();
            for (int m10909d = (int) c2684p.m10909d(); m10909d <= c0533c.m2577e() && m10909d >= c0533c.m2579g(); m10909d += i13) {
                C0534d m2644k = m2644k(c3965b, 0, c3965b.m15041n(), z10, m10908c, m10909d, i10, i11);
                if (m2644k != null) {
                    c0538h.m2621f(m10909d, m2644k);
                    m10908c = z10 ? m2644k.m2585d() : m2644k.m2583b();
                }
            }
            i12++;
        }
        return c0538h;
    }

    /* renamed from: t */
    public static int m2653t(C0536f c0536f, int i10, int i11, boolean z10) {
        int i12 = z10 ? 1 : -1;
        int i13 = i10 - i12;
        C0534d m2617b = m2654u(c0536f, i13) ? c0536f.m2612n(i13).m2617b(i11) : null;
        if (m2617b != null) {
            return z10 ? m2617b.m2583b() : m2617b.m2585d();
        }
        C0534d m2618c = c0536f.m2612n(i10).m2618c(i11);
        if (m2618c != null) {
            return z10 ? m2618c.m2585d() : m2618c.m2583b();
        }
        if (m2654u(c0536f, i13)) {
            m2618c = c0536f.m2612n(i13).m2618c(i11);
        }
        if (m2618c != null) {
            return z10 ? m2618c.m2583b() : m2618c.m2585d();
        }
        int i14 = 0;
        while (true) {
            i10 -= i12;
            if (!m2654u(c0536f, i10)) {
                C0533c m2611m = c0536f.m2611m();
                return z10 ? m2611m.m2578f() : m2611m.m2576d();
            }
            for (C0534d c0534d : c0536f.m2612n(i10).m2619d()) {
                if (c0534d != null) {
                    return (z10 ? c0534d.m2583b() : c0534d.m2585d()) + (i12 * i14 * (c0534d.m2583b() - c0534d.m2585d()));
                }
            }
            i14++;
        }
    }

    /* renamed from: u */
    public static boolean m2654u(C0536f c0536f, int i10) {
        return i10 >= 0 && i10 <= c0536f.m2608j() + 1;
    }

    /* renamed from: v */
    public static C0536f m2655v(C0538h c0538h, C0538h c0538h2) {
        C0531a m2645l;
        if ((c0538h == null && c0538h2 == null) || (m2645l = m2645l(c0538h, c0538h2)) == null) {
            return null;
        }
        return new C0536f(m2645l, C0533c.m2572j(m2634a(c0538h), m2634a(c0538h2)));
    }

    /* renamed from: w */
    public static void m2656w(int[] iArr, int i10) {
        if (iArr.length < 4) {
            throw C2674f.m10883a();
        }
        int i11 = iArr[0];
        if (i11 > iArr.length) {
            throw C2674f.m10883a();
        }
        if (i11 == 0) {
            if (i10 >= iArr.length) {
                throw C2674f.m10883a();
            }
            iArr[0] = iArr.length - i10;
        }
    }
}
