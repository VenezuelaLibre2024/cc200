package sa;

import p129ia.C2674f;
import p211oa.C3965b;

/* renamed from: sa.a */
/* loaded from: classes.dex */
public final class C4558a {

    /* renamed from: a */
    public final C3965b f17165a;

    /* renamed from: b */
    public final C3965b f17166b;

    /* renamed from: c */
    public final C4562e f17167c;

    public C4558a(C3965b c3965b) {
        int m15038k = c3965b.m15038k();
        if (m15038k < 8 || m15038k > 144 || (m15038k & 1) != 0) {
            throw C2674f.m10883a();
        }
        this.f17167c = m18017j(c3965b);
        C3965b m18018a = m18018a(c3965b);
        this.f17165a = m18018a;
        this.f17166b = new C3965b(m18018a.m15041n(), m18018a.m15038k());
    }

    /* renamed from: j */
    public static C4562e m18017j(C3965b c3965b) {
        return C4562e.m18043h(c3965b.m15038k(), c3965b.m15041n());
    }

    /* renamed from: a */
    public final C3965b m18018a(C3965b c3965b) {
        int m18048f = this.f17167c.m18048f();
        int m18047e = this.f17167c.m18047e();
        if (c3965b.m15038k() != m18048f) {
            throw new IllegalArgumentException("Dimension of bitMatrix must match the version size");
        }
        int m18045c = this.f17167c.m18045c();
        int m18044b = this.f17167c.m18044b();
        int i10 = m18048f / m18045c;
        int i11 = m18047e / m18044b;
        C3965b c3965b2 = new C3965b(i11 * m18044b, i10 * m18045c);
        for (int i12 = 0; i12 < i10; i12++) {
            int i13 = i12 * m18045c;
            for (int i14 = 0; i14 < i11; i14++) {
                int i15 = i14 * m18044b;
                for (int i16 = 0; i16 < m18045c; i16++) {
                    int i17 = ((m18045c + 2) * i12) + 1 + i16;
                    int i18 = i13 + i16;
                    for (int i19 = 0; i19 < m18044b; i19++) {
                        if (c3965b.m15035g(((m18044b + 2) * i14) + 1 + i19, i17)) {
                            c3965b2.m15044q(i15 + i19, i18);
                        }
                    }
                }
            }
        }
        return c3965b2;
    }

    /* renamed from: b */
    public C4562e m18019b() {
        return this.f17167c;
    }

    /* renamed from: c */
    public byte[] m18020c() {
        byte[] bArr = new byte[this.f17167c.m18049g()];
        int m15038k = this.f17165a.m15038k();
        int m15041n = this.f17165a.m15041n();
        int i10 = 0;
        int i11 = 4;
        boolean z10 = false;
        int i12 = 0;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        while (true) {
            if (i11 == m15038k && i10 == 0 && !z10) {
                bArr[i12] = (byte) m18021d(m15038k, m15041n);
                i11 -= 2;
                i10 += 2;
                i12++;
                z10 = true;
            } else {
                int i13 = m15038k - 2;
                if (i11 == i13 && i10 == 0 && (m15041n & 3) != 0 && !z11) {
                    bArr[i12] = (byte) m18022e(m15038k, m15041n);
                    i11 -= 2;
                    i10 += 2;
                    i12++;
                    z11 = true;
                } else if (i11 == m15038k + 4 && i10 == 2 && (m15041n & 7) == 0 && !z12) {
                    bArr[i12] = (byte) m18023f(m15038k, m15041n);
                    i11 -= 2;
                    i10 += 2;
                    i12++;
                    z12 = true;
                } else if (i11 == i13 && i10 == 0 && (m15041n & 7) == 4 && !z13) {
                    bArr[i12] = (byte) m18024g(m15038k, m15041n);
                    i11 -= 2;
                    i10 += 2;
                    i12++;
                    z13 = true;
                } else {
                    do {
                        if (i11 < m15038k && i10 >= 0 && !this.f17166b.m15035g(i10, i11)) {
                            bArr[i12] = (byte) m18026i(i11, i10, m15038k, m15041n);
                            i12++;
                        }
                        i11 -= 2;
                        i10 += 2;
                        if (i11 < 0) {
                            break;
                        }
                    } while (i10 < m15041n);
                    int i14 = i11 + 1;
                    int i15 = i10 + 3;
                    do {
                        if (i14 >= 0 && i15 < m15041n && !this.f17166b.m15035g(i15, i14)) {
                            bArr[i12] = (byte) m18026i(i14, i15, m15038k, m15041n);
                            i12++;
                        }
                        i14 += 2;
                        i15 -= 2;
                        if (i14 >= m15038k) {
                            break;
                        }
                    } while (i15 >= 0);
                    i11 = i14 + 3;
                    i10 = i15 + 1;
                }
            }
            if (i11 >= m15038k && i10 >= m15041n) {
                break;
            }
        }
        if (i12 == this.f17167c.m18049g()) {
            return bArr;
        }
        throw C2674f.m10883a();
    }

