package bb;

/* renamed from: bb.d */
/* loaded from: classes.dex */
public final class C0534d {

    /* renamed from: a */
    public final int f2380a;

    /* renamed from: b */
    public final int f2381b;

    /* renamed from: c */
    public final int f2382c;

    /* renamed from: d */
    public final int f2383d;

    /* renamed from: e */
    public int f2384e = -1;

    public C0534d(int i10, int i11, int i12, int i13) {
        this.f2380a = i10;
        this.f2381b = i11;
        this.f2382c = i12;
        this.f2383d = i13;
    }

    /* renamed from: a */
    public int m2582a() {
        return this.f2382c;
    }

    /* renamed from: b */
    public int m2583b() {
        return this.f2381b;
    }

    /* renamed from: c */
    public int m2584c() {
        return this.f2384e;
    }

    /* renamed from: d */
    public int m2585d() {
        return this.f2380a;
    }

    /* renamed from: e */
    public int m2586e() {
        return this.f2383d;
    }

    /* renamed from: f */
    public int m2587f() {
        return this.f2381b - this.f2380a;
    }

    /* renamed from: g */
    public boolean m2588g() {
        return m2589h(this.f2384e);
    }

    /* renamed from: h */
    public boolean m2589h(int i10) {
        return i10 != -1 && this.f2382c == (i10 % 3) * 3;
    }

    /* renamed from: i */
    public void m2590i(int i10) {
        this.f2384e = i10;
    }

    /* renamed from: j */
    public void m2591j() {
        this.f2384e = ((this.f2383d / 30) * 3) + (this.f2382c / 3);
    }

    public String toString() {
        return this.f2384e + "|" + this.f2383d;
    }
}
