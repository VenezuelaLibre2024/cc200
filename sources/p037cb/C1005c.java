package p037cb;

/* renamed from: cb.c */
/* loaded from: classes.dex */
public final class C1005c {

    /* renamed from: a */
    public final C1004b f3951a;

    /* renamed from: b */
    public final int[] f3952b;

    public C1005c(C1004b c1004b, int[] iArr) {
        if (iArr.length == 0) {
            throw new IllegalArgumentException();
        }
        this.f3951a = c1004b;
        int length = iArr.length;
        if (length <= 1 || iArr[0] != 0) {
            this.f3952b = iArr;
            return;
        }
        int i10 = 1;
        while (i10 < length && iArr[i10] == 0) {
            i10++;
        }
        if (i10 == length) {
            this.f3952b = new int[]{0};
            return;
        }
        int[] iArr2 = new int[length - i10];
        this.f3952b = iArr2;
        System.arraycopy(iArr, i10, iArr2, 0, iArr2.length);
    }

    /* renamed from: a */
    public C1005c m4233a(C1005c c1005c) {
        if (!this.f3951a.equals(c1005c.f3951a)) {
            throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
        }
        if (m4237e()) {
            return c1005c;
        }
        if (c1005c.m4237e()) {
            return this;
        }
        int[] iArr = this.f3952b;
        int[] iArr2 = c1005c.f3952b;
        if (iArr.length <= iArr2.length) {
            iArr = iArr2;
            iArr2 = iArr;
        }
        int[] iArr3 = new int[iArr.length];
        int length = iArr.length - iArr2.length;
        System.arraycopy(iArr, 0, iArr3, 0, length);
        for (int i10 = length; i10 < iArr.length; i10++) {
            iArr3[i10] = this.f3951a.m4223a(iArr2[i10 - length], iArr[i10]);
        }
        return new C1005c(this.f3951a, iArr3);
    }

    /* renamed from: b */
    public int m4234b(int i10) {
        if (i10 == 0) {
            return m4235c(0);
        }
        if (i10 == 1) {
            int i11 = 0;
            for (int i12 : this.f3952b) {
                i11 = this.f3951a.m4223a(i11, i12);
            }
            return i11;
        }
        int[] iArr = this.f3952b;
        int i13 = iArr[0];
        int length = iArr.length;
        for (int i14 = 1; i14 < length; i14++) {
            C1004b c1004b = this.f3951a;
            i13 = c1004b.m4223a(c1004b.m4231i(i10, i13), this.f3952b[i14]);
        }
        return i13;
    }

    /* renamed from: c */
    public int m4235c(int i10) {
        return this.f3952b[(r0.length - 1) - i10];
    }

    /* renamed from: d */
    public int m4236d() {
        return this.f3952b.length - 1;
    }

    /* renamed from: e */
    public boolean m4237e() {
        return this.f3952b[0] == 0;
    }

    /* renamed from: f */
    public C1005c m4238f(int i10) {
        if (i10 == 0) {
            return this.f3951a.m4228f();
        }
        if (i10 == 1) {
            return this;
        }
        int length = this.f3952b.length;
        int[] iArr = new int[length];
        for (int i11 = 0; i11 < length; i11++) {
            iArr[i11] = this.f3951a.m4231i(this.f3952b[i11], i10);
        }
        return new C1005c(this.f3951a, iArr);
    }

    /* renamed from: g */
    public C1005c m4239g(C1005c c1005c) {
        if (!this.f3951a.equals(c1005c.f3951a)) {
            throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
        }
        if (m4237e() || c1005c.m4237e()) {
            return this.f3951a.m4228f();
        }
        int[] iArr = this.f3952b;
        int length = iArr.length;
        int[] iArr2 = c1005c.f3952b;
        int length2 = iArr2.length;
        int[] iArr3 = new int[(length + length2) - 1];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = iArr[i10];
            for (int i12 = 0; i12 < length2; i12++) {
                int i13 = i10 + i12;
                C1004b c1004b = this.f3951a;
                iArr3[i13] = c1004b.m4223a(iArr3[i13], c1004b.m4231i(i11, iArr2[i12]));
            }
        }
        return new C1005c(this.f3951a, iArr3);
    }

    /* renamed from: h */
    public C1005c m4240h(int i10, int i11) {
        if (i10 < 0) {
            throw new IllegalArgumentException();
        }
        if (i11 == 0) {
            return this.f3951a.m4228f();
        }
        int length = this.f3952b.length;
        int[] iArr = new int[i10 + length];
        for (int i12 = 0; i12 < length; i12++) {
            iArr[i12] = this.f3951a.m4231i(this.f3952b[i12], i11);
        }
        return new C1005c(this.f3951a, iArr);
    }

    /* renamed from: i */
    public C1005c m4241i() {
        int length = this.f3952b.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = this.f3951a.m4232j(0, this.f3952b[i10]);
        }
        return new C1005c(this.f3951a, iArr);
    }

    /* renamed from: j */
    public C1005c m4242j(C1005c c1005c) {
        if (this.f3951a.equals(c1005c.f3951a)) {
            return c1005c.m4237e() ? this : m4233a(c1005c.m4241i());
        }
        throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(m4236d() * 8);
        for (int m4236d = m4236d(); m4236d >= 0; m4236d--) {
            int m4235c = m4235c(m4236d);
            if (m4235c != 0) {
                if (m4235c < 0) {
                    sb2.append(" - ");
                    m4235c = -m4235c;
                } else if (sb2.length() > 0) {
                    sb2.append(" + ");
                }
                if (m4236d == 0 || m4235c != 1) {
                    sb2.append(m4235c);
                }
                if (m4236d != 0) {
                    if (m4236d == 1) {
                        sb2.append('x');
                    } else {
                        sb2.append("x^");
                        sb2.append(m4236d);
                    }
                }
            }
        }
        return sb2.toString();
    }
}
