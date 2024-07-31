package p222p5;

import java.nio.charset.Charset;

/* renamed from: p5.z */
/* loaded from: classes.dex */
public final class C4054z {

    /* renamed from: a */
    public byte[] f14602a;

    /* renamed from: b */
    public int f14603b;

    /* renamed from: c */
    public int f14604c;

    /* renamed from: d */
    public int f14605d;

    public C4054z() {
        this.f14602a = C4041n0.f14518f;
    }

    public C4054z(byte[] bArr) {
        this(bArr, bArr.length);
    }

    public C4054z(byte[] bArr, int i10) {
        this.f14602a = bArr;
        this.f14605d = i10;
    }

    /* renamed from: a */
    public final void m15594a() {
        int i10;
        int i11 = this.f14603b;
        C4014a.m15200f(i11 >= 0 && (i11 < (i10 = this.f14605d) || (i11 == i10 && this.f14604c == 0)));
    }

    /* renamed from: b */
    public int m15595b() {
        return ((this.f14605d - this.f14603b) * 8) - this.f14604c;
    }

    /* renamed from: c */
    public void m15596c() {
        if (this.f14604c == 0) {
            return;
        }
        this.f14604c = 0;
        this.f14603b++;
        m15594a();
    }

    /* renamed from: d */
    public int m15597d() {
        C4014a.m15200f(this.f14604c == 0);
        return this.f14603b;
    }

    /* renamed from: e */
    public int m15598e() {
        return (this.f14603b * 8) + this.f14604c;
    }

    /* renamed from: f */
    public void m15599f(int i10, int i11) {
        if (i11 < 32) {
            i10 &= (1 << i11) - 1;
        }
        int min = Math.min(8 - this.f14604c, i11);
        int i12 = this.f14604c;
        int i13 = (8 - i12) - min;
        byte[] bArr = this.f14602a;
        int i14 = this.f14603b;
        bArr[i14] = (byte) (((65280 >> i12) | ((1 << i13) - 1)) & bArr[i14]);
        int i15 = i11 - min;
        bArr[i14] = (byte) (((i10 >>> i15) << i13) | bArr[i14]);
        int i16 = i14 + 1;
        while (i15 > 8) {
            this.f14602a[i16] = (byte) (i10 >>> (i15 - 8));
            i15 -= 8;
            i16++;
        }
        int i17 = 8 - i15;
        byte[] bArr2 = this.f14602a;
        bArr2[i16] = (byte) (bArr2[i16] & ((1 << i17) - 1));
        bArr2[i16] = (byte) (((i10 & ((1 << i15) - 1)) << i17) | bArr2[i16]);
        m15611r(i11);
        m15594a();
    }

    /* renamed from: g */
    public boolean m15600g() {
        boolean z10 = (this.f14602a[this.f14603b] & (128 >> this.f14604c)) != 0;
        m15610q();
        return z10;
    }

    /* renamed from: h */
    public int m15601h(int i10) {
        int i11;
        if (i10 == 0) {
            return 0;
        }
        this.f14604c += i10;
        int i12 = 0;
        while (true) {
            i11 = this.f14604c;
            if (i11 <= 8) {
                break;
            }
            int i13 = i11 - 8;
            this.f14604c = i13;
            byte[] bArr = this.f14602a;
            int i14 = this.f14603b;
            this.f14603b = i14 + 1;
            i12 |= (bArr[i14] & 255) << i13;
        }
        byte[] bArr2 = this.f14602a;
        int i15 = this.f14603b;
        int i16 = ((-1) >>> (32 - i10)) & (i12 | ((bArr2[i15] & 255) >> (8 - i11)));
        if (i11 == 8) {
            this.f14604c = 0;
            this.f14603b = i15 + 1;
        }
        m15594a();
        return i16;
    }

    /* renamed from: i */
    public void m15602i(byte[] bArr, int i10, int i11) {
        int i12 = (i11 >> 3) + i10;
        while (i10 < i12) {
            byte[] bArr2 = this.f14602a;
            int i13 = this.f14603b;
            int i14 = i13 + 1;
            this.f14603b = i14;
            byte b10 = bArr2[i13];
            int i15 = this.f14604c;
            bArr[i10] = (byte) (b10 << i15);
            bArr[i10] = (byte) (((255 & bArr2[i14]) >> (8 - i15)) | bArr[i10]);
            i10++;
        }
        int i16 = i11 & 7;
        if (i16 == 0) {
            return;
        }
        bArr[i12] = (byte) (bArr[i12] & (255 >> i16));
        int i17 = this.f14604c;
        if (i17 + i16 > 8) {
            int i18 = bArr[i12];
            byte[] bArr3 = this.f14602a;
            int i19 = this.f14603b;
            this.f14603b = i19 + 1;
            bArr[i12] = (byte) (i18 | ((bArr3[i19] & 255) << i17));
            this.f14604c = i17 - 8;
        }
        int i20 = this.f14604c + i16;
        this.f14604c = i20;
        byte[] bArr4 = this.f14602a;
        int i21 = this.f14603b;
        bArr[i12] = (byte) (((byte) (((255 & bArr4[i21]) >> (8 - i20)) << (8 - i16))) | bArr[i12]);
        if (i20 == 8) {
            this.f14604c = 0;
            this.f14603b = i21 + 1;
        }
        m15594a();
    }

    /* renamed from: j */
    public long m15603j(int i10) {
        return i10 <= 32 ? C4041n0.m15438W0(m15601h(i10)) : C4041n0.m15436V0(m15601h(i10 - 32), m15601h(32));
    }

    /* renamed from: k */
    public void m15604k(byte[] bArr, int i10, int i11) {
        C4014a.m15200f(this.f14604c == 0);
        System.arraycopy(this.f14602a, this.f14603b, bArr, i10, i11);
        this.f14603b += i11;
        m15594a();
    }

    /* renamed from: l */
    public String m15605l(int i10, Charset charset) {
        byte[] bArr = new byte[i10];
        m15604k(bArr, 0, i10);
        return new String(bArr, charset);
    }

    /* renamed from: m */
    public void m15606m(C4015a0 c4015a0) {
        m15608o(c4015a0.m15230e(), c4015a0.m15232g());
        m15609p(c4015a0.m15231f() * 8);
    }

    /* renamed from: n */
    public void m15607n(byte[] bArr) {
        m15608o(bArr, bArr.length);
    }

    /* renamed from: o */
    public void m15608o(byte[] bArr, int i10) {
        this.f14602a = bArr;
        this.f14603b = 0;
        this.f14604c = 0;
        this.f14605d = i10;
    }

    /* renamed from: p */
    public void m15609p(int i10) {
        int i11 = i10 / 8;
        this.f14603b = i11;
        this.f14604c = i10 - (i11 * 8);
        m15594a();
    }

    /* renamed from: q */
    public void m15610q() {
        int i10 = this.f14604c + 1;
        this.f14604c = i10;
        if (i10 == 8) {
            this.f14604c = 0;
            this.f14603b++;
        }
        m15594a();
    }

    /* renamed from: r */
    public void m15611r(int i10) {
        int i11 = i10 / 8;
        int i12 = this.f14603b + i11;
        this.f14603b = i12;
        int i13 = this.f14604c + (i10 - (i11 * 8));
        this.f14604c = i13;
        if (i13 > 7) {
            this.f14603b = i12 + 1;
            this.f14604c = i13 - 8;
        }
        m15594a();
    }

    /* renamed from: s */
    public void m15612s(int i10) {
        C4014a.m15200f(this.f14604c == 0);
        this.f14603b += i10;
        m15594a();
    }
}
