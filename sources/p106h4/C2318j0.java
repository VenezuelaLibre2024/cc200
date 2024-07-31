package p106h4;

import p222p5.C4015a0;

/* renamed from: h4.j0 */
/* loaded from: classes.dex */
public final class C2318j0 {
    /* renamed from: a */
    public static int m9420a(byte[] bArr, int i10, int i11) {
        while (i10 < i11 && bArr[i10] != 71) {
            i10++;
        }
        return i10;
    }

    /* renamed from: b */
    public static boolean m9421b(byte[] bArr, int i10, int i11, int i12) {
        int i13 = 0;
        for (int i14 = -4; i14 <= 4; i14++) {
            int i15 = (i14 * 188) + i12;
            if (i15 < i10 || i15 >= i11 || bArr[i15] != 71) {
                i13 = 0;
            } else {
                i13++;
                if (i13 == 5) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: c */
    public static long m9422c(C4015a0 c4015a0, int i10, int i11) {
        c4015a0.m15223T(i10);
        if (c4015a0.m15226a() < 5) {
            return -9223372036854775807L;
        }
        int m15241p = c4015a0.m15241p();
        if ((8388608 & m15241p) != 0 || ((2096896 & m15241p) >> 8) != i11) {
            return -9223372036854775807L;
        }
        if (((m15241p & 32) != 0) && c4015a0.m15210G() >= 7 && c4015a0.m15226a() >= 7) {
            if ((c4015a0.m15210G() & 16) == 16) {
                byte[] bArr = new byte[6];
                c4015a0.m15237l(bArr, 0, 6);
                return m9423d(bArr);
            }
        }
        return -9223372036854775807L;
    }

    /* renamed from: d */
    public static long m9423d(byte[] bArr) {
        return ((bArr[0] & 255) << 25) | ((bArr[1] & 255) << 17) | ((bArr[2] & 255) << 9) | ((bArr[3] & 255) << 1) | ((255 & bArr[4]) >> 7);
    }
}
