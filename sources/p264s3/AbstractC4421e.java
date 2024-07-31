package p264s3;

import p264s3.AbstractC4505u3;

/* renamed from: s3.e */
/* loaded from: classes.dex */
public abstract class AbstractC4421e implements InterfaceC4409b3 {

    /* renamed from: a */
    public final AbstractC4505u3.d f16241a = new AbstractC4505u3.d();

    @Override // p264s3.InterfaceC4409b3
    /* renamed from: C */
    public final boolean mo17074C() {
        AbstractC4505u3 mo17077F = mo17077F();
        return !mo17077F.m17676u() && mo17077F.m17675r(mo17072A(), this.f16241a).f16868p;
    }

    @Override // p264s3.InterfaceC4409b3
    /* renamed from: I */
    public final boolean mo17080I() {
        AbstractC4505u3 mo17077F = mo17077F();
        return !mo17077F.m17676u() && mo17077F.m17675r(mo17072A(), this.f16241a).m17706g();
    }

    /* renamed from: J */
    public final long m17172J() {
        AbstractC4505u3 mo17077F = mo17077F();
        if (mo17077F.m17676u()) {
            return -9223372036854775807L;
        }
        return mo17077F.m17675r(mo17072A(), this.f16241a).m17705f();
    }

    /* renamed from: K */
    public final int m17173K() {
        AbstractC4505u3 mo17077F = mo17077F();
        if (mo17077F.m17676u()) {
            return -1;
        }
        return mo17077F.mo17027i(mo17072A(), m17175M(), mo17078G());
    }

    /* renamed from: L */
    public final int m17174L() {
        AbstractC4505u3 mo17077F = mo17077F();
        if (mo17077F.m17676u()) {
            return -1;
        }
        return mo17077F.mo17029p(mo17072A(), m17175M(), mo17078G());
    }

    /* renamed from: M */
    public final int m17175M() {
        int mo17076E = mo17076E();
        if (mo17076E == 1) {
            return 0;
        }
        return mo17076E;
    }

    /* renamed from: N */
    public abstract void mo17176N(int i10, long j10, int i11, boolean z10);

    /* renamed from: O */
    public final void m17177O(long j10, int i10) {
        mo17176N(mo17072A(), j10, i10, false);
    }

    /* renamed from: P */
    public final void m17178P(int i10, int i11) {
        mo17176N(i10, -9223372036854775807L, i11, false);
    }

    @Override // p264s3.InterfaceC4409b3
    /* renamed from: b */
    public final void mo17082b(long j10) {
        m17177O(j10, 5);
    }

    @Override // p264s3.InterfaceC4409b3
    /* renamed from: m */
    public final void mo17091m() {
        m17178P(mo17072A(), 4);
    }

    @Override // p264s3.InterfaceC4409b3
    /* renamed from: n */
    public final boolean mo17092n() {
        return m17174L() != -1;
    }

    @Override // p264s3.InterfaceC4409b3
    /* renamed from: u */
    public final boolean mo17099u() {
        AbstractC4505u3 mo17077F = mo17077F();
        return !mo17077F.m17676u() && mo17077F.m17675r(mo17072A(), this.f16241a).f16867o;
    }

    @Override // p264s3.InterfaceC4409b3
    /* renamed from: y */
    public final boolean mo17102y() {
        return m17173K() != -1;
    }
}
