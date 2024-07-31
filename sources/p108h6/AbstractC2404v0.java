package p108h6;

import android.app.PendingIntent;
import android.os.Bundle;
import p064e6.C1667b;

/* renamed from: h6.v0 */
/* loaded from: classes.dex */
public abstract class AbstractC2404v0 extends AbstractC2360g1 {

    /* renamed from: d */
    public final int f9721d;

    /* renamed from: e */
    public final Bundle f9722e;

    /* renamed from: f */
    public final /* synthetic */ AbstractC2346c f9723f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC2404v0(AbstractC2346c abstractC2346c, int i10, Bundle bundle) {
        super(abstractC2346c, Boolean.TRUE);
        this.f9723f = abstractC2346c;
        this.f9721d = i10;
        this.f9722e = bundle;
    }

    @Override // p108h6.AbstractC2360g1
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo9553a(Object obj) {
        if (this.f9721d != 0) {
            this.f9723f.zzp(1, null);
            Bundle bundle = this.f9722e;
            mo9577f(new C1667b(this.f9721d, bundle != null ? (PendingIntent) bundle.getParcelable(AbstractC2346c.KEY_PENDING_INTENT) : null));
        } else {
            if (mo9578g()) {
                return;
            }
            this.f9723f.zzp(1, null);
            mo9577f(new C1667b(8, null));
        }
    }

    @Override // p108h6.AbstractC2360g1
    /* renamed from: b */
    public final void mo9554b() {
    }

    /* renamed from: f */
    public abstract void mo9577f(C1667b c1667b);

    /* renamed from: g */
    public abstract boolean mo9578g();
}
