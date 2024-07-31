package p034c7;

/* renamed from: c7.e3 */
/* loaded from: classes.dex */
public abstract class AbstractC0680e3 extends C0695f4 {

    /* renamed from: b */
    public boolean f2884b;

    public AbstractC0680e3(C0767k6 c0767k6) {
        super(c0767k6);
        this.f3198a.m3501i();
    }

    /* renamed from: q */
    public final void m3155q() {
        if (!m3159u()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: r */
    public final void m3156r() {
        if (this.f2884b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (mo3160v()) {
            return;
        }
        this.f3198a.m3497M();
        this.f2884b = true;
    }

    /* renamed from: s */
    public final void m3157s() {
        if (this.f2884b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        mo3158t();
        this.f3198a.m3497M();
        this.f2884b = true;
    }

    /* renamed from: t */
    public void mo3158t() {
    }

    /* renamed from: u */
    public final boolean m3159u() {
        return this.f2884b;
    }

    /* renamed from: v */
    public abstract boolean mo3160v();
}
