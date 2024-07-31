package p037cb;

/* renamed from: cb.b */
/* loaded from: classes.dex */
public final class C1004b {

    /* renamed from: f */
    public static final C1004b f3945f = new C1004b(929, 3);

    /* renamed from: a */
    public final int[] f3946a;

    /* renamed from: b */
    public final int[] f3947b;

    /* renamed from: c */
    public final C1005c f3948c;

    /* renamed from: d */
    public final C1005c f3949d;

    /* renamed from: e */
    public final int f3950e;

    public C1004b(int i10, int i11) {
        this.f3950e = i10;
        this.f3946a = new int[i10];
        this.f3947b = new int[i10];
        int i12 = 1;
        for (int i13 = 0; i13 < i10; i13++) {
            this.f3946a[i13] = i12;
            i12 = (i12 * i11) % i10;
        }
        for (int i14 = 0; i14 < i10 - 1; i14++) {
            this.f3947b[this.f3946a[i14]] = i14;
        }
        this.f3948c = new C1005c(this, new int[]{0});
        this.f3949d = new C1005c(this, new int[]{1});
    }

    /* renamed from: a */
    public int m4223a(int i10, int i11) {
        return (i10 + i11) % this.f3950e;
    }

    /* renamed from: b */
    public C1005c m4224b(int i10, int i11) {
        if (i10 < 0) {
            throw new IllegalArgumentException();
        }
        if (i11 == 0) {
            return this.f3948c;
        }
        int[] iArr = new int[i10 + 1];
        iArr[0] = i11;
        return new C1005c(this, iArr);
    }

    /* renamed from: c */
    public int m4225c(int i10) {
        return this.f3946a[i10];
    }

    /* renamed from: d */
    public C1005c m4226d() {
        return this.f3949d;
    }

    /* renamed from: e */
    public int m4227e() {
        return this.f3950e;
    }

    /* renamed from: f */
    public C1005c m4228f() {
        return this.f3948c;
    }

    /* renamed from: g */
    public int m4229g(int i10) {
        if (i10 != 0) {
            return this.f3946a[(this.f3950e - this.f3947b[i10]) - 1];
        }
        throw new ArithmeticException();
    }

    /* renamed from: h */
    public int m4230h(int i10) {
        if (i10 != 0) {
            return this.f3947b[i10];
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: i */
    public int m4231i(int i10, int i11) {
        if (i10 == 0 || i11 == 0) {
            return 0;
        }
        int[] iArr = this.f3946a;
        int[] iArr2 = this.f3947b;
        return iArr[(iArr2[i10] + iArr2[i11]) % (this.f3950e - 1)];
    }

    /* renamed from: j */
    public int m4232j(int i10, int i11) {
        int i12 = this.f3950e;
        return ((i10 + i12) - i11) % i12;
    }
}
