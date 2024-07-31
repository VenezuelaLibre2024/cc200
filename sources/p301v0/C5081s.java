package p301v0;

/* renamed from: v0.s */
/* loaded from: classes.dex */
public final class C5081s {

    /* renamed from: a */
    public static final AbstractC5075q<?> f19077a = new C5078r();

    /* renamed from: b */
    public static final AbstractC5075q<?> f19078b = m20525c();

    /* renamed from: a */
    public static AbstractC5075q<?> m20523a() {
        AbstractC5075q<?> abstractC5075q = f19078b;
        if (abstractC5075q != null) {
            return abstractC5075q;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    /* renamed from: b */
    public static AbstractC5075q<?> m20524b() {
        return f19077a;
    }

    /* renamed from: c */
    public static AbstractC5075q<?> m20525c() {
        try {
            return (AbstractC5075q) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
