package p211oa;

import java.util.Arrays;

/* renamed from: oa.b */
/* loaded from: classes.dex */
public final class C3965b implements Cloneable {

    /* renamed from: h */
    public int f14277h;

    /* renamed from: i */
    public int f14278i;

    /* renamed from: j */
    public int f14279j;

    /* renamed from: k */
    public int[] f14280k;

    public C3965b(int i10) {
        this(i10, i10);
    }

    public C3965b(int i10, int i11) {
        if (i10 < 1 || i11 < 1) {
            throw new IllegalArgumentException("Both dimensions must be greater than 0");
        }
        this.f14277h = i10;
        this.f14278i = i11;
        int i12 = (i10 + 31) / 32;
        this.f14279j = i12;
        this.f14280k = new int[i12 * i11];
    }

    public C3965b(int i10, int i11, int i12, int[] iArr) {
        this.f14277h = i10;
        this.f14278i = i11;
        this.f14279j = i12;
        this.f14280k = iArr;
    }

    /* renamed from: b */
    public final String m15031b(String str, String str2, String str3) {
        StringBuilder sb2 = new StringBuilder(this.f14278i * (this.f14277h + 1));
        for (int i10 = 0; i10 < this.f14278i; i10++) {
            for (int i11 = 0; i11 < this.f14277h; i11++) {
                sb2.append(m15035g(i11, i10) ? str : str2);
            }
            sb2.append(str3);
        }
        return sb2.toString();
    }

    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public C3965b clone() {
        return new C3965b(this.f14277h, this.f14278i, this.f14279j, (int[]) this.f14280k.clone());
    }

