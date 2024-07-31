package p301v0;

/* renamed from: v0.o0 */
/* loaded from: classes.dex */
public final class C5070o0 {

    /* renamed from: a */
    public static final InterfaceC5064m0 f19030a = m20401c();

    /* renamed from: b */
    public static final InterfaceC5064m0 f19031b = new C5067n0();

    /* renamed from: a */
    public static InterfaceC5064m0 m20399a() {
        return f19030a;
    }

    /* renamed from: b */
    public static InterfaceC5064m0 m20400b() {
        return f19031b;
    }

    /* renamed from: c */
    public static InterfaceC5064m0 m20401c() {
        try {
            return (InterfaceC5064m0) Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
