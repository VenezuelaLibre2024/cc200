package p211oa;

/* renamed from: oa.c */
/* loaded from: classes.dex */
public final class C3966c {

    /* renamed from: a */
    public final byte[] f14281a;

    /* renamed from: b */
    public int f14282b;

    /* renamed from: c */
    public int f14283c;

    public C3966c(byte[] bArr) {
        this.f14281a = bArr;
    }

    /* renamed from: a */
    public int m15048a() {
        return ((this.f14281a.length - this.f14282b) * 8) - this.f14283c;
    }

    /* renamed from: b */
    public int m15049b() {
        return this.f14283c;
    }

    /* renamed from: c */
    public int m15050c() {
        return this.f14282b;
    }

    /* renamed from: d */
    public int m15051d(int i10) {
        if (i10 < 1 || i10 > 32 || i10 > m15048a()) {
            throw new IllegalArgumentException(String.valueOf(i10));
        }
        int i11 = this.f14283c;
        int i12 = 0;
        if (i11 > 0) {
            int i13 = 8 - i11;
            int min = Math.min(i10, i13);
            int i14 = i13 - min;
            byte[] bArr = this.f14281a;
            int i15 = this.f14282b;
            int i16 = (((255 >> (8 - min)) << i14) & bArr[i15]) >> i14;
            i10 -= min;
            int i17 = this.f14283c + min;
            this.f14283c = i17;
            if (i17 == 8) {
                this.f14283c = 0;
                this.f14282b = i15 + 1;
            }
            i12 = i16;
        }
        if (i10 <= 0) {
            return i12;
        }
        while (i10 >= 8) {
            int i18 = i12 << 8;
            byte[] bArr2 = this.f14281a;
            int i19 = this.f14282b;
            i12 = (bArr2[i19] & 255) | i18;
            this.f14282b = i19 + 1;
            i10 -= 8;
        }
        if (i10 <= 0) {
            return i12;
        }
        int i20 = 8 - i10;
        int i21 = (i12 << i10) | ((((255 >> i20) << i20) & this.f14281a[this.f14282b]) >> i20);
        this.f14283c += i10;
        return i21;
    }
}
