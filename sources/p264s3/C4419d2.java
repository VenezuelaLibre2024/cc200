package p264s3;

import p126i7.AbstractC2651u;
import p193n5.AbstractC3734b0;
import p193n5.C3736c0;
import p206o5.InterfaceC3894b;
import p222p5.C4014a;
import p222p5.InterfaceC4040n;
import p264s3.AbstractC4505u3;
import p275t3.InterfaceC4618a;
import p290u4.InterfaceC4878r;
import p290u4.InterfaceC4882t;

/* renamed from: s3.d2 */
/* loaded from: classes.dex */
public final class C4419d2 {

    /* renamed from: a */
    public final AbstractC4505u3.b f16227a = new AbstractC4505u3.b();

    /* renamed from: b */
    public final AbstractC4505u3.d f16228b = new AbstractC4505u3.d();

    /* renamed from: c */
    public final InterfaceC4618a f16229c;

    /* renamed from: d */
    public final InterfaceC4040n f16230d;

    /* renamed from: e */
    public long f16231e;

    /* renamed from: f */
    public int f16232f;

    /* renamed from: g */
    public boolean f16233g;

    /* renamed from: h */
    public C4402a2 f16234h;

    /* renamed from: i */
    public C4402a2 f16235i;

    /* renamed from: j */
    public C4402a2 f16236j;

    /* renamed from: k */
    public int f16237k;

    /* renamed from: l */
    public Object f16238l;

    /* renamed from: m */
    public long f16239m;

    public C4419d2(InterfaceC4618a interfaceC4618a, InterfaceC4040n interfaceC4040n) {
        this.f16229c = interfaceC4618a;
        this.f16230d = interfaceC4040n;
    }

