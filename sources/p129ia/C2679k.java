package p129ia;

/* renamed from: ia.k */
/* loaded from: classes.dex */
public final class C2679k extends AbstractC2676h {

    /* renamed from: c */
    public final byte[] f10461c;

    /* renamed from: d */
    public final int f10462d;

    /* renamed from: e */
    public final int f10463e;

    /* renamed from: f */
    public final int f10464f;

    /* renamed from: g */
    public final int f10465g;

    public C2679k(byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, boolean z10) {
        super(i14, i15);
        if (i12 + i14 > i10 || i13 + i15 > i11) {
            throw new IllegalArgumentException("Crop rectangle does not fit within image data.");
        }
        this.f10461c = bArr;
        this.f10462d = i10;
        this.f10463e = i11;
        this.f10464f = i12;
        this.f10465g = i13;
        if (z10) {
            m10896h(i14, i15);
        }
    }

    @Override // p129ia.AbstractC2676h
    /* renamed from: b */
    public byte[] mo10885b() {
        int m10891d = m10891d();
        int m10890a = m10890a();
        int i10 = this.f10462d;
        if (m10891d == i10 && m10890a == this.f10463e) {
            return this.f10461c;
        }
        int i11 = m10891d * m10890a;
        byte[] bArr = new byte[i11];
        int i12 = (this.f10465g * i10) + this.f10464f;
        if (m10891d == i10) {
            System.arraycopy(this.f10461c, i12, bArr, 0, i11);
            return bArr;
        }
        for (int i13 = 0; i13 < m10890a; i13++) {
            System.arraycopy(this.f10461c, i12, bArr, i13 * m10891d, m10891d);
            i12 += this.f10462d;
        }
        return bArr;
    }

    @Override // p129ia.AbstractC2676h
    /* renamed from: c */
    public byte[] mo10886c(int i10, byte[] bArr) {
        if (i10 < 0 || i10 >= m10890a()) {
            throw new IllegalArgumentException("Requested row is outside the image: " + i10);
        }
        int m10891d = m10891d();
        if (bArr == null || bArr.length < m10891d) {
            bArr = new byte[m10891d];
        }
        System.arraycopy(this.f10461c, ((i10 + this.f10465g) * this.f10462d) + this.f10464f, bArr, 0, m10891d);
        return bArr;
    }

    /* renamed from: h */
    public final void m10896h(int i10, int i11) {
        byte[] bArr = this.f10461c;
        int i12 = (this.f10465g * this.f10462d) + this.f10464f;
        int i13 = 0;
        while (i13 < i11) {
            int i14 = (i10 / 2) + i12;
            int i15 = (i12 + i10) - 1;
            int i16 = i12;
            while (i16 < i14) {
                byte b10 = bArr[i16];
                bArr[i16] = bArr[i15];
                bArr[i15] = b10;
                i16++;
                i15--;
            }
            i13++;
            i12 += this.f10462d;
        }
    }
}
