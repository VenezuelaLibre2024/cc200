package p084fb;

import p079f6.C1841a;

/* renamed from: fb.g */
/* loaded from: classes.dex */
public final class C1894g {

    /* renamed from: c */
    public static final int[][] f7154c = {new int[]{21522, 0}, new int[]{20773, 1}, new int[]{24188, 2}, new int[]{23371, 3}, new int[]{17913, 4}, new int[]{16590, 5}, new int[]{20375, 6}, new int[]{19104, 7}, new int[]{30660, 8}, new int[]{29427, 9}, new int[]{32170, 10}, new int[]{30877, 11}, new int[]{26159, 12}, new int[]{25368, 13}, new int[]{27713, 14}, new int[]{26998, 15}, new int[]{5769, 16}, new int[]{5054, 17}, new int[]{7399, 18}, new int[]{6608, 19}, new int[]{1890, 20}, new int[]{597, 21}, new int[]{3340, 22}, new int[]{2107, 23}, new int[]{13663, 24}, new int[]{12392, 25}, new int[]{16177, 26}, new int[]{14854, 27}, new int[]{9396, 28}, new int[]{8579, 29}, new int[]{11994, 30}, new int[]{11245, 31}};

    /* renamed from: a */
    public final EnumC1893f f7155a;

    /* renamed from: b */
    public final byte f7156b;

    public C1894g(int i10) {
        this.f7155a = EnumC1893f.m7742b((i10 >> 3) & 3);
        this.f7156b = (byte) (i10 & 7);
    }

    /* renamed from: a */
    public static C1894g m7743a(int i10, int i11) {
        C1894g m7744b = m7744b(i10, i11);
        return m7744b != null ? m7744b : m7744b(i10 ^ 21522, i11 ^ 21522);
    }

    /* renamed from: b */
    public static C1894g m7744b(int i10, int i11) {
        int m7745e;
        int[][] iArr = f7154c;
        int i12 = C1841a.e.API_PRIORITY_OTHER;
        int i13 = 0;
        for (int[] iArr2 : iArr) {
            int i14 = iArr2[0];
            if (i14 == i10 || i14 == i11) {
                return new C1894g(iArr2[1]);
            }
            int m7745e2 = m7745e(i10, i14);
            if (m7745e2 < i12) {
                i13 = iArr2[1];
                i12 = m7745e2;
            }
            if (i10 != i11 && (m7745e = m7745e(i11, i14)) < i12) {
                i13 = iArr2[1];
                i12 = m7745e;
            }
        }
        if (i12 <= 3) {
            return new C1894g(i13);
        }
        return null;
    }

    /* renamed from: e */
    public static int m7745e(int i10, int i11) {
        return Integer.bitCount(i10 ^ i11);
    }

    /* renamed from: c */
    public byte m7746c() {
        return this.f7156b;
    }

    /* renamed from: d */
    public EnumC1893f m7747d() {
        return this.f7155a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1894g)) {
            return false;
        }
        C1894g c1894g = (C1894g) obj;
        return this.f7155a == c1894g.f7155a && this.f7156b == c1894g.f7156b;
    }

    public int hashCode() {
        return (this.f7155a.ordinal() << 3) | this.f7156b;
    }
}
