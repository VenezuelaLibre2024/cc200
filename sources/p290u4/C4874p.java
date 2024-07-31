package p290u4;

import p206o5.InterfaceC3894b;
import p222p5.C4041n0;
import p264s3.AbstractC4505u3;
import p264s3.C4503u1;
import p290u4.InterfaceC4882t;
import p305v4.C5116c;

/* renamed from: u4.p */
/* loaded from: classes.dex */
public final class C4874p extends AbstractC4889w0 {

    /* renamed from: A */
    public boolean f18419A;

    /* renamed from: t */
    public final boolean f18420t;

    /* renamed from: u */
    public final AbstractC4505u3.d f18421u;

    /* renamed from: v */
    public final AbstractC4505u3.b f18422v;

    /* renamed from: w */
    public a f18423w;

    /* renamed from: x */
    public C4872o f18424x;

    /* renamed from: y */
    public boolean f18425y;

    /* renamed from: z */
    public boolean f18426z;

    /* renamed from: u4.p$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC4866l {

        /* renamed from: p */
        public static final Object f18427p = new Object();

        /* renamed from: n */
        public final Object f18428n;

        /* renamed from: o */
        public final Object f18429o;

        public a(AbstractC4505u3 abstractC4505u3, Object obj, Object obj2) {
            super(abstractC4505u3);
            this.f18428n = obj;
            this.f18429o = obj2;
        }

        /* renamed from: y */
        public static a m19427y(C4503u1 c4503u1) {
            return new a(new b(c4503u1), AbstractC4505u3.d.f16858y, f18427p);
        }

        /* renamed from: z */
        public static a m19428z(AbstractC4505u3 abstractC4505u3, Object obj, Object obj2) {
            return new a(abstractC4505u3, obj, obj2);
        }

        @Override // p290u4.AbstractC4866l, p264s3.AbstractC4505u3
        /* renamed from: f */
        public int mo4743f(Object obj) {
            Object obj2;
            AbstractC4505u3 abstractC4505u3 = this.f18355m;
            if (f18427p.equals(obj) && (obj2 = this.f18429o) != null) {
                obj = obj2;
            }
            return abstractC4505u3.mo4743f(obj);
        }

        @Override // p290u4.AbstractC4866l, p264s3.AbstractC4505u3
        /* renamed from: k */
        public AbstractC4505u3.b mo4744k(int i10, AbstractC4505u3.b bVar, boolean z10) {
            this.f18355m.mo4744k(i10, bVar, z10);
            if (C4041n0.m15449c(bVar.f16833i, this.f18429o) && z10) {
                bVar.f16833i = f18427p;
            }
            return bVar;
        }

        @Override // p290u4.AbstractC4866l, p264s3.AbstractC4505u3
        /* renamed from: q */
        public Object mo4746q(int i10) {
            Object mo4746q = this.f18355m.mo4746q(i10);
            return C4041n0.m15449c(mo4746q, this.f18429o) ? f18427p : mo4746q;
        }

        @Override // p290u4.AbstractC4866l, p264s3.AbstractC4505u3
        /* renamed from: s */
        public AbstractC4505u3.d mo4747s(int i10, AbstractC4505u3.d dVar, long j10) {
            this.f18355m.mo4747s(i10, dVar, j10);
            if (C4041n0.m15449c(dVar.f16860h, this.f18428n)) {
                dVar.f16860h = AbstractC4505u3.d.f16858y;
            }
            return dVar;
        }

