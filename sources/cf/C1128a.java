package cf;

import android.os.Build;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Collection;

/* renamed from: cf.a */
/* loaded from: classes2.dex */
public class C1128a {

    /* renamed from: cf.a$a */
    /* loaded from: classes2.dex */
    public static class a implements InvocationHandler {

        /* renamed from: a */
        public final Object f4104a;

        public a(Object obj) {
            this.f4104a = obj;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            try {
                return C1128a.m4613d(method, this.f4104a.getClass().getClassLoader()).invoke(this.f4104a, objArr);
            } catch (InvocationTargetException e10) {
                throw e10.getTargetException();
            } catch (ReflectiveOperationException e11) {
                throw new RuntimeException("Reflection failed for method " + method, e11);
            }
        }
    }

    /* renamed from: a */
    public static <T> T m4610a(Class<T> cls, InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return cls.cast(Proxy.newProxyInstance(C1128a.class.getClassLoader(), new Class[]{cls}, invocationHandler));
    }

    /* renamed from: b */
    public static boolean m4611b(Collection<String> collection, String str) {
        if (!collection.contains(str)) {
            if (m4614e()) {
                if (collection.contains(str + ":dev")) {
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static InvocationHandler m4612c(Object obj) {
        if (obj == null) {
            return null;
        }
        return new a(obj);
    }

    /* renamed from: d */
    public static Method m4613d(Method method, ClassLoader classLoader) {
        return Class.forName(method.getDeclaringClass().getName(), true, classLoader).getDeclaredMethod(method.getName(), method.getParameterTypes());
    }

    /* renamed from: e */
    public static boolean m4614e() {
        String str = Build.TYPE;
        return "eng".equals(str) || "userdebug".equals(str);
    }
}
