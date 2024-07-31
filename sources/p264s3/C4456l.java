package p264s3;

import p222p5.C4014a;
import p222p5.C4025f0;
import p222p5.InterfaceC4020d;
import p222p5.InterfaceC4048t;

/* renamed from: s3.l */
/* loaded from: classes.dex */
public final class C4456l implements InterfaceC4048t {

    /* renamed from: h */
    public final C4025f0 f16426h;

    /* renamed from: i */
    public final a f16427i;

    /* renamed from: j */
    public InterfaceC4445i3 f16428j;

    /* renamed from: k */
    public InterfaceC4048t f16429k;

    /* renamed from: l */
    public boolean f16430l = true;

    /* renamed from: m */
    public boolean f16431m;

    /* renamed from: s3.l$a */
    /* loaded from: classes.dex */
    public interface a {
        void onPlaybackParametersChanged(C4403a3 c4403a3);
    }

    public C4456l(a aVar, InterfaceC4020d interfaceC4020d) {
        this.f16427i = aVar;
        this.f16426h = new C4025f0(interfaceC4020d);
    }

    /* renamed from: a */
    public void m17389a(InterfaceC4445i3 interfaceC4445i3) {
        if (interfaceC4445i3 == this.f16428j) {
            this.f16429k = null;
            this.f16428j = null;
            this.f16430l = true;
        }
    }

    /* renamed from: b */
    public void m17390b(InterfaceC4445i3 interfaceC4445i3) {
        InterfaceC4048t interfaceC4048t;
        InterfaceC4048t mo17200E = interfaceC4445i3.mo17200E();
        if (mo17200E == null || mo17200E == (interfaceC4048t = this.f16429k)) {
            return;
        }
        if (interfaceC4048t != null) {
            throw C4481q.m17506h(new IllegalStateException("Multiple renderer media clocks enabled."));
        }
        this.f16429k = mo17200E;
        this.f16428j = interfaceC4445i3;
        mo17200E.mo15307d(this.f16426h.mo15308h());
    }

    /* renamed from: c */
    public void m17391c(long j10) {
        this.f16426h.m15304a(j10);
    }

    @Override // p222p5.InterfaceC4048t
    /* renamed from: d */
    public void mo15307d(C4403a3 c4403a3) {
        InterfaceC4048t interfaceC4048t = this.f16429k;
        if (interfaceC4048t != null) {
            interfaceC4048t.mo15307d(c4403a3);
            c4403a3 = this.f16429k.mo15308h();
        }
        this.f16426h.mo15307d(c4403a3);
    }

    /* renamed from: e */
    public final boolean m17392e(boolean z10) {
        InterfaceC4445i3 interfaceC4445i3 = this.f16428j;
        return interfaceC4445i3 == null || interfaceC4445i3.mo6376c() || (!this.f16428j.mo6379e() && (z10 || this.f16428j.mo17216j()));
    }

    /* renamed from: f */
    public void m17393f() {
        this.f16431m = true;
        this.f16426h.m15305b();
    }

    /* renamed from: g */
    public void m17394g() {
        this.f16431m = false;
        this.f16426h.m15306c();
    }

    @Override // p222p5.InterfaceC4048t
    /* renamed from: h */
    public C4403a3 mo15308h() {
        InterfaceC4048t interfaceC4048t = this.f16429k;
        return interfaceC4048t != null ? interfaceC4048t.mo15308h() : this.f16426h.mo15308h();
    }

    /* renamed from: i */
    public long m17395i(boolean z10) {
        m17396j(z10);
        return mo15309s();
    }

    /* renamed from: j */
    public final void m17396j(boolean z10) {
        if (m17392e(z10)) {
            this.f16430l = true;
            if (this.f16431m) {
                this.f16426h.m15305b();
                return;
            }
            return;
        }
        InterfaceC4048t interfaceC4048t = (InterfaceC4048t) C4014a.m15199e(this.f16429k);
        long mo15309s = interfaceC4048t.mo15309s();
        if (this.f16430l) {
            if (mo15309s < this.f16426h.mo15309s()) {
                this.f16426h.m15306c();
                return;
            } else {
                this.f16430l = false;
                if (this.f16431m) {
                    this.f16426h.m15305b();
                }
            }
        }
        this.f16426h.m15304a(mo15309s);
        C4403a3 mo15308h = interfaceC4048t.mo15308h();
        if (mo15308h.equals(this.f16426h.mo15308h())) {
            return;
        }
        this.f16426h.mo15307d(mo15308h);
        this.f16427i.onPlaybackParametersChanged(mo15308h);
    }

    @Override // p222p5.InterfaceC4048t
    /* renamed from: s */
    public long mo15309s() {
        return this.f16430l ? this.f16426h.mo15309s() : ((InterfaceC4048t) C4014a.m15199e(this.f16429k)).mo15309s();
    }
}
