package androidx.lifecycle;

import androidx.lifecycle.AbstractC0344f;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Deprecated
/* renamed from: androidx.lifecycle.b */
/* loaded from: classes.dex */
public final class C0336b {

    /* renamed from: c */
    public static C0336b f1679c = new C0336b();

    /* renamed from: a */
    public final Map<Class<?>, a> f1680a = new HashMap();

    /* renamed from: b */
    public final Map<Class<?>, Boolean> f1681b = new HashMap();

    @Deprecated
    /* renamed from: androidx.lifecycle.b$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public final Map<AbstractC0344f.a, List<b>> f1682a = new HashMap();

        /* renamed from: b */
        public final Map<b, AbstractC0344f.a> f1683b;

        public a(Map<b, AbstractC0344f.a> map) {
            this.f1683b = map;
            for (Map.Entry<b, AbstractC0344f.a> entry : map.entrySet()) {
                AbstractC0344f.a value = entry.getValue();
                List<b> list = this.f1682a.get(value);
                if (list == null) {
                    list = new ArrayList<>();
                    this.f1682a.put(value, list);
                }
                list.add(entry.getKey());
            }
        }

        /* renamed from: b */
        public static void m1779b(List<b> list, InterfaceC0354k interfaceC0354k, AbstractC0344f.a aVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    list.get(size).m1781a(interfaceC0354k, aVar, obj);
                }
            }
        }

        /* renamed from: a */
        public void m1780a(InterfaceC0354k interfaceC0354k, AbstractC0344f.a aVar, Object obj) {
            m1779b(this.f1682a.get(aVar), interfaceC0354k, aVar, obj);
            m1779b(this.f1682a.get(AbstractC0344f.a.ON_ANY), interfaceC0354k, aVar, obj);
        }
    }

    @Deprecated
    /* renamed from: androidx.lifecycle.b$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        public final int f1684a;

        /* renamed from: b */
        public final Method f1685b;

        public b(int i10, Method method) {
            this.f1684a = i10;
            this.f1685b = method;
            method.setAccessible(true);
        }

        /* renamed from: a */
        public void m1781a(InterfaceC0354k interfaceC0354k, AbstractC0344f.a aVar, Object obj) {
            try {
                int i10 = this.f1684a;
                if (i10 == 0) {
                    this.f1685b.invoke(obj, new Object[0]);
                } else if (i10 == 1) {
                    this.f1685b.invoke(obj, interfaceC0354k);
                } else {
                    if (i10 != 2) {
                        return;
                    }
                    this.f1685b.invoke(obj, interfaceC0354k, aVar);
                }
            } catch (IllegalAccessException e10) {
                throw new RuntimeException(e10);
            } catch (InvocationTargetException e11) {
                throw new RuntimeException("Failed to call observer method", e11.getCause());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f1684a == bVar.f1684a && this.f1685b.getName().equals(bVar.f1685b.getName());
        }

        public int hashCode() {
            return (this.f1684a * 31) + this.f1685b.getName().hashCode();
        }
    }

    /* renamed from: a */
    public final a m1774a(Class<?> cls, Method[] methodArr) {
        int i10;
        a m1776c;
        Class<? super Object> superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (superclass != null && (m1776c = m1776c(superclass)) != null) {
            hashMap.putAll(m1776c.f1683b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry<b, AbstractC0344f.a> entry : m1776c(cls2).f1683b.entrySet()) {
                m1778e(hashMap, entry.getKey(), entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = m1775b(cls);
        }
        boolean z10 = false;
        for (Method method : methodArr) {
            InterfaceC0363s interfaceC0363s = (InterfaceC0363s) method.getAnnotation(InterfaceC0363s.class);
            if (interfaceC0363s != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i10 = 0;
                } else {
                    if (!InterfaceC0354k.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i10 = 1;
                }
                AbstractC0344f.a value = interfaceC0363s.value();
                if (parameterTypes.length > 1) {
                    if (!AbstractC0344f.a.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (value != AbstractC0344f.a.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i10 = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                m1778e(hashMap, new b(i10, method), value, cls);
                z10 = true;
            }
        }
        a aVar = new a(hashMap);
        this.f1680a.put(cls, aVar);
        this.f1681b.put(cls, Boolean.valueOf(z10));
        return aVar;
    }

    /* renamed from: b */
    public final Method[] m1775b(Class<?> cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e10) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e10);
        }
    }

    /* renamed from: c */
    public a m1776c(Class<?> cls) {
        a aVar = this.f1680a.get(cls);
        return aVar != null ? aVar : m1774a(cls, null);
    }

    /* renamed from: d */
    public boolean m1777d(Class<?> cls) {
        Boolean bool = this.f1681b.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] m1775b = m1775b(cls);
        for (Method method : m1775b) {
            if (((InterfaceC0363s) method.getAnnotation(InterfaceC0363s.class)) != null) {
                m1774a(cls, m1775b);
                return true;
            }
        }
        this.f1681b.put(cls, Boolean.FALSE);
        return false;
    }

    /* renamed from: e */
    public final void m1778e(Map<b, AbstractC0344f.a> map, b bVar, AbstractC0344f.a aVar, Class<?> cls) {
        AbstractC0344f.a aVar2 = map.get(bVar);
        if (aVar2 == null || aVar == aVar2) {
            if (aVar2 == null) {
                map.put(bVar, aVar);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + bVar.f1685b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + aVar2 + ", new value " + aVar);
    }
}