    /* renamed from: A */
    public static InterfaceC4882t.b m17138A(AbstractC4505u3 abstractC4505u3, Object obj, long j10, long j11, AbstractC4505u3.d dVar, AbstractC4505u3.b bVar) {
        abstractC4505u3.mo17028l(obj, bVar);
        abstractC4505u3.m17675r(bVar.f16834j, dVar);
        int mo4743f = abstractC4505u3.mo4743f(obj);
        Object obj2 = obj;
        while (bVar.f16835k == 0 && bVar.m17683f() > 0 && bVar.m17697t(bVar.m17695r()) && bVar.m17685h(0L) == -1) {
            int i10 = mo4743f + 1;
            if (mo4743f >= dVar.f16875w) {
                break;
            }
            abstractC4505u3.mo4744k(i10, bVar, true);
            obj2 = C4014a.m15199e(bVar.f16833i);
            mo4743f = i10;
        }
        abstractC4505u3.mo17028l(obj2, bVar);
        int m17685h = bVar.m17685h(j10);
        return m17685h == -1 ? new InterfaceC4882t.b(obj2, j11, bVar.m17684g(j10)) : new InterfaceC4882t.b(obj2, m17685h, bVar.m17691n(m17685h), j11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public /* synthetic */ void m17140w(AbstractC2651u.a aVar, InterfaceC4882t.b bVar) {
        this.f16229c.mo18197C(aVar.m10784k(), bVar);
    }

    /* renamed from: B */
    public InterfaceC4882t.b m17141B(AbstractC4505u3 abstractC4505u3, Object obj, long j10) {
        long m17142C = m17142C(abstractC4505u3, obj);
        abstractC4505u3.mo17028l(obj, this.f16227a);
        abstractC4505u3.m17675r(this.f16227a.f16834j, this.f16228b);
        boolean z10 = false;
        for (int mo4743f = abstractC4505u3.mo4743f(obj); mo4743f >= this.f16228b.f16874v; mo4743f--) {
            abstractC4505u3.mo4744k(mo4743f, this.f16227a, true);
            boolean z11 = this.f16227a.m17683f() > 0;
            z10 |= z11;
            AbstractC4505u3.b bVar = this.f16227a;
            if (bVar.m17685h(bVar.f16835k) != -1) {
                obj = C4014a.m15199e(this.f16227a.f16833i);
            }
            if (z10 && (!z11 || this.f16227a.f16835k != 0)) {
                break;
            }
        }
        return m17138A(abstractC4505u3, obj, j10, m17142C, this.f16228b, this.f16227a);
    }

    /* renamed from: C */
    public final long m17142C(AbstractC4505u3 abstractC4505u3, Object obj) {
        int mo4743f;
        int i10 = abstractC4505u3.mo17028l(obj, this.f16227a).f16834j;
        Object obj2 = this.f16238l;
        if (obj2 != null && (mo4743f = abstractC4505u3.mo4743f(obj2)) != -1 && abstractC4505u3.m17672j(mo4743f, this.f16227a).f16834j == i10) {
            return this.f16239m;
        }
        C4402a2 c4402a2 = this.f16234h;
        while (true) {
            if (c4402a2 == null) {
                c4402a2 = this.f16234h;
                while (c4402a2 != null) {
                    int mo4743f2 = abstractC4505u3.mo4743f(c4402a2.f16135b);
                    if (mo4743f2 == -1 || abstractC4505u3.m17672j(mo4743f2, this.f16227a).f16834j != i10) {
                        c4402a2 = c4402a2.m17044j();
                    }
                }
                long j10 = this.f16231e;
                this.f16231e = 1 + j10;
                if (this.f16234h == null) {
                    this.f16238l = obj;
                    this.f16239m = j10;
                }
                return j10;
            }
            if (c4402a2.f16135b.equals(obj)) {
                break;
            }
            c4402a2 = c4402a2.m17044j();
        }
        return c4402a2.f16139f.f16168a.f18460d;
    }

    /* renamed from: D */
    public boolean m17143D() {
        C4402a2 c4402a2 = this.f16236j;
        return c4402a2 == null || (!c4402a2.f16139f.f16176i && c4402a2.m17051q() && this.f16236j.f16139f.f16172e != -9223372036854775807L && this.f16237k < 100);
    }

    /* renamed from: E */
    public final boolean m17144E(AbstractC4505u3 abstractC4505u3) {
        C4402a2 c4402a2 = this.f16234h;
        if (c4402a2 == null) {
            return true;
        }
        int mo4743f = abstractC4505u3.mo4743f(c4402a2.f16135b);
        while (true) {
            mo4743f = abstractC4505u3.m17671h(mo4743f, this.f16227a, this.f16228b, this.f16232f, this.f16233g);
            while (c4402a2.m17044j() != null && !c4402a2.f16139f.f16174g) {
                c4402a2 = c4402a2.m17044j();
            }
            C4402a2 m17044j = c4402a2.m17044j();
            if (mo4743f == -1 || m17044j == null || abstractC4505u3.mo4743f(m17044j.f16135b) != mo4743f) {
                break;
            }
            c4402a2 = m17044j;
        }
        boolean m17171z = m17171z(c4402a2);
        c4402a2.f16139f = m17164r(abstractC4505u3, c4402a2.f16139f);
        return !m17171z;
    }

    /* renamed from: F */
    public boolean m17145F(AbstractC4505u3 abstractC4505u3, long j10, long j11) {
        C4408b2 c4408b2;
        C4402a2 c4402a2 = this.f16234h;
        C4402a2 c4402a22 = null;
        while (c4402a2 != null) {
            C4408b2 c4408b22 = c4402a2.f16139f;
            if (c4402a22 != null) {
                C4408b2 m17155i = m17155i(abstractC4505u3, c4402a22, j10);
                if (m17155i != null && m17151e(c4408b22, m17155i)) {
                    c4408b2 = m17155i;
                }
                return !m17171z(c4402a22);
            }
            c4408b2 = m17164r(abstractC4505u3, c4408b22);
            c4402a2.f16139f = c4408b2.m17070a(c4408b22.f16170c);
            if (!m17150d(c4408b22.f16172e, c4408b2.f16172e)) {
                c4402a2.m17035A();
                long j12 = c4408b2.f16172e;
                return (m17171z(c4402a2) || (c4402a2 == this.f16235i && !c4402a2.f16139f.f16173f && ((j11 > Long.MIN_VALUE ? 1 : (j11 == Long.MIN_VALUE ? 0 : -1)) == 0 || (j11 > ((j12 > (-9223372036854775807L) ? 1 : (j12 == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : c4402a2.m17059z(j12)) ? 1 : (j11 == ((j12 > (-9223372036854775807L) ? 1 : (j12 == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : c4402a2.m17059z(j12)) ? 0 : -1)) >= 0))) ? false : true;
            }
            c4402a22 = c4402a2;
            c4402a2 = c4402a2.m17044j();
        }
        return true;
    }

    /* renamed from: G */
    public boolean m17146G(AbstractC4505u3 abstractC4505u3, int i10) {
        this.f16232f = i10;
        return m17144E(abstractC4505u3);
    }

    /* renamed from: H */
    public boolean m17147H(AbstractC4505u3 abstractC4505u3, boolean z10) {
        this.f16233g = z10;
        return m17144E(abstractC4505u3);
    }

    /* renamed from: b */
    public C4402a2 m17148b() {
        C4402a2 c4402a2 = this.f16234h;
        if (c4402a2 == null) {
            return null;
        }
        if (c4402a2 == this.f16235i) {
            this.f16235i = c4402a2.m17044j();
        }
        this.f16234h.m17054t();
        int i10 = this.f16237k - 1;
        this.f16237k = i10;
        if (i10 == 0) {
            this.f16236j = null;
            C4402a2 c4402a22 = this.f16234h;
            this.f16238l = c4402a22.f16135b;
            this.f16239m = c4402a22.f16139f.f16168a.f18460d;
        }
        this.f16234h = this.f16234h.m17044j();
        m17169x();
        return this.f16234h;
    }

    /* renamed from: c */
    public C4402a2 m17149c() {
        C4402a2 c4402a2 = this.f16235i;
        C4014a.m15200f((c4402a2 == null || c4402a2.m17044j() == null) ? false : true);
        this.f16235i = this.f16235i.m17044j();
        m17169x();
        return this.f16235i;
    }

    /* renamed from: d */
    public final boolean m17150d(long j10, long j11) {
        return j10 == -9223372036854775807L || j10 == j11;
    }

    /* renamed from: e */
    public final boolean m17151e(C4408b2 c4408b2, C4408b2 c4408b22) {
        return c4408b2.f16169b == c4408b22.f16169b && c4408b2.f16168a.equals(c4408b22.f16168a);
    }

    /* renamed from: f */
    public void m17152f() {
        if (this.f16237k == 0) {
            return;
        }
        C4402a2 c4402a2 = (C4402a2) C4014a.m15202h(this.f16234h);
        this.f16238l = c4402a2.f16135b;
        this.f16239m = c4402a2.f16139f.f16168a.f18460d;
        while (c4402a2 != null) {
            c4402a2.m17054t();
            c4402a2 = c4402a2.m17044j();
        }
        this.f16234h = null;
        this.f16236j = null;
        this.f16235i = null;
        this.f16237k = 0;
        m17169x();
    }

    /* renamed from: g */
    public C4402a2 m17153g(InterfaceC4450j3[] interfaceC4450j3Arr, AbstractC3734b0 abstractC3734b0, InterfaceC3894b interfaceC3894b, C4494s2 c4494s2, C4408b2 c4408b2, C3736c0 c3736c0) {
        C4402a2 c4402a2 = this.f16236j;
        C4402a2 c4402a22 = new C4402a2(interfaceC4450j3Arr, c4402a2 == null ? 1000000000000L : (c4402a2.m17046l() + this.f16236j.f16139f.f16172e) - c4408b2.f16169b, abstractC3734b0, interfaceC3894b, c4494s2, c4408b2, c3736c0);
        C4402a2 c4402a23 = this.f16236j;
        if (c4402a23 != null) {
            c4402a23.m17056w(c4402a22);
        } else {
            this.f16234h = c4402a22;
            this.f16235i = c4402a22;
        }
        this.f16238l = null;
        this.f16236j = c4402a22;
        this.f16237k++;
        m17169x();
        return c4402a22;
    }

    /* renamed from: h */
    public final C4408b2 m17154h(C4524y2 c4524y2) {
        return m17157k(c4524y2.f16986a, c4524y2.f16987b, c4524y2.f16988c, c4524y2.f17003r);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00cc, code lost:
    
        if (r0.m17697t(r0.m17695r()) != false) goto L30;
     */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p264s3.C4408b2 m17155i(p264s3.AbstractC4505u3 r20, p264s3.C4402a2 r21, long r22) {
        /*
            Method dump skipped, instructions count: 450
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p264s3.C4419d2.m17155i(s3.u3, s3.a2, long):s3.b2");
    }

    /* renamed from: j */
    public C4402a2 m17156j() {
        return this.f16236j;
    }

    /* renamed from: k */
    public final C4408b2 m17157k(AbstractC4505u3 abstractC4505u3, InterfaceC4882t.b bVar, long j10, long j11) {
        abstractC4505u3.mo17028l(bVar.f18457a, this.f16227a);
        boolean m19438b = bVar.m19438b();
        Object obj = bVar.f18457a;
        return m19438b ? m17158l(abstractC4505u3, obj, bVar.f18458b, bVar.f18459c, j10, bVar.f18460d) : m17159m(abstractC4505u3, obj, j11, j10, bVar.f18460d);
    }

    /* renamed from: l */
    public final C4408b2 m17158l(AbstractC4505u3 abstractC4505u3, Object obj, int i10, int i11, long j10, long j11) {
        InterfaceC4882t.b bVar = new InterfaceC4882t.b(obj, i10, i11, j11);
        long m17682e = abstractC4505u3.mo17028l(bVar.f18457a, this.f16227a).m17682e(bVar.f18458b, bVar.f18459c);
        long m17687j = i11 == this.f16227a.m17691n(i10) ? this.f16227a.m17687j() : 0L;
        return new C4408b2(bVar, (m17682e == -9223372036854775807L || m17687j < m17682e) ? m17687j : Math.max(0L, m17682e - 1), j10, -9223372036854775807L, m17682e, this.f16227a.m17697t(bVar.f18458b), false, false, false);
    }

    /* renamed from: m */
    public final C4408b2 m17159m(AbstractC4505u3 abstractC4505u3, Object obj, long j10, long j11, long j12) {
        boolean z10;
        long j13;
        long j14;
        long j15;
        long j16 = j10;
        abstractC4505u3.mo17028l(obj, this.f16227a);
        int m17684g = this.f16227a.m17684g(j16);
        int i10 = 1;
        AbstractC4505u3.b bVar = this.f16227a;
        if (m17684g == -1) {
            if (bVar.m17683f() > 0) {
                AbstractC4505u3.b bVar2 = this.f16227a;
                if (bVar2.m17697t(bVar2.m17695r())) {
                    z10 = true;
                }
            }
            z10 = false;
        } else {
            if (bVar.m17697t(m17684g)) {
                long m17686i = this.f16227a.m17686i(m17684g);
                AbstractC4505u3.b bVar3 = this.f16227a;
                if (m17686i == bVar3.f16835k && bVar3.m17696s(m17684g)) {
                    z10 = true;
                    m17684g = -1;
                }
            }
            z10 = false;
        }
        InterfaceC4882t.b bVar4 = new InterfaceC4882t.b(obj, j12, m17684g);
        boolean m17165s = m17165s(bVar4);
        boolean m17167u = m17167u(abstractC4505u3, bVar4);
        boolean m17166t = m17166t(abstractC4505u3, bVar4, m17165s);
        boolean z11 = m17684g != -1 && this.f16227a.m17697t(m17684g);
        if (m17684g != -1) {
            j14 = this.f16227a.m17686i(m17684g);
        } else {
            if (!z10) {
                j13 = -9223372036854775807L;
                j15 = (j13 != -9223372036854775807L || j13 == Long.MIN_VALUE) ? this.f16227a.f16835k : j13;
                if (j15 != -9223372036854775807L && j16 >= j15) {
                    if (!m17166t && z10) {
                        i10 = 0;
                    }
                    j16 = Math.max(0L, j15 - i10);
                }
                return new C4408b2(bVar4, j16, j11, j13, j15, z11, m17165s, m17167u, m17166t);
            }
            j14 = this.f16227a.f16835k;
        }
        j13 = j14;
        if (j13 != -9223372036854775807L) {
        }
        if (j15 != -9223372036854775807L) {
            if (!m17166t) {
                i10 = 0;
            }
            j16 = Math.max(0L, j15 - i10);
        }
        return new C4408b2(bVar4, j16, j11, j13, j15, z11, m17165s, m17167u, m17166t);
    }

    /* renamed from: n */
    public final long m17160n(AbstractC4505u3 abstractC4505u3, Object obj, int i10) {
        abstractC4505u3.mo17028l(obj, this.f16227a);
        long m17686i = this.f16227a.m17686i(i10);
        return m17686i == Long.MIN_VALUE ? this.f16227a.f16835k : m17686i + this.f16227a.m17689l(i10);
    }

    /* renamed from: o */
    public C4408b2 m17161o(long j10, C4524y2 c4524y2) {
        C4402a2 c4402a2 = this.f16236j;
        return c4402a2 == null ? m17154h(c4524y2) : m17155i(c4524y2.f16986a, c4402a2, j10);
    }

    /* renamed from: p */
    public C4402a2 m17162p() {
        return this.f16234h;
    }

    /* renamed from: q */
    public C4402a2 m17163q() {
        return this.f16235i;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006c  */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p264s3.C4408b2 m17164r(p264s3.AbstractC4505u3 r19, p264s3.C4408b2 r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            u4.t$b r3 = r2.f16168a
            boolean r12 = r0.m17165s(r3)
            boolean r13 = r0.m17167u(r1, r3)
            boolean r14 = r0.m17166t(r1, r3, r12)
            u4.t$b r4 = r2.f16168a
            java.lang.Object r4 = r4.f18457a
            s3.u3$b r5 = r0.f16227a
            r1.mo17028l(r4, r5)
            boolean r1 = r3.m19438b()
            r4 = -1
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 != 0) goto L35
            int r1 = r3.f18461e
            if (r1 != r4) goto L2e
            goto L35
        L2e:
            s3.u3$b r7 = r0.f16227a
            long r7 = r7.m17686i(r1)
            goto L36
        L35:
            r7 = r5
        L36:
            boolean r1 = r3.m19438b()
            if (r1 == 0) goto L48
            s3.u3$b r1 = r0.f16227a
            int r5 = r3.f18458b
            int r6 = r3.f18459c
            long r5 = r1.m17682e(r5, r6)
        L46:
            r9 = r5
            goto L5c
        L48:
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r1 == 0) goto L55
            r5 = -9223372036854775808
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r1 != 0) goto L53
            goto L55
        L53:
            r9 = r7
            goto L5c
        L55:
            s3.u3$b r1 = r0.f16227a
            long r5 = r1.m17690m()
            goto L46
        L5c:
            boolean r1 = r3.m19438b()
            if (r1 == 0) goto L6c
            s3.u3$b r1 = r0.f16227a
            int r4 = r3.f18458b
            boolean r1 = r1.m17697t(r4)
        L6a:
            r11 = r1
            goto L7c
        L6c:
            int r1 = r3.f18461e
            if (r1 == r4) goto L7a
            s3.u3$b r4 = r0.f16227a
            boolean r1 = r4.m17697t(r1)
            if (r1 == 0) goto L7a
            r1 = 1
            goto L6a
        L7a:
            r1 = 0
            goto L6a
        L7c:
            s3.b2 r15 = new s3.b2
            long r4 = r2.f16169b
            long r1 = r2.f16170c
            r16 = r1
            r1 = r15
            r2 = r3
            r3 = r4
            r5 = r16
            r1.<init>(r2, r3, r5, r7, r9, r11, r12, r13, r14)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: p264s3.C4419d2.m17164r(s3.u3, s3.b2):s3.b2");
    }

    /* renamed from: s */
    public final boolean m17165s(InterfaceC4882t.b bVar) {
        return !bVar.m19438b() && bVar.f18461e == -1;
    }

    /* renamed from: t */
    public final boolean m17166t(AbstractC4505u3 abstractC4505u3, InterfaceC4882t.b bVar, boolean z10) {
        int mo4743f = abstractC4505u3.mo4743f(bVar.f18457a);
        return !abstractC4505u3.m17675r(abstractC4505u3.m17672j(mo4743f, this.f16227a).f16834j, this.f16228b).f16868p && abstractC4505u3.m17677v(mo4743f, this.f16227a, this.f16228b, this.f16232f, this.f16233g) && z10;
    }

    /* renamed from: u */
    public final boolean m17167u(AbstractC4505u3 abstractC4505u3, InterfaceC4882t.b bVar) {
        if (m17165s(bVar)) {
            return abstractC4505u3.m17675r(abstractC4505u3.mo17028l(bVar.f18457a, this.f16227a).f16834j, this.f16228b).f16875w == abstractC4505u3.mo4743f(bVar.f18457a);
        }
        return false;
    }

    /* renamed from: v */
    public boolean m17168v(InterfaceC4878r interfaceC4878r) {
        C4402a2 c4402a2 = this.f16236j;
        return c4402a2 != null && c4402a2.f16134a == interfaceC4878r;
    }

    /* renamed from: x */
    public final void m17169x() {
        final AbstractC2651u.a m10766n = AbstractC2651u.m10766n();
        for (C4402a2 c4402a2 = this.f16234h; c4402a2 != null; c4402a2 = c4402a2.m17044j()) {
            m10766n.mo10749a(c4402a2.f16139f.f16168a);
        }
        C4402a2 c4402a22 = this.f16235i;
        final InterfaceC4882t.b bVar = c4402a22 == null ? null : c4402a22.f16139f.f16168a;
        this.f16230d.mo15319b(new Runnable() { // from class: s3.c2
            @Override // java.lang.Runnable
            public final void run() {
                C4419d2.this.m17140w(m10766n, bVar);
            }
        });
    }

    /* renamed from: y */
    public void m17170y(long j10) {
        C4402a2 c4402a2 = this.f16236j;
        if (c4402a2 != null) {
            c4402a2.m17053s(j10);
        }
    }

    /* renamed from: z */
    public boolean m17171z(C4402a2 c4402a2) {
        boolean z10 = false;
        C4014a.m15200f(c4402a2 != null);
        if (c4402a2.equals(this.f16236j)) {
            return false;
        }
        this.f16236j = c4402a2;
        while (c4402a2.m17044j() != null) {
            c4402a2 = c4402a2.m17044j();
            if (c4402a2 == this.f16235i) {
                this.f16235i = this.f16234h;
                z10 = true;
            }
            c4402a2.m17054t();
            this.f16237k--;
        }
        this.f16236j.m17056w(null);
        m17169x();
        return z10;
    }
}