    /* renamed from: e */
    public void m15033e() {
        int length = this.f14280k.length;
        for (int i10 = 0; i10 < length; i10++) {
            int[] iArr = this.f14280k;
            iArr[i10] = ~iArr[i10];
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C3965b)) {
            return false;
        }
        C3965b c3965b = (C3965b) obj;
        return this.f14277h == c3965b.f14277h && this.f14278i == c3965b.f14278i && this.f14279j == c3965b.f14279j && Arrays.equals(this.f14280k, c3965b.f14280k);
    }

    /* renamed from: f */
    public void m15034f(int i10, int i11) {
        int i12 = (i11 * this.f14279j) + (i10 / 32);
        int[] iArr = this.f14280k;
        iArr[i12] = (1 << (i10 & 31)) ^ iArr[i12];
    }

    /* renamed from: g */
    public boolean m15035g(int i10, int i11) {
        return ((this.f14280k[(i11 * this.f14279j) + (i10 / 32)] >>> (i10 & 31)) & 1) != 0;
    }

    /* renamed from: h */
    public int[] m15036h() {
        int length = this.f14280k.length - 1;
        while (length >= 0 && this.f14280k[length] == 0) {
            length--;
        }
        if (length < 0) {
            return null;
        }
        int i10 = this.f14279j;
        int i11 = length / i10;
        int i12 = (length % i10) * 32;
        int i13 = 31;
        while ((this.f14280k[length] >>> i13) == 0) {
            i13--;
        }
        return new int[]{i12 + i13, i11};
    }

    public int hashCode() {
        int i10 = this.f14277h;
        return (((((((i10 * 31) + i10) * 31) + this.f14278i) * 31) + this.f14279j) * 31) + Arrays.hashCode(this.f14280k);
    }

    /* renamed from: i */
    public int[] m15037i() {
        int i10 = this.f14277h;
        int i11 = this.f14278i;
        int i12 = -1;
        int i13 = -1;
        for (int i14 = 0; i14 < this.f14278i; i14++) {
            int i15 = 0;
            while (true) {
                int i16 = this.f14279j;
                if (i15 < i16) {
                    int i17 = this.f14280k[(i16 * i14) + i15];
                    if (i17 != 0) {
                        if (i14 < i11) {
                            i11 = i14;
                        }
                        if (i14 > i13) {
                            i13 = i14;
                        }
                        int i18 = i15 * 32;
                        if (i18 < i10) {
                            int i19 = 0;
                            while ((i17 << (31 - i19)) == 0) {
                                i19++;
                            }
                            int i20 = i19 + i18;
                            if (i20 < i10) {
                                i10 = i20;
                            }
                        }
                        if (i18 + 31 > i12) {
                            int i21 = 31;
                            while ((i17 >>> i21) == 0) {
                                i21--;
                            }
                            int i22 = i18 + i21;
                            if (i22 > i12) {
                                i12 = i22;
                            }
                        }
                    }
                    i15++;
                }
            }
        }
        if (i12 < i10 || i13 < i11) {
            return null;
        }
        return new int[]{i10, i11, (i12 - i10) + 1, (i13 - i11) + 1};
    }

    /* renamed from: k */
    public int m15038k() {
        return this.f14278i;
    }

    /* renamed from: l */
    public C3964a m15039l(int i10, C3964a c3964a) {
        if (c3964a == null || c3964a.m15026i() < this.f14277h) {
            c3964a = new C3964a(this.f14277h);
        } else {
            c3964a.m15020b();
        }
        int i11 = i10 * this.f14279j;
        for (int i12 = 0; i12 < this.f14279j; i12++) {
            c3964a.m15030o(i12 * 32, this.f14280k[i11 + i12]);
        }
        return c3964a;
    }

    /* renamed from: m */
    public int[] m15040m() {
        int[] iArr;
        int i10 = 0;
        while (true) {
            iArr = this.f14280k;
            if (i10 >= iArr.length || iArr[i10] != 0) {
                break;
            }
            i10++;
        }
        if (i10 == iArr.length) {
            return null;
        }
        int i11 = this.f14279j;
        int i12 = i10 / i11;
        int i13 = (i10 % i11) * 32;
        int i14 = iArr[i10];
        int i15 = 0;
        while ((i14 << (31 - i15)) == 0) {
            i15++;
        }
        return new int[]{i13 + i15, i12};
    }

    /* renamed from: n */
    public int m15041n() {
        return this.f14277h;
    }

    /* renamed from: o */
    public void m15042o() {
        C3964a c3964a = new C3964a(this.f14277h);
        C3964a c3964a2 = new C3964a(this.f14277h);
        int i10 = (this.f14278i + 1) / 2;
        for (int i11 = 0; i11 < i10; i11++) {
            c3964a = m15039l(i11, c3964a);
            int i12 = (this.f14278i - 1) - i11;
            c3964a2 = m15039l(i12, c3964a2);
            c3964a.m15028m();
            c3964a2.m15028m();
            m15046s(i11, c3964a2);
            m15046s(i12, c3964a);
        }
    }

    /* renamed from: p */
    public void m15043p() {
        int i10 = this.f14278i;
        int i11 = this.f14277h;
        int i12 = (i10 + 31) / 32;
        int[] iArr = new int[i12 * i11];
        for (int i13 = 0; i13 < this.f14278i; i13++) {
            for (int i14 = 0; i14 < this.f14277h; i14++) {
                if (((this.f14280k[(this.f14279j * i13) + (i14 / 32)] >>> (i14 & 31)) & 1) != 0) {
                    int i15 = (((i11 - 1) - i14) * i12) + (i13 / 32);
                    iArr[i15] = (1 << (i13 & 31)) | iArr[i15];
                }
            }
        }
        this.f14277h = i10;
        this.f14278i = i11;
        this.f14279j = i12;
        this.f14280k = iArr;
    }

    /* renamed from: q */
    public void m15044q(int i10, int i11) {
        int i12 = (i11 * this.f14279j) + (i10 / 32);
        int[] iArr = this.f14280k;
        iArr[i12] = (1 << (i10 & 31)) | iArr[i12];
    }

    /* renamed from: r */
    public void m15045r(int i10, int i11, int i12, int i13) {
        if (i11 < 0 || i10 < 0) {
            throw new IllegalArgumentException("Left and top must be nonnegative");
        }
        if (i13 < 1 || i12 < 1) {
            throw new IllegalArgumentException("Height and width must be at least 1");
        }
        int i14 = i12 + i10;
        int i15 = i13 + i11;
        if (i15 > this.f14278i || i14 > this.f14277h) {
            throw new IllegalArgumentException("The region must fit inside the matrix");
        }
        while (i11 < i15) {
            int i16 = this.f14279j * i11;
            for (int i17 = i10; i17 < i14; i17++) {
                int[] iArr = this.f14280k;
                int i18 = (i17 / 32) + i16;
                iArr[i18] = iArr[i18] | (1 << (i17 & 31));
            }
            i11++;
        }
    }

    /* renamed from: s */
    public void m15046s(int i10, C3964a c3964a) {
        int[] m15023f = c3964a.m15023f();
        int[] iArr = this.f14280k;
        int i11 = this.f14279j;
        System.arraycopy(m15023f, 0, iArr, i10 * i11, i11);
    }

    /* renamed from: t */
    public String m15047t(String str, String str2) {
        return m15031b(str, str2, "\n");
    }

    public String toString() {
        return m15047t("X ", "  ");
    }
}
