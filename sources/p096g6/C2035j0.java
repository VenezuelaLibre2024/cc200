package p096g6;

import android.os.Handler;
import p108h6.AbstractC2346c;

/* renamed from: g6.j0 */
/* loaded from: classes.dex */
public final class C2035j0 implements AbstractC2346c.e {

    /* renamed from: a */
    public final /* synthetic */ C2039k0 f8060a;

    public C2035j0(C2039k0 c2039k0) {
        this.f8060a = c2039k0;
    }

    @Override // p108h6.AbstractC2346c.e
    /* renamed from: a */
    public final void mo8164a() {
        Handler handler;
        handler = this.f8060a.f8079o.f8033w;
        handler.post(new RunnableC2031i0(this));
    }
}
