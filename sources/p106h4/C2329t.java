package p106h4;

import p106h4.InterfaceC2316i0;
import p222p5.C4014a;
import p222p5.C4015a0;
import p264s3.C4463m1;
import p289u3.C4816f0;
import p333x3.InterfaceC5559b0;
import p333x3.InterfaceC5573m;

/* renamed from: h4.t */
/* loaded from: classes.dex */
public final class C2329t implements InterfaceC2322m {

    /* renamed from: a */
    public final C4015a0 f9535a;

    /* renamed from: b */
    public final C4816f0.a f9536b;

    /* renamed from: c */
    public final String f9537c;

    /* renamed from: d */
    public InterfaceC5559b0 f9538d;

    /* renamed from: e */
    public String f9539e;

    /* renamed from: f */
    public int f9540f;

    /* renamed from: g */
    public int f9541g;

    /* renamed from: h */
    public boolean f9542h;

    /* renamed from: i */
    public boolean f9543i;

    /* renamed from: j */
    public long f9544j;

    /* renamed from: k */
    public int f9545k;

    /* renamed from: l */
    public long f9546l;

    public C2329t() {
        this(null);
    }

    public C2329t(String str) {
        this.f9540f = 0;
        C4015a0 c4015a0 = new C4015a0(4);
        this.f9535a = c4015a0;
        c4015a0.m15230e()[0] = -1;
        this.f9536b = new C4816f0.a();
        this.f9546l = -9223372036854775807L;
        this.f9537c = str;
    }

    @Override // p106h4.InterfaceC2322m
    /* renamed from: a */
    public void mo9333a(C4015a0 c4015a0) {
        C4014a.m15202h(this.f9538d);
        while (c4015a0.m15226a() > 0) {
            int i10 = this.f9540f;
            if (i10 == 0) {
                m9480b(c4015a0);
            } else if (i10 == 1) {
                m9482h(c4015a0);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException();
                }
                m9481g(c4015a0);
            }
        }
    }

    /* renamed from: b */
    public final void m9480b(C4015a0 c4015a0) {
        byte[] m15230e = c4015a0.m15230e();
        int m15232g = c4015a0.m15232g();
        for (int m15231f = c4015a0.m15231f(); m15231f < m15232g; m15231f++) {
            boolean z10 = (m15230e[m15231f] & 255) == 255;
            boolean z11 = this.f9543i && (m15230e[m15231f] & 224) == 224;
            this.f9543i = z10;
            if (z11) {
                c4015a0.m15223T(m15231f + 1);
                this.f9543i = false;
                this.f9535a.m15230e()[1] = m15230e[m15231f];
                this.f9541g = 2;
                this.f9540f = 1;
                return;
            }
        }
        c4015a0.m15223T(m15232g);
    }

    @Override // p106h4.InterfaceC2322m
    /* renamed from: c */
    public void mo9335c() {
        this.f9540f = 0;
        this.f9541g = 0;
        this.f9543i = false;
        this.f9546l = -9223372036854775807L;
    }

    @Override // p106h4.InterfaceC2322m
    /* renamed from: d */
    public void mo9336d() {
    }

    @Override // p106h4.InterfaceC2322m
    /* renamed from: e */
    public void mo9337e(InterfaceC5573m interfaceC5573m, InterfaceC2316i0.d dVar) {
        dVar.m9412a();
        this.f9539e = dVar.m9413b();
        this.f9538d = interfaceC5573m.mo3032e(dVar.m9414c(), 1);
    }

    @Override // p106h4.InterfaceC2322m
    /* renamed from: f */
    public void mo9338f(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.f9546l = j10;
        }
    }

    /* renamed from: g */
    public final void m9481g(C4015a0 c4015a0) {
        int min = Math.min(c4015a0.m15226a(), this.f9545k - this.f9541g);
        this.f9538d.m22408e(c4015a0, min);
        int i10 = this.f9541g + min;
        this.f9541g = i10;
        int i11 = this.f9545k;
        if (i10 < i11) {
            return;
        }
        long j10 = this.f9546l;
        if (j10 != -9223372036854775807L) {
            this.f9538d.mo4851a(j10, 1, i11, 0, null);
            this.f9546l += this.f9544j;
        }
        this.f9541g = 0;
        this.f9540f = 0;
    }

    /* renamed from: h */
    public final void m9482h(C4015a0 c4015a0) {
        int min = Math.min(c4015a0.m15226a(), 4 - this.f9541g);
        c4015a0.m15237l(this.f9535a.m15230e(), this.f9541g, min);
        int i10 = this.f9541g + min;
        this.f9541g = i10;
        if (i10 < 4) {
            return;
        }
        this.f9535a.m15223T(0);
        if (!this.f9536b.m19063a(this.f9535a.m15241p())) {
            this.f9541g = 0;
            this.f9540f = 1;
            return;
        }
        this.f9545k = this.f9536b.f18046c;
        if (!this.f9542h) {
            this.f9544j = (r8.f18050g * 1000000) / r8.f18047d;
            this.f9538d.mo4852b(new C4463m1.b().m17462U(this.f9539e).m17474g0(this.f9536b.f18045b).m17466Y(4096).m17451J(this.f9536b.f18048e).m17475h0(this.f9536b.f18047d).m17465X(this.f9537c).m17448G());
            this.f9542h = true;
        }
        this.f9535a.m15223T(0);
        this.f9538d.m22408e(this.f9535a, 4);
        this.f9540f = 2;
    }
}
