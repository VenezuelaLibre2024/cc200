package p199nd;

import p214od.C3984a;
import p229pd.C4117a;
import td.C4753m;

/* renamed from: nd.b */
/* loaded from: classes2.dex */
public final class C3815b {

    /* renamed from: a */
    public static final C3814a f13741a;

    static {
        C3814a c3814a;
        Object newInstance;
        try {
            newInstance = C4117a.class.newInstance();
            C4753m.m18652e(newInstance, "forName(\"kotlin.internal…entations\").newInstance()");
            try {
                try {
                } catch (ClassCastException e10) {
                    ClassLoader classLoader = newInstance.getClass().getClassLoader();
                    ClassLoader classLoader2 = C3814a.class.getClassLoader();
                    if (C4753m.m18648a(classLoader, classLoader2)) {
                        throw e10;
                    }
                    throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader + ", base type classloader: " + classLoader2, e10);
                }
            } catch (ClassNotFoundException unused) {
                Object newInstance2 = C3984a.class.newInstance();
                C4753m.m18652e(newInstance2, "forName(\"kotlin.internal…entations\").newInstance()");
                try {
                    try {
                        if (newInstance2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                        }
                        c3814a = (C3814a) newInstance2;
                    } catch (ClassNotFoundException unused2) {
                        c3814a = new C3814a();
                    }
                } catch (ClassCastException e11) {
                    ClassLoader classLoader3 = newInstance2.getClass().getClassLoader();
                    ClassLoader classLoader4 = C3814a.class.getClassLoader();
                    if (C4753m.m18648a(classLoader3, classLoader4)) {
                        throw e11;
                    }
                    throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader3 + ", base type classloader: " + classLoader4, e11);
                }
            }
        } catch (ClassNotFoundException unused3) {
            Object newInstance3 = Class.forName("kotlin.internal.JRE8PlatformImplementations").newInstance();
            C4753m.m18652e(newInstance3, "forName(\"kotlin.internal…entations\").newInstance()");
            try {
                try {
                    if (newInstance3 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                    }
                    c3814a = (C3814a) newInstance3;
                } catch (ClassNotFoundException unused4) {
                    Object newInstance4 = Class.forName("kotlin.internal.JRE7PlatformImplementations").newInstance();
                    C4753m.m18652e(newInstance4, "forName(\"kotlin.internal…entations\").newInstance()");
                    try {
                        if (newInstance4 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                        }
                        c3814a = (C3814a) newInstance4;
                    } catch (ClassCastException e12) {
                        ClassLoader classLoader5 = newInstance4.getClass().getClassLoader();
                        ClassLoader classLoader6 = C3814a.class.getClassLoader();
                        if (C4753m.m18648a(classLoader5, classLoader6)) {
                            throw e12;
                        }
                        throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader5 + ", base type classloader: " + classLoader6, e12);
                    }
                }
            } catch (ClassCastException e13) {
                ClassLoader classLoader7 = newInstance3.getClass().getClassLoader();
                ClassLoader classLoader8 = C3814a.class.getClassLoader();
                if (C4753m.m18648a(classLoader7, classLoader8)) {
                    throw e13;
                }
                throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader7 + ", base type classloader: " + classLoader8, e13);
            }
        }
        if (newInstance == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
        }
        c3814a = (C3814a) newInstance;
        f13741a = c3814a;
    }
}
