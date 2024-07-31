package p108h6;

import android.os.Bundle;
import p064e6.C1667b;

/* renamed from: h6.k1 */
/* loaded from: classes.dex */
public final class C2372k1 extends AbstractC2404v0 {

    /* renamed from: g */
    public final /* synthetic */ AbstractC2346c f9654g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2372k1(AbstractC2346c abstractC2346c, int i10, Bundle bundle) {
        super(abstractC2346c, i10, null);
        this.f9654g = abstractC2346c;
    }

    @Override // p108h6.AbstractC2404v0
    /* renamed from: f */
    public final void mo9577f(C1667b c1667b) {
        if (this.f9654g.enableLocalFallback() && AbstractC2346c.zzo(this.f9654g)) {
            AbstractC2346c.zzk(this.f9654g, 16);
        } else {
            this.f9654g.zzc.mo8233b(c1667b);
            this.f9654g.onConnectionFailed(c1667b);
        }
    }

    @Override // p108h6.AbstractC2404v0
    /* renamed from: g */
    public final boolean mo9578g() {
        this.f9654g.zzc.mo8233b(C1667b.f6228l);
        return true;
    }
}
