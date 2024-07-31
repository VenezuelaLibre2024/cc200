package androidx.lifecycle;

import ae.C0108n;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p115hd.C2501m;
import td.C4753m;

/* renamed from: androidx.lifecycle.o */
/* loaded from: classes.dex */
public final class C0359o {

    /* renamed from: a */
    public static final C0359o f1740a = new C0359o();

    /* renamed from: b */
    public static final Map<Class<?>, Integer> f1741b = new HashMap();

    /* renamed from: c */
    public static final Map<Class<?>, List<Constructor<? extends InterfaceC0340d>>> f1742c = new HashMap();

    /* renamed from: c */
    public static final String m1844c(String str) {
        C4753m.m18653f(str, "className");
        return C0108n.m431q(str, ".", "_", false, 4, null) + "_LifecycleAdapter";
    }

    /* renamed from: f */
    public static final InterfaceC0350i m1845f(Object obj) {
        C4753m.m18653f(obj, "object");
        boolean z10 = obj instanceof InterfaceC0350i;
        boolean z11 = obj instanceof DefaultLifecycleObserver;
        if (z10 && z11) {
            return new DefaultLifecycleObserverAdapter((DefaultLifecycleObserver) obj, (InterfaceC0350i) obj);
        }
        if (z11) {
            return new DefaultLifecycleObserverAdapter((DefaultLifecycleObserver) obj, null);
        }
        if (z10) {
            return (InterfaceC0350i) obj;
        }
        Class<?> cls = obj.getClass();
        C0359o c0359o = f1740a;
        if (c0359o.m1848d(cls) != 2) {
            return new ReflectiveGenericLifecycleObserver(obj);
        }
        List<Constructor<? extends InterfaceC0340d>> list = f1742c.get(cls);
        C4753m.m18650c(list);
        List<Constructor<? extends InterfaceC0340d>> list2 = list;
        if (list2.size() == 1) {
            return new SingleGeneratedAdapterObserver(c0359o.m1846a(list2.get(0), obj));
        }
        int size = list2.size();
        InterfaceC0340d[] interfaceC0340dArr = new InterfaceC0340d[size];
        for (int i10 = 0; i10 < size; i10++) {
            interfaceC0340dArr[i10] = f1740a.m1846a(list2.get(i10), obj);
        }
        return new CompositeGeneratedAdaptersObserver(interfaceC0340dArr);
    }

    /* renamed from: a */
    public final InterfaceC0340d m1846a(Constructor<? extends InterfaceC0340d> constructor, Object obj) {
        try {
            InterfaceC0340d newInstance = constructor.newInstance(obj);
            C4753m.m18652e(newInstance, "{\n            constructo…tance(`object`)\n        }");
            return newInstance;
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException(e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException(e12);
        }
    }

    /* renamed from: b */
    public final Constructor<? extends InterfaceC0340d> m1847b(Class<?> cls) {
        try {
            Package r02 = cls.getPackage();
            String canonicalName = cls.getCanonicalName();
            String name = r02 != null ? r02.getName() : "";
            C4753m.m18652e(name, "fullPackage");
            if (!(name.length() == 0)) {
                C4753m.m18652e(canonicalName, "name");
                canonicalName = canonicalName.substring(name.length() + 1);
                C4753m.m18652e(canonicalName, "this as java.lang.String).substring(startIndex)");
            }
            C4753m.m18652e(canonicalName, "if (fullPackage.isEmpty(…g(fullPackage.length + 1)");
            String m1844c = m1844c(canonicalName);
            if (!(name.length() == 0)) {
                m1844c = name + '.' + m1844c;
            }
            Class<?> cls2 = Class.forName(m1844c);
            C4753m.m18651d(cls2, "null cannot be cast to non-null type java.lang.Class<out androidx.lifecycle.GeneratedAdapter>");
            Constructor declaredConstructor = cls2.getDeclaredConstructor(cls);
            if (declaredConstructor.isAccessible()) {
                return declaredConstructor;
            }
            declaredConstructor.setAccessible(true);
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e10) {
            throw new RuntimeException(e10);
        }
    }

    /* renamed from: d */
    public final int m1848d(Class<?> cls) {
        Map<Class<?>, Integer> map = f1741b;
        Integer num = map.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int m1850g = m1850g(cls);
        map.put(cls, Integer.valueOf(m1850g));
        return m1850g;
    }

    /* renamed from: e */
    public final boolean m1849e(Class<?> cls) {
        return cls != null && InterfaceC0352j.class.isAssignableFrom(cls);
    }

    /* renamed from: g */
    public final int m1850g(Class<?> cls) {
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor<? extends InterfaceC0340d> m1847b = m1847b(cls);
        if (m1847b != null) {
            f1742c.put(cls, C2501m.m9986b(m1847b));
            return 2;
        }
        if (C0336b.f1679c.m1777d(cls)) {
            return 1;
        }
        Class<? super Object> superclass = cls.getSuperclass();
        ArrayList arrayList = null;
        if (m1849e(superclass)) {
            C4753m.m18652e(superclass, "superclass");
            if (m1848d(superclass) == 1) {
                return 1;
            }
            List<Constructor<? extends InterfaceC0340d>> list = f1742c.get(superclass);
            C4753m.m18650c(list);
            arrayList = new ArrayList(list);
        }
        Class<?>[] interfaces = cls.getInterfaces();
        C4753m.m18652e(interfaces, "klass.interfaces");
        for (Class<?> cls2 : interfaces) {
            if (m1849e(cls2)) {
                C4753m.m18652e(cls2, "intrface");
                if (m1848d(cls2) == 1) {
                    return 1;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                List<Constructor<? extends InterfaceC0340d>> list2 = f1742c.get(cls2);
                C4753m.m18650c(list2);
                arrayList.addAll(list2);
            }
        }
        if (arrayList == null) {
            return 1;
        }
        f1742c.put(cls, arrayList);
        return 2;
    }
}
