package p264s3;

import p222p5.C4014a;
import p222p5.InterfaceC4048t;
import p275t3.C4674s1;
import p290u4.InterfaceC4869m0;
import p304v3.C5110g;

/* renamed from: s3.f */
/* loaded from: classes.dex */
public abstract class AbstractC4426f implements InterfaceC4445i3, InterfaceC4450j3 {

    /* renamed from: h */
    public final int f16258h;

    /* renamed from: j */
    public C4455k3 f16260j;

    /* renamed from: k */
    public int f16261k;

    /* renamed from: l */
    public C4674s1 f16262l;

    /* renamed from: m */
    public int f16263m;

    /* renamed from: n */
    public InterfaceC4869m0 f16264n;

    /* renamed from: o */
    public C4463m1[] f16265o;

    /* renamed from: p */
    public long f16266p;

    /* renamed from: q */
    public long f16267q;

    /* renamed from: s */
    public boolean f16269s;

    /* renamed from: t */
    public boolean f16270t;

    /* renamed from: i */
    public final C4468n1 f16259i = new C4468n1();

    /* renamed from: r */
    public long f16268r = Long.MIN_VALUE;

    public AbstractC4426f(int i10) {
        this.f16258h = i10;
    }

    @Override // p264s3.InterfaceC4445i3
    /* renamed from: A */
    public final void mo17196A(C4463m1[] c4463m1Arr, InterfaceC4869m0 interfaceC4869m0, long j10, long j11) {
        C4014a.m15200f(!this.f16269s);
        this.f16264n = interfaceC4869m0;
        if (this.f16268r == Long.MIN_VALUE) {
            this.f16268r = j10;
        }
        this.f16265o = c4463m1Arr;
        this.f16266p = j11;
        mo6370V(c4463m1Arr, j10, j11);
    }

    @Override // p264s3.InterfaceC4445i3
    /* renamed from: B */
    public final long mo17197B() {
        return this.f16268r;
    }

    @Override // p264s3.InterfaceC4445i3
    /* renamed from: C */
    public final void mo17198C(long j10) {
        m17211X(j10, false);
    }

    @Override // p264s3.InterfaceC4445i3
    /* renamed from: D */
    public final boolean mo17199D() {
        return this.f16269s;
    }

    @Override // p264s3.InterfaceC4445i3
    /* renamed from: E */
    public InterfaceC4048t mo17200E() {
        return null;
    }

    @Override // p264s3.InterfaceC4445i3
    /* renamed from: F */
    public final void mo17201F(C4455k3 c4455k3, C4463m1[] c4463m1Arr, InterfaceC4869m0 interfaceC4869m0, long j10, boolean z10, boolean z11, long j11, long j12) {
        C4014a.m15200f(this.f16263m == 0);
        this.f16260j = c4455k3;
        this.f16263m = 1;
        mo11627Q(z10, z11);
        mo17196A(c4463m1Arr, interfaceC4869m0, j11, j12);
        m17211X(j10, z10);
    }

    /* renamed from: H */
    public final C4481q m17202H(Throwable th, C4463m1 c4463m1, int i10) {
        return m17203I(th, c4463m1, false, i10);
    }

    /* renamed from: I */
    public final C4481q m17203I(Throwable th, C4463m1 c4463m1, boolean z10, int i10) {
        int i11;
        if (c4463m1 != null && !this.f16270t) {
            this.f16270t = true;
            try {
                i11 = InterfaceC4450j3.m17367G(mo6372a(c4463m1));
            } catch (C4481q unused) {
            } finally {
                this.f16270t = false;
            }
            return C4481q.m17504f(th, mo6374b(), m17206L(), c4463m1, i11, z10, i10);
        }
        i11 = 4;
        return C4481q.m17504f(th, mo6374b(), m17206L(), c4463m1, i11, z10, i10);
    }

    /* renamed from: J */
    public final C4455k3 m17204J() {
        return (C4455k3) C4014a.m15199e(this.f16260j);
    }

    /* renamed from: K */
    public final C4468n1 m17205K() {
        this.f16259i.m17483a();
        return this.f16259i;
    }

    /* renamed from: L */
    public final int m17206L() {
        return this.f16261k;
    }

    /* renamed from: M */
    public final C4674s1 m17207M() {
        return (C4674s1) C4014a.m15199e(this.f16262l);
    }

    /* renamed from: N */
    public final C4463m1[] m17208N() {
        return (C4463m1[]) C4014a.m15199e(this.f16265o);
    }

