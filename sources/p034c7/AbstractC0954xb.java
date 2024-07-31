package p034c7;

/* renamed from: c7.xb */
/* loaded from: classes.dex */
public abstract class AbstractC0954xb extends C0912ub {

    /* renamed from: c */
    public boolean f3746c;

    public AbstractC0954xb(C0968yb c0968yb) {
        super(c0968yb);
        this.f3647b.m4103n0();
    }

    /* renamed from: p */
    public final void m4002p() {
        if (!m4004r()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: q */
    public final void m4003q() {
        if (this.f3746c) {
            throw new IllegalStateException("Can't initialize twice");
        }
        mo3126s();
        this.f3647b.m4101m0();
        this.f3746c = true;
    }

    /* renamed from: r */
    public final boolean m4004r() {
        return this.f3746c;
    }

    /* renamed from: s */
    public abstract boolean mo3126s();
}
