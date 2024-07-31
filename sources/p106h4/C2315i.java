package p106h4;

import java.util.Arrays;
import java.util.Collections;
import p106h4.InterfaceC2316i0;
import p222p5.C4014a;
import p222p5.C4015a0;
import p222p5.C4041n0;
import p222p5.C4046r;
import p222p5.C4054z;
import p264s3.C4463m1;
import p289u3.C4805a;
import p333x3.C5570j;
import p333x3.InterfaceC5559b0;
import p333x3.InterfaceC5573m;

/* renamed from: h4.i */
/* loaded from: classes.dex */
public final class C2315i implements InterfaceC2322m {

    /* renamed from: v */
    public static final byte[] f9329v = {73, 68, 51};

    /* renamed from: a */
    public final boolean f9330a;

    /* renamed from: b */
    public final C4054z f9331b;

    /* renamed from: c */
    public final C4015a0 f9332c;

    /* renamed from: d */
    public final String f9333d;

    /* renamed from: e */
    public String f9334e;

    /* renamed from: f */
    public InterfaceC5559b0 f9335f;

    /* renamed from: g */
    public InterfaceC5559b0 f9336g;

    /* renamed from: h */
    public int f9337h;

    /* renamed from: i */
    public int f9338i;

    /* renamed from: j */
    public int f9339j;

    /* renamed from: k */
    public boolean f9340k;

    /* renamed from: l */
    public boolean f9341l;

    /* renamed from: m */
    public int f9342m;

    /* renamed from: n */
    public int f9343n;

    /* renamed from: o */
    public int f9344o;

    /* renamed from: p */
    public boolean f9345p;

    /* renamed from: q */
    public long f9346q;

    /* renamed from: r */
    public int f9347r;

    /* renamed from: s */
    public long f9348s;

    /* renamed from: t */
    public InterfaceC5559b0 f9349t;

    /* renamed from: u */
    public long f9350u;

    public C2315i(boolean z10) {
        this(z10, null);
    }

    public C2315i(boolean z10, String str) {
        this.f9331b = new C4054z(new byte[7]);
        this.f9332c = new C4015a0(Arrays.copyOf(f9329v, 10));
        m9405s();
        this.f9342m = -1;
        this.f9343n = -1;
        this.f9346q = -9223372036854775807L;
        this.f9348s = -9223372036854775807L;
        this.f9330a = z10;
        this.f9333d = str;
    }

    /* renamed from: m */
    public static boolean m9392m(int i10) {
        return (i10 & 65526) == 65520;
    }

    @Override // p106h4.InterfaceC2322m
    /* renamed from: a */
    public void mo9333a(C4015a0 c4015a0) {
        m9393b();
        while (c4015a0.m15226a() > 0) {
            int i10 = this.f9337h;
            if (i10 == 0) {
                m9397j(c4015a0);
            } else if (i10 == 1) {
                m9394g(c4015a0);
            } else if (i10 != 2) {
                if (i10 == 3) {
                    if (m9396i(c4015a0, this.f9331b.f14602a, this.f9340k ? 7 : 5)) {
                        m9400n();
                    }
                } else {
                    if (i10 != 4) {
                        throw new IllegalStateException();
                    }
                    m9402p(c4015a0);
                }
            } else if (m9396i(c4015a0, this.f9332c.m15230e(), 10)) {
                m9401o();
            }
        }
    }

    /* renamed from: b */
    public final void m9393b() {
        C4014a.m15199e(this.f9335f);
        C4041n0.m15463j(this.f9349t);
        C4041n0.m15463j(this.f9336g);
    }

    @Override // p106h4.InterfaceC2322m
    /* renamed from: c */
    public void mo9335c() {
        this.f9348s = -9223372036854775807L;
        m9403q();
    }

    @Override // p106h4.InterfaceC2322m
    /* renamed from: d */
    public void mo9336d() {
    }

    @Override // p106h4.InterfaceC2322m
    /* renamed from: e */
    public void mo9337e(InterfaceC5573m interfaceC5573m, InterfaceC2316i0.d dVar) {
        dVar.m9412a();
        this.f9334e = dVar.m9413b();
        InterfaceC5559b0 mo3032e = interfaceC5573m.mo3032e(dVar.m9414c(), 1);
        this.f9335f = mo3032e;
        this.f9349t = mo3032e;
        if (!this.f9330a) {
            this.f9336g = new C5570j();
            return;
        }
        dVar.m9412a();
        InterfaceC5559b0 mo3032e2 = interfaceC5573m.mo3032e(dVar.m9414c(), 5);
        this.f9336g = mo3032e2;
        mo3032e2.mo4852b(new C4463m1.b().m17462U(dVar.m9413b()).m17474g0("application/id3").m17448G());
    }

