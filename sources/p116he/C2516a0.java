package p116he;

import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import p038ce.AbstractC1079n2;
import p373zd.C6129g;
import p373zd.C6131i;

/* renamed from: he.a0 */
/* loaded from: classes2.dex */
public final class C2516a0 {

    /* renamed from: a */
    public static final C2516a0 f9950a;

    /* renamed from: b */
    public static final boolean f9951b;

    /* renamed from: c */
    public static final AbstractC1079n2 f9952c;

    static {
        C2516a0 c2516a0 = new C2516a0();
        f9950a = c2516a0;
        f9951b = C2540m0.m10117f("kotlinx.coroutines.fast.service.loader", true);
        f9952c = c2516a0.m10044a();
    }

    /* renamed from: a */
    public final AbstractC1079n2 m10044a() {
        Object next;
        AbstractC1079n2 m10052e;
        try {
            List<InterfaceC2562z> m10143c = f9951b ? C2545p.f9993a.m10143c() : C6131i.m24445h(C6129g.m24440c(ServiceLoader.load(InterfaceC2562z.class, InterfaceC2562z.class.getClassLoader()).iterator()));
            Iterator<T> it = m10143c.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int mo6472c = ((InterfaceC2562z) next).mo6472c();
                    do {
                        Object next2 = it.next();
                        int mo6472c2 = ((InterfaceC2562z) next2).mo6472c();
                        if (mo6472c < mo6472c2) {
                            next = next2;
                            mo6472c = mo6472c2;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            InterfaceC2562z interfaceC2562z = (InterfaceC2562z) next;
            return (interfaceC2562z == null || (m10052e = C2518b0.m10052e(interfaceC2562z, m10143c)) == null) ? C2518b0.m10049b(null, null, 3, null) : m10052e;
        } catch (Throwable th) {
            return C2518b0.m10049b(th, null, 2, null);
        }
    }
}
