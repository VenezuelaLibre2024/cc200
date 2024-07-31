package p053db;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import p129ia.C2671c;
import p129ia.C2684p;
import p129ia.EnumC2673e;
import p211oa.C3965b;

/* renamed from: db.a */
/* loaded from: classes.dex */
public final class C1608a {

    /* renamed from: a */
    public static final int[] f5943a = {0, 4, 1, 5};

    /* renamed from: b */
    public static final int[] f5944b = {6, 2, 7, 3};

    /* renamed from: c */
    public static final int[] f5945c = {8, 1, 1, 1, 1, 1, 1, 3};

    /* renamed from: d */
    public static final int[] f5946d = {7, 1, 1, 3, 1, 1, 1, 2, 1};

    /* renamed from: a */
    public static void m6458a(C2684p[] c2684pArr, C2684p[] c2684pArr2, int[] iArr) {
        for (int i10 = 0; i10 < iArr.length; i10++) {
            c2684pArr[iArr[i10]] = c2684pArr2[i10];
        }
    }

    /* renamed from: b */
    public static C1609b m6459b(C2671c c2671c, Map<EnumC2673e, ?> map, boolean z10) {
        C3965b m10875a = c2671c.m10875a();
        List<C2684p[]> m6460c = m6460c(z10, m10875a);
        for (int i10 = 0; m6460c.isEmpty() && i10 < 3; i10++) {
            m10875a = m10875a.clone();
            if (i10 != 1) {
                m10875a.m15042o();
            } else {
                m10875a.m15043p();
            }
            m6460c = m6460c(z10, m10875a);
        }
        return new C1609b(m10875a, m6460c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001d, code lost:
    
        if (r5 != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        r4 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0028, code lost:
    
        if (r4.hasNext() == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
    
        r5 = (p129ia.C2684p[]) r4.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
    
        if (r5[1] == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
    
        r3 = (int) java.lang.Math.max(r3, r5[1].m10909d());
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0042, code lost:
    
        if (r5[3] == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0044, code lost:
    
        r3 = java.lang.Math.max(r3, (int) r5[3].m10909d());
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.List<p129ia.C2684p[]> m6460c(boolean r8, p211oa.C3965b r9) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 1
            r2 = 0
            r3 = r2
            r4 = r3
        L9:
            r5 = r4
        La:
            int r6 = r9.m15038k()
            if (r3 >= r6) goto L7b
            ia.p[] r4 = m6463f(r9, r3, r4)
            r6 = r4[r2]
            if (r6 != 0) goto L54
            r6 = 3
            r7 = r4[r6]
            if (r7 != 0) goto L54
            if (r5 != 0) goto L20
            goto L7b
        L20:
            java.util.Iterator r4 = r0.iterator()
        L24:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L50
            java.lang.Object r5 = r4.next()
            ia.p[] r5 = (p129ia.C2684p[]) r5
            r7 = r5[r1]
            if (r7 == 0) goto L40
            float r3 = (float) r3
            r7 = r5[r1]
            float r7 = r7.m10909d()
            float r3 = java.lang.Math.max(r3, r7)
            int r3 = (int) r3
        L40:
            r7 = r5[r6]
            if (r7 == 0) goto L24
            r5 = r5[r6]
            float r5 = r5.m10909d()
            int r5 = (int) r5
            int r3 = java.lang.Math.max(r3, r5)
            goto L24
        L50:
            int r3 = r3 + 5
            r4 = r2
            goto L9
        L54:
            r0.add(r4)
            if (r8 != 0) goto L5a
            goto L7b
        L5a:
            r3 = 2
            r5 = r4[r3]
            if (r5 == 0) goto L69
            r5 = r4[r3]
            float r5 = r5.m10908c()
            int r5 = (int) r5
            r3 = r4[r3]
            goto L73
        L69:
            r3 = 4
            r5 = r4[r3]
            float r5 = r5.m10908c()
            int r5 = (int) r5
            r3 = r4[r3]
        L73:
            float r3 = r3.m10909d()
            int r3 = (int) r3
            r4 = r5
            r5 = r1
            goto La
        L7b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p053db.C1608a.m6460c(boolean, oa.b):java.util.List");
    }

    /* renamed from: d */
    public static int[] m6461d(C3965b c3965b, int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        Arrays.fill(iArr2, 0, iArr2.length, 0);
        int i13 = 0;
        while (c3965b.m15035g(i10, i11) && i10 > 0) {
            int i14 = i13 + 1;
            if (i13 >= 3) {
                break;
            }
            i10--;
            i13 = i14;
        }
        int length = iArr.length;
        int i15 = i10;
        int i16 = 0;
        boolean z10 = false;
        while (i10 < i12) {
            if (c3965b.m15035g(i10, i11) != z10) {
                iArr2[i16] = iArr2[i16] + 1;
            } else {
                if (i16 != length - 1) {
                    i16++;
                } else {
                    if (m6464g(iArr2, iArr) < 0.42f) {
                        return new int[]{i15, i10};
                    }
                    i15 += iArr2[0] + iArr2[1];
                    int i17 = i16 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i17);
                    iArr2[i17] = 0;
                    iArr2[i16] = 0;
                    i16--;
                }
                iArr2[i16] = 1;
                z10 = !z10;
            }
            i10++;
        }
        if (i16 != length - 1 || m6464g(iArr2, iArr) >= 0.42f) {
            return null;
        }
        return new int[]{i15, i10 - 1};
    }

    /* renamed from: e */
    public static C2684p[] m6462e(C3965b c3965b, int i10, int i11, int i12, int i13, int[] iArr) {
        boolean z10;
        int i14;
        int i15;
        C2684p[] c2684pArr = new C2684p[4];
        int[] iArr2 = new int[iArr.length];
        int i16 = i12;
        while (true) {
            if (i16 >= i10) {
                z10 = false;
                break;
            }
            int[] m6461d = m6461d(c3965b, i13, i16, i11, iArr, iArr2);
            if (m6461d != null) {
                int i17 = i16;
                int[] iArr3 = m6461d;
                int i18 = i17;
                while (true) {
                    if (i18 <= 0) {
                        i15 = i18;
                        break;
                    }
                    int i19 = i18 - 1;
                    int[] m6461d2 = m6461d(c3965b, i13, i19, i11, iArr, iArr2);
                    if (m6461d2 == null) {
                        i15 = i19 + 1;
                        break;
                    }
                    iArr3 = m6461d2;
                    i18 = i19;
                }
                float f10 = i15;
                c2684pArr[0] = new C2684p(iArr3[0], f10);
                c2684pArr[1] = new C2684p(iArr3[1], f10);
                z10 = true;
                i16 = i15;
            } else {
                i16 += 5;
            }
        }
        int i20 = i16 + 1;
        if (z10) {
            int[] iArr4 = {(int) c2684pArr[0].m10908c(), (int) c2684pArr[1].m10908c()};
            int i21 = i20;
            int i22 = 0;
            while (true) {
                if (i21 >= i10) {
                    i14 = i22;
                    break;
                }
                i14 = i22;
                int[] m6461d3 = m6461d(c3965b, iArr4[0], i21, i11, iArr, iArr2);
                if (m6461d3 != null && Math.abs(iArr4[0] - m6461d3[0]) < 5 && Math.abs(iArr4[1] - m6461d3[1]) < 5) {
                    iArr4 = m6461d3;
                    i22 = 0;
                } else {
                    if (i14 > 25) {
                        break;
                    }
                    i22 = i14 + 1;
                }
                i21++;
            }
            i20 = i21 - (i14 + 1);
            float f11 = i20;
            c2684pArr[2] = new C2684p(iArr4[0], f11);
            c2684pArr[3] = new C2684p(iArr4[1], f11);
        }
        if (i20 - i16 < 10) {
            Arrays.fill(c2684pArr, (Object) null);
        }
        return c2684pArr;
    }

    /* renamed from: f */
    public static C2684p[] m6463f(C3965b c3965b, int i10, int i11) {
        int m15038k = c3965b.m15038k();
        int m15041n = c3965b.m15041n();
        C2684p[] c2684pArr = new C2684p[8];
        m6458a(c2684pArr, m6462e(c3965b, m15038k, m15041n, i10, i11, f5945c), f5943a);
        if (c2684pArr[4] != null) {
            i11 = (int) c2684pArr[4].m10908c();
            i10 = (int) c2684pArr[4].m10909d();
        }
        m6458a(c2684pArr, m6462e(c3965b, m15038k, m15041n, i10, i11, f5946d), f5944b);
        return c2684pArr;
    }

    /* renamed from: g */
    public static float m6464g(int[] iArr, int[] iArr2) {
        int length = iArr.length;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            i10 += iArr[i12];
            i11 += iArr2[i12];
        }
        if (i10 < i11) {
            return Float.POSITIVE_INFINITY;
        }
        float f10 = i10;
        float f11 = f10 / i11;
        float f12 = 0.8f * f11;
        float f13 = 0.0f;
        for (int i13 = 0; i13 < length; i13++) {
            float f14 = iArr2[i13] * f11;
            float f15 = iArr[i13];
            float f16 = f15 > f14 ? f15 - f14 : f14 - f15;
            if (f16 > f12) {
                return Float.POSITIVE_INFINITY;
            }
            f13 += f16;
        }
        return f13 / f10;
    }
}
