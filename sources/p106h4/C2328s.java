package p106h4;

import java.util.Collections;
import p106h4.InterfaceC2316i0;
import p222p5.C4014a;
import p222p5.C4015a0;
import p222p5.C4054z;
import p264s3.C4463m1;
import p264s3.C4499t2;
import p289u3.C4805a;
import p333x3.InterfaceC5559b0;
import p333x3.InterfaceC5573m;

/* renamed from: h4.s */
/* loaded from: classes.dex */
public final class C2328s implements InterfaceC2322m {

    /* renamed from: a */
    public final String f9514a;

    /* renamed from: b */
    public final C4015a0 f9515b;

    /* renamed from: c */
    public final C4054z f9516c;

    /* renamed from: d */
    public InterfaceC5559b0 f9517d;

    /* renamed from: e */
    public String f9518e;

    /* renamed from: f */
    public C4463m1 f9519f;

    /* renamed from: g */
    public int f9520g;

    /* renamed from: h */
    public int f9521h;

    /* renamed from: i */
    public int f9522i;

    /* renamed from: j */
    public int f9523j;

    /* renamed from: k */
    public long f9524k;

    /* renamed from: l */
    public boolean f9525l;

    /* renamed from: m */
    public int f9526m;

    /* renamed from: n */
    public int f9527n;

    /* renamed from: o */
    public int f9528o;

    /* renamed from: p */
    public boolean f9529p;

    /* renamed from: q */
    public long f9530q;

    /* renamed from: r */
    public int f9531r;

    /* renamed from: s */
    public long f9532s;

    /* renamed from: t */
    public int f9533t;

    /* renamed from: u */
    public String f9534u;

    public C2328s(String str) {
        this.f9514a = str;
        C4015a0 c4015a0 = new C4015a0(1024);
        this.f9515b = c4015a0;
        this.f9516c = new C4054z(c4015a0.m15230e());
        this.f9524k = -9223372036854775807L;
    }

    /* renamed from: b */
    public static long m9472b(C4054z c4054z) {
        return c4054z.m15601h((c4054z.m15601h(2) + 1) * 8);
    }

    @Override // p106h4.InterfaceC2322m
    /* renamed from: a */
    public void mo9333a(C4015a0 c4015a0) {
        C4014a.m15202h(this.f9517d);
        while (c4015a0.m15226a() > 0) {
            int i10 = this.f9520g;
            if (i10 != 0) {
                if (i10 == 1) {
                    int m15210G = c4015a0.m15210G();
                    if ((m15210G & 224) == 224) {
                        this.f9523j = m15210G;
                        this.f9520g = 2;
                    } else if (m15210G != 86) {
                        this.f9520g = 0;
                    }
                } else if (i10 == 2) {
                    int m15210G2 = ((this.f9523j & (-225)) << 8) | c4015a0.m15210G();
                    this.f9522i = m15210G2;
                    if (m15210G2 > this.f9515b.m15230e().length) {
                        m9479m(this.f9522i);
                    }
                    this.f9521h = 0;
                    this.f9520g = 3;
                } else {
                    if (i10 != 3) {
                        throw new IllegalStateException();
                    }
                    int min = Math.min(c4015a0.m15226a(), this.f9522i - this.f9521h);
                    c4015a0.m15237l(this.f9516c.f14602a, this.f9521h, min);
                    int i11 = this.f9521h + min;
                    this.f9521h = i11;
                    if (i11 == this.f9522i) {
                        this.f9516c.m15609p(0);
                        m9473g(this.f9516c);
                        this.f9520g = 0;
                    }
                }
            } else if (c4015a0.m15210G() == 86) {
                this.f9520g = 1;
            }
        }
    }

    @Override // p106h4.InterfaceC2322m
    /* renamed from: c */
    public void mo9335c() {
        this.f9520g = 0;
        this.f9524k = -9223372036854775807L;
        this.f9525l = false;
    }

    @Override // p106h4.InterfaceC2322m
    /* renamed from: d */
    public void mo9336d() {
    }

    @Override // p106h4.InterfaceC2322m
    /* renamed from: e */
    public void mo9337e(InterfaceC5573m interfaceC5573m, InterfaceC2316i0.d dVar) {
        dVar.m9412a();
        this.f9517d = interfaceC5573m.mo3032e(dVar.m9414c(), 1);
        this.f9518e = dVar.m9413b();
    }

