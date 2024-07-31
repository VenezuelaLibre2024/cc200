package bf;

import java.util.Arrays;

/* renamed from: bf.r */
/* loaded from: classes2.dex */
public final class C0572r extends C0560f {

    /* renamed from: m */
    public final transient byte[][] f2549m;

    /* renamed from: n */
    public final transient int[] f2550n;

    public C0572r(C0557c c0557c, int i10) {
        super(null);
        C0576v.m2921b(c0557c.f2508i, 0L, i10);
        C0570p c0570p = c0557c.f2507h;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10) {
            int i14 = c0570p.f2542c;
            int i15 = c0570p.f2541b;
            if (i14 == i15) {
                throw new AssertionError("s.limit == s.pos");
            }
            i12 += i14 - i15;
            i13++;
            c0570p = c0570p.f2545f;
        }
        this.f2549m = new byte[i13];
        this.f2550n = new int[i13 * 2];
        C0570p c0570p2 = c0557c.f2507h;
        int i16 = 0;
        while (i11 < i10) {
            byte[][] bArr = this.f2549m;
            bArr[i16] = c0570p2.f2540a;
            int i17 = c0570p2.f2542c;
            int i18 = c0570p2.f2541b;
            i11 += i17 - i18;
            if (i11 > i10) {
                i11 = i10;
            }
            int[] iArr = this.f2550n;
            iArr[i16] = i11;
            iArr[bArr.length + i16] = i18;
            c0570p2.f2543d = true;
            i16++;
            c0570p2 = c0570p2.f2545f;
        }
    }

    @Override // bf.C0560f
    /* renamed from: A */
    public void mo2861A(C0557c c0557c) {
        int length = this.f2549m.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int[] iArr = this.f2550n;
            int i12 = iArr[length + i10];
            int i13 = iArr[i10];
            C0570p c0570p = new C0570p(this.f2549m[i10], i12, (i12 + i13) - i11, true, false);
            C0570p c0570p2 = c0557c.f2507h;
            if (c0570p2 == null) {
                c0570p.f2546g = c0570p;
                c0570p.f2545f = c0570p;
                c0557c.f2507h = c0570p;
            } else {
                c0570p2.f2546g.m2911c(c0570p);
            }
            i10++;
            i11 = i13;
        }
        c0557c.f2508i += i11;
    }

    /* renamed from: B */
    public final int m2917B(int i10) {
        int binarySearch = Arrays.binarySearch(this.f2550n, 0, this.f2549m.length, i10 + 1);
        return binarySearch >= 0 ? binarySearch : ~binarySearch;
    }

    /* renamed from: C */
    public final C0560f m2918C() {
        return new C0560f(mo2875y());
    }

    @Override // bf.C0560f
    /* renamed from: b */
    public String mo2862b() {
        return m2918C().mo2862b();
    }

    @Override // bf.C0560f
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0560f) {
            C0560f c0560f = (C0560f) obj;
            if (c0560f.mo2871u() == mo2871u() && mo2867q(0, c0560f, 0, mo2871u())) {
                return true;
            }
        }
        return false;
    }

    @Override // bf.C0560f
    public int hashCode() {
        int i10 = this.f2512i;
        if (i10 != 0) {
            return i10;
        }
        int length = this.f2549m.length;
        int i11 = 0;
        int i12 = 1;
        int i13 = 0;
        while (i11 < length) {
            byte[] bArr = this.f2549m[i11];
            int[] iArr = this.f2550n;
            int i14 = iArr[length + i11];
            int i15 = iArr[i11];
            int i16 = (i15 - i13) + i14;
            while (i14 < i16) {
                i12 = (i12 * 31) + bArr[i14];
                i14++;
            }
            i11++;
            i13 = i15;
        }
        this.f2512i = i12;
        return i12;
    }

    @Override // bf.C0560f
    /* renamed from: n */
    public byte mo2865n(int i10) {
        C0576v.m2921b(this.f2550n[this.f2549m.length - 1], i10, 1L);
        int m2917B = m2917B(i10);
        int i11 = m2917B == 0 ? 0 : this.f2550n[m2917B - 1];
        int[] iArr = this.f2550n;
        byte[][] bArr = this.f2549m;
        return bArr[m2917B][(i10 - i11) + iArr[bArr.length + m2917B]];
    }

    @Override // bf.C0560f
    /* renamed from: o */
    public String mo2866o() {
        return m2918C().mo2866o();
    }

    @Override // bf.C0560f
    /* renamed from: q */
    public boolean mo2867q(int i10, C0560f c0560f, int i11, int i12) {
        if (i10 < 0 || i10 > mo2871u() - i12) {
            return false;
        }
        int m2917B = m2917B(i10);
        while (i12 > 0) {
            int i13 = m2917B == 0 ? 0 : this.f2550n[m2917B - 1];
            int min = Math.min(i12, ((this.f2550n[m2917B] - i13) + i13) - i10);
            int[] iArr = this.f2550n;
            byte[][] bArr = this.f2549m;
            if (!c0560f.mo2868r(i11, bArr[m2917B], (i10 - i13) + iArr[bArr.length + m2917B], min)) {
                return false;
            }
            i10 += min;
            i11 += min;
            i12 -= min;
            m2917B++;
        }
        return true;
    }

    @Override // bf.C0560f
    /* renamed from: r */
    public boolean mo2868r(int i10, byte[] bArr, int i11, int i12) {
        if (i10 < 0 || i10 > mo2871u() - i12 || i11 < 0 || i11 > bArr.length - i12) {
            return false;
        }
        int m2917B = m2917B(i10);
        while (i12 > 0) {
            int i13 = m2917B == 0 ? 0 : this.f2550n[m2917B - 1];
            int min = Math.min(i12, ((this.f2550n[m2917B] - i13) + i13) - i10);
            int[] iArr = this.f2550n;
            byte[][] bArr2 = this.f2549m;
            if (!C0576v.m2920a(bArr2[m2917B], (i10 - i13) + iArr[bArr2.length + m2917B], bArr, i11, min)) {
                return false;
            }
            i10 += min;
            i11 += min;
            i12 -= min;
            m2917B++;
        }
        return true;
    }

    @Override // bf.C0560f
    /* renamed from: s */
    public C0560f mo2869s() {
        return m2918C().mo2869s();
    }

    @Override // bf.C0560f
    /* renamed from: t */
    public C0560f mo2870t() {
        return m2918C().mo2870t();
    }

    @Override // bf.C0560f
    public String toString() {
        return m2918C().toString();
    }

    @Override // bf.C0560f
    /* renamed from: u */
    public int mo2871u() {
        return this.f2550n[this.f2549m.length - 1];
    }

    @Override // bf.C0560f
    /* renamed from: w */
    public C0560f mo2873w(int i10, int i11) {
        return m2918C().mo2873w(i10, i11);
    }

    @Override // bf.C0560f
    /* renamed from: x */
    public C0560f mo2874x() {
        return m2918C().mo2874x();
    }

    @Override // bf.C0560f
    /* renamed from: y */
    public byte[] mo2875y() {
        int[] iArr = this.f2550n;
        byte[][] bArr = this.f2549m;
        byte[] bArr2 = new byte[iArr[bArr.length - 1]];
        int length = bArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int[] iArr2 = this.f2550n;
            int i12 = iArr2[length + i10];
            int i13 = iArr2[i10];
            System.arraycopy(this.f2549m[i10], i12, bArr2, i11, i13 - i11);
            i10++;
            i11 = i13;
        }
        return bArr2;
    }

    @Override // bf.C0560f
    /* renamed from: z */
    public String mo2876z() {
        return m2918C().mo2876z();
    }
}
