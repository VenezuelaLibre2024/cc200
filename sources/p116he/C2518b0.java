package p116he;

import gd.C2229c;
import java.util.List;
import p038ce.AbstractC1079n2;

/* renamed from: he.b0 */
/* loaded from: classes2.dex */
public final class C2518b0 {

    /* renamed from: a */
    public static final boolean f9954a = true;

    /* renamed from: a */
    public static final C2520c0 m10048a(Throwable th, String str) {
        if (f9954a) {
            return new C2520c0(th, str);
        }
        if (th != null) {
            throw th;
        }
        m10051d();
        throw new C2229c();
    }

    /* renamed from: b */
    public static /* synthetic */ C2520c0 m10049b(Throwable th, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            th = null;
        }
        if ((i10 & 2) != 0) {
            str = null;
        }
        return m10048a(th, str);
    }

    /* renamed from: c */
    public static final boolean m10050c(AbstractC1079n2 abstractC1079n2) {
        return abstractC1079n2.mo4521K0() instanceof C2520c0;
    }

    /* renamed from: d */
    public static final Void m10051d() {
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }

    /* renamed from: e */
    public static final AbstractC1079n2 m10052e(InterfaceC2562z interfaceC2562z, List<? extends InterfaceC2562z> list) {
        try {
            return interfaceC2562z.mo6471b(list);
        } catch (Throwable th) {
            return m10048a(th, interfaceC2562z.mo6470a());
        }
    }
}
