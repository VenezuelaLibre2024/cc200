package p222p5;

import p264s3.C4403a3;

/* renamed from: p5.f0 */
/* loaded from: classes.dex */
public final class C4025f0 implements InterfaceC4048t {

    /* renamed from: h */
    public final InterfaceC4020d f14475h;

    /* renamed from: i */
    public boolean f14476i;

    /* renamed from: j */
    public long f14477j;

    /* renamed from: k */
    public long f14478k;

    /* renamed from: l */
    public C4403a3 f14479l = C4403a3.f16149k;

    public C4025f0(InterfaceC4020d interfaceC4020d) {
        this.f14475h = interfaceC4020d;
    }

    /* renamed from: a */
    public void m15304a(long j10) {
        this.f14477j = j10;
        if (this.f14476i) {
            this.f14478k = this.f14475h.mo15272b();
        }
    }

    /* renamed from: b */
    public void m15305b() {
        if (this.f14476i) {
            return;
        }
        this.f14478k = this.f14475h.mo15272b();
        this.f14476i = true;
    }

    /* renamed from: c */
    public void m15306c() {
        if (this.f14476i) {
            m15304a(mo15309s());
            this.f14476i = false;
        }
    }

    @Override // p222p5.InterfaceC4048t
    /* renamed from: d */
    public void mo15307d(C4403a3 c4403a3) {
        if (this.f14476i) {
            m15304a(mo15309s());
        }
        this.f14479l = c4403a3;
    }

    @Override // p222p5.InterfaceC4048t
    /* renamed from: h */
    public C4403a3 mo15308h() {
        return this.f14479l;
    }

    @Override // p222p5.InterfaceC4048t
    /* renamed from: s */
    public long mo15309s() {
        long j10 = this.f14477j;
        if (!this.f14476i) {
            return j10;
        }
        long mo15272b = this.f14475h.mo15272b() - this.f14478k;
        C4403a3 c4403a3 = this.f14479l;
        return j10 + (c4403a3.f16153h == 1.0f ? C4041n0.m15396B0(mo15272b) : c4403a3.m17062b(mo15272b));
    }
}