    @Override // p106h4.InterfaceC2322m
    /* renamed from: f */
    public void mo9338f(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.f9348s = j10;
        }
    }

    /* renamed from: g */
    public final void m9394g(C4015a0 c4015a0) {
        if (c4015a0.m15226a() == 0) {
            return;
        }
        this.f9331b.f14602a[0] = c4015a0.m15230e()[c4015a0.m15231f()];
        this.f9331b.m15609p(2);
        int m15601h = this.f9331b.m15601h(4);
        int i10 = this.f9343n;
        if (i10 != -1 && m15601h != i10) {
            m9403q();
            return;
        }
        if (!this.f9341l) {
            this.f9341l = true;
            this.f9342m = this.f9344o;
            this.f9343n = m15601h;
        }
        m9406t();
    }

    /* renamed from: h */
    public final boolean m9395h(C4015a0 c4015a0, int i10) {
        c4015a0.m15223T(i10 + 1);
        if (!m9409w(c4015a0, this.f9331b.f14602a, 1)) {
            return false;
        }
        this.f9331b.m15609p(4);
        int m15601h = this.f9331b.m15601h(1);
        int i11 = this.f9342m;
        if (i11 != -1 && m15601h != i11) {
            return false;
        }
        if (this.f9343n != -1) {
            if (!m9409w(c4015a0, this.f9331b.f14602a, 1)) {
                return true;
            }
            this.f9331b.m15609p(2);
            if (this.f9331b.m15601h(4) != this.f9343n) {
                return false;
            }
            c4015a0.m15223T(i10 + 2);
        }
        if (!m9409w(c4015a0, this.f9331b.f14602a, 4)) {
            return true;
        }
        this.f9331b.m15609p(14);
        int m15601h2 = this.f9331b.m15601h(13);
        if (m15601h2 < 7) {
            return false;
        }
        byte[] m15230e = c4015a0.m15230e();
        int m15232g = c4015a0.m15232g();
        int i12 = i10 + m15601h2;
        if (i12 >= m15232g) {
            return true;
        }
        if (m15230e[i12] == -1) {
            int i13 = i12 + 1;
            if (i13 == m15232g) {
                return true;
            }
            return m9399l((byte) -1, m15230e[i13]) && ((m15230e[i13] & 8) >> 3) == m15601h;
        }
        if (m15230e[i12] != 73) {
            return false;
        }
        int i14 = i12 + 1;
        if (i14 == m15232g) {
            return true;
        }
        if (m15230e[i14] != 68) {
            return false;
        }
        int i15 = i12 + 2;
        return i15 == m15232g || m15230e[i15] == 51;
    }

    /* renamed from: i */
    public final boolean m9396i(C4015a0 c4015a0, byte[] bArr, int i10) {
        int min = Math.min(c4015a0.m15226a(), i10 - this.f9338i);
        c4015a0.m15237l(bArr, this.f9338i, min);
        int i11 = this.f9338i + min;
        this.f9338i = i11;
        return i11 == i10;
    }

    /* renamed from: j */
    public final void m9397j(C4015a0 c4015a0) {
        int i10;
        byte[] m15230e = c4015a0.m15230e();
        int m15231f = c4015a0.m15231f();
        int m15232g = c4015a0.m15232g();
        while (m15231f < m15232g) {
            int i11 = m15231f + 1;
            int i12 = m15230e[m15231f] & 255;
            if (this.f9339j == 512 && m9399l((byte) -1, (byte) i12) && (this.f9341l || m9395h(c4015a0, i11 - 2))) {
                this.f9344o = (i12 & 8) >> 3;
                this.f9340k = (i12 & 1) == 0;
                if (this.f9341l) {
                    m9406t();
                } else {
                    m9404r();
                }
                c4015a0.m15223T(i11);
                return;
            }
            int i13 = this.f9339j;
            int i14 = i12 | i13;
            if (i14 != 329) {
                if (i14 == 511) {
                    this.f9339j = 512;
                } else if (i14 == 836) {
                    i10 = 1024;
                } else if (i14 == 1075) {
                    m9407u();
                    c4015a0.m15223T(i11);
                    return;
                } else if (i13 != 256) {
                    this.f9339j = 256;
                    i11--;
                }
                m15231f = i11;
            } else {
                i10 = 768;
            }
            this.f9339j = i10;
            m15231f = i11;
        }
        c4015a0.m15223T(m15231f);
    }

    /* renamed from: k */
    public long m9398k() {
        return this.f9346q;
    }

    /* renamed from: l */
    public final boolean m9399l(byte b10, byte b11) {
        return m9392m(((b10 & 255) << 8) | (b11 & 255));
    }

    /* renamed from: n */
    public final void m9400n() {
        this.f9331b.m15609p(0);
        if (this.f9345p) {
            this.f9331b.m15611r(10);
        } else {
            int m15601h = this.f9331b.m15601h(2) + 1;
            if (m15601h != 2) {
                C4046r.m15529i("AdtsReader", "Detected audio object type: " + m15601h + ", but assuming AAC LC.");
                m15601h = 2;
            }
            this.f9331b.m15611r(5);
            byte[] m18857b = C4805a.m18857b(m15601h, this.f9343n, this.f9331b.m15601h(3));
            C4805a.b m18861f = C4805a.m18861f(m18857b);
            C4463m1 m17448G = new C4463m1.b().m17462U(this.f9334e).m17474g0("audio/mp4a-latm").m17452K(m18861f.f17867c).m17451J(m18861f.f17866b).m17475h0(m18861f.f17865a).m17463V(Collections.singletonList(m18857b)).m17465X(this.f9333d).m17448G();
            this.f9346q = 1024000000 / m17448G.f16486G;
            this.f9335f.mo4852b(m17448G);
            this.f9345p = true;
        }
        this.f9331b.m15611r(4);
        int m15601h2 = (this.f9331b.m15601h(13) - 2) - 5;
        if (this.f9340k) {
            m15601h2 -= 2;
        }
        m9408v(this.f9335f, this.f9346q, 0, m15601h2);
    }

    /* renamed from: o */
    public final void m9401o() {
        this.f9336g.m22408e(this.f9332c, 10);
        this.f9332c.m15223T(6);
        m9408v(this.f9336g, 0L, 10, this.f9332c.m15209F() + 10);
    }

    /* renamed from: p */
    public final void m9402p(C4015a0 c4015a0) {
        int min = Math.min(c4015a0.m15226a(), this.f9347r - this.f9338i);
        this.f9349t.m22408e(c4015a0, min);
        int i10 = this.f9338i + min;
        this.f9338i = i10;
        int i11 = this.f9347r;
        if (i10 == i11) {
            long j10 = this.f9348s;
            if (j10 != -9223372036854775807L) {
                this.f9349t.mo4851a(j10, 1, i11, 0, null);
                this.f9348s += this.f9350u;
            }
            m9405s();
        }
    }

    /* renamed from: q */
    public final void m9403q() {
        this.f9341l = false;
        m9405s();
    }

    /* renamed from: r */
    public final void m9404r() {
        this.f9337h = 1;
        this.f9338i = 0;
    }

    /* renamed from: s */
    public final void m9405s() {
        this.f9337h = 0;
        this.f9338i = 0;
        this.f9339j = 256;
    }

    /* renamed from: t */
    public final void m9406t() {
        this.f9337h = 3;
        this.f9338i = 0;
    }

    /* renamed from: u */
    public final void m9407u() {
        this.f9337h = 2;
        this.f9338i = f9329v.length;
        this.f9347r = 0;
        this.f9332c.m15223T(0);
    }

    /* renamed from: v */
    public final void m9408v(InterfaceC5559b0 interfaceC5559b0, long j10, int i10, int i11) {
        this.f9337h = 4;
        this.f9338i = i10;
        this.f9349t = interfaceC5559b0;
        this.f9350u = j10;
        this.f9347r = i11;
    }

    /* renamed from: w */
    public final boolean m9409w(C4015a0 c4015a0, byte[] bArr, int i10) {
        if (c4015a0.m15226a() < i10) {
            return false;
        }
        c4015a0.m15237l(bArr, 0, i10);
        return true;
    }
}
