package p038ce;

import gd.C2227a;
import p116he.C2531i;
import p146jd.InterfaceC3284g;

/* renamed from: ce.m0 */
/* loaded from: classes2.dex */
public final class C1073m0 {
    /* renamed from: a */
    public static final void m4472a(InterfaceC3284g interfaceC3284g, Throwable th) {
        try {
            InterfaceC1069l0 interfaceC1069l0 = (InterfaceC1069l0) interfaceC3284g.mo4368d(InterfaceC1069l0.f4048b);
            if (interfaceC1069l0 != null) {
                interfaceC1069l0.mo4471n(interfaceC3284g, th);
            } else {
                C2531i.m10083a(interfaceC3284g, th);
            }
        } catch (Throwable th2) {
            C2531i.m10083a(interfaceC3284g, m4473b(th, th2));
        }
    }

    /* renamed from: b */
    public static final Throwable m4473b(Throwable th, Throwable th2) {
        if (th == th2) {
            return th;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
        C2227a.m8956a(runtimeException, th);
        return runtimeException;
    }
}
