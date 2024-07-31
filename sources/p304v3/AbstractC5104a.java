package p304v3;

/* renamed from: v3.a */
/* loaded from: classes.dex */
public abstract class AbstractC5104a {

    /* renamed from: h */
    public int f19258h;

    /* renamed from: i */
    public final void m20743i(int i10) {
        this.f19258h = i10 | this.f19258h;
    }

    /* renamed from: l */
    public void mo6366l() {
        this.f19258h = 0;
    }

    /* renamed from: m */
    public final void m20744m(int i10) {
        this.f19258h = (~i10) & this.f19258h;
    }

    /* renamed from: n */
    public final boolean m20745n(int i10) {
        return (this.f19258h & i10) == i10;
    }

    /* renamed from: o */
    public final boolean m20746o() {
        return m20745n(268435456);
    }

    /* renamed from: p */
    public final boolean m20747p() {
        return m20745n(Integer.MIN_VALUE);
    }

    /* renamed from: q */
    public final boolean m20748q() {
        return m20745n(4);
    }

    /* renamed from: r */
    public final boolean m20749r() {
        return m20745n(134217728);
    }

    /* renamed from: s */
    public final boolean m20750s() {
        return m20745n(1);
    }

    /* renamed from: t */
    public final boolean m20751t() {
        return m20745n(536870912);
    }

    /* renamed from: u */
    public final void m20752u(int i10) {
        this.f19258h = i10;
    }
}
