package p285u;

/* renamed from: u.c */
/* loaded from: classes.dex */
public class C4773c {

    /* renamed from: a */
    public static final int[] f17768a = new int[0];

    /* renamed from: b */
    public static final long[] f17769b = new long[0];

    /* renamed from: c */
    public static final Object[] f17770c = new Object[0];

    /* renamed from: a */
    public static int m18724a(int[] iArr, int i10, int i11) {
        int i12 = i10 - 1;
        int i13 = 0;
        while (i13 <= i12) {
            int i14 = (i13 + i12) >>> 1;
            int i15 = iArr[i14];
            if (i15 < i11) {
                i13 = i14 + 1;
            } else {
                if (i15 <= i11) {
                    return i14;
                }
                i12 = i14 - 1;
            }
        }
        return ~i13;
    }

    /* renamed from: b */
    public static int m18725b(long[] jArr, int i10, long j10) {
        int i11 = i10 - 1;
        int i12 = 0;
        while (i12 <= i11) {
            int i13 = (i12 + i11) >>> 1;
            long j11 = jArr[i13];
            if (j11 < j10) {
                i12 = i13 + 1;
            } else {
                if (j11 <= j10) {
                    return i13;
                }
                i11 = i13 - 1;
            }
        }
        return ~i12;
    }

    /* renamed from: c */
    public static boolean m18726c(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: d */
    public static int m18727d(int i10) {
        for (int i11 = 4; i11 < 32; i11++) {
            int i12 = (1 << i11) - 12;
            if (i10 <= i12) {
                return i12;
            }
        }
        return i10;
    }

    /* renamed from: e */
    public static int m18728e(int i10) {
        return m18727d(i10 * 4) / 4;
    }

    /* renamed from: f */
    public static int m18729f(int i10) {
        return m18727d(i10 * 8) / 8;
    }
}
