package p106h4;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Arrays;
import p106h4.InterfaceC2316i0;
import p222p5.C4014a;
import p222p5.C4015a0;
import p222p5.C4017b0;
import p222p5.C4022e;
import p222p5.C4041n0;
import p222p5.C4051w;
import p264s3.C4463m1;
import p333x3.InterfaceC5559b0;
import p333x3.InterfaceC5573m;

/* renamed from: h4.p */
/* loaded from: classes.dex */
public final class C2325p implements InterfaceC2322m {

    /* renamed from: a */
    public final C2306d0 f9432a;

    /* renamed from: b */
    public final boolean f9433b;

    /* renamed from: c */
    public final boolean f9434c;

    /* renamed from: g */
    public long f9438g;

    /* renamed from: i */
    public String f9440i;

    /* renamed from: j */
    public InterfaceC5559b0 f9441j;

    /* renamed from: k */
    public b f9442k;

    /* renamed from: l */
    public boolean f9443l;

    /* renamed from: n */
    public boolean f9445n;

    /* renamed from: h */
    public final boolean[] f9439h = new boolean[3];

    /* renamed from: d */
    public final C2330u f9435d = new C2330u(7, 128);

    /* renamed from: e */
    public final C2330u f9436e = new C2330u(8, 128);

    /* renamed from: f */
    public final C2330u f9437f = new C2330u(6, 128);

    /* renamed from: m */
    public long f9444m = -9223372036854775807L;

    /* renamed from: o */
    public final C4015a0 f9446o = new C4015a0();

    /* renamed from: h4.p$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        public final InterfaceC5559b0 f9447a;

        /* renamed from: b */
        public final boolean f9448b;

        /* renamed from: c */
        public final boolean f9449c;

        /* renamed from: d */
        public final SparseArray<C4051w.c> f9450d = new SparseArray<>();

        /* renamed from: e */
        public final SparseArray<C4051w.b> f9451e = new SparseArray<>();

        /* renamed from: f */
        public final C4017b0 f9452f;

        /* renamed from: g */
        public byte[] f9453g;

        /* renamed from: h */
        public int f9454h;

        /* renamed from: i */
        public int f9455i;

        /* renamed from: j */
        public long f9456j;

        /* renamed from: k */
        public boolean f9457k;

        /* renamed from: l */
        public long f9458l;

        /* renamed from: m */
        public a f9459m;

        /* renamed from: n */
        public a f9460n;

        /* renamed from: o */
        public boolean f9461o;

        /* renamed from: p */
        public long f9462p;

        /* renamed from: q */
        public long f9463q;

        /* renamed from: r */
        public boolean f9464r;

        /* renamed from: h4.p$b$a */
        /* loaded from: classes.dex */
        public static final class a {

            /* renamed from: a */
            public boolean f9465a;

            /* renamed from: b */
            public boolean f9466b;

            /* renamed from: c */
            public C4051w.c f9467c;

            /* renamed from: d */
            public int f9468d;

            /* renamed from: e */
            public int f9469e;

            /* renamed from: f */
            public int f9470f;

            /* renamed from: g */
            public int f9471g;

            /* renamed from: h */
            public boolean f9472h;

            /* renamed from: i */
            public boolean f9473i;

            /* renamed from: j */
            public boolean f9474j;

            /* renamed from: k */
            public boolean f9475k;

            /* renamed from: l */
            public int f9476l;

            /* renamed from: m */
            public int f9477m;

            /* renamed from: n */
            public int f9478n;

            /* renamed from: o */
            public int f9479o;

            /* renamed from: p */
            public int f9480p;

            public a() {
            }

            /* renamed from: b */
            public void m9455b() {
                this.f9466b = false;
                this.f9465a = false;
            }

            /* renamed from: c */
            public final boolean m9456c(a aVar) {
                int i10;
                int i11;
                int i12;
                boolean z10;
                if (!this.f9465a) {
                    return false;
                }
                if (!aVar.f9465a) {
                    return true;
                }
                C4051w.c cVar = (C4051w.c) C4014a.m15202h(this.f9467c);
                C4051w.c cVar2 = (C4051w.c) C4014a.m15202h(aVar.f9467c);
                return (this.f9470f == aVar.f9470f && this.f9471g == aVar.f9471g && this.f9472h == aVar.f9472h && (!this.f9473i || !aVar.f9473i || this.f9474j == aVar.f9474j) && (((i10 = this.f9468d) == (i11 = aVar.f9468d) || (i10 != 0 && i11 != 0)) && (((i12 = cVar.f14590l) != 0 || cVar2.f14590l != 0 || (this.f9477m == aVar.f9477m && this.f9478n == aVar.f9478n)) && ((i12 != 1 || cVar2.f14590l != 1 || (this.f9479o == aVar.f9479o && this.f9480p == aVar.f9480p)) && (z10 = this.f9475k) == aVar.f9475k && (!z10 || this.f9476l == aVar.f9476l))))) ? false : true;
            }

            /* renamed from: d */
            public boolean m9457d() {
                int i10;
                return this.f9466b && ((i10 = this.f9469e) == 7 || i10 == 2);
            }

