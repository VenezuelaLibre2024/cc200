package p096g6;

import com.google.android.gms.tasks.TaskCompletionSource;
import p064e6.C1671d;
import p096g6.C2034j;

/* renamed from: g6.w1 */
/* loaded from: classes.dex */
public final class C2076w1 extends AbstractC2058q1 {

    /* renamed from: c */
    public final C2034j.a f8166c;

    public C2076w1(C2034j.a aVar, TaskCompletionSource taskCompletionSource) {
        super(4, taskCompletionSource);
        this.f8166c = aVar;
    }

    @Override // p096g6.AbstractC2079x1
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo8265d(C1999a0 c1999a0, boolean z10) {
    }

    @Override // p096g6.AbstractC2066t0
    /* renamed from: f */
    public final boolean mo8263f(C2039k0 c2039k0) {
        C2000a1 c2000a1 = (C2000a1) c2039k0.m8210x().get(this.f8166c);
        return c2000a1 != null && c2000a1.f7985a.m8228f();
    }

    @Override // p096g6.AbstractC2066t0
    /* renamed from: g */
    public final C1671d[] mo8264g(C2039k0 c2039k0) {
        C2000a1 c2000a1 = (C2000a1) c2039k0.m8210x().get(this.f8166c);
        if (c2000a1 == null) {
            return null;
        }
        return c2000a1.f7985a.m8226c();
    }

    @Override // p096g6.AbstractC2058q1
    /* renamed from: h */
    public final void mo8246h(C2039k0 c2039k0) {
        C2000a1 c2000a1 = (C2000a1) c2039k0.m8210x().remove(this.f8166c);
        if (c2000a1 == null) {
            this.f8130b.trySetResult(Boolean.FALSE);
        } else {
            c2000a1.f7986b.mo8107b(c2039k0.m8209v(), this.f8130b);
            c2000a1.f7985a.m8224a();
        }
    }
}
