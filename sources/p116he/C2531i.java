package p116he;

import gd.C2227a;
import java.util.Iterator;
import p038ce.C1073m0;
import p038ce.InterfaceC1069l0;
import p146jd.InterfaceC3284g;

/* renamed from: he.i */
/* loaded from: classes2.dex */
public final class C2531i {
    /* renamed from: a */
    public static final void m10083a(InterfaceC3284g interfaceC3284g, Throwable th) {
        Iterator<InterfaceC1069l0> it = C2529h.m10081a().iterator();
        while (it.hasNext()) {
            try {
                it.next().mo4471n(interfaceC3284g, th);
            } catch (C2541n unused) {
                return;
            } catch (Throwable th2) {
                C2529h.m10082b(C1073m0.m4473b(th, th2));
            }
        }
        try {
            C2227a.m8956a(th, new C2535k(interfaceC3284g));
        } catch (Throwable unused2) {
        }
        C2529h.m10082b(th);
    }
}
