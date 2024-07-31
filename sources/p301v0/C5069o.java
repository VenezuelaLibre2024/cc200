package p301v0;

/* renamed from: v0.o */
/* loaded from: classes.dex */
public final class C5069o {

    /* renamed from: a */
    public static final Class<?> f19029a = m20398c();

    /* renamed from: a */
    public static C5072p m20396a() {
        if (f19029a != null) {
            try {
                return m20397b("getEmptyRegistry");
            } catch (Exception unused) {
            }
        }
        return C5072p.f19041e;
    }

    /* renamed from: b */
    public static final C5072p m20397b(String str) {
        return (C5072p) f19029a.getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0]);
    }

    /* renamed from: c */
    public static Class<?> m20398c() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
