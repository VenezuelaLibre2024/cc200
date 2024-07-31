package p106h4;

import p106h4.InterfaceC2316i0;
import p222p5.C4014a;
import p222p5.C4015a0;
import p222p5.C4041n0;
import p222p5.C4054z;
import p264s3.C4463m1;
import p289u3.C4807b;
import p333x3.InterfaceC5559b0;
import p333x3.InterfaceC5573m;

/* renamed from: h4.c */
/* loaded from: classes.dex */
public final class C2303c implements InterfaceC2322m {

    /* renamed from: a */
    public final C4054z f9236a;

    /* renamed from: b */
    public final C4015a0 f9237b;

    /* renamed from: c */
    public final String f9238c;

    /* renamed from: d */
    public String f9239d;

    /* renamed from: e */
    public InterfaceC5559b0 f9240e;

    /* renamed from: f */
    public int f9241f;

    /* renamed from: g */
    public int f9242g;

    /* renamed from: h */
    public boolean f9243h;

    /* renamed from: i */
    public long f9244i;

    /* renamed from: j */
    public C4463m1 f9245j;

    /* renamed from: k */
    public int f9246k;

    /* renamed from: l */
    public long f9247l;

    public C2303c() {
        this(null);
    }

    public C2303c(String str) {
        C4054z c4054z = new C4054z(new byte[128]);
        this.f9236a = c4054z;
        this.f9237b = new C4015a0(c4054z.f14602a);
        this.f9241f = 0;
        this.f9247l = -9223372036854775807L;
        this.f9238c = str;
    }

    @Override // p106h4.InterfaceC2322m
    /* renamed from: a */
    public void mo9333a(C4015a0 c4015a0) {
        C4014a.m15202h(this.f9240e);
        while (c4015a0.m15226a() > 0) {
            int i10 = this.f9241f;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        int min = Math.min(c4015a0.m15226a(), this.f9246k - this.f9242g);
                        this.f9240e.m22408e(c4015a0, min);
                        int i11 = this.f9242g + min;
                        this.f9242g = i11;
                        int i12 = this.f9246k;
                        if (i11 == i12) {
                            long j10 = this.f9247l;
                            if (j10 != -9223372036854775807L) {
                                this.f9240e.mo4851a(j10, 1, i12, 0, null);
                                this.f9247l += this.f9244i;
                            }
                            this.f9241f = 0;
                        }
                    }
                } else if (m9334b(c4015a0, this.f9237b.m15230e(), 128)) {
                    m9339g();
                    this.f9237b.m15223T(0);
                    this.f9240e.m22408e(this.f9237b, 128);
                    this.f9241f = 2;
                }
            } else if (m9340h(c4015a0)) {
                this.f9241f = 1;
                this.f9237b.m15230e()[0] = 11;
                this.f9237b.m15230e()[1] = 119;
                this.f9242g = 2;
            }
        }
    }

    /* renamed from: b */
    public final boolean m9334b(C4015a0 c4015a0, byte[] bArr, int i10) {
        int min = Math.min(c4015a0.m15226a(), i10 - this.f9242g);
        c4015a0.m15237l(bArr, this.f9242g, min);
        int i11 = this.f9242g + min;
        this.f9242g = i11;
        return i11 == i10;
    }

    @Override // p106h4.InterfaceC2322m
    /* renamed from: c */
    public void mo9335c() {
        this.f9241f = 0;
        this.f9242g = 0;
        this.f9243h = false;
        this.f9247l = -9223372036854775807L;
    }

    @Override // p106h4.InterfaceC2322m
    /* renamed from: d */
    public void mo9336d() {
    }

    @Override // p106h4.InterfaceC2322m
    /* renamed from: e */
    public void mo9337e(InterfaceC5573m interfaceC5573m, InterfaceC2316i0.d dVar) {
        dVar.m9412a();
        this.f9239d = dVar.m9413b();
        this.f9240e = interfaceC5573m.mo3032e(dVar.m9414c(), 1);
    }

    @Override // p106h4.InterfaceC2322m
    /* renamed from: f */
    public void mo9338f(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.f9247l = j10;
        }
    }

    /* renamed from: g */
    public final void m9339g() {
        this.f9236a.m15609p(0);
        C4807b.b m18977f = C4807b.m18977f(this.f9236a);
        C4463m1 c4463m1 = this.f9245j;
        if (c4463m1 == null || m18977f.f17971d != c4463m1.f16485F || m18977f.f17970c != c4463m1.f16486G || !C4041n0.m15449c(m18977f.f17968a, c4463m1.f16506s)) {
            C4463m1.b m17469b0 = new C4463m1.b().m17462U(this.f9239d).m17474g0(m18977f.f17968a).m17451J(m18977f.f17971d).m17475h0(m18977f.f17970c).m17465X(this.f9238c).m17469b0(m18977f.f17974g);
            if ("audio/ac3".equals(m18977f.f17968a)) {
                m17469b0.m17450I(m18977f.f17974g);
            }
            C4463m1 m17448G = m17469b0.m17448G();
            this.f9245j = m17448G;
            this.f9240e.mo4852b(m17448G);
        }
        this.f9246k = m18977f.f17972e;
        this.f9244i = (m18977f.f17973f * 1000000) / this.f9245j.f16486G;
    }

    /* renamed from: h */
    public final boolean m9340h(C4015a0 c4015a0) {
        while (true) {
            boolean z10 = false;
            if (c4015a0.m15226a() <= 0) {
                return false;
            }
            if (this.f9243h) {
                int m15210G = c4015a0.m15210G();
                if (m15210G == 119) {
                    this.f9243h = false;
                    return true;
                }
                if (m15210G != 11) {
                    this.f9243h = z10;
                }
                z10 = true;
                this.f9243h = z10;
            } else {
                if (c4015a0.m15210G() != 11) {
                    this.f9243h = z10;
                }
                z10 = true;
                this.f9243h = z10;
            }
        }
    }
}
