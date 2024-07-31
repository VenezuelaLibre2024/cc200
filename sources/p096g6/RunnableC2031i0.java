package p096g6;

import p079f6.C1841a;

/* renamed from: g6.i0 */
/* loaded from: classes.dex */
public final class RunnableC2031i0 implements Runnable {

    /* renamed from: h */
    public final /* synthetic */ C2035j0 f8050h;

    public RunnableC2031i0(C2035j0 c2035j0) {
        this.f8050h = c2035j0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1841a.f fVar;
        C1841a.f fVar2;
        C2039k0 c2039k0 = this.f8050h.f8060a;
        fVar = c2039k0.f8068b;
        fVar2 = c2039k0.f8068b;
        fVar.disconnect(fVar2.getClass().getName().concat(" disconnecting because it was signed out."));
    }
}