    /* renamed from: O */
    public final boolean m17209O() {
        return mo17216j() ? this.f16269s : ((InterfaceC4869m0) C4014a.m15199e(this.f16264n)).mo19252e();
    }

    /* renamed from: P */
    public abstract void mo6368P();

    /* renamed from: Q */
    public void mo11627Q(boolean z10, boolean z11) {
    }

    /* renamed from: R */
    public abstract void mo6369R(long j10, boolean z10);

    /* renamed from: S */
    public void mo11630S() {
    }

    /* renamed from: T */
    public void mo11632T() {
    }

    /* renamed from: U */
    public void mo11634U() {
    }

    /* renamed from: V */
    public abstract void mo6370V(C4463m1[] c4463m1Arr, long j10, long j11);

    /* renamed from: W */
    public final int m17210W(C4468n1 c4468n1, C5110g c5110g, int i10) {
        int mo19253j = ((InterfaceC4869m0) C4014a.m15199e(this.f16264n)).mo19253j(c4468n1, c5110g, i10);
        if (mo19253j == -4) {
            if (c5110g.m20748q()) {
                this.f16268r = Long.MIN_VALUE;
                return this.f16269s ? -4 : -3;
            }
            long j10 = c5110g.f19286l + this.f16266p;
            c5110g.f19286l = j10;
            this.f16268r = Math.max(this.f16268r, j10);
        } else if (mo19253j == -5) {
            C4463m1 c4463m1 = (C4463m1) C4014a.m15199e(c4468n1.f16559b);
            if (c4463m1.f16510w != Long.MAX_VALUE) {
                c4468n1.f16559b = c4463m1.m17411b().m17478k0(c4463m1.f16510w + this.f16266p).m17448G();
            }
        }
        return mo19253j;
    }

    /* renamed from: X */
    public final void m17211X(long j10, boolean z10) {
        this.f16269s = false;
        this.f16267q = j10;
        this.f16268r = j10;
        mo6369R(j10, z10);
    }

    /* renamed from: Y */
    public int m17212Y(long j10) {
        return ((InterfaceC4869m0) C4014a.m15199e(this.f16264n)).mo19254n(j10 - this.f16266p);
    }

    @Override // p264s3.InterfaceC4445i3
    /* renamed from: f */
    public final void mo17213f() {
        C4014a.m15200f(this.f16263m == 1);
        this.f16259i.m17483a();
        this.f16263m = 0;
        this.f16264n = null;
        this.f16265o = null;
        this.f16269s = false;
        mo6368P();
    }

    @Override // p264s3.InterfaceC4445i3
    /* renamed from: g */
    public final InterfaceC4869m0 mo17214g() {
        return this.f16264n;
    }

    @Override // p264s3.InterfaceC4445i3
    public final int getState() {
        return this.f16263m;
    }

    @Override // p264s3.InterfaceC4445i3, p264s3.InterfaceC4450j3
    /* renamed from: i */
    public final int mo17215i() {
        return this.f16258h;
    }

    @Override // p264s3.InterfaceC4445i3
    /* renamed from: j */
    public final boolean mo17216j() {
        return this.f16268r == Long.MIN_VALUE;
    }

    @Override // p264s3.InterfaceC4445i3
    /* renamed from: l */
    public final void mo17217l() {
        this.f16269s = true;
    }

    @Override // p264s3.InterfaceC4445i3
    /* renamed from: m */
    public final void mo17218m(int i10, C4674s1 c4674s1) {
        this.f16261k = i10;
        this.f16262l = c4674s1;
    }

    @Override // p264s3.InterfaceC4445i3
    /* renamed from: q */
    public final InterfaceC4450j3 mo17219q() {
        return this;
    }

    @Override // p264s3.InterfaceC4445i3
    public final void reset() {
        C4014a.m15200f(this.f16263m == 0);
        this.f16259i.m17483a();
        mo11630S();
    }

    @Override // p264s3.InterfaceC4445i3
    public final void start() {
        C4014a.m15200f(this.f16263m == 1);
        this.f16263m = 2;
        mo11632T();
    }

    @Override // p264s3.InterfaceC4445i3
    public final void stop() {
        C4014a.m15200f(this.f16263m == 2);
        this.f16263m = 1;
        mo11634U();
    }

    /* renamed from: w */
    public int mo11678w() {
        return 0;
    }

    @Override // p264s3.C4425e3.b
    /* renamed from: y */
    public void mo16091y(int i10, Object obj) {
    }

    @Override // p264s3.InterfaceC4445i3
    /* renamed from: z */
    public final void mo17220z() {
        ((InterfaceC4869m0) C4014a.m15199e(this.f16264n)).mo19250a();
    }
}
