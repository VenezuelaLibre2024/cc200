package p344xe;

import java.util.Arrays;

/* renamed from: xe.m */
/* loaded from: classes2.dex */
public final class C5780m {

    /* renamed from: a */
    public int f21528a;

    /* renamed from: b */
    public final int[] f21529b = new int[10];

    /* renamed from: a */
    public void m23061a() {
        this.f21528a = 0;
        Arrays.fill(this.f21529b, 0);
    }

    /* renamed from: b */
    public int m23062b(int i10) {
        return this.f21529b[i10];
    }

    /* renamed from: c */
    public int m23063c() {
        if ((this.f21528a & 2) != 0) {
            return this.f21529b[1];
        }
        return -1;
    }

    /* renamed from: d */
    public int m23064d() {
        if ((this.f21528a & 128) != 0) {
            return this.f21529b[7];
        }
        return 65535;
    }

    /* renamed from: e */
    public int m23065e(int i10) {
        return (this.f21528a & 16) != 0 ? this.f21529b[4] : i10;
    }

    /* renamed from: f */
    public int m23066f(int i10) {
        return (this.f21528a & 32) != 0 ? this.f21529b[5] : i10;
    }

    /* renamed from: g */
    public boolean m23067g(int i10) {
        return ((1 << i10) & this.f21528a) != 0;
    }

    /* renamed from: h */
    public void m23068h(C5780m c5780m) {
        for (int i10 = 0; i10 < 10; i10++) {
            if (c5780m.m23067g(i10)) {
                m23069i(i10, c5780m.m23062b(i10));
            }
        }
    }

    /* renamed from: i */
    public C5780m m23069i(int i10, int i11) {
        if (i10 >= 0) {
            int[] iArr = this.f21529b;
            if (i10 < iArr.length) {
                this.f21528a = (1 << i10) | this.f21528a;
                iArr[i10] = i11;
            }
        }
        return this;
    }

    /* renamed from: j */
    public int m23070j() {
        return Integer.bitCount(this.f21528a);
    }
}
