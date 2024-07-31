package p173ld;

import java.lang.reflect.Method;
import td.C4753m;

/* renamed from: ld.i */
/* loaded from: classes2.dex */
public final class C3475i {

    /* renamed from: a */
    public static final C3475i f12179a = new C3475i();

    /* renamed from: b */
    public static final a f12180b = new a(null, null, null);

    /* renamed from: c */
    public static a f12181c;

    /* renamed from: ld.i$a */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a */
        public final Method f12182a;

        /* renamed from: b */
        public final Method f12183b;

        /* renamed from: c */
        public final Method f12184c;

        public a(Method method, Method method2, Method method3) {
            this.f12182a = method;
            this.f12183b = method2;
            this.f12184c = method3;
        }
    }

    /* renamed from: a */
    public final a m12928a(AbstractC3467a abstractC3467a) {
        try {
            a aVar = new a(Class.class.getDeclaredMethod("getModule", new Class[0]), abstractC3467a.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), abstractC3467a.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", new Class[0]));
            f12181c = aVar;
            return aVar;
        } catch (Exception unused) {
            a aVar2 = f12180b;
            f12181c = aVar2;
            return aVar2;
        }
    }

    /* renamed from: b */
    public final String m12929b(AbstractC3467a abstractC3467a) {
        C4753m.m18653f(abstractC3467a, "continuation");
        a aVar = f12181c;
        if (aVar == null) {
            aVar = m12928a(abstractC3467a);
        }
        if (aVar == f12180b) {
            return null;
        }
        Method method = aVar.f12182a;
        Object invoke = method != null ? method.invoke(abstractC3467a.getClass(), new Object[0]) : null;
        if (invoke == null) {
            return null;
        }
        Method method2 = aVar.f12183b;
        Object invoke2 = method2 != null ? method2.invoke(invoke, new Object[0]) : null;
        if (invoke2 == null) {
            return null;
        }
        Method method3 = aVar.f12184c;
        Object invoke3 = method3 != null ? method3.invoke(invoke2, new Object[0]) : null;
        if (invoke3 instanceof String) {
            return (String) invoke3;
        }
        return null;
    }
}
