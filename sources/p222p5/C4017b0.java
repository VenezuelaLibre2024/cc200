package p222p5;

/* renamed from: p5.b0 */
/* loaded from: classes.dex */
public final class C4017b0 {

    /* renamed from: a */
    public byte[] f14451a;

    /* renamed from: b */
    public int f14452b;

    /* renamed from: c */
    public int f14453c;

    /* renamed from: d */
    public int f14454d;

    public C4017b0(byte[] bArr, int i10, int i11) {
        m15262i(bArr, i10, i11);
    }

    /* renamed from: a */
    public final void m15254a() {
        int i10;
        int i11 = this.f14453c;
        C4014a.m15200f(i11 >= 0 && (i11 < (i10 = this.f14452b) || (i11 == i10 && this.f14454d == 0)));
    }

    /* renamed from: b */
    public boolean m15255b(int i10) {
        int i11 = this.f14453c;
        int i12 = i10 / 8;
        int i13 = i11 + i12;
        int i14 = (this.f14454d + i10) - (i12 * 8);
        if (i14 > 7) {
            i13++;
            i14 -= 8;
        }
        while (true) {
            i11++;
            if (i11 > i13 || i13 >= this.f14452b) {
                break;
            }
            if (m15263j(i11)) {
                i13++;
                i11 += 2;
            }
        }
        int i15 = this.f14452b;
        if (i13 >= i15) {
            return i13 == i15 && i14 == 0;
        }
        return true;
    }

    /* renamed from: c */
    public boolean m15256c() {
        int i10 = this.f14453c;
        int i11 = this.f14454d;
        int i12 = 0;
        while (this.f14453c < this.f14452b && !m15257d()) {
            i12++;
        }
        boolean z10 = this.f14453c == this.f14452b;
        this.f14453c = i10;
        this.f14454d = i11;
        return !z10 && m15255b((i12 * 2) + 1);
    }

    /* renamed from: d */
    public boolean m15257d() {
        boolean z10 = (this.f14451a[this.f14453c] & (128 >> this.f14454d)) != 0;
        m15264k();
        return z10;
    }

    /* renamed from: e */
    public int m15258e(int i10) {
        int i11;
        this.f14454d += i10;
        int i12 = 0;
        while (true) {
            i11 = this.f14454d;
            if (i11 <= 8) {
                break;
            }
            int i13 = i11 - 8;
            this.f14454d = i13;
            byte[] bArr = this.f14451a;
            int i14 = this.f14453c;
            i12 |= (bArr[i14] & 255) << i13;
            if (!m15263j(i14 + 1)) {
                r3 = 1;
            }
            this.f14453c = i14 + r3;
        }
        byte[] bArr2 = this.f14451a;
        int i15 = this.f14453c;
        int i16 = ((-1) >>> (32 - i10)) & (i12 | ((bArr2[i15] & 255) >> (8 - i11)));
        if (i11 == 8) {
            this.f14454d = 0;
            this.f14453c = i15 + (m15263j(i15 + 1) ? 2 : 1);
        }
        m15254a();
        return i16;
    }

    /* renamed from: f */
    public final int m15259f() {
        int i10 = 0;
        while (!m15257d()) {
            i10++;
        }
        return ((1 << i10) - 1) + (i10 > 0 ? m15258e(i10) : 0);
    }

    /* renamed from: g */
    public int m15260g() {
        int m15259f = m15259f();
        return (m15259f % 2 == 0 ? -1 : 1) * ((m15259f + 1) / 2);
    }

    /* renamed from: h */
    public int m15261h() {
        return m15259f();
    }

    /* renamed from: i */
    public void m15262i(byte[] bArr, int i10, int i11) {
        this.f14451a = bArr;
        this.f14453c = i10;
        this.f14452b = i11;
        this.f14454d = 0;
        m15254a();
    }

    /* renamed from: j */
    public final boolean m15263j(int i10) {
        if (2 <= i10 && i10 < this.f14452b) {
            byte[] bArr = this.f14451a;
            if (bArr[i10] == 3 && bArr[i10 - 2] == 0 && bArr[i10 - 1] == 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    public void m15264k() {
        int i10 = this.f14454d + 1;
        this.f14454d = i10;
        if (i10 == 8) {
            this.f14454d = 0;
            int i11 = this.f14453c;
            this.f14453c = i11 + (m15263j(i11 + 1) ? 2 : 1);
        }
        m15254a();
    }

    /* renamed from: l */
    public void m15265l(int i10) {
        int i11 = this.f14453c;
        int i12 = i10 / 8;
        int i13 = i11 + i12;
        this.f14453c = i13;
        int i14 = this.f14454d + (i10 - (i12 * 8));
        this.f14454d = i14;
        if (i14 > 7) {
            this.f14453c = i13 + 1;
            this.f14454d = i14 - 8;
        }
        while (true) {
            i11++;
            if (i11 > this.f14453c) {
                m15254a();
                return;
            } else if (m15263j(i11)) {
                this.f14453c++;
                i11 += 2;
            }
        }
    }
}
