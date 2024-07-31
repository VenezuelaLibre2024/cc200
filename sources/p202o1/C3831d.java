package p202o1;

import android.content.Context;
import p202o1.AbstractC3832e;

/* renamed from: o1.d */
/* loaded from: classes.dex */
public class C3831d {
    /* renamed from: a */
    public static <T extends AbstractC3832e> AbstractC3832e.a<T> m14544a(Context context, Class<T> cls, String str) {
        if (str == null || str.trim().length() == 0) {
            throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
        }
        return new AbstractC3832e.a<>(context, cls, str);
    }

    /* renamed from: b */
    public static <T, C> T m14545b(Class<C> cls, String str) {
        String str2;
        String name = cls.getPackage().getName();
        String canonicalName = cls.getCanonicalName();
        if (!name.isEmpty()) {
            canonicalName = canonicalName.substring(name.length() + 1);
        }
        String str3 = canonicalName.replace('.', '_') + str;
        try {
            if (name.isEmpty()) {
                str2 = str3;
            } else {
                str2 = name + "." + str3;
            }
            return (T) Class.forName(str2).newInstance();
        } catch (ClassNotFoundException unused) {
            throw new RuntimeException("cannot find implementation for " + cls.getCanonicalName() + ". " + str3 + " does not exist");
        } catch (IllegalAccessException unused2) {
            throw new RuntimeException("Cannot access the constructor" + cls.getCanonicalName());
        } catch (InstantiationException unused3) {
            throw new RuntimeException("Failed to create an instance of " + cls.getCanonicalName());
        }
    }

    /* renamed from: c */
    public static <T extends AbstractC3832e> AbstractC3832e.a<T> m14546c(Context context, Class<T> cls) {
        return new AbstractC3832e.a<>(context, cls, null);
    }
}
