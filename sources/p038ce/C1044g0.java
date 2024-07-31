package p038ce;

import gd.C2237k;
import gd.C2238l;
import gd.C2245s;
import p116he.C2536k0;
import p146jd.InterfaceC3281d;
import p173ld.InterfaceC3471e;
import sd.InterfaceC4580l;

/* renamed from: ce.g0 */
/* loaded from: classes2.dex */
public final class C1044g0 {
    /* renamed from: a */
    public static final <T> Object m4322a(Object obj, InterfaceC3281d<? super T> interfaceC3281d) {
        if (obj instanceof C1024c0) {
            C2237k.a aVar = C2237k.f8865i;
            Throwable th = ((C1024c0) obj).f3977a;
            if (C1101t0.m4576d() && (interfaceC3281d instanceof InterfaceC3471e)) {
                th = C2536k0.m10098i(th, (InterfaceC3471e) interfaceC3281d);
            }
            obj = C2238l.m8974a(th);
        } else {
            C2237k.a aVar2 = C2237k.f8865i;
        }
        return C2237k.m8966b(obj);
    }

    /* renamed from: b */
    public static final <T> Object m4323b(Object obj, InterfaceC1076n<?> interfaceC1076n) {
        Throwable m8968d = C2237k.m8968d(obj);
        if (m8968d != null) {
            if (C1101t0.m4576d() && (interfaceC1076n instanceof InterfaceC3471e)) {
                m8968d = C2536k0.m10098i(m8968d, (InterfaceC3471e) interfaceC1076n);
            }
            obj = new C1024c0(m8968d, false, 2, null);
        }
        return obj;
    }

    /* renamed from: c */
    public static final <T> Object m4324c(Object obj, InterfaceC4580l<? super Throwable, C2245s> interfaceC4580l) {
        Throwable m8968d = C2237k.m8968d(obj);
        return m8968d == null ? interfaceC4580l != null ? new C1029d0(obj, interfaceC4580l) : obj : new C1024c0(m8968d, false, 2, null);
    }

    /* renamed from: d */
    public static /* synthetic */ Object m4325d(Object obj, InterfaceC4580l interfaceC4580l, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            interfaceC4580l = null;
        }
        return m4324c(obj, interfaceC4580l);
    }
}
