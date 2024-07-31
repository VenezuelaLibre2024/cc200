package p034c7;

/* renamed from: c7.i7 */
/* loaded from: classes.dex */
public abstract class AbstractC0740i7 extends C0754j7 {

    /* renamed from: b */
    public boolean f3177b;

    public AbstractC0740i7(C0767k6 c0767k6) {
        super(c0767k6);
        this.f3198a.m3501i();
    }

    /* renamed from: j */
    public void mo3418j() {
    }

    /* renamed from: k */
    public final void m3430k() {
        if (!m3433n()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: l */
    public final void m3431l() {
        if (this.f3177b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (mo3146o()) {
            return;
        }
        this.f3198a.m3497M();
        this.f3177b = true;
    }

    /* renamed from: m */
    public final void m3432m() {
        if (this.f3177b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        mo3418j();
        this.f3198a.m3497M();
        this.f3177b = true;
    }

    /* renamed from: n */
    public final boolean m3433n() {
        return this.f3177b;
    }

    /* renamed from: o */
    public abstract boolean mo3146o();
}
