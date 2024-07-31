package p106h4;

import java.util.Collections;
import p106h4.InterfaceC2316i0;
import p222p5.C4014a;
import p222p5.C4015a0;
import p222p5.C4022e;
import p222p5.C4041n0;
import p222p5.C4051w;
import p264s3.C4463m1;
import p333x3.InterfaceC5559b0;
import p333x3.InterfaceC5573m;

/* renamed from: h4.q */
/* loaded from: classes.dex */
public final class C2326q implements InterfaceC2322m {

    /* renamed from: a */
    public final C2306d0 f9481a;

    /* renamed from: b */
    public String f9482b;

    /* renamed from: c */
    public InterfaceC5559b0 f9483c;

    /* renamed from: d */
    public a f9484d;

    /* renamed from: e */
    public boolean f9485e;

    /* renamed from: l */
    public long f9492l;

    /* renamed from: f */
    public final boolean[] f9486f = new boolean[3];

    /* renamed from: g */
    public final C2330u f9487g = new C2330u(32, 128);

    /* renamed from: h */
    public final C2330u f9488h = new C2330u(33, 128);

    /* renamed from: i */
    public final C2330u f9489i = new C2330u(34, 128);

    /* renamed from: j */
    public final C2330u f9490j = new C2330u(39, 128);

    /* renamed from: k */
    public final C2330u f9491k = new C2330u(40, 128);

    /* renamed from: m */
    public long f9493m = -9223372036854775807L;

    /* renamed from: n */
    public final C4015a0 f9494n = new C4015a0();

    /* renamed from: h4.q$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final InterfaceC5559b0 f9495a;

        /* renamed from: b */
        public long f9496b;

        /* renamed from: c */
        public boolean f9497c;

        /* renamed from: d */
        public int f9498d;

        /* renamed from: e */
        public long f9499e;

        /* renamed from: f */
        public boolean f9500f;

        /* renamed from: g */
        public boolean f9501g;

        /* renamed from: h */
        public boolean f9502h;

        /* renamed from: i */
        public boolean f9503i;

        /* renamed from: j */
        public boolean f9504j;

        /* renamed from: k */
        public long f9505k;

        /* renamed from: l */
        public long f9506l;

        /* renamed from: m */
        public boolean f9507m;

        public a(InterfaceC5559b0 interfaceC5559b0) {
            this.f9495a = interfaceC5559b0;
        }

        /* renamed from: b */
        public static boolean m9465b(int i10) {
            return (32 <= i10 && i10 <= 35) || i10 == 39;
        }

        /* renamed from: c */
        public static boolean m9466c(int i10) {
            return i10 < 32 || i10 == 40;
        }

        /* renamed from: a */
        public void m9467a(long j10, int i10, boolean z10) {
            if (this.f9504j && this.f9501g) {
                this.f9507m = this.f9497c;
                this.f9504j = false;
            } else if (this.f9502h || this.f9501g) {
                if (z10 && this.f9503i) {
                    m9468d(i10 + ((int) (j10 - this.f9496b)));
                }
                this.f9505k = this.f9496b;
                this.f9506l = this.f9499e;
                this.f9507m = this.f9497c;
                this.f9503i = true;
            }
        }

        /* renamed from: d */
        public final void m9468d(int i10) {
            long j10 = this.f9506l;
            if (j10 == -9223372036854775807L) {
                return;
            }
            boolean z10 = this.f9507m;
            this.f9495a.mo4851a(j10, z10 ? 1 : 0, (int) (this.f9496b - this.f9505k), i10, null);
        }

        /* renamed from: e */
        public void m9469e(byte[] bArr, int i10, int i11) {
            if (this.f9500f) {
                int i12 = this.f9498d;
                int i13 = (i10 + 2) - i12;
                if (i13 >= i11) {
                    this.f9498d = i12 + (i11 - i10);
                } else {
                    this.f9501g = (bArr[i13] & 128) != 0;
                    this.f9500f = false;
                }
            }
        }

        /* renamed from: f */
        public void m9470f() {
            this.f9500f = false;
            this.f9501g = false;
            this.f9502h = false;
            this.f9503i = false;
            this.f9504j = false;
        }

