package p037cb;

import p129ia.C2672d;

/* renamed from: cb.a */
/* loaded from: classes.dex */
public final class C1003a {

    /* renamed from: a */
    public final C1004b f3944a = C1004b.f3945f;

    /* renamed from: a */
    public int m4219a(int[] iArr, int i10, int[] iArr2) {
        C1005c c1005c = new C1005c(this.f3944a, iArr);
        int[] iArr3 = new int[i10];
        boolean z10 = false;
        for (int i11 = i10; i11 > 0; i11--) {
            int m4234b = c1005c.m4234b(this.f3944a.m4225c(i11));
            iArr3[i10 - i11] = m4234b;
            if (m4234b != 0) {
                z10 = true;
            }
        }
        if (!z10) {
            return 0;
        }
        C1005c m4226d = this.f3944a.m4226d();
        if (iArr2 != null) {
            for (int i12 : iArr2) {
                int m4225c = this.f3944a.m4225c((iArr.length - 1) - i12);
                C1004b c1004b = this.f3944a;
                m4226d = m4226d.m4239g(new C1005c(c1004b, new int[]{c1004b.m4232j(0, m4225c), 1}));
            }
        }
        C1005c[] m4222d = m4222d(this.f3944a.m4224b(i10, 1), new C1005c(this.f3944a, iArr3), i10);
        C1005c c1005c2 = m4222d[0];
        C1005c c1005c3 = m4222d[1];
        int[] m4220b = m4220b(c1005c2);
        int[] m4221c = m4221c(c1005c3, c1005c2, m4220b);
        for (int i13 = 0; i13 < m4220b.length; i13++) {
            int length = (iArr.length - 1) - this.f3944a.m4230h(m4220b[i13]);
            if (length < 0) {
                throw C2672d.m10881a();
            }
            iArr[length] = this.f3944a.m4232j(iArr[length], m4221c[i13]);
        }
        return m4220b.length;
    }

    /* renamed from: b */
    public final int[] m4220b(C1005c c1005c) {
        int m4236d = c1005c.m4236d();
        int[] iArr = new int[m4236d];
        int i10 = 0;
        for (int i11 = 1; i11 < this.f3944a.m4227e() && i10 < m4236d; i11++) {
            if (c1005c.m4234b(i11) == 0) {
                iArr[i10] = this.f3944a.m4229g(i11);
                i10++;
            }
        }
        if (i10 == m4236d) {
            return iArr;
        }
        throw C2672d.m10881a();
    }

    /* renamed from: c */
    public final int[] m4221c(C1005c c1005c, C1005c c1005c2, int[] iArr) {
        int m4236d = c1005c2.m4236d();
        if (m4236d < 1) {
            return new int[0];
        }
        int[] iArr2 = new int[m4236d];
        for (int i10 = 1; i10 <= m4236d; i10++) {
            iArr2[m4236d - i10] = this.f3944a.m4231i(i10, c1005c2.m4235c(i10));
        }
        C1005c c1005c3 = new C1005c(this.f3944a, iArr2);
        int length = iArr.length;
        int[] iArr3 = new int[length];
        for (int i11 = 0; i11 < length; i11++) {
            int m4229g = this.f3944a.m4229g(iArr[i11]);
            iArr3[i11] = this.f3944a.m4231i(this.f3944a.m4232j(0, c1005c.m4234b(m4229g)), this.f3944a.m4229g(c1005c3.m4234b(m4229g)));
        }
        return iArr3;
    }

    /* renamed from: d */
    public final C1005c[] m4222d(C1005c c1005c, C1005c c1005c2, int i10) {
        if (c1005c.m4236d() < c1005c2.m4236d()) {
            c1005c2 = c1005c;
            c1005c = c1005c2;
        }
        C1005c m4228f = this.f3944a.m4228f();
        C1005c m4226d = this.f3944a.m4226d();
        while (true) {
            C1005c c1005c3 = c1005c2;
            c1005c2 = c1005c;
            c1005c = c1005c3;
            C1005c c1005c4 = m4226d;
            C1005c c1005c5 = m4228f;
            m4228f = c1005c4;
            if (c1005c.m4236d() < i10 / 2) {
                int m4235c = m4228f.m4235c(0);
                if (m4235c == 0) {
                    throw C2672d.m10881a();
                }
                int m4229g = this.f3944a.m4229g(m4235c);
                return new C1005c[]{m4228f.m4238f(m4229g), c1005c.m4238f(m4229g)};
            }
            if (c1005c.m4237e()) {
                throw C2672d.m10881a();
            }
            C1005c m4228f2 = this.f3944a.m4228f();
            int m4229g2 = this.f3944a.m4229g(c1005c.m4235c(c1005c.m4236d()));
            while (c1005c2.m4236d() >= c1005c.m4236d() && !c1005c2.m4237e()) {
                int m4236d = c1005c2.m4236d() - c1005c.m4236d();
                int m4231i = this.f3944a.m4231i(c1005c2.m4235c(c1005c2.m4236d()), m4229g2);
                m4228f2 = m4228f2.m4233a(this.f3944a.m4224b(m4236d, m4231i));
                c1005c2 = c1005c2.m4242j(c1005c.m4240h(m4236d, m4231i));
            }
            m4226d = m4228f2.m4239g(m4228f).m4242j(c1005c5).m4241i();
        }
    }
}
