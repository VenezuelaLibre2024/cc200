package p038ce;

import gd.C2237k;
import gd.C2238l;
import p116he.C2537l;
import p146jd.InterfaceC3281d;

/* renamed from: ce.u0 */
/* loaded from: classes2.dex */
public final class C1105u0 {
    /* renamed from: a */
    public static final String m4580a(Object obj) {
        return obj.getClass().getSimpleName();
    }

    /* renamed from: b */
    public static final String m4581b(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    /* renamed from: c */
    public static final String m4582c(InterfaceC3281d<?> interfaceC3281d) {
        Object m8966b;
        if (interfaceC3281d instanceof C2537l) {
            return interfaceC3281d.toString();
        }
        try {
            C2237k.a aVar = C2237k.f8865i;
            m8966b = C2237k.m8966b(interfaceC3281d + '@' + m4581b(interfaceC3281d));
        } catch (Throwable th) {
            C2237k.a aVar2 = C2237k.f8865i;
            m8966b = C2237k.m8966b(C2238l.m8974a(th));
        }
        if (C2237k.m8968d(m8966b) != null) {
            m8966b = interfaceC3281d.getClass().getName() + '@' + m4581b(interfaceC3281d);
        }
        return (String) m8966b;
    }
}
