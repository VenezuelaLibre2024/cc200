package androidx.fragment.app;

import androidx.fragment.app.Fragment;
import p285u.C4777g;

/* renamed from: androidx.fragment.app.o */
/* loaded from: classes.dex */
public class C0316o {

    /* renamed from: a */
    public static final C4777g<ClassLoader, C4777g<String, Class<?>>> f1567a = new C4777g<>();

    /* renamed from: b */
    public static boolean m1592b(ClassLoader classLoader, String str) {
        try {
            return Fragment.class.isAssignableFrom(m1593c(classLoader, str));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: c */
    public static Class<?> m1593c(ClassLoader classLoader, String str) {
        C4777g<ClassLoader, C4777g<String, Class<?>>> c4777g = f1567a;
        C4777g<String, Class<?>> c4777g2 = c4777g.get(classLoader);
        if (c4777g2 == null) {
            c4777g2 = new C4777g<>();
            c4777g.put(classLoader, c4777g2);
        }
        Class<?> cls = c4777g2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        c4777g2.put(str, cls2);
        return cls2;
    }

    /* renamed from: d */
    public static Class<? extends Fragment> m1594d(ClassLoader classLoader, String str) {
        try {
            return m1593c(classLoader, str);
        } catch (ClassCastException e10) {
            throw new Fragment.C0285l("Unable to instantiate fragment " + str + ": make sure class is a valid subclass of Fragment", e10);
        } catch (ClassNotFoundException e11) {
            throw new Fragment.C0285l("Unable to instantiate fragment " + str + ": make sure class name exists", e11);
        }
    }

    /* renamed from: a */
    public Fragment mo1595a(ClassLoader classLoader, String str) {
        throw null;
    }
}