    @Override // p106h4.InterfaceC2322m
    /* renamed from: f */
    public void mo9338f(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.f9524k = j10;
        }
    }

    /* renamed from: g */
    public final void m9473g(C4054z c4054z) {
        if (!c4054z.m15600g()) {
            this.f9525l = true;
            m9478l(c4054z);
        } else if (!this.f9525l) {
            return;
        }
        if (this.f9526m != 0) {
            throw C4499t2.m17594a(null, null);
        }
        if (this.f9527n != 0) {
            throw C4499t2.m17594a(null, null);
        }
        m9477k(c4054z, m9476j(c4054z));
        if (this.f9529p) {
            c4054z.m15611r((int) this.f9530q);
        }
    }

    /* renamed from: h */
    public final int m9474h(C4054z c4054z) {
        int m15595b = c4054z.m15595b();
        C4805a.b m18860e = C4805a.m18860e(c4054z, true);
        this.f9534u = m18860e.f17867c;
        this.f9531r = m18860e.f17865a;
        this.f9533t = m18860e.f17866b;
        return m15595b - c4054z.m15595b();
    }

    /* renamed from: i */
    public final void m9475i(C4054z c4054z) {
        int i10;
        int m15601h = c4054z.m15601h(3);
        this.f9528o = m15601h;
        if (m15601h == 0) {
            i10 = 8;
        } else {
            if (m15601h != 1) {
                if (m15601h == 3 || m15601h == 4 || m15601h == 5) {
                    c4054z.m15611r(6);
                    return;
                } else {
                    if (m15601h != 6 && m15601h != 7) {
                        throw new IllegalStateException();
                    }
                    c4054z.m15611r(1);
                    return;
                }
            }
            i10 = 9;
        }
        c4054z.m15611r(i10);
    }

    /* renamed from: j */
    public final int m9476j(C4054z c4054z) {
        int m15601h;
        if (this.f9528o != 0) {
            throw C4499t2.m17594a(null, null);
        }
        int i10 = 0;
        do {
            m15601h = c4054z.m15601h(8);
            i10 += m15601h;
        } while (m15601h == 255);
        return i10;
    }

    /* renamed from: k */
    public final void m9477k(C4054z c4054z, int i10) {
        int m15598e = c4054z.m15598e();
        if ((m15598e & 7) == 0) {
            this.f9515b.m15223T(m15598e >> 3);
        } else {
            c4054z.m15602i(this.f9515b.m15230e(), 0, i10 * 8);
            this.f9515b.m15223T(0);
        }
        this.f9517d.m22408e(this.f9515b, i10);
        long j10 = this.f9524k;
        if (j10 != -9223372036854775807L) {
            this.f9517d.mo4851a(j10, 1, i10, 0, null);
            this.f9524k += this.f9532s;
        }
    }

    /* renamed from: l */
    public final void m9478l(C4054z c4054z) {
        boolean m15600g;
        int m15601h = c4054z.m15601h(1);
        int m15601h2 = m15601h == 1 ? c4054z.m15601h(1) : 0;
        this.f9526m = m15601h2;
        if (m15601h2 != 0) {
            throw C4499t2.m17594a(null, null);
        }
        if (m15601h == 1) {
            m9472b(c4054z);
        }
        if (!c4054z.m15600g()) {
            throw C4499t2.m17594a(null, null);
        }
        this.f9527n = c4054z.m15601h(6);
        int m15601h3 = c4054z.m15601h(4);
        int m15601h4 = c4054z.m15601h(3);
        if (m15601h3 != 0 || m15601h4 != 0) {
            throw C4499t2.m17594a(null, null);
        }
        if (m15601h == 0) {
            int m15598e = c4054z.m15598e();
            int m9474h = m9474h(c4054z);
            c4054z.m15609p(m15598e);
            byte[] bArr = new byte[(m9474h + 7) / 8];
            c4054z.m15602i(bArr, 0, m9474h);
            C4463m1 m17448G = new C4463m1.b().m17462U(this.f9518e).m17474g0("audio/mp4a-latm").m17452K(this.f9534u).m17451J(this.f9533t).m17475h0(this.f9531r).m17463V(Collections.singletonList(bArr)).m17465X(this.f9514a).m17448G();
            if (!m17448G.equals(this.f9519f)) {
                this.f9519f = m17448G;
                this.f9532s = 1024000000 / m17448G.f16486G;
                this.f9517d.mo4852b(m17448G);
            }
        } else {
            c4054z.m15611r(((int) m9472b(c4054z)) - m9474h(c4054z));
        }
        m9475i(c4054z);
        boolean m15600g2 = c4054z.m15600g();
        this.f9529p = m15600g2;
        this.f9530q = 0L;
        if (m15600g2) {
            if (m15601h == 1) {
                this.f9530q = m9472b(c4054z);
            }
            do {
                m15600g = c4054z.m15600g();
                this.f9530q = (this.f9530q << 8) + c4054z.m15601h(8);
            } while (m15600g);
        }
        if (c4054z.m15600g()) {
            c4054z.m15611r(8);
        }
    }

    /* renamed from: m */
    public final void m9479m(int i10) {
        this.f9515b.m15219P(i10);
        this.f9516c.m15607n(this.f9515b.m15230e());
    }
}
