package bf;

/* renamed from: bf.p */
/* loaded from: classes2.dex */
public final class C0570p {

    /* renamed from: a */
    public final byte[] f2540a;

    /* renamed from: b */
    public int f2541b;

    /* renamed from: c */
    public int f2542c;

    /* renamed from: d */
    public boolean f2543d;

    /* renamed from: e */
    public boolean f2544e;

    /* renamed from: f */
    public C0570p f2545f;

    /* renamed from: g */
    public C0570p f2546g;

    public C0570p() {
        this.f2540a = new byte[8192];
        this.f2544e = true;
        this.f2543d = false;
    }

    public C0570p(byte[] bArr, int i10, int i11, boolean z10, boolean z11) {
        this.f2540a = bArr;
        this.f2541b = i10;
        this.f2542c = i11;
        this.f2543d = z10;
        this.f2544e = z11;
    }

    /* renamed from: a */
    public final void m2909a() {
        C0570p c0570p = this.f2546g;
        if (c0570p == this) {
            throw new IllegalStateException();
        }
        if (c0570p.f2544e) {
            int i10 = this.f2542c - this.f2541b;
            if (i10 > (8192 - c0570p.f2542c) + (c0570p.f2543d ? 0 : c0570p.f2541b)) {
                return;
            }
            m2914f(c0570p, i10);
            m2910b();
            C0571q.m2915a(this);
        }
    }

    /* renamed from: b */
    public final C0570p m2910b() {
        C0570p c0570p = this.f2545f;
        C0570p c0570p2 = c0570p != this ? c0570p : null;
        C0570p c0570p3 = this.f2546g;
        c0570p3.f2545f = c0570p;
        this.f2545f.f2546g = c0570p3;
        this.f2545f = null;
        this.f2546g = null;
        return c0570p2;
    }

    /* renamed from: c */
    public final C0570p m2911c(C0570p c0570p) {
        c0570p.f2546g = this;
        c0570p.f2545f = this.f2545f;
        this.f2545f.f2546g = c0570p;
        this.f2545f = c0570p;
        return c0570p;
    }

    /* renamed from: d */
    public final C0570p m2912d() {
        this.f2543d = true;
        return new C0570p(this.f2540a, this.f2541b, this.f2542c, true, false);
    }

    /* renamed from: e */
    public final C0570p m2913e(int i10) {
        C0570p m2916b;
        if (i10 <= 0 || i10 > this.f2542c - this.f2541b) {
            throw new IllegalArgumentException();
        }
        if (i10 >= 1024) {
            m2916b = m2912d();
        } else {
            m2916b = C0571q.m2916b();
            System.arraycopy(this.f2540a, this.f2541b, m2916b.f2540a, 0, i10);
        }
        m2916b.f2542c = m2916b.f2541b + i10;
        this.f2541b += i10;
        this.f2546g.m2911c(m2916b);
        return m2916b;
    }

    /* renamed from: f */
    public final void m2914f(C0570p c0570p, int i10) {
        if (!c0570p.f2544e) {
            throw new IllegalArgumentException();
        }
        int i11 = c0570p.f2542c;
        if (i11 + i10 > 8192) {
            if (c0570p.f2543d) {
                throw new IllegalArgumentException();
            }
            int i12 = c0570p.f2541b;
            if ((i11 + i10) - i12 > 8192) {
                throw new IllegalArgumentException();
            }
            byte[] bArr = c0570p.f2540a;
            System.arraycopy(bArr, i12, bArr, 0, i11 - i12);
            c0570p.f2542c -= c0570p.f2541b;
            c0570p.f2541b = 0;
        }
        System.arraycopy(this.f2540a, this.f2541b, c0570p.f2540a, c0570p.f2542c, i10);
        c0570p.f2542c += i10;
        this.f2541b += i10;
    }
}