        /* renamed from: g */
        public void m9471g(long j10, int i10, int i11, long j11, boolean z10) {
            this.f9501g = false;
            this.f9502h = false;
            this.f9499e = j11;
            this.f9498d = 0;
            this.f9496b = j10;
            if (!m9466c(i11)) {
                if (this.f9503i && !this.f9504j) {
                    if (z10) {
                        m9468d(i10);
                    }
                    this.f9503i = false;
                }
                if (m9465b(i11)) {
                    this.f9502h = !this.f9504j;
                    this.f9504j = true;
                }
            }
            boolean z11 = i11 >= 16 && i11 <= 21;
            this.f9497c = z11;
            this.f9500f = z11 || i11 <= 9;
        }
    }

    public C2326q(C2306d0 c2306d0) {
        this.f9481a = c2306d0;
    }

    /* renamed from: i */
    public static C4463m1 m9460i(String str, C2330u c2330u, C2330u c2330u2, C2330u c2330u3) {
        int i10 = c2330u.f9551e;
        byte[] bArr = new byte[c2330u2.f9551e + i10 + c2330u3.f9551e];
        System.arraycopy(c2330u.f9550d, 0, bArr, 0, i10);
        System.arraycopy(c2330u2.f9550d, 0, bArr, c2330u.f9551e, c2330u2.f9551e);
        System.arraycopy(c2330u3.f9550d, 0, bArr, c2330u.f9551e + c2330u2.f9551e, c2330u3.f9551e);
        C4051w.a m15572h = C4051w.m15572h(c2330u2.f9550d, 3, c2330u2.f9551e);
        return new C4463m1.b().m17462U(str).m17474g0("video/hevc").m17452K(C4022e.m15279c(m15572h.f14563a, m15572h.f14564b, m15572h.f14565c, m15572h.f14566d, m15572h.f14567e, m15572h.f14568f)).m17481n0(m15572h.f14570h).m17460S(m15572h.f14571i).m17470c0(m15572h.f14572j).m17463V(Collections.singletonList(bArr)).m17448G();
    }

    @Override // p106h4.InterfaceC2322m
    /* renamed from: a */
    public void mo9333a(C4015a0 c4015a0) {
        m9461b();
        while (c4015a0.m15226a() > 0) {
            int m15231f = c4015a0.m15231f();
            int m15232g = c4015a0.m15232g();
            byte[] m15230e = c4015a0.m15230e();
            this.f9492l += c4015a0.m15226a();
            this.f9483c.m22408e(c4015a0, c4015a0.m15226a());
            while (m15231f < m15232g) {
                int m15567c = C4051w.m15567c(m15230e, m15231f, m15232g, this.f9486f);
                if (m15567c == m15232g) {
                    m9463h(m15230e, m15231f, m15232g);
                    return;
                }
                int m15569e = C4051w.m15569e(m15230e, m15567c);
                int i10 = m15567c - m15231f;
                if (i10 > 0) {
                    m9463h(m15230e, m15231f, m15567c);
                }
                int i11 = m15232g - m15567c;
                long j10 = this.f9492l - i11;
                m9462g(j10, i11, i10 < 0 ? -i10 : 0, this.f9493m);
                m9464j(j10, i11, m15569e, this.f9493m);
                m15231f = m15567c + 3;
            }
        }
    }

    /* renamed from: b */
    public final void m9461b() {
        C4014a.m15202h(this.f9483c);
        C4041n0.m15463j(this.f9484d);
    }

    @Override // p106h4.InterfaceC2322m
    /* renamed from: c */
    public void mo9335c() {
        this.f9492l = 0L;
        this.f9493m = -9223372036854775807L;
        C4051w.m15565a(this.f9486f);
        this.f9487g.m9486d();
        this.f9488h.m9486d();
        this.f9489i.m9486d();
        this.f9490j.m9486d();
        this.f9491k.m9486d();
        a aVar = this.f9484d;
        if (aVar != null) {
            aVar.m9470f();
        }
    }

    @Override // p106h4.InterfaceC2322m
    /* renamed from: d */
    public void mo9336d() {
    }

    @Override // p106h4.InterfaceC2322m
    /* renamed from: e */
    public void mo9337e(InterfaceC5573m interfaceC5573m, InterfaceC2316i0.d dVar) {
        dVar.m9412a();
        this.f9482b = dVar.m9413b();
        InterfaceC5559b0 mo3032e = interfaceC5573m.mo3032e(dVar.m9414c(), 2);
        this.f9483c = mo3032e;
        this.f9484d = new a(mo3032e);
        this.f9481a.m9345b(interfaceC5573m, dVar);
    }

    @Override // p106h4.InterfaceC2322m
    /* renamed from: f */
    public void mo9338f(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.f9493m = j10;
        }
    }

    /* renamed from: g */
    public final void m9462g(long j10, int i10, int i11, long j11) {
        this.f9484d.m9467a(j10, i10, this.f9485e);
        if (!this.f9485e) {
            this.f9487g.m9484b(i11);
            this.f9488h.m9484b(i11);
            this.f9489i.m9484b(i11);
            if (this.f9487g.m9485c() && this.f9488h.m9485c() && this.f9489i.m9485c()) {
                this.f9483c.mo4852b(m9460i(this.f9482b, this.f9487g, this.f9488h, this.f9489i));
                this.f9485e = true;
            }
        }
        if (this.f9490j.m9484b(i11)) {
            C2330u c2330u = this.f9490j;
            this.f9494n.m15221R(this.f9490j.f9550d, C4051w.m15581q(c2330u.f9550d, c2330u.f9551e));
            this.f9494n.m15224U(5);
            this.f9481a.m9344a(j11, this.f9494n);
        }
        if (this.f9491k.m9484b(i11)) {
            C2330u c2330u2 = this.f9491k;
            this.f9494n.m15221R(this.f9491k.f9550d, C4051w.m15581q(c2330u2.f9550d, c2330u2.f9551e));
            this.f9494n.m15224U(5);
            this.f9481a.m9344a(j11, this.f9494n);
        }
    }

    /* renamed from: h */
    public final void m9463h(byte[] bArr, int i10, int i11) {
        this.f9484d.m9469e(bArr, i10, i11);
        if (!this.f9485e) {
            this.f9487g.m9483a(bArr, i10, i11);
            this.f9488h.m9483a(bArr, i10, i11);
            this.f9489i.m9483a(bArr, i10, i11);
        }
        this.f9490j.m9483a(bArr, i10, i11);
        this.f9491k.m9483a(bArr, i10, i11);
    }

    /* renamed from: j */
    public final void m9464j(long j10, int i10, int i11, long j11) {
        this.f9484d.m9471g(j10, i10, i11, j11, this.f9485e);
        if (!this.f9485e) {
            this.f9487g.m9487e(i11);
            this.f9488h.m9487e(i11);
            this.f9489i.m9487e(i11);
        }
        this.f9490j.m9487e(i11);
        this.f9491k.m9487e(i11);
    }
}
