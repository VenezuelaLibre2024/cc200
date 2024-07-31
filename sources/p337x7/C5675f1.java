package p337x7;

import p096g6.ComponentCallbacks2C2006c;

/* renamed from: x7.f1 */
/* loaded from: classes.dex */
public final class C5675f1 implements ComponentCallbacks2C2006c.a {

    /* renamed from: a */
    public final /* synthetic */ C5679g1 f21158a;

    public C5675f1(C5679g1 c5679g1) {
        this.f21158a = c5679g1;
    }

    @Override // p096g6.ComponentCallbacks2C2006c.a
    /* renamed from: a */
    public final void mo8097a(boolean z10) {
        boolean m22759e;
        C5718t c5718t;
        if (z10) {
            this.f21158a.f21170c = true;
            this.f21158a.m22757b();
            return;
        }
        this.f21158a.f21170c = false;
        m22759e = this.f21158a.m22759e();
        if (m22759e) {
            c5718t = this.f21158a.f21169b;
            c5718t.m22823c();
        }
    }
}
