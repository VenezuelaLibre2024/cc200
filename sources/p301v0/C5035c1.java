package p301v0;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: v0.c1 */
/* loaded from: classes.dex */
public final class C5035c1 {

    /* renamed from: c */
    public static final C5035c1 f18887c = new C5035c1();

    /* renamed from: b */
    public final ConcurrentMap<Class<?>, InterfaceC5047g1<?>> f18889b = new ConcurrentHashMap();

    /* renamed from: a */
    public final InterfaceC5050h1 f18888a = new C5055j0();

    /* renamed from: a */
    public static C5035c1 m19823a() {
        return f18887c;
    }

    /* renamed from: b */
    public <T> void m19824b(T t10, InterfaceC5044f1 interfaceC5044f1, C5072p c5072p) {
        m19827e(t10).mo19942e(t10, interfaceC5044f1, c5072p);
    }

    /* renamed from: c */
    public InterfaceC5047g1<?> m19825c(Class<?> cls, InterfaceC5047g1<?> interfaceC5047g1) {
        C5028a0.m19790b(cls, "messageType");
        C5028a0.m19790b(interfaceC5047g1, "schema");
        return this.f18889b.putIfAbsent(cls, interfaceC5047g1);
    }

    /* renamed from: d */
    public <T> InterfaceC5047g1<T> m19826d(Class<T> cls) {
        C5028a0.m19790b(cls, "messageType");
        InterfaceC5047g1<T> interfaceC5047g1 = (InterfaceC5047g1) this.f18889b.get(cls);
        if (interfaceC5047g1 != null) {
            return interfaceC5047g1;
        }
        InterfaceC5047g1<T> mo19987a = this.f18888a.mo19987a(cls);
        InterfaceC5047g1<T> interfaceC5047g12 = (InterfaceC5047g1<T>) m19825c(cls, mo19987a);
        return interfaceC5047g12 != null ? interfaceC5047g12 : mo19987a;
    }

    /* renamed from: e */
    public <T> InterfaceC5047g1<T> m19827e(T t10) {
        return m19826d(t10.getClass());
    }
}
