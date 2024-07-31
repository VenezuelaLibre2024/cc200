package p211oa;

import java.util.Arrays;

/* renamed from: oa.a */
/* loaded from: classes.dex */
public final class C3964a implements Cloneable {

    /* renamed from: j */
    public static final int[] f14274j = new int[0];

    /* renamed from: h */
    public int[] f14275h;

    /* renamed from: i */
    public int f14276i;

    public C3964a() {
        this.f14276i = 0;
        this.f14275h = f14274j;
    }

    public C3964a(int i10) {
        this.f14276i = i10;
        this.f14275h = m15019l(i10);
    }

    public C3964a(int[] iArr, int i10) {
        this.f14275h = iArr;
        this.f14276i = i10;
    }

    /* renamed from: l */
    public static int[] m15019l(int i10) {
        return new int[(i10 + 31) / 32];
    }

    /* renamed from: b */
    public void m15020b() {
        int length = this.f14275h.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.f14275h[i10] = 0;
        }
    }

    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public C3964a clone() {
        return new C3964a((int[]) this.f14275h.clone(), this.f14276i);
    }

    /* renamed from: e */
    public boolean m15022e(int i10) {
        return ((1 << (i10 & 31)) & this.f14275h[i10 / 32]) != 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C3964a)) {
            return false;
        }
        C3964a c3964a = (C3964a) obj;
        return this.f14276i == c3964a.f14276i && Arrays.equals(this.f14275h, c3964a.f14275h);
    }

    /* renamed from: f */
    public int[] m15023f() {
        return this.f14275h;
    }

    /* renamed from: g */
    public int m15024g(int i10) {
        int i11 = this.f14276i;
        if (i10 >= i11) {
            return i11;
        }
        int i12 = i10 / 32;
        int i13 = (-(1 << (i10 & 31))) & this.f14275h[i12];
        while (i13 == 0) {
            i12++;
            int[] iArr = this.f14275h;
            if (i12 == iArr.length) {
                return this.f14276i;
            }
            i13 = iArr[i12];
        }
        return Math.min((i12 * 32) + Integer.numberOfTrailingZeros(i13), this.f14276i);
    }

    /* renamed from: h */
    public int m15025h(int i10) {
        int i11 = this.f14276i;
        if (i10 >= i11) {
            return i11;
        }
        int i12 = i10 / 32;
        int i13 = (-(1 << (i10 & 31))) & (~this.f14275h[i12]);
        while (i13 == 0) {
            i12++;
            int[] iArr = this.f14275h;
            if (i12 == iArr.length) {
                return this.f14276i;
            }
            i13 = ~iArr[i12];
        }
        return Math.min((i12 * 32) + Integer.numberOfTrailingZeros(i13), this.f14276i);
    }

    public int hashCode() {
        return (this.f14276i * 31) + Arrays.hashCode(this.f14275h);
    }

    /* renamed from: i */
    public int m15026i() {
        return this.f14276i;
    }

    /* renamed from: k */
    public boolean m15027k(int i10, int i11, boolean z10) {
        if (i11 < i10 || i10 < 0 || i11 > this.f14276i) {
            throw new IllegalArgumentException();
        }
        if (i11 == i10) {
            return true;
        }
        int i12 = i11 - 1;
        int i13 = i10 / 32;
        int i14 = i12 / 32;
        int i15 = i13;
        while (i15 <= i14) {
            int i16 = (2 << (i15 >= i14 ? 31 & i12 : 31)) - (1 << (i15 > i13 ? 0 : i10 & 31));
            int i17 = this.f14275h[i15] & i16;
            if (!z10) {
                i16 = 0;
            }
            if (i17 != i16) {
                return false;
            }
            i15++;
        }
        return true;
    }

    /* renamed from: m */
    public void m15028m() {
        int[] iArr = new int[this.f14275h.length];
        int i10 = (this.f14276i - 1) / 32;
        int i11 = i10 + 1;
        for (int i12 = 0; i12 < i11; i12++) {
            iArr[i10 - i12] = Integer.reverse(this.f14275h[i12]);
        }
        int i13 = this.f14276i;
        int i14 = i11 * 32;
        if (i13 != i14) {
            int i15 = i14 - i13;
            int i16 = iArr[0] >>> i15;
            for (int i17 = 1; i17 < i11; i17++) {
                int i18 = iArr[i17];
                iArr[i17 - 1] = i16 | (i18 << (32 - i15));
                i16 = i18 >>> i15;
            }
            iArr[i11 - 1] = i16;
        }
        this.f14275h = iArr;
    }

    /* renamed from: n */
    public void m15029n(int i10) {
        int[] iArr = this.f14275h;
        int i11 = i10 / 32;
        iArr[i11] = (1 << (i10 & 31)) | iArr[i11];
    }

    /* renamed from: o */
    public void m15030o(int i10, int i11) {
        this.f14275h[i10 / 32] = i11;
    }

    public String toString() {
        int i10 = this.f14276i;
        StringBuilder sb2 = new StringBuilder(i10 + (i10 / 8) + 1);
        for (int i11 = 0; i11 < this.f14276i; i11++) {
            if ((i11 & 7) == 0) {
                sb2.append(' ');
            }
            sb2.append(m15022e(i11) ? 'X' : '.');
        }
        return sb2.toString();
    }
}
