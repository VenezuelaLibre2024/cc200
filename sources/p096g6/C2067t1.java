package p096g6;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC1164a;
import p108h6.C2394s;

/* renamed from: g6.t1 */
/* loaded from: classes.dex */
public final class C2067t1 extends AbstractC2079x1 {

    /* renamed from: b */
    public final AbstractC1164a f8143b;

    public C2067t1(int i10, AbstractC1164a abstractC1164a) {
        super(i10);
        this.f8143b = (AbstractC1164a) C2394s.m9620m(abstractC1164a, "Null methods are not runnable.");
    }

    @Override // p096g6.AbstractC2079x1
    /* renamed from: a */
    public final void mo8243a(Status status) {
        try {
            this.f8143b.setFailedResult(status);
        } catch (IllegalStateException e10) {
            Log.w("ApiCallRunner", "Exception reporting failure", e10);
        }
    }

    @Override // p096g6.AbstractC2079x1
    /* renamed from: b */
    public final void mo8244b(Exception exc) {
        try {
            this.f8143b.setFailedResult(new Status(10, exc.getClass().getSimpleName() + ": " + exc.getLocalizedMessage()));
        } catch (IllegalStateException e10) {
            Log.w("ApiCallRunner", "Exception reporting failure", e10);
        }
    }

    @Override // p096g6.AbstractC2079x1
    /* renamed from: c */
    public final void mo8245c(C2039k0 c2039k0) {
        try {
            this.f8143b.run(c2039k0.m8209v());
        } catch (RuntimeException e10) {
            mo8244b(e10);
        }
    }

    @Override // p096g6.AbstractC2079x1
    /* renamed from: d */
    public final void mo8265d(C1999a0 c1999a0, boolean z10) {
        c1999a0.m8077c(this.f8143b, z10);
    }
}