            /* renamed from: e */
            public void m9458e(C4051w.c cVar, int i10, int i11, int i12, int i13, boolean z10, boolean z11, boolean z12, boolean z13, int i14, int i15, int i16, int i17, int i18) {
                this.f9467c = cVar;
                this.f9468d = i10;
                this.f9469e = i11;
                this.f9470f = i12;
                this.f9471g = i13;
                this.f9472h = z10;
                this.f9473i = z11;
                this.f9474j = z12;
                this.f9475k = z13;
                this.f9476l = i14;
                this.f9477m = i15;
                this.f9478n = i16;
                this.f9479o = i17;
                this.f9480p = i18;
                this.f9465a = true;
                this.f9466b = true;
            }

            /* renamed from: f */
            public void m9459f(int i10) {
                this.f9469e = i10;
                this.f9466b = true;
            }
        }

        public b(InterfaceC5559b0 interfaceC5559b0, boolean z10, boolean z11) {
            this.f9447a = interfaceC5559b0;
            this.f9448b = z10;
            this.f9449c = z11;
            this.f9459m = new a();
            this.f9460n = new a();
            byte[] bArr = new byte[128];
            this.f9453g = bArr;
            this.f9452f = new C4017b0(bArr, 0, 0);
            m9452g();
        }

        /* JADX WARN: Removed duplicated region for block: B:50:0x00ff  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x0106  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x011e  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x0152  */
        /* JADX WARN: Removed duplicated region for block: B:88:0x0118  */
        /* JADX WARN: Removed duplicated region for block: B:89:0x0102  */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void m9446a(byte[] r24, int r25, int r26) {
            /*
                Method dump skipped, instructions count: 414
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p106h4.C2325p.b.m9446a(byte[], int, int):void");
        }

        /* renamed from: b */
        public boolean m9447b(long j10, int i10, boolean z10, boolean z11) {
            boolean z12 = false;
            if (this.f9455i == 9 || (this.f9449c && this.f9460n.m9456c(this.f9459m))) {
                if (z10 && this.f9461o) {
                    m9449d(i10 + ((int) (j10 - this.f9456j)));
                }
                this.f9462p = this.f9456j;
                this.f9463q = this.f9458l;
                this.f9464r = false;
                this.f9461o = true;
            }
            if (this.f9448b) {
                z11 = this.f9460n.m9457d();
            }
            boolean z13 = this.f9464r;
            int i11 = this.f9455i;
            if (i11 == 5 || (z11 && i11 == 1)) {
                z12 = true;
            }
            boolean z14 = z13 | z12;
            this.f9464r = z14;
            return z14;
        }

        /* renamed from: c */
        public boolean m9448c() {
            return this.f9449c;
        }

        /* renamed from: d */
        public final void m9449d(int i10) {
            long j10 = this.f9463q;
            if (j10 == -9223372036854775807L) {
                return;
            }
            boolean z10 = this.f9464r;
            this.f9447a.mo4851a(j10, z10 ? 1 : 0, (int) (this.f9456j - this.f9462p), i10, null);
        }

        /* renamed from: e */
        public void m9450e(C4051w.b bVar) {
            this.f9451e.append(bVar.f14576a, bVar);
        }

        /* renamed from: f */
        public void m9451f(C4051w.c cVar) {
            this.f9450d.append(cVar.f14582d, cVar);
        }

        /* renamed from: g */
        public void m9452g() {
            this.f9457k = false;
            this.f9461o = false;
            this.f9460n.m9455b();
        }

        /* renamed from: h */
        public void m9453h(long j10, int i10, long j11) {
            this.f9455i = i10;
            this.f9458l = j11;
            this.f9456j = j10;
            if (!this.f9448b || i10 != 1) {
                if (!this.f9449c) {
                    return;
                }
                if (i10 != 5 && i10 != 1 && i10 != 2) {
                    return;
                }
            }
            a aVar = this.f9459m;
            this.f9459m = this.f9460n;
            this.f9460n = aVar;
            aVar.m9455b();
            this.f9454h = 0;
            this.f9457k = true;
        }
    }

    public C2325p(C2306d0 c2306d0, boolean z10, boolean z11) {
        this.f9432a = c2306d0;
        this.f9433b = z10;
        this.f9434c = z11;
    }

    @Override // p106h4.InterfaceC2322m
    /* renamed from: a */
    public void mo9333a(C4015a0 c4015a0) {
        m9442b();
        int m15231f = c4015a0.m15231f();
        int m15232g = c4015a0.m15232g();
        byte[] m15230e = c4015a0.m15230e();
        this.f9438g += c4015a0.m15226a();
        this.f9441j.m22408e(c4015a0, c4015a0.m15226a());
        while (true) {
            int m15567c = C4051w.m15567c(m15230e, m15231f, m15232g, this.f9439h);
            if (m15567c == m15232g) {
                m9444h(m15230e, m15231f, m15232g);
                return;
            }
            int m15570f = C4051w.m15570f(m15230e, m15567c);
            int i10 = m15567c - m15231f;
            if (i10 > 0) {
                m9444h(m15230e, m15231f, m15567c);
            }
            int i11 = m15232g - m15567c;
            long j10 = this.f9438g - i11;
            m9443g(j10, i11, i10 < 0 ? -i10 : 0, this.f9444m);
            m9445i(j10, m15570f, this.f9444m);
            m15231f = m15567c + 3;
        }
    }

