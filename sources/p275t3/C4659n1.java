package p275t3;

import android.os.Looper;
import android.util.SparseArray;
import java.io.IOException;
import java.util.List;
import p047d5.C1547b;
import p047d5.C1550e;
import p126i7.AbstractC2651u;
import p126i7.AbstractC2653v;
import p126i7.C2610b0;
import p152k4.C3348a;
import p222p5.C4014a;
import p222p5.C4036l;
import p222p5.C4041n0;
import p222p5.C4045q;
import p222p5.InterfaceC4020d;
import p222p5.InterfaceC4040n;
import p236q5.C4192y;
import p264s3.AbstractC4505u3;
import p264s3.C4403a3;
import p264s3.C4463m1;
import p264s3.C4471o;
import p264s3.C4481q;
import p264s3.C4503u1;
import p264s3.C4519x2;
import p264s3.C4528z1;
import p264s3.C4530z3;
import p264s3.InterfaceC4409b3;
import p275t3.InterfaceC4621b;
import p289u3.C4813e;
import p290u4.C4870n;
import p290u4.C4876q;
import p290u4.C4880s;
import p290u4.InterfaceC4882t;
import p304v3.C5108e;
import p304v3.C5112i;

/* renamed from: t3.n1 */
/* loaded from: classes.dex */
public class C4659n1 implements InterfaceC4618a {

    /* renamed from: a */
    public final InterfaceC4020d f17396a;

    /* renamed from: b */
    public final AbstractC4505u3.b f17397b;

    /* renamed from: c */
    public final AbstractC4505u3.d f17398c;

    /* renamed from: d */
    public final a f17399d;

    /* renamed from: e */
    public final SparseArray<InterfaceC4621b.a> f17400e;

    /* renamed from: f */
    public C4045q<InterfaceC4621b> f17401f;

    /* renamed from: g */
    public InterfaceC4409b3 f17402g;

    /* renamed from: h */
    public InterfaceC4040n f17403h;

    /* renamed from: i */
    public boolean f17404i;

    /* renamed from: t3.n1$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final AbstractC4505u3.b f17405a;

        /* renamed from: b */
        public AbstractC2651u<InterfaceC4882t.b> f17406b = AbstractC2651u.m10770u();

        /* renamed from: c */
        public AbstractC2653v<InterfaceC4882t.b, AbstractC4505u3> f17407c = AbstractC2653v.m10800j();

        /* renamed from: d */
        public InterfaceC4882t.b f17408d;

        /* renamed from: e */
        public InterfaceC4882t.b f17409e;

        /* renamed from: f */
        public InterfaceC4882t.b f17410f;

        public a(AbstractC4505u3.b bVar) {
            this.f17405a = bVar;
        }

        /* renamed from: c */
        public static InterfaceC4882t.b m18431c(InterfaceC4409b3 interfaceC4409b3, AbstractC2651u<InterfaceC4882t.b> abstractC2651u, InterfaceC4882t.b bVar, AbstractC4505u3.b bVar2) {
            AbstractC4505u3 mo17077F = interfaceC4409b3.mo17077F();
            int mo17090k = interfaceC4409b3.mo17090k();
            Object mo4746q = mo17077F.m17676u() ? null : mo17077F.mo4746q(mo17090k);
            int m17684g = (interfaceC4409b3.mo17087g() || mo17077F.m17676u()) ? -1 : mo17077F.m17672j(mo17090k, bVar2).m17684g(C4041n0.m15396B0(interfaceC4409b3.mo17079H()) - bVar2.m17694q());
            for (int i10 = 0; i10 < abstractC2651u.size(); i10++) {
                InterfaceC4882t.b bVar3 = abstractC2651u.get(i10);
                if (m18432i(bVar3, mo4746q, interfaceC4409b3.mo17087g(), interfaceC4409b3.mo17103z(), interfaceC4409b3.mo17094p(), m17684g)) {
                    return bVar3;
                }
            }
            if (abstractC2651u.isEmpty() && bVar != null) {
                if (m18432i(bVar, mo4746q, interfaceC4409b3.mo17087g(), interfaceC4409b3.mo17103z(), interfaceC4409b3.mo17094p(), m17684g)) {
                    return bVar;
                }
            }
            return null;
        }

        /* renamed from: i */
        public static boolean m18432i(InterfaceC4882t.b bVar, Object obj, boolean z10, int i10, int i11, int i12) {
            if (bVar.f18457a.equals(obj)) {
                return (z10 && bVar.f18458b == i10 && bVar.f18459c == i11) || (!z10 && bVar.f18458b == -1 && bVar.f18461e == i12);
            }
            return false;
        }

        /* renamed from: b */
        public final void m18433b(AbstractC2653v.a<InterfaceC4882t.b, AbstractC4505u3> aVar, InterfaceC4882t.b bVar, AbstractC4505u3 abstractC4505u3) {
            if (bVar == null) {
                return;
            }
            if (abstractC4505u3.mo4743f(bVar.f18457a) == -1 && (abstractC4505u3 = this.f17407c.get(bVar)) == null) {
                return;
            }
            aVar.m10810f(bVar, abstractC4505u3);
        }

        /* renamed from: d */
        public InterfaceC4882t.b m18434d() {
            return this.f17408d;
        }

        /* renamed from: e */
        public InterfaceC4882t.b m18435e() {
            if (this.f17406b.isEmpty()) {
                return null;
            }
            return (InterfaceC4882t.b) C2610b0.m10505d(this.f17406b);
        }

        /* renamed from: f */
        public AbstractC4505u3 m18436f(InterfaceC4882t.b bVar) {
            return this.f17407c.get(bVar);
        }

        /* renamed from: g */
        public InterfaceC4882t.b m18437g() {
            return this.f17409e;
        }

        /* renamed from: h */
        public InterfaceC4882t.b m18438h() {
            return this.f17410f;
        }

        /* renamed from: j */
        public void m18439j(InterfaceC4409b3 interfaceC4409b3) {
            this.f17408d = m18431c(interfaceC4409b3, this.f17406b, this.f17409e, this.f17405a);
        }

        /* renamed from: k */
        public void m18440k(List<InterfaceC4882t.b> list, InterfaceC4882t.b bVar, InterfaceC4409b3 interfaceC4409b3) {
            this.f17406b = AbstractC2651u.m10768p(list);
            if (!list.isEmpty()) {
                this.f17409e = list.get(0);
                this.f17410f = (InterfaceC4882t.b) C4014a.m15199e(bVar);
            }
            if (this.f17408d == null) {
                this.f17408d = m18431c(interfaceC4409b3, this.f17406b, this.f17409e, this.f17405a);
            }
            m18442m(interfaceC4409b3.mo17077F());
        }