    /* renamed from: d */
    public final int m18021d(int i10, int i11) {
        int i12 = i10 - 1;
        int i13 = (m18025h(i12, 0, i10, i11) ? 1 : 0) << 1;
        if (m18025h(i12, 1, i10, i11)) {
            i13 |= 1;
        }
        int i14 = i13 << 1;
        if (m18025h(i12, 2, i10, i11)) {
            i14 |= 1;
        }
        int i15 = i14 << 1;
        if (m18025h(0, i11 - 2, i10, i11)) {
            i15 |= 1;
        }
        int i16 = i15 << 1;
        int i17 = i11 - 1;
        if (m18025h(0, i17, i10, i11)) {
            i16 |= 1;
        }
        int i18 = i16 << 1;
        if (m18025h(1, i17, i10, i11)) {
            i18 |= 1;
        }
        int i19 = i18 << 1;
        if (m18025h(2, i17, i10, i11)) {
            i19 |= 1;
        }
        int i20 = i19 << 1;
        return m18025h(3, i17, i10, i11) ? i20 | 1 : i20;
    }

    /* renamed from: e */
    public final int m18022e(int i10, int i11) {
        int i12 = (m18025h(i10 + (-3), 0, i10, i11) ? 1 : 0) << 1;
        if (m18025h(i10 - 2, 0, i10, i11)) {
            i12 |= 1;
        }
        int i13 = i12 << 1;
        if (m18025h(i10 - 1, 0, i10, i11)) {
            i13 |= 1;
        }
        int i14 = i13 << 1;
        if (m18025h(0, i11 - 4, i10, i11)) {
            i14 |= 1;
        }
        int i15 = i14 << 1;
        if (m18025h(0, i11 - 3, i10, i11)) {
            i15 |= 1;
        }
        int i16 = i15 << 1;
        if (m18025h(0, i11 - 2, i10, i11)) {
            i16 |= 1;
        }
        int i17 = i16 << 1;
        int i18 = i11 - 1;
        if (m18025h(0, i18, i10, i11)) {
            i17 |= 1;
        }
        int i19 = i17 << 1;
        return m18025h(1, i18, i10, i11) ? i19 | 1 : i19;
    }

    /* renamed from: f */
    public final int m18023f(int i10, int i11) {
        int i12 = i10 - 1;
        int i13 = (m18025h(i12, 0, i10, i11) ? 1 : 0) << 1;
        int i14 = i11 - 1;
        if (m18025h(i12, i14, i10, i11)) {
            i13 |= 1;
        }
        int i15 = i13 << 1;
        int i16 = i11 - 3;
        if (m18025h(0, i16, i10, i11)) {
            i15 |= 1;
        }
        int i17 = i15 << 1;
        int i18 = i11 - 2;
        if (m18025h(0, i18, i10, i11)) {
            i17 |= 1;
        }
        int i19 = i17 << 1;
        if (m18025h(0, i14, i10, i11)) {
            i19 |= 1;
        }
        int i20 = i19 << 1;
        if (m18025h(1, i16, i10, i11)) {
            i20 |= 1;
        }
        int i21 = i20 << 1;
        if (m18025h(1, i18, i10, i11)) {
            i21 |= 1;
        }
        int i22 = i21 << 1;
        return m18025h(1, i14, i10, i11) ? i22 | 1 : i22;
    }

    /* renamed from: g */
    public final int m18024g(int i10, int i11) {
        int i12 = (m18025h(i10 + (-3), 0, i10, i11) ? 1 : 0) << 1;
        if (m18025h(i10 - 2, 0, i10, i11)) {
            i12 |= 1;
        }
        int i13 = i12 << 1;
        if (m18025h(i10 - 1, 0, i10, i11)) {
            i13 |= 1;
        }
        int i14 = i13 << 1;
        if (m18025h(0, i11 - 2, i10, i11)) {
            i14 |= 1;
        }
        int i15 = i14 << 1;
        int i16 = i11 - 1;
        if (m18025h(0, i16, i10, i11)) {
            i15 |= 1;
        }
        int i17 = i15 << 1;
        if (m18025h(1, i16, i10, i11)) {
            i17 |= 1;
        }
        int i18 = i17 << 1;
        if (m18025h(2, i16, i10, i11)) {
            i18 |= 1;
        }
        int i19 = i18 << 1;
        return m18025h(3, i16, i10, i11) ? i19 | 1 : i19;
    }

    /* renamed from: h */
    public final boolean m18025h(int i10, int i11, int i12, int i13) {
        if (i10 < 0) {
            i10 += i12;
            i11 += 4 - ((i12 + 4) & 7);
        }
        if (i11 < 0) {
            i11 += i13;
            i10 += 4 - ((i13 + 4) & 7);
        }
        if (i10 >= i12) {
            i10 -= i12;
        }
        this.f17166b.m15044q(i11, i10);
        return this.f17165a.m15035g(i11, i10);
    }

    /* renamed from: i */
    public final int m18026i(int i10, int i11, int i12, int i13) {
        int i14 = i10 - 2;
        int i15 = i11 - 2;
        int i16 = (m18025h(i14, i15, i12, i13) ? 1 : 0) << 1;
        int i17 = i11 - 1;
        if (m18025h(i14, i17, i12, i13)) {
            i16 |= 1;
        }
        int i18 = i16 << 1;
        int i19 = i10 - 1;
        if (m18025h(i19, i15, i12, i13)) {
            i18 |= 1;
        }
        int i20 = i18 << 1;
        if (m18025h(i19, i17, i12, i13)) {
            i20 |= 1;
        }
        int i21 = i20 << 1;
        if (m18025h(i19, i11, i12, i13)) {
            i21 |= 1;
        }
        int i22 = i21 << 1;
        if (m18025h(i10, i15, i12, i13)) {
            i22 |= 1;
        }
        int i23 = i22 << 1;
        if (m18025h(i10, i17, i12, i13)) {
            i23 |= 1;
        }
        int i24 = i23 << 1;
        return m18025h(i10, i11, i12, i13) ? i24 | 1 : i24;
    }
}
