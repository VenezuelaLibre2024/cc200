package p084fb;

import p129ia.C2674f;
import p211oa.C3965b;

/* renamed from: fb.a */
/* loaded from: classes.dex */
public final class C1888a {

    /* renamed from: a */
    public final C3965b f7129a;

    /* renamed from: b */
    public C1897j f7130b;

    /* renamed from: c */
    public C1894g f7131c;

    /* renamed from: d */
    public boolean f7132d;

    public C1888a(C3965b c3965b) {
        int m15038k = c3965b.m15038k();
        if (m15038k < 21 || (m15038k & 3) != 1) {
            throw C2674f.m10883a();
        }
        this.f7129a = c3965b;
    }

    /* renamed from: a */
    public final int m7719a(int i10, int i11, int i12) {
        return this.f7132d ? this.f7129a.m15035g(i11, i10) : this.f7129a.m15035g(i10, i11) ? (i12 << 1) | 1 : i12 << 1;
    }

    /* renamed from: b */
    public void m7720b() {
        int i10 = 0;
        while (i10 < this.f7129a.m15041n()) {
            int i11 = i10 + 1;
            for (int i12 = i11; i12 < this.f7129a.m15038k(); i12++) {
                if (this.f7129a.m15035g(i10, i12) != this.f7129a.m15035g(i12, i10)) {
                    this.f7129a.m15034f(i12, i10);
                    this.f7129a.m15034f(i10, i12);
                }
            }
            i10 = i11;
        }
    }

    /* renamed from: c */
    public byte[] m7721c() {
        C1894g m7722d = m7722d();
        C1897j m7723e = m7723e();
        EnumC1890c enumC1890c = EnumC1890c.values()[m7722d.m7746c()];
        int m15038k = this.f7129a.m15038k();
        enumC1890c.m7730c(this.f7129a, m15038k);
        C3965b m7755a = m7723e.m7755a();
        byte[] bArr = new byte[m7723e.m7759h()];
        int i10 = m15038k - 1;
        boolean z10 = true;
        int i11 = i10;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i11 > 0) {
            if (i11 == 6) {
                i11--;
            }
            for (int i15 = 0; i15 < m15038k; i15++) {
                int i16 = z10 ? i10 - i15 : i15;
                for (int i17 = 0; i17 < 2; i17++) {
                    int i18 = i11 - i17;
                    if (!m7755a.m15035g(i18, i16)) {
                        i13++;
                        i14 <<= 1;
                        if (this.f7129a.m15035g(i18, i16)) {
                            i14 |= 1;
                        }
                        if (i13 == 8) {
                            bArr[i12] = (byte) i14;
                            i12++;
                            i13 = 0;
                            i14 = 0;
                        }
                    }
                }
            }
            z10 = !z10;
            i11 -= 2;
        }
        if (i12 == m7723e.m7759h()) {
            return bArr;
        }
        throw C2674f.m10883a();
    }

    /* renamed from: d */
    public C1894g m7722d() {
        C1894g c1894g = this.f7131c;
        if (c1894g != null) {
            return c1894g;
        }
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < 6; i12++) {
            i11 = m7719a(i12, 8, i11);
        }
        int m7719a = m7719a(8, 7, m7719a(8, 8, m7719a(7, 8, i11)));
        for (int i13 = 5; i13 >= 0; i13--) {
            m7719a = m7719a(8, i13, m7719a);
        }
        int m15038k = this.f7129a.m15038k();
        int i14 = m15038k - 7;
        for (int i15 = m15038k - 1; i15 >= i14; i15--) {
            i10 = m7719a(8, i15, i10);
        }
        for (int i16 = m15038k - 8; i16 < m15038k; i16++) {
            i10 = m7719a(i16, 8, i10);
        }
        C1894g m7743a = C1894g.m7743a(m7719a, i10);
        this.f7131c = m7743a;
        if (m7743a != null) {
            return m7743a;
        }
        throw C2674f.m10883a();
    }

    /* renamed from: e */
    public C1897j m7723e() {
        C1897j c1897j = this.f7130b;
        if (c1897j != null) {
            return c1897j;
        }
        int m15038k = this.f7129a.m15038k();
        int i10 = (m15038k - 17) / 4;
        if (i10 <= 6) {
            return C1897j.m7754i(i10);
        }
        int i11 = m15038k - 11;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 5; i14 >= 0; i14--) {
            for (int i15 = m15038k - 9; i15 >= i11; i15--) {
                i13 = m7719a(i15, i14, i13);
            }
        }
        C1897j m7752c = C1897j.m7752c(i13);
        if (m7752c != null && m7752c.m7757e() == m15038k) {
            this.f7130b = m7752c;
            return m7752c;
        }
        for (int i16 = 5; i16 >= 0; i16--) {
            for (int i17 = m15038k - 9; i17 >= i11; i17--) {
                i12 = m7719a(i16, i17, i12);
            }
        }
        C1897j m7752c2 = C1897j.m7752c(i12);
        if (m7752c2 == null || m7752c2.m7757e() != m15038k) {
            throw C2674f.m10883a();
        }
        this.f7130b = m7752c2;
        return m7752c2;
    }

    /* renamed from: f */
    public void m7724f() {
        if (this.f7131c == null) {
            return;
        }
        EnumC1890c.values()[this.f7131c.m7746c()].m7730c(this.f7129a, this.f7129a.m15038k());
    }

    /* renamed from: g */
    public void m7725g(boolean z10) {
        this.f7130b = null;
        this.f7131c = null;
        this.f7132d = z10;
    }
}
