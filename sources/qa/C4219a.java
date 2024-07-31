package qa;

/* renamed from: qa.a */
/* loaded from: classes.dex */
public final class C4219a {

    /* renamed from: h */
    public static final C4219a f15194h = new C4219a(4201, 4096, 1);

    /* renamed from: i */
    public static final C4219a f15195i = new C4219a(1033, 1024, 1);

    /* renamed from: j */
    public static final C4219a f15196j;

    /* renamed from: k */
    public static final C4219a f15197k;

    /* renamed from: l */
    public static final C4219a f15198l;

    /* renamed from: m */
    public static final C4219a f15199m;

    /* renamed from: n */
    public static final C4219a f15200n;

    /* renamed from: o */
    public static final C4219a f15201o;

    /* renamed from: a */
    public final int[] f15202a;

    /* renamed from: b */
    public final int[] f15203b;

    /* renamed from: c */
    public final C4220b f15204c;

    /* renamed from: d */
    public final C4220b f15205d;

    /* renamed from: e */
    public final int f15206e;

    /* renamed from: f */
    public final int f15207f;

    /* renamed from: g */
    public final int f15208g;

    static {
        C4219a c4219a = new C4219a(67, 64, 1);
        f15196j = c4219a;
        f15197k = new C4219a(19, 16, 1);
        f15198l = new C4219a(285, 256, 0);
        C4219a c4219a2 = new C4219a(301, 256, 1);
        f15199m = c4219a2;
        f15200n = c4219a2;
        f15201o = c4219a;
    }

    public C4219a(int i10, int i11, int i12) {
        this.f15207f = i10;
        this.f15206e = i11;
        this.f15208g = i12;
        this.f15202a = new int[i11];
        this.f15203b = new int[i11];
        int i13 = 1;
        for (int i14 = 0; i14 < i11; i14++) {
            this.f15202a[i14] = i13;
            i13 *= 2;
            if (i13 >= i11) {
                i13 = (i13 ^ i10) & (i11 - 1);
            }
        }
        for (int i15 = 0; i15 < i11 - 1; i15++) {
            this.f15203b[this.f15202a[i15]] = i15;
        }
        this.f15204c = new C4220b(this, new int[]{0});
        this.f15205d = new C4220b(this, new int[]{1});
    }

    /* renamed from: a */
    public static int m16243a(int i10, int i11) {
        return i10 ^ i11;
    }

    /* renamed from: b */
    public C4220b m16244b(int i10, int i11) {
        if (i10 < 0) {
            throw new IllegalArgumentException();
        }
        if (i11 == 0) {
            return this.f15204c;
        }
        int[] iArr = new int[i10 + 1];
        iArr[0] = i11;
        return new C4220b(this, iArr);
    }

    /* renamed from: c */
    public int m16245c(int i10) {
        return this.f15202a[i10];
    }

    /* renamed from: d */
    public int m16246d() {
        return this.f15208g;
    }

    /* renamed from: e */
    public C4220b m16247e() {
        return this.f15205d;
    }

    /* renamed from: f */
    public int m16248f() {
        return this.f15206e;
    }

    /* renamed from: g */
    public C4220b m16249g() {
        return this.f15204c;
    }

    /* renamed from: h */
    public int m16250h(int i10) {
        if (i10 != 0) {
            return this.f15202a[(this.f15206e - this.f15203b[i10]) - 1];
        }
        throw new ArithmeticException();
    }

    /* renamed from: i */
    public int m16251i(int i10) {
        if (i10 != 0) {
            return this.f15203b[i10];
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: j */
    public int m16252j(int i10, int i11) {
        if (i10 == 0 || i11 == 0) {
            return 0;
        }
        int[] iArr = this.f15202a;
        int[] iArr2 = this.f15203b;
        return iArr[(iArr2[i10] + iArr2[i11]) % (this.f15206e - 1)];
    }

    public String toString() {
        return "GF(0x" + Integer.toHexString(this.f15207f) + ',' + this.f15206e + ')';
    }
}
