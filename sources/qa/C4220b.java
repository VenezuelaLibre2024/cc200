package qa;

/* renamed from: qa.b */
/* loaded from: classes.dex */
public final class C4220b {

    /* renamed from: a */
    public final C4219a f15209a;

    /* renamed from: b */
    public final int[] f15210b;

    public C4220b(C4219a c4219a, int[] iArr) {
        if (iArr.length == 0) {
            throw new IllegalArgumentException();
        }
        this.f15209a = c4219a;
        int length = iArr.length;
        if (length <= 1 || iArr[0] != 0) {
            this.f15210b = iArr;
            return;
        }
        int i10 = 1;
        while (i10 < length && iArr[i10] == 0) {
            i10++;
        }
        if (i10 == length) {
            this.f15210b = new int[]{0};
            return;
        }
        int[] iArr2 = new int[length - i10];
        this.f15210b = iArr2;
        System.arraycopy(iArr, i10, iArr2, 0, iArr2.length);
    }

    /* renamed from: a */
    public C4220b m16253a(C4220b c4220b) {
        if (!this.f15209a.equals(c4220b.f15209a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (m16257e()) {
            return c4220b;
        }
        if (c4220b.m16257e()) {
            return this;
        }
        int[] iArr = this.f15210b;
        int[] iArr2 = c4220b.f15210b;
        if (iArr.length <= iArr2.length) {
            iArr = iArr2;
            iArr2 = iArr;
        }
        int[] iArr3 = new int[iArr.length];
        int length = iArr.length - iArr2.length;
        System.arraycopy(iArr, 0, iArr3, 0, length);
        for (int i10 = length; i10 < iArr.length; i10++) {
            iArr3[i10] = C4219a.m16243a(iArr2[i10 - length], iArr[i10]);
        }
        return new C4220b(this.f15209a, iArr3);
    }

    /* renamed from: b */
    public int m16254b(int i10) {
        if (i10 == 0) {
            return m16255c(0);
        }
        if (i10 == 1) {
            int i11 = 0;
            for (int i12 : this.f15210b) {
                i11 = C4219a.m16243a(i11, i12);
            }
            return i11;
        }
        int[] iArr = this.f15210b;
        int i13 = iArr[0];
        int length = iArr.length;
        for (int i14 = 1; i14 < length; i14++) {
            i13 = C4219a.m16243a(this.f15209a.m16252j(i10, i13), this.f15210b[i14]);
        }
        return i13;
    }

    /* renamed from: c */
    public int m16255c(int i10) {
        return this.f15210b[(r0.length - 1) - i10];
    }

    /* renamed from: d */
    public int m16256d() {
        return this.f15210b.length - 1;
    }

    /* renamed from: e */
    public boolean m16257e() {
        return this.f15210b[0] == 0;
    }

    /* renamed from: f */
    public C4220b m16258f(int i10) {
        if (i10 == 0) {
            return this.f15209a.m16249g();
        }
        if (i10 == 1) {
            return this;
        }
        int length = this.f15210b.length;
        int[] iArr = new int[length];
        for (int i11 = 0; i11 < length; i11++) {
            iArr[i11] = this.f15209a.m16252j(this.f15210b[i11], i10);
        }
        return new C4220b(this.f15209a, iArr);
    }

    /* renamed from: g */
    public C4220b m16259g(C4220b c4220b) {
        if (!this.f15209a.equals(c4220b.f15209a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (m16257e() || c4220b.m16257e()) {
            return this.f15209a.m16249g();
        }
        int[] iArr = this.f15210b;
        int length = iArr.length;
        int[] iArr2 = c4220b.f15210b;
        int length2 = iArr2.length;
        int[] iArr3 = new int[(length + length2) - 1];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = iArr[i10];
            for (int i12 = 0; i12 < length2; i12++) {
                int i13 = i10 + i12;
                iArr3[i13] = C4219a.m16243a(iArr3[i13], this.f15209a.m16252j(i11, iArr2[i12]));
            }
        }
        return new C4220b(this.f15209a, iArr3);
    }

    /* renamed from: h */
    public C4220b m16260h(int i10, int i11) {
        if (i10 < 0) {
            throw new IllegalArgumentException();
        }
        if (i11 == 0) {
            return this.f15209a.m16249g();
        }
        int length = this.f15210b.length;
        int[] iArr = new int[i10 + length];
        for (int i12 = 0; i12 < length; i12++) {
            iArr[i12] = this.f15209a.m16252j(this.f15210b[i12], i11);
        }
        return new C4220b(this.f15209a, iArr);
    }

    public String toString() {
        char c10;
        if (m16257e()) {
            return "0";
        }
        StringBuilder sb2 = new StringBuilder(m16256d() * 8);
        int m16256d = m16256d();
        while (m16256d >= 0) {
            int m16255c = m16255c(m16256d);
            if (m16255c != 0) {
                if (m16255c < 0) {
                    sb2.append(m16256d == m16256d() ? "-" : " - ");
                    m16255c = -m16255c;
                } else if (sb2.length() > 0) {
                    sb2.append(" + ");
                }
                if (m16256d == 0 || m16255c != 1) {
                    int m16251i = this.f15209a.m16251i(m16255c);
                    if (m16251i == 0) {
                        c10 = '1';
                    } else if (m16251i == 1) {
                        c10 = 'a';
                    } else {
                        sb2.append("a^");
                        sb2.append(m16251i);
                    }
                    sb2.append(c10);
                }
                if (m16256d != 0) {
                    if (m16256d == 1) {
                        sb2.append('x');
                    } else {
                        sb2.append("x^");
                        sb2.append(m16256d);
                    }
                }
            }
            m16256d--;
        }
        return sb2.toString();
    }
}
