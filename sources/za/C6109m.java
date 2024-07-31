package za;

/* renamed from: za.m */
/* loaded from: classes.dex */
public final class C6109m {

    /* renamed from: a */
    public int f22632a = 0;

    /* renamed from: b */
    public a f22633b = a.NUMERIC;

    /* renamed from: za.m$a */
    /* loaded from: classes.dex */
    public enum a {
        NUMERIC,
        ALPHA,
        ISO_IEC_646
    }

    /* renamed from: a */
    public int m24361a() {
        return this.f22632a;
    }

    /* renamed from: b */
    public void m24362b(int i10) {
        this.f22632a += i10;
    }

    /* renamed from: c */
    public boolean m24363c() {
        return this.f22633b == a.ALPHA;
    }

    /* renamed from: d */
    public boolean m24364d() {
        return this.f22633b == a.ISO_IEC_646;
    }

    /* renamed from: e */
    public void m24365e() {
        this.f22633b = a.ALPHA;
    }

    /* renamed from: f */
    public void m24366f() {
        this.f22633b = a.ISO_IEC_646;
    }

    /* renamed from: g */
    public void m24367g() {
        this.f22633b = a.NUMERIC;
    }

    /* renamed from: h */
    public void m24368h(int i10) {
        this.f22632a = i10;
    }
}
