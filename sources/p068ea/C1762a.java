package p068ea;

/* renamed from: ea.a */
/* loaded from: classes.dex */
public class C1762a {

    /* renamed from: a */
    public final double f6513a;

    /* renamed from: b */
    public final double f6514b;

    /* renamed from: c */
    public final double f6515c;

    /* renamed from: d */
    public final double f6516d;

    /* renamed from: e */
    public final double f6517e;

    /* renamed from: f */
    public final double f6518f;

    public C1762a(double d10, double d11, double d12, double d13) {
        this.f6513a = d10;
        this.f6514b = d12;
        this.f6515c = d11;
        this.f6516d = d13;
        this.f6517e = (d10 + d11) / 2.0d;
        this.f6518f = (d12 + d13) / 2.0d;
    }

    /* renamed from: a */
    public boolean m7058a(double d10, double d11) {
        return this.f6513a <= d10 && d10 <= this.f6515c && this.f6514b <= d11 && d11 <= this.f6516d;
    }

    /* renamed from: b */
    public boolean m7059b(C1762a c1762a) {
        return c1762a.f6513a >= this.f6513a && c1762a.f6515c <= this.f6515c && c1762a.f6514b >= this.f6514b && c1762a.f6516d <= this.f6516d;
    }

    /* renamed from: c */
    public boolean m7060c(C1763b c1763b) {
        return m7058a(c1763b.f6519a, c1763b.f6520b);
    }

    /* renamed from: d */
    public boolean m7061d(double d10, double d11, double d12, double d13) {
        return d10 < this.f6515c && this.f6513a < d11 && d12 < this.f6516d && this.f6514b < d13;
    }

    /* renamed from: e */
    public boolean m7062e(C1762a c1762a) {
        return m7061d(c1762a.f6513a, c1762a.f6515c, c1762a.f6514b, c1762a.f6516d);
    }
}
