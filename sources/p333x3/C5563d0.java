package p333x3;

import p222p5.C4014a;

/* renamed from: x3.d0 */
/* loaded from: classes.dex */
public final class C5563d0 {

    /* renamed from: a */
    public final byte[] f20877a;

    /* renamed from: b */
    public final int f20878b;

    /* renamed from: c */
    public int f20879c;

    /* renamed from: d */
    public int f20880d;

    public C5563d0(byte[] bArr) {
        this.f20877a = bArr;
        this.f20878b = bArr.length;
    }

    /* renamed from: a */
    public final void m22417a() {
        int i10;
        int i11 = this.f20879c;
        C4014a.m15200f(i11 >= 0 && (i11 < (i10 = this.f20878b) || (i11 == i10 && this.f20880d == 0)));
    }

    /* renamed from: b */
    public int m22418b() {
        return (this.f20879c * 8) + this.f20880d;
    }

    /* renamed from: c */
    public boolean m22419c() {
        boolean z10 = (((this.f20877a[this.f20879c] & 255) >> this.f20880d) & 1) == 1;
        m22421e(1);
        return z10;
    }

    /* renamed from: d */
    public int m22420d(int i10) {
        int i11 = this.f20879c;
        int min = Math.min(i10, 8 - this.f20880d);
        int i12 = i11 + 1;
        int i13 = ((this.f20877a[i11] & 255) >> this.f20880d) & (255 >> (8 - min));
        while (min < i10) {
            i13 |= (this.f20877a[i12] & 255) << min;
            min += 8;
            i12++;
        }
        int i14 = i13 & ((-1) >>> (32 - i10));
        m22421e(i10);
        return i14;
    }

    /* renamed from: e */
    public void m22421e(int i10) {
        int i11 = i10 / 8;
        int i12 = this.f20879c + i11;
        this.f20879c = i12;
        int i13 = this.f20880d + (i10 - (i11 * 8));
        this.f20880d = i13;
        if (i13 > 7) {
            this.f20879c = i12 + 1;
            this.f20880d = i13 - 8;
        }
        m22417a();
    }
}