        /* renamed from: l */
        public void m18441l(InterfaceC4409b3 interfaceC4409b3) {
            this.f17408d = m18431c(interfaceC4409b3, this.f17406b, this.f17409e, this.f17405a);
            m18442m(interfaceC4409b3.mo17077F());
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0056, code lost:
        
            m18433b(r0, r3.f17408d, r4);
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0054, code lost:
        
            if (r3.f17406b.contains(r3.f17408d) == false) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0032, code lost:
        
            if (p109h7.C2428k.m9688a(r3.f17408d, r3.f17410f) == false) goto L18;
         */
        /* renamed from: m */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void m18442m(p264s3.AbstractC4505u3 r4) {
            /*
                r3 = this;
                i7.v$a r0 = p126i7.AbstractC2653v.m10797a()
                i7.u<u4.t$b> r1 = r3.f17406b
                boolean r1 = r1.isEmpty()
                if (r1 == 0) goto L35
                u4.t$b r1 = r3.f17409e
                r3.m18433b(r0, r1, r4)
                u4.t$b r1 = r3.f17410f
                u4.t$b r2 = r3.f17409e
                boolean r1 = p109h7.C2428k.m9688a(r1, r2)
                if (r1 != 0) goto L20
                u4.t$b r1 = r3.f17410f
                r3.m18433b(r0, r1, r4)
            L20:
                u4.t$b r1 = r3.f17408d
                u4.t$b r2 = r3.f17409e
                boolean r1 = p109h7.C2428k.m9688a(r1, r2)
                if (r1 != 0) goto L5b
                u4.t$b r1 = r3.f17408d
                u4.t$b r2 = r3.f17410f
                boolean r1 = p109h7.C2428k.m9688a(r1, r2)
                if (r1 != 0) goto L5b
                goto L56
            L35:
                r1 = 0
            L36:
                i7.u<u4.t$b> r2 = r3.f17406b
                int r2 = r2.size()
                if (r1 >= r2) goto L4c
                i7.u<u4.t$b> r2 = r3.f17406b
                java.lang.Object r2 = r2.get(r1)
                u4.t$b r2 = (p290u4.InterfaceC4882t.b) r2
                r3.m18433b(r0, r2, r4)
                int r1 = r1 + 1
                goto L36
            L4c:
                i7.u<u4.t$b> r1 = r3.f17406b
                u4.t$b r2 = r3.f17408d
                boolean r1 = r1.contains(r2)
                if (r1 != 0) goto L5b
            L56:
                u4.t$b r1 = r3.f17408d
                r3.m18433b(r0, r1, r4)
            L5b:
                i7.v r4 = r0.m10807c()
                r3.f17407c = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p275t3.C4659n1.a.m18442m(s3.u3):void");
        }
    }

    public C4659n1(InterfaceC4020d interfaceC4020d) {
        this.f17396a = (InterfaceC4020d) C4014a.m15199e(interfaceC4020d);
        this.f17401f = new C4045q<>(C4041n0.m15425Q(), interfaceC4020d, new C4045q.b() { // from class: t3.i1
            @Override // p222p5.C4045q.b
            /* renamed from: a */
            public final void mo15517a(Object obj, C4036l c4036l) {
                C4659n1.m18365d1((InterfaceC4621b) obj, c4036l);
            }
        });
        AbstractC4505u3.b bVar = new AbstractC4505u3.b();
        this.f17397b = bVar;
        this.f17398c = new AbstractC4505u3.d();
        this.f17399d = new a(bVar);
        this.f17400e = new SparseArray<>();
    }

    /* renamed from: D1 */
    public static /* synthetic */ void m18302D1(InterfaceC4621b.a aVar, boolean z10, InterfaceC4621b interfaceC4621b) {
        interfaceC4621b.m18261j0(aVar, z10);
        interfaceC4621b.m18241Y(aVar, z10);
    }

    /* renamed from: T1 */
    public static /* synthetic */ void m18344T1(InterfaceC4621b.a aVar, int i10, InterfaceC4409b3.e eVar, InterfaceC4409b3.e eVar2, InterfaceC4621b interfaceC4621b) {
        interfaceC4621b.m18238V(aVar, i10);
        interfaceC4621b.mo18277s(aVar, eVar, eVar2, i10);
    }

    /* renamed from: d1 */
    public static /* synthetic */ void m18365d1(InterfaceC4621b interfaceC4621b, C4036l c4036l) {
    }

    /* renamed from: d2 */
    public static /* synthetic */ void m18366d2(InterfaceC4621b.a aVar, String str, long j10, long j11, InterfaceC4621b interfaceC4621b) {
        interfaceC4621b.m18268n0(aVar, str, j10);
        interfaceC4621b.m18243a(aVar, str, j11, j10);
        interfaceC4621b.m18230M(aVar, 2, str, j10);
    }

    /* renamed from: f2 */
    public static /* synthetic */ void m18372f2(InterfaceC4621b.a aVar, C5108e c5108e, InterfaceC4621b interfaceC4621b) {
        interfaceC4621b.mo18288y(aVar, c5108e);
        interfaceC4621b.m18225H(aVar, 2, c5108e);
    }

    /* renamed from: g2 */
    public static /* synthetic */ void m18375g2(InterfaceC4621b.a aVar, C5108e c5108e, InterfaceC4621b interfaceC4621b) {
        interfaceC4621b.m18286w0(aVar, c5108e);
        interfaceC4621b.m18282u0(aVar, 2, c5108e);
    }

    /* renamed from: h1 */
    public static /* synthetic */ void m18377h1(InterfaceC4621b.a aVar, String str, long j10, long j11, InterfaceC4621b interfaceC4621b) {
        interfaceC4621b.m18287x0(aVar, str, j10);
        interfaceC4621b.m18285w(aVar, str, j11, j10);
        interfaceC4621b.m18230M(aVar, 1, str, j10);
    }

    /* renamed from: i2 */
    public static /* synthetic */ void m18381i2(InterfaceC4621b.a aVar, C4463m1 c4463m1, C5112i c5112i, InterfaceC4621b interfaceC4621b) {
        interfaceC4621b.m18271p(aVar, c4463m1);
        interfaceC4621b.m18220C(aVar, c4463m1, c5112i);
        interfaceC4621b.m18219B(aVar, 2, c4463m1);
    }

    /* renamed from: j1 */
    public static /* synthetic */ void m18383j1(InterfaceC4621b.a aVar, C5108e c5108e, InterfaceC4621b interfaceC4621b) {
        interfaceC4621b.m18260j(aVar, c5108e);
        interfaceC4621b.m18225H(aVar, 1, c5108e);
    }

    /* renamed from: j2 */
    public static /* synthetic */ void m18384j2(InterfaceC4621b.a aVar, C4192y c4192y, InterfaceC4621b interfaceC4621b) {
        interfaceC4621b.mo18269o(aVar, c4192y);
        interfaceC4621b.m18234Q(aVar, c4192y.f15139h, c4192y.f15140i, c4192y.f15141j, c4192y.f15142k);
    }

    /* renamed from: k1 */
    public static /* synthetic */ void m18386k1(InterfaceC4621b.a aVar, C5108e c5108e, InterfaceC4621b interfaceC4621b) {
        interfaceC4621b.m18266m(aVar, c5108e);
        interfaceC4621b.m18282u0(aVar, 1, c5108e);
    }

    /* renamed from: l1 */
    public static /* synthetic */ void m18389l1(InterfaceC4621b.a aVar, C4463m1 c4463m1, C5112i c5112i, InterfaceC4621b interfaceC4621b) {
        interfaceC4621b.m18255g(aVar, c4463m1);
        interfaceC4621b.m18224G(aVar, c4463m1, c5112i);
        interfaceC4621b.m18219B(aVar, 1, c4463m1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m2 */
    public /* synthetic */ void m18393m2(InterfaceC4409b3 interfaceC4409b3, InterfaceC4621b interfaceC4621b, C4036l c4036l) {
        interfaceC4621b.mo18275r(interfaceC4409b3, new InterfaceC4621b.b(c4036l, this.f17400e));
    }

    /* renamed from: z1 */
    public static /* synthetic */ void m18419z1(InterfaceC4621b.a aVar, int i10, InterfaceC4621b interfaceC4621b) {
        interfaceC4621b.m18290z(aVar);
        interfaceC4621b.m18272p0(aVar, i10);
    }

    @Override // p317w3.InterfaceC5255u
    /* renamed from: A */
    public final void mo17578A(int i10, InterfaceC4882t.b bVar) {
        final InterfaceC4621b.a m18424Z0 = m18424Z0(i10, bVar);
        m18429o2(m18424Z0, 1026, new C4045q.a() { // from class: t3.f1
            @Override // p222p5.C4045q.a
            public final void invoke(Object obj) {
                ((InterfaceC4621b) obj).m18223F(InterfaceC4621b.a.this);
            }
        });
    }

    @Override // p275t3.InterfaceC4618a
    /* renamed from: B */
    public void mo18196B(InterfaceC4621b interfaceC4621b) {
        C4014a.m15199e(interfaceC4621b);
        this.f17401f.m15508c(interfaceC4621b);
    }

    @Override // p275t3.InterfaceC4618a
    /* renamed from: C */
    public final void mo18197C(List<InterfaceC4882t.b> list, InterfaceC4882t.b bVar) {
        this.f17399d.m18440k(list, bVar, (InterfaceC4409b3) C4014a.m15199e(this.f17402g));
    }

    @Override // p275t3.InterfaceC4618a
    /* renamed from: D */
    public void mo18198D(final InterfaceC4409b3 interfaceC4409b3, Looper looper) {
        C4014a.m15200f(this.f17402g == null || this.f17399d.f17406b.isEmpty());
        this.f17402g = (InterfaceC4409b3) C4014a.m15199e(interfaceC4409b3);
        this.f17403h = this.f17396a.mo15273c(looper, null);
        this.f17401f = this.f17401f.m15510e(looper, new C4045q.b() { // from class: t3.h1
            @Override // p222p5.C4045q.b
            /* renamed from: a */
            public final void mo15517a(Object obj, C4036l c4036l) {
                C4659n1.this.m18393m2(interfaceC4409b3, (InterfaceC4621b) obj, c4036l);
            }
        });
    }

    @Override // p317w3.InterfaceC5255u
    /* renamed from: E */
    public final void mo17579E(int i10, InterfaceC4882t.b bVar) {
        final InterfaceC4621b.a m18424Z0 = m18424Z0(i10, bVar);
        m18429o2(m18424Z0, 1025, new C4045q.a() { // from class: t3.j1
            @Override // p222p5.C4045q.a
            public final void invoke(Object obj) {
                ((InterfaceC4621b) obj).m18263k0(InterfaceC4621b.a.this);
            }
        });
    }

    @Override // p317w3.InterfaceC5255u
    /* renamed from: F */
    public final void mo17580F(int i10, InterfaceC4882t.b bVar, final Exception exc) {
        final InterfaceC4621b.a m18424Z0 = m18424Z0(i10, bVar);
        m18429o2(m18424Z0, 1024, new C4045q.a() { // from class: t3.u
            @Override // p222p5.C4045q.a
            public final void invoke(Object obj) {
                ((InterfaceC4621b) obj).m18276r0(InterfaceC4621b.a.this, exc);
            }
        });
    }

    @Override // p317w3.InterfaceC5255u
    /* renamed from: G */
    public final void mo17581G(int i10, InterfaceC4882t.b bVar, final int i11) {
        final InterfaceC4621b.a m18424Z0 = m18424Z0(i10, bVar);
        m18429o2(m18424Z0, 1022, new C4045q.a() { // from class: t3.d
            @Override // p222p5.C4045q.a
            public final void invoke(Object obj) {
                C4659n1.m18419z1(InterfaceC4621b.a.this, i11, (InterfaceC4621b) obj);
            }
        });
    }

    @Override // p290u4.InterfaceC4845a0
    /* renamed from: H */
    public final void mo17582H(int i10, InterfaceC4882t.b bVar, final C4876q c4876q) {
        final InterfaceC4621b.a m18424Z0 = m18424Z0(i10, bVar);
        m18429o2(m18424Z0, 1004, new C4045q.a() { // from class: t3.v0
            @Override // p222p5.C4045q.a
            public final void invoke(Object obj) {
                ((InterfaceC4621b) obj).mo18256h(InterfaceC4621b.a.this, c4876q);
            }
        });
    }

    @Override // p290u4.InterfaceC4845a0
    /* renamed from: I */
    public final void mo17583I(int i10, InterfaceC4882t.b bVar, final C4870n c4870n, final C4876q c4876q, final IOException iOException, final boolean z10) {
        final InterfaceC4621b.a m18424Z0 = m18424Z0(i10, bVar);
        m18429o2(m18424Z0, 1003, new C4045q.a() { // from class: t3.t0
            @Override // p222p5.C4045q.a
            public final void invoke(Object obj) {
                ((InterfaceC4621b) obj).mo18231N(InterfaceC4621b.a.this, c4870n, c4876q, iOException, z10);
            }
        });
    }

    @Override // p290u4.InterfaceC4845a0
    /* renamed from: J */
    public final void mo17584J(int i10, InterfaceC4882t.b bVar, final C4870n c4870n, final C4876q c4876q) {
        final InterfaceC4621b.a m18424Z0 = m18424Z0(i10, bVar);
        m18429o2(m18424Z0, 1002, new C4045q.a() { // from class: t3.r0
            @Override // p222p5.C4045q.a
            public final void invoke(Object obj) {
                ((InterfaceC4621b) obj).m18270o0(InterfaceC4621b.a.this, c4870n, c4876q);
            }
        });
    }

    /* renamed from: V0 */
    public final InterfaceC4621b.a m18420V0() {
        return m18422X0(this.f17399d.m18434d());
    }

    /* renamed from: W0 */
    public final InterfaceC4621b.a m18421W0(AbstractC4505u3 abstractC4505u3, int i10, InterfaceC4882t.b bVar) {
        long mo17097s;
        InterfaceC4882t.b bVar2 = abstractC4505u3.m17676u() ? null : bVar;
        long mo15272b = this.f17396a.mo15272b();
        boolean z10 = abstractC4505u3.equals(this.f17402g.mo17077F()) && i10 == this.f17402g.mo17072A();
        long j10 = 0;
        if (bVar2 != null && bVar2.m19438b()) {
            if (z10 && this.f17402g.mo17103z() == bVar2.f18458b && this.f17402g.mo17094p() == bVar2.f18459c) {
                j10 = this.f17402g.mo17079H();
            }
        } else {
            if (z10) {
                mo17097s = this.f17402g.mo17097s();
                return new InterfaceC4621b.a(mo15272b, abstractC4505u3, i10, bVar2, mo17097s, this.f17402g.mo17077F(), this.f17402g.mo17072A(), this.f17399d.m18434d(), this.f17402g.mo17079H(), this.f17402g.mo17088i());
            }
            if (!abstractC4505u3.m17676u()) {
                j10 = abstractC4505u3.m17675r(i10, this.f17398c).m17703d();
            }
        }
        mo17097s = j10;
        return new InterfaceC4621b.a(mo15272b, abstractC4505u3, i10, bVar2, mo17097s, this.f17402g.mo17077F(), this.f17402g.mo17072A(), this.f17399d.m18434d(), this.f17402g.mo17079H(), this.f17402g.mo17088i());
    }

    /* renamed from: X0 */
    public final InterfaceC4621b.a m18422X0(InterfaceC4882t.b bVar) {
        C4014a.m15199e(this.f17402g);
        AbstractC4505u3 m18436f = bVar == null ? null : this.f17399d.m18436f(bVar);
        if (bVar != null && m18436f != null) {
            return m18421W0(m18436f, m18436f.mo17028l(bVar.f18457a, this.f17397b).f16834j, bVar);
        }
        int mo17072A = this.f17402g.mo17072A();
        AbstractC4505u3 mo17077F = this.f17402g.mo17077F();
        if (!(mo17072A < mo17077F.mo4748t())) {
            mo17077F = AbstractC4505u3.f16821h;
        }
        return m18421W0(mo17077F, mo17072A, null);
    }

    /* renamed from: Y0 */
    public final InterfaceC4621b.a m18423Y0() {
        return m18422X0(this.f17399d.m18435e());
    }

    /* renamed from: Z0 */
    public final InterfaceC4621b.a m18424Z0(int i10, InterfaceC4882t.b bVar) {
        C4014a.m15199e(this.f17402g);
        if (bVar != null) {
            return this.f17399d.m18436f(bVar) != null ? m18422X0(bVar) : m18421W0(AbstractC4505u3.f16821h, i10, bVar);
        }
        AbstractC4505u3 mo17077F = this.f17402g.mo17077F();
        if (!(i10 < mo17077F.mo4748t())) {
            mo17077F = AbstractC4505u3.f16821h;
        }
        return m18421W0(mo17077F, i10, null);
    }

    @Override // p275t3.InterfaceC4618a
    /* renamed from: a */
    public final void mo18199a(final Exception exc) {
        final InterfaceC4621b.a m18426b1 = m18426b1();
        m18429o2(m18426b1, 1014, new C4045q.a() { // from class: t3.t
            @Override // p222p5.C4045q.a
            public final void invoke(Object obj) {
                ((InterfaceC4621b) obj).m18246b0(InterfaceC4621b.a.this, exc);
            }
        });
    }

    /* renamed from: a1 */
    public final InterfaceC4621b.a m18425a1() {
        return m18422X0(this.f17399d.m18437g());
    }

    @Override // p275t3.InterfaceC4618a
    /* renamed from: b */
    public final void mo18200b(final String str) {
        final InterfaceC4621b.a m18426b1 = m18426b1();
        m18429o2(m18426b1, 1019, new C4045q.a() { // from class: t3.w
            @Override // p222p5.C4045q.a
            public final void invoke(Object obj) {
                ((InterfaceC4621b) obj).m18284v0(InterfaceC4621b.a.this, str);
            }
        });
    }

    /* renamed from: b1 */
    public final InterfaceC4621b.a m18426b1() {
        return m18422X0(this.f17399d.m18438h());
    }

    @Override // p275t3.InterfaceC4618a
    /* renamed from: c */
    public final void mo18201c(final C4463m1 c4463m1, final C5112i c5112i) {
        final InterfaceC4621b.a m18426b1 = m18426b1();
        m18429o2(m18426b1, 1017, new C4045q.a() { // from class: t3.f0
            @Override // p222p5.C4045q.a
            public final void invoke(Object obj) {
                C4659n1.m18381i2(InterfaceC4621b.a.this, c4463m1, c5112i, (InterfaceC4621b) obj);
            }
        });
    }

    /* renamed from: c1 */
    public final InterfaceC4621b.a m18427c1(C4519x2 c4519x2) {
        C4880s c4880s;
        return (!(c4519x2 instanceof C4481q) || (c4880s = ((C4481q) c4519x2).f16616u) == null) ? m18420V0() : m18422X0(new InterfaceC4882t.b(c4880s));
    }

    @Override // p275t3.InterfaceC4618a
    /* renamed from: d */
    public final void mo18202d(final String str, final long j10, final long j11) {
        final InterfaceC4621b.a m18426b1 = m18426b1();
        m18429o2(m18426b1, 1016, new C4045q.a() { // from class: t3.a0
            @Override // p222p5.C4045q.a
            public final void invoke(Object obj) {
                C4659n1.m18366d2(InterfaceC4621b.a.this, str, j11, j10, (InterfaceC4621b) obj);
            }
        });
    }

    @Override // p275t3.InterfaceC4618a
    /* renamed from: e */
    public final void mo18203e(final C4463m1 c4463m1, final C5112i c5112i) {
        final InterfaceC4621b.a m18426b1 = m18426b1();
        m18429o2(m18426b1, 1009, new C4045q.a() { // from class: t3.g0
            @Override // p222p5.C4045q.a
            public final void invoke(Object obj) {
                C4659n1.m18389l1(InterfaceC4621b.a.this, c4463m1, c5112i, (InterfaceC4621b) obj);
            }
        });
    }

    @Override // p275t3.InterfaceC4618a
    /* renamed from: f */
    public final void mo18204f(final C5108e c5108e) {
        final InterfaceC4621b.a m18426b1 = m18426b1();
        m18429o2(m18426b1, 1015, new C4045q.a() { // from class: t3.a1
            @Override // p222p5.C4045q.a
            public final void invoke(Object obj) {
                C4659n1.m18375g2(InterfaceC4621b.a.this, c5108e, (InterfaceC4621b) obj);
            }
        });
    }

    @Override // p275t3.InterfaceC4618a
    /* renamed from: g */
    public final void mo18205g(final String str) {
        final InterfaceC4621b.a m18426b1 = m18426b1();
        m18429o2(m18426b1, 1012, new C4045q.a() { // from class: t3.x
            @Override // p222p5.C4045q.a
            public final void invoke(Object obj) {
                ((InterfaceC4621b) obj).m18265l0(InterfaceC4621b.a.this, str);
            }
        });
    }

    @Override // p275t3.InterfaceC4618a
    /* renamed from: h */
    public final void mo18206h(final String str, final long j10, final long j11) {
        final InterfaceC4621b.a m18426b1 = m18426b1();
        m18429o2(m18426b1, 1008, new C4045q.a() { // from class: t3.z
            @Override // p222p5.C4045q.a
            public final void invoke(Object obj) {
                C4659n1.m18377h1(InterfaceC4621b.a.this, str, j11, j10, (InterfaceC4621b) obj);
            }
        });
    }

    @Override // p275t3.InterfaceC4618a
    /* renamed from: i */
    public final void mo18207i(final int i10, final long j10) {
        final InterfaceC4621b.a m18425a1 = m18425a1();
        m18429o2(m18425a1, 1018, new C4045q.a() { // from class: t3.i
            @Override // p222p5.C4045q.a
            public final void invoke(Object obj) {
                ((InterfaceC4621b) obj).m18278s0(InterfaceC4621b.a.this, i10, j10);
            }
        });
    }

    @Override // p275t3.InterfaceC4618a
    /* renamed from: j */
    public final void mo18208j(final C5108e c5108e) {
        final InterfaceC4621b.a m18425a1 = m18425a1();
        m18429o2(m18425a1, 1013, new C4045q.a() { // from class: t3.y0
            @Override // p222p5.C4045q.a
            public final void invoke(Object obj) {
                C4659n1.m18383j1(InterfaceC4621b.a.this, c5108e, (InterfaceC4621b) obj);
            }
        });
    }

    @Override // p275t3.InterfaceC4618a
    /* renamed from: k */
    public final void mo18209k(final Object obj, final long j10) {
        final InterfaceC4621b.a m18426b1 = m18426b1();
        m18429o2(m18426b1, 26, new C4045q.a() { // from class: t3.v
            @Override // p222p5.C4045q.a
            public final void invoke(Object obj2) {
                ((InterfaceC4621b) obj2).m18228K(InterfaceC4621b.a.this, obj, j10);
            }
        });
    }

    @Override // p275t3.InterfaceC4618a
    /* renamed from: l */
    public final void mo18210l(final long j10) {
        final InterfaceC4621b.a m18426b1 = m18426b1();
        m18429o2(m18426b1, 1010, new C4045q.a() { // from class: t3.o
            @Override // p222p5.C4045q.a
            public final void invoke(Object obj) {
                ((InterfaceC4621b) obj).m18262k(InterfaceC4621b.a.this, j10);
            }
        });
    }

    @Override // p275t3.InterfaceC4618a
    /* renamed from: m */
    public final void mo18211m(final C5108e c5108e) {
        final InterfaceC4621b.a m18426b1 = m18426b1();
        m18429o2(m18426b1, 1007, new C4045q.a() { // from class: t3.z0
            @Override // p222p5.C4045q.a
            public final void invoke(Object obj) {
                C4659n1.m18386k1(InterfaceC4621b.a.this, c5108e, (InterfaceC4621b) obj);
            }
        });
    }

    @Override // p275t3.InterfaceC4618a
    /* renamed from: n */
    public final void mo18212n(final Exception exc) {
        final InterfaceC4621b.a m18426b1 = m18426b1();
        m18429o2(m18426b1, 1029, new C4045q.a() { // from class: t3.r
            @Override // p222p5.C4045q.a
            public final void invoke(Object obj) {
                ((InterfaceC4621b) obj).m18283v(InterfaceC4621b.a.this, exc);
            }
        });
    }

    /* renamed from: n2 */
    public final void m18428n2() {
        final InterfaceC4621b.a m18420V0 = m18420V0();
        m18429o2(m18420V0, 1028, new C4045q.a() { // from class: t3.y
            @Override // p222p5.C4045q.a
            public final void invoke(Object obj) {
                ((InterfaceC4621b) obj).m18253f(InterfaceC4621b.a.this);
            }
        });
        this.f17401f.m15514j();
    }

    @Override // p275t3.InterfaceC4618a
    /* renamed from: o */
    public final void mo18213o(final Exception exc) {
        final InterfaceC4621b.a m18426b1 = m18426b1();
        m18429o2(m18426b1, 1030, new C4045q.a() { // from class: t3.s
            @Override // p222p5.C4045q.a
            public final void invoke(Object obj) {
                ((InterfaceC4621b) obj).m18240X(InterfaceC4621b.a.this, exc);
            }
        });
    }

    /* renamed from: o2 */
    public final void m18429o2(InterfaceC4621b.a aVar, int i10, C4045q.a<InterfaceC4621b> aVar2) {
        this.f17400e.put(i10, aVar);
        this.f17401f.m15515k(i10, aVar2);
    }

    @Override // p264s3.InterfaceC4409b3.d
    public final void onAudioAttributesChanged(final C4813e c4813e) {
        final InterfaceC4621b.a m18426b1 = m18426b1();
        m18429o2(m18426b1, 20, new C4045q.a() { // from class: t3.p0
            @Override // p222p5.C4045q.a
            public final void invoke(Object obj) {
                ((InterfaceC4621b) obj).m18221D(InterfaceC4621b.a.this, c4813e);
            }
        });
    }

    @Override // p264s3.InterfaceC4409b3.d
    public void onAvailableCommandsChanged(final InterfaceC4409b3.b bVar) {
        final InterfaceC4621b.a m18420V0 = m18420V0();
        m18429o2(m18420V0, 13, new C4045q.a() { // from class: t3.n0
            @Override // p222p5.C4045q.a
            public final void invoke(Object obj) {
                ((InterfaceC4621b) obj).m18237U(InterfaceC4621b.a.this, bVar);
            }
        });
    }

    @Override // p264s3.InterfaceC4409b3.d
    public void onCues(final C1550e c1550e) {
        final InterfaceC4621b.a m18420V0 = m18420V0();
        m18429o2(m18420V0, 27, new C4045q.a() { // from class: t3.q
            @Override // p222p5.C4045q.a
            public final void invoke(Object obj) {
                ((InterfaceC4621b) obj).m18247c(InterfaceC4621b.a.this, c1550e);
            }
        });
    }

    @Override // p264s3.InterfaceC4409b3.d
    public void onCues(final List<C1547b> list) {
        final InterfaceC4621b.a m18420V0 = m18420V0();
        m18429o2(m18420V0, 27, new C4045q.a() { // from class: t3.b0
            @Override // p222p5.C4045q.a
            public final void invoke(Object obj) {
                ((InterfaceC4621b) obj).m18244a0(InterfaceC4621b.a.this, list);
            }
        });
    }

    @Override // p264s3.InterfaceC4409b3.d
    public void onDeviceInfoChanged(final C4471o c4471o) {
        final InterfaceC4621b.a m18420V0 = m18420V0();
        m18429o2(m18420V0, 29, new C4045q.a() { // from class: t3.e0
            @Override // p222p5.C4045q.a
            public final void invoke(Object obj) {
                ((InterfaceC4621b) obj).m18236T(InterfaceC4621b.a.this, c4471o);
            }
        });
    }

    @Override // p264s3.InterfaceC4409b3.d
    public void onDeviceVolumeChanged(final int i10, final boolean z10) {
        final InterfaceC4621b.a m18420V0 = m18420V0();
        m18429o2(m18420V0, 30, new C4045q.a() { // from class: t3.m
            @Override // p222p5.C4045q.a
            public final void invoke(Object obj) {
                ((InterfaceC4621b) obj).m18245b(InterfaceC4621b.a.this, i10, z10);
            }
        });
    }

    @Override // p264s3.InterfaceC4409b3.d
    public void onEvents(InterfaceC4409b3 interfaceC4409b3, InterfaceC4409b3.c cVar) {
    }

    @Override // p264s3.InterfaceC4409b3.d
    public final void onIsLoadingChanged(final boolean z10) {
        final InterfaceC4621b.a m18420V0 = m18420V0();
        m18429o2(m18420V0, 3, new C4045q.a() { // from class: t3.d1
            @Override // p222p5.C4045q.a
            public final void invoke(Object obj) {
                C4659n1.m18302D1(InterfaceC4621b.a.this, z10, (InterfaceC4621b) obj);
            }
        });
    }

    @Override // p264s3.InterfaceC4409b3.d
    public void onIsPlayingChanged(final boolean z10) {
        final InterfaceC4621b.a m18420V0 = m18420V0();
        m18429o2(m18420V0, 7, new C4045q.a() { // from class: t3.b1
            @Override // p222p5.C4045q.a
            public final void invoke(Object obj) {
                ((InterfaceC4621b) obj).m18229L(InterfaceC4621b.a.this, z10);
            }
        });
    }

    @Override // p264s3.InterfaceC4409b3.d
    public void onLoadingChanged(boolean z10) {
    }

    @Override // p264s3.InterfaceC4409b3.d
    public final void onMediaItemTransition(final C4503u1 c4503u1, final int i10) {
        final InterfaceC4621b.a m18420V0 = m18420V0();
        m18429o2(m18420V0, 1, new C4045q.a() { // from class: t3.h0
            @Override // p222p5.C4045q.a
            public final void invoke(Object obj) {
                ((InterfaceC4621b) obj).m18227J(InterfaceC4621b.a.this, c4503u1, i10);
            }
        });
    }

    @Override // p264s3.InterfaceC4409b3.d
    public void onMediaMetadataChanged(final C4528z1 c4528z1) {
        final InterfaceC4621b.a m18420V0 = m18420V0();
        m18429o2(m18420V0, 14, new C4045q.a() { // from class: t3.i0
            @Override // p222p5.C4045q.a
            public final void invoke(Object obj) {
                ((InterfaceC4621b) obj).m18248c0(InterfaceC4621b.a.this, c4528z1);
            }
        });
    }

    @Override // p264s3.InterfaceC4409b3.d
    public final void onMetadata(final C3348a c3348a) {
        final InterfaceC4621b.a m18420V0 = m18420V0();
        m18429o2(m18420V0, 28, new C4045q.a() { // from class: t3.c0
            @Override // p222p5.C4045q.a
            public final void invoke(Object obj) {
                ((InterfaceC4621b) obj).m18218A(InterfaceC4621b.a.this, c3348a);
            }
        });
    }

    @Override // p264s3.InterfaceC4409b3.d
    public final void onPlayWhenReadyChanged(final boolean z10, final int i10) {
        final InterfaceC4621b.a m18420V0 = m18420V0();
        m18429o2(m18420V0, 5, new C4045q.a() { // from class: t3.e1
            @Override // p222p5.C4045q.a
            public final void invoke(Object obj) {
                ((InterfaceC4621b) obj).m18289y0(InterfaceC4621b.a.this, z10, i10);
            }
        });
    }

    @Override // p264s3.InterfaceC4409b3.d
    public final void onPlaybackParametersChanged(final C4403a3 c4403a3) {
        final InterfaceC4621b.a m18420V0 = m18420V0();
        m18429o2(m18420V0, 12, new C4045q.a() { // from class: t3.m0
            @Override // p222p5.C4045q.a
            public final void invoke(Object obj) {
                ((InterfaceC4621b) obj).m18259i0(InterfaceC4621b.a.this, c4403a3);
            }
        });
    }

    @Override // p264s3.InterfaceC4409b3.d
    public final void onPlaybackStateChanged(final int i10) {
        final InterfaceC4621b.a m18420V0 = m18420V0();
        m18429o2(m18420V0, 4, new C4045q.a() { // from class: t3.e
            @Override // p222p5.C4045q.a
            public final void invoke(Object obj) {
                ((InterfaceC4621b) obj).m18239W(InterfaceC4621b.a.this, i10);
            }
        });
    }

    @Override // p264s3.InterfaceC4409b3.d
    public final void onPlaybackSuppressionReasonChanged(final int i10) {
        final InterfaceC4621b.a m18420V0 = m18420V0();
        m18429o2(m18420V0, 6, new C4045q.a() { // from class: t3.f
            @Override // p222p5.C4045q.a
            public final void invoke(Object obj) {
                ((InterfaceC4621b) obj).m18274q0(InterfaceC4621b.a.this, i10);
            }
        });
    }

    @Override // p264s3.InterfaceC4409b3.d
    public final void onPlayerError(final C4519x2 c4519x2) {
        final InterfaceC4621b.a m18427c1 = m18427c1(c4519x2);
        m18429o2(m18427c1, 10, new C4045q.a() { // from class: t3.k0
            @Override // p222p5.C4045q.a
            public final void invoke(Object obj) {
                ((InterfaceC4621b) obj).mo18257h0(InterfaceC4621b.a.this, c4519x2);
            }
        });
    }

    @Override // p264s3.InterfaceC4409b3.d
    public void onPlayerErrorChanged(final C4519x2 c4519x2) {
        final InterfaceC4621b.a m18427c1 = m18427c1(c4519x2);
        m18429o2(m18427c1, 10, new C4045q.a() { // from class: t3.l0
            @Override // p222p5.C4045q.a
            public final void invoke(Object obj) {
                ((InterfaceC4621b) obj).m18252e0(InterfaceC4621b.a.this, c4519x2);
            }
        });
    }

    @Override // p264s3.InterfaceC4409b3.d
    public final void onPlayerStateChanged(final boolean z10, final int i10) {
        final InterfaceC4621b.a m18420V0 = m18420V0();
        m18429o2(m18420V0, -1, new C4045q.a() { // from class: t3.g1
            @Override // p222p5.C4045q.a
            public final void invoke(Object obj) {
                ((InterfaceC4621b) obj).m18280t0(InterfaceC4621b.a.this, z10, i10);
            }
        });
    }

    @Override // p264s3.InterfaceC4409b3.d
    public void onPositionDiscontinuity(int i10) {
    }

    @Override // p264s3.InterfaceC4409b3.d
    public final void onPositionDiscontinuity(final InterfaceC4409b3.e eVar, final InterfaceC4409b3.e eVar2, final int i10) {
        if (i10 == 1) {
            this.f17404i = false;
        }
        this.f17399d.m18439j((InterfaceC4409b3) C4014a.m15199e(this.f17402g));
        final InterfaceC4621b.a m18420V0 = m18420V0();
        m18429o2(m18420V0, 11, new C4045q.a() { // from class: t3.l
            @Override // p222p5.C4045q.a
            public final void invoke(Object obj) {
                C4659n1.m18344T1(InterfaceC4621b.a.this, i10, eVar, eVar2, (InterfaceC4621b) obj);
            }
        });
    }

    @Override // p264s3.InterfaceC4409b3.d
    public void onRenderedFirstFrame() {
    }

    @Override // p264s3.InterfaceC4409b3.d
    public final void onRepeatModeChanged(final int i10) {
        final InterfaceC4621b.a m18420V0 = m18420V0();
        m18429o2(m18420V0, 8, new C4045q.a() { // from class: t3.m1
            @Override // p222p5.C4045q.a
            public final void invoke(Object obj) {
                ((InterfaceC4621b) obj).m18249d(InterfaceC4621b.a.this, i10);
            }
        });
    }

    @Override // p264s3.InterfaceC4409b3.d
    public final void onSeekProcessed() {
        final InterfaceC4621b.a m18420V0 = m18420V0();
        m18429o2(m18420V0, -1, new C4045q.a() { // from class: t3.u0
            @Override // p222p5.C4045q.a
            public final void invoke(Object obj) {
                ((InterfaceC4621b) obj).m18233P(InterfaceC4621b.a.this);
            }
        });
    }

    @Override // p264s3.InterfaceC4409b3.d
    public final void onSkipSilenceEnabledChanged(final boolean z10) {
        final InterfaceC4621b.a m18426b1 = m18426b1();
        m18429o2(m18426b1, 23, new C4045q.a() { // from class: t3.c1
            @Override // p222p5.C4045q.a
            public final void invoke(Object obj) {
                ((InterfaceC4621b) obj).m18250d0(InterfaceC4621b.a.this, z10);
            }
        });
    }

    @Override // p264s3.InterfaceC4409b3.d
    public final void onSurfaceSizeChanged(final int i10, final int i11) {
        final InterfaceC4621b.a m18426b1 = m18426b1();
        m18429o2(m18426b1, 24, new C4045q.a() { // from class: t3.h
            @Override // p222p5.C4045q.a
            public final void invoke(Object obj) {
                ((InterfaceC4621b) obj).m18232O(InterfaceC4621b.a.this, i10, i11);
            }
        });
    }

    @Override // p264s3.InterfaceC4409b3.d
    public final void onTimelineChanged(AbstractC4505u3 abstractC4505u3, final int i10) {
        this.f17399d.m18441l((InterfaceC4409b3) C4014a.m15199e(this.f17402g));
        final InterfaceC4621b.a m18420V0 = m18420V0();
        m18429o2(m18420V0, 0, new C4045q.a() { // from class: t3.g
            @Override // p222p5.C4045q.a
            public final void invoke(Object obj) {
                ((InterfaceC4621b) obj).m18226I(InterfaceC4621b.a.this, i10);
            }
        });
    }

    @Override // p264s3.InterfaceC4409b3.d
    public void onTracksChanged(final C4530z3 c4530z3) {
        final InterfaceC4621b.a m18420V0 = m18420V0();
        m18429o2(m18420V0, 2, new C4045q.a() { // from class: t3.o0
            @Override // p222p5.C4045q.a
            public final void invoke(Object obj) {
                ((InterfaceC4621b) obj).m18242Z(InterfaceC4621b.a.this, c4530z3);
            }
        });
    }

    @Override // p264s3.InterfaceC4409b3.d
    public final void onVideoSizeChanged(final C4192y c4192y) {
        final InterfaceC4621b.a m18426b1 = m18426b1();
        m18429o2(m18426b1, 25, new C4045q.a() { // from class: t3.d0
            @Override // p222p5.C4045q.a
            public final void invoke(Object obj) {
                C4659n1.m18384j2(InterfaceC4621b.a.this, c4192y, (InterfaceC4621b) obj);
            }
        });
    }

    @Override // p264s3.InterfaceC4409b3.d
    public final void onVolumeChanged(final float f10) {
        final InterfaceC4621b.a m18426b1 = m18426b1();
        m18429o2(m18426b1, 22, new C4045q.a() { // from class: t3.l1
            @Override // p222p5.C4045q.a
            public final void invoke(Object obj) {
                ((InterfaceC4621b) obj).m18264l(InterfaceC4621b.a.this, f10);
            }
        });
    }

    @Override // p275t3.InterfaceC4618a
    /* renamed from: p */
    public final void mo18214p(final C5108e c5108e) {
        final InterfaceC4621b.a m18425a1 = m18425a1();
        m18429o2(m18425a1, 1020, new C4045q.a() { // from class: t3.x0
            @Override // p222p5.C4045q.a
            public final void invoke(Object obj) {
                C4659n1.m18372f2(InterfaceC4621b.a.this, c5108e, (InterfaceC4621b) obj);
            }
        });
    }

    @Override // p275t3.InterfaceC4618a
    /* renamed from: q */
    public final void mo18215q(final int i10, final long j10, final long j11) {
        final InterfaceC4621b.a m18426b1 = m18426b1();
        m18429o2(m18426b1, 1011, new C4045q.a() { // from class: t3.k
            @Override // p222p5.C4045q.a
            public final void invoke(Object obj) {
                ((InterfaceC4621b) obj).m18235S(InterfaceC4621b.a.this, i10, j10, j11);
            }
        });
    }

    @Override // p275t3.InterfaceC4618a
    /* renamed from: r */
    public final void mo18216r(final long j10, final int i10) {
        final InterfaceC4621b.a m18425a1 = m18425a1();
        m18429o2(m18425a1, 1021, new C4045q.a() { // from class: t3.p
            @Override // p222p5.C4045q.a
            public final void invoke(Object obj) {
                ((InterfaceC4621b) obj).m18267n(InterfaceC4621b.a.this, j10, i10);
            }
        });
    }

    @Override // p275t3.InterfaceC4618a
    public void release() {
        ((InterfaceC4040n) C4014a.m15202h(this.f17403h)).mo15319b(new Runnable() { // from class: t3.c
            @Override // java.lang.Runnable
            public final void run() {
                C4659n1.this.m18428n2();
            }
        });
    }

    @Override // p317w3.InterfaceC5255u
    /* renamed from: s */
    public final void mo17586s(int i10, InterfaceC4882t.b bVar) {
        final InterfaceC4621b.a m18424Z0 = m18424Z0(i10, bVar);
        m18429o2(m18424Z0, 1023, new C4045q.a() { // from class: t3.j0
            @Override // p222p5.C4045q.a
            public final void invoke(Object obj) {
                ((InterfaceC4621b) obj).m18251e(InterfaceC4621b.a.this);
            }
        });
    }

    @Override // p317w3.InterfaceC5255u
    /* renamed from: t */
    public final void mo17587t(int i10, InterfaceC4882t.b bVar) {
        final InterfaceC4621b.a m18424Z0 = m18424Z0(i10, bVar);
        m18429o2(m18424Z0, 1027, new C4045q.a() { // from class: t3.n
            @Override // p222p5.C4045q.a
            public final void invoke(Object obj) {
                ((InterfaceC4621b) obj).m18279t(InterfaceC4621b.a.this);
            }
        });
    }

    @Override // p290u4.InterfaceC4845a0
    /* renamed from: u */
    public final void mo17588u(int i10, InterfaceC4882t.b bVar, final C4870n c4870n, final C4876q c4876q) {
        final InterfaceC4621b.a m18424Z0 = m18424Z0(i10, bVar);
        m18429o2(m18424Z0, 1001, new C4045q.a() { // from class: t3.q0
            @Override // p222p5.C4045q.a
            public final void invoke(Object obj) {
                ((InterfaceC4621b) obj).m18281u(InterfaceC4621b.a.this, c4870n, c4876q);
            }
        });
    }

    @Override // p206o5.InterfaceC3900e.a
    /* renamed from: v */
    public final void mo14785v(final int i10, final long j10, final long j11) {
        final InterfaceC4621b.a m18423Y0 = m18423Y0();
        m18429o2(m18423Y0, 1006, new C4045q.a() { // from class: t3.j
            @Override // p222p5.C4045q.a
            public final void invoke(Object obj) {
                ((InterfaceC4621b) obj).mo18254f0(InterfaceC4621b.a.this, i10, j10, j11);
            }
        });
    }

    @Override // p275t3.InterfaceC4618a
    /* renamed from: w */
    public final void mo18217w() {
        if (this.f17404i) {
            return;
        }
        final InterfaceC4621b.a m18420V0 = m18420V0();
        this.f17404i = true;
        m18429o2(m18420V0, -1, new C4045q.a() { // from class: t3.k1
            @Override // p222p5.C4045q.a
            public final void invoke(Object obj) {
                ((InterfaceC4621b) obj).m18273q(InterfaceC4621b.a.this);
            }
        });
    }

    @Override // p290u4.InterfaceC4845a0
    /* renamed from: y */
    public final void mo17589y(int i10, InterfaceC4882t.b bVar, final C4870n c4870n, final C4876q c4876q) {
        final InterfaceC4621b.a m18424Z0 = m18424Z0(i10, bVar);
        m18429o2(m18424Z0, 1000, new C4045q.a() { // from class: t3.s0
            @Override // p222p5.C4045q.a
            public final void invoke(Object obj) {
                ((InterfaceC4621b) obj).m18222E(InterfaceC4621b.a.this, c4870n, c4876q);
            }
        });
    }

    @Override // p290u4.InterfaceC4845a0
    /* renamed from: z */
    public final void mo17590z(int i10, InterfaceC4882t.b bVar, final C4876q c4876q) {
        final InterfaceC4621b.a m18424Z0 = m18424Z0(i10, bVar);
        m18429o2(m18424Z0, 1005, new C4045q.a() { // from class: t3.w0
            @Override // p222p5.C4045q.a
            public final void invoke(Object obj) {
                ((InterfaceC4621b) obj).m18258i(InterfaceC4621b.a.this, c4876q);
            }
        });
    }
}
