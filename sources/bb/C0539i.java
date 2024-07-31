package bb;

import java.lang.reflect.Array;
import p013ab.C0083a;
import pa.C4104a;

/* renamed from: bb.i */
/* loaded from: classes.dex */
public final class C0539i {

    /* renamed from: a */
    public static final float[][] f2403a = (float[][]) Array.newInstance((Class<?>) float.class, C0083a.f288b.length, 8);

    static {
        int i10;
        int i11 = 0;
        while (true) {
            int[] iArr = C0083a.f288b;
            if (i11 >= iArr.length) {
                return;
            }
            int i12 = iArr[i11];
            int i13 = i12 & 1;
            int i14 = 0;
            while (i14 < 8) {
                float f10 = 0.0f;
                while (true) {
                    i10 = i12 & 1;
                    if (i10 == i13) {
                        f10 += 1.0f;
                        i12 >>= 1;
                    }
                }
                f2403a[i11][(8 - i14) - 1] = f10 / 17.0f;
                i14++;
                i13 = i10;
            }
            i11++;
        }
    }

    /* renamed from: a */
    public static int m2629a(int[] iArr) {
        long j10 = 0;
        for (int i10 = 0; i10 < iArr.length; i10++) {
            for (int i11 = 0; i11 < iArr[i10]; i11++) {
                int i12 = 1;
                long j11 = j10 << 1;
                if (i10 % 2 != 0) {
                    i12 = 0;
                }
                j10 = j11 | i12;
            }
        }
        return (int) j10;
    }

    /* renamed from: b */
    public static int m2630b(int[] iArr) {
        int m15856d = C4104a.m15856d(iArr);
        float[] fArr = new float[8];
        if (m15856d > 1) {
            for (int i10 = 0; i10 < 8; i10++) {
                fArr[i10] = iArr[i10] / m15856d;
            }
        }
        float f10 = Float.MAX_VALUE;
        int i11 = -1;
        int i12 = 0;
        while (true) {
            float[][] fArr2 = f2403a;
            if (i12 >= fArr2.length) {
                return i11;
            }
            float f11 = 0.0f;
            float[] fArr3 = fArr2[i12];
            for (int i13 = 0; i13 < 8; i13++) {
                float f12 = fArr3[i13] - fArr[i13];
                f11 += f12 * f12;
                if (f11 >= f10) {
                    break;
                }
            }
            if (f11 < f10) {
                i11 = C0083a.f288b[i12];
                f10 = f11;
            }
            i12++;
        }
    }

    /* renamed from: c */
    public static int m2631c(int[] iArr) {
        int m2629a = m2629a(iArr);
        if (C0083a.m356a(m2629a) == -1) {
            return -1;
        }
        return m2629a;
    }

    /* renamed from: d */
    public static int m2632d(int[] iArr) {
        int m2631c = m2631c(m2633e(iArr));
        return m2631c != -1 ? m2631c : m2630b(iArr);
    }

    /* renamed from: e */
    public static int[] m2633e(int[] iArr) {
        float m15856d = C4104a.m15856d(iArr);
        int[] iArr2 = new int[8];
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < 17; i12++) {
            if (iArr[i11] + i10 <= (m15856d / 34.0f) + ((i12 * m15856d) / 17.0f)) {
                i10 += iArr[i11];
                i11++;
            }
            iArr2[i11] = iArr2[i11] + 1;
        }
        return iArr2;
    }
}
