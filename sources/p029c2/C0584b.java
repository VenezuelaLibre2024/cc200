package p029c2;

import android.os.Build;

/* renamed from: c2.b */
/* loaded from: classes.dex */
public final class C0584b {

    /* renamed from: i */
    public static final C0584b f2568i = new a().m2953a();

    /* renamed from: a */
    public EnumC0593k f2569a;

    /* renamed from: b */
    public boolean f2570b;

    /* renamed from: c */
    public boolean f2571c;

    /* renamed from: d */
    public boolean f2572d;

    /* renamed from: e */
    public boolean f2573e;

    /* renamed from: f */
    public long f2574f;

    /* renamed from: g */
    public long f2575g;

    /* renamed from: h */
    public C0585c f2576h;

    /* renamed from: c2.b$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public boolean f2577a = false;

        /* renamed from: b */
        public boolean f2578b = false;

        /* renamed from: c */
        public EnumC0593k f2579c = EnumC0593k.NOT_REQUIRED;

        /* renamed from: d */
        public boolean f2580d = false;

        /* renamed from: e */
        public boolean f2581e = false;

        /* renamed from: f */
        public long f2582f = -1;

        /* renamed from: g */
        public long f2583g = -1;

        /* renamed from: h */
        public C0585c f2584h = new C0585c();

        /* renamed from: a */
        public C0584b m2953a() {
            return new C0584b(this);
        }

        /* renamed from: b */
        public a m2954b(EnumC0593k enumC0593k) {
            this.f2579c = enumC0593k;
            return this;
        }

        /* renamed from: c */
        public a m2955c(boolean z10) {
            this.f2581e = z10;
            return this;
        }
    }

    public C0584b() {
        this.f2569a = EnumC0593k.NOT_REQUIRED;
        this.f2574f = -1L;
        this.f2575g = -1L;
        this.f2576h = new C0585c();
    }

    public C0584b(a aVar) {
        this.f2569a = EnumC0593k.NOT_REQUIRED;
        this.f2574f = -1L;
        this.f2575g = -1L;
        this.f2576h = new C0585c();
        this.f2570b = aVar.f2577a;
        int i10 = Build.VERSION.SDK_INT;
        this.f2571c = i10 >= 23 && aVar.f2578b;
        this.f2569a = aVar.f2579c;
        this.f2572d = aVar.f2580d;
        this.f2573e = aVar.f2581e;
        if (i10 >= 24) {
            this.f2576h = aVar.f2584h;
            this.f2574f = aVar.f2582f;
            this.f2575g = aVar.f2583g;
        }
    }

    public C0584b(C0584b c0584b) {
        this.f2569a = EnumC0593k.NOT_REQUIRED;
        this.f2574f = -1L;
        this.f2575g = -1L;
        this.f2576h = new C0585c();
        this.f2570b = c0584b.f2570b;
        this.f2571c = c0584b.f2571c;
        this.f2569a = c0584b.f2569a;
        this.f2572d = c0584b.f2572d;
        this.f2573e = c0584b.f2573e;
        this.f2576h = c0584b.f2576h;
    }

    /* renamed from: a */
    public C0585c m2936a() {
        return this.f2576h;
    }

    /* renamed from: b */
    public EnumC0593k m2937b() {
        return this.f2569a;
    }

    /* renamed from: c */
    public long m2938c() {
        return this.f2574f;
    }

    /* renamed from: d */
    public long m2939d() {
        return this.f2575g;
    }

    /* renamed from: e */
    public boolean m2940e() {
        return this.f2576h.m2958c() > 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0584b.class != obj.getClass()) {
            return false;
        }
        C0584b c0584b = (C0584b) obj;
        if (this.f2570b == c0584b.f2570b && this.f2571c == c0584b.f2571c && this.f2572d == c0584b.f2572d && this.f2573e == c0584b.f2573e && this.f2574f == c0584b.f2574f && this.f2575g == c0584b.f2575g && this.f2569a == c0584b.f2569a) {
            return this.f2576h.equals(c0584b.f2576h);
        }
        return false;
    }

    /* renamed from: f */
    public boolean m2941f() {
        return this.f2572d;
    }

    /* renamed from: g */
    public boolean m2942g() {
        return this.f2570b;
    }

    /* renamed from: h */
    public boolean m2943h() {
        return this.f2571c;
    }

    public int hashCode() {
        int hashCode = ((((((((this.f2569a.hashCode() * 31) + (this.f2570b ? 1 : 0)) * 31) + (this.f2571c ? 1 : 0)) * 31) + (this.f2572d ? 1 : 0)) * 31) + (this.f2573e ? 1 : 0)) * 31;
        long j10 = this.f2574f;
        int i10 = (hashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f2575g;
        return ((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + this.f2576h.hashCode();
    }

    /* renamed from: i */
    public boolean m2944i() {
        return this.f2573e;
    }

    /* renamed from: j */
    public void m2945j(C0585c c0585c) {
        this.f2576h = c0585c;
    }

    /* renamed from: k */
    public void m2946k(EnumC0593k enumC0593k) {
        this.f2569a = enumC0593k;
    }

    /* renamed from: l */
    public void m2947l(boolean z10) {
        this.f2572d = z10;
    }

    /* renamed from: m */
    public void m2948m(boolean z10) {
        this.f2570b = z10;
    }

    /* renamed from: n */
    public void m2949n(boolean z10) {
        this.f2571c = z10;
    }

    /* renamed from: o */
    public void m2950o(boolean z10) {
        this.f2573e = z10;
    }

    /* renamed from: p */
    public void m2951p(long j10) {
        this.f2574f = j10;
    }

    /* renamed from: q */
    public void m2952q(long j10) {
        this.f2575g = j10;
    }
}
