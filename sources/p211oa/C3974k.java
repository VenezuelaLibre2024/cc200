package p211oa;

import java.lang.reflect.Array;
import p129ia.AbstractC2670b;
import p129ia.AbstractC2676h;

/* renamed from: oa.k */
/* loaded from: classes.dex */
public final class C3974k extends C3972i {

    /* renamed from: e */
    public C3965b f14331e;

    public C3974k(AbstractC2676h abstractC2676h) {
        super(abstractC2676h);
    }

    /* renamed from: i */
    public static int[][] m15085i(byte[] bArr, int i10, int i11, int i12, int i13) {
        char c10;
        int i14 = 8;
        int i15 = i13 - 8;
        int i16 = i12 - 8;
        char c11 = 2;
        boolean z10 = true;
        int i17 = 0;
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) int.class, i11, i10);
        int i18 = 0;
        while (i18 < i11) {
            int i19 = i18 << 3;
            if (i19 > i15) {
                i19 = i15;
            }
            int i20 = i17;
            while (i20 < i10) {
                int i21 = i20 << 3;
                if (i21 > i16) {
                    i21 = i16;
                }
                int i22 = (i19 * i12) + i21;
                int i23 = i17;
                int i24 = i23;
                int i25 = i24;
                int i26 = 255;
                while (i23 < i14) {
                    int i27 = i25;
                    int i28 = 0;
                    while (i28 < i14) {
                        int i29 = bArr[i22 + i28] & 255;
                        i24 += i29;
                        if (i29 < i26) {
                            i26 = i29;
                        }
                        if (i29 > i27) {
                            i27 = i29;
                        }
                        i28++;
                        i14 = 8;
                    }
                    if (i27 - i26 <= 24) {
                        i23++;
                        i22 += i12;
                        i25 = i27;
                        z10 = true;
                        i14 = 8;
                    }
                    while (true) {
                        i23++;
                        i22 += i12;
                        if (i23 < 8) {
                            int i30 = 0;
                            for (int i31 = 8; i30 < i31; i31 = 8) {
                                i24 += bArr[i22 + i30] & 255;
                                i30++;
                            }
                        }
                    }
                    i23++;
                    i22 += i12;
                    i25 = i27;
                    z10 = true;
                    i14 = 8;
                }
                boolean z11 = z10;
                int i32 = i24 >> 6;
                if (i25 - i26 <= 24) {
                    i32 = i26 / 2;
                    if (i18 > 0 && i20 > 0) {
                        int i33 = i18 - 1;
                        int i34 = i20 - 1;
                        c10 = 2;
                        int i35 = ((iArr[i33][i20] + (iArr[i18][i34] * 2)) + iArr[i33][i34]) / 4;
                        if (i26 < i35) {
                            i32 = i35;
                        }
                        iArr[i18][i20] = i32;
                        i20++;
                        z10 = z11;
                        c11 = c10;
                        i14 = 8;
                        i17 = 0;
                    }
                }
                c10 = 2;
                iArr[i18][i20] = i32;
                i20++;
                z10 = z11;
                c11 = c10;
                i14 = 8;
                i17 = 0;
            }
            i18++;
            i14 = 8;
            i17 = 0;
        }
        return iArr;
    }

    /* renamed from: j */
    public static void m15086j(byte[] bArr, int i10, int i11, int i12, int i13, int[][] iArr, C3965b c3965b) {
        int i14 = i13 - 8;
        int i15 = i12 - 8;
        for (int i16 = 0; i16 < i11; i16++) {
            int i17 = i16 << 3;
            int i18 = i17 > i14 ? i14 : i17;
            int m15087k = m15087k(i16, i11 - 3);
            for (int i19 = 0; i19 < i10; i19++) {
                int i20 = i19 << 3;
                int i21 = i20 > i15 ? i15 : i20;
                int m15087k2 = m15087k(i19, i10 - 3);
                int i22 = 0;
                for (int i23 = -2; i23 <= 2; i23++) {
                    int[] iArr2 = iArr[m15087k + i23];
                    i22 += iArr2[m15087k2 - 2] + iArr2[m15087k2 - 1] + iArr2[m15087k2] + iArr2[m15087k2 + 1] + iArr2[2 + m15087k2];
                }
                m15088l(bArr, i21, i18, i22 / 25, i12, c3965b);
            }
        }
    }

    /* renamed from: k */
    public static int m15087k(int i10, int i11) {
        if (i10 < 2) {
            return 2;
        }
        return Math.min(i10, i11);
    }

    /* renamed from: l */
    public static void m15088l(byte[] bArr, int i10, int i11, int i12, int i13, C3965b c3965b) {
        int i14 = (i11 * i13) + i10;
        int i15 = 0;
        while (i15 < 8) {
            for (int i16 = 0; i16 < 8; i16++) {
                if ((bArr[i14 + i16] & 255) <= i12) {
                    c3965b.m15044q(i10 + i16, i11 + i15);
                }
            }
            i15++;
            i14 += i13;
        }
    }

    @Override // p129ia.AbstractC2670b
    /* renamed from: a */
    public AbstractC2670b mo10869a(AbstractC2676h abstractC2676h) {
        return new C3974k(abstractC2676h);
    }

    @Override // p211oa.C3972i, p129ia.AbstractC2670b
    /* renamed from: b */
    public C3965b mo10870b() {
        C3965b mo10870b;
        C3965b c3965b = this.f14331e;
        if (c3965b != null) {
            return c3965b;
        }
        AbstractC2676h m10873e = m10873e();
        int m10891d = m10873e.m10891d();
        int m10890a = m10873e.m10890a();
        if (m10891d < 40 || m10890a < 40) {
            mo10870b = super.mo10870b();
        } else {
            byte[] mo10885b = m10873e.mo10885b();
            int i10 = m10891d >> 3;
            if ((m10891d & 7) != 0) {
                i10++;
            }
            int i11 = i10;
            int i12 = m10890a >> 3;
            if ((m10890a & 7) != 0) {
                i12++;
            }
            int i13 = i12;
            int[][] m15085i = m15085i(mo10885b, i11, i13, m10891d, m10890a);
            mo10870b = new C3965b(m10891d, m10890a);
            m15086j(mo10885b, i11, i13, m10891d, m10890a, m15085i, mo10870b);
        }
        this.f14331e = mo10870b;
        return this.f14331e;
    }
}
