package p096g6;

import com.google.android.gms.tasks.TaskCompletionSource;
import p064e6.C1671d;
import p096g6.C2034j;

/* renamed from: g6.u1 */
/* loaded from: classes.dex */
public final class C2070u1 extends AbstractC2058q1 {

    /* renamed from: c */
    public final C2000a1 f8146c;

    public C2070u1(C2000a1 c2000a1, TaskCompletionSource taskCompletionSource) {
        super(3, taskCompletionSource);
        this.f8146c = c2000a1;
    }

    @Override // p096g6.AbstractC2079x1
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo8265d(C1999a0 c1999a0, boolean z10) {
    }

    @Override // p096g6.AbstractC2066t0
    /* renamed from: f */
    public final boolean mo8263f(C2039k0 c2039k0) {
        return this.f8146c.f7985a.m8228f();
    }

    @Override // p096g6.AbstractC2066t0
    /* renamed from: g */
    public final C1671d[] mo8264g(C2039k0 c2039k0) {
        return this.f8146c.f7985a.m8226c();
    }

    @Override // p096g6.AbstractC2058q1
    /* renamed from: h */
    public final void mo8246h(C2039k0 c2039k0) {
        this.f8146c.f7985a.mo8100d(c2039k0.m8209v(), this.f8130b);
        C2034j.a m8225b = this.f8146c.f7985a.m8225b();
        if (m8225b != null) {
            c2039k0.m8210x().put(m8225b, this.f8146c);
        }
    }
}
