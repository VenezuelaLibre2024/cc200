package p038ce;

import p116he.C2530h0;
import p146jd.InterfaceC3281d;

/* renamed from: ce.e3 */
/* loaded from: classes2.dex */
public final class RunnableC1037e3<U, T extends U> extends C2530h0<T> implements Runnable {

    /* renamed from: l */
    public final long f3995l;

    public RunnableC1037e3(long j10, InterfaceC3281d<? super U> interfaceC3281d) {
        super(interfaceC3281d.getContext(), interfaceC3281d);
        this.f3995l = j10;
    }

    @Override // p038ce.AbstractC1013a, p038ce.C1061j2
    /* renamed from: m0 */
    public String mo4256m0() {
        return super.mo4256m0() + "(timeMillis=" + this.f3995l + ')';
    }

    @Override // java.lang.Runnable
    public void run() {
        m4430u(C1042f3.m4317a(this.f3995l, C1015a1.m4258a(getContext()), this));
    }
}
