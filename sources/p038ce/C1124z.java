package p038ce;

import gd.C2237k;

/* renamed from: ce.z */
/* loaded from: classes2.dex */
public final class C1124z {
    /* renamed from: a */
    public static final <T> InterfaceC1116x<T> m4604a(InterfaceC1026c2 interfaceC1026c2) {
        return new C1120y(interfaceC1026c2);
    }

    /* renamed from: b */
    public static /* synthetic */ InterfaceC1116x m4605b(InterfaceC1026c2 interfaceC1026c2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC1026c2 = null;
        }
        return m4604a(interfaceC1026c2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public static final <T> boolean m4606c(InterfaceC1116x<T> interfaceC1116x, Object obj) {
        Throwable m8968d = C2237k.m8968d(obj);
        return m8968d == null ? interfaceC1116x.mo4596n0(obj) : interfaceC1116x.mo4595l0(m8968d);
    }
}
