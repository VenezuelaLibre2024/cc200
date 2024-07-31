package p274t2;

import p263s2.InterfaceC4394b;

/* renamed from: t2.b */
/* loaded from: classes.dex */
public class C4615b implements InterfaceC4394b {
    @Override // p263s2.InterfaceC4394b
    /* renamed from: a */
    public Class<?> mo17005a(String str) {
        try {
            ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
            if (contextClassLoader != null) {
                return contextClassLoader.loadClass(str);
            }
        } catch (ClassNotFoundException | SecurityException unused) {
        }
        try {
            ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
            if (systemClassLoader != null) {
                return systemClassLoader.loadClass(str);
            }
        } catch (ClassNotFoundException | Error | IllegalStateException | SecurityException unused2) {
        }
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException | LinkageError unused3) {
            return null;
        }
    }
}
