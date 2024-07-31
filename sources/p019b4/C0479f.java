package p019b4;

import p019b4.AbstractC0478e;
import p222p5.C4015a0;
import p222p5.C4051w;
import p236q5.C4168a;
import p264s3.C4463m1;
import p333x3.InterfaceC5559b0;

/* renamed from: b4.f */
/* loaded from: classes.dex */
public final class C0479f extends AbstractC0478e {

    /* renamed from: b */
    public final C4015a0 f2266b;

    /* renamed from: c */
    public final C4015a0 f2267c;

    /* renamed from: d */
    public int f2268d;

    /* renamed from: e */
    public boolean f2269e;

    /* renamed from: f */
    public boolean f2270f;

    /* renamed from: g */
    public int f2271g;

    public C0479f(InterfaceC5559b0 interfaceC5559b0) {
        super(interfaceC5559b0);
        this.f2266b = new C4015a0(C4051w.f14559a);
        this.f2267c = new C4015a0(4);
    }

    @Override // p019b4.AbstractC0478e
    /* renamed from: b */
    public boolean mo2388b(C4015a0 c4015a0) {
        int m15210G = c4015a0.m15210G();
        int i10 = (m15210G >> 4) & 15;
        int i11 = m15210G & 15;
        if (i11 == 7) {
            this.f2271g = i10;
            return i10 != 5;
        }
        throw new AbstractC0478e.a("Video format not supported: " + i11);
    }

    @Override // p019b4.AbstractC0478e
    /* renamed from: c */
    public boolean mo2389c(C4015a0 c4015a0, long j10) {
        int m15210G = c4015a0.m15210G();
        long m15242q = j10 + (c4015a0.m15242q() * 1000);
        if (m15210G == 0 && !this.f2269e) {
            C4015a0 c4015a02 = new C4015a0(new byte[c4015a0.m15226a()]);
            c4015a0.m15237l(c4015a02.m15230e(), 0, c4015a0.m15226a());
            C4168a m16027b = C4168a.m16027b(c4015a02);
            this.f2268d = m16027b.f14978b;
            this.f2265a.mo4852b(new C4463m1.b().m17474g0("video/avc").m17452K(m16027b.f14982f).m17481n0(m16027b.f14979c).m17460S(m16027b.f14980d).m17470c0(m16027b.f14981e).m17463V(m16027b.f14977a).m17448G());
            this.f2269e = true;
            return false;
        }
        if (m15210G != 1 || !this.f2269e) {
            return false;
        }
        int i10 = this.f2271g == 1 ? 1 : 0;
        if (!this.f2270f && i10 == 0) {
            return false;
        }
        byte[] m15230e = this.f2267c.m15230e();
        m15230e[0] = 0;
        m15230e[1] = 0;
        m15230e[2] = 0;
        int i11 = 4 - this.f2268d;
        int i12 = 0;
        while (c4015a0.m15226a() > 0) {
            c4015a0.m15237l(this.f2267c.m15230e(), i11, this.f2268d);
            this.f2267c.m15223T(0);
            int m15214K = this.f2267c.m15214K();
            this.f2266b.m15223T(0);
            this.f2265a.m22408e(this.f2266b, 4);
            this.f2265a.m22408e(c4015a0, m15214K);
            i12 = i12 + 4 + m15214K;
        }
        this.f2265a.mo4851a(m15242q, i10, i12, 0, null);
        this.f2270f = true;
        return true;
    }
}
