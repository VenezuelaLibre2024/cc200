package p133j0;

/* renamed from: j0.f */
/* loaded from: classes.dex */
public final class C3207f {

    /* renamed from: a */
    public static final Object f11101a = new Object();

    /* renamed from: b */
    public static char[] f11102b = new char[24];

    /* renamed from: a */
    public static int m11419a(int i10, int i11, boolean z10, int i12) {
        if (i10 > 99 || (z10 && i12 >= 3)) {
            return i11 + 3;
        }
        if (i10 > 9 || (z10 && i12 >= 2)) {
            return i11 + 2;
        }
        if (z10 || i10 > 0) {
            return i11 + 1;
        }
        return 0;
    }

    /* renamed from: b */
    public static void m11420b(long j10, StringBuilder sb2) {
        synchronized (f11101a) {
            sb2.append(f11102b, 0, m11421c(j10, 0));
        }
    }

    /* renamed from: c */
    public static int m11421c(long j10, int i10) {
        char c10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        long j11 = j10;
        if (f11102b.length < i10) {
            f11102b = new char[i10];
        }
        char[] cArr = f11102b;
        if (j11 == 0) {
            int i16 = i10 - 1;
            while (i16 > 0) {
                cArr[0] = ' ';
            }
            cArr[0] = '0';
            return 1;
        }
        if (j11 > 0) {
            c10 = '+';
        } else {
            c10 = '-';
            j11 = -j11;
        }
        int i17 = (int) (j11 % 1000);
        int floor = (int) Math.floor(j11 / 1000);
        if (floor > 86400) {
            i11 = floor / 86400;
            floor -= 86400 * i11;
        } else {
            i11 = 0;
        }
        if (floor > 3600) {
            i12 = floor / 3600;
            floor -= i12 * 3600;
        } else {
            i12 = 0;
        }
        if (floor > 60) {
            int i18 = floor / 60;
            i13 = floor - (i18 * 60);
            i14 = i18;
        } else {
            i13 = floor;
            i14 = 0;
        }
        if (i10 != 0) {
            int m11419a = m11419a(i11, 1, false, 0);
            int m11419a2 = m11419a + m11419a(i12, 1, m11419a > 0, 2);
            int m11419a3 = m11419a2 + m11419a(i14, 1, m11419a2 > 0, 2);
            int m11419a4 = m11419a3 + m11419a(i13, 1, m11419a3 > 0, 2);
            i15 = 0;
            for (int m11419a5 = m11419a4 + m11419a(i17, 2, true, m11419a4 > 0 ? 3 : 0) + 1; m11419a5 < i10; m11419a5++) {
                cArr[i15] = ' ';
                i15++;
            }
        } else {
            i15 = 0;
        }
        cArr[i15] = c10;
        int i19 = i15 + 1;
        boolean z10 = i10 != 0;
        int m11422d = m11422d(cArr, i11, 'd', i19, false, 0);
        int m11422d2 = m11422d(cArr, i12, 'h', m11422d, m11422d != i19, z10 ? 2 : 0);
        int m11422d3 = m11422d(cArr, i14, 'm', m11422d2, m11422d2 != i19, z10 ? 2 : 0);
        int m11422d4 = m11422d(cArr, i13, 's', m11422d3, m11422d3 != i19, z10 ? 2 : 0);
        int m11422d5 = m11422d(cArr, i17, 'm', m11422d4, true, (!z10 || m11422d4 == i19) ? 0 : 3);
        cArr[m11422d5] = 's';
        return m11422d5 + 1;
    }

    /* renamed from: d */
    public static int m11422d(char[] cArr, int i10, char c10, int i11, boolean z10, int i12) {
        int i13;
        if (!z10 && i10 <= 0) {
            return i11;
        }
        if ((!z10 || i12 < 3) && i10 <= 99) {
            i13 = i11;
        } else {
            int i14 = i10 / 100;
            cArr[i11] = (char) (i14 + 48);
            i13 = i11 + 1;
            i10 -= i14 * 100;
        }
        if ((z10 && i12 >= 2) || i10 > 9 || i11 != i13) {
            int i15 = i10 / 10;
            cArr[i13] = (char) (i15 + 48);
            i13++;
            i10 -= i15 * 10;
        }
        cArr[i13] = (char) (i10 + 48);
        int i16 = i13 + 1;
        cArr[i16] = c10;
        return i16 + 1;
    }
}
