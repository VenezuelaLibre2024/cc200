package p113hb;

import android.graphics.Rect;

/* renamed from: hb.p */
/* loaded from: classes.dex */
public class C2471p {

    /* renamed from: a */
    public byte[] f9889a;

    /* renamed from: b */
    public int f9890b;

    /* renamed from: c */
    public int f9891c;

    public C2471p(byte[] bArr, int i10, int i11) {
        this.f9889a = bArr;
        this.f9890b = i10;
        this.f9891c = i11;
    }

    /* renamed from: e */
    public static byte[] m9849e(byte[] bArr, int i10, int i11) {
        int i12 = i10 * i11;
        byte[] bArr2 = new byte[i12];
        int i13 = i12 - 1;
        for (int i14 = 0; i14 < i12; i14++) {
            bArr2[i13] = bArr[i14];
            i13--;
        }
        return bArr2;
    }

    /* renamed from: f */
    public static byte[] m9850f(byte[] bArr, int i10, int i11) {
        int i12 = i10 * i11;
        byte[] bArr2 = new byte[i12];
        int i13 = i12 - 1;
        for (int i14 = 0; i14 < i10; i14++) {
            for (int i15 = i11 - 1; i15 >= 0; i15--) {
                bArr2[i13] = bArr[(i15 * i10) + i14];
                i13--;
            }
        }
        return bArr2;
    }

    /* renamed from: g */
    public static byte[] m9851g(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[i10 * i11];
        int i12 = 0;
        for (int i13 = 0; i13 < i10; i13++) {
            for (int i14 = i11 - 1; i14 >= 0; i14--) {
                bArr2[i12] = bArr[(i14 * i10) + i13];
                i12++;
            }
        }
        return bArr2;
    }

    /* renamed from: a */
    public C2471p m9852a(Rect rect, int i10) {
        int width = rect.width() / i10;
        int height = rect.height() / i10;
        int i11 = rect.top;
        byte[] bArr = new byte[width * height];
        if (i10 == 1) {
            int i12 = (i11 * this.f9890b) + rect.left;
            for (int i13 = 0; i13 < height; i13++) {
                System.arraycopy(this.f9889a, i12, bArr, i13 * width, width);
                i12 += this.f9890b;
            }
        } else {
            int i14 = (i11 * this.f9890b) + rect.left;
            for (int i15 = 0; i15 < height; i15++) {
                int i16 = i15 * width;
                int i17 = i14;
                for (int i18 = 0; i18 < width; i18++) {
                    bArr[i16] = this.f9889a[i17];
                    i17 += i10;
                    i16++;
                }
                i14 += this.f9890b * i10;
            }
        }
        return new C2471p(bArr, width, height);
    }

    /* renamed from: b */
    public byte[] m9853b() {
        return this.f9889a;
    }

    /* renamed from: c */
    public int m9854c() {
        return this.f9891c;
    }

    /* renamed from: d */
    public int m9855d() {
        return this.f9890b;
    }

    /* renamed from: h */
    public C2471p m9856h(int i10) {
        return i10 != 90 ? i10 != 180 ? i10 != 270 ? this : new C2471p(m9850f(this.f9889a, this.f9890b, this.f9891c), this.f9891c, this.f9890b) : new C2471p(m9849e(this.f9889a, this.f9890b, this.f9891c), this.f9890b, this.f9891c) : new C2471p(m9851g(this.f9889a, this.f9890b, this.f9891c), this.f9891c, this.f9890b);
    }
}
