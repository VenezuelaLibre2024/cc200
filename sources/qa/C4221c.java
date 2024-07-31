package qa;

/* renamed from: qa.c */
/* loaded from: classes.dex */
public final class C4221c {

    /* renamed from: a */
    public final C4219a f15211a;

    public C4221c(C4219a c4219a) {
        this.f15211a = c4219a;
    }

    /* renamed from: a */
    public void m16261a(int[] iArr, int i10) {
        C4220b c4220b = new C4220b(this.f15211a, iArr);
        int[] iArr2 = new int[i10];
        boolean z10 = true;
        for (int i11 = 0; i11 < i10; i11++) {
            C4219a c4219a = this.f15211a;
            int m16254b = c4220b.m16254b(c4219a.m16245c(c4219a.m16246d() + i11));
            iArr2[(i10 - 1) - i11] = m16254b;
            if (m16254b != 0) {
                z10 = false;
            }
        }
        if (z10) {
            return;
        }
        C4220b[] m16264d = m16264d(this.f15211a.m16244b(i10, 1), new C4220b(this.f15211a, iArr2), i10);
        C4220b c4220b2 = m16264d[0];
        C4220b c4220b3 = m16264d[1];
        int[] m16262b = m16262b(c4220b2);
        int[] m16263c = m16263c(c4220b3, m16262b);
        for (int i12 = 0; i12 < m16262b.length; i12++) {
            int length = (iArr.length - 1) - this.f15211a.m16251i(m16262b[i12]);
            if (length < 0) {
                throw new C4222d("Bad error location");
            }
            iArr[length] = C4219a.m16243a(iArr[length], m16263c[i12]);
        }
    }

    /* renamed from: b */
    public final int[] m16262b(C4220b c4220b) {
        int m16256d = c4220b.m16256d();
        int i10 = 0;
        if (m16256d == 1) {
            return new int[]{c4220b.m16255c(1)};
        }
        int[] iArr = new int[m16256d];
        for (int i11 = 1; i11 < this.f15211a.m16248f() && i10 < m16256d; i11++) {
            if (c4220b.m16254b(i11) == 0) {
                iArr[i10] = this.f15211a.m16250h(i11);
                i10++;
            }
        }
        if (i10 == m16256d) {
            return iArr;
        }
        throw new C4222d("Error locator degree does not match number of roots");
    }

    /* renamed from: c */
    public final int[] m16263c(C4220b c4220b, int[] iArr) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            int m16250h = this.f15211a.m16250h(iArr[i10]);
            int i11 = 1;
            for (int i12 = 0; i12 < length; i12++) {
                if (i10 != i12) {
                    int m16252j = this.f15211a.m16252j(iArr[i12], m16250h);
                    i11 = this.f15211a.m16252j(i11, (m16252j & 1) == 0 ? m16252j | 1 : m16252j & (-2));
                }
            }
            iArr2[i10] = this.f15211a.m16252j(c4220b.m16254b(m16250h), this.f15211a.m16250h(i11));
            if (this.f15211a.m16246d() != 0) {
                iArr2[i10] = this.f15211a.m16252j(iArr2[i10], m16250h);
            }
        }
        return iArr2;
    }

    /* renamed from: d */
    public final C4220b[] m16264d(C4220b c4220b, C4220b c4220b2, int i10) {
        if (c4220b.m16256d() < c4220b2.m16256d()) {
            c4220b2 = c4220b;
            c4220b = c4220b2;
        }
        C4220b m16249g = this.f15211a.m16249g();
        C4220b m16247e = this.f15211a.m16247e();
        do {
            C4220b c4220b3 = c4220b2;
            c4220b2 = c4220b;
            c4220b = c4220b3;
            C4220b c4220b4 = m16247e;
            C4220b c4220b5 = m16249g;
            m16249g = c4220b4;
            if (c4220b.m16256d() * 2 < i10) {
                int m16255c = m16249g.m16255c(0);
                if (m16255c == 0) {
                    throw new C4222d("sigmaTilde(0) was zero");
                }
                int m16250h = this.f15211a.m16250h(m16255c);
                return new C4220b[]{m16249g.m16258f(m16250h), c4220b.m16258f(m16250h)};
            }
            if (c4220b.m16257e()) {
                throw new C4222d("r_{i-1} was zero");
            }
            C4220b m16249g2 = this.f15211a.m16249g();
            int m16250h2 = this.f15211a.m16250h(c4220b.m16255c(c4220b.m16256d()));
            while (c4220b2.m16256d() >= c4220b.m16256d() && !c4220b2.m16257e()) {
                int m16256d = c4220b2.m16256d() - c4220b.m16256d();
                int m16252j = this.f15211a.m16252j(c4220b2.m16255c(c4220b2.m16256d()), m16250h2);
                m16249g2 = m16249g2.m16253a(this.f15211a.m16244b(m16256d, m16252j));
                c4220b2 = c4220b2.m16253a(c4220b.m16260h(m16256d, m16252j));
            }
            m16247e = m16249g2.m16259g(m16249g).m16253a(c4220b5);
        } while (c4220b2.m16256d() < c4220b.m16256d());
        throw new IllegalStateException("Division algorithm failed to reduce polynomial? r: " + c4220b2 + ", rLast: " + c4220b);
    }
}
