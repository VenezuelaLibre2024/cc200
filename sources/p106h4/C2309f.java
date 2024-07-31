package p106h4;

import p106h4.InterfaceC2316i0;
import p222p5.C4014a;
import p222p5.C4015a0;
import p222p5.C4054z;
import p264s3.C4463m1;
import p289u3.C4809c;
import p333x3.InterfaceC5559b0;
import p333x3.InterfaceC5573m;

/* renamed from: h4.f */
/* loaded from: classes.dex */
public final class C2309f implements InterfaceC2322m {

    /* renamed from: a */
    public final C4054z f9265a;

    /* renamed from: b */
    public final C4015a0 f9266b;

    /* renamed from: c */
    public final String f9267c;

    /* renamed from: d */
    public String f9268d;

    /* renamed from: e */
    public InterfaceC5559b0 f9269e;

    /* renamed from: f */
    public int f9270f;

    /* renamed from: g */
    public int f9271g;

    /* renamed from: h */
    public boolean f9272h;

    /* renamed from: i */
    public boolean f9273i;

    /* renamed from: j */
    public long f9274j;

    /* renamed from: k */
    public C4463m1 f9275k;

    /* renamed from: l */
    public int f9276l;

    /* renamed from: m */
    public long f9277m;

    public C2309f() {
        this(null);
    }

    public C2309f(String str) {
        C4054z c4054z = new C4054z(new byte[16]);
        this.f9265a = c4054z;
        this.f9266b = new C4015a0(c4054z.f14602a);
        this.f9270f = 0;
        this.f9271g = 0;
        this.f9272h = false;
        this.f9273i = false;
        this.f9277m = -9223372036854775807L;
        this.f9267c = str;
    }

    @Override // p106h4.InterfaceC2322m
    /* renamed from: a */
    public void mo9333a(C4015a0 c4015a0) {
        C4014a.m15202h(this.f9269e);
        while (c4015a0.m15226a() > 0) {
            int i10 = this.f9270f;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        int min = Math.min(c4015a0.m15226a(), this.f9276l - this.f9271g);
                        this.f9269e.m22408e(c4015a0, min);
                        int i11 = this.f9271g + min;
                        this.f9271g = i11;
                        int i12 = this.f9276l;
                        if (i11 == i12) {
                            long j10 = this.f9277m;
                            if (j10 != -9223372036854775807L) {
                                this.f9269e.mo4851a(j10, 1, i12, 0, null);
                                this.f9277m += this.f9274j;
                            }
                            this.f9270f = 0;
                        }
                    }
                } else if (m9350b(c4015a0, this.f9266b.m15230e(), 16)) {
                    m9351g();
                    this.f9266b.m15223T(0);
                    this.f9269e.m22408e(this.f9266b, 16);
                    this.f9270f = 2;
                }
            } else if (m9352h(c4015a0)) {
                this.f9270f = 1;
                this.f9266b.m15230e()[0] = -84;
                this.f9266b.m15230e()[1] = (byte) (this.f9273i ? 65 : 64);
                this.f9271g = 2;
            }
        }
    }

    /* renamed from: b */
    public final boolean m9350b(C4015a0 c4015a0, byte[] bArr, int i10) {
        int min = Math.min(c4015a0.m15226a(), i10 - this.f9271g);
        c4015a0.m15237l(bArr, this.f9271g, min);
        int i11 = this.f9271g + min;
        this.f9271g = i11;
        return i11 == i10;
    }

    @Override // p106h4.InterfaceC2322m
    /* renamed from: c */
    public void mo9335c() {
        this.f9270f = 0;
        this.f9271g = 0;
        this.f9272h = false;
        this.f9273i = false;
        this.f9277m = -9223372036854775807L;
    }

    @Override // p106h4.InterfaceC2322m
    /* renamed from: d */
    public void mo9336d() {
    }

    @Override // p106h4.InterfaceC2322m
    /* renamed from: e */
    public void mo9337e(InterfaceC5573m interfaceC5573m, InterfaceC2316i0.d dVar) {
        dVar.m9412a();
        this.f9268d = dVar.m9413b();
        this.f9269e = interfaceC5573m.mo3032e(dVar.m9414c(), 1);
    }

    @Override // p106h4.InterfaceC2322m
    /* renamed from: f */
    public void mo9338f(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.f9277m = j10;
        }
    }

    /* renamed from: g */
    public final void m9351g() {
        this.f9265a.m15609p(0);
        C4809c.b m18998d = C4809c.m18998d(this.f9265a);
        C4463m1 c4463m1 = this.f9275k;
        if (c4463m1 == null || m18998d.f17990c != c4463m1.f16485F || m18998d.f17989b != c4463m1.f16486G || !"audio/ac4".equals(c4463m1.f16506s)) {
            C4463m1 m17448G = new C4463m1.b().m17462U(this.f9268d).m17474g0("audio/ac4").m17451J(m18998d.f17990c).m17475h0(m18998d.f17989b).m17465X(this.f9267c).m17448G();
            this.f9275k = m17448G;
            this.f9269e.mo4852b(m17448G);
        }
        this.f9276l = m18998d.f17991d;
        this.f9274j = (m18998d.f17992e * 1000000) / this.f9275k.f16486G;
    }

    /* renamed from: h */
    public final boolean m9352h(C4015a0 c4015a0) {
        int m15210G;
        while (true) {
            if (c4015a0.m15226a() <= 0) {
                return false;
            }
            if (this.f9272h) {
                m15210G = c4015a0.m15210G();
                this.f9272h = m15210G == 172;
                if (m15210G == 64 || m15210G == 65) {
                    break;
                }
            } else {
                this.f9272h = c4015a0.m15210G() == 172;
            }
        }
        this.f9273i = m15210G == 65;
        return true;
    }
}
