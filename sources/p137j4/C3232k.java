package p137j4;

import java.util.NoSuchElementException;

/* renamed from: j4.k */
/* loaded from: classes.dex */
public final class C3232k {

    /* renamed from: a */
    public int f11221a = 0;

    /* renamed from: b */
    public int f11222b = -1;

    /* renamed from: c */
    public int f11223c = 0;

    /* renamed from: d */
    public int[] f11224d = new int[16];

    /* renamed from: e */
    public int f11225e;

    public C3232k() {
        this.f11225e = r0.length - 1;
    }

    /* renamed from: a */
    public void m11560a(int i10) {
        if (this.f11223c == this.f11224d.length) {
            m11562c();
        }
        int i11 = (this.f11222b + 1) & this.f11225e;
        this.f11222b = i11;
        this.f11224d[i11] = i10;
        this.f11223c++;
    }

    /* renamed from: b */
    public void m11561b() {
        this.f11221a = 0;
        this.f11222b = -1;
        this.f11223c = 0;
    }

    /* renamed from: c */
    public final void m11562c() {
        int[] iArr = this.f11224d;
        int length = iArr.length << 1;
        if (length < 0) {
            throw new IllegalStateException();
        }
        int[] iArr2 = new int[length];
        int length2 = iArr.length;
        int i10 = this.f11221a;
        int i11 = length2 - i10;
        System.arraycopy(iArr, i10, iArr2, 0, i11);
        System.arraycopy(this.f11224d, 0, iArr2, i11, i10);
        this.f11221a = 0;
        this.f11222b = this.f11223c - 1;
        this.f11224d = iArr2;
        this.f11225e = iArr2.length - 1;
    }

    /* renamed from: d */
    public boolean m11563d() {
        return this.f11223c == 0;
    }

    /* renamed from: e */
    public int m11564e() {
        int i10 = this.f11223c;
        if (i10 == 0) {
            throw new NoSuchElementException();
        }
        int[] iArr = this.f11224d;
        int i11 = this.f11221a;
        int i12 = iArr[i11];
        this.f11221a = (i11 + 1) & this.f11225e;
        this.f11223c = i10 - 1;
        return i12;
    }
}