        /* renamed from: x */
        public a m19429x(AbstractC4505u3 abstractC4505u3) {
            return new a(abstractC4505u3, this.f18428n, this.f18429o);
        }
    }

    /* renamed from: u4.p$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC4505u3 {

        /* renamed from: m */
        public final C4503u1 f18430m;

        public b(C4503u1 c4503u1) {
            this.f18430m = c4503u1;
        }

        @Override // p264s3.AbstractC4505u3
        /* renamed from: f */
        public int mo4743f(Object obj) {
            return obj == a.f18427p ? 0 : -1;
        }

        @Override // p264s3.AbstractC4505u3
        /* renamed from: k */
        public AbstractC4505u3.b mo4744k(int i10, AbstractC4505u3.b bVar, boolean z10) {
            bVar.m17699v(z10 ? 0 : null, z10 ? a.f18427p : null, 0, -9223372036854775807L, 0L, C5116c.f19315n, true);
            return bVar;
        }

        @Override // p264s3.AbstractC4505u3
        /* renamed from: m */
        public int mo4745m() {
            return 1;
        }

        @Override // p264s3.AbstractC4505u3
        /* renamed from: q */
        public Object mo4746q(int i10) {
            return a.f18427p;
        }

        @Override // p264s3.AbstractC4505u3
        /* renamed from: s */
        public AbstractC4505u3.d mo4747s(int i10, AbstractC4505u3.d dVar, long j10) {
            dVar.m17707h(AbstractC4505u3.d.f16858y, this.f18430m, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0, 0L);
            dVar.f16871s = true;
            return dVar;
        }

        @Override // p264s3.AbstractC4505u3
        /* renamed from: t */
        public int mo4748t() {
            return 1;
        }
    }

    public C4874p(InterfaceC4882t interfaceC4882t, boolean z10) {
        super(interfaceC4882t);
        this.f18420t = z10 && interfaceC4882t.mo19447j();
        this.f18421u = new AbstractC4505u3.d();
        this.f18422v = new AbstractC4505u3.b();
        AbstractC4505u3 mo19448l = interfaceC4882t.mo19448l();
        if (mo19448l == null) {
            this.f18423w = a.m19427y(interfaceC4882t.mo4733g());
        } else {
            this.f18423w = a.m19428z(mo19448l, null, null);
            this.f18419A = true;
        }
    }

    @Override // p290u4.AbstractC4854f, p290u4.AbstractC4844a
    /* renamed from: E */
    public void mo4715E() {
        this.f18426z = false;
        this.f18425y = false;
        super.mo4715E();
    }

    @Override // p290u4.AbstractC4889w0
    /* renamed from: N */
    public InterfaceC4882t.b mo19418N(InterfaceC4882t.b bVar) {
        return bVar.m19449c(m19422X(bVar.f18457a));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00bb  */
    @Override // p290u4.AbstractC4889w0
    /* renamed from: T */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo19419T(p264s3.AbstractC4505u3 r15) {
        /*
            r14 = this;
            boolean r0 = r14.f18426z
            if (r0 == 0) goto L19
            u4.p$a r0 = r14.f18423w
            u4.p$a r15 = r0.m19429x(r15)
            r14.f18423w = r15
            u4.o r15 = r14.f18424x
            if (r15 == 0) goto Lae
            long r0 = r15.m19400n()
            r14.m19425a0(r0)
            goto Lae
        L19:
            boolean r0 = r15.m17676u()
            if (r0 == 0) goto L36
            boolean r0 = r14.f18419A
            if (r0 == 0) goto L2a
            u4.p$a r0 = r14.f18423w
            u4.p$a r15 = r0.m19429x(r15)
            goto L32
        L2a:
            java.lang.Object r0 = p264s3.AbstractC4505u3.d.f16858y
            java.lang.Object r1 = p290u4.C4874p.a.f18427p
            u4.p$a r15 = p290u4.C4874p.a.m19428z(r15, r0, r1)
        L32:
            r14.f18423w = r15
            goto Lae
        L36:
            s3.u3$d r0 = r14.f18421u
            r1 = 0
            r15.m17675r(r1, r0)
            s3.u3$d r0 = r14.f18421u
            long r2 = r0.m17704e()
            s3.u3$d r0 = r14.f18421u
            java.lang.Object r0 = r0.f16860h
            u4.o r4 = r14.f18424x
            if (r4 == 0) goto L74
            long r4 = r4.m19401o()
            u4.p$a r6 = r14.f18423w
            u4.o r7 = r14.f18424x
            u4.t$b r7 = r7.f18407h
            java.lang.Object r7 = r7.f18457a
            s3.u3$b r8 = r14.f18422v
            r6.mo17028l(r7, r8)
            s3.u3$b r6 = r14.f18422v
            long r6 = r6.m17694q()
            long r6 = r6 + r4
            u4.p$a r4 = r14.f18423w
            s3.u3$d r5 = r14.f18421u
            s3.u3$d r1 = r4.m17675r(r1, r5)
            long r4 = r1.m17704e()
            int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r1 == 0) goto L74
            r12 = r6
            goto L75
        L74:
            r12 = r2
        L75:
            s3.u3$d r9 = r14.f18421u
            s3.u3$b r10 = r14.f18422v
            r11 = 0
            r8 = r15
            android.util.Pair r1 = r8.m17673n(r9, r10, r11, r12)
            java.lang.Object r2 = r1.first
            java.lang.Object r1 = r1.second
            java.lang.Long r1 = (java.lang.Long) r1
            long r3 = r1.longValue()
            boolean r1 = r14.f18419A
            if (r1 == 0) goto L94
            u4.p$a r0 = r14.f18423w
            u4.p$a r15 = r0.m19429x(r15)
            goto L98
        L94:
            u4.p$a r15 = p290u4.C4874p.a.m19428z(r15, r0, r2)
        L98:
            r14.f18423w = r15
            u4.o r15 = r14.f18424x
            if (r15 == 0) goto Lae
            r14.m19425a0(r3)
            u4.t$b r15 = r15.f18407h
            java.lang.Object r0 = r15.f18457a
            java.lang.Object r0 = r14.m19423Y(r0)
            u4.t$b r15 = r15.m19449c(r0)
            goto Laf
        Lae:
            r15 = 0
        Laf:
            r0 = 1
            r14.f18419A = r0
            r14.f18426z = r0
            u4.p$a r0 = r14.f18423w
            r14.m19191D(r0)
            if (r15 == 0) goto Lc6
            u4.o r0 = r14.f18424x
            java.lang.Object r0 = p222p5.C4014a.m15199e(r0)
            u4.o r0 = (p290u4.C4872o) r0
            r0.m19399h(r15)
        Lc6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p290u4.C4874p.mo19419T(s3.u3):void");
    }

    @Override // p290u4.AbstractC4889w0
    /* renamed from: V */
    public void mo19420V() {
        if (this.f18420t) {
            return;
        }
        this.f18425y = true;
        m19461U();
    }

    @Override // p290u4.InterfaceC4882t
    /* renamed from: W, reason: merged with bridge method [inline-methods] */
    public C4872o mo4727b(InterfaceC4882t.b bVar, InterfaceC3894b interfaceC3894b, long j10) {
        C4872o c4872o = new C4872o(bVar, interfaceC3894b, j10);
        c4872o.m19406x(this.f18491r);
        if (this.f18426z) {
            c4872o.m19399h(bVar.m19449c(m19423Y(bVar.f18457a)));
        } else {
            this.f18424x = c4872o;
            if (!this.f18425y) {
                this.f18425y = true;
                m19461U();
            }
        }
        return c4872o;
    }

    /* renamed from: X */
    public final Object m19422X(Object obj) {
        return (this.f18423w.f18429o == null || !this.f18423w.f18429o.equals(obj)) ? obj : a.f18427p;
    }

    /* renamed from: Y */
    public final Object m19423Y(Object obj) {
        return (this.f18423w.f18429o == null || !obj.equals(a.f18427p)) ? obj : this.f18423w.f18429o;
    }

    /* renamed from: Z */
    public AbstractC4505u3 m19424Z() {
        return this.f18423w;
    }

    @Override // p290u4.InterfaceC4882t
    /* renamed from: a */
    public void mo4725a(InterfaceC4878r interfaceC4878r) {
        ((C4872o) interfaceC4878r).m19405w();
        if (interfaceC4878r == this.f18424x) {
            this.f18424x = null;
        }
    }

    /* renamed from: a0 */
    public final void m19425a0(long j10) {
        C4872o c4872o = this.f18424x;
        int mo4743f = this.f18423w.mo4743f(c4872o.f18407h.f18457a);
        if (mo4743f == -1) {
            return;
        }
        long j11 = this.f18423w.m17672j(mo4743f, this.f18422v).f16835k;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            j10 = Math.max(0L, j11 - 1);
        }
        c4872o.m19404v(j10);
    }

    @Override // p290u4.InterfaceC4882t
    /* renamed from: h */
    public void mo4735h() {
    }
}
