package p077f4;

import p222p5.C4041n0;

/* renamed from: f4.d */
/* loaded from: classes.dex */
public final class C1823d {

    /* renamed from: f4.d$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        public final long[] f6823a;

        /* renamed from: b */
        public final int[] f6824b;

        /* renamed from: c */
        public final int f6825c;

        /* renamed from: d */
        public final long[] f6826d;

        /* renamed from: e */
        public final int[] f6827e;

        /* renamed from: f */
        public final long f6828f;

        public b(long[] jArr, int[] iArr, int i10, long[] jArr2, int[] iArr2, long j10) {
            this.f6823a = jArr;
            this.f6824b = iArr;
            this.f6825c = i10;
            this.f6826d = jArr2;
            this.f6827e = iArr2;
            this.f6828f = j10;
        }
    }

    /* renamed from: a */
    public static b m7437a(int i10, long[] jArr, int[] iArr, long j10) {
        int i11 = 8192 / i10;
        int i12 = 0;
        for (int i13 : iArr) {
            i12 += C4041n0.m15467l(i13, i11);
        }
        long[] jArr2 = new long[i12];
        int[] iArr2 = new int[i12];
        long[] jArr3 = new long[i12];
        int[] iArr3 = new int[i12];
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        for (int i17 = 0; i17 < iArr.length; i17++) {
            int i18 = iArr[i17];
            long j11 = jArr[i17];
            while (i18 > 0) {
                int min = Math.min(i11, i18);
                jArr2[i15] = j11;
                iArr2[i15] = i10 * min;
                i16 = Math.max(i16, iArr2[i15]);
                jArr3[i15] = i14 * j10;
                iArr3[i15] = 1;
                j11 += iArr2[i15];
                i14 += min;
                i18 -= min;
                i15++;
            }
        }
        return new b(jArr2, iArr2, i16, jArr3, iArr3, j10 * i14);
    }
}