    /* renamed from: b */
    public final void m9442b() {
        C4014a.m15202h(this.f9441j);
        C4041n0.m15463j(this.f9442k);
    }

    @Override // p106h4.InterfaceC2322m
    /* renamed from: c */
    public void mo9335c() {
        this.f9438g = 0L;
        this.f9445n = false;
        this.f9444m = -9223372036854775807L;
        C4051w.m15565a(this.f9439h);
        this.f9435d.m9486d();
        this.f9436e.m9486d();
        this.f9437f.m9486d();
        b bVar = this.f9442k;
        if (bVar != null) {
            bVar.m9452g();
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
        this.f9440i = dVar.m9413b();
        InterfaceC5559b0 mo3032e = interfaceC5573m.mo3032e(dVar.m9414c(), 2);
        this.f9441j = mo3032e;
        this.f9442k = new b(mo3032e, this.f9433b, this.f9434c);
        this.f9432a.m9345b(interfaceC5573m, dVar);
    }

    @Override // p106h4.InterfaceC2322m
    /* renamed from: f */
    public void mo9338f(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.f9444m = j10;
        }
        this.f9445n |= (i10 & 2) != 0;
    }

    /* renamed from: g */
    public final void m9443g(long j10, int i10, int i11, long j11) {
        C2330u c2330u;
        if (!this.f9443l || this.f9442k.m9448c()) {
            this.f9435d.m9484b(i11);
            this.f9436e.m9484b(i11);
            if (this.f9443l) {
                if (this.f9435d.m9485c()) {
                    C2330u c2330u2 = this.f9435d;
                    this.f9442k.m9451f(C4051w.m15576l(c2330u2.f9550d, 3, c2330u2.f9551e));
                    c2330u = this.f9435d;
                } else if (this.f9436e.m9485c()) {
                    C2330u c2330u3 = this.f9436e;
                    this.f9442k.m9450e(C4051w.m15574j(c2330u3.f9550d, 3, c2330u3.f9551e));
                    c2330u = this.f9436e;
                }
            } else if (this.f9435d.m9485c() && this.f9436e.m9485c()) {
                ArrayList arrayList = new ArrayList();
                C2330u c2330u4 = this.f9435d;
                arrayList.add(Arrays.copyOf(c2330u4.f9550d, c2330u4.f9551e));
                C2330u c2330u5 = this.f9436e;
                arrayList.add(Arrays.copyOf(c2330u5.f9550d, c2330u5.f9551e));
                C2330u c2330u6 = this.f9435d;
                C4051w.c m15576l = C4051w.m15576l(c2330u6.f9550d, 3, c2330u6.f9551e);
                C2330u c2330u7 = this.f9436e;
                C4051w.b m15574j = C4051w.m15574j(c2330u7.f9550d, 3, c2330u7.f9551e);
                this.f9441j.mo4852b(new C4463m1.b().m17462U(this.f9440i).m17474g0("video/avc").m17452K(C4022e.m15277a(m15576l.f14579a, m15576l.f14580b, m15576l.f14581c)).m17481n0(m15576l.f14584f).m17460S(m15576l.f14585g).m17470c0(m15576l.f14586h).m17463V(arrayList).m17448G());
                this.f9443l = true;
                this.f9442k.m9451f(m15576l);
                this.f9442k.m9450e(m15574j);
                this.f9435d.m9486d();
                c2330u = this.f9436e;
            }
            c2330u.m9486d();
        }
        if (this.f9437f.m9484b(i11)) {
            C2330u c2330u8 = this.f9437f;
            this.f9446o.m15221R(this.f9437f.f9550d, C4051w.m15581q(c2330u8.f9550d, c2330u8.f9551e));
            this.f9446o.m15223T(4);
            this.f9432a.m9344a(j11, this.f9446o);
        }
        if (this.f9442k.m9447b(j10, i10, this.f9443l, this.f9445n)) {
            this.f9445n = false;
        }
    }

    /* renamed from: h */
    public final void m9444h(byte[] bArr, int i10, int i11) {
        if (!this.f9443l || this.f9442k.m9448c()) {
            this.f9435d.m9483a(bArr, i10, i11);
            this.f9436e.m9483a(bArr, i10, i11);
        }
        this.f9437f.m9483a(bArr, i10, i11);
        this.f9442k.m9446a(bArr, i10, i11);
    }

    /* renamed from: i */
    public final void m9445i(long j10, int i10, long j11) {
        if (!this.f9443l || this.f9442k.m9448c()) {
            this.f9435d.m9487e(i10);
            this.f9436e.m9487e(i10);
        }
        this.f9437f.m9487e(i10);
        this.f9442k.m9453h(j10, i10, j11);
    }
}
