package p301v0;

/* renamed from: v0.d */
/* loaded from: classes.dex */
public final class C5036d {

    /* renamed from: a */
    public static final Class<?> f18890a = m19828a("libcore.io.Memory");

    /* renamed from: b */
    public static final boolean f18891b;

    static {
        f18891b = m19828a("org.robolectric.Robolectric") != null;
    }

    /* renamed from: a */
    public static <T> Class<T> m19828a(String str) {
        try {
            return (Class<T>) Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static Class<?> m19829b() {
        return f18890a;
    }

    /* renamed from: c */
    public static boolean m19830c() {
        return (f18890a == null || f18891b) ? false : true;
    }
}
