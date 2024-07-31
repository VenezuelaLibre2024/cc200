package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import p115hd.C2497j;
import p115hd.C2501m;
import p115hd.C2502n;
import td.C4753m;

/* renamed from: androidx.lifecycle.c0 */
/* loaded from: classes.dex */
public final class C0339c0 {

    /* renamed from: a */
    public static final List<Class<?>> f1691a = C2502n.m9991g(Application.class, C0368x.class);

    /* renamed from: b */
    public static final List<Class<?>> f1692b = C2501m.m9986b(C0368x.class);

    /* renamed from: c */
    public static final <T> Constructor<T> m1787c(Class<T> cls, List<? extends Class<?>> list) {
        C4753m.m18653f(cls, "modelClass");
        C4753m.m18653f(list, "signature");
        Object[] constructors = cls.getConstructors();
        C4753m.m18652e(constructors, "modelClass.constructors");
        for (Object obj : constructors) {
            Constructor<T> constructor = (Constructor<T>) obj;
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            C4753m.m18652e(parameterTypes, "constructor.parameterTypes");
            List m9954O = C2497j.m9954O(parameterTypes);
            if (C4753m.m18648a(list, m9954O)) {
                C4753m.m18651d(constructor, "null cannot be cast to non-null type java.lang.reflect.Constructor<T of androidx.lifecycle.SavedStateViewModelFactoryKt.findMatchingConstructor>");
                return constructor;
            }
            if (list.size() == m9954O.size() && m9954O.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    /* renamed from: d */
    public static final <T extends AbstractC0343e0> T m1788d(Class<T> cls, Constructor<T> constructor, Object... objArr) {
        C4753m.m18653f(cls, "modelClass");
        C4753m.m18653f(constructor, "constructor");
        C4753m.m18653f(objArr, "params");
        try {
            return constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Failed to access " + cls, e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException("An exception happened in constructor of " + cls, e12.getCause());
        }
    }
}
