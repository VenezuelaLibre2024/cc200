package p353y7;

/* renamed from: y7.q */
/* loaded from: classes.dex */
public final class C5885q {

    /* renamed from: a */
    public final C5872e0<?> f21919a;

    /* renamed from: b */
    public final int f21920b;

    /* renamed from: c */
    public final int f21921c;

    public C5885q(Class<?> cls, int i10, int i11) {
        this((C5872e0<?>) C5872e0.m23505b(cls), i10, i11);
    }

    public C5885q(C5872e0<?> c5872e0, int i10, int i11) {
        this.f21919a = (C5872e0) C5870d0.m23502c(c5872e0, "Null dependency anInterface.");
        this.f21920b = i10;
        this.f21921c = i11;
    }

    /* renamed from: a */
    public static C5885q m23547a(Class<?> cls) {
        return new C5885q(cls, 0, 2);
    }

    /* renamed from: b */
    public static String m23548b(int i10) {
        if (i10 == 0) {
            return "direct";
        }
        if (i10 == 1) {
            return "provider";
        }
        if (i10 == 2) {
            return "deferred";
        }
        throw new AssertionError("Unsupported injection: " + i10);
    }

    @Deprecated
    /* renamed from: h */
    public static C5885q m23549h(Class<?> cls) {
        return new C5885q(cls, 0, 0);
    }

    /* renamed from: i */
    public static C5885q m23550i(Class<?> cls) {
        return new C5885q(cls, 0, 1);
    }

    /* renamed from: j */
    public static C5885q m23551j(Class<?> cls) {
        return new C5885q(cls, 1, 0);
    }

    /* renamed from: k */
    public static C5885q m23552k(C5872e0<?> c5872e0) {
        return new C5885q(c5872e0, 1, 0);
    }

    /* renamed from: l */
    public static C5885q m23553l(Class<?> cls) {
        return new C5885q(cls, 1, 1);
    }

    /* renamed from: m */
    public static C5885q m23554m(C5872e0<?> c5872e0) {
        return new C5885q(c5872e0, 1, 1);
    }

    /* renamed from: n */
    public static C5885q m23555n(Class<?> cls) {
        return new C5885q(cls, 2, 0);
    }

    /* renamed from: c */
    public C5872e0<?> m23556c() {
        return this.f21919a;
    }

    /* renamed from: d */
    public boolean m23557d() {
        return this.f21921c == 2;
    }

    /* renamed from: e */
    public boolean m23558e() {
        return this.f21921c == 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5885q)) {
            return false;
        }
        C5885q c5885q = (C5885q) obj;
        return this.f21919a.equals(c5885q.f21919a) && this.f21920b == c5885q.f21920b && this.f21921c == c5885q.f21921c;
    }

    /* renamed from: f */
    public boolean m23559f() {
        return this.f21920b == 1;
    }

    /* renamed from: g */
    public boolean m23560g() {
        return this.f21920b == 2;
    }

    public int hashCode() {
        return ((((this.f21919a.hashCode() ^ 1000003) * 1000003) ^ this.f21920b) * 1000003) ^ this.f21921c;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Dependency{anInterface=");
        sb2.append(this.f21919a);
        sb2.append(", type=");
        int i10 = this.f21920b;
        sb2.append(i10 == 1 ? "required" : i10 == 0 ? "optional" : "set");
        sb2.append(", injection=");
        sb2.append(m23548b(this.f21921c));
        sb2.append("}");
        return sb2.toString();
    }
}
