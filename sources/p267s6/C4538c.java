package p267s6;

import dalvik.system.PathClassLoader;

/* renamed from: s6.c */
/* loaded from: classes.dex */
public final class C4538c extends PathClassLoader {
    public C4538c(String str, ClassLoader classLoader) {
        super(str, classLoader);
    }

    @Override // java.lang.ClassLoader
    public final Class loadClass(String str, boolean z10) {
        if (!str.startsWith("java.") && !str.startsWith("android.")) {
            try {
                return findClass(str);
            } catch (ClassNotFoundException unused) {
            }
        }
        return super.loadClass(str, z10);
    }
}
